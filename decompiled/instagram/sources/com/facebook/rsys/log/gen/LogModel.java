package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C25002Axo;

public class LogModel {
    public static AnonymousClass921 A00 = new C25002Axo();
    public final String callTrigger;
    public final Long peerId;
    public final String sharedCallId;
    public final Long startingBatteryLevel;
    public final boolean wasDeviceCharged;

    public static native LogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (!(obj instanceof LogModel)) {
            return false;
        }
        LogModel logModel = (LogModel) obj;
        String str = this.sharedCallId;
        if ((str != null || logModel.sharedCallId != null) && (str == null || !str.equals(logModel.sharedCallId))) {
            return false;
        }
        Long l = this.peerId;
        if (((l != null || logModel.peerId != null) && (l == null || !l.equals(logModel.peerId))) || !this.callTrigger.equals(logModel.callTrigger)) {
            return false;
        }
        Long l2 = this.startingBatteryLevel;
        if (((l2 != null || logModel.startingBatteryLevel != null) && (l2 == null || !l2.equals(logModel.startingBatteryLevel))) || this.wasDeviceCharged != logModel.wasDeviceCharged) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.sharedCallId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        Long l = this.peerId;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int hashCode3 = (((i2 + hashCode2) * 31) + this.callTrigger.hashCode()) * 31;
        Long l2 = this.startingBatteryLevel;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode3 + i) * 31) + (this.wasDeviceCharged ? 1 : 0);
    }

    public final String toString() {
        return "LogModel{sharedCallId=" + this.sharedCallId + "," + "peerId=" + this.peerId + "," + "callTrigger=" + this.callTrigger + "," + "startingBatteryLevel=" + this.startingBatteryLevel + "," + "wasDeviceCharged=" + this.wasDeviceCharged + "}";
    }

    public LogModel(String str, Long l, String str2, Long l2, boolean z) {
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(Boolean.valueOf(z));
        this.sharedCallId = str;
        this.peerId = l;
        this.callTrigger = str2;
        this.startingBatteryLevel = l2;
        this.wasDeviceCharged = z;
    }
}
