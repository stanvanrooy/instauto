package com.instagram.strings;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;

public class StringBridge {
    public static boolean A00 = true;

    public static native String getInstagramString(String str);

    static {
        try {
            AnonymousClass0Y1.A08("scrambler");
            AnonymousClass0Y1.A08("strings");
        } catch (Throwable th) {
            AnonymousClass0DB.A05(StringBridge.class, "Failed to load native string libraries", th);
        }
    }
}
