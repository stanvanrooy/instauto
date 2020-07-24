package p000X;

import android.view.animation.Interpolator;

/* renamed from: X.1Zv  reason: invalid class name and case insensitive filesystem */
public final class C31761Zv {
    public static final C31761Zv A0C = new C31761Zv(2000, 30, 8000.0f, 1000.0f, C31771Zw.A00(1.0f, 0.25f, 1.0f, 0.25f));
    public static final C31761Zv A0D = new C31761Zv(4000, 1, 1200.0f, 2000.0f, C31771Zw.A00(1.0f, 1.0f, 1.0f, 1.0f));
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03 = 8000;
    public final long A04 = 2000;
    public final Interpolator A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;

    public C31761Zv(long j, int i, float f, float f2, Interpolator interpolator) {
        this.A02 = j;
        this.A0B = i;
        this.A07 = 8000.0f;
        this.A06 = 15000.0f;
        this.A0A = f;
        this.A09 = 22000.0f;
        this.A08 = f2;
        this.A00 = 270.0f;
        this.A01 = 500;
        this.A05 = interpolator;
    }
}
