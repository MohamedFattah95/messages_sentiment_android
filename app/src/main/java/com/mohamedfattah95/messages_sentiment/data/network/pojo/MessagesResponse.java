package com.mohamedfattah95.messages_sentiment.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MessagesResponse {

    /**
     * feed : {"entry":[{"content":{"type":"text","$t":"messageid: 1, message: Hello from Damascus, sentiment: Neutral"}},{"content":{"type":"text","$t":"messageid: 1, message: Hello from Damascus, sentiment: Neutral"}}]}
     */

    @SerializedName("feed")
    private FeedBean feed;

    public FeedBean getFeed() {
        return feed;
    }

    public void setFeed(FeedBean feed) {
        this.feed = feed;
    }

    public static class FeedBean {
        @SerializedName("entry")
        private List<EntryBean> entry;

        public List<EntryBean> getEntry() {
            return entry;
        }

        public void setEntry(List<EntryBean> entry) {
            this.entry = entry;
        }

        public static class EntryBean {
            /**
             * content : {"type":"text","$t":"messageid: 1, message: Hello from Damascus, sentiment: Neutral"}
             */

            @SerializedName("content")
            private ContentBean content;

            public ContentBean getContent() {
                return content;
            }

            public void setContent(ContentBean content) {
                this.content = content;
            }

            // FIXME generate failure  field _$T88
            public static class ContentBean {
                /**
                 * type : text
                 * $t : messageid: 1, message: Hello from Damascus, sentiment: Neutral
                 */

                @SerializedName("type")
                private String type;
                @SerializedName("$t")
                private String $t;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String get_$T() {
                    return $t;
                }

                public void set_$T(String $t) {
                    this.$t = $t;
                }
            }
        }
    }
}
