package p000X;

import com.facebook.video.heroplayer.ipc.HttpTransferEndEvent;
import java.io.IOException;

/* renamed from: X.D1N */
public final class D1N implements D19 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C = -1;
    public long A0D = -1;
    public long A0E = -1;
    public long A0F = -1;
    public long A0G;
    public long A0H;
    public long A0I = -1;
    public long A0J = -1;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public C43711ux A0P;
    public IOException A0Q;
    public Integer A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public int A0j = 0;
    public long A0k = 0;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public final C29603D1i A0v;
    public final C29605D1k A0w;
    public final BME A0x;
    public final boolean A0y;
    public final long A0z;
    public final D29 A10;
    public final String A11;
    public final String A12;
    public final boolean A13;

    public static void A00(D1N d1n, long j, boolean z) {
        String str;
        D1N d1n2 = d1n;
        D29 d29 = d1n2.A10;
        if (d29 != null) {
            long j2 = d1n2.A0G;
            if (j2 <= 0) {
                j2 = d1n2.A0M;
            }
            IOException iOException = d1n2.A0Q;
            Integer num = d1n2.A0R;
            String str2 = d1n2.A12;
            long j3 = d1n2.A0z;
            String str3 = d1n2.A0Y;
            if (iOException != null) {
                str = iOException.getMessage();
            } else {
                str = "";
            }
            boolean z2 = d1n2.A0f;
            String str4 = d1n2.A11;
            int i = d1n2.A02;
            long j4 = d1n2.A0M;
            long max = Math.max(j2 - j4, -1);
            long max2 = Math.max(d1n2.A0N - j4, -1);
            long j5 = j;
            long max3 = Math.max(j - j4, -1);
            int i2 = d1n2.A06;
            C43711ux r35 = d1n2.A0P;
            boolean z3 = d1n2.A13;
            String str5 = d1n2.A0T;
            String str6 = d1n2.A0p;
            long j6 = d1n2.A08;
            long j7 = d1n2.A09;
            if (num == null) {
                num = Constants.ZERO;
            }
            int A002 = C43721uy.A00(num);
            long j8 = d1n2.A0H;
            int i3 = d1n2.A05;
            String str7 = d1n2.A0o;
            String str8 = d1n2.A0V;
            String str9 = d1n2.A0m;
            int i4 = d1n2.A04;
            long j9 = d1n2.A07;
            boolean z4 = d1n2.A0c;
            int i5 = d1n2.A00;
            long j10 = d1n2.A0K;
            long j11 = d1n2.A0L;
            boolean z5 = d1n2.A0t;
            boolean z6 = d1n2.A0u;
            boolean z7 = d1n2.A0h;
            long j12 = d1n2.A0J;
            long j13 = d1n2.A0I;
            String str10 = d1n2.A0S;
            long j14 = d1n2.A0O;
            String str11 = d1n2.A0W;
            String str12 = d1n2.A0X;
            long j15 = d1n2.A0C;
            long j16 = d1n2.A0D;
            long j17 = d1n2.A0E;
            long j18 = j6;
            long j19 = j7;
            long j20 = j8;
            long j21 = j9;
            long j22 = j10;
            long j23 = j11;
            long j24 = j12;
            long j25 = j13;
            long j26 = j14;
            long j27 = j15;
            long j28 = j16;
            long j29 = j17;
            String str13 = str2;
            long j30 = j3;
            String str14 = str3;
            d29.A00(new HttpTransferEndEvent(j5, str13, j30, str14, str, z2, str4, i, max, max2, max3, i2, r35, z3, str5, str6, j18, j19, A002, j20, i3, str7, str8, str9, i4, j21, z4, i5, j22, j23, z5, z6, z7, j24, j25, str10, j26, str11, str12, j27, j28, j29, z, d1n2.A01, d1n2.A0B, d1n2.A0U, d1n2.A0a, d1n2.A0b, d1n2.A0g, d1n2.A0Z, d1n2.A0d, d1n2.A0s, d1n2.A0e, d1n2.A0F, d1n2.A0q, d1n2.A0r, d1n2.A0l, d1n2.A0k, d1n2.A0n, d1n2.A0j, d1n2.A0A, d1n2.A03));
        }
    }

    public final void Au8(int i) {
        Integer num;
        this.A02 += i;
        D29 d29 = this.A10;
        if (d29 != null && (num = this.A0R) == Constants.A0u && this.A0i) {
            String str = this.A12;
            C43721uy.A02(num);
            d29.A00(new C29600D1f(str, i));
        }
    }

    public final void BSQ() {
        A00(this, this.A0x.ACp(), true);
    }

    public final void BSR() {
        long ACp = this.A0x.ACp();
        if (this.A0Q == null) {
            A00(this, ACp, false);
        }
    }

    public final void BSS(IOException iOException) {
        this.A0Q = iOException;
        A00(this, this.A0x.ACp(), false);
    }

    public final void BSU(String str, Object obj) {
        try {
            if ("X-FB-Connection-Quality".equals(str)) {
                this.A0m = (String) obj;
            } else if ("up-ttfb".equals(str) && obj != null) {
                this.A0O = Long.parseLong((String) obj);
            } else if ("x-fb-log-session-id".equals(str) && obj != null) {
                this.A0W = (String) obj;
            } else if ("x-fb-log-transaction-id".equals(str) && obj != null) {
                this.A0X = (String) obj;
            } else if ("x-fb-edge-hit".equals(str) && obj != null) {
                this.A0q = (String) obj;
            } else if ("x-fb-origin-hit".equals(str) && obj != null) {
                this.A0r = (String) obj;
            } else if ("x-fb-response-time-ms".equals(str) && obj != null) {
                this.A0k = Long.parseLong((String) obj);
            } else if ("x-fb-dynamic-latest-segment-id".equals(str) && obj != null) {
                this.A0j = Integer.parseInt((String) obj);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void BSW(D1M d1m, C43711ux r39) {
        D1N d1n;
        long j;
        long j2;
        D1M d1m2 = d1m;
        String uri = d1m2.A04.toString();
        D1P d1p = d1m2.A05;
        long j3 = (long) d1p.A04;
        int i = d1p.A03;
        long j4 = d1m2.A03;
        long j5 = d1m2.A02;
        String str = d1p.A0C;
        int i2 = d1p.A02;
        long j6 = d1p.A06;
        boolean z = d1p.A0F;
        int i3 = d1p.A00;
        D1B d1b = d1p.A0B;
        long j7 = d1p.A08;
        int i4 = d1p.A05;
        boolean z2 = d1p.A0H;
        boolean z3 = d1p.A0E;
        boolean z4 = d1p.A0G;
        long j8 = d1p.A09;
        long j9 = d1p.A07;
        int i5 = d1p.A01;
        int i6 = i3;
        long j10 = j7;
        try {
            C200008hB.A01("HttpTransferEventTracker.onTransferRequested");
            this.A0Y = uri;
            long ACp = this.A0x.ACp();
            this.A0M = ACp;
            this.A0N = 0;
            this.A0G = -1;
            this.A02 = 0;
            this.A0H = j3;
            this.A05 = i;
            this.A06++;
            this.A0Q = null;
            this.A0P = r39;
            this.A08 = j4;
            this.A09 = j5;
            this.A0V = str;
            this.A04 = i2;
            this.A07 = j6;
            this.A0c = z;
            this.A0g = z2;
            this.A0Z = z3;
            this.A0e = z4;
            this.A0F = j8;
            this.A0A = j9;
            this.A03 = i5;
            if (j7 < 0) {
                this.A00 = i6;
            } else {
                int i7 = i3 - ((int) (ACp - j7));
                this.A00 = i7;
                if (i7 < 0) {
                    this.A00 = 0;
                }
            }
            this.A01 = i6;
            this.A0B = j10;
            C29605D1k d1k = this.A0w;
            if (d1k != null) {
                D1O d1o = (D1O) d1k.AGg(-1);
                long j11 = d1o.A06;
                this.A0K = j11;
                long j12 = d1o.A0D;
                this.A0L = j12;
                long j13 = this.A09;
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass000.A0B("ttfb=", j12));
                sb.append(AnonymousClass000.A0B(", bw=", j11 / 1000));
                sb.append(AnonymousClass000.A0B(", ttfb_w=", d1o.A0F));
                sb.append(AnonymousClass000.A0B(", ttfb_s=", d1o.A0E));
                sb.append(AnonymousClass000.A0B(", bw_w=", d1o.A0A));
                sb.append(AnonymousClass000.A0B(", bw_s=", d1o.A09 / 1000));
                sb.append(AnonymousClass000.A05(", s=", d1o.A05));
                sb.append(AnonymousClass000.A0B(", ttfbEEs=", d1o.A02));
                sb.append(AnonymousClass000.A0B(", bwEEs=", d1o.A01));
                boolean z5 = d1o.A04;
                int i8 = d1o.A00;
                d1o.A04 = false;
                sb.append(AnonymousClass000.A0B(", 90p(d)=", d1o.ALH(j13, 90) / 1000));
                sb.append(AnonymousClass000.A0B(", 65p(d)=", d1o.ALH(j13, 65) / 1000));
                d1o.A04 = true;
                d1o.A00 = 0;
                sb.append(AnonymousClass000.A0B(", 90p(e)=", d1o.ALH(j13, 90) / 1000));
                sb.append(AnonymousClass000.A0B(", 65p(e)=", d1o.ALH(j13, 65) / 1000));
                d1o.A04 = z5;
                d1o.A00 = i8;
                d1n = this;
                d1n.A0S = sb.toString();
            } else {
                d1n = this;
                this.A0K = -1;
                this.A0L = -1;
                this.A0S = "";
            }
            if (!d1n.A0y) {
                C29603D1i d1i = this.A0v;
                if (d1i == null) {
                    j = -1;
                } else {
                    j = d1i.AGf().A06;
                }
                this.A0J = j;
                if (d1i == null) {
                    j2 = -1;
                } else {
                    j2 = d1i.AGm().A06;
                }
                this.A0I = j2;
            }
            this.A0f = d1b.A00;
            this.A0O = 0;
            this.A0W = null;
            this.A0X = null;
            this.A0C = -1;
            this.A0D = -1;
            this.A0E = -1;
            if (this.A0R == Constants.A0Y && i4 != -1) {
                this.A0R = C43721uy.A01(i4);
            }
        } finally {
            C200008hB.A00();
        }
    }

    public final void BSY(boolean z) {
        Integer num;
        this.A0s = z;
        this.A0N = this.A0x.ACp();
        D29 d29 = this.A10;
        if (d29 != null && (num = this.A0R) == Constants.A14 && this.A0i) {
            String str = this.A12;
            C43721uy.A02(num);
            d29.A00(new C29599D1e(str, System.currentTimeMillis()));
        }
    }

    public D1N(C29262Cuo cuo, long j, D29 d29, boolean z, String str, boolean z2, String str2, C29605D1k d1k, String str3, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, C29603D1i d1i, String str4) {
        this.A10 = d29;
        this.A0x = BME.A00;
        this.A12 = cuo.A04;
        this.A0z = j;
        this.A0f = z;
        this.A11 = str;
        this.A13 = z2;
        String str5 = cuo.A02;
        this.A0T = str5 == null ? "" : str5;
        this.A0U = cuo.A03;
        this.A0o = str2;
        this.A0w = d1k;
        this.A0p = str3;
        this.A0P = C43711ux.NOT_APPLY;
        this.A0R = num;
        this.A0t = z3;
        this.A0u = z4;
        this.A0h = z5;
        this.A0v = d1i;
        this.A0a = z6;
        this.A0b = z7;
        this.A0d = z8;
        this.A0y = z9;
        this.A0l = str4;
        this.A0n = cuo.A01.name();
    }
}
