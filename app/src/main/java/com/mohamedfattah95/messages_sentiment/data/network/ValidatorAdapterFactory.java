package com.mohamedfattah95.tadween.data.network;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class ValidatorAdapterFactory implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        // If the type adapter is a reflective type adapter, we want to modify the implementation using reflection. The
        // trick is to replace the Map object used to lookup the property name. Instead of returning null if the
        // property is not found, we throw a Json exception to terminate the deserialization.
        TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);

        // Check if the type adapter is a reflective, cause this solution only work for reflection.
        if (delegate instanceof ReflectiveTypeAdapterFactory.Adapter) {

            try {
                // Get reference to the existing boundFields.
                Field f = delegate.getClass().getDeclaredField("boundFields");
                f.setAccessible(true);
                Map boundFields = (Map) f.get(delegate);

                // Then replace it with our implementation throwing exception if the value is null.
                boundFields = new LinkedHashMap(boundFields) {

                    @Override
                    public Object get(Object key) {

                        Object value = super.get(key);
//                        if (value == null) {
//                            throw new JsonParseException("invalid property name: " + key);
//                        }
                        return value;

                    }

                };
                // Finally, push our custom map back using reflection.
                f.set(delegate, boundFields);

            } catch (Exception e) {
                // Should never happen if the implementation doesn't change.
                throw new IllegalStateException(e);
            }

        }
        return delegate;
    }

}
