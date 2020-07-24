package com.instagram.common.kotlindelegate.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import p000X.AnonymousClass1AD;
import p000X.AnonymousClass1HD;
import p000X.C13150hy;
import p000X.C137125t6;
import p000X.C148076Un;
import p000X.C1662977d;
import p000X.C63392pO;

public abstract class AutoCleanup implements AnonymousClass1AD {

    public final class Observer implements AnonymousClass1AD {
        public final C148076Un A00;
        public final /* synthetic */ AutoCleanup A01;

        public Observer(AutoCleanup autoCleanup, C148076Un r3) {
            C13150hy.A02(r3, "lifecycle");
            this.A01 = autoCleanup;
            this.A00 = r3;
        }

        @OnLifecycleEvent(C1662977d.ON_DESTROY)
        public final void onDestroy() {
            this.A01.A02((Object) null);
            this.A00.A07(this);
            this.A01.A01();
        }
    }

    public abstract Object A00();

    public void A01() {
    }

    public abstract void A02(Object obj);

    public AutoCleanup(C137125t6 r5) {
        C13150hy.A02(r5, "lifecycleOwner");
        if (r5 instanceof AnonymousClass1HD) {
            ((AnonymousClass1HD) r5).mViewLifecycleOwnerLiveData.A05(r5, new C63392pO(this));
            return;
        }
        C148076Un lifecycle = r5.getLifecycle();
        C148076Un lifecycle2 = r5.getLifecycle();
        C13150hy.A01(lifecycle2, "lifecycleOwner.lifecycle");
        lifecycle.A06(new Observer(this, lifecycle2));
    }
}
