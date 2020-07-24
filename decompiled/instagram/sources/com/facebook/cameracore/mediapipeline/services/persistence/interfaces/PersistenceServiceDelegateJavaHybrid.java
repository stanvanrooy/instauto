package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import com.facebook.jni.HybridData;
import p000X.C77563aD;

public class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    public final C77563aD mDelegate;

    private native HybridData initHybrid();

    public String get(String str) {
        return this.mDelegate.A00(str);
    }

    public boolean remove(String str) {
        return this.mDelegate.A01(str);
    }

    public boolean set(String str, String str2) {
        return this.mDelegate.A02(str, str2);
    }

    public PersistenceServiceDelegateJavaHybrid(C77563aD r2) {
        this.mDelegate = r2;
        this.mHybridData = initHybrid();
    }
}
