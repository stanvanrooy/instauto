package p000X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.20t  reason: invalid class name and case insensitive filesystem */
public final class C467620t implements C36851ii {
    public int A00 = -1;
    public float A01;
    public float A02;
    public AnimatorSet A03;
    public ValueAnimator A04;
    public ValueAnimator A05;
    public Integer A06 = Constants.ZERO;
    public final Animator.AnimatorListener A07 = new C467720u(this);
    public final ValueAnimator.AnimatorUpdateListener A08 = new C467820v(this);
    public final ValueAnimator.AnimatorUpdateListener A09 = new C467920w(this);

    public final int getPosition() {
        boolean z = false;
        if (this.A00 >= 0) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "Position is not set.");
        return this.A00;
    }

    public C467620t(long j, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        this.A04 = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.A04.addUpdateListener(this.A08);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        this.A05 = ofFloat2;
        ofFloat2.addUpdateListener(this.A09);
        this.A03 = new AnimatorSet();
        this.A04.setDuration(j);
        this.A05.setDuration(j);
        if (z) {
            this.A03.playSequentially(new Animator[]{this.A04, this.A05});
        } else {
            this.A03.playTogether(new Animator[]{this.A04, this.A05});
        }
        this.A03.addListener(this.A07);
    }

    public final void Bja(int i) {
        C12670hC.A02();
        this.A00 = i;
    }
}
