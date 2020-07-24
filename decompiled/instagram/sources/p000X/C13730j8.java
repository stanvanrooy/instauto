package p000X;

/* renamed from: X.0j8  reason: invalid class name and case insensitive filesystem */
public final class C13730j8 {
    public final C13730j8 A00;
    public final C13020hl A01;

    public final C13020hl A00(int i, int i2, int i3) {
        C13020hl r1 = this.A01;
        if (r1.hashCode() == i && r1.A01(i2, i3)) {
            return r1;
        }
        for (C13730j8 r2 = this.A00; r2 != null; r2 = r2.A00) {
            C13020hl r12 = r2.A01;
            if (r12.hashCode() == i && r12.A01(i2, i3)) {
                return r12;
            }
        }
        return null;
    }

    public C13730j8(C13020hl r1, C13730j8 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
