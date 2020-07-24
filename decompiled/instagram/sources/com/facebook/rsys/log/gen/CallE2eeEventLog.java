package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30596Dfg;

public class CallE2eeEventLog {
    public static AnonymousClass921 CONVERTER = new C30596Dfg();
    public final String connectionLoggingId;
    public final Long createCryptoAnswerTime;
    public final Long createCryptoOfferTime;
    public final Long decryptedMsgTime;
    public final Long encryptedMsgTime;
    public final Long engineType;
    public final Long genPrekeyBundleTime;
    public final Long getIkTime;
    public final String localCallId;
    public final Long peerId;
    public final Long processSdpCryptoTime;
    public final String sharedCallId;
    public final Long status;
    public final long steadyTimeMs;
    public final long systemTimeMs;
    public final Long version;

    public static native CallE2eeEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallE2eeEventLog)) {
            return false;
        }
        CallE2eeEventLog callE2eeEventLog = (CallE2eeEventLog) obj;
        if (!this.sharedCallId.equals(callE2eeEventLog.sharedCallId) || !this.connectionLoggingId.equals(callE2eeEventLog.connectionLoggingId) || this.systemTimeMs != callE2eeEventLog.systemTimeMs || this.steadyTimeMs != callE2eeEventLog.steadyTimeMs) {
            return false;
        }
        Long l = this.engineType;
        if ((l != null || callE2eeEventLog.engineType != null) && (l == null || !l.equals(callE2eeEventLog.engineType))) {
            return false;
        }
        Long l2 = this.status;
        if ((l2 != null || callE2eeEventLog.status != null) && (l2 == null || !l2.equals(callE2eeEventLog.status))) {
            return false;
        }
        Long l3 = this.version;
        if ((l3 != null || callE2eeEventLog.version != null) && (l3 == null || !l3.equals(callE2eeEventLog.version))) {
            return false;
        }
        Long l4 = this.genPrekeyBundleTime;
        if ((l4 != null || callE2eeEventLog.genPrekeyBundleTime != null) && (l4 == null || !l4.equals(callE2eeEventLog.genPrekeyBundleTime))) {
            return false;
        }
        Long l5 = this.encryptedMsgTime;
        if ((l5 != null || callE2eeEventLog.encryptedMsgTime != null) && (l5 == null || !l5.equals(callE2eeEventLog.encryptedMsgTime))) {
            return false;
        }
        Long l6 = this.decryptedMsgTime;
        if ((l6 != null || callE2eeEventLog.decryptedMsgTime != null) && (l6 == null || !l6.equals(callE2eeEventLog.decryptedMsgTime))) {
            return false;
        }
        Long l7 = this.processSdpCryptoTime;
        if ((l7 != null || callE2eeEventLog.processSdpCryptoTime != null) && (l7 == null || !l7.equals(callE2eeEventLog.processSdpCryptoTime))) {
            return false;
        }
        Long l8 = this.createCryptoOfferTime;
        if ((l8 != null || callE2eeEventLog.createCryptoOfferTime != null) && (l8 == null || !l8.equals(callE2eeEventLog.createCryptoOfferTime))) {
            return false;
        }
        Long l9 = this.createCryptoAnswerTime;
        if ((l9 != null || callE2eeEventLog.createCryptoAnswerTime != null) && (l9 == null || !l9.equals(callE2eeEventLog.createCryptoAnswerTime))) {
            return false;
        }
        Long l10 = this.getIkTime;
        if ((l10 != null || callE2eeEventLog.getIkTime != null) && (l10 == null || !l10.equals(callE2eeEventLog.getIkTime))) {
            return false;
        }
        Long l11 = this.peerId;
        if ((l11 != null || callE2eeEventLog.peerId != null) && (l11 == null || !l11.equals(callE2eeEventLog.peerId))) {
            return false;
        }
        String str = this.localCallId;
        if ((str != null || callE2eeEventLog.localCallId != null) && (str == null || !str.equals(callE2eeEventLog.localCallId))) {
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
        long j = this.systemTimeMs;
        long j2 = this.steadyTimeMs;
        int hashCode12 = (((((((527 + this.sharedCallId.hashCode()) * 31) + this.connectionLoggingId.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.engineType;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode12 + hashCode) * 31;
        Long l2 = this.status;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l3 = this.version;
        if (l3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l4 = this.genPrekeyBundleTime;
        if (l4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l5 = this.encryptedMsgTime;
        if (l5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Long l6 = this.decryptedMsgTime;
        if (l6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Long l7 = this.processSdpCryptoTime;
        if (l7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l8 = this.createCryptoOfferTime;
        if (l8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Long l9 = this.createCryptoAnswerTime;
        if (l9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Long l10 = this.getIkTime;
        if (l10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l10.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Long l11 = this.peerId;
        if (l11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l11.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str = this.localCallId;
        if (str != null) {
            i = str.hashCode();
        }
        return i12 + i;
    }

    public String toString() {
        return "CallE2eeEventLog{sharedCallId=" + this.sharedCallId + "," + "connectionLoggingId=" + this.connectionLoggingId + "," + "systemTimeMs=" + this.systemTimeMs + "," + "steadyTimeMs=" + this.steadyTimeMs + "," + "engineType=" + this.engineType + "," + "status=" + this.status + "," + "version=" + this.version + "," + "genPrekeyBundleTime=" + this.genPrekeyBundleTime + "," + "encryptedMsgTime=" + this.encryptedMsgTime + "," + "decryptedMsgTime=" + this.decryptedMsgTime + "," + "processSdpCryptoTime=" + this.processSdpCryptoTime + "," + "createCryptoOfferTime=" + this.createCryptoOfferTime + "," + "createCryptoAnswerTime=" + this.createCryptoAnswerTime + "," + "getIkTime=" + this.getIkTime + "," + "peerId=" + this.peerId + "," + "localCallId=" + this.localCallId + "}";
    }

    public CallE2eeEventLog(String str, String str2, long j, long j2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, String str3) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        this.sharedCallId = str;
        this.connectionLoggingId = str2;
        this.systemTimeMs = j;
        this.steadyTimeMs = j2;
        this.engineType = l;
        this.status = l2;
        this.version = l3;
        this.genPrekeyBundleTime = l4;
        this.encryptedMsgTime = l5;
        this.decryptedMsgTime = l6;
        this.processSdpCryptoTime = l7;
        this.createCryptoOfferTime = l8;
        this.createCryptoAnswerTime = l9;
        this.getIkTime = l10;
        this.peerId = l11;
        this.localCallId = str3;
    }
}
