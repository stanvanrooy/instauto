package com.facebook.rsys.videosubscriptions.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C25005Axu;

public class VideoSubscriptions {
    public static AnonymousClass921 CONVERTER = new C25005Axu();
    public final int dominantStreamQuality;
    public final Map subcriptionsMap;

    public static native VideoSubscriptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoSubscriptions)) {
            return false;
        }
        VideoSubscriptions videoSubscriptions = (VideoSubscriptions) obj;
        if (!this.subcriptionsMap.equals(videoSubscriptions.subcriptionsMap) || this.dominantStreamQuality != videoSubscriptions.dominantStreamQuality) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.subcriptionsMap.hashCode()) * 31) + this.dominantStreamQuality;
    }

    public String toString() {
        return "VideoSubscriptions{subcriptionsMap=" + this.subcriptionsMap + "," + "dominantStreamQuality=" + this.dominantStreamQuality + "}";
    }

    public VideoSubscriptions(Map map, int i) {
        AnonymousClass920.A00(map);
        AnonymousClass920.A00(Integer.valueOf(i));
        this.subcriptionsMap = map;
        this.dominantStreamQuality = i;
    }
}
