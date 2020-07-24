package com.instagram.p009ui.widget.volume;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p000X.AnonymousClass0Z0;
import p000X.C66842w8;

/* renamed from: com.instagram.ui.widget.volume.VolumeIndicator */
public class VolumeIndicator extends ProgressBar {
    public Runnable A00;

    public final void A00(int i, int i2) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        setMax(i2);
        if (!(getVisibility() == 0 && getAlpha() == 1.0f)) {
            setVisibility(0);
            animate().setDuration(200).setListener((Animator.AnimatorListener) null).alpha(1.0f);
        }
        setProgress(i);
        if (this.A00 == null) {
            this.A00 = new C66842w8(this);
        }
        postDelayed(this.A00, 2000);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(-582349776);
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.A00 = null;
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(614533106, A06);
    }

    public VolumeIndicator(Context context) {
        super(context);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VolumeIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
