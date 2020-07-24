package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24845Aue;

public class RingNotification {
    public static AnonymousClass921 CONVERTER = new C24845Aue();
    public final String avatarUrl;
    public final String displayName;
    public final String groupCallerName;
    public final String igThreadId;
    public final int ringType;
    public final String serverInfoData;

    public static native RingNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof RingNotification)) {
            return false;
        }
        RingNotification ringNotification = (RingNotification) obj;
        if (!this.serverInfoData.equals(ringNotification.serverInfoData) || !this.displayName.equals(ringNotification.displayName) || !this.igThreadId.equals(ringNotification.igThreadId)) {
            return false;
        }
        String str = this.groupCallerName;
        if (((str != null || ringNotification.groupCallerName != null) && (str == null || !str.equals(ringNotification.groupCallerName))) || !this.avatarUrl.equals(ringNotification.avatarUrl) || this.ringType != ringNotification.ringType) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((527 + this.serverInfoData.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.igThreadId.hashCode()) * 31;
        String str = this.groupCallerName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.avatarUrl.hashCode()) * 31) + this.ringType;
    }

    public String toString() {
        return "RingNotification{serverInfoData=" + this.serverInfoData + "," + "displayName=" + this.displayName + "," + "igThreadId=" + this.igThreadId + "," + "groupCallerName=" + this.groupCallerName + "," + "avatarUrl=" + this.avatarUrl + "," + "ringType=" + this.ringType + "}";
    }

    public RingNotification(String str, String str2, String str3, String str4, String str5, int i) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(str3);
        AnonymousClass920.A00(str5);
        AnonymousClass920.A00(Integer.valueOf(i));
        this.serverInfoData = str;
        this.displayName = str2;
        this.igThreadId = str3;
        this.groupCallerName = str4;
        this.avatarUrl = str5;
        this.ringType = i;
    }
}
