package p000X;

/* renamed from: X.1Iv  reason: invalid class name and case insensitive filesystem */
public final class C27691Iv {
    public final AnonymousClass1J1 A00;
    public final C27701Iw A01 = new C27701Iw();

    public static C27691Iv A00() {
        return new C27691Iv(C27731Iz.A01);
    }

    public final void A01() {
        C27701Iw r2 = this.A01;
        if (!r2.A01) {
            synchronized (r2) {
                if (!r2.A01) {
                    AnonymousClass1KS r1 = r2.A00;
                    r2.A00 = null;
                    C27701Iw.A00(r1);
                }
            }
        }
    }

    public final void A02(C27791Jf r4, C253518l r5) {
        Runnable runnable = C27911Jr.A00;
        AnonymousClass1J1 r0 = this.A00;
        if (r0 != null) {
            r4 = r4.A0G(r0);
        }
        r4.A00.Bqn(new C27941Ju(r4, new C27931Jt(this, r5, runnable)));
    }

    public C27691Iv(AnonymousClass1J1 r2) {
        this.A00 = r2;
    }
}
