package p000X;

import android.view.View;

/* renamed from: X.1Kn  reason: invalid class name and case insensitive filesystem */
public final class C28131Kn implements C28071Kh {
    public final C28051Kf A00;
    public final C28121Km A01 = new C28121Km();
    public final C28141Ko A02;

    public final void A3d(C36321hr r5, C36851ii r6) {
        C28121Km r3 = this.A01;
        String id = r5.getId();
        C30231Ta A002 = AnonymousClass1TY.A00((C43411uN) r5, r6, id);
        A002.A00(this.A02);
        r3.A01(id, A002.A02());
    }

    public final void A3e(C36321hr r5, int i, C36851ii r7) {
        AnonymousClass1TY A002 = this.A01.A00(r5.getId());
        if (A002 == AnonymousClass1TY.A05) {
            A3d(r5, r7);
            A002 = this.A01.A00(r5.getId());
        }
        String A0G = AnonymousClass000.A0G(r5.getId(), ":", i);
        C28121Km r1 = this.A01;
        C30231Ta A003 = AnonymousClass1TY.A00(r5, r7, A0G);
        A003.A01(A002);
        r1.A01(A0G, A003.A02());
    }

    public final void BZm(C36321hr r4, View view) {
        this.A00.A03(view, this.A01.A00(r4.getId()));
    }

    public final void BZn(C36321hr r5, View view, int i) {
        this.A00.A03(view, this.A01.A00(AnonymousClass000.A0G(r5.getId(), ":", i)));
    }

    public final void Brz(View view) {
        this.A00.A02(view);
    }

    public C28131Kn(AnonymousClass0C1 r3, AnonymousClass1I6 r4, AnonymousClass0RN r5, C28051Kf r6) {
        this.A00 = r6;
        this.A02 = new C28141Ko(new C28091Kj(r3, r4, r5));
    }
}
