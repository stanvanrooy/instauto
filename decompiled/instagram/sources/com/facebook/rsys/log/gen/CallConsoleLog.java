package com.facebook.rsys.log.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.BVJ;

public class CallConsoleLog {
    public static AnonymousClass921 CONVERTER = new BVJ();
    public final String filename;
    public final Long lineNumber;
    public final String logSource;
    public final String message;
    public final String severity;
    public final Long signalingId;

    public static native CallConsoleLog createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallConsoleLog)) {
            return false;
        }
        CallConsoleLog callConsoleLog = (CallConsoleLog) obj;
        if (!this.severity.equals(callConsoleLog.severity)) {
            return false;
        }
        String str = this.filename;
        if ((str != null || callConsoleLog.filename != null) && (str == null || !str.equals(callConsoleLog.filename))) {
            return false;
        }
        Long l = this.lineNumber;
        if ((l != null || callConsoleLog.lineNumber != null) && (l == null || !l.equals(callConsoleLog.lineNumber))) {
            return false;
        }
        Long l2 = this.signalingId;
        if (((l2 != null || callConsoleLog.signalingId != null) && (l2 == null || !l2.equals(callConsoleLog.signalingId))) || !this.message.equals(callConsoleLog.message) || !this.logSource.equals(callConsoleLog.logSource)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (527 + this.severity.hashCode()) * 31;
        String str = this.filename;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Long l = this.lineNumber;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l2 = this.signalingId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((((i3 + i) * 31) + this.message.hashCode()) * 31) + this.logSource.hashCode();
    }

    public String toString() {
        return "CallConsoleLog{severity=" + this.severity + "," + "filename=" + this.filename + "," + "lineNumber=" + this.lineNumber + "," + "signalingId=" + this.signalingId + "," + "message=" + this.message + "," + "logSource=" + this.logSource + "}";
    }

    public CallConsoleLog(String str, String str2, Long l, Long l2, String str3, String str4) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str3);
        AnonymousClass920.A00(str4);
        this.severity = str;
        this.filename = str2;
        this.lineNumber = l;
        this.signalingId = l2;
        this.message = str3;
        this.logSource = str4;
    }
}
