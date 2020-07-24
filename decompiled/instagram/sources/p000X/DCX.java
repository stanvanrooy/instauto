package p000X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DCX */
public abstract class DCX extends ValueAnimator {
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
    public final C29840DDb A0B;
    public final Set A0C;
    public final Set A0D;

    public void A00() {
        C29816DCa dCa = (C29816DCa) this;
        if (C29816DCa.A00 == null) {
            C29816DCa.A00 = Choreographer.getInstance();
        }
        C29816DCa.A00.removeFrameCallback(dCa);
    }

    public void A01() {
        C29816DCa dCa = (C29816DCa) this;
        if (C29816DCa.A00 == null) {
            C29816DCa.A00 = Choreographer.getInstance();
        }
        C29816DCa.A00.postFrameCallback(dCa);
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
        C29840DDb dDb = this.A0B;
        if (dDb.A01 == 1) {
            this.A06 = 0;
            this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A07 = 0;
            this.A04 = 1.667E7f;
            this.A02 = 1.667E7f;
            dDb.A02(0);
            A00();
            for (Animator.AnimatorListener onAnimationEnd : this.A0C) {
                onAnimationEnd.onAnimationEnd(this);
            }
        }
    }

    public final boolean isRunning() {
        if (this.A0B.A01 != 1) {
            return false;
        }
        return true;
    }

    public final void pause() {
        C29840DDb dDb = this.A0B;
        if (dDb.A01 == 1) {
            this.A07 *= -1;
            dDb.A02(2);
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
        C29840DDb dDb = this.A0B;
        if (dDb.A01 != 1 && dDb.A0D.A00 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (this.A06 == 0) {
                this.A06 = this.A0A;
                setCurrentFraction(this.A05);
            }
            dDb.A02(1);
            for (Animator.AnimatorListener onAnimationStart : this.A0C) {
                onAnimationStart.onAnimationStart(this);
            }
            A01();
        }
    }

    public DCX(C29840DDb dDb) {
        this.A0B = dDb;
        this.A0C = new CopyOnWriteArraySet();
        this.A0D = new CopyOnWriteArraySet();
        this.A08 = new LinearInterpolator();
    }

    public final float getAnimatedFraction() {
        return this.A01;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.A08 = timeInterpolator;
    }
}
