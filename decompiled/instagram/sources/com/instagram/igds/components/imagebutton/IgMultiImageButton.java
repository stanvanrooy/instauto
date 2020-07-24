package com.instagram.igds.components.imagebutton;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.C31881aA;
import p000X.C37371jY;
import p000X.C71713Bw;
import p000X.C71723Bx;
import p000X.C71983Cy;

public class IgMultiImageButton extends IgImageButton implements Animator.AnimatorListener, C31881aA {
    public int A00;
    public C71983Cy A01;
    public boolean A02;
    public boolean A03;
    public final ValueAnimator A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final C71723Bx A06;

    public final void B3v() {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    private void A00() {
        C71983Cy r0 = this.A01;
        if (r0 != null) {
            r0.A00(this);
        }
        if (this.A04.isRunning()) {
            this.A04.end();
        }
    }

    public void setCoordinator(C71983Cy r2) {
        C71983Cy r0 = this.A01;
        if (r0 != null) {
            r0.A00(this);
        }
        this.A01 = r2;
    }

    public void setNumberedCheckBoxEnabled(boolean z) {
        this.A03 = z;
        invalidate();
    }

    public void setSelected(int i) {
        this.A00 = i;
        C71723Bx r3 = this.A06;
        r3.A00 = i;
        r3.invalidateSelf();
        boolean z = false;
        if (this.A00 > -1) {
            z = true;
        }
        r3.A01 = z;
        r3.invalidateSelf();
        invalidate();
    }

    public final void A07(ImageUrl imageUrl, boolean z) {
        AnonymousClass0a4.A06(imageUrl);
        A00();
        super.A07(imageUrl, z);
    }

    public final void A08(String str, int i) {
        AnonymousClass0a4.A06(str);
        A00();
        super.A08(str, i);
    }

    public final void B9O(C37371jY r1) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(616213253);
        super.onAttachedToWindow();
        this.A02 = true;
        this.A04.addUpdateListener(this.A05);
        this.A04.addListener(this);
        AnonymousClass0Z0.A0D(-337634269, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-528950392);
        super.onDetachedFromWindow();
        this.A02 = false;
        this.A04.removeAllUpdateListeners();
        this.A04.removeUpdateListener(this.A05);
        C71983Cy r0 = this.A01;
        if (r0 != null) {
            r0.A00(this);
        }
        if (this.A04.isRunning()) {
            this.A04.end();
        }
        AnonymousClass0Z0.A0D(-389131031, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03) {
            C71723Bx r0 = this.A06;
            int intrinsicWidth = r0.getIntrinsicWidth();
            int intrinsicHeight = r0.getIntrinsicHeight();
            float f = (float) r0.A02;
            this.A06.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            canvas.save();
            canvas.translate(((float) (canvas.getWidth() - intrinsicWidth)) - f, f);
            this.A06.draw(canvas);
            canvas.restore();
        }
    }

    public IgMultiImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgMultiImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgMultiImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
        this.A05 = new C71713Bw(this);
        this.A06 = new C71723Bx(context);
    }

    public void setUrl(ImageUrl imageUrl) {
        AnonymousClass0a4.A06(imageUrl);
        A00();
        super.setUrl(imageUrl);
    }

    public void setUrl(String str) {
        AnonymousClass0a4.A06(str);
        A00();
        super.setUrl(str);
    }
}
