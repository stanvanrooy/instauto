package p000X;

import android.view.View;

/* renamed from: X.1Fp  reason: invalid class name and case insensitive filesystem */
public final class C26871Fp implements AnonymousClass1E8 {
    public static final AnonymousClass1EA A02 = AnonymousClass1EA.A00(8.0d, 40.0d);
    public final AnonymousClass1EG A00;
    public final View A01;

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r7) {
        AnonymousClass1EG r5 = this.A00;
        if (r5.A01 == 1.25d) {
            r5.A05(1.25d, true);
            r5.A03(1.0d);
        }
    }

    public C26871Fp(View view) {
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(A02);
        A002.A06 = true;
        this.A00 = A002;
        this.A01 = view;
    }

    public final void BOK(AnonymousClass1EG r5) {
        float A002 = (float) r5.A00();
        this.A01.setScaleX(A002);
        this.A01.setScaleY(A002);
    }
}
