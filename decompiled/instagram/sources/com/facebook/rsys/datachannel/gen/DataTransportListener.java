package com.facebook.rsys.datachannel.gen;

public abstract class DataTransportListener {
    public abstract void onMessage(byte[] bArr, String str);

    public abstract void onReady();
}
