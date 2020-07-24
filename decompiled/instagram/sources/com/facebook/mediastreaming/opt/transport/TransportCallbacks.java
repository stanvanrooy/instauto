package com.facebook.mediastreaming.opt.transport;

public interface TransportCallbacks {
    void onSpeedTestResult(SpeedTestStatus speedTestStatus);

    void onTransportEvent(TransportEvent transportEvent, TransportError transportError);
}
