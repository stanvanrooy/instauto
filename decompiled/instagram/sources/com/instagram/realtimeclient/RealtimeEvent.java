package com.instagram.realtimeclient;

import com.instagram.realtimeclient.DirectRealtimePayload;
import java.util.List;

public class RealtimeEvent {
    public DirectRealtimePayload.Action action;
    public Integer code;

    /* renamed from: id */
    public String f151id;
    public double interval;
    public String message;
    public boolean mustRefresh;
    public List operations;
    public DirectRealtimePayload payload;
    public String sequence;
    public String status;
    public Integer statusCode;
    public String topic;
    public Type type;

    public enum Type {
        SUBSCRIBED("subscribed"),
        UNSUBSCRIBED("unsubscribed"),
        KEEPALIVE("keepalive"),
        PATCH("patch"),
        ACK("broadcast-ack"),
        ERROR("error");
        
        public String mServerValue;

        public String getServerValue() {
            return this.mServerValue;
        }

        /* access modifiers changed from: public */
        Type(String str) {
            this.mServerValue = str;
        }

        public static Type fromServerValue(String str) {
            for (Type type : values()) {
                if (type.getServerValue().equals(str)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Unrecognized event type");
        }
    }

    public static int compareSequences(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return 0;
            }
            return -1;
        } else if (str2 == null) {
            return 1;
        } else {
            int length = str.length() - str2.length();
            if (length == 0) {
                return str.compareTo(str2);
            }
            return length;
        }
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }
}
