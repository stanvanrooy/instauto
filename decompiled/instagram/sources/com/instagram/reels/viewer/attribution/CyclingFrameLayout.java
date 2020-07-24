package com.instagram.reels.viewer.attribution;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass9D6;

public class CyclingFrameLayout extends FrameLayout {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public Handler A03;
    public Runnable A04;
    public final List A05;

    public static void A00(CyclingFrameLayout cyclingFrameLayout) {
        ((View) cyclingFrameLayout.A05.get(cyclingFrameLayout.A01)).setVisibility(0);
        AnonymousClass9D6 r4 = new AnonymousClass9D6(cyclingFrameLayout);
        cyclingFrameLayout.A04 = r4;
        AnonymousClass0ZA.A09(cyclingFrameLayout.A03, r4, 2500, 986127886);
    }

    public static int getNextViewIndex(CyclingFrameLayout cyclingFrameLayout) {
        return (cyclingFrameLayout.A01 + 1) % cyclingFrameLayout.A05.size();
    }

    public static void setLayerType(CyclingFrameLayout cyclingFrameLayout, int i) {
        if (!cyclingFrameLayout.A05.isEmpty()) {
            ((View) cyclingFrameLayout.A05.get(cyclingFrameLayout.A01)).setLayerType(i, (Paint) null);
            ((View) cyclingFrameLayout.A05.get(getNextViewIndex(cyclingFrameLayout))).setLayerType(i, (Paint) null);
        }
    }

    public final void A01() {
        AnonymousClass0ZA.A08(this.A03, this.A04);
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        for (View view : this.A05) {
            view.setAlpha(1.0f);
            view.setVisibility(8);
            view.setY(this.A00);
        }
        this.A05.clear();
    }

    public final void A02(List list) {
        this.A05.addAll(list);
        for (View visibility : this.A05) {
            visibility.setVisibility(8);
        }
        if (!list.isEmpty()) {
            this.A00 = ((View) this.A05.get(0)).getY();
        }
        this.A01 = 0;
        A00(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.A05.isEmpty();
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0Z0.A06(444490429);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.A02.removeAllUpdateListeners();
        }
        A01();
        setOnClickListener((View.OnClickListener) null);
        AnonymousClass0Z0.A0D(-1511526921, A06);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null && valueAnimator.isRunning() && !this.A05.isEmpty()) {
            View view = (View) this.A05.get(this.A01);
            View view2 = (View) this.A05.get(getNextViewIndex(this));
            float floatValue = ((Float) this.A02.getAnimatedValue()).floatValue();
            float f = 1.0f - floatValue;
            view.setAlpha(f);
            view2.setAlpha(floatValue);
            float height = (float) ((View) this.A05.get(this.A01)).getHeight();
            view.setY(this.A00 - (floatValue * height));
            view2.setY(this.A00 + (height * f));
        }
    }

    public CyclingFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CyclingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CyclingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = new ArrayList();
        setWillNotDraw(false);
        this.A03 = new Handler();
    }
}
