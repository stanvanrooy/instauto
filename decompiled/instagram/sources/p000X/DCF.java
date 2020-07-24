package p000X;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;

/* renamed from: X.DCF */
public final class DCF {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = Integer.MAX_VALUE;
    public int A05 = Integer.MAX_VALUE;
    public int A06 = Integer.MAX_VALUE;
    public int A07 = Integer.MAX_VALUE;
    public int A08 = 0;
    public int A09 = 0;
    public int A0A = 0;
    public int A0B = 0;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H = 0;
    public int A0I = 0;
    public long A0J = 0;
    public long A0K = Long.MAX_VALUE;
    public long A0L;
    public long A0M = 0;
    public long A0N = 0;
    public long A0O = 0;
    public long A0P = 0;
    public long A0Q = 0;
    public Format A0R;
    public Format A0S;
    public Format A0T;
    public Format A0U;
    public String A0V = null;
    public int A0W;
    public int A0X = 0;
    public long A0Y;
    public long A0Z;
    public long A0a;
    public DCN A0b;
    public final ArrayList A0c = new ArrayList(2);
    public final C29605D1k A0d;
    public final /* synthetic */ DCE A0e;

    public DCF(DCE dce, C29605D1k d1k) {
        this.A0e = dce;
        this.A0d = d1k;
    }

    public final void A00(Format format, long j, long j2, Format format2, int i, long j3) {
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        Format[] formatArr;
        int length;
        Format format3;
        this.A0Z = this.A0e.A06.ACp();
        this.A0a = j;
        this.A0Y = j2;
        C25945Bcx A002 = C25945Bcx.A00();
        C29605D1k d1k = this.A0d;
        if (d1k != null) {
            j4 = d1k.AGl();
        } else {
            j4 = -1;
        }
        synchronized (A002) {
            j5 = A002.A01;
        }
        synchronized (A002) {
            j6 = A002.A02;
        }
        if (j6 > 0) {
            j7 = A002.A02.ACp() - j6;
        } else {
            j7 = -1;
        }
        synchronized (A002) {
            j8 = A002.A00;
        }
        this.A0b = new DCN(j4, j5, j7, j8, j3);
        Format format4 = format;
        this.A0R = format4;
        this.A0T = format2;
        this.A0W = i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            formatArr = this.A0e.A03;
            length = formatArr.length;
            if (i3 >= length) {
                break;
            } else if (formatArr[i3].A0Q.equals(format4.A0Q)) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        Format format5 = null;
        if (i2 > 0) {
            format3 = formatArr[i2 - 1];
        } else {
            format3 = null;
        }
        this.A0S = format3;
        if (i2 < length - 1) {
            format5 = formatArr[i2 + 1];
        }
        this.A0U = format5;
    }

