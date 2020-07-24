package com.facebook.rsys.callinfo.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24850Auo;

public class CallInfo {
    public static AnonymousClass921 CONVERTER = new C24850Auo();
    public final int expansionBehavior;
    public final String name;
    public final int state;

    public static native CallInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallInfo)) {
            return false;
        }
        CallInfo callInfo = (CallInfo) obj;
        if (this.state != callInfo.state) {
            return false;
        }
        String str = this.name;
        if (((str != null || callInfo.name != null) && (str == null || !str.equals(callInfo.name))) || this.expansionBehavior != callInfo.expansionBehavior) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i = (527 + this.state) * 31;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((i + hashCode) * 31) + this.expansionBehavior;
    }

    public String toString() {
        return "CallInfo{state=" + this.state + "," + "name=" + this.name + "," + "expansionBehavior=" + this.expansionBehavior + "}";
    }

    public CallInfo(int i, String str, int i2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        this.state = i;
        this.name = str;
        this.expansionBehavior = i2;
    }
}
