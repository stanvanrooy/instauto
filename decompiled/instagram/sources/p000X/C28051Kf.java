package p000X;

import android.os.Handler;
import android.view.View;

/* renamed from: X.1Kf  reason: invalid class name and case insensitive filesystem */
public final class C28051Kf {
    public C32841bw A00;
    public final C28041Ke A01;

    public static C28051Kf A00() {
        return new C28051Kf(new C469321p());
    }

    public static void A01(C28051Kf r7, C32721bk r8, C32801bs r9, C32761bo r10) {
        C32811bt r5 = new C32811bt();
        r7.A00 = new C32841bw(r8, new C32821bu(r9, new C11060eM(), r10, r5, new Handler()), r5);
    }

    public final void A02(View view) {
        this.A00.A00.A00.remove(view);
    }

    public final void A03(View view, AnonymousClass1TY r3) {
        this.A00.A00.A00.put(view, r3);
    }

    public final void A04(C32721bk r3, View view) {
        A01(this, r3, new C32801bs(view, this.A01), new C32761bo());
    }

    public final void A05(C32721bk r5, View view, C32781bq... r7) {
        this.A01.clear();
        for (C32781bq A2T : r7) {
            this.A01.A2T(A2T);
        }
        A01(this, r5, new C32801bs(view, this.A01), new C32761bo());
    }

    public C28051Kf(C28041Ke r1) {
        this.A01 = r1;
    }
}
