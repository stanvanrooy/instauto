package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.C0003R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p000X.AFk;
import p000X.AFy;
import p000X.AG0;
import p000X.AIH;
import p000X.AnonymousClass000;
import p000X.AnonymousClass1E1;
import p000X.C23271AFp;
import p000X.C23278AFx;
import p000X.C24277Al4;
import p000X.C51052Iz;
import p000X.C712039k;

public class BottomSheetBehavior extends CoordinatorLayout.Behavior {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = 4;
    public VelocityTracker A08;
    public AFk A09;
    public C24277Al4 A0A;
    public WeakReference A0B;
    public WeakReference A0C;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public Map A0M;
    public boolean A0N;
    public boolean A0O;
    public final C23271AFp A0P = new C23278AFx(this);

    public final void A0Q(int i) {
        WeakReference weakReference;
        View view;
        boolean z = true;
        if (i == -1) {
            if (!this.A0O) {
                this.A0O = true;
            }
            z = false;
        } else {
            if (this.A0O || this.A0K != i) {
                this.A0O = false;
                this.A0K = Math.max(0, i);
                this.A02 = this.A06 - i;
            }
            z = false;
        }
        if (z && this.A07 == 4 && (weakReference = this.A0C) != null && (view = (View) weakReference.get()) != null) {
            view.requestLayout();
        }
    }

