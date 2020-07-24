package com.instagram.react.impl;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.delegate.IgReactDelegate;
import p000X.A3N;
import p000X.A56;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass6VY;
import p000X.AnonymousClass901;
import p000X.AnonymousClass9FI;
import p000X.C06590Pq;
import p000X.C121635Jh;
import p000X.C16920pO;
import p000X.C16930pP;
import p000X.C16940pQ;
import p000X.C2114099w;
import p000X.C227499qb;
import p000X.C53832Un;

public class IgReactPluginImpl extends C16920pO {
    public Application A00;
    public C121635Jh A01;

    public void addMemoryInfoToEvent(AnonymousClass0P4 r1) {
    }

    public synchronized C121635Jh getFragmentFactory() {
        if (this.A01 == null) {
            this.A01 = new C121635Jh();
        }
        return this.A01;
    }

    public A56 getPerformanceLogger(C06590Pq r3) {
        C2114099w r0;
        Class<C2114099w> cls = C2114099w.class;
        synchronized (cls) {
            r0 = (C2114099w) r3.AV9(cls);
            if (r0 == null) {
                r0 = new C2114099w(r3);
                r3.BYi(cls, r0);
            }
        }
        return r0;
    }

    public C227499qb newIgReactDelegate(AnonymousClass1HD r2) {
        return new IgReactDelegate(r2);
    }

    public void preloadReactNativeBridge(C06590Pq r2) {
        AnonymousClass901.A00(this.A00, r2).A02();
    }

    public IgReactPluginImpl(Application application) {
        this.A00 = application;
        C16940pQ.A00 = new C16930pP(application);
    }

    public void navigateToReactNativeApp(C06590Pq r3, String str, Bundle bundle) {
        FragmentActivity A002;
        A3N A04 = C16940pQ.A00().A01(r3).A02().A04();
        if (A04 != null && (A002 = AnonymousClass6VY.A00(A04.A00())) != null) {
            C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r3, str);
            newReactNativeLauncher.Bjt(bundle);
            newReactNativeLauncher.BrT(A002).A02();
        }
    }

    public boolean maybeRequestOverlayPermissions(Context context, Integer num) {
        return false;
    }

    public C53832Un newReactNativeLauncher(C06590Pq r2) {
        return new AnonymousClass9FI(r2);
    }

    public C53832Un newReactNativeLauncher(C06590Pq r2, String str) {
        return new AnonymousClass9FI(r2, str);
    }
}
