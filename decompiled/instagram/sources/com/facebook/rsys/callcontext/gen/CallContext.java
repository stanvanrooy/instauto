package com.facebook.rsys.callcontext.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24851Aup;

public class CallContext {
    public static AnonymousClass921 CONVERTER = new C24851Aup();
    public final McfReference appContext;
    public final int roomType;
    public final String selfId;

    public static native CallContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallContext)) {
            return false;
        }
        CallContext callContext = (CallContext) obj;
        if (!this.selfId.equals(callContext.selfId) || this.roomType != callContext.roomType || !this.appContext.equals(callContext.appContext)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.selfId.hashCode()) * 31) + this.roomType) * 31) + this.appContext.hashCode();
    }

    public String toString() {
        return "CallContext{selfId=" + this.selfId + "," + "roomType=" + this.roomType + "," + "appContext=" + this.appContext + "}";
    }

    public CallContext(String str, int i, McfReference mcfReference) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(mcfReference);
        this.selfId = str;
        this.roomType = i;
        this.appContext = mcfReference;
    }
}
