package p000X;

import android.opengl.GLES20;

/* renamed from: X.DO8 */
public final class DO8 {
    public static final DO8 A06 = new DO8(1, 1, 32779, 1, 1, 32779);
    public static final DO8 A07 = new DO8(1, 771, 32776, 1, 771, 32776);
    public static final DO8 A08 = new DO8(1, 771, 32774, 1, 771, 32774);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    public final void A00() {
        GLES20.glBlendFuncSeparate(this.A05, this.A03, this.A02, this.A00);
        GLES20.glBlendEquationSeparate(this.A04, this.A01);
    }

    public DO8(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A00 = i5;
        this.A01 = i6;
    }
}
