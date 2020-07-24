package p000X;

import android.content.Context;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0nH  reason: invalid class name and case insensitive filesystem */
public final class C15630nH implements C15640nI, C06570Po {
    public C17880qx A00;
    public C15880ng A01;
    public AnonymousClass0OC A02;
    public AnonymousClass0OC A03;

    public static C17880qx A00(C15630nH r6, AnonymousClass0C1 r7) {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("createReelTrayRequest", 731299955);
        }
        try {
            C17880qx r2 = new C17880qx(C17020pY.A00().A06(r7, Constants.ONE, Constants.ZERO, false, (C17750qk) null), C05700Lp.A00(), new AnonymousClass13Z(r6));
            r2.A00(new C240313a(r6));
            return r2;
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(2086630078);
            }
        }
    }

    public static C15880ng A01(C15630nH r6, Context context, AnonymousClass0C1 r8, AnonymousClass0MT r9, int i) {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("createFeedRequest", 511202338);
        }
        try {
            AnonymousClass0MT r2 = r9;
            C15880ng A002 = C15810nZ.A00(context, new C15780nW(context), r2, i, r8, -10);
            C17880qx r3 = new C17880qx(A002.A00, C05700Lp.A00(), new C17900qz(r6));
            r3.A00(new C17960r5(r6));
            A002.A01 = r3;
            return A002;
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1875622235);
            }
        }
    }

    public final C15880ng BXM() {
        C15880ng r1 = this.A01;
        this.A01 = null;
        return r1;
    }

    public final C17880qx BXN() {
        C17880qx r1 = this.A00;
        this.A00 = null;
        return r1;
    }

    public final void BXl(Context context, AnonymousClass0C1 r5) {
        if (this.A01 == null) {
            AnonymousClass0OC r0 = this.A02;
            if (r0 != null) {
                try {
                    this.A01 = (C15880ng) r0.get();
                    this.A02 = null;
                } catch (InterruptedException | ExecutionException e) {
                    AnonymousClass0QD.A09("StartupPrefetcher", e);
                }
            }
            if (this.A01 == null) {
                AnonymousClass0JN A002 = AnonymousClass0MR.A00(r5);
                this.A01 = A01(this, context, r5, new AnonymousClass0MT(A002), A002.A00());
            }
            C12810hQ.A03(this.A01.A01, 200, 1, true, true);
        }
    }

    public final void BXm(AnonymousClass0C1 r4) {
        if (this.A00 == null) {
            AnonymousClass0OC r0 = this.A03;
            if (r0 != null) {
                try {
                    this.A00 = (C17880qx) r0.get();
                    this.A03 = null;
                } catch (InterruptedException | ExecutionException e) {
                    AnonymousClass0QD.A09("StartupPrefetcher", e);
                }
            }
            if (this.A00 == null) {
                this.A00 = A00(this, r4);
            }
            C12810hQ.A03(this.A00, 201, 1, true, true);
        }
    }

    public final void BY2(Context context, AnonymousClass0C1 r11) {
        if (this.A02 == null && this.A01 == null) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("prepareMainFeedRequest", -785987924);
            }
            AnonymousClass0C1 r6 = r11;
            try {
                AnonymousClass0JN A002 = AnonymousClass0MR.A00(r11);
                this.A02 = new AnonymousClass0OC(new C15760nU(this, context, r6, new AnonymousClass0MT(A002), A002.A00()), 198, 1, true);
                C05700Lp.A00().ADb(this.A02);
            } finally {
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(-1000009452);
                }
            }
        }
    }

    public final void BY5(AnonymousClass0C1 r5) {
        if (this.A03 == null && this.A00 == null) {
            this.A03 = new AnonymousClass0OC(new C22920zE(this, r5), 199, 1, true);
            C05700Lp.A00().ADb(this.A03);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        C17880qx r0;
        C15880ng r02 = this.A01;
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            r0.A08.A00();
            this.A01 = null;
        }
        C17880qx r03 = this.A00;
        if (r03 != null) {
            r03.A08.A00();
            this.A00 = null;
        }
    }
}
