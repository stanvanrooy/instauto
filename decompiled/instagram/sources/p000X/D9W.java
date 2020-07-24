package p000X;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.D9W */
public final class D9W {
    public Format A00;
    public Map A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final Format A08;
    public final Format A09;
    public final String A0A;
    public final boolean A0B;
    public final Format[] A0C;
    public final Format A0D;
    public final String A0E;
    public final ArrayList A0F = new ArrayList();
    public final List A0G;

    public static void A00(StringBuilder sb, String str, C29788D9x d9x) {
        sb.append(str + ":[" + d9x.A01 + "-" + d9x.A02 + "-" + d9x.A04 + "-" + d9x.A03 + "];");
    }

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        for (D32 d32 : this.A0G) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(d32.A00);
        }
        return sb.toString();
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            D2b d2b = (D2b) it.next();
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(d2b.A00);
        }
        return sb.toString();
    }

    public D9W(long j, long j2, long j3, long j4, Format format, Format[] formatArr, Format format2, Format format3, int i, int i2, List list, String str, String str2, boolean z) {
        this.A05 = j / 1000;
        this.A04 = j2 / 1000;
        this.A06 = j4 / 1000;
        this.A07 = j3 / 1000;
        this.A08 = format;
        this.A0C = formatArr;
        this.A09 = format2;
        this.A0D = format3;
        this.A02 = i;
        this.A0G = list;
        this.A03 = i2;
        this.A0E = str;
        this.A0A = str2;
        this.A0B = z;
        this.A01 = new HashMap();
    }
}
