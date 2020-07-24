package com.facebook.i18n;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public class TranslationsFetcher {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ByteBuffer byteBuffer, int i, String str, boolean z);

    public native String getTranslation(String str, int[] iArr, int i);

    static {
        AnonymousClass0Y1.A08("i18n");
    }
}
