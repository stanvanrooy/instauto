package com.instagram.p009ui.widget.imageview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1EM;
import p000X.C31881aA;
import p000X.C37371jY;
import p000X.C41801qx;
import p000X.C41811qy;
import p000X.C41821qz;

/* renamed from: com.instagram.ui.widget.imageview.PulsingMultiImageView */
public class PulsingMultiImageView extends CircularImageView implements C31881aA {
    public int A00;
    public long A01;
    public Matrix A02;
    public Drawable A03;
    public List A04;
    public boolean A05;
    public final ValueAnimator A06;
    public final ValueAnimator A07;
    public final Handler A08;
    public final boolean A09;

    public final void B3v() {
    }

    private void A00() {
        List list;
        if (!this.A05 && (list = this.A04) != null) {
            this.A05 = true;
            this.A01 = SystemClock.elapsedRealtime();
            setUrl((ImageUrl) list.get(this.A00));
        }
    }

    public static void A02(PulsingMultiImageView pulsingMultiImageView) {
        if (pulsingMultiImageView.A04.size() > 1) {
            pulsingMultiImageView.A03 = pulsingMultiImageView.getDrawable();
            pulsingMultiImageView.A02 = new Matrix(pulsingMultiImageView.getImageMatrix());
            int size = (pulsingMultiImageView.A00 + 1) % pulsingMultiImageView.A04.size();
            pulsingMultiImageView.A00 = size;
            pulsingMultiImageView.A01 = SystemClock.elapsedRealtime();
            pulsingMultiImageView.setUrl((ImageUrl) pulsingMultiImageView.A04.get(size));
        }
    }

    public final void A0B() {
        if (this.A05) {
            this.A05 = false;
            AnonymousClass0ZA.A02(this.A08, 0);
            AnonymousClass0ZA.A02(this.A08, 1);
            this.A06.cancel();
            this.A07.cancel();
            this.A03 = null;
            this.A02 = null;
        }
    }

    public final void B9O(C37371jY r9) {
        if (!this.A05) {
            return;
        }
        if (this.A03 == null) {
            if (!this.A09 || this.A04.size() <= 1 || this.A07.isStarted()) {
                A02(this);
            } else {
                AnonymousClass0ZA.A0B(this.A08, 1);
            }
            this.A06.start();
            return;
        }
        AnonymousClass0ZA.A03(this.A08, 0, Math.max(3000 - (SystemClock.elapsedRealtime() - this.A01), 0));
    }

    public void setAnimatingImageUrl(ImageUrl imageUrl) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageUrl);
        setAnimatingImageUrls(arrayList);
    }

    public void setPulseDurationMs(long j) {
        this.A06.setDuration(j / 2);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-25695805);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A00();
        }
        AnonymousClass0Z0.A0D(-1118463951, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1739088936);
        super.onDetachedFromWindow();
        A0B();
        AnonymousClass0Z0.A0D(1963775678, A062);
    }

    public final void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        if (this.A03 != null) {
            canvas.save();
            if (this.A07.isStarted()) {
                valueAnimator2 = this.A07;
            } else {
                valueAnimator2 = this.A06;
            }
            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            canvas.scale(floatValue, floatValue, width, height);
            canvas.concat(this.A02);
            this.A03.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.A07.isStarted()) {
            valueAnimator = this.A07;
        } else if (this.A06.isStarted()) {
            valueAnimator = this.A06;
        } else {
            return;
        }
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        canvas.save();
        canvas.scale(floatValue2, floatValue2, width, height);
        super.onDraw(canvas);
        canvas.restore();
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A00();
        }
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A0B();
    }

    public void setAnimatingImageUrls(List list) {
        A0B();
        this.A04 = list;
        this.A00 = 0;
        A00();
    }

    public PulsingMultiImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PulsingMultiImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulsingMultiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = new C41801qx(this, Looper.getMainLooper());
        setOnLoadListener(this);
        C41811qy r4 = new C41811qy(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2y);
        this.A09 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
        this.A07 = ofFloat;
        ofFloat.setDuration(400);
        this.A07.addUpdateListener(r4);
        this.A07.addListener(new C41821qz(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.95f});
        this.A06 = ofFloat2;
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        this.A06.setDuration(400);
        this.A06.setRepeatCount(-1);
        this.A06.setRepeatMode(2);
        this.A06.addUpdateListener(r4);
    }
}
