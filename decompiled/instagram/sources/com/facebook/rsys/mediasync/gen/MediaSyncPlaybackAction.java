package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24861AvB;

public class MediaSyncPlaybackAction {
    public static AnonymousClass921 A00 = new C24861AvB();
    public final int action;
    public final ActionMetadata actionMetadata;
    public final String adminMessage;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final long localClockOffsetMs;

    public static native MediaSyncPlaybackAction createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaSyncPlaybackAction)) {
            return false;
        }
        MediaSyncPlaybackAction mediaSyncPlaybackAction = (MediaSyncPlaybackAction) obj;
        if (!this.contentId.equals(mediaSyncPlaybackAction.contentId) || this.contentSource != mediaSyncPlaybackAction.contentSource || this.action != mediaSyncPlaybackAction.action || !this.actionMetadata.equals(mediaSyncPlaybackAction.actionMetadata) || !this.content.equals(mediaSyncPlaybackAction.content)) {
            return false;
        }
        String str = this.adminMessage;
        if (((str != null || mediaSyncPlaybackAction.adminMessage != null) && (str == null || !str.equals(mediaSyncPlaybackAction.adminMessage))) || this.localClockOffsetMs != mediaSyncPlaybackAction.localClockOffsetMs) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((527 + this.contentId.hashCode()) * 31) + this.contentSource) * 31) + this.action) * 31) + this.actionMetadata.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str = this.adminMessage;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.localClockOffsetMs;
        return ((hashCode2 + hashCode) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MediaSyncPlaybackAction{contentId=" + this.contentId + "," + "contentSource=" + this.contentSource + "," + "action=" + this.action + "," + "actionMetadata=" + this.actionMetadata + "," + "content=" + this.content + "," + "adminMessage=" + this.adminMessage + "," + "localClockOffsetMs=" + this.localClockOffsetMs + "}";
    }

    public MediaSyncPlaybackAction(String str, int i, int i2, ActionMetadata actionMetadata2, MediaSyncContent mediaSyncContent, String str2, long j) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(actionMetadata2);
        AnonymousClass920.A00(mediaSyncContent);
        AnonymousClass920.A00(Long.valueOf(j));
        this.contentId = str;
        this.contentSource = i;
        this.action = i2;
        this.actionMetadata = actionMetadata2;
        this.content = mediaSyncContent;
        this.adminMessage = str2;
        this.localClockOffsetMs = j;
    }
}
