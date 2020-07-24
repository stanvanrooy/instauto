package p000X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DCT */
public abstract class DCT extends ValueAnimator {
    public float A00 = 1.0f;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A02 = 1.667E7f;
    public float A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A04 = 1.667E7f;
    public float A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A06 = 1;
    public long A07 = 0;
    public TimeInterpolator A08;
    public boolean A09 = false;
    public int A0A = 1;
    public final float A0B;
    public final Set A0C = new CopyOnWriteArraySet();
    public final Set A0D = new CopyOnWriteArraySet();
    public volatile boolean A0E = false;

    public void A00() {
        DCS dcs = (DCS) this;
        if (DCS.A00 == null) {
            DCS.A00 = Choreographer.getInstance();
        }
        DCS.A00.removeFrameCallback(dcs);
    }

    public void A01() {
        DCS dcs = (DCS) this;
        if (DCS.A00 == null) {
            DCS.A00 = Choreographer.getInstance();
        }
        DCS.A00.postFrameCallback(dcs);
    }

    public final void setRepeatCount(int i) {
        int max = Math.max(i, 1);
        this.A0A = max;
        this.A06 = max;
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.A0C.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.add(animatorUpdateListener);
    }

    public final void end() {
        if (this.A0E) {
            this.A06 = 0;
            this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A07 = 0;
            this.A04 = 1.667E7f;
            this.A02 = 1.667E7f;
            this.A0E = false;
            A00();
            for (Animator.AnimatorListener onAnimationEnd : this.A0C) {
                onAnimationEnd.onAnimationEnd(this);
            }
        }
    }

    public final void pause() {
        if (this.A0E) {
            this.A07 *= -1;
            this.A0E = false;
            A00();
            for (Animator.AnimatorListener onAnimationEnd : this.A0C) {
                onAnimationEnd.onAnimationEnd(this);
            }
        }
    }

    public final void removeAllListeners() {
        this.A0C.clear();
    }

    public final void removeAllUpdateListeners() {
        this.A0D.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.A0C.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.remove(animatorUpdateListener);
    }

    public final void setCurrentFraction(float f) {
        this.A01 = f;
        this.A03 = f;
    }

    public final void start() {
        if (!this.A0E && this.A0B != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (this.A06 == 0) {
                this.A06 = this.A0A;
                setCurrentFraction(this.A05);
            }
            this.A0E = true;
            for (Animator.AnimatorListener onAnimationStart : this.A0C) {
                onAnimationStart.onAnimationStart(this);
            }
            A01();
        }
    }

    public DCT(float f) {
        this.A0B = f;
        this.A08 = new LinearInterpolator();
    }

    public final float getAnimatedFraction() {
        return this.A01;
    }

    public final boolean isRunning() {
        return this.A0E;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.A08 = timeInterpolator;
    }
}
