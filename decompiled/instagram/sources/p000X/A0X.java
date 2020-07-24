package p000X;

import android.view.animation.Interpolator;

/* renamed from: X.A0X */
public final class A0X implements Interpolator {
    public final float A00;

    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.A00;
        return (float) ((pow * Math.sin(((((double) (f - (f2 / 4.0f))) * 3.141592653589793d) * 2.0d) / ((double) f2))) + 1.0d);
    }

    public A0X() {
        this.A00 = 0.5f;
    }

    public A0X(float f) {
        this.A00 = f;
    }
}
