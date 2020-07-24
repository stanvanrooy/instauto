package com.instagram.common.p004ui.widget.reboundhorizontalscrollview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass3QR;
import p000X.AnonymousClass3YR;
import p000X.C06400Ox;
import p000X.C27181Gu;
import p000X.C87463qm;
import p000X.C87473qn;

/* renamed from: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView */
public class ReboundHorizontalScrollView extends LinearLayout implements AnonymousClass1E8, GestureDetector.OnGestureListener {
    public static final AnonymousClass1EA A0P = AnonymousClass1EA.A01(0.0d, 5.0d);
    public static final AnonymousClass1EA A0Q = AnonymousClass1EA.A01(50.0d, 10.2d);
    public static final AnonymousClass1EA A0R = AnonymousClass1EA.A01(20.0d, 10.0d);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public AnonymousClass1EA A04;
    public AnonymousClass1EA A05;
    public AnonymousClass1EA A06;
    public AnonymousClass3YR A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public Rect A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnonymousClass1EG A0K;
    public final List A0L;
    public final int A0M;
    public final int A0N;
    public final GestureDetector A0O;

    public final void A08(float f) {
        this.A0J = false;
        if (Math.abs(f) < ((float) this.A0N)) {
            AnonymousClass1EG r5 = this.A0K;
            AnonymousClass1EA r4 = this.A06;
            r5.A06(r4);
            int i = this.A03;
            if (i == -1 && i == -1) {
                r5.A06(r4);
                r5.A03((double) getNearestRestPoint());
                r5.A04((double) BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        } else {
            AnonymousClass1EG r2 = this.A0K;
            r2.A06(this.A05);
            r2.A04((double) (-f));
            int A002 = A00(getScrollX());
            for (int i2 = 0; i2 < this.A0L.size(); i2++) {
                ((AnonymousClass3QR) this.A0L.get(i2)).B4y(this, A002);
            }
        }
        for (int i3 = 0; i3 < this.A0L.size(); i3++) {
            ((AnonymousClass3QR) this.A0L.get(i3)).BS3(this);
        }
        setScrollState(AnonymousClass3YR.SETTLING);
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(288);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void A02() {
        if (!this.A0J) {
            this.A0J = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.A03 = -1;
            for (int i = 0; i < this.A0L.size(); i++) {
                ((AnonymousClass3QR) this.A0L.get(i)).BS8(this);
            }
            setScrollState(AnonymousClass3YR.IDLE);
            this.A08 = false;
            this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A0K.A02();
        }
    }

    private void A03(MotionEvent motionEvent) {
        if (!this.A0F) {
            float rawX = this.A0A - motionEvent.getRawX();
            float rawY = this.A0B - motionEvent.getRawY();
            boolean z = false;
            if (Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.A0C)) {
                z = true;
            }
            double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (z && degrees < 45.0d) {
                this.A0F = true;
            }
        }
    }

    private void setScrollState(AnonymousClass3YR r5) {
        AnonymousClass3YR r3 = this.A07;
        if (r3 != r5) {
            this.A07 = r5;
            for (AnonymousClass3QR BLN : this.A0L) {
                BLN.BLN(this, r3, this.A07);
            }
        }
    }

    public final void A09(int i) {
        this.A0K.A05((double) A01(i), true);
    }

    public final void A0A(int i, float f) {
        this.A03 = i;
        AnonymousClass1EG r2 = this.A0K;
        r2.A06(this.A04);
        r2.A03((double) A01(i));
        r2.A04((double) f);
        setScrollState(AnonymousClass3YR.SETTLING);
    }

    public final void A0B(AnonymousClass3QR r2) {
        if (!this.A0L.contains(r2)) {
            this.A0L.add(r2);
        }
    }

    public final void BOH(AnonymousClass1EG r4) {
        if (this.A07 == AnonymousClass3YR.SETTLING) {
            r4.A05(r4.A01, true);
            setScrollX((int) Math.round(this.A0K.A00()));
            setScrollState(AnonymousClass3YR.IDLE);
        }
    }

    public float getVelocity() {
        return (float) this.A0K.A09.A01;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = this.A0M;
        this.A0D = Math.min(Math.max(f, (float) (-i)), (float) i);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A0H) {
            this.A0H = true;
            return true;
        }
        A05(f);
        return true;
    }

    public void setSpringConfig(AnonymousClass1EA r2) {
        this.A0K.A06(r2);
    }

    private int A00(int i) {
        int childCount = getChildCount();
        if (childCount <= 1) {
            return 0;
        }
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4);
            int abs = Math.abs(i - A01(i4));
            if (i4 == 0 || abs < i3) {
                i2 = i4;
                i3 = abs;
            }
        }
        return i2;
    }

    private int A01(int i) {
        int round;
        int childCount = getChildCount() - 1;
        if (i > childCount) {
            return 0;
        }
        if (i == 0 && this.A0I) {
            return 0;
        }
        if (i != childCount || !this.A0I) {
            if (i > getChildCount() - 1) {
                round = 0;
            } else {
                View childAt = getChildAt(i);
                round = Math.round(((float) childAt.getRight()) - (((float) childAt.getMeasuredWidth()) / 2.0f));
            }
            return Math.round((float) (round - getSelectionPoint()));
        }
        View childAt2 = getChildAt(i);
        if (this.A09) {
            return childAt2.getLeft();
        }
        return childAt2.getRight() - getWidth();
    }

    public static void A04(ReboundHorizontalScrollView reboundHorizontalScrollView, View view) {
        int indexOfChild = reboundHorizontalScrollView.indexOfChild(view);
        reboundHorizontalScrollView.A0A(indexOfChild, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        for (AnonymousClass3QR r0 : reboundHorizontalScrollView.A0L) {
            r0.BS8(reboundHorizontalScrollView);
            r0.BR0(view, indexOfChild);
        }
    }

    private int getNearestRestPoint() {
        return A01(getCurrentChildIndex());
    }

    private int getNextRestPoint() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            int A012 = A01(i);
            if (A012 > getScrollX()) {
                return A012;
            }
        }
        return A01(0);
    }

    private int getPriorRestPoint() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int A012 = A01(childCount);
            if (A012 < getScrollX()) {
                return A012;
            }
        }
        return A01(getChildCount() - 1);
    }

    private float getProgress() {
        int i;
        int A002 = A00(getScrollX());
        int A012 = A01(A002);
        int scrollX = getScrollX();
        boolean z = true;
        if (!this.A09 ? A012 >= scrollX : A012 <= scrollX) {
            z = false;
        }
        if (z) {
            i = Math.min(A002 + 1, getChildCount() - 1);
        } else {
            i = A002;
            A002 = Math.max(A002 - 1, 0);
        }
        int A013 = A01(A002);
        int A014 = A01(i);
        if (A002 == i) {
            return (float) A002;
        }
        return ((float) C27181Gu.A01((double) scrollX, (double) A013, (double) A014, 0.0d, 1.0d)) + ((float) A002);
    }

    private int getSelectionPoint() {
        return Math.round(((float) getWidth()) / 2.0f);
    }

    public final void A05(float f) {
        boolean z;
        boolean z2;
        A02();
        setScrollState(AnonymousClass3YR.DRAGGING);
        if (getChildCount() != 0) {
            boolean z3 = this.A09;
            int scrollX = getScrollX();
            int startScrollBound = getStartScrollBound();
            z = true;
            if (!z3) {
            }
        }
        z = false;
        if (z && f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f *= 0.25f;
        }
        if (getChildCount() != 0) {
            boolean z4 = this.A09;
            int endScrollBound = getEndScrollBound();
            int scrollX2 = getScrollX();
            z2 = true;
            if (!z4) {
            }
        }
        z2 = false;
        if (z2 && f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f *= 0.25f;
        }
        AnonymousClass1EG r4 = this.A0K;
        r4.A05(r4.A00() + ((double) f), true);
    }

    public final void A06(float f) {
        int nextRestPoint = getNextRestPoint();
        this.A03 = A00(nextRestPoint);
        AnonymousClass1EG r2 = this.A0K;
        r2.A06(this.A04);
        r2.A03((double) nextRestPoint);
        r2.A04((double) f);
    }

    public final void A07(float f) {
        int priorRestPoint = getPriorRestPoint();
        this.A03 = A00(priorRestPoint);
        AnonymousClass1EG r2 = this.A0K;
        r2.A06(this.A04);
        r2.A03((double) priorRestPoint);
        r2.A04((double) f);
    }

    public final void BOK(AnonymousClass1EG r13) {
        boolean z;
        boolean z2;
        AnonymousClass1EG r2;
        int endScrollBound;
        int scrollX = getScrollX();
        int A002 = A00(getScrollX());
        setScrollX((int) Math.round(this.A0K.A00()));
        int scrollX2 = getScrollX();
        int A003 = A00(getScrollX());
        for (int i = 0; i < this.A0L.size(); i++) {
            AnonymousClass3QR r6 = (AnonymousClass3QR) this.A0L.get(i);
            if (scrollX2 != scrollX) {
                float progress = getProgress();
                double d = (double) progress;
                int floor = (int) Math.floor(d);
                r6.BLF(this, progress - ((float) floor), floor, (int) Math.ceil(d));
            }
            if (A003 != A002) {
                r6.B7E(this, A003, A002);
            }
        }
        if (this.A07 == AnonymousClass3YR.SETTLING) {
            if (this.A03 == -1) {
                if (getChildCount() != 0) {
                    boolean z3 = this.A09;
                    int scrollX3 = getScrollX();
                    int startScrollBound = getStartScrollBound();
                    z = true;
                    if (!z3) {
                    }
                }
                z = false;
                if (z) {
                    r2 = this.A0K;
                    r2.A06(this.A04);
                    endScrollBound = getStartScrollBound();
                } else {
                    if (getChildCount() != 0) {
                        boolean z4 = this.A09;
                        int endScrollBound2 = getEndScrollBound();
                        int scrollX4 = getScrollX();
                        z2 = true;
                        if (!z4) {
                        }
                    }
                    z2 = false;
                    if (z2) {
                        r2 = this.A0K;
                        r2.A06(this.A04);
                        endScrollBound = getEndScrollBound();
                    }
                }
                r2.A03((double) endScrollBound);
            }
            AnonymousClass1EG r5 = this.A0K;
            double d2 = r5.A09.A01;
            float abs = (float) Math.abs(d2);
            if (!this.A08 && abs < this.A01 && r5.A05 == this.A05 && abs < this.A00) {
                this.A08 = true;
                float f = (float) d2;
                AnonymousClass1EA r22 = this.A06;
                r5.A06(r22);
                if (this.A03 == -1) {
                    r5.A06(r22);
                    r5.A03((double) getNearestRestPoint());
                    r5.A04((double) f);
                }
            }
            this.A01 = abs;
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setClickable(true);
        view.setOnTouchListener(new C87473qn(this, new GestureDetector(getContext(), new C87463qm(this, view), new Handler(Looper.getMainLooper()))));
    }

    public final boolean canScrollHorizontally(int i) {
        return isEnabled();
    }

    public int getCurrentChildIndex() {
        return A00(getScrollX());
    }

    public int getEndScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return A01(getChildCount() - 1);
    }

    public float getLeftFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return 1.0f;
    }

    public float getRightFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return 1.0f;
    }

    public AnonymousClass3YR getScrollState() {
        return this.A07;
    }

    public int getSeekingIndex() {
        return this.A03;
    }

    public int getStartScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return A01(0);
    }

    public final void measureChild(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(138461262);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        AnonymousClass0Z0.A0D(2110364612, A062);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-242426367);
        super.onAttachedToWindow();
        this.A0K.A07(this);
        setScrollState(AnonymousClass3YR.IDLE);
        AnonymousClass0Z0.A0D(981107593, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1386624774);
        super.onDetachedFromWindow();
        this.A0K.A08(this);
        AnonymousClass0Z0.A0D(805118939, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r1 != 3) goto L_0x0016;
     */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    A03(motionEvent);
                    if (this.A0F) {
                        A02();
                        return true;
                    }
                }
            }
            A08(this.A0D);
        } else {
            this.A0F = false;
            this.A0H = false;
            this.A0D = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A0A = motionEvent.getRawX();
            this.A0B = motionEvent.getRawY();
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.A02;
        if (i5 != -1) {
            this.A0K.A05((double) A01(A00(i5)), true);
            this.A02 = -1;
        }
    }

    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768 && this.A0G) {
            scrollTo(A01(indexOfChild(view)), 0);
        } else if (accessibilityEvent.getEventType() == 1) {
            A04(this, view);
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A02 = savedState.A00;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = getScrollX();
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r1 != 3) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r5.A0F != false) goto L_0x0034;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0Z0.A05(-1012567740);
        boolean z = false;
        if (!isEnabled()) {
            AnonymousClass0Z0.A0C(-1917522511, A052);
            return false;
        }
        boolean z2 = true;
        if (super.onTouchEvent(motionEvent) || this.A0O.onTouchEvent(motionEvent)) {
            z = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    A03(motionEvent);
                }
                z2 = z;
            }
            A08(this.A0D);
            z2 = z;
        } else {
            A02();
        }
        AnonymousClass0Z0.A0C(-1227879531, A052);
        return z2;
    }

    public void setDeceleratingVelocity(float f) {
        this.A00 = f;
    }

    public void setExplorableByAccessibility(boolean z) {
        this.A0G = z;
    }

    public void setPagingSpringConfig(AnonymousClass1EA r1) {
        this.A04 = r1;
    }

    public void setScrollingSpringConfig(AnonymousClass1EA r1) {
        this.A05 = r1;
    }

    public void setSnapToEdges(boolean z) {
        this.A0I = z;
    }

    public void setSnappingSpringConfig(AnonymousClass1EA r1) {
        this.A06 = r1;
    }

    public ReboundHorizontalScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = true;
        this.A02 = -1;
        setClipChildren(false);
        setSaveEnabled(false);
        this.A04 = A0Q;
        this.A06 = A0R;
        this.A05 = A0P;
        this.A09 = C06400Ox.A02(getContext());
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(this.A05);
        A002.A00 = 0.001d;
        A002.A02 = 1.0d;
        this.A0K = A002;
        this.A0O = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
        this.A0L = new CopyOnWriteArrayList();
        this.A0C = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A0N = scaledMinimumFlingVelocity;
        this.A00 = (float) (scaledMinimumFlingVelocity * 3);
        this.A0M = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.A0E = new Rect();
    }
}
