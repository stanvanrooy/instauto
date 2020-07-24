package p000X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.D1M */
public final class D1M {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final D1P A05;
    public final String A06;
    public final byte[] A07;

    public final D1M A00(long j) {
        long j2 = this.A02;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        if (j == 0 && j2 == j3) {
            return this;
        }
        Uri uri = this.A04;
        byte[] bArr = this.A07;
        String str = this.A06;
        int i = this.A00;
        D1P d1p = this.A05;
        String str2 = d1p.A0C;
        long j4 = d1p.A06;
        boolean z = d1p.A0F;
        int i2 = d1p.A04;
        int i3 = d1p.A03;
        int i4 = d1p.A00;
        int i5 = d1p.A05;
        boolean z2 = d1p.A0H;
        boolean z3 = d1p.A0E;
        int i6 = d1p.A02;
        long j5 = d1p.A08;
        D1B d1b = d1p.A0B;
        long j6 = d1p.A0A;
        boolean z4 = d1p.A0G;
        long j7 = d1p.A09;
        long j8 = d1p.A07;
        int i7 = d1p.A01;
        String str3 = str2;
        long j9 = j4;
        long j10 = j5;
        return new D1M(uri, bArr, this.A01 + j, this.A03 + j, j3, str, i, new D1P(str3, j9, z, i2, i3, i4, i5, z2, z3, i6, j10, d1b, j6, z4, j7, j8, i7, d1p.A0D));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.A04.toString());
        sb.append(", ");
        sb.append(Arrays.toString(this.A07));
        sb.append(", ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(this.A06);
        sb.append(", ");
        sb.append(this.A00);
        sb.append(", ");
        D1P d1p = this.A05;
        sb.append(d1p.toString());
        sb.append(", ");
        Map map = d1p.A0D;
        if (map != null) {
            str = map.toString();
        } else {
            str = "{}";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public D1M(Uri uri, int i, int i2) {
        this(uri, (byte[]) null, 0, 0, -1, (String) null, 3, new D1P("", -1, false, -1, -1, -1, -1, false, false, i2, -1, new D1B(false), -1, false, -1, -1, -1, (Map) null));
    }

    public D1M(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i, D1P d1p) {
        this.A04 = uri;
        this.A07 = bArr;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A06 = str;
        this.A00 = i;
        this.A05 = d1p;
    }
}
