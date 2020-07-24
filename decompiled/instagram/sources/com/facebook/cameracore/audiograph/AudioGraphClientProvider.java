package com.facebook.cameracore.audiograph;

import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass0Y1;

public class AudioGraphClientProvider {
    public static boolean sIsNativeLibLoaded;
    public final AtomicBoolean mDestructed;
    public HybridData mHybridData;

    public AudioGraphClientProvider(HybridData hybridData) {
        synchronized (AudioGraphClientProvider.class) {
            if (!sIsNativeLibLoaded) {
                AnonymousClass0Y1.A08("audiograph-native");
                sIsNativeLibLoaded = true;
            }
        }
        this.mDestructed = new AtomicBoolean(false);
        this.mHybridData = hybridData;
    }
}
