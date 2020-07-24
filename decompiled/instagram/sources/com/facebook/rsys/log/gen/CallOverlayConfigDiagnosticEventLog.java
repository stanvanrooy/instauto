package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass921;
import p000X.C30564Dep;

public class CallOverlayConfigDiagnosticEventLog {
    public static AnonymousClass921 CONVERTER = new C30564Dep();
    public final Long callId;
    public final String confName;
    public final String connectionLoggingId;
    public final String overlayconfig1;
    public final Long peerId;
    public final String serverInfoData;

    public static native CallOverlayConfigDiagnosticEventLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallOverlayConfigDiagnosticEventLog)) {
            return false;
        }
        CallOverlayConfigDiagnosticEventLog callOverlayConfigDiagnosticEventLog = (CallOverlayConfigDiagnosticEventLog) obj;
        String str = this.connectionLoggingId;
        if ((str != null || callOverlayConfigDiagnosticEventLog.connectionLoggingId != null) && (str == null || !str.equals(callOverlayConfigDiagnosticEventLog.connectionLoggingId))) {
            return false;
        }
        String str2 = this.overlayconfig1;
        if ((str2 != null || callOverlayConfigDiagnosticEventLog.overlayconfig1 != null) && (str2 == null || !str2.equals(callOverlayConfigDiagnosticEventLog.overlayconfig1))) {
            return false;
        }
        Long l = this.callId;
        if ((l != null || callOverlayConfigDiagnosticEventLog.callId != null) && (l == null || !l.equals(callOverlayConfigDiagnosticEventLog.callId))) {
            return false;
        }
        String str3 = this.confName;
        if ((str3 != null || callOverlayConfigDiagnosticEventLog.confName != null) && (str3 == null || !str3.equals(callOverlayConfigDiagnosticEventLog.confName))) {
            return false;
        }
        Long l2 = this.peerId;
        if ((l2 != null || callOverlayConfigDiagnosticEventLog.peerId != null) && (l2 == null || !l2.equals(callOverlayConfigDiagnosticEventLog.peerId))) {
            return false;
        }
        String str4 = this.serverInfoData;
        if ((str4 != null || callOverlayConfigDiagnosticEventLog.serverInfoData != null) && (str4 == null || !str4.equals(callOverlayConfigDiagnosticEventLog.serverInfoData))) {
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
        String str = this.connectionLoggingId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        String str2 = this.overlayconfig1;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.callId;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.confName;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l2 = this.peerId;
        if (l2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this.serverInfoData;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "CallOverlayConfigDiagnosticEventLog{connectionLoggingId=" + this.connectionLoggingId + "," + "overlayconfig1=" + this.overlayconfig1 + "," + "callId=" + this.callId + "," + "confName=" + this.confName + "," + "peerId=" + this.peerId + "," + "serverInfoData=" + this.serverInfoData + "}";
    }

    public CallOverlayConfigDiagnosticEventLog(String str, String str2, Long l, String str3, Long l2, String str4) {
        this.connectionLoggingId = str;
        this.overlayconfig1 = str2;
        this.callId = l;
        this.confName = str3;
        this.peerId = l2;
        this.serverInfoData = str4;
    }
}
