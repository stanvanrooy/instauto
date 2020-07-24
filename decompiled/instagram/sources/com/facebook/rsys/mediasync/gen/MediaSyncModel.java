package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass921;
import p000X.C24849Auj;

public class MediaSyncModel {
    public static AnonymousClass921 A00 = new C24849Auj();
    public final MediaSyncOutboundWireState outboundWireState;
    public final MediaSyncState state;

    public static native MediaSyncModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaSyncModel)) {
            return false;
        }
        MediaSyncModel mediaSyncModel = (MediaSyncModel) obj;
        MediaSyncState mediaSyncState = this.state;
        if ((mediaSyncState != null || mediaSyncModel.state != null) && (mediaSyncState == null || !mediaSyncState.equals(mediaSyncModel.state))) {
            return false;
        }
        MediaSyncOutboundWireState mediaSyncOutboundWireState = this.outboundWireState;
        if ((mediaSyncOutboundWireState != null || mediaSyncModel.outboundWireState != null) && (mediaSyncOutboundWireState == null || !mediaSyncOutboundWireState.equals(mediaSyncModel.outboundWireState))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        MediaSyncState mediaSyncState = this.state;
        int i = 0;
        if (mediaSyncState == null) {
            hashCode = 0;
        } else {
            hashCode = mediaSyncState.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        MediaSyncOutboundWireState mediaSyncOutboundWireState = this.outboundWireState;
        if (mediaSyncOutboundWireState != null) {
            i = mediaSyncOutboundWireState.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "MediaSyncModel{state=" + this.state + "," + "outboundWireState=" + this.outboundWireState + "}";
    }

    public MediaSyncModel(MediaSyncState mediaSyncState, MediaSyncOutboundWireState mediaSyncOutboundWireState) {
        this.state = mediaSyncState;
        this.outboundWireState = mediaSyncOutboundWireState;
    }
}
