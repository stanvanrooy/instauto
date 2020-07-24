package com.facebook.common.restricks;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0a4;

public final class FBAssetManager {
    public static final FBAssetManager sInstance = new FBAssetManager();

    public static native void initColorResourceInterceptionProxies();

    public static native void initJNIProxy();

    public static native void initLoadResourceValueProxy();

    public static void onResourceValueLoaded(Object obj, int i) {
        if (obj.equals((Object) null)) {
            AnonymousClass0a4.A06((Object) null);
        }
    }

    public FBAssetManager() {
        try {
            AnonymousClass0Y1.A08("restricks");
            initJNIProxy();
        } catch (Throwable th) {
            AnonymousClass0DB.A0I("FBAssetManager", "Error initializing FBAssetManager", th);
        }
    }

    public static int interceptLoadedColorValue(int i, int i2) {
        return i2;
    }
}
