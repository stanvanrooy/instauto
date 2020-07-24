package p000X;

import java.io.Serializable;

/* renamed from: X.0hd  reason: invalid class name and case insensitive filesystem */
public final class C12940hd implements C12950he, Serializable {
    public static final C12960hf A05 = new C12960hf(" ");
    public C28652CkU A00 = C28645CkN.A00;
    public C28652CkU A01 = C28635CkD.A00;
    public boolean A02 = true;
    public final C12970hg A03;
    public transient int A04 = 0;

    public C12940hd() {
        C12960hf r1 = A05;
        this.A03 = r1;
    }

    public final void A6H(C13460iZ r3) {
        this.A00.BuW(r3, this.A04);
    }

    public final void A6I(C13460iZ r3) {
        this.A01.BuW(r3, this.A04);
    }

    public final void BuR(C13460iZ r3) {
        r3.A0U(',');
        this.A00.BuW(r3, this.A04);
    }

    public final void BuU(C13460iZ r3, int i) {
        C28652CkU ckU = this.A00;
        if (!ckU.isInline()) {
            this.A04--;
        }
        if (i > 0) {
            ckU.BuW(r3, this.A04);
        } else {
            r3.A0U(' ');
        }
        r3.A0U(']');
    }

    public final void BuV(C13460iZ r3, int i) {
        C28652CkU ckU = this.A01;
        if (!ckU.isInline()) {
            this.A04--;
        }
        if (i > 0) {
            ckU.BuW(r3, this.A04);
        } else {
            r3.A0U(' ');
        }
        r3.A0U('}');
    }

    public final void BuX(C13460iZ r3) {
        r3.A0U(',');
        this.A01.BuW(r3, this.A04);
    }

    public final void BuY(C13460iZ r2) {
        if (this.A02) {
            r2.A0f(" : ");
        } else {
            r2.A0U(':');
        }
    }

    public final void Bua(C13460iZ r2) {
        C12970hg r0 = this.A03;
        if (r0 != null) {
            r2.A0a(r0);
        }
    }

    public final void Buc(C13460iZ r2) {
        if (!this.A00.isInline()) {
            this.A04++;
        }
        r2.A0U('[');
    }

    public final void Bud(C13460iZ r2) {
        r2.A0U('{');
        if (!this.A01.isInline()) {
            this.A04++;
        }
    }
}
