package com.facebook.proxygen;

public class TestingTraceEvent extends TraceEvent {
    public native void addMetaNative(String str, String str2);

    public native void initNativeHandle(String str);

    public TestingTraceEvent addMeta(String str, String str2) {
        addMetaNative(str, str2);
        return this;
    }

    public TestingTraceEvent(String str) {
        super(str);
        initNativeHandle(str);
    }

    public TestingTraceEvent(String str, int i, int i2, long j, long j2) {
        super(str, i, i2, j, j2);
        initNativeHandle(str);
    }
}
