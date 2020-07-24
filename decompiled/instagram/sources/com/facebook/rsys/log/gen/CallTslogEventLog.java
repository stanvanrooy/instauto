package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30565Der;

public class CallTslogEventLog {
    public static AnonymousClass921 CONVERTER = new C30565Der();
    public final Long callId;
    public final String confName;
    public final String connectionLoggingId;
    public final String localCallId;
    public final Long peerId;
    public final String protocol;
    public final String servInfo;
    public final String sharedCallId;
    public final String timeSeries;

    public static native CallTslogEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallTslogEventLog)) {
            return false;
        }
        CallTslogEventLog callTslogEventLog = (CallTslogEventLog) obj;
        String str = this.connectionLoggingId;
        if ((str != null || callTslogEventLog.connectionLoggingId != null) && (str == null || !str.equals(callTslogEventLog.connectionLoggingId))) {
            return false;
        }
        String str2 = this.localCallId;
        if ((str2 != null || callTslogEventLog.localCallId != null) && (str2 == null || !str2.equals(callTslogEventLog.localCallId))) {
            return false;
        }
        String str3 = this.sharedCallId;
        if ((str3 != null || callTslogEventLog.sharedCallId != null) && (str3 == null || !str3.equals(callTslogEventLog.sharedCallId))) {
            return false;
        }
        String str4 = this.protocol;
        if ((str4 != null || callTslogEventLog.protocol != null) && (str4 == null || !str4.equals(callTslogEventLog.protocol))) {
            return false;
        }
        Long l = this.callId;
        if ((l != null || callTslogEventLog.callId != null) && (l == null || !l.equals(callTslogEventLog.callId))) {
            return false;
        }
        String str5 = this.confName;
        if ((str5 != null || callTslogEventLog.confName != null) && (str5 == null || !str5.equals(callTslogEventLog.confName))) {
            return false;
        }
        Long l2 = this.peerId;
        if ((l2 != null || callTslogEventLog.peerId != null) && (l2 == null || !l2.equals(callTslogEventLog.peerId))) {
            return false;
        }
        String str6 = this.servInfo;
        if (((str6 != null || callTslogEventLog.servInfo != null) && (str6 == null || !str6.equals(callTslogEventLog.servInfo))) || !this.timeSeries.equals(callTslogEventLog.timeSeries)) {
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
        String str = this.connectionLoggingId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        String str2 = this.localCallId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.sharedCallId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.protocol;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.callId;
        if (l == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.confName;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Long l2 = this.peerId;
        if (l2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str6 = this.servInfo;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((i8 + i) * 31) + this.timeSeries.hashCode();
    }

    public String toString() {
        return "CallTslogEventLog{connectionLoggingId=" + this.connectionLoggingId + "," + "localCallId=" + this.localCallId + "," + "sharedCallId=" + this.sharedCallId + "," + "protocol=" + this.protocol + "," + "callId=" + this.callId + "," + "confName=" + this.confName + "," + "peerId=" + this.peerId + "," + "servInfo=" + this.servInfo + "," + "timeSeries=" + this.timeSeries + "}";
    }

    public CallTslogEventLog(String str, String str2, String str3, String str4, Long l, String str5, Long l2, String str6, String str7) {
        AnonymousClass920.A00(str7);
        this.connectionLoggingId = str;
        this.localCallId = str2;
        this.sharedCallId = str3;
        this.protocol = str4;
        this.callId = l;
        this.confName = str5;
        this.peerId = l2;
        this.servInfo = str6;
        this.timeSeries = str7;
    }
}
