package p000X;

import android.os.SystemClock;

/* renamed from: X.1yl  reason: invalid class name and case insensitive filesystem */
public final class C45901yl {
    public float A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public boolean A05;
    public final float A06;
    public final String A07;
    public final int A08;
    public final long A09;
    public final C37671k2 A0A;
    public final C45881yj A0B;
    public final String A0C;
    public final boolean A0D;

    public C45901yl(String str, C37671k2 r4, C45881yj r5, int i, float f, boolean z) {
        String str2;
        this.A0C = str;
        this.A0A = r4;
        this.A0B = r5;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A09 = elapsedRealtime;
        this.A01 = elapsedRealtime;
        this.A08 = i;
        this.A06 = f;
        this.A0D = z;
        if (z) {
            str2 = "autoplay";
        } else {
            str2 = "early_prepare";
        }
        this.A07 = str2;
    }
}
