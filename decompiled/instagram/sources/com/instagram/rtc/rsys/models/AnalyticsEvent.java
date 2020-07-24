package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass928;

public class AnalyticsEvent {
    public static AnonymousClass921 CONVERTER = new AnonymousClass928();
    public final Map boolParams;
    public final boolean initiator;
    public final String localCallId;
    public final Map numberParams;
    public final int step;
    public final Map stringParams;
    public final String videoCallId;

    public static native AnalyticsEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (this.step != analyticsEvent.step || this.initiator != analyticsEvent.initiator || !this.localCallId.equals(analyticsEvent.localCallId)) {
            return false;
        }
        String str = this.videoCallId;
        if (((str != null || analyticsEvent.videoCallId != null) && (str == null || !str.equals(analyticsEvent.videoCallId))) || !this.stringParams.equals(analyticsEvent.stringParams) || !this.numberParams.equals(analyticsEvent.numberParams) || !this.boolParams.equals(analyticsEvent.boolParams)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((527 + this.step) * 31) + (this.initiator ? 1 : 0)) * 31) + this.localCallId.hashCode()) * 31;
        String str = this.videoCallId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.stringParams.hashCode()) * 31) + this.numberParams.hashCode()) * 31) + this.boolParams.hashCode();
    }

    public String toString() {
        return "AnalyticsEvent{step=" + this.step + "," + "initiator=" + this.initiator + "," + "localCallId=" + this.localCallId + "," + "videoCallId=" + this.videoCallId + "," + "stringParams=" + this.stringParams + "," + "numberParams=" + this.numberParams + "," + "boolParams=" + this.boolParams + "}";
    }

    public AnalyticsEvent(int i, boolean z, String str, String str2, Map map, Map map2, Map map3) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(map);
        AnonymousClass920.A00(map2);
        AnonymousClass920.A00(map3);
        this.step = i;
        this.initiator = z;
        this.localCallId = str;
        this.videoCallId = str2;
        this.stringParams = map;
        this.numberParams = map2;
        this.boolParams = map3;
    }
}
