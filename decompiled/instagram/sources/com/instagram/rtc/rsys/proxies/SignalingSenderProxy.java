package com.instagram.rtc.rsys.proxies;

import com.instagram.rtc.rsys.models.HttpRequest;

public abstract class SignalingSenderProxy {
    public abstract void sendHttpSignalingMessage(HttpRequest httpRequest);

    public abstract void sendSignalingMessage(byte[] bArr);
}