    public final void A0T(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.A02;
        } else if (i == 6) {
            int i3 = this.A04;
            if (!this.A0D || i3 > (i2 = this.A03)) {
                i2 = i3;
            } else {
                i = 3;
            }
        } else if (i == 3) {
            i2 = A00(this);
        } else if (!this.A0E || i != 5) {
            throw new IllegalArgumentException(AnonymousClass000.A05("Illegal state argument: ", i));
        } else {
            i2 = this.A06;
        }
        if (this.A09.A0L(view, view.getLeft(), i2)) {
            A0S(2);
            view.postOnAnimation(new AFy(this, view, i));
            return;
        }
        A0S(i);
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new AIH();
        public final int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A00 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.A00 = i;
        }
    }

    public static int A00(BottomSheetBehavior bottomSheetBehavior) {
        if (bottomSheetBehavior.A0D) {
            return bottomSheetBehavior.A03;
        }
        return 0;
    }

    private void A02() {
        if (this.A0D) {
            this.A02 = Math.max(this.A06 - this.A0J, this.A03);
        } else {
            this.A02 = this.A06 - this.A0J;
        }
    }

    private void A03(boolean z) {
        WeakReference weakReference = this.A0C;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.A0M == null) {
                        this.A0M = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.A0C.get()) {
                        if (!z) {
                            Map map = this.A0M;
                            if (map != null && map.containsKey(childAt)) {
                                AnonymousClass1E1.A0V(childAt, ((Integer) this.A0M.get(childAt)).intValue());
                            }
                        } else {
                            this.A0M.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            AnonymousClass1E1.A0V(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.A0M = null;
                }
            }
        }
    }

    public final boolean A0J(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (view2 != this.A0B.get()) {
            return false;
        }
        if (this.A07 != 3 || super.A0J(coordinatorLayout, view, view2, f, f2)) {
            return true;
        }
        return false;
    }

    public final Parcelable A0K(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.A0K(coordinatorLayout, view), this.A07);
    }

    public final void A0L(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.A0L(coordinatorLayout, view, savedState.A00);
        int i = savedState.A00;
        if (i == 1 || i == 2) {
            this.A07 = 4;
        } else {
            this.A07 = i;
        }
    }

    public final void A0P(int i) {
        C24277Al4 al4;
        float f;
        float A002;
        View view = (View) this.A0C.get();
        if (view != null && (al4 = this.A0A) != null) {
            int i2 = this.A02;
            if (i > i2) {
                f = (float) (i2 - i);
                A002 = (float) (this.A06 - i2);
            } else {
                f = (float) (i2 - i);
                A002 = (float) (i2 - A00(this));
            }
            al4.A00(view, f / A002);
        }
    }

    public final void A0R(int i) {
        if (i != this.A07) {
            WeakReference weakReference = this.A0C;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !view.isAttachedToWindow()) {
                        A0T(view, i);
                    } else {
                        view.post(new AG0(this, view, i));
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.A0E && i == 5)) {
                this.A07 = i;
            }
        }
    }

    public final void A0S(int i) {
        C24277Al4 al4;
        if (this.A07 != i) {
            this.A07 = i;
            if (i == 6 || i == 3) {
                A03(true);
            } else if (i == 5 || i == 4) {
                A03(false);
            }
            View view = (View) this.A0C.get();
            if (view != null && (al4 = this.A0A) != null) {
                al4.A01(view, i);
            }
        }
    }

    public final boolean A0U(View view, float f) {
        if (this.A0G) {
            return true;
        }
        if (view.getTop() >= this.A02 && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.A02)) / ((float) this.A0K) > 0.5f) {
            return true;
        }
        return false;
    }

    public static BottomSheetBehavior A01(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C51052Iz) {
            CoordinatorLayout.Behavior behavior = ((C51052Iz) layoutParams).A0B;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r9.A0J(r10, r6, r8.A0I) != false) goto L_0x0089;
     */
    public boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        boolean z;
        AFk aFk;
        if (!view.isShown()) {
            this.A0N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A01 = -1;
            VelocityTracker velocityTracker = this.A08;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A08 = null;
            }
        }
        if (this.A08 == null) {
            this.A08 = VelocityTracker.obtain();
        }
        this.A08.addMovement(motionEvent);
        View view3 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.A0I = (int) motionEvent.getY();
            WeakReference weakReference = this.A0B;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && coordinatorLayout.A0J(view2, x, this.A0I)) {
                this.A01 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A0H = true;
            }
            if (this.A01 == -1) {
                z = true;
            }
            z = false;
            this.A0N = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A0H = false;
            this.A01 = -1;
            if (this.A0N) {
                this.A0N = false;
                return false;
            }
        }
        if (!this.A0N && (aFk = this.A09) != null && aFk.A0J(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.A0B;
        if (weakReference2 != null) {
            view3 = (View) weakReference2.get();
        }
        if (actionMasked != 2 || view3 == null || this.A0N || this.A07 == 1 || coordinatorLayout.A0J(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.A09 == null || Math.abs(((float) this.A0I) - motionEvent.getY()) <= ((float) this.A09.A05)) {
            return false;
        }
        return true;
    }

    public final boolean A0I(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A07 == 1 && actionMasked == 0) {
            return true;
        }
        AFk aFk = this.A09;
        if (aFk != null) {
            aFk.A0F(motionEvent);
        }
        if (actionMasked == 0) {
            this.A01 = -1;
            VelocityTracker velocityTracker = this.A08;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A08 = null;
            }
        }
        if (this.A08 == null) {
            this.A08 = VelocityTracker.obtain();
        }
        this.A08.addMovement(motionEvent);
        if (actionMasked == 2 && !this.A0N) {
            float abs = Math.abs(((float) this.A0I) - motionEvent.getY());
            AFk aFk2 = this.A09;
            if (abs > ((float) aFk2.A05)) {
                aFk2.A0G(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0N;
    }

    public final boolean A0M(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.A0F(view, i);
        this.A06 = coordinatorLayout.getHeight();
        if (this.A0O) {
            if (this.A0L == 0) {
                this.A0L = coordinatorLayout.getResources().getDimensionPixelSize(C0003R.dimen.design_bottom_sheet_peek_height_min);
            }
            this.A0J = Math.max(this.A0L, this.A06 - ((coordinatorLayout.getWidth() * 9) >> 4));
        } else {
            this.A0J = this.A0K;
        }
        this.A03 = Math.max(0, this.A06 - view.getHeight());
        int i2 = this.A06;
        int i3 = i2 / 2;
        this.A04 = i3;
        A02();
        int i4 = this.A07;
        if (i4 == 3) {
            AnonymousClass1E1.A0T(view, A00(this));
        } else if (i4 == 6) {
            AnonymousClass1E1.A0T(view, i3);
        } else if (this.A0E && i4 == 5) {
            AnonymousClass1E1.A0T(view, i2);
        } else if (i4 == 4) {
            AnonymousClass1E1.A0T(view, this.A02);
        } else if (i4 == 1 || i4 == 2) {
            AnonymousClass1E1.A0T(view, top - view.getTop());
        }
        if (this.A09 == null) {
            this.A09 = new AFk(coordinatorLayout.getContext(), coordinatorLayout, this.A0P);
        }
        this.A0C = new WeakReference(view);
        this.A0B = new WeakReference(A0O(view));
        return true;
    }

    public final View A0O(View view) {
        if (AnonymousClass1E1.A0j(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View A0O2 = A0O(viewGroup.getChildAt(i));
            if (A0O2 != null) {
                return A0O2;
            }
        }
        return null;
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C712039k.A05);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            A0Q(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            A0Q(i2);
        }
        this.A0E = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        if (this.A0D != z) {
            this.A0D = z;
            if (this.A0C != null) {
                A02();
            }
            if (!z || this.A07 != 6) {
                i = this.A07;
            } else {
                i = 3;
            }
            A0S(i);
        }
        this.A0G = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.A00 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
