package p000X;

/* renamed from: X.0hm  reason: invalid class name and case insensitive filesystem */
public final class C13030hm {
    public byte[] A00 = null;
    public byte[] A01 = null;
    public char[] A02 = null;
    public char[] A03 = null;
    public char[] A04 = null;
    public final C13040hn A05;
    public final Object A06;
    public final boolean A07;

    public static final void A00(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public static final void A01(Object obj, Object obj2) {
        if (obj != obj2) {
            throw new IllegalArgumentException("Trying to release buffer not owned by the context");
        }
    }

    public final void A02(byte[] bArr) {
        if (bArr != null) {
            A01(bArr, this.A00);
            this.A00 = null;
            this.A05.A00[Constants.ZERO.intValue()] = bArr;
        }
    }

    public final void A03(byte[] bArr) {
        if (bArr != null) {
            A01(bArr, this.A01);
            this.A01 = null;
            this.A05.A00[Constants.ONE.intValue()] = bArr;
        }
    }

    public C13030hm(C13040hn r2, Object obj, boolean z) {
        this.A05 = r2;
        this.A06 = obj;
        this.A07 = z;
    }
}
