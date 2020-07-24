package com.instagram.music.common.p019ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass84M;
import p000X.C06390Ow;

/* renamed from: com.instagram.music.common.ui.LoadingSpinnerView */
public class LoadingSpinnerView extends ColorFilterAlphaImageView {
    public ObjectAnimator A00;
    public boolean A01 = true;
    public boolean A02;

    private void A00() {
        setScaleType(ImageView.ScaleType.CENTER);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f}).setDuration(850);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        this.A00.setInterpolator(new LinearInterpolator());
    }

    private void setBackgroundDrawableInternal(int i) {
        Drawable A002 = C06390Ow.A00(getContext(), i);
        A002.mutate().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        setBackground(A002);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(340399246);
        super.onAttachedToWindow();
        if (isShown() && this.A01) {
            this.A00.start();
        }
        AnonymousClass0Z0.A0D(-380273420, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(-1937689460);
        this.A02 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(1221064863, A06);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 && this.A01) {
            this.A00.start();
            this.A02 = false;
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0 || !this.A01) {
            this.A00.cancel();
            this.A02 = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.A00.start();
            } else {
                this.A02 = true;
            }
        }
    }

    public void setLoadingStatus(AnonymousClass84M r3) {
        switch (r3.ordinal()) {
            case 0:
                this.A01 = true;
                this.A00.start();
                setBackgroundDrawableInternal(C0003R.C0004drawable.spinner_large);
                setVisibility(0);
                return;
            case 1:
                setVisibility(8);
                return;
            default:
                return;
        }
    }

    public LoadingSpinnerView(Context context) {
        super(context);
        A00();
    }

    public LoadingSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public LoadingSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
