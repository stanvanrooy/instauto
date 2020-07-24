package com.instagram.realtimeclient;

public class DirectRealtimePayload {
    public String clientContext;
    public String clientRequestId;
    public Integer count;
    public DirectApiError error;
    public String itemId;
    public String message;
    public String threadId;
    public long timestamp;
    public Long ttlMs;

    public enum Action {
        ACK("item_ack"),
        UNSEEN_COUNT("inbox_unseen_count"),
        UNKNOWN("unknown");
        
        public String mServerValue;

        /* access modifiers changed from: public */
        Action(String str) {
            this.mServerValue = str;
        }

        public static Action fromServerValue(String str) {
            for (Action action : values()) {
                if (action.getServerValue().equals(str)) {
                    return action;
                }
            }
            return UNKNOWN;
        }

        public String getServerValue() {
            return this.mServerValue;
        }
    }
}
