package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30594Dfb;

public class CallPeerRestartEventLog {
    public static AnonymousClass921 CONVERTER = new C30594Dfb();
    public final String connectionLoggingId;
    public final String localCallId;
    public final Long peerRestartAnswerReceivedMs;
    public final Long peerRestartCompletedMs;
    public final Long peerRestartEndedCallEndedMs;
    public final Long peerRestartEndedTimedOutMs;
    public final Long peerRestartOfferSentMs;
    public final Long peerRestartRequestedMs;
    public final String sharedCallId;
    public final long steadyTimeMs;
    public final long systemTimeMs;

    public static native CallPeerRestartEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallPeerRestartEventLog)) {
            return false;
        }
        CallPeerRestartEventLog callPeerRestartEventLog = (CallPeerRestartEventLog) obj;
        String str = this.connectionLoggingId;
        if ((str != null || callPeerRestartEventLog.connectionLoggingId != null) && (str == null || !str.equals(callPeerRestartEventLog.connectionLoggingId))) {
            return false;
        }
        String str2 = this.localCallId;
        if ((str2 != null || callPeerRestartEventLog.localCallId != null) && (str2 == null || !str2.equals(callPeerRestartEventLog.localCallId))) {
            return false;
        }
        String str3 = this.sharedCallId;
        if (((str3 != null || callPeerRestartEventLog.sharedCallId != null) && (str3 == null || !str3.equals(callPeerRestartEventLog.sharedCallId))) || this.steadyTimeMs != callPeerRestartEventLog.steadyTimeMs || this.systemTimeMs != callPeerRestartEventLog.systemTimeMs) {
            return false;
        }
        Long l = this.peerRestartRequestedMs;
        if ((l != null || callPeerRestartEventLog.peerRestartRequestedMs != null) && (l == null || !l.equals(callPeerRestartEventLog.peerRestartRequestedMs))) {
            return false;
        }
        Long l2 = this.peerRestartOfferSentMs;
        if ((l2 != null || callPeerRestartEventLog.peerRestartOfferSentMs != null) && (l2 == null || !l2.equals(callPeerRestartEventLog.peerRestartOfferSentMs))) {
            return false;
        }
        Long l3 = this.peerRestartAnswerReceivedMs;
        if ((l3 != null || callPeerRestartEventLog.peerRestartAnswerReceivedMs != null) && (l3 == null || !l3.equals(callPeerRestartEventLog.peerRestartAnswerReceivedMs))) {
            return false;
        }
        Long l4 = this.peerRestartCompletedMs;
        if ((l4 != null || callPeerRestartEventLog.peerRestartCompletedMs != null) && (l4 == null || !l4.equals(callPeerRestartEventLog.peerRestartCompletedMs))) {
            return false;
        }
        Long l5 = this.peerRestartEndedTimedOutMs;
        if ((l5 != null || callPeerRestartEventLog.peerRestartEndedTimedOutMs != null) && (l5 == null || !l5.equals(callPeerRestartEventLog.peerRestartEndedTimedOutMs))) {
            return false;
        }
        Long l6 = this.peerRestartEndedCallEndedMs;
        if ((l6 != null || callPeerRestartEventLog.peerRestartEndedCallEndedMs != null) && (l6 == null || !l6.equals(callPeerRestartEventLog.peerRestartEndedCallEndedMs))) {
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
        long j = this.steadyTimeMs;
        long j2 = this.systemTimeMs;
        int i4 = (((((i3 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.peerRestartRequestedMs;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l2 = this.peerRestartOfferSentMs;
        if (l2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l3 = this.peerRestartAnswerReceivedMs;
        if (l3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Long l4 = this.peerRestartCompletedMs;
        if (l4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l5 = this.peerRestartEndedTimedOutMs;
        if (l5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l5.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Long l6 = this.peerRestartEndedCallEndedMs;
        if (l6 != null) {
            i = l6.hashCode();
        }
        return i9 + i;
    }

    public String toString() {
        return "CallPeerRestartEventLog{connectionLoggingId=" + this.connectionLoggingId + "," + "localCallId=" + this.localCallId + "," + "sharedCallId=" + this.sharedCallId + "," + "steadyTimeMs=" + this.steadyTimeMs + "," + "systemTimeMs=" + this.systemTimeMs + "," + "peerRestartRequestedMs=" + this.peerRestartRequestedMs + "," + "peerRestartOfferSentMs=" + this.peerRestartOfferSentMs + "," + "peerRestartAnswerReceivedMs=" + this.peerRestartAnswerReceivedMs + "," + "peerRestartCompletedMs=" + this.peerRestartCompletedMs + "," + "peerRestartEndedTimedOutMs=" + this.peerRestartEndedTimedOutMs + "," + "peerRestartEndedCallEndedMs=" + this.peerRestartEndedCallEndedMs + "}";
    }

    public CallPeerRestartEventLog(String str, String str2, String str3, long j, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        this.connectionLoggingId = str;
        this.localCallId = str2;
        this.sharedCallId = str3;
        this.steadyTimeMs = j;
        this.systemTimeMs = j2;
        this.peerRestartRequestedMs = l;
        this.peerRestartOfferSentMs = l2;
        this.peerRestartAnswerReceivedMs = l3;
        this.peerRestartCompletedMs = l4;
        this.peerRestartEndedTimedOutMs = l5;
        this.peerRestartEndedCallEndedMs = l6;
    }
}
