package com.instagram.common.kotlindelegate.lifecycle;

import p000X.AnonymousClass1HD;
import p000X.AnonymousClass77Z;
import p000X.C13150hy;
import p000X.C137125t6;
import p000X.C148076Un;
import p000X.C18720sJ;

public final class LazyAutoCleanup extends AutoCleanup {
    public Object A00;
    public boolean A01 = true;
    public final C137125t6 A02;
    public final C18720sJ A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return r2.A00;
     */
    public final Object A00() {
        AnonymousClass77Z A05;
        synchronized (this) {
            C137125t6 r1 = this.A02;
            if (r1 instanceof AnonymousClass1HD) {
                C137125t6 viewLifecycleOwner = ((AnonymousClass1HD) r1).getViewLifecycleOwner();
                C13150hy.A01(viewLifecycleOwner, "lifecycleOwner.viewLifecycleOwner");
                C148076Un lifecycle = viewLifecycleOwner.getLifecycle();
                C13150hy.A01(lifecycle, "lifecycleOwner.viewLifecycleOwner.lifecycle");
                A05 = lifecycle.A05();
            } else {
                C148076Un lifecycle2 = r1.getLifecycle();
                C13150hy.A01(lifecycle2, "lifecycleOwner.lifecycle");
                A05 = lifecycle2.A05();
            }
            if (!A05.A00(AnonymousClass77Z.A03)) {
                return null;
            }
            if (this.A00 == null && this.A01) {
                this.A00 = this.A03.invoke();
                this.A01 = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyAutoCleanup(C137125t6 r2, C18720sJ r3) {
        super(r2);
        C13150hy.A02(r2, "lifecycleOwner");
        C13150hy.A02(r3, "init");
        this.A02 = r2;
        this.A03 = r3;
    }

    public final void A01() {
        super.A01();
        this.A01 = true;
    }

    public final void A02(Object obj) {
        this.A00 = obj;
    }
}
