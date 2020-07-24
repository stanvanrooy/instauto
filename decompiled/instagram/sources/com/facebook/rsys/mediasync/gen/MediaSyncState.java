package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24860AvA;

public class MediaSyncState {
    public static AnonymousClass921 CONVERTER = new C24860AvA();
    public final int action;
    public final ActionMetadata actionMetadata;
    public final String adminMessage;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final long localClockOffsetMs;

    public static native MediaSyncState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaSyncState)) {
            return false;
        }
        MediaSyncState mediaSyncState = (MediaSyncState) obj;
        if (this.action != mediaSyncState.action || !this.actionMetadata.equals(mediaSyncState.actionMetadata) || !this.contentId.equals(mediaSyncState.contentId) || this.contentSource != mediaSyncState.contentSource || !this.content.equals(mediaSyncState.content)) {
            return false;
        }
        String str = this.adminMessage;
        if (((str != null || mediaSyncState.adminMessage != null) && (str == null || !str.equals(mediaSyncState.adminMessage))) || this.localClockOffsetMs != mediaSyncState.localClockOffsetMs) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((527 + this.action) * 31) + this.actionMetadata.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.contentSource) * 31) + this.content.hashCode()) * 31;
        String str = this.adminMessage;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.localClockOffsetMs;
        return ((hashCode2 + hashCode) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MediaSyncState{action=" + this.action + "," + "actionMetadata=" + this.actionMetadata + "," + "contentId=" + this.contentId + "," + "contentSource=" + this.contentSource + "," + "content=" + this.content + "," + "adminMessage=" + this.adminMessage + "," + "localClockOffsetMs=" + this.localClockOffsetMs + "}";
    }

    public MediaSyncState(int i, ActionMetadata actionMetadata2, String str, int i2, MediaSyncContent mediaSyncContent, String str2, long j) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(actionMetadata2);
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(mediaSyncContent);
        AnonymousClass920.A00(Long.valueOf(j));
        this.action = i;
        this.actionMetadata = actionMetadata2;
        this.contentId = str;
        this.contentSource = i2;
        this.content = mediaSyncContent;
        this.adminMessage = str2;
        this.localClockOffsetMs = j;
    }
}
