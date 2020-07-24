package p000X;

import android.util.Pair;

/* renamed from: X.1Ks  reason: invalid class name and case insensitive filesystem */
public final class C28181Ks {
    public final C28051Kf A00;
    public final C28121Km A01 = new C28121Km();
    public final C28231Kx A02;

    public C28181Ks(AnonymousClass0C1 r4, AnonymousClass1I6 r5, C28051Kf r6, C28161Kq r7) {
        this.A00 = r6;
        this.A02 = new C28231Kx(r5.AVo(), C28191Kt.A00(r4).A01(), r7);
    }

    public final void A00(C43411uN r6, C43451uR r7) {
        int intValue = r6.A02(r7).intValue();
        if (this.A01.A00(r7.getId()) == AnonymousClass1TY.A05) {
            C28121Km r3 = this.A01;
            String id = r7.getId();
            C30231Ta A002 = AnonymousClass1TY.A00(new Pair(r6, r7), Integer.valueOf(intValue), id);
            A002.A00(this.A02);
            r3.A01(id, A002.A02());
        }
    }
}
