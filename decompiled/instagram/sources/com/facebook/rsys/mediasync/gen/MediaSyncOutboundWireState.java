package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24857Av3;

public class MediaSyncOutboundWireState {
    public static AnonymousClass921 A00 = new C24857Av3();
    public final int action;
    public final long actionCursor;
    public final ActionMetadata actionMetadata;
    public final int adminMessageType;
    public final String contentId;
    public final int contentSource;

    public static native MediaSyncOutboundWireState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaSyncOutboundWireState)) {
            return false;
        }
        MediaSyncOutboundWireState mediaSyncOutboundWireState = (MediaSyncOutboundWireState) obj;
        if (this.action == mediaSyncOutboundWireState.action && this.actionMetadata.equals(mediaSyncOutboundWireState.actionMetadata) && this.contentId.equals(mediaSyncOutboundWireState.contentId) && this.contentSource == mediaSyncOutboundWireState.contentSource && this.adminMessageType == mediaSyncOutboundWireState.adminMessageType && this.actionCursor == mediaSyncOutboundWireState.actionCursor) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.actionCursor;
        return ((((((((((527 + this.action) * 31) + this.actionMetadata.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.contentSource) * 31) + this.adminMessageType) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MediaSyncOutboundWireState{action=" + this.action + "," + "actionMetadata=" + this.actionMetadata + "," + "contentId=" + this.contentId + "," + "contentSource=" + this.contentSource + "," + "adminMessageType=" + this.adminMessageType + "," + "actionCursor=" + this.actionCursor + "}";
    }

    public MediaSyncOutboundWireState(int i, ActionMetadata actionMetadata2, String str, int i2, int i3, long j) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(actionMetadata2);
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Integer.valueOf(i3));
        AnonymousClass920.A00(Long.valueOf(j));
        this.action = i;
        this.actionMetadata = actionMetadata2;
        this.contentId = str;
        this.contentSource = i2;
        this.adminMessageType = i3;
        this.actionCursor = j;
    }
}
