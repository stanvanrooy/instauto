package com.instagram.creation.base.p029ui.sliderview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.C1881181m;

/* renamed from: com.instagram.creation.base.ui.sliderview.SliderView */
public class SliderView extends HorizontalScrollView {
    public float A00 = 1.0f;
    public float A01 = -1.0f;
    public float A02;
    public int A03;
    public RulerView A04;
    public C1881181m A05;
    public boolean A06 = false;
    public float A07;
    public float A08;
    public float A09 = Float.NaN;
    public float A0A;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public final void fling(int i) {
    }

    public final void A00(float f, boolean z) {
        float min = Math.min(this.A00, f);
        int max = (int) (this.A02 * ((Math.max(this.A01, min) + 1.0f) / 2.0f));
        if (z) {
            smoothScrollTo(max, 0);
        } else {
            scrollTo(max, 0);
        }
    }

    public final void A01(float f, boolean z) {
        if (this.A0B) {
            A00(f / 25.0f, z);
            return;
        }
        this.A0C = true;
        this.A07 = f;
        this.A0D = z;
    }

    private float getCurrentScrollPercent() {
        return ((float) ((((int) (((double) getScrollX()) + (((double) getWidth()) / 2.0d))) - this.A03) << 1)) / this.A02;
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0Z0.A06(-1882591759);
        super.onFinishInflate();
        RulerView rulerView = (RulerView) getChildAt(0);
        this.A04 = rulerView;
        rulerView.A01 = 0.05f;
        rulerView.A00 = 0.2f;
        rulerView.A02 = 0.85f;
        rulerView.setLeftRightMarginRatio(0.5f);
        this.A04.setNumIncrements(50);
        AnonymousClass0Z0.A0D(-1695533085, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0B) {
            this.A06 = false;
            scrollTo(((this.A04.getLeft() + this.A04.getRight()) - getWidth()) >> 1, getScrollY());
            this.A03 = getScrollX() + (getWidth() >> 1);
            this.A06 = true;
            this.A02 = (float) (this.A04.getWidth() - getWidth());
            this.A01 = -1.0f;
            this.A00 = 1.0f;
            this.A0B = true;
        }
        if (this.A0C) {
            A00(this.A07 / 25.0f, this.A0D);
            this.A0C = false;
            this.A07 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A0D = false;
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.A06) {
            float currentScrollPercent = getCurrentScrollPercent();
            float f = this.A00;
            if (currentScrollPercent > f) {
                A00(f, false);
                currentScrollPercent = this.A00;
            } else {
                float f2 = this.A01;
                if (currentScrollPercent < f2) {
                    A00(f2, false);
                    currentScrollPercent = this.A01;
                }
            }
            C1881181m r3 = this.A05;
            if (r3 != null) {
                float round = ((float) Math.round((currentScrollPercent * 25.0f) * 10.0f)) / 10.0f;
                if (this.A09 != round) {
                    r3.BKf(round);
                    this.A09 = round;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1 != 3) goto L_0x001c;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(1383463963);
        int action = motionEvent.getAction();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                C1881181m r0 = this.A05;
                if (r0 != null) {
                    r0.BNm();
                }
                if (this.A0F) {
                    boolean z = false;
                    if (motionEvent.getX() < ((float) getWidth()) * 0.25f) {
                        z = true;
                    }
                    if (!z) {
                        boolean z2 = false;
                        if (motionEvent.getX() > ((float) getWidth()) * 0.75f) {
                            z2 = true;
                        }
                        if (z2 && this.A05 != null) {
                            scrollBy((int) ((0.1f / 50.0f) * this.A02), 0);
                        }
                    } else if (this.A05 != null) {
                        scrollBy(-((int) ((0.1f / 50.0f) * this.A02)), 0);
                    }
                }
                this.A0F = false;
                this.A08 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else if (actionMasked == 2) {
                this.A0F = false;
                float round = ((float) Math.round((getCurrentScrollPercent() * 25.0f) * 10.0f)) / 10.0f;
                float round2 = ((float) Math.round(((((float) ((((int) (((double) (getScrollX() + ((int) this.A0A))) + (((double) getWidth()) / 2.0d))) - this.A03) << 1)) / this.A02) * 25.0f) * 10.0f)) / 10.0f;
                if (round == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && Math.abs(round2) < 0.75f) {
                    A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
                    this.A0E = false;
                    this.A0A += this.A08 - motionEvent.getX();
                    this.A08 = motionEvent.getX();
                    AnonymousClass0Z0.A0C(1906045351, A052);
                    return true;
                } else if (!this.A0E) {
                    motionEvent.setAction(0);
                    this.A0E = true;
                } else if (round != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    this.A0A = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
            }
            this.A0F = false;
        } else {
            C1881181m r02 = this.A05;
            if (r02 != null) {
                r02.BNo();
            }
            this.A0F = true;
        }
        this.A08 = motionEvent.getX();
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        motionEvent.setAction(action);
        AnonymousClass0Z0.A0C(-1988790495, A052);
        return onTouchEvent;
    }

    public void setOnSlideListener(C1881181m r1) {
        this.A05 = r1;
    }

    public SliderView(Context context) {
        super(context);
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
