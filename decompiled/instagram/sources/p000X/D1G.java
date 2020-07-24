package p000X;

import java.io.IOException;

/* renamed from: X.D1G */
public final class D1G extends D1F {
    public int A00;
    public D19 A01;
    public D19 A02;
    public C29276Cv2 A03;
    public IOException A04 = null;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final D23 A09;
    public final C29279Cv5 A0A;
    public final String A0B;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|20|21|(4:25|(1:27)|28|29)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003c A[Catch:{ all -> 0x0055 }] */
    public final long BWT(D1M d1m) {
        C43711ux r1;
        synchronized (this) {
            try {
                if (A02()) {
                    r1 = C43711ux.CACHED;
                } else {
                    r1 = C43711ux.SEMI_CACHED;
                }
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        D19 d19 = this.A02;
        if (d19 != null) {
            d19.BSW(d1m, r1);
        }
        synchronized (this) {
            try {
                if (this.A01 < 0 && this.A00 < 0) {
                    wait((long) this.A07);
                    if (this.A01 < 0 && this.A00 < 0) {
                        this.A06 = false;
                        IOException iOException = new IOException("prefetch no bytes after connect wait");
                        this.A04 = iOException;
                        D19 d192 = this.A02;
                        if (d192 != null) {
                            d192.BSS(iOException);
                        }
                        throw this.A04;
                    }
                }
                A01(this.A02);
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        D19 d193 = this.A02;
        if (d193 != null) {
            d193.BSY(this.A05);
        }
        return (long) this.A01;
        throw th;
    }

    private int A00(byte[] bArr, int i, int i2) {
        if (this.A00 < 0) {
            this.A00 = 0;
        }
        int i3 = this.A00;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return 0;
        }
        if (i5 <= i2) {
            i2 = i5;
        }
        System.arraycopy(this.A04, i4, bArr, i, i2);
        this.A00 += i2;
        return i2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    public final void close() {
        D19 d19 = this.A02;
        if (d19 != null) {
            d19.BSR();
            this.A02 = null;
        }
        synchronized (this) {
            this.A06 = false;
            D17 d17 = this.A02;
            if (d17 != null) {
                d17.close();
                this.A02 = null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001a */
    public final int read(byte[] bArr, int i, int i2) {
        D17 d17;
        D19 d19;
        while (this.A06) {
            synchronized (this) {
                try {
                    int A002 = A00(bArr, i, i2);
                    if (A002 > 0) {
                        D19 d192 = this.A02;
                        if (d192 != null) {
                            d192.Au8(A002);
                        }
                    } else {
                        wait((long) this.A08);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        }
        IOException iOException = this.A04;
        if (iOException != null) {
            D19 d193 = this.A02;
            if (d193 != null) {
                d193.BSS(iOException);
            }
            throw this.A04;
        }
        int A003 = A00(bArr, i, i2);
        if (A003 > 0) {
            D19 d194 = this.A02;
            if (d194 != null) {
                d194.Au8(A003);
            }
        } else {
            synchronized (this) {
                try {
                    d17 = this.A02;
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                    }
                }
            }
            if (d17 == null) {
                return -1;
            }
            try {
                A003 = d17.read(bArr, i, i2);
                if (A003 > 0 && (d19 = this.A02) != null) {
                    d19.Au8(A003);
                    return A003;
                }
            } catch (IOException e) {
                D19 d195 = this.A02;
                if (d195 != null) {
                    d195.BSS(e);
                }
                try {
                    d17.close();
                } catch (IOException unused) {
                }
                this.A02 = null;
                throw e;
            }
        }
        return A003;
    }

    public D1G(C29279Cv5 cv5, String str, int i, int i2, D23 d23, D19 d19, C29276Cv2 cv2, String str2) {
        this.A0A = cv5;
        this.A0B = str;
        this.A07 = i;
        this.A08 = i2;
        this.A09 = d23;
        this.A01 = d19;
        this.A03 = cv2;
        this.A03 = str2;
        this.A02 = null;
        this.A04 = null;
        this.A01 = -1;
        this.A00 = -1;
        this.A00 = -1;
        this.A06 = false;
    }

    public final void A86() {
    }

    public final void cancel() {
    }
}
