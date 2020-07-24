package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C193418Ps;
import p000X.C30521Ddx;

public class CallSummaryInfo {
    public static AnonymousClass921 CONVERTER = new C30521Ddx();
    public final Long batteryEndLevel;
    public final Long batteryStartLevel;
    public final long callAnsweredTime;
    public final long callConnectedTime;
    public final long callCreatedTime;
    public final long callEndedTime;
    public final String callTrigger;
    public final String coldStartReason;
    public final String endCallReason;
    public final Long engineCreatedTime;
    public final Boolean inviteRequestedVideo;
    public final boolean isCaller;
    public final Long joinableCompleteTime;
    public final long lastUpdatedTime;
    public final String localCallId;
    public final String peerId;
    public final Boolean remoteEnded;
    public final String sharedCallId;
    public final long steadyTime;
    public final long systemTime;
    public final String videoEscalationStatus;
    public final Boolean wasDeviceCharged;

    public static native CallSummaryInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallSummaryInfo)) {
            return false;
        }
        CallSummaryInfo callSummaryInfo = (CallSummaryInfo) obj;
        if (!this.localCallId.equals(callSummaryInfo.localCallId)) {
            return false;
        }
        String str = this.sharedCallId;
        if (((str != null || callSummaryInfo.sharedCallId != null) && (str == null || !str.equals(callSummaryInfo.sharedCallId))) || this.systemTime != callSummaryInfo.systemTime || this.steadyTime != callSummaryInfo.steadyTime || this.callCreatedTime != callSummaryInfo.callCreatedTime) {
            return false;
        }
        Long l = this.engineCreatedTime;
        if (((l != null || callSummaryInfo.engineCreatedTime != null) && (l == null || !l.equals(callSummaryInfo.engineCreatedTime))) || this.callAnsweredTime != callSummaryInfo.callAnsweredTime || this.callConnectedTime != callSummaryInfo.callConnectedTime || this.callEndedTime != callSummaryInfo.callEndedTime) {
            return false;
        }
        Long l2 = this.joinableCompleteTime;
        if (((l2 != null || callSummaryInfo.joinableCompleteTime != null) && (l2 == null || !l2.equals(callSummaryInfo.joinableCompleteTime))) || this.lastUpdatedTime != callSummaryInfo.lastUpdatedTime || !this.callTrigger.equals(callSummaryInfo.callTrigger) || this.isCaller != callSummaryInfo.isCaller) {
            return false;
        }
        String str2 = this.peerId;
        if ((str2 != null || callSummaryInfo.peerId != null) && (str2 == null || !str2.equals(callSummaryInfo.peerId))) {
            return false;
        }
        String str3 = this.coldStartReason;
        if ((str3 != null || callSummaryInfo.coldStartReason != null) && (str3 == null || !str3.equals(callSummaryInfo.coldStartReason))) {
            return false;
        }
        String str4 = this.endCallReason;
        if ((str4 != null || callSummaryInfo.endCallReason != null) && (str4 == null || !str4.equals(callSummaryInfo.endCallReason))) {
            return false;
        }
        Boolean bool = this.remoteEnded;
        if ((bool != null || callSummaryInfo.remoteEnded != null) && (bool == null || !bool.equals(callSummaryInfo.remoteEnded))) {
            return false;
        }
        Boolean bool2 = this.inviteRequestedVideo;
        if ((bool2 != null || callSummaryInfo.inviteRequestedVideo != null) && (bool2 == null || !bool2.equals(callSummaryInfo.inviteRequestedVideo))) {
            return false;
        }
        String str5 = this.videoEscalationStatus;
        if ((str5 != null || callSummaryInfo.videoEscalationStatus != null) && (str5 == null || !str5.equals(callSummaryInfo.videoEscalationStatus))) {
            return false;
        }
        Long l3 = this.batteryStartLevel;
        if ((l3 != null || callSummaryInfo.batteryStartLevel != null) && (l3 == null || !l3.equals(callSummaryInfo.batteryStartLevel))) {
            return false;
        }
        Long l4 = this.batteryEndLevel;
        if ((l4 != null || callSummaryInfo.batteryEndLevel != null) && (l4 == null || !l4.equals(callSummaryInfo.batteryEndLevel))) {
            return false;
        }
        Boolean bool3 = this.wasDeviceCharged;
        if ((bool3 != null || callSummaryInfo.wasDeviceCharged != null) && (bool3 == null || !bool3.equals(callSummaryInfo.wasDeviceCharged))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = (527 + this.localCallId.hashCode()) * 31;
        String str = this.sharedCallId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.systemTime;
        long j2 = this.steadyTime;
        long j3 = this.callCreatedTime;
        int i2 = (((((((hashCode12 + hashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Long l = this.engineCreatedTime;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        long j4 = this.callAnsweredTime;
        long j5 = this.callConnectedTime;
        long j6 = this.callEndedTime;
        int i3 = (((((((i2 + hashCode2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        Long l2 = this.joinableCompleteTime;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        long j7 = this.lastUpdatedTime;
        int hashCode13 = (((((((i3 + hashCode3) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.callTrigger.hashCode()) * 31) + (this.isCaller ? 1 : 0)) * 31;
        String str2 = this.peerId;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (hashCode13 + hashCode4) * 31;
        String str3 = this.coldStartReason;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str4 = this.endCallReason;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Boolean bool = this.remoteEnded;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Boolean bool2 = this.inviteRequestedVideo;
        if (bool2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool2.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str5 = this.videoEscalationStatus;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        Long l3 = this.batteryStartLevel;
        if (l3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l3.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        Long l4 = this.batteryEndLevel;
        if (l4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l4.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        Boolean bool3 = this.wasDeviceCharged;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return i11 + i;
    }

    public String toString() {
        return "CallSummaryInfo{localCallId=" + this.localCallId + "," + "sharedCallId=" + this.sharedCallId + "," + "systemTime=" + this.systemTime + "," + "steadyTime=" + this.steadyTime + "," + "callCreatedTime=" + this.callCreatedTime + "," + "engineCreatedTime=" + this.engineCreatedTime + "," + "callAnsweredTime=" + this.callAnsweredTime + "," + "callConnectedTime=" + this.callConnectedTime + "," + "callEndedTime=" + this.callEndedTime + "," + "joinableCompleteTime=" + this.joinableCompleteTime + "," + "lastUpdatedTime=" + this.lastUpdatedTime + "," + "callTrigger=" + this.callTrigger + "," + "isCaller=" + this.isCaller + "," + "peerId=" + this.peerId + "," + "coldStartReason=" + this.coldStartReason + "," + "endCallReason=" + this.endCallReason + "," + C193418Ps.$const$string(138) + this.remoteEnded + "," + "inviteRequestedVideo=" + this.inviteRequestedVideo + "," + "videoEscalationStatus=" + this.videoEscalationStatus + "," + "batteryStartLevel=" + this.batteryStartLevel + "," + "batteryEndLevel=" + this.batteryEndLevel + "," + "wasDeviceCharged=" + this.wasDeviceCharged + "}";
    }

    public CallSummaryInfo(String str, String str2, long j, long j2, long j3, Long l, long j4, long j5, long j6, Long l2, long j7, String str3, boolean z, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Long l3, Long l4, Boolean bool3) {
        String str8 = str;
        AnonymousClass920.A00(str8);
        long j8 = j;
        AnonymousClass920.A00(Long.valueOf(j8));
        long j9 = j2;
        AnonymousClass920.A00(Long.valueOf(j9));
        long j10 = j3;
        AnonymousClass920.A00(Long.valueOf(j10));
        long j11 = j4;
        AnonymousClass920.A00(Long.valueOf(j11));
        long j12 = j5;
        AnonymousClass920.A00(Long.valueOf(j12));
        long j13 = j6;
        AnonymousClass920.A00(Long.valueOf(j13));
        long j14 = j7;
        AnonymousClass920.A00(Long.valueOf(j14));
        String str9 = str3;
        AnonymousClass920.A00(str9);
        boolean z2 = z;
        AnonymousClass920.A00(Boolean.valueOf(z2));
        this.localCallId = str8;
        this.sharedCallId = str2;
        this.systemTime = j8;
        this.steadyTime = j9;
        this.callCreatedTime = j10;
        this.engineCreatedTime = l;
        this.callAnsweredTime = j11;
        this.callConnectedTime = j12;
        this.callEndedTime = j13;
        this.joinableCompleteTime = l2;
        this.lastUpdatedTime = j14;
        this.callTrigger = str9;
        this.isCaller = z2;
        this.peerId = str4;
        this.coldStartReason = str5;
        this.endCallReason = str6;
        this.remoteEnded = bool;
        this.inviteRequestedVideo = bool2;
        this.videoEscalationStatus = str7;
        this.batteryStartLevel = l3;
        this.batteryEndLevel = l4;
        this.wasDeviceCharged = bool3;
    }
}
