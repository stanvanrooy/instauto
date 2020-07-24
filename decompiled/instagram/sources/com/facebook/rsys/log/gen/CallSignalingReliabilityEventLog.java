package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30595Dfe;

public class CallSignalingReliabilityEventLog {
    public static AnonymousClass921 CONVERTER = new C30595Dfe();
    public final String clientSessionId;
    public final String conferenceName;
    public final String msgId;
    public final String msgSource;
    public final String msgType;
    public final Long peerId;
    public final String receiverId;
    public final Long retryCount;
    public final String senderId;
    public final String sharedCallId;
    public final long steadyTimeMs;
    public final long systemTimeMs;
    public final String transactionId;

    public static native CallSignalingReliabilityEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallSignalingReliabilityEventLog)) {
            return false;
        }
        CallSignalingReliabilityEventLog callSignalingReliabilityEventLog = (CallSignalingReliabilityEventLog) obj;
        if (this.systemTimeMs != callSignalingReliabilityEventLog.systemTimeMs || this.steadyTimeMs != callSignalingReliabilityEventLog.steadyTimeMs || !this.sharedCallId.equals(callSignalingReliabilityEventLog.sharedCallId)) {
            return false;
        }
        String str = this.msgSource;
        if (((str != null || callSignalingReliabilityEventLog.msgSource != null) && (str == null || !str.equals(callSignalingReliabilityEventLog.msgSource))) || !this.msgType.equals(callSignalingReliabilityEventLog.msgType)) {
            return false;
        }
        String str2 = this.msgId;
        if ((str2 != null || callSignalingReliabilityEventLog.msgId != null) && (str2 == null || !str2.equals(callSignalingReliabilityEventLog.msgId))) {
            return false;
        }
        String str3 = this.senderId;
        if ((str3 != null || callSignalingReliabilityEventLog.senderId != null) && (str3 == null || !str3.equals(callSignalingReliabilityEventLog.senderId))) {
            return false;
        }
        String str4 = this.receiverId;
        if ((str4 != null || callSignalingReliabilityEventLog.receiverId != null) && (str4 == null || !str4.equals(callSignalingReliabilityEventLog.receiverId))) {
            return false;
        }
        String str5 = this.transactionId;
        if ((str5 != null || callSignalingReliabilityEventLog.transactionId != null) && (str5 == null || !str5.equals(callSignalingReliabilityEventLog.transactionId))) {
            return false;
        }
        Long l = this.retryCount;
        if ((l != null || callSignalingReliabilityEventLog.retryCount != null) && (l == null || !l.equals(callSignalingReliabilityEventLog.retryCount))) {
            return false;
        }
        String str6 = this.clientSessionId;
        if ((str6 != null || callSignalingReliabilityEventLog.clientSessionId != null) && (str6 == null || !str6.equals(callSignalingReliabilityEventLog.clientSessionId))) {
            return false;
        }
        String str7 = this.conferenceName;
        if ((str7 != null || callSignalingReliabilityEventLog.conferenceName != null) && (str7 == null || !str7.equals(callSignalingReliabilityEventLog.conferenceName))) {
            return false;
        }
        Long l2 = this.peerId;
        if ((l2 != null || callSignalingReliabilityEventLog.peerId != null) && (l2 == null || !l2.equals(callSignalingReliabilityEventLog.peerId))) {
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
        long j = this.systemTimeMs;
        long j2 = this.steadyTimeMs;
        int hashCode9 = (((((527 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.sharedCallId.hashCode()) * 31;
        String str = this.msgSource;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode10 = (((hashCode9 + hashCode) * 31) + this.msgType.hashCode()) * 31;
        String str2 = this.msgId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode10 + hashCode2) * 31;
        String str3 = this.senderId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.receiverId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.transactionId;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Long l = this.retryCount;
        if (l == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str6 = this.clientSessionId;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str7 = this.conferenceName;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Long l2 = this.peerId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return i8 + i;
    }

    public String toString() {
        return "CallSignalingReliabilityEventLog{systemTimeMs=" + this.systemTimeMs + "," + "steadyTimeMs=" + this.steadyTimeMs + "," + "sharedCallId=" + this.sharedCallId + "," + "msgSource=" + this.msgSource + "," + "msgType=" + this.msgType + "," + "msgId=" + this.msgId + "," + "senderId=" + this.senderId + "," + "receiverId=" + this.receiverId + "," + "transactionId=" + this.transactionId + "," + "retryCount=" + this.retryCount + "," + "clientSessionId=" + this.clientSessionId + "," + "conferenceName=" + this.conferenceName + "," + "peerId=" + this.peerId + "}";
    }

    public CallSignalingReliabilityEventLog(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, String str9, Long l2) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str3);
        this.systemTimeMs = j;
        this.steadyTimeMs = j2;
        this.sharedCallId = str;
        this.msgSource = str2;
        this.msgType = str3;
        this.msgId = str4;
        this.senderId = str5;
        this.receiverId = str6;
        this.transactionId = str7;
        this.retryCount = l;
        this.clientSessionId = str8;
        this.conferenceName = str9;
        this.peerId = l2;
    }
}
