package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30609Dfw;

public class CallGroupEscalationEventLog {
    public static AnonymousClass921 CONVERTER = new C30609Dfw();
    public final String connectionLoggingId;
    public final Long escalationCompleteMs;
    public final Long escalationEndedCallEndedMs;
    public final Long escalationTimedOutMs;
    public final String localCallId;
    public final String mwSharedCallId;
    public final String p2pSharedCallId;
    public final Long peerConnectedToMwMs;
    public final Long peerConnectingToMwMs;
    public final Long peerFailedToConnectToMwMs;
    public final Long receivedEscalationRequestMs;
    public final Long selfConnectedToMwMs;
    public final Long selfConnectingToMwMs;
    public final Long selfFailedToConnectToMwMs;
    public final long steadyTimeMs;
    public final long systemTimeMs;
    public final Long userInitiatedEscalationMs;

    public static native CallGroupEscalationEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallGroupEscalationEventLog)) {
            return false;
        }
        CallGroupEscalationEventLog callGroupEscalationEventLog = (CallGroupEscalationEventLog) obj;
        if (this.steadyTimeMs != callGroupEscalationEventLog.steadyTimeMs || this.systemTimeMs != callGroupEscalationEventLog.systemTimeMs || !this.connectionLoggingId.equals(callGroupEscalationEventLog.connectionLoggingId) || !this.localCallId.equals(callGroupEscalationEventLog.localCallId) || !this.p2pSharedCallId.equals(callGroupEscalationEventLog.p2pSharedCallId)) {
            return false;
        }
        String str = this.mwSharedCallId;
        if ((str != null || callGroupEscalationEventLog.mwSharedCallId != null) && (str == null || !str.equals(callGroupEscalationEventLog.mwSharedCallId))) {
            return false;
        }
        Long l = this.userInitiatedEscalationMs;
        if ((l != null || callGroupEscalationEventLog.userInitiatedEscalationMs != null) && (l == null || !l.equals(callGroupEscalationEventLog.userInitiatedEscalationMs))) {
            return false;
        }
        Long l2 = this.receivedEscalationRequestMs;
        if ((l2 != null || callGroupEscalationEventLog.receivedEscalationRequestMs != null) && (l2 == null || !l2.equals(callGroupEscalationEventLog.receivedEscalationRequestMs))) {
            return false;
        }
        Long l3 = this.selfConnectingToMwMs;
        if ((l3 != null || callGroupEscalationEventLog.selfConnectingToMwMs != null) && (l3 == null || !l3.equals(callGroupEscalationEventLog.selfConnectingToMwMs))) {
            return false;
        }
        Long l4 = this.selfConnectedToMwMs;
        if ((l4 != null || callGroupEscalationEventLog.selfConnectedToMwMs != null) && (l4 == null || !l4.equals(callGroupEscalationEventLog.selfConnectedToMwMs))) {
            return false;
        }
        Long l5 = this.selfFailedToConnectToMwMs;
        if ((l5 != null || callGroupEscalationEventLog.selfFailedToConnectToMwMs != null) && (l5 == null || !l5.equals(callGroupEscalationEventLog.selfFailedToConnectToMwMs))) {
            return false;
        }
        Long l6 = this.peerConnectingToMwMs;
        if ((l6 != null || callGroupEscalationEventLog.peerConnectingToMwMs != null) && (l6 == null || !l6.equals(callGroupEscalationEventLog.peerConnectingToMwMs))) {
            return false;
        }
        Long l7 = this.peerConnectedToMwMs;
        if ((l7 != null || callGroupEscalationEventLog.peerConnectedToMwMs != null) && (l7 == null || !l7.equals(callGroupEscalationEventLog.peerConnectedToMwMs))) {
            return false;
        }
        Long l8 = this.peerFailedToConnectToMwMs;
        if ((l8 != null || callGroupEscalationEventLog.peerFailedToConnectToMwMs != null) && (l8 == null || !l8.equals(callGroupEscalationEventLog.peerFailedToConnectToMwMs))) {
            return false;
        }
        Long l9 = this.escalationEndedCallEndedMs;
        if ((l9 != null || callGroupEscalationEventLog.escalationEndedCallEndedMs != null) && (l9 == null || !l9.equals(callGroupEscalationEventLog.escalationEndedCallEndedMs))) {
            return false;
        }
        Long l10 = this.escalationTimedOutMs;
        if ((l10 != null || callGroupEscalationEventLog.escalationTimedOutMs != null) && (l10 == null || !l10.equals(callGroupEscalationEventLog.escalationTimedOutMs))) {
            return false;
        }
        Long l11 = this.escalationCompleteMs;
        if ((l11 != null || callGroupEscalationEventLog.escalationCompleteMs != null) && (l11 == null || !l11.equals(callGroupEscalationEventLog.escalationCompleteMs))) {
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
        long j = this.steadyTimeMs;
        long j2 = this.systemTimeMs;
        int hashCode12 = (((((((((527 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.connectionLoggingId.hashCode()) * 31) + this.localCallId.hashCode()) * 31) + this.p2pSharedCallId.hashCode()) * 31;
        String str = this.mwSharedCallId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        Long l = this.userInitiatedEscalationMs;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l2 = this.receivedEscalationRequestMs;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l3 = this.selfConnectingToMwMs;
        if (l3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l4 = this.selfConnectedToMwMs;
        if (l4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l5 = this.selfFailedToConnectToMwMs;
        if (l5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Long l6 = this.peerConnectingToMwMs;
        if (l6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l7 = this.peerConnectedToMwMs;
        if (l7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Long l8 = this.peerFailedToConnectToMwMs;
        if (l8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l8.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Long l9 = this.escalationEndedCallEndedMs;
        if (l9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l9.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Long l10 = this.escalationTimedOutMs;
        if (l10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l10.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Long l11 = this.escalationCompleteMs;
        if (l11 != null) {
            i = l11.hashCode();
        }
        return i12 + i;
    }

    public String toString() {
        return "CallGroupEscalationEventLog{steadyTimeMs=" + this.steadyTimeMs + "," + "systemTimeMs=" + this.systemTimeMs + "," + "connectionLoggingId=" + this.connectionLoggingId + "," + "localCallId=" + this.localCallId + "," + "p2pSharedCallId=" + this.p2pSharedCallId + "," + "mwSharedCallId=" + this.mwSharedCallId + "," + "userInitiatedEscalationMs=" + this.userInitiatedEscalationMs + "," + "receivedEscalationRequestMs=" + this.receivedEscalationRequestMs + "," + "selfConnectingToMwMs=" + this.selfConnectingToMwMs + "," + "selfConnectedToMwMs=" + this.selfConnectedToMwMs + "," + "selfFailedToConnectToMwMs=" + this.selfFailedToConnectToMwMs + "," + "peerConnectingToMwMs=" + this.peerConnectingToMwMs + "," + "peerConnectedToMwMs=" + this.peerConnectedToMwMs + "," + "peerFailedToConnectToMwMs=" + this.peerFailedToConnectToMwMs + "," + "escalationEndedCallEndedMs=" + this.escalationEndedCallEndedMs + "," + "escalationTimedOutMs=" + this.escalationTimedOutMs + "," + "escalationCompleteMs=" + this.escalationCompleteMs + "}";
    }

    public CallGroupEscalationEventLog(long j, long j2, String str, String str2, String str3, String str4, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(str3);
        this.steadyTimeMs = j;
        this.systemTimeMs = j2;
        this.connectionLoggingId = str;
        this.localCallId = str2;
        this.p2pSharedCallId = str3;
        this.mwSharedCallId = str4;
        this.userInitiatedEscalationMs = l;
        this.receivedEscalationRequestMs = l2;
        this.selfConnectingToMwMs = l3;
        this.selfConnectedToMwMs = l4;
        this.selfFailedToConnectToMwMs = l5;
        this.peerConnectingToMwMs = l6;
        this.peerConnectedToMwMs = l7;
        this.peerFailedToConnectToMwMs = l8;
        this.escalationEndedCallEndedMs = l9;
        this.escalationTimedOutMs = l10;
        this.escalationCompleteMs = l11;
    }
}
