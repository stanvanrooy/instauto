package com.instagram.p009ui.widget.spinner;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass7I0;
import p000X.C168617Hz;

/* renamed from: com.instagram.ui.widget.spinner.SpinnerImageView */
public class SpinnerImageView extends ColorFilterAlphaImageView {
    public ObjectAnimator A00;
    public boolean A01;
    public boolean A02 = true;

    private void A01() {
        setScaleType(ImageView.ScaleType.CENTER);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f}).setDuration(850);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        this.A00.setInterpolator(new LinearInterpolator());
    }

    public void setLoadingStatus(C168617Hz r4) {
        int i;
        int i2 = AnonymousClass7I0.A00[r4.ordinal()];
        if (i2 == 1) {
            this.A02 = true;
            this.A00.start();
            i = C0003R.C0004drawable.spinner_large;
        } else if (i2 == 2) {
            this.A02 = false;
            this.A00.end();
            i = C0003R.C0004drawable.loadmore_icon_refresh_compound;
        } else if (i2 == 3) {
            setVisibility(4);
            return;
        } else if (i2 == 4) {
            setVisibility(8);
            return;
        } else {
            return;
        }
        setBackgroundResource(i);
        setVisibility(0);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(-529678929);
        super.onAttachedToWindow();
        if (isShown() && this.A02) {
            this.A00.start();
        }
        AnonymousClass0Z0.A0D(249481618, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(-2004292350);
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(-2075401652, A06);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 && this.A02) {
            this.A00.start();
            this.A01 = false;
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0 || !this.A02) {
            this.A00.cancel();
            this.A01 = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.A00.start();
            } else {
                this.A01 = true;
            }
        }
    }

    public SpinnerImageView(Context context) {
        super(context);
        A01();
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
