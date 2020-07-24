package com.instagram.realtimeclient;

public final class RealtimePayload {
    public final String stringPayload;
    public final String subTopic;

    public RealtimePayload(String str, String str2) {
        this.subTopic = str;
        this.stringPayload = str2;
    }
}
