package p000X;

import java.io.Serializable;

/* renamed from: X.C0s */
public abstract class C0s implements C3Z, Serializable {
    public final C27128Byr A00;
    public final int A01;

    public C0K A02(C0L c0l) {
        if (!(this instanceof C27191C0q)) {
            C27190C0p c0p = (C27190C0p) this;
            return c0p.A00.A02.A05(c0p, c0l, c0p);
        }
        C27191C0q c0q = (C27191C0q) this;
        return c0q.A00.A02.A05(c0q, c0l, c0q);
    }

    public C27179Bzx A01() {
        return this.A00.A01;
    }

    public final C0L A03(Class cls) {
        return this.A00.A04.A05(cls, (C27174Bzm) null);
    }

    public C27198C1i A04() {
        return this.A00.A03;
    }

    public final boolean A05(C1A c1a) {
        if ((c1a.APU() & this.A01) != 0) {
            return true;
        }
        return false;
    }

    public C0s(C27128Byr byr, int i) {
        this.A00 = byr;
        this.A01 = i;
    }

    public static int A00(Class cls) {
        int i = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            C3Y c3y = (C3Y) enumR;
            if (c3y.AD9()) {
                i |= c3y.APU();
            }
        }
        return i;
    }
}
