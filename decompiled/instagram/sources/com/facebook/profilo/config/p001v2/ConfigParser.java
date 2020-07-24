package com.facebook.profilo.config.p001v2;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

/* renamed from: com.facebook.profilo.config.v2.ConfigParser */
public class ConfigParser {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str);

    public native Config parseConfig();

    static {
        AnonymousClass0Y1.A08("profilo_configjni");
    }

    public ConfigParser(String str) {
        this.mHybridData = initHybrid(str);
    }
}
