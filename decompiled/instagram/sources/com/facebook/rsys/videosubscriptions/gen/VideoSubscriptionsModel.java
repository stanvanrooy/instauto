package com.facebook.rsys.videosubscriptions.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C25004Axt;

public class VideoSubscriptionsModel {
    public static AnonymousClass921 CONVERTER = new C25004Axt();
    public final int effectiveMaxNumVideoSubscriptions;
    public final int hardMaxNumVideoSubscriptions;
    public final VideoSubscriptions videoSubscriptions;

    public static native VideoSubscriptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoSubscriptionsModel)) {
            return false;
        }
        VideoSubscriptionsModel videoSubscriptionsModel = (VideoSubscriptionsModel) obj;
        VideoSubscriptions videoSubscriptions2 = this.videoSubscriptions;
        if (((videoSubscriptions2 == null && videoSubscriptionsModel.videoSubscriptions == null) || (videoSubscriptions2 != null && videoSubscriptions2.equals(videoSubscriptionsModel.videoSubscriptions))) && this.hardMaxNumVideoSubscriptions == videoSubscriptionsModel.hardMaxNumVideoSubscriptions && this.effectiveMaxNumVideoSubscriptions == videoSubscriptionsModel.effectiveMaxNumVideoSubscriptions) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        VideoSubscriptions videoSubscriptions2 = this.videoSubscriptions;
        if (videoSubscriptions2 == null) {
            hashCode = 0;
        } else {
            hashCode = videoSubscriptions2.hashCode();
        }
        return ((((527 + hashCode) * 31) + this.hardMaxNumVideoSubscriptions) * 31) + this.effectiveMaxNumVideoSubscriptions;
    }

    public String toString() {
        return "VideoSubscriptionsModel{videoSubscriptions=" + this.videoSubscriptions + "," + "hardMaxNumVideoSubscriptions=" + this.hardMaxNumVideoSubscriptions + "," + "effectiveMaxNumVideoSubscriptions=" + this.effectiveMaxNumVideoSubscriptions + "}";
    }

    public VideoSubscriptionsModel(VideoSubscriptions videoSubscriptions2, int i, int i2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        this.videoSubscriptions = videoSubscriptions2;
        this.hardMaxNumVideoSubscriptions = i;
        this.effectiveMaxNumVideoSubscriptions = i2;
    }
}
