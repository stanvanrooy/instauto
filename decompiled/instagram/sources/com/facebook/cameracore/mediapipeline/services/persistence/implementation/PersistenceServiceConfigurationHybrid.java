package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateJavaHybrid;
import com.facebook.jni.HybridData;
import p000X.C64142qh;

public class PersistenceServiceConfigurationHybrid extends ServiceConfiguration {
    public final PersistenceServiceDelegateHybrid mCaptureScopeDelegate;
    public final PersistenceServiceDelegateHybrid mSharedScopeDelegate;
    public final PersistenceServiceDelegateHybrid mUserScopeDelegate;

    public static native HybridData initHybrid(PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid2, PersistenceServiceDelegateHybrid persistenceServiceDelegateHybrid3);

    /* JADX WARNING: Illegal instructions before constructor call */
    public PersistenceServiceConfigurationHybrid(C64142qh r6) {
        super(initHybrid(r4, r3, r2));
        PersistenceServiceDelegateJavaHybrid persistenceServiceDelegateJavaHybrid = new PersistenceServiceDelegateJavaHybrid(r6.A02);
        PersistenceServiceDelegateJavaHybrid persistenceServiceDelegateJavaHybrid2 = new PersistenceServiceDelegateJavaHybrid(r6.A01);
        PersistenceServiceDelegateJavaHybrid persistenceServiceDelegateJavaHybrid3 = new PersistenceServiceDelegateJavaHybrid(r6.A00);
        this.mUserScopeDelegate = persistenceServiceDelegateJavaHybrid;
        this.mSharedScopeDelegate = persistenceServiceDelegateJavaHybrid2;
        this.mCaptureScopeDelegate = persistenceServiceDelegateJavaHybrid3;
    }
}
