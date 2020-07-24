package p000X;

/* renamed from: X.C16 */
public final class C16 {
    public final C16 A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public static C16 A00(C16 c16, C16 c162) {
        C16 c163 = c16.A00;
        if (c163 != null) {
            c162 = A00(c163, c162);
        }
        return c16.A04(c162);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r3.A02 == null) goto L_0x0012;
     */
    public final C16 A01() {
        C16 c16 = this.A00;
        if (c16 == null) {
            return this;
        }
        C16 A012 = c16.A01();
        if (this.A02 == null) {
            if (A012.A02 != null) {
                return A012;
            }
            boolean z = this.A04;
            if (z != A012.A04) {
                if (!z) {
                    return A012;
                }
            }
            return A04(A012);
        }
        return A04((C16) null);
    }

    public final C16 A02() {
        C16 A022;
        if (this.A03) {
            C16 c16 = this.A00;
            if (c16 == null) {
                return null;
            }
            return c16.A02();
        }
        C16 c162 = this.A00;
        if (c162 == null || (A022 = c162.A02()) == this.A00) {
            return this;
        }
        return A04(A022);
    }

    public final C16 A03() {
        C16 A032;
        C16 c16 = this.A00;
        if (c16 == null) {
            A032 = null;
        } else {
            A032 = c16.A03();
        }
        if (this.A04) {
            return A04(A032);
        }
        return A032;
    }

    public final C16 A04(C16 c16) {
        C16 c162 = c16;
        if (c16 == this.A00) {
            return this;
        }
        return new C16(this.A01, c162, this.A02, this.A04, this.A03);
    }

    public final C16 A05(Object obj) {
        Object obj2 = obj;
        if (obj == this.A01) {
            return this;
        }
        return new C16(obj2, this.A00, this.A02, this.A04, this.A03);
    }

    public final String toString() {
        String str = this.A01.toString() + "[visible=" + this.A04 + "]";
        C16 c16 = this.A00;
        if (c16 != null) {
            return AnonymousClass000.A0J(str, ", ", c16.toString());
        }
        return str;
    }

    public C16(Object obj, C16 c16, String str, boolean z, boolean z2) {
        this.A01 = obj;
        this.A00 = c16;
        String str2 = null;
        if (str != null) {
            this.A02 = str.length() != 0 ? str : str2;
        }
        this.A04 = z;
        this.A03 = z2;
    }
}
