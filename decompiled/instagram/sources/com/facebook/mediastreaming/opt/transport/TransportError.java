package com.facebook.mediastreaming.opt.transport;

public class TransportError {
    public final String descripton;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final boolean isConnectionLost;
    public final boolean isStreamTerminated;
    public final boolean isTransient;
    public final String reason;

    public TransportError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.descripton = str3;
        this.fullDescription = str4;
        this.isTransient = z;
        this.isConnectionLost = z2;
        this.isStreamTerminated = z3;
    }
}
