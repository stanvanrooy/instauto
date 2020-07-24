package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0Ba;
import p000X.AnonymousClass8GM;
import p000X.AnonymousClass8GN;
import p000X.C22270y8;
import p000X.C65502tD;
import p000X.C65672uC;
import p000X.C65862uW;

public class DynamicServiceModule extends ServiceModule {
    public ServiceModule mBaseModule;
    public final AnonymousClass0Ba mErrorReporter;
    public final C65672uC mModule;
    public final C65862uW mModuleLoader;

    private synchronized ServiceModule getBaseInstance() {
        if (this.mBaseModule == null) {
            try {
                C65862uW r4 = this.mModuleLoader;
                if (r4 != null) {
                    if (C22270y8.A01().A06(r4.A00)) {
                        AnonymousClass8GM r3 = new AnonymousClass8GM(r4.A00);
                        r3.A03 = Constants.ONE;
                        AnonymousClass8GN r2 = new AnonymousClass8GN(r3);
                        C22270y8.A01().A04(r4.A01, r2);
                        C22270y8.A01().A09(r4.A01, r2);
                    } else {
                        throw new RuntimeException(AnonymousClass000.A0E("Library loading failed for: ", r4.A00.A01));
                    }
                }
                this.mBaseModule = (ServiceModule) Class.forName(this.mModule.A01).asSubclass(ServiceModule.class).newInstance();
            } catch (Exception e) {
                AnonymousClass0Ba r32 = this.mErrorReporter;
                if (r32 != null) {
                    r32.Bp7("DynamicServiceModule", AnonymousClass000.A0E("ServiceModule instance creation failed for ", this.mModule.A01), e);
                }
            }
        }
        return this.mBaseModule;
    }

    private native HybridData initHybrid(int i);

    public ServiceConfiguration createConfiguration(C65502tD r3) {
        ServiceModule baseInstance;
        if (!this.mModule.A00(r3) || (baseInstance = getBaseInstance()) == null) {
            return null;
        }
        return baseInstance.createConfiguration(r3);
    }

    public DynamicServiceModule(C65672uC r2, C65862uW r3, AnonymousClass0Ba r4) {
        this.mModule = r2;
        this.mModuleLoader = r3;
        this.mErrorReporter = r4;
        this.mHybridData = initHybrid(r2.A00.A00);
    }
}
