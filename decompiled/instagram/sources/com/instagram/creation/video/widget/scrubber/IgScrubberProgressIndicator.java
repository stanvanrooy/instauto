package com.instagram.creation.video.widget.scrubber;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass9GN;
import p000X.AnonymousClass9GO;

public class IgScrubberProgressIndicator extends MediaFrameLayout {
    public AnimatorSet A00;
    public boolean A01;
    public boolean A02;
    public final Runnable A03;

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(-746607842);
        super.onAttachedToWindow();
        this.A02 = true;
        if (getVisibility() == 0) {
            this.A01 = true;
            if (!this.A00.isStarted()) {
                this.A00.start();
            }
        }
        AnonymousClass0Z0.A0D(-1844312675, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(-1068222831);
        super.onDetachedFromWindow();
        this.A02 = false;
        this.A01 = false;
        AnonymousClass0Z0.A0D(-309377377, A06);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!this.A02) {
            return;
        }
        if (i == 0) {
            this.A01 = true;
            if (!this.A00.isStarted()) {
                this.A00.start();
                return;
            }
            return;
        }
        this.A01 = false;
    }

    public IgScrubberProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(r2, attributeSet, i);
        Context context2 = context;
        this.A01 = false;
        this.A02 = false;
        this.A03 = new AnonymousClass9GN(this);
        LayoutInflater.from(context2).inflate(C0003R.layout.view_ig_scrubber_progress_indicator, this);
        View findViewById = findViewById(C0003R.C0005id.dot1);
        View findViewById2 = findViewById(C0003R.C0005id.dot2);
        View findViewById3 = findViewById(C0003R.C0005id.dot3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "scaleX", new float[]{1.0f, 1.33f});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator clone = ofFloat.clone();
        clone.setPropertyName("scaleY");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, "scaleX", new float[]{1.33f, 1.0f});
        ofFloat2.setDuration(250);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator clone2 = ofFloat2.clone();
        clone2.setPropertyName("scaleY");
        ObjectAnimator clone3 = ofFloat.clone();
        ObjectAnimator clone4 = clone.clone();
        ObjectAnimator clone5 = ofFloat2.clone();
        ObjectAnimator clone6 = clone2.clone();
        clone3.setTarget(findViewById2);
        clone4.setTarget(findViewById2);
        clone5.setTarget(findViewById2);
        clone6.setTarget(findViewById2);
        ObjectAnimator clone7 = ofFloat.clone();
        ObjectAnimator clone8 = clone.clone();
        ObjectAnimator clone9 = ofFloat2.clone();
        ObjectAnimator clone10 = clone2.clone();
        clone7.setTarget(findViewById3);
        clone8.setTarget(findViewById3);
        clone9.setTarget(findViewById3);
        clone10.setTarget(findViewById3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.play(ofFloat).with(clone);
        this.A00.play(clone3).with(clone4).with(ofFloat2).with(clone2).after(ofFloat);
        this.A00.play(clone7).with(clone8).with(clone5).with(clone6).after(clone3);
        this.A00.play(clone9).with(clone10).after(clone7);
        this.A00.addListener(new AnonymousClass9GO(this));
    }
}
