package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C206608tl;
import p000X.C228259s1;
import p000X.C23043A0y;

public abstract class NativeRelayChunkedPrefetcherSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String generateHash(String str, C23043A0y a0y) {
        return null;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String generateHashWithActorID(String str, String str2, C23043A0y a0y) {
        return null;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C206608tl getPrefetchedQueryIDs();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public C228259s1 provideResponseIfAvailableSync(String str) {
        return null;
    }

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeRelayChunkedPrefetcherSpec(A44 a44) {
        super(a44);
    }
}
