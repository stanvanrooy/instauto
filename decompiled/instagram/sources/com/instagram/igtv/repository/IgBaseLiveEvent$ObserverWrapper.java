package com.instagram.igtv.repository;

import p000X.AnonymousClass1AC;
import p000X.AnonymousClass1N6;
import p000X.AnonymousClass77Q;
import p000X.AnonymousClass77Z;
import p000X.C13150hy;
import p000X.C137125t6;
import p000X.C148076Un;
import p000X.C1662977d;

public final class IgBaseLiveEvent$ObserverWrapper implements AnonymousClass1AC {
    public boolean A00;
    public AnonymousClass77Z A01;
    public final C137125t6 A02;
    public final AnonymousClass1N6 A03;
    public final AnonymousClass77Q A04;

    public IgBaseLiveEvent$ObserverWrapper(C137125t6 r3, AnonymousClass1N6 r4, AnonymousClass77Q r5) {
        C13150hy.A02(r3, "owner");
        C13150hy.A02(r4, "observer");
        C13150hy.A02(r5, "liveEvent");
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        C148076Un lifecycle = r3.getLifecycle();
        C13150hy.A01(lifecycle, "owner.lifecycle");
        AnonymousClass77Z A05 = lifecycle.A05();
        C13150hy.A01(A05, "owner.lifecycle.currentState");
        this.A01 = A05;
    }

    public final void BOp(C137125t6 r5, C1662977d r6) {
        C13150hy.A02(r5, "source");
        C13150hy.A02(r6, "event");
        C148076Un lifecycle = this.A02.getLifecycle();
        C13150hy.A01(lifecycle, "owner.lifecycle");
        AnonymousClass77Z A05 = lifecycle.A05();
        C13150hy.A01(A05, "owner.lifecycle.currentState");
        if (this.A01 == AnonymousClass77Z.A03 && A05.A00(AnonymousClass77Z.CREATED)) {
            AnonymousClass77Q.A00(this.A04, true);
        } else if (A05 == AnonymousClass77Z.DESTROYED) {
            AnonymousClass77Q r3 = this.A04;
            AnonymousClass1N6 r2 = this.A03;
            C13150hy.A02(r2, "observer");
            IgBaseLiveEvent$ObserverWrapper igBaseLiveEvent$ObserverWrapper = (IgBaseLiveEvent$ObserverWrapper) r3.A01.remove(r2);
            if (igBaseLiveEvent$ObserverWrapper != null) {
                AnonymousClass77Q.A00(r3, false);
                igBaseLiveEvent$ObserverWrapper.A02.getLifecycle().A07(igBaseLiveEvent$ObserverWrapper);
                r3.A01(r2);
                return;
            }
            return;
        }
        this.A01 = A05;
        boolean z = this.A00;
        boolean A002 = A05.A00(AnonymousClass77Z.STARTED);
        this.A00 = A002;
        if (!z && A002) {
            this.A04.A02(this.A03);
        } else if (z && !A002) {
            C13150hy.A02(this.A03, "observer");
        }
    }
}
