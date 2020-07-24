package p000X;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.D61 */
public final class D61 implements D7Y, C29805DAp {
    public final int A00;
    public final /* synthetic */ C29709D5v A01;

    public D61(C29709D5v d5v, int i) {
        this.A01 = d5v;
        this.A00 = i;
    }

    public final long AOT() {
        return this.A01.A0G[this.A00].A07();
    }

    public final int AYr() {
        TrackGroupArray trackGroupArray = this.A01.A08;
        return C29735D6z.A01(trackGroupArray.A02[this.A00].A02[0].A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (p000X.C29709D5v.A04(r3) != false) goto L_0x000f;
     */
    public final boolean AhB() {
        boolean z;
        C29709D5v d5v = this.A01;
        int i = this.A00;
        if (!d5v.A0B) {
            z = false;
        }
        z = true;
        if (z) {
            return false;
        }
        if (d5v.A0A || d5v.A0G[i].A0B.A03()) {
            return true;
        }
        return false;
    }

    public final void Ap0() {
        C29709D5v d5v = this.A01;
        d5v.A0T.A01(d5v.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (p000X.C29709D5v.A04(r4) != false) goto L_0x000f;
     */
    public final int BYz(D8z d8z, C29717D6d d6d, boolean z) {
        boolean z2;
        Format format;
        C29709D5v d5v = this.A01;
        int i = this.A00;
        if (!d5v.A0B) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            return -3;
        }
        D8z d8z2 = d8z;
        int A06 = d5v.A0G[i].A06(d8z2, d6d, z, d5v.A0A, d5v.A04);
        if (A06 == -4) {
            C29716D6c d6c = d5v.A0G[i].A0B;
            if (!d6c.A03()) {
                format = d6c.A07;
            } else {
                format = d6c.A0F[C29716D6c.A00(d6c, d6c.A03)];
            }
            C29709D5v.A03(d5v, i, format);
            return A06;
        } else if (A06 != -3) {
            return A06;
        } else {
            C29709D5v.A02(d5v, i);
            return A06;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (p000X.C29709D5v.A04(r4) != false) goto L_0x000f;
     */
    public final int Bor(long j) {
        boolean z;
        Format format;
        C29709D5v d5v = this.A01;
        int i = this.A00;
        if (!d5v.A0B) {
            z = false;
        }
        z = true;
        int i2 = 0;
        if (!z) {
            C29715D6b d6b = d5v.A0G[i];
            if (!d5v.A0A || j <= d6b.A07()) {
                int A05 = d6b.A05(j, true);
                if (A05 != -1) {
                    i2 = A05;
                }
            } else {
                i2 = d6b.A04();
            }
            if (i2 > 0) {
                C29716D6c d6c = d6b.A0B;
                if (!d6c.A03()) {
                    format = d6c.A07;
                } else {
                    format = d6c.A0F[C29716D6c.A00(d6c, d6c.A03)];
                }
                C29709D5v.A03(d5v, i, format);
            } else {
                C29709D5v.A02(d5v, i);
                return i2;
            }
        }
        return i2;
    }
}