    public final void A01(Integer num, String str, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        DC7 dc7;
        DC7 dc72;
        int i;
        int i2;
        Integer num2 = num;
        if (num2 != Constants.A0N || this.A0B != 0) {
            DCE dce = this.A0e;
            if (dce.A05 != null) {
                int i3 = this.A09;
                if (i3 > 0) {
                    j = this.A0N / ((long) i3);
                } else {
                    j = 0;
                }
                if (i3 > 0) {
                    j2 = this.A0Q / ((long) i3);
                } else {
                    j2 = 0;
                }
                int i4 = (int) j2;
                if (i3 > 0) {
                    j3 = this.A0O / ((long) i3);
                } else {
                    j3 = 0;
                }
                int i5 = (int) j3;
                if (i3 > 0) {
                    j4 = this.A0M / ((long) i3);
                } else {
                    j4 = 0;
                }
                int i6 = (int) j4;
                if (i3 > 0) {
                    j5 = this.A0P / ((long) i3);
                } else {
                    j5 = 0;
                }
                int i7 = (int) j5;
                if (dce.A02) {
                    long ACp = dce.A06.ACp();
                    this.A0I += (int) (ACp - this.A0L);
                    this.A0L = ACp;
                }
                if (this.A0c.isEmpty()) {
                    dc7 = DCE.A0H;
                } else {
                    dc7 = (DC7) this.A0c.get(0);
                }
                if (this.A0c.size() < 2) {
                    dc72 = DCE.A0H;
                } else {
                    dc72 = (DC7) this.A0c.get(1);
                }
                DCE dce2 = this.A0e;
                boolean z2 = dce2.A0B;
                String str3 = dce2.A09;
                String str4 = this.A0V;
                String A002 = C29611D1q.A00(num2);
                Format format = this.A0R;
                String str5 = format.A0Q;
                int i8 = format.A04;
                String str6 = format.A0P;
                Format[] formatArr = dce2.A03;
                int length = formatArr.length;
                Format format2 = formatArr[0];
                int i9 = format2.A04;
                Format format3 = this.A0T;
                if (format3 != null) {
                    i = format3.A04;
                } else {
                    i = i9;
                }
                Format format4 = formatArr[length - 1];
                int i10 = format4.A04;
                String str7 = format2.A0P;
                String str8 = format4.A0P;
                int i11 = this.A0W;
                if (i11 == Integer.MAX_VALUE) {
                    i11 = 0;
                }
                int i12 = format.A0F;
                int i13 = format.A08;
                int i14 = this.A0I;
                int i15 = this.A0X;
                int i16 = this.A0B;
                int i17 = this.A0A;
                int i18 = this.A08;
                int i19 = this.A0E;
                int i20 = this.A0G;
                int i21 = this.A0F;
                int i22 = this.A0D;
                int i23 = this.A0H;
                int i24 = this.A0C;
                int i25 = this.A03;
                int i26 = this.A07;
                if (i26 == Integer.MAX_VALUE) {
                    i26 = 0;
                }
                long j6 = this.A0J;
                long j7 = this.A0K;
                if (j7 == Long.MAX_VALUE) {
                    j7 = 0;
                }
                int i27 = this.A01;
                int i28 = this.A05;
                if (i28 == Integer.MAX_VALUE) {
                    i28 = 0;
                }
                int i29 = this.A00;
                int i30 = this.A04;
                if (i30 == Integer.MAX_VALUE) {
                    i30 = 0;
                }
                int i31 = this.A02;
                int i32 = this.A06;
                if (i32 == Integer.MAX_VALUE) {
                    i32 = 0;
                }
                int i33 = dc7.A03;
                int i34 = dc7.A00;
                int i35 = dc7.A02;
                boolean z3 = dc7.A09;
                int i36 = dc72.A03;
                int i37 = dc72.A00;
                int i38 = dc72.A02;
                boolean z4 = dc72.A09;
                long j8 = this.A0Z;
                int A003 = DCE.A00(this.A0a);
                int A004 = DCE.A00(this.A0Y);
                DCN dcn = this.A0b;
                int A005 = DCE.A00(dcn.A00);
                int A006 = DCE.A00(dcn.A02);
                long j9 = dcn.A04;
                if (j9 < 0 || j9 > 2147483647L) {
                    i2 = -1;
                } else {
                    i2 = (int) j9;
                }
                int A007 = DCE.A00(dcn.A03);
                int A008 = DCE.A00(dcn.A01);
                String str9 = dce2.A08;
                int i39 = length;
                int i40 = i11;
                int i41 = i26;
                long j10 = j6;
                long j11 = j7;
                long j12 = j;
                int i42 = i28;
                int i43 = i30;
                int i44 = i32;
                int i45 = i37;
                int i46 = i38;
                boolean z5 = z4;
                long j13 = j8;
                int i47 = i2;
                String str10 = str9;
                boolean z6 = z2;
                String str11 = str3;
                String str12 = str4;
                String str13 = str5;
                int i48 = i8;
                dce2.A05.A00(new C50992Ir(z6, str11, str12, A002, str13, i48, str6, i39, i9, i, i10, str7, str8, i40, (String) null, 0, (String) null, 0, 0, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, 0, i25, i41, i4, j10, j11, j12, i27, i42, i5, i29, i43, i6, i31, i44, i7, i33, i34, i35, z3, i36, i45, i46, z5, j13, A003, A004, A005, A006, i47, A007, A008, str10, str, str2, dce2.A0C, dce2.A0D, dce2.A07, z));
            }
            this.A0V = null;
            this.A0I = 0;
            this.A0X += this.A0B;
            this.A0B = 0;
            this.A0A = 0;
            this.A08 = 0;
            this.A0E = 0;
            this.A0G = 0;
            this.A0F = 0;
            this.A0D = 0;
            this.A0H = 0;
            this.A0C = 0;
            this.A03 = 0;
            this.A07 = Integer.MAX_VALUE;
            this.A0J = 0;
            this.A0K = Long.MAX_VALUE;
            this.A01 = 0;
            this.A05 = Integer.MAX_VALUE;
            this.A00 = 0;
            this.A04 = Integer.MAX_VALUE;
            this.A02 = 0;
            this.A06 = Integer.MAX_VALUE;
            this.A09 = 0;
            this.A0Q = 0;
            this.A0N = 0;
            this.A0O = 0;
            this.A0M = 0;
            this.A0P = 0;
        }
    }
}
