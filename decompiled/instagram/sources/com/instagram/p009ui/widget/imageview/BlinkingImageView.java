package com.instagram.p009ui.widget.imageview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.ui.widget.imageview.BlinkingImageView */
public class BlinkingImageView extends ImageView implements ValueAnimator.AnimatorUpdateListener {
    public boolean A00;
    public final ValueAnimator A01;

    public void setBlinking(boolean z) {
        this.A00 = z;
        if (!z) {
            this.A01.cancel();
            setImageAlpha(255);
        } else if (!this.A01.isStarted()) {
            this.A01.start();
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        setImageAlpha(Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(1087184377);
        super.onAttachedToWindow();
        if (this.A00 && !this.A01.isStarted()) {
            this.A01.start();
        }
        AnonymousClass0Z0.A0D(355755839, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(1067989183);
        this.A01.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(-1428712358, A06);
    }

    public BlinkingImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BlinkingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlinkingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.2f}).setDuration(800);
        this.A01 = duration;
        duration.addUpdateListener(this);
        this.A01.setRepeatMode(2);
        this.A01.setRepeatCount(-1);
        this.A01.setInterpolator(new LinearInterpolator());
    }
}
