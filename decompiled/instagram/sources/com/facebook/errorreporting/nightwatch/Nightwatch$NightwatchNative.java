package com.facebook.errorreporting.nightwatch;

import p000X.AnonymousClass0FK;
import p000X.AnonymousClass0YD;

public class Nightwatch$NightwatchNative {
    public static native int recordDataInNightWatch(long j, int i);

    public static native int start(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2);

    static {
        if (Boolean.TRUE.equals(AnonymousClass0FK.A03.get())) {
            AnonymousClass0YD.A01("fbnightwatch");
            return;
        }
        throw new RuntimeException("trying to load nightwatch before nightwatch starts");
    }
}
