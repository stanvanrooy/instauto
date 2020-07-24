package com.facebook.cameracore.mediapipeline.arclass.remotesource.instagram;

import com.facebook.native_bridge.NativeDataPromise;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass4YI;
import p000X.AnonymousClass4YK;
import p000X.C12810hQ;
import p000X.C15890nh;
import p000X.C17850qu;

public class IgARClassRemoteSourceFetcher {
    public AnonymousClass0C1 mSession;

    public void fetchARClass(NativeDataPromise nativeDataPromise) {
        if (nativeDataPromise != null) {
            AnonymousClass4YK r4 = new AnonymousClass4YK(this, nativeDataPromise);
            C15890nh r2 = new C15890nh(this.mSession);
            r2.A09 = Constants.ONE;
            r2.A0C = "creatives/ar_class/";
            r2.A06(AnonymousClass4YI.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = r4;
            C12810hQ.A03(A03, 243, 3, true, true);
        }
    }

    public IgARClassRemoteSourceFetcher(AnonymousClass0C1 r1) {
        this.mSession = r1;
    }
}
