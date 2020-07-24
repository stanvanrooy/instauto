package p000X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.facebook.react.views.slider.ReactSliderManager;

/* renamed from: X.A15 */
public final class A15 extends C48972Af {
    public double A00 = 0.0d;
    public double A01 = 0.0d;
    public double A02 = 0.0d;
    public double A03 = 0.0d;
    public double A04 = 0.0d;

    public A15(Context context) {
        super(context, (AttributeSet) null, ReactSliderManager.STYLE);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            super.setStateListAnimator((StateListAnimator) null);
        }
    }

    private void A00() {
        if (this.A03 == 0.0d) {
            this.A04 = (this.A00 - this.A01) / ((double) 128);
        }
        setMax(getTotalSteps());
        double d = this.A02;
        double d2 = this.A01;
        setProgress((int) Math.round(((d - d2) / (this.A00 - d2)) * ((double) getTotalSteps())));
    }

    private double getStepValue() {
        double d = this.A03;
        if (d <= 0.0d) {
            return this.A04;
        }
        return d;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.A00 - this.A01) / getStepValue());
    }

    public final void A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            super.setStateListAnimator((StateListAnimator) null);
        }
    }

    public void setMaxValue(double d) {
        this.A00 = d;
        A00();
    }

    public void setMinValue(double d) {
        this.A01 = d;
        A00();
    }

    public void setStep(double d) {
        this.A03 = d;
        A00();
    }

    public void setValue(double d) {
        this.A02 = d;
        double d2 = this.A01;
        setProgress((int) Math.round(((d - d2) / (this.A00 - d2)) * ((double) getTotalSteps())));
    }

    public final double A01(int i) {
        if (i == getMax()) {
            return this.A00;
        }
        return (((double) i) * getStepValue()) + this.A01;
    }
}
