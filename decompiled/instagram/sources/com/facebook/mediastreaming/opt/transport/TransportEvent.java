package com.facebook.mediastreaming.opt.transport;

public enum TransportEvent {
    CONNECTED,
    STREAMING,
    LIVE_DATA_SENT,
    LAGGING,
    RECONNECTING,
    FAILED,
    CLOSED,
    NONE;

    public static TransportEvent fromInt(int i) {
        return values()[i];
    }
}
