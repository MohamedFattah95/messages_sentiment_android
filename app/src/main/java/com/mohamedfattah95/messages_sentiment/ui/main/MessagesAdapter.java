package com.mohamedfattah95.messages_sentiment.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohamedfattah95.messages_sentiment.R;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.TObject;
import com.mohamedfattah95.messages_sentiment.ui.base.BaseViewHolder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MessagesAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int VIEW_TYPE_MESSAGES = 1;

    private Callback mCallback;
    private List<TObject> mMessagesList;

    public MessagesAdapter(List<TObject> list) {
        mMessagesList = list;
    }

    public void setCallback(Callback callback) {
        mCallback = callback;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MessagesViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false));
    }

    @Override
    public int getItemViewType(int position) {

        return VIEW_TYPE_MESSAGES;

    }

    @Override
    public int getItemCount() {
        return mMessagesList.size();

    }

    public void addItems(List<TObject> list) {
        mMessagesList.clear();
        mMessagesList.addAll(list);
        notifyDataSetChanged();
    }

    public interface Callback {
    }

    public class MessagesViewHolder extends BaseViewHolder {

        @BindView(R.id.tv_message_title)
        TextView tvMessageTitle;
        @BindView(R.id.tv_sentiment)
        TextView tvSentiment;

        public MessagesViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

        protected void clear() {

        }

        public void onBind(int position) {
            super.onBind(position);

            TObject tObject = mMessagesList.get(position);

            tvMessageTitle.setText(tObject.getMessage());
            tvSentiment.setText(tObject.getSentiment());

            if (tObject.getSentiment().equalsIgnoreCase("Neutral"))
                tvSentiment.setTextColor(itemView.getResources().getColor(R.color.approved_green));

            if (tObject.getSentiment().equalsIgnoreCase("Negative"))
                tvSentiment.setTextColor(itemView.getResources().getColor(R.color.red));

            if (tObject.getSentiment().equalsIgnoreCase("Positive"))
                tvSentiment.setTextColor(itemView.getResources().getColor(R.color.paid_blue));


        }
    }

}
