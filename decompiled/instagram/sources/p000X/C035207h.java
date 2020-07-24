package p000X;

/* renamed from: X.07h  reason: invalid class name and case insensitive filesystem */
public final class C035207h {
    public C035307i A00;
    public boolean A01 = true;
    public C035307i A02;
    public final C035407j A03;
    public final C035307i A04;

    public final C035307i A00() {
        boolean A042 = this.A01 & this.A03.A04(this.A02);
        this.A01 = A042;
        if (!A042) {
            return null;
        }
        this.A02.A02(this.A00, this.A04);
        return this.A04;
    }

    public C035207h(C035407j r2, C035307i r3, C035307i r4, C035307i r5) {
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A04 = r5;
    }

    public final C035307i A01() {
        if (A00() == null) {
            return null;
        }
        C035307i r1 = this.A00;
        this.A00 = this.A02;
        this.A02 = r1;
        return this.A04;
    }
}
