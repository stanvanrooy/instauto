package com.instagram.p009ui.igeditseekbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass83N;
import p000X.C019000b;
import p000X.C197158c8;
import p000X.C197178cA;
import p000X.C197188cB;
import p000X.C197198cC;
import p000X.C197208cD;
import p000X.C197218cE;

/* renamed from: com.instagram.ui.igeditseekbar.IgEditSeekBar */
public class IgEditSeekBar extends FrameLayout implements C197178cA, C197188cB, C197198cC {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public ValueAnimator A04;
    public C197208cD A05;
    public AnonymousClass83N A06;
    public int A07;
    public int A08;
    public int A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Drawable A0D;
    public Drawable A0E;
    public AccessibilityManager A0F;
    public C197158c8 A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;

    public static void setCurrentPositionWithBounds(IgEditSeekBar igEditSeekBar, float f) {
        igEditSeekBar.A00 = Math.min(1.0f, Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f));
        AnonymousClass83N r1 = igEditSeekBar.A06;
        if (r1 != null) {
            r1.BGL(igEditSeekBar.getCurrentPositionAsValue());
        }
        if (igEditSeekBar.A0F == null) {
            igEditSeekBar.A0F = (AccessibilityManager) igEditSeekBar.getContext().getSystemService("accessibility");
        }
        if (igEditSeekBar.A0F.isEnabled()) {
            C197208cD r0 = igEditSeekBar.A05;
            if (r0 == null) {
                igEditSeekBar.A05 = new C197208cD(igEditSeekBar);
            } else {
                igEditSeekBar.removeCallbacks(r0);
            }
            igEditSeekBar.postDelayed(igEditSeekBar.A05, 200);
        }
        igEditSeekBar.invalidate();
    }

    public final void B15() {
        A00(false);
    }

    public final void B17(float f, float f2) {
        A00(false);
        AnonymousClass83N r0 = this.A06;
        if (r0 != null) {
            r0.B1E();
        }
    }

    public final void B1C(float f, float f2, Integer num, int i) {
        A00(false);
        AnonymousClass83N r0 = this.A06;
        if (r0 != null) {
            r0.B1E();
        }
    }

    public final boolean Bmx(float f, float f2) {
        return true;
    }

    private int getAccessibilityScrollSegmentsSize() {
        return this.A02 / 20;
    }

    private int getCurrentPositionAsValue() {
        int i;
        int round = Math.round((this.A00 - this.A01) * ((float) getSeekerBarSegmentSize()));
        if (Math.abs(round) <= getFatZeroRadiusSegmentSize()) {
            return 0;
        }
        if (round > 0) {
            i = getFatZeroRadiusSegmentSize();
        } else {
            i = -getFatZeroRadiusSegmentSize();
        }
        return round - i;
    }

    private int getFatZeroExtraSegmentSize() {
        float f = this.A01;
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f == 1.0f) {
            return getFatZeroRadiusSegmentSize();
        }
        return getFatZeroRadiusSegmentSize() << 1;
    }

    private int getFatZeroRadiusSegmentSize() {
        return Math.round(((float) this.A02) / 100.0f);
    }

    private int getLeftBound() {
        return (this.A08 >> 1) + this.A07;
    }

    private int getMax() {
        return Math.round((1.0f - this.A01) * ((float) this.A02));
    }

    private int getMin() {
        return Math.round((-this.A01) * ((float) this.A02));
    }

    private int getSeekerBarSegmentSize() {
        return this.A02 + getFatZeroExtraSegmentSize();
    }

    public final boolean B1K(float f, float f2, Integer num) {
        AnonymousClass83N r0 = this.A06;
        if (r0 != null) {
            r0.B1L();
        }
        A00(true);
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return IgEditSeekBar.class.getName();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0G.A03(motionEvent);
    }

    public void setActiveColor(int i) {
        this.A0A.setColor(i);
        Drawable mutate = this.A0D.mutate();
        this.A0D = mutate;
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setCurrentValue(int i) {
        int i2;
        float seekerBarSegmentSize;
        if (i > 0) {
            i2 = getFatZeroRadiusSegmentSize();
        } else {
            i2 = -getFatZeroRadiusSegmentSize();
        }
        int i3 = i + i2;
        if (Math.abs(i3) <= getFatZeroRadiusSegmentSize()) {
            seekerBarSegmentSize = this.A01;
        } else {
            seekerBarSegmentSize = (((float) i3) / ((float) getSeekerBarSegmentSize())) + this.A01;
        }
        setCurrentPositionWithBounds(this, seekerBarSegmentSize);
    }

    public void setInactiveColor(int i) {
        this.A0B.setColor(i);
    }

    public void setOnSeekBarChangeListener(AnonymousClass83N r2) {
        this.A06 = r2;
        if (r2 != null) {
            r2.BGL(getCurrentPositionAsValue());
        }
    }

    public void setSeekBarHeight(float f) {
        this.A0A.setStrokeWidth(f);
        this.A0B.setStrokeWidth(f);
    }

    public void setShouldOverrideVisualValue(boolean z) {
        this.A0I = z;
        this.A0K = z;
    }

    private void A00(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A01(float f, float f2) {
        boolean z = false;
        if (Math.abs(f2 - ((float) (getHeight() >> 1))) <= ((float) this.A03)) {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (f < ((float) (getWidth() / 3))) {
            setCurrentValue(getCurrentPositionAsValue() - 1);
        } else if (f > ((float) ((getWidth() << 1) / 3))) {
            setCurrentValue(getCurrentPositionAsValue() + 1);
        }
        AnonymousClass83N r0 = this.A06;
        if (r0 != null) {
            r0.B1E();
        }
        return true;
    }

    private int getCenterY() {
        return getHeight() >> 1;
    }

    private int getKnobCenterX() {
        return getLeftBound() + ((int) (this.A00 * ((float) getLengthPx())));
    }

    private int getLengthPx() {
        return ((getWidth() - (this.A08 >> 1)) - this.A07) - getLeftBound();
    }

    private int getRootCenterX() {
        return getLeftBound() + (((int) (this.A01 * ((float) getLengthPx()))) * (this.A0J ? 1 : 0));
    }

    public final boolean Ai9(float f, float f2) {
        if (Math.abs(f2 - ((float) (getHeight() >> 1))) <= ((float) this.A03)) {
            return true;
        }
        return false;
    }

    public final void B1G(float f, float f2, Integer num) {
        setCurrentPositionWithBounds(this, this.A00 + (f / ((float) getLengthPx())));
    }

    public final boolean BR9(float f, float f2) {
        return A01(f, f2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.A0D.setState(getDrawableState());
    }

    public int getKnobWidthInPx() {
        return this.A08;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-975113420);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A04;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C197208cD r0 = this.A05;
        if (r0 != null) {
            removeCallbacks(r0);
        }
        AnonymousClass0Z0.A0D(806346548, A062);
    }

    public final void onDraw(Canvas canvas) {
        String valueOf;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) getLeftBound(), (float) (getHeight() >> 1), (float) (getLeftBound() + getLengthPx()), (float) (getHeight() >> 1), this.A0B);
        canvas2.drawLine((float) getRootCenterX(), (float) (getHeight() >> 1), (float) getKnobCenterX(), (float) (getHeight() >> 1), this.A0A);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            int i = this.A09;
            int rootCenterX = getRootCenterX();
            int height = getHeight() >> 1;
            int i2 = i >> 1;
            drawable.setBounds(rootCenterX - i2, height - i2, rootCenterX + i2, height + i2);
            this.A0E.draw(canvas);
        }
        Drawable drawable2 = this.A0D;
        int i3 = this.A08;
        int knobCenterX = getKnobCenterX();
        int height2 = getHeight() >> 1;
        int i4 = i3 >> 1;
        drawable2.setBounds(knobCenterX - i4, height2 - i4, knobCenterX + i4, height2 + i4);
        this.A0D.draw(canvas);
        if (this.A0I) {
            int currentPositionAsValue = getCurrentPositionAsValue();
            if (this.A0K) {
                valueOf = (String) this.A0H.get(currentPositionAsValue);
            } else {
                valueOf = String.valueOf(currentPositionAsValue);
            }
            if (currentPositionAsValue != 0 || this.A0K) {
                canvas.drawText(valueOf, Math.min((float) getKnobCenterX(), ((float) getWidth()) - (this.A0C.measureText(valueOf) / 2.0f)), (((float) (getHeight() >> 1)) / 2.0f) + this.A0C.getFontMetrics().bottom, this.A0C);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(getMax());
        accessibilityEvent.setCurrentItemIndex(getCurrentPositionAsValue());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.addAction(4096);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4 != 81) goto L_0x001b;
     */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        if (isEnabled()) {
            if (i != 21) {
                if (i != 22) {
                    if (i != 69) {
                        if (i != 70) {
                        }
                    }
                }
                i2 = getCurrentPositionAsValue() + (this.A02 / 20);
                setCurrentValue(i2);
                return true;
            }
            i2 = getCurrentPositionAsValue() - (this.A02 / 20);
            setCurrentValue(i2);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setContentDescription(getContext().getString(C0003R.string.position_and_range, new Object[]{Integer.valueOf(getCurrentPositionAsValue()), Integer.valueOf(getMin()), Integer.valueOf(getMax())}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r3 == p000X.Constants.ONE) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        if (r7 == p000X.Constants.A0N) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        if (r8 == p000X.Constants.A0N) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r5.A0E.intValue() != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010f, code lost:
        if (r7 == p000X.Constants.A0N) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0137, code lost:
        if (java.lang.Math.abs(r5.A03) >= r1) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float yVelocity;
        boolean z3;
        C197178cA r9;
        boolean z4;
        Integer num;
        boolean z5;
        boolean z6;
        C197178cA r1;
        boolean z7;
        int A052 = AnonymousClass0Z0.A05(-1934054377);
        C197158c8 r5 = this.A0G;
        boolean z8 = false;
        if (r5.A0E == Constants.A0C) {
            z8 = true;
        }
        if (!z8) {
            r5.A03(motionEvent);
        } else {
            if (r5.A0B != null) {
                boolean z9 = false;
                if (r5.A05 > 0) {
                    z9 = true;
                }
                if (z9) {
                    if (r5.A09 == null) {
                        r5.A09 = VelocityTracker.obtain();
                    }
                    r5.A09.addMovement(motionEvent);
                    int action = motionEvent.getAction();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (action != 1) {
                        if (action == 2) {
                            float f = x - r5.A00;
                            float f2 = y - r5.A01;
                            r5.A00 = x;
                            r5.A01 = y;
                            r5.A02 += f;
                            r5.A03 += f2;
                            Integer num2 = r5.A0D;
                            Integer num3 = Constants.ZERO;
                            if (num2 != num3) {
                                z6 = false;
                            }
                            z6 = true;
                            if (z6) {
                                r1 = r5.A0B;
                                if (f2 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                    num3 = Constants.ONE;
                                }
                            } else {
                                r1 = r5.A0B;
                                if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                    num3 = Constants.A0C;
                                } else {
                                    num3 = Constants.A0N;
                                }
                            }
                            r1.B1G(f, f2, num3);
                        }
                    }
                    VelocityTracker velocityTracker = r5.A09;
                    r5.A09 = null;
                    C197158c8.A01(r5);
                    velocityTracker.computeCurrentVelocity(1000, (float) r5.A06);
                    Integer num4 = r5.A0D;
                    if (num4 != Constants.A0C) {
                        z2 = false;
                    }
                    z2 = true;
                    if (z2) {
                        yVelocity = velocityTracker.getXVelocity();
                    } else {
                        yVelocity = velocityTracker.getYVelocity();
                    }
                    int i = (int) yVelocity;
                    C197158c8.A01(r5);
                    if (Math.abs(i) > r5.A07) {
                        if (i < 0) {
                            r9 = r5.A0B;
                            Integer num5 = r5.A0D;
                            num = Constants.A0C;
                            if (num5 != num) {
                                z5 = false;
                            }
                            z5 = true;
                            if (!z5) {
                                num = Constants.ZERO;
                            }
                        } else if (i > 0) {
                            r9 = r5.A0B;
                            Integer num6 = r5.A0D;
                            if (num6 != Constants.A0C) {
                                z4 = false;
                            }
                            z4 = true;
                            if (z4) {
                                num = Constants.A0N;
                            } else {
                                num = Constants.ONE;
                            }
                        }
                        r9.B1C(x, y, num, i);
                    } else {
                        if (r5.A0C != null) {
                            C197158c8.A01(r5);
                            float f3 = (float) r5.A08;
                            if (Math.abs(r5.A02) < f3) {
                                z3 = true;
                            }
                            z3 = false;
                            if (z3) {
                                r5.A0C.B1D(x, y);
                            }
                        }
                        r5.A0B.B17(x, y);
                    }
                    r5.A0E = Constants.ZERO;
                    velocityTracker.recycle();
                }
            }
            z = false;
            z7 = true;
            if (!z || motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
                z7 = false;
            }
            if (z7 != isPressed()) {
                setPressed(z7);
                invalidate();
            }
            AnonymousClass0Z0.A0C(1826911806, A052);
            return z;
        }
        z = true;
        z7 = true;
        z7 = false;
        if (z7 != isPressed()) {
        }
        AnonymousClass0Z0.A0C(1826911806, A052);
        return z;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int currentPositionAsValue;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (isEnabled()) {
            if (i == 4096) {
                currentPositionAsValue = getCurrentPositionAsValue() + (this.A02 / 20);
            } else if (i == 8192) {
                currentPositionAsValue = getCurrentPositionAsValue() - (this.A02 / 20);
            }
            setCurrentValue(currentPositionAsValue);
            return true;
        }
        return false;
    }

    public void setOverrideVisualValueList(List list) {
        this.A02 = list.size() - 1;
        this.A0H = list;
    }

    public final void B1D(float f, float f2) {
        A01(f, f2);
    }

    public void setDisplayCurrentValueText(boolean z) {
        this.A0I = z;
    }

    public void setIsCenteredInZero(boolean z) {
        this.A0J = z;
    }

    public void setRootPosition(float f) {
        this.A01 = f;
    }

    public void setValueRangeSize(int i) {
        this.A02 = i;
    }

    public IgEditSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgEditSeekBar(Context context, AttributeSet attributeSet) {
        super(AnonymousClass1BA.A05(context, C0003R.attr.seekBarStyle), attributeSet);
        Drawable drawable;
        this.A02 = 100;
        this.A0I = true;
        this.A0J = true;
        C197158c8 r6 = new C197158c8(context);
        this.A0G = r6;
        Integer[] numArr = {Constants.A0C, Constants.A0N};
        r6.A05 = 0;
        for (int i = 0; i < 2; i++) {
            Integer num = numArr[i];
            if (num != null) {
                r6.A05 = C197218cE.A00(num) | r6.A05;
            }
        }
        r6.A0B = this;
        r6.A0A = this;
        r6.A0C = this;
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A0B = paint;
        Context context2 = getContext();
        paint.setColor(AnonymousClass1BA.A01(context2, C0003R.attr.seekBarInactiveColor));
        this.A0B.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.seek_bar_width));
        Paint paint2 = new Paint();
        this.A0A = paint2;
        getContext();
        paint2.setColor(AnonymousClass1BA.A01(context2, C0003R.attr.seekBarActiveColor));
        this.A0A.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.seek_bar_width));
        Paint paint3 = new Paint();
        this.A0C = paint3;
        getContext();
        paint3.setColor(AnonymousClass1BA.A01(context2, C0003R.attr.seekBarTextColor));
        this.A0C.setTextSize((float) resources.getDimensionPixelSize(C0003R.dimen.seek_bar_text_size));
        Paint paint4 = this.A0C;
        getContext();
        paint4.setAlpha(AnonymousClass1BA.A01(context2, C0003R.attr.seekBarTextAlpha));
        this.A0C.setTextAlign(Paint.Align.CENTER);
        this.A0C.setAntiAlias(true);
        this.A09 = resources.getDimensionPixelSize(C0003R.dimen.seek_bar_root_size);
        getContext();
        this.A08 = resources.getDimensionPixelSize(AnonymousClass1BA.A03(context2, C0003R.attr.seekBarKnobSize));
        this.A03 = resources.getDimensionPixelSize(C0003R.dimen.seek_bar_tappable_height);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2E);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(C0003R.dimen.seek_bar_default_gap));
        obtainStyledAttributes.recycle();
        getContext();
        int A032 = AnonymousClass1BA.A03(context2, C0003R.attr.seekBarRoot);
        if (A032 != 0) {
            getContext();
            drawable = C019000b.A03(context2, A032);
        } else {
            drawable = null;
        }
        this.A0E = drawable;
        getContext();
        getContext();
        this.A0D = C019000b.A03(context2, AnonymousClass1BA.A03(context2, C0003R.attr.seekBarKnob));
        setWillNotDraw(false);
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
