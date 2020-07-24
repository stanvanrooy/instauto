package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24859Av9;

public class MediaSyncUpdateAction {
    public static AnonymousClass921 CONVERTER = new C24859Av9();
    public final int action;
    public final int adminMessageType;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final Long mediaPositionMs;

    public static native MediaSyncUpdateAction createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaSyncUpdateAction)) {
            return false;
        }
        MediaSyncUpdateAction mediaSyncUpdateAction = (MediaSyncUpdateAction) obj;
        if (this.action != mediaSyncUpdateAction.action || !this.contentId.equals(mediaSyncUpdateAction.contentId) || this.contentSource != mediaSyncUpdateAction.contentSource) {
            return false;
        }
        Long l = this.mediaPositionMs;
        if ((l != null || mediaSyncUpdateAction.mediaPositionMs != null) && (l == null || !l.equals(mediaSyncUpdateAction.mediaPositionMs))) {
            return false;
        }
        MediaSyncContent mediaSyncContent = this.content;
        if (((mediaSyncContent != null || mediaSyncUpdateAction.content != null) && (mediaSyncContent == null || !mediaSyncContent.equals(mediaSyncUpdateAction.content))) || this.adminMessageType != mediaSyncUpdateAction.adminMessageType) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((527 + this.action) * 31) + this.contentId.hashCode()) * 31) + this.contentSource) * 31;
        Long l = this.mediaPositionMs;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        MediaSyncContent mediaSyncContent = this.content;
        if (mediaSyncContent != null) {
            i = mediaSyncContent.hashCode();
        }
        return ((i2 + i) * 31) + this.adminMessageType;
    }

    public String toString() {
        return "MediaSyncUpdateAction{action=" + this.action + "," + "contentId=" + this.contentId + "," + "contentSource=" + this.contentSource + "," + "mediaPositionMs=" + this.mediaPositionMs + "," + "content=" + this.content + "," + "adminMessageType=" + this.adminMessageType + "}";
    }

    public MediaSyncUpdateAction(int i, String str, int i2, Long l, MediaSyncContent mediaSyncContent, int i3) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Integer.valueOf(i3));
        this.action = i;
        this.contentId = str;
        this.contentSource = i2;
        this.mediaPositionMs = l;
        this.content = mediaSyncContent;
        this.adminMessageType = i3;
    }
}
