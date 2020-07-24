package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30610Dfx;

public class CallConnectionStartEventLog {
    public static AnonymousClass921 CONVERTER = new C30610Dfx();
    public final Long answerRecvMs;
    public final Boolean answerSdpReceivedFromServer;
    public final Long answerSentMs;
    public final Long connectionEndedMs;
    public final Long connectionFailedMs;
    public final String connectionLoggingId;
    public final Long connectionReadyMs;
    public final Long dismissRecvMs;
    public final Long dismissSentMs;
    public final Long incomingConnectionStartMs;
    public final Long inviteAckRecvMs;
    public final Long inviteSentMs;
    public final String localCallId;
    public final Long localSignalingId;
    public final Long negotiationCompleteMs;
    public final Long networkReadyMs;
    public final Boolean offerSdpReceivedFromInvite;
    public final Long outgoingConnectionStartMs;
    public final Boolean pcRestartedDuringInitialNegotiation;
    public final Long peerId;
    public final Long pranswerRecvMs;
    public final Long pranswerSentMs;
    public final String protocol;
    public final String sharedCallId;
    public final long steadyTimeMs;
    public final long systemTimeMs;

    public static native CallConnectionStartEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallConnectionStartEventLog)) {
            return false;
        }
        CallConnectionStartEventLog callConnectionStartEventLog = (CallConnectionStartEventLog) obj;
        if (!this.sharedCallId.equals(callConnectionStartEventLog.sharedCallId)) {
            return false;
        }
        String str = this.connectionLoggingId;
        if ((str != null || callConnectionStartEventLog.connectionLoggingId != null) && (str == null || !str.equals(callConnectionStartEventLog.connectionLoggingId))) {
            return false;
        }
        String str2 = this.localCallId;
        if (((str2 != null || callConnectionStartEventLog.localCallId != null) && (str2 == null || !str2.equals(callConnectionStartEventLog.localCallId))) || this.systemTimeMs != callConnectionStartEventLog.systemTimeMs || this.steadyTimeMs != callConnectionStartEventLog.steadyTimeMs) {
            return false;
        }
        String str3 = this.protocol;
        if ((str3 != null || callConnectionStartEventLog.protocol != null) && (str3 == null || !str3.equals(callConnectionStartEventLog.protocol))) {
            return false;
        }
        Long l = this.incomingConnectionStartMs;
        if ((l != null || callConnectionStartEventLog.incomingConnectionStartMs != null) && (l == null || !l.equals(callConnectionStartEventLog.incomingConnectionStartMs))) {
            return false;
        }
        Long l2 = this.outgoingConnectionStartMs;
        if ((l2 != null || callConnectionStartEventLog.outgoingConnectionStartMs != null) && (l2 == null || !l2.equals(callConnectionStartEventLog.outgoingConnectionStartMs))) {
            return false;
        }
        Long l3 = this.inviteSentMs;
        if ((l3 != null || callConnectionStartEventLog.inviteSentMs != null) && (l3 == null || !l3.equals(callConnectionStartEventLog.inviteSentMs))) {
            return false;
        }
        Long l4 = this.inviteAckRecvMs;
        if ((l4 != null || callConnectionStartEventLog.inviteAckRecvMs != null) && (l4 == null || !l4.equals(callConnectionStartEventLog.inviteAckRecvMs))) {
            return false;
        }
        Long l5 = this.pranswerSentMs;
        if ((l5 != null || callConnectionStartEventLog.pranswerSentMs != null) && (l5 == null || !l5.equals(callConnectionStartEventLog.pranswerSentMs))) {
            return false;
        }
        Long l6 = this.pranswerRecvMs;
        if ((l6 != null || callConnectionStartEventLog.pranswerRecvMs != null) && (l6 == null || !l6.equals(callConnectionStartEventLog.pranswerRecvMs))) {
            return false;
        }
        Long l7 = this.answerRecvMs;
        if ((l7 != null || callConnectionStartEventLog.answerRecvMs != null) && (l7 == null || !l7.equals(callConnectionStartEventLog.answerRecvMs))) {
            return false;
        }
        Long l8 = this.answerSentMs;
        if ((l8 != null || callConnectionStartEventLog.answerSentMs != null) && (l8 == null || !l8.equals(callConnectionStartEventLog.answerSentMs))) {
            return false;
        }
        Long l9 = this.dismissRecvMs;
        if ((l9 != null || callConnectionStartEventLog.dismissRecvMs != null) && (l9 == null || !l9.equals(callConnectionStartEventLog.dismissRecvMs))) {
            return false;
        }
        Long l10 = this.dismissSentMs;
        if ((l10 != null || callConnectionStartEventLog.dismissSentMs != null) && (l10 == null || !l10.equals(callConnectionStartEventLog.dismissSentMs))) {
            return false;
        }
        Long l11 = this.negotiationCompleteMs;
        if ((l11 != null || callConnectionStartEventLog.negotiationCompleteMs != null) && (l11 == null || !l11.equals(callConnectionStartEventLog.negotiationCompleteMs))) {
            return false;
        }
        Long l12 = this.networkReadyMs;
        if ((l12 != null || callConnectionStartEventLog.networkReadyMs != null) && (l12 == null || !l12.equals(callConnectionStartEventLog.networkReadyMs))) {
            return false;
        }
        Long l13 = this.connectionFailedMs;
        if ((l13 != null || callConnectionStartEventLog.connectionFailedMs != null) && (l13 == null || !l13.equals(callConnectionStartEventLog.connectionFailedMs))) {
            return false;
        }
        Long l14 = this.connectionEndedMs;
        if ((l14 != null || callConnectionStartEventLog.connectionEndedMs != null) && (l14 == null || !l14.equals(callConnectionStartEventLog.connectionEndedMs))) {
            return false;
        }
        Long l15 = this.connectionReadyMs;
        if ((l15 != null || callConnectionStartEventLog.connectionReadyMs != null) && (l15 == null || !l15.equals(callConnectionStartEventLog.connectionReadyMs))) {
            return false;
        }
        Long l16 = this.peerId;
        if ((l16 != null || callConnectionStartEventLog.peerId != null) && (l16 == null || !l16.equals(callConnectionStartEventLog.peerId))) {
            return false;
        }
        Long l17 = this.localSignalingId;
        if ((l17 != null || callConnectionStartEventLog.localSignalingId != null) && (l17 == null || !l17.equals(callConnectionStartEventLog.localSignalingId))) {
            return false;
        }
        Boolean bool = this.offerSdpReceivedFromInvite;
        if ((bool != null || callConnectionStartEventLog.offerSdpReceivedFromInvite != null) && (bool == null || !bool.equals(callConnectionStartEventLog.offerSdpReceivedFromInvite))) {
            return false;
        }
        Boolean bool2 = this.answerSdpReceivedFromServer;
        if ((bool2 != null || callConnectionStartEventLog.answerSdpReceivedFromServer != null) && (bool2 == null || !bool2.equals(callConnectionStartEventLog.answerSdpReceivedFromServer))) {
            return false;
        }
        Boolean bool3 = this.pcRestartedDuringInitialNegotiation;
        if ((bool3 != null || callConnectionStartEventLog.pcRestartedDuringInitialNegotiation != null) && (bool3 == null || !bool3.equals(callConnectionStartEventLog.pcRestartedDuringInitialNegotiation))) {
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23 = (527 + this.sharedCallId.hashCode()) * 31;
        String str = this.connectionLoggingId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode23 + hashCode) * 31;
        String str2 = this.localCallId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        long j = this.systemTimeMs;
        long j2 = this.steadyTimeMs;
        int i3 = (((((i2 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.protocol;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l = this.incomingConnectionStartMs;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l2 = this.outgoingConnectionStartMs;
        if (l2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l3 = this.inviteSentMs;
        if (l3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l3.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Long l4 = this.inviteAckRecvMs;
        if (l4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l4.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l5 = this.pranswerSentMs;
        if (l5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l5.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Long l6 = this.pranswerRecvMs;
        if (l6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l6.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Long l7 = this.answerRecvMs;
        if (l7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l7.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Long l8 = this.answerSentMs;
        if (l8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l8.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Long l9 = this.dismissRecvMs;
        if (l9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l9.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Long l10 = this.dismissSentMs;
        if (l10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l10.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        Long l11 = this.negotiationCompleteMs;
        if (l11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l11.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Long l12 = this.networkReadyMs;
        if (l12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l12.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Long l13 = this.connectionFailedMs;
        if (l13 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = l13.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Long l14 = this.connectionEndedMs;
        if (l14 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = l14.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        Long l15 = this.connectionReadyMs;
        if (l15 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = l15.hashCode();
        }
        int i19 = (i18 + hashCode18) * 31;
        Long l16 = this.peerId;
        if (l16 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = l16.hashCode();
        }
        int i20 = (i19 + hashCode19) * 31;
        Long l17 = this.localSignalingId;
        if (l17 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = l17.hashCode();
        }
        int i21 = (i20 + hashCode20) * 31;
        Boolean bool = this.offerSdpReceivedFromInvite;
        if (bool == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = bool.hashCode();
        }
        int i22 = (i21 + hashCode21) * 31;
        Boolean bool2 = this.answerSdpReceivedFromServer;
        if (bool2 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool2.hashCode();
        }
        int i23 = (i22 + hashCode22) * 31;
        Boolean bool3 = this.pcRestartedDuringInitialNegotiation;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return i23 + i;
    }

    public String toString() {
        return "CallConnectionStartEventLog{sharedCallId=" + this.sharedCallId + "," + "connectionLoggingId=" + this.connectionLoggingId + "," + "localCallId=" + this.localCallId + "," + "systemTimeMs=" + this.systemTimeMs + "," + "steadyTimeMs=" + this.steadyTimeMs + "," + "protocol=" + this.protocol + "," + "incomingConnectionStartMs=" + this.incomingConnectionStartMs + "," + "outgoingConnectionStartMs=" + this.outgoingConnectionStartMs + "," + "inviteSentMs=" + this.inviteSentMs + "," + "inviteAckRecvMs=" + this.inviteAckRecvMs + "," + "pranswerSentMs=" + this.pranswerSentMs + "," + "pranswerRecvMs=" + this.pranswerRecvMs + "," + "answerRecvMs=" + this.answerRecvMs + "," + "answerSentMs=" + this.answerSentMs + "," + "dismissRecvMs=" + this.dismissRecvMs + "," + "dismissSentMs=" + this.dismissSentMs + "," + "negotiationCompleteMs=" + this.negotiationCompleteMs + "," + "networkReadyMs=" + this.networkReadyMs + "," + "connectionFailedMs=" + this.connectionFailedMs + "," + "connectionEndedMs=" + this.connectionEndedMs + "," + "connectionReadyMs=" + this.connectionReadyMs + "," + "peerId=" + this.peerId + "," + "localSignalingId=" + this.localSignalingId + "," + "offerSdpReceivedFromInvite=" + this.offerSdpReceivedFromInvite + "," + "answerSdpReceivedFromServer=" + this.answerSdpReceivedFromServer + "," + "pcRestartedDuringInitialNegotiation=" + this.pcRestartedDuringInitialNegotiation + "}";
    }

    public CallConnectionStartEventLog(String str, String str2, String str3, long j, long j2, String str4, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Boolean bool, Boolean bool2, Boolean bool3) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        this.sharedCallId = str;
        this.connectionLoggingId = str2;
        this.localCallId = str3;
        this.systemTimeMs = j;
        this.steadyTimeMs = j2;
        this.protocol = str4;
        this.incomingConnectionStartMs = l;
        this.outgoingConnectionStartMs = l2;
        this.inviteSentMs = l3;
        this.inviteAckRecvMs = l4;
        this.pranswerSentMs = l5;
        this.pranswerRecvMs = l6;
        this.answerRecvMs = l7;
        this.answerSentMs = l8;
        this.dismissRecvMs = l9;
        this.dismissSentMs = l10;
        this.negotiationCompleteMs = l11;
        this.networkReadyMs = l12;
        this.connectionFailedMs = l13;
        this.connectionEndedMs = l14;
        this.connectionReadyMs = l15;
        this.peerId = l16;
        this.localSignalingId = l17;
        this.offerSdpReceivedFromInvite = bool;
        this.answerSdpReceivedFromServer = bool2;
        this.pcRestartedDuringInitialNegotiation = bool3;
    }
}
