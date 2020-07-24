package com.instagram.pdqhashing;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class PDQHashingBridge {
    public final HybridData mHybridData = initHybrid("pdqhashing");

    public static native HybridData initHybrid(String str);

    public native String getHashWithQuality(String str);

    static {
        AnonymousClass0Y1.A08("pdqhashing");
    }

    public PDQHashingBridge(String str) {
    }
}
