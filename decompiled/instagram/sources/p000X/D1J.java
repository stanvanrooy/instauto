package p000X;

import android.net.Uri;
import java.util.regex.Matcher;

/* renamed from: X.D1J */
public final class D1J implements C29606D1l, D14 {
    public static int A09 = 8000;
    public static int A0A = 8000;
    public static String A0B;
    public static final D24 A0C = new D24();
    public int A00 = -1;
    public D15 A01;
    public D1W A02;
    public final D23 A03;
    public final C29279Cv5 A04;
    public final D19 A05;
    public final C29262Cuo A06;
    public final C29276Cv2 A07;
    public final String A08;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final synchronized long BWT(D1M d1m) {
        boolean z;
        this.A02 = new D1W(this.A06.A04, d1m.A04);
        D24 d24 = A0C;
        synchronized (d24) {
            D15 A002 = d24.A00(this.A02);
            if (A002 == null) {
                if (D1Y.A01 == null) {
                    synchronized (D1Y.class) {
                        if (D1Y.A01 == null) {
                            D1Y.A01 = new D1Y();
                        }
                    }
                }
                D1Y d1y = D1Y.A01;
                Matcher matcher = D1Y.A02.matcher(d1m.A04.toString());
                Uri uri = null;
                if (matcher.matches()) {
                    try {
                        Integer num = (Integer) d1y.A00.get(Long.valueOf(Long.parseLong(matcher.group(5))));
                        if (num != null) {
                            String group = matcher.group(2);
                            uri = Uri.parse(matcher.replaceAll("$1/live-dash/ID/live-ll-" + group + "-$3/$4-" + num + ".m4$6"));
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                if (uri != null) {
                    A002 = d24.A00(new D1W(this.A06.A04, uri));
                }
            }
            z = true;
            if (A002 == null) {
                byte[] A012 = this.A03.A01(this.A06.A04, d1m.A04);
                if (A012 == null) {
                    this.A01 = new D1E(this.A06, this.A04, this.A08, A09, A0A, this.A05, this.A07, A0B);
                } else {
                    D1I d1i = new D1I(A012, A012.length, this.A05, false);
                    this.A01 = d1i;
                    d24.A02(this.A02, d1i);
                }
                z = false;
            } else if (A002 instanceof D1I) {
                D1I d1i2 = (D1I) A002;
                z = d1i2.A03;
                this.A01 = new D1I(d1i2.A04, d1i2.A02, this.A05, z);
            } else {
                D1G d1g = (D1G) A002;
                if (d1g.A02()) {
                    D1I d1i3 = new D1I(d1g.A04, d1g.A01, this.A05, true);
                    this.A01 = d1i3;
                    d24.A02(this.A02, d1i3);
                } else {
                    d24.A01(this.A02);
                    d1g.A02 = this.A05;
                    this.A01 = d1g;
                }
            }
        }
        return this.A01.BWT(A00(this, d1m, z));
    }

    public final void Bsq(int i) {
        synchronized (this) {
            this.A00 = i;
            D15 d15 = this.A01;
            if (d15 != null && (d15 instanceof C29606D1l)) {
                ((C29606D1l) d15).Bsq(i);
            }
        }
    }

    public final synchronized void close() {
        byte[] bArr;
        int i;
        D15 d15 = this.A01;
        if (d15 != null) {
            d15.close();
            D15 d152 = this.A01;
            if (d152 instanceof D1F) {
                D1F d1f = (D1F) d152;
                if (d1f.A02() && (bArr = d1f.A04) != null && bArr.length >= (i = d1f.A01)) {
                    if (i <= 0) {
                        i = d1f.A00;
                    }
                    D24 d24 = A0C;
                    synchronized (d24) {
                        d24.A02(this.A02, new D1I(d1f.A04, i, (D19) null, true));
                    }
                    D23 d23 = this.A03;
                    D1W d1w = this.A02;
                    d23.A00(d1w.A01, d1w.A00, d1f.A04, i);
                }
            }
        }
        this.A01 = null;
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        D15 d15 = this.A01;
        if (d15 != null) {
            i3 = d15.read(bArr, i, i2);
        } else {
            i3 = -1;
        }
        return i3;
    }

    public static D1M A00(D1J d1j, D1M d1m, boolean z) {
        D1B d1b = new D1B(z);
        D1M d1m2 = d1m;
        Uri uri = d1m2.A04;
        byte[] bArr = d1m2.A07;
        long j = d1m2.A01;
        long j2 = d1m2.A03;
        long j3 = d1m2.A02;
        String str = d1m2.A06;
        int i = d1m2.A00;
        D1P d1p = d1m2.A05;
        int i2 = d1j.A00;
        if (i2 < 0) {
            i2 = d1p.A02;
        }
        return new D1M(uri, bArr, j, j2, j3, str, i, new D1P(d1p, i2, d1b));
    }

    public final void A86() {
        D15 d15 = this.A01;
        if (d15 != null && (d15 instanceof C29606D1l)) {
            ((C29606D1l) d15).A86();
        }
    }

    public final void cancel() {
        D15 d15 = this.A01;
        if (d15 != null) {
            d15.cancel();
        }
    }

    public D1J(C29262Cuo cuo, String str, D23 d23, D19 d19, C29276Cv2 cv2, C29279Cv5 cv5) {
        D6U.A01(d19);
        this.A06 = cuo;
        this.A08 = str;
        this.A03 = d23;
        this.A05 = d19;
        this.A07 = cv2;
        this.A04 = cv5;
        this.A01 = null;
    }
}
