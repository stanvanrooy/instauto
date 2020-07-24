package com.instagram.common.p004ui.widget.imageview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass18C;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1GH;
import p000X.AnonymousClass1GK;
import p000X.C197478ch;
import p000X.C197488ci;
import p000X.C197498cj;
import p000X.C197508ck;
import p000X.C36591iI;

/* renamed from: com.instagram.common.ui.widget.imageview.TransitionCarouselImageView */
public class TransitionCarouselImageView extends View implements AnonymousClass18C, C197508ck {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public String A03;
    public List A04;
    public boolean A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public final long A09;
    public final long A0A;
    public final ValueAnimator A0B;
    public final ValueAnimator A0C;
    public final ValueAnimator A0D;
    public final Rect A0E;
    public final Rect A0F;
    public final float A0G;
    public final float A0H;
    public final Paint A0I;
    public final Rect A0J;
    public final Handler A0K;

    public final void B70(AnonymousClass1GK r1) {
    }

    public final void B72(AnonymousClass1GK r1, int i) {
    }

    public void setUrls(List list) {
        A04(list, false);
    }

    private void A00() {
        if (!this.A07 && this.A04 != null) {
            A02(this);
            this.A07 = true;
        }
    }

    public static void A03(TransitionCarouselImageView transitionCarouselImageView) {
        if (transitionCarouselImageView.A07) {
            AnonymousClass0ZA.A02(transitionCarouselImageView.A0K, 0);
            transitionCarouselImageView.A0C.cancel();
            transitionCarouselImageView.A0B.cancel();
            transitionCarouselImageView.A0D.cancel();
            transitionCarouselImageView.A01 = null;
            transitionCarouselImageView.A02 = null;
            transitionCarouselImageView.A0E.setEmpty();
            transitionCarouselImageView.A0F.setEmpty();
            transitionCarouselImageView.A07 = false;
        }
    }

    public final void A04(List list, boolean z) {
        if (!AnonymousClass17M.A00(list, this.A04) || this.A08 != z) {
            A03(this);
            this.A04 = list;
            this.A00 = 0;
            this.A08 = z;
            A00();
        }
    }

    public final void AtI(AnonymousClass1GK r9, C36591iI r10) {
        Bitmap bitmap = r10.A00;
        if (bitmap == null) {
            return;
        }
        if (this.A01 == null) {
            this.A01 = bitmap;
            if (this.A05) {
                this.A0B.start();
            }
            if (this.A04.size() > 1) {
                this.A00 = (this.A00 + 1) % this.A04.size();
                A02(this);
                return;
            }
            return;
        }
        this.A02 = bitmap;
        AnonymousClass0ZA.A03(this.A0K, 0, Math.max(this.A0A - (SystemClock.elapsedRealtime() - this.A06), 0));
    }

    public final void onDraw(Canvas canvas) {
        float f;
        if (this.A01 != null) {
            float f2 = 1.0f;
            if (this.A05) {
                f = ((Float) this.A0B.getAnimatedValue()).floatValue();
            } else {
                f = 1.0f;
            }
            A01(this.A01, this.A0E, f);
            canvas.drawBitmap(this.A01, this.A0E, this.A0J, (Paint) null);
            if (this.A02 != null && this.A0C.isStarted()) {
                this.A0I.setAlpha(((Integer) this.A0C.getAnimatedValue()).intValue());
                if (this.A05) {
                    f2 = ((Float) this.A0D.getAnimatedValue()).floatValue();
                }
                A01(this.A02, this.A0F, f2);
                canvas.drawBitmap(this.A02, this.A0F, this.A0J, this.A0I);
            }
        }
    }

    public static void A01(Bitmap bitmap, Rect rect, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int max = Math.max(width, height);
        float min = (float) Math.min(width, height);
        float f2 = min / f;
        float f3 = (((float) max) - f2) / 2.0f;
        float f4 = (min - f2) / 2.0f;
        float f5 = f4;
        if (width > height) {
            f5 = f3;
        }
        if (width > height) {
            f3 = f4;
        }
        rect.set((int) f5, (int) f3, (int) (f2 + f5), (int) (f2 + f3));
    }

    public static void A02(TransitionCarouselImageView transitionCarouselImageView) {
        transitionCarouselImageView.A06 = SystemClock.elapsedRealtime();
        AnonymousClass1GH A0D2 = AnonymousClass12C.A0c.A0D((ImageUrl) transitionCarouselImageView.A04.get(transitionCarouselImageView.A00), transitionCarouselImageView.A03);
        A0D2.A0G = false;
        A0D2.A0H = transitionCarouselImageView.A08;
        A0D2.A02(transitionCarouselImageView);
        A0D2.A01();
    }

    public final void BE0() {
        A03(this);
    }

    public final void BJx() {
        if (getVisibility() == 0) {
            A00();
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(1405122271);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A00();
        }
        AnonymousClass0Z0.A0D(1302733278, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(285830448);
        super.onDetachedFromWindow();
        A03(this);
        AnonymousClass0Z0.A0D(773365920, A062);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A00();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-1217109100);
        this.A0J.set(0, 0, getWidth(), getHeight());
        AnonymousClass0Z0.A0D(-210138676, A062);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A03(this);
    }

    public void setSource(String str) {
        this.A03 = str;
    }

    public TransitionCarouselImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TransitionCarouselImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004c, code lost:
        if (r9.A0G != 1.0f) goto L_0x004e;
     */
    public TransitionCarouselImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = new Paint();
        this.A0E = new Rect();
        this.A0F = new Rect();
        this.A0J = new Rect();
        this.A0K = new C197488ci(this, Looper.getMainLooper());
        if (attributeSet == null) {
            this.A09 = 800;
            this.A0A = 3000;
            this.A0H = 1.0f;
            this.A0G = 1.0f;
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3t);
            this.A09 = (long) obtainStyledAttributes.getInt(0, 800);
            this.A0A = (long) obtainStyledAttributes.getInt(1, 3000);
            this.A0H = obtainStyledAttributes.getFloat(3, 1.0f);
            this.A0G = obtainStyledAttributes.getFloat(2, 1.0f);
            obtainStyledAttributes.recycle();
        }
        C197498cj r5 = new C197498cj(this);
        boolean z = this.A0H == 1.0f ? false : z;
        z = true;
        this.A05 = z;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        this.A0C = ofInt;
        ofInt.setInterpolator(new LinearInterpolator());
        this.A0C.setDuration(this.A09);
        this.A0C.addUpdateListener(r5);
        this.A0C.addListener(new C197478ch(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.A0H, this.A0G});
        this.A0B = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.A0B.setDuration(this.A0A + this.A09);
        this.A0B.addUpdateListener(r5);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.A0H, this.A0G});
        this.A0D = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.A0D.setDuration(this.A0A + this.A09);
        this.A0D.addUpdateListener(r5);
    }
}
