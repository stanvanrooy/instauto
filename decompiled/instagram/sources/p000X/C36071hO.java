package p000X;

import java.util.ArrayList;

/* renamed from: X.1hO  reason: invalid class name and case insensitive filesystem */
public final class C36071hO extends AnonymousClass1ZU {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public AnonymousClass1ZV A04 = this.A0g;
    public C57362e4 A05;

    public final boolean A0P() {
        return true;
    }

    public final ArrayList A07() {
        return this.A0n;
    }

    public final void A0C(int i) {
        AnonymousClass1ZW r2;
        AnonymousClass1ZV r0;
        AnonymousClass1ZW r22;
        AnonymousClass1ZV r02;
        AnonymousClass1ZU r3 = this.A0h;
        if (r3 != null) {
            if (this.A01 == 1) {
                this.A0g.A05.A07(r3.A0g.A05, 0);
                this.A0a.A05.A07(r3.A0g.A05, 0);
                int i2 = this.A02;
                if (i2 != -1) {
                    this.A0e.A05.A07(r3.A0e.A05, i2);
                    r22 = this.A0f.A05;
                    r02 = r3.A0e;
                } else {
                    int i3 = this.A03;
                    if (i3 != -1) {
                        this.A0e.A05.A07(r3.A0f.A05, -i3);
                        r2 = this.A0f.A05;
                        r0 = r3.A0f;
                        r2.A07(r0.A05, -this.A03);
                        return;
                    }
                    float f = this.A00;
                    if (f != -1.0f && r3.A0x[0] == Constants.ZERO) {
                        int i4 = (int) (((float) r3.A0U) * f);
                        this.A0e.A05.A07(r3.A0e.A05, i4);
                        this.A0f.A05.A07(r3.A0e.A05, i4);
                        return;
                    }
                    return;
                }
            } else {
                this.A0e.A05.A07(r3.A0e.A05, 0);
                this.A0f.A05.A07(r3.A0e.A05, 0);
                int i5 = this.A02;
                if (i5 != -1) {
                    this.A0g.A05.A07(r3.A0g.A05, i5);
                    r22 = this.A0a.A05;
                    r02 = r3.A0g;
                } else {
                    int i6 = this.A03;
                    if (i6 != -1) {
                        this.A0g.A05.A07(r3.A0a.A05, -i6);
                        r2 = this.A0a.A05;
                        r0 = r3.A0a;
                        r2.A07(r0.A05, -this.A03);
                        return;
                    }
                    float f2 = this.A00;
                    if (f2 != -1.0f && r3.A0x[1] == Constants.ZERO) {
                        int i7 = (int) (((float) r3.A0B) * f2);
                        this.A0g.A05.A07(r3.A0g.A05, i7);
                        this.A0a.A05.A07(r3.A0g.A05, i7);
                        return;
                    }
                    return;
                }
            }
            r22.A07(r02.A05, this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r0.A0x[1] != p000X.Constants.ONE) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.A0x[0] != p000X.Constants.ONE) goto L_0x0021;
     */
    public final void A0J(AnonymousClass1ZY r10) {
        boolean z;
        AnonymousClass1ZS r3 = (AnonymousClass1ZS) this.A0h;
        if (r3 != null) {
            AnonymousClass1ZV A042 = r3.A04(Constants.ONE);
            AnonymousClass1ZV A043 = r3.A04(Constants.A0N);
            AnonymousClass1ZU r0 = this.A0h;
            if (r0 != null) {
                z = true;
            }
            z = false;
            if (this.A01 == 0) {
                A042 = r3.A04(Constants.A0C);
                A043 = r3.A04(Constants.A0Y);
                AnonymousClass1ZU r02 = this.A0h;
                if (r02 != null) {
                    z = true;
                }
                z = false;
            }
            if (this.A02 != -1) {
                AnonymousClass1ZZ A09 = r10.A09(this.A04);
                r10.A0F(A09, r10.A09(A042), this.A02, 6);
                if (z) {
                    r10.A0G(r10.A09(A043), A09, 0, 5);
                }
            } else if (this.A03 != -1) {
                AnonymousClass1ZZ A092 = r10.A09(this.A04);
                AnonymousClass1ZZ A093 = r10.A09(A043);
                r10.A0F(A092, A093, -this.A03, 6);
                if (z) {
                    r10.A0G(A092, r10.A09(A042), 0, 5);
                    r10.A0G(A093, A092, 0, 5);
                }
            } else if (this.A00 != -1.0f) {
                AnonymousClass1ZZ A094 = r10.A09(this.A04);
                AnonymousClass1ZZ A095 = r10.A09(A042);
                AnonymousClass1ZZ A096 = r10.A09(A043);
                float f = this.A00;
                C31611Za A06 = r10.A06();
                A06.A03.A05(A094, -1.0f);
                A06.A03.A05(A095, 1.0f - f);
                A06.A03.A05(A096, f);
                r10.A0B(A06);
            }
        }
    }

    public final void A0K(AnonymousClass1ZY r6) {
        AnonymousClass1ZU r4 = this.A0h;
        if (r4 != null) {
            int A002 = AnonymousClass1ZY.A00(this.A04);
            if (this.A01 == 1) {
                this.A0X = A002;
                this.A0Y = 0;
                A0D(r4.A01());
                A0E(0);
                return;
            }
            this.A0X = 0;
            this.A0Y = A002;
            A0E(r4.A02());
            A0D(0);
        }
    }

    public final void A0R(int i) {
        AnonymousClass1ZV r1;
        if (this.A01 != i) {
            this.A01 = i;
            this.A0n.clear();
            if (this.A01 == 1) {
                r1 = this.A0e;
            } else {
                r1 = this.A0g;
            }
            this.A04 = r1;
            this.A0n.add(r1);
            AnonymousClass1ZV[] r3 = this.A0u;
            int length = r3.length;
            for (int i2 = 0; i2 < length; i2++) {
                r3[i2] = this.A04;
            }
        }
    }

    public C36071hO() {
        this.A01 = 0;
        this.A05 = new C57362e4();
        this.A0n.clear();
        this.A0n.add(this.A04);
        AnonymousClass1ZV[] r2 = this.A0u;
        int length = r2.length;
        for (int i = 0; i < length; i++) {
            r2[i] = this.A04;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        throw new java.lang.AssertionError(p000X.AnonymousClass2KA.A00(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2.A01 == 1) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2.A01 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2.A04;
     */
    public final AnonymousClass1ZV A04(Integer num) {
        switch (num.intValue()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                break;
            case 2:
            case 4:
                break;
        }
    }
}
