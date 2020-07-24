package com.facebook.rsys.call.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92O;

public class CallNotification {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92O();
    public final int notificationType;
    public final String userId;

    public static native CallNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallNotification)) {
            return false;
        }
        CallNotification callNotification = (CallNotification) obj;
        if (!this.userId.equals(callNotification.userId) || this.notificationType != callNotification.notificationType) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.userId.hashCode()) * 31) + this.notificationType;
    }

    public String toString() {
        return "CallNotification{userId=" + this.userId + "," + "notificationType=" + this.notificationType + "}";
    }

    public CallNotification(String str, int i) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        this.userId = str;
        this.notificationType = i;
    }
}
