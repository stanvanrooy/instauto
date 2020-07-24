package com.instagram.realtimeclient;

public class RealtimeOperation {

    /* renamed from: op */
    public Type f152op;
    public String path;
    public String timestamp;
    public String value;

    public enum Type {
        add,
        remove,
        replace,
        notify
    }
}
