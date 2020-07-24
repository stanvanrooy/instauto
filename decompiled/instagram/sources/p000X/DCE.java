package p000X;

import com.google.android.exoplayer2.Format;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DCE */
public final class DCE implements C29623D2f {
    public static final DC7 A0H = new DC7((String) null, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false);
    public D9a A00;
    public DCF A01;
    public boolean A02;
    public Format[] A03;
    public final DCK A04;
    public final D29 A05;
    public final BME A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final DCJ A0F = new DCJ(this);
    public final DCG A0G;

    public final synchronized void A01(Integer num) {
        DCF dcf;
        if (this.A0E && (dcf = this.A01) != null) {
            dcf.A01(num, "", "", this.A0A);
        }
    }

    public DCE(String str, long j, BME bme, D29 d29, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        this.A09 = str;
        this.A06 = bme;
        this.A05 = d29;
        this.A0B = z;
        this.A08 = "missing";
        this.A0C = z2;
        this.A0D = z3;
        this.A0G = new DCG(this, bme);
        this.A04 = new DCK(this);
        long j2 = j;
        boolean z6 = z5;
        this.A00 = new D9a(str, j2, this.A05, z, z6);
        this.A07 = str2;
        this.A0E = z4;
        this.A0A = z6;
    }

    public static int A00(long j) {
        if (j < 0) {
            return -1;
        }
        return (int) (j / 1000);
    }

    public final void A2Z(D2b d2b) {
        D9W d9w = this.A00.A01;
        if (d9w != null) {
            d9w.A0F.add(d2b);
        }
    }

    public final void A38(long j, long j2, int i, long j3, long j4, String str) {
        String str2 = str;
        D9W d9w = this.A00.A01;
        if (d9w != null) {
            if (str == null || str2.isEmpty()) {
                str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            long j5 = j2;
            d9w.A01.put(str2, new C29788D9x(j, j5, i, j3, j4));
        }
    }

    public final void ADA(Format format) {
        D5Q d5q;
        Format format2;
        C29788D9x d9x;
        long j;
        int i;
        C29788D9x d9x2;
        D9a d9a = this.A00;
        D9W d9w = d9a.A01;
        if (d9w != null) {
            D9V.A01(format, d9w, d9a.A05, d9a.A06, d9a.A09, d9a.A07, d9a.A04, d9a.A08, false, d9a.A03, d9a.A00);
            D9W d9w2 = d9a.A01;
            if (d9w2 == null || (format2 = d9w2.A00) == null) {
                d5q = null;
            } else {
                String str = format2.A0P;
                if (str == null || str.isEmpty()) {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                if (d9w2.A01.containsKey(str)) {
                    d9x = (C29788D9x) d9w2.A01.get(str);
                } else {
                    d9x = null;
                }
                if (d9x != null) {
                    j = d9x.A02;
                    i = d9x.A00;
                } else {
                    j = -1;
                    i = -1;
                }
                D9W d9w3 = d9a.A01;
                if (!(format2 == null || (d9x2 = (C29788D9x) d9w3.A01.get(format2.A0P)) == null)) {
                    StringBuilder sb = new StringBuilder();
                    D9W.A00(sb, format2.A0P, d9x2);
                    sb.toString();
                }
                d9a.A01.A01();
                d9a.A01.A02();
                d5q = new D5Q(j, i);
            }
            d9a.A02 = d5q;
            d9a.A01 = null;
        }
    }

    public final void BpR(long j, long j2, long j3, long j4, Format format, Format[] formatArr, Format format2, Format format3, int i, int i2, List list, String str, String str2, boolean z) {
        long j5 = j3;
        long j6 = j;
        long j7 = j2;
        List list2 = list;
        int i3 = i2;
        int i4 = i;
        Format format4 = format3;
        this.A00.A01 = new D9W(j6, j7, j5, j4, format, formatArr, format2, format4, i4, i3, list2, str, str2, z);
    }

    public final void BsS(int i) {
        this.A00.A00 = i;
    }

    public final void BsU(boolean z) {
        this.A00.A03 = z;
    }

    public final D9a AFF() {
        return this.A00;
    }

    public final C29646D3d ASI() {
        return this.A0F;
    }

    public final D19 AYz() {
        return this.A0G;
    }

    public final void BZH(int i, long j, Format format, Format format2, long j2, long j3, Format[] formatArr, String str, String str2, int i2, Format format3, C29605D1k d1k) {
        DCE dce;
        Format[] formatArr2 = formatArr;
        long j4 = j3;
        long j5 = j2;
        Format format4 = format2;
        long j6 = j;
        Format format5 = format3;
        int i3 = i2;
        String str3 = str2;
        String str4 = str;
        Format format6 = format;
        if (format == null) {
            long j7 = j6;
            long j8 = j5;
            long j9 = j4;
            synchronized (this) {
                if (this.A0E && this.A03 == null) {
                    this.A03 = formatArr2;
                    DCF dcf = new DCF(this, d1k);
                    this.A01 = dcf;
                    dcf.A00(format4, j7, j8, format5, i3, j9);
                    this.A01.A01(Constants.A0j, str4, str3, this.A0A);
                }
            }
        }
        if (format == null || format6 == format4) {
            dce = this;
        } else {
            dce = this;
            synchronized (dce) {
                if (dce.A0E) {
                    if (dce.A03 == null) {
                        dce.A03 = formatArr2;
                    }
                    DCK dck = dce.A04;
                    if (dck.A08) {
                        dck.A00();
                    }
                    DCM dcm = dck.A09;
                    int i4 = dcm.A01;
                    ArrayList arrayList = new ArrayList(i4);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (i5 < 0 || i5 >= i4) {
                            throw new IllegalStateException("Index out of bound");
                        }
                        Object[] objArr = dcm.A02;
                        arrayList.add(objArr[(i5 + dcm.A00) % objArr.length]);
                    }
                    dcm.A00 = 0;
                    dcm.A01 = 0;
                    dck.A07 = arrayList;
                    dck.A08 = true;
                    dck.A06 = format6;
                    dck.A05 = format4;
                    DCE dce2 = dck.A0A;
                    dce2.A03 = formatArr2;
                    long ACp = dce2.A06.ACp();
                    dck.A04 = ACp;
                    if (dce2.A02) {
                        dck.A03 = ACp;
                        dck.A02 = ACp;
                        dck.A01 = 0;
                    } else if (arrayList.size() > 0) {
                        arrayList.get(0);
                    }
                    DCF dcf2 = dce.A01;
                    if (dcf2 != null) {
                        dcf2.A01(Constants.A0N, str4, str3, dce.A0A);
                        dce.A01.A00(format4, j6, j5, format5, i3, j4);
                    }
                }
            }
        }
        D9W d9w = dce.A00.A01;
        if (d9w != null) {
            d9w.A00 = format4;
        }
    }
}
