package p000X;

/* renamed from: X.0ob  reason: invalid class name and case insensitive filesystem */
public final class C16440ob {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02;
    public final C15920nk A03;

    public final synchronized void A00(C256019m r5) {
        boolean z = false;
        if (r5.A05 == this.A03) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        if (C37451jg.A00(r5)) {
            this.A01--;
        } else {
            this.A00--;
        }
    }

    public final synchronized void A01(C256019m r5) {
        boolean z = false;
        if (r5.A05 == this.A03) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        if (C37451jg.A00(r5)) {
            this.A01++;
        } else {
            this.A00++;
        }
    }

    public final synchronized boolean A02() {
        boolean z;
        z = false;
        if (this.A01 + this.A00 < this.A02) {
            z = true;
        }
        return z;
    }

    public C16440ob(C15920nk r2, int i) {
        this.A03 = r2;
        this.A02 = i;
    }
}
