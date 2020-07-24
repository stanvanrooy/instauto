package p000X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.D2U */
public final class D2U {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final Uri A0C;
    public final D5J A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public final long A00(int i) {
        long j;
        long j2;
        if (i == this.A0F.size() - 1) {
            j = this.A04;
            if (j == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            }
            j2 = j - ((C29685D4w) this.A0F.get(i)).A00;
        } else {
            j = ((C29685D4w) this.A0F.get(i + 1)).A00;
            j2 = j - ((C29685D4w) this.A0F.get(i)).A00;
        }
        return C29686D4x.A00(j2);
    }

    public final C29685D4w A01(int i) {
        return (C29685D4w) this.A0F.get(i);
    }

    public D2U(long j, long j2, boolean z, long j3, long j4, long j5, long j6, D5J d5j, Uri uri, List list, long j7, long j8, long j9, long j10, long j11, boolean z2, boolean z3, boolean z4, String str, int i, boolean z5) {
        this.A02 = j;
        this.A04 = j2;
        this.A0G = z;
        this.A07 = j3;
        this.A0B = j4;
        this.A0A = j5;
        this.A09 = j6;
        this.A0D = d5j;
        this.A0C = uri;
        this.A0F = list;
        this.A01 = j7;
        this.A05 = j8;
        this.A03 = j9;
        this.A06 = j10;
        this.A08 = j11;
        this.A0I = z2;
        this.A0H = z3;
        this.A0K = z4;
        this.A0J = z5;
        this.A0E = str;
        this.A00 = i;
    }
}
