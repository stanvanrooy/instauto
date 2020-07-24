package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000X.AnonymousClass0Z0;
import p000X.C28541Cih;
import p000X.C28542Cii;
import p000X.C28543Cij;
import p000X.C28544Cik;
import p000X.C28545Cil;
import p000X.C28547Cin;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public final Paint A01 = new Paint();
    public final C28541Cih A02 = new C28541Cih();

    private void A00(Context context, AttributeSet attributeSet) {
        C28542Cii cil;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A03(new C28545Cil().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C28547Cin.A00, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) {
                cil = new C28545Cil();
            } else {
                cil = new C28544Cik();
            }
            cil.A00(obtainStyledAttributes);
            A03(cil.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    public final void A01() {
        boolean z;
        C28541Cih cih = this.A02;
        ValueAnimator valueAnimator = cih.A00;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                boolean isStarted = valueAnimator.isStarted();
                z = true;
            }
            z = false;
            if (!z && cih.getCallback() != null) {
                cih.A00.start();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    public final void A02() {
        boolean z;
        C28541Cih cih = this.A02;
        ValueAnimator valueAnimator = cih.A00;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                boolean isStarted = valueAnimator.isStarted();
                z = true;
            }
            z = false;
            if (z) {
                cih.A00.cancel();
            }
        }
    }

    public final void A03(C28543Cij cij) {
        boolean z;
        PorterDuff.Mode mode;
        C28541Cih cih = this.A02;
        cih.A01 = cij;
        if (cij != null) {
            Paint paint = cih.A03;
            if (cij.A0G) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        C28541Cih.A00(cih);
        if (cih.A01 != null) {
            ValueAnimator valueAnimator = cih.A00;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                cih.A00.cancel();
                cih.A00.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C28543Cij cij2 = cih.A01;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (cij2.A0E / cij2.A0D)) + 1.0f});
            cih.A00 = ofFloat;
            ofFloat.setRepeatMode(cih.A01.A0B);
            cih.A00.setStartDelay(cih.A01.A0F);
            cih.A00.setRepeatCount(cih.A01.A0A);
            ValueAnimator valueAnimator2 = cih.A00;
            C28543Cij cij3 = cih.A01;
            valueAnimator2.setDuration(cij3.A0D + cij3.A0E);
            cih.A00.addUpdateListener(cih.A02);
            if (z) {
                cih.A00.start();
            }
        }
        cih.invalidateSelf();
        if (cij == null || !cij.A0I) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.A01);
        }
    }

    public final boolean A04() {
        ValueAnimator valueAnimator = this.A02.A00;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return false;
        }
        return true;
    }

    public C28543Cij getShimmer() {
        return this.A02.A01;
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(-1571718851);
        super.onAttachedToWindow();
        this.A02.A01();
        AnonymousClass0Z0.A0D(542711130, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(1986135573);
        super.onDetachedFromWindow();
        A02();
        AnonymousClass0Z0.A0D(1362900648, A06);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A02) {
            return true;
        }
        return false;
    }

    public ShimmerFrameLayout(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }
}
