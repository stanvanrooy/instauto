package com.facebook.video.common.livestreaming;

import com.facebook.tigon.TigonErrorException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LiveStreamingError {
    public final Throwable A00;
    public final String descripton;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final LiveStreamingError innerError;
    public final boolean isConnectionLost;
    public final boolean isStreamTerminated;
    public final boolean isTransient;
    public final String reason;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error:");
        sb.append(this.errorCode);
        sb.append(", Domain:");
        sb.append(this.domain);
        sb.append(", Reason:");
        sb.append(this.reason);
        sb.append(", Description:");
        sb.append(this.descripton);
        sb.append(", Full Description:");
        sb.append(this.fullDescription);
        sb.append(", isTransient:");
        sb.append(this.isTransient);
        sb.append(", isConnectionLost:");
        sb.append(this.isConnectionLost);
        sb.append(", isStreamTerminated:");
        sb.append(this.isStreamTerminated);
        LiveStreamingError liveStreamingError = this.innerError;
        if (liveStreamingError != null) {
            sb.append(", Inner Error: [");
            sb.append(liveStreamingError.toString());
            sb.append("]");
        }
        return sb.toString();
    }

    public LiveStreamingError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.descripton = str3;
        this.fullDescription = str4;
        this.isTransient = z;
        this.isConnectionLost = z2;
        this.isStreamTerminated = z3;
        this.A00 = null;
        this.innerError = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public LiveStreamingError(String str, Throwable th) {
        this(r2, str, false, r5, r6);
        String stringWriter;
        int i;
        Throwable th2 = th;
        if (th == null) {
            stringWriter = "";
        } else {
            StringWriter stringWriter2 = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter2));
            stringWriter = stringWriter2.toString();
        }
        if (th instanceof TigonErrorException) {
            i = ((TigonErrorException) th2).A00.A00;
        } else {
            i = -1;
        }
    }

    public LiveStreamingError(Throwable th, String str, boolean z, String str2, int i) {
        String stringWriter;
        int i2;
        this.A00 = th;
        this.errorCode = i;
        this.domain = str;
        String message = th.getMessage();
        message = message == null ? "" : message;
        this.descripton = message;
        this.reason = message;
        this.fullDescription = str2;
        this.isTransient = false;
        this.isConnectionLost = false;
        this.isStreamTerminated = false;
        Throwable cause = th.getCause();
        LiveStreamingError liveStreamingError = null;
        if (cause != null && !z) {
            String canonicalName = cause.getClass().getCanonicalName();
            if (cause == null) {
                stringWriter = "";
            } else {
                StringWriter stringWriter2 = new StringWriter();
                cause.printStackTrace(new PrintWriter(stringWriter2));
                stringWriter = stringWriter2.toString();
            }
            if (cause instanceof TigonErrorException) {
                i2 = ((TigonErrorException) cause).A00.A00;
            } else {
                i2 = -1;
            }
            liveStreamingError = new LiveStreamingError(cause, canonicalName, true, stringWriter, i2);
        }
        this.innerError = liveStreamingError;
    }
}
