package p000X;

/* renamed from: X.1Lu  reason: invalid class name and case insensitive filesystem */
public final class C28451Lu implements C28401Lo {
    public boolean A00;
    public final AnonymousClass0C1 A01;

    public final void BJ5(C15880ng r1, Throwable th, int i) {
    }

    public final void BJ7(C15880ng r1) {
    }

    public final void BJB() {
    }

    public final void BJK(C15880ng r1) {
    }

    public final void BJX(C15880ng r1, C28661Mp r2) {
    }

    public final void BP6() {
    }

    public final void BJS(C15880ng r4, C28661Mp r5, boolean z) {
        if (!this.A00) {
            this.A00 = true;
            C05680Ln.ADm.A02(this.A01);
            boolean z2 = false;
            if (C22080xo.A00 != null) {
                z2 = true;
            }
            if (z2) {
                boolean z3 = true;
                C32061aU r1 = r5.A04;
                if (r1 == null) {
                    r1 = C32061aU.A01;
                }
                C32081aW r2 = r1.A00;
                boolean z4 = false;
                if (r2 != null) {
                    z4 = true;
                }
                if (z4) {
                    boolean z5 = false;
                    if (r2 != null) {
                        z5 = true;
                    }
                    if (z5) {
                        z3 = r2.A00;
                    } else {
                        throw new IllegalStateException("explore config is not available");
                    }
                }
                if (z3) {
                    C22080xo.A00().A03(this.A01, AnonymousClass0NT.A08(StoredPreferences.A00));
                }
            }
        }
    }

    public C28451Lu(AnonymousClass0C1 r1) {
        this.A01 = r1;
    }
}
