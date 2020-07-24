package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1SD;
import p000X.C157546oA;
import p000X.C2111898z;
import p000X.C35491gS;
import p000X.C51052Iz;
import p000X.C55812bQ;
import p000X.C57632eW;
import p000X.C710538t;
import p000X.C710638u;
import p000X.C711839i;
import p000X.C711939j;
import p000X.C712039k;
import p000X.C712239m;
import p000X.C712339n;

@CoordinatorLayout.DefaultBehavior(Behavior.class)
public class AppBarLayout extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C35491gS A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;

    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02 = -1;
        public ValueAnimator A03;
        public WeakReference A04;
        public boolean A05;
        public int A06;

        private void A03(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(A0R() - i);
            float abs2 = Math.abs(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (abs2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int A0R = A0R();
            if (A0R == i) {
                ValueAnimator valueAnimator = this.A03;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A03.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.A03;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.A03 = valueAnimator3;
                valueAnimator3.setInterpolator(C2111898z.A00);
                this.A03.addUpdateListener(new C157546oA(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.A03.setDuration((long) Math.min(height, 600));
            this.A03.setIntValues(new int[]{A0R, i});
            this.A03.start();
        }

        public final /* bridge */ /* synthetic */ boolean A0N(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i5 = i;
            int i6 = i2;
            int i7 = i4;
            if (((C51052Iz) appBarLayout.getLayoutParams()).height != -2) {
                return super.A0N(coordinatorLayout2, appBarLayout, i5, i6, i3, i7);
            }
            coordinatorLayout2.A0G(appBarLayout, i5, i6, View.MeasureSpec.makeMeasureSpec(0, 0), i7);
            return true;
        }

        public void A0Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout2 = appBarLayout;
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                A0U(coordinatorLayout2, appBarLayout2, A0R() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
                if (i5 == 1 && A0R() == 0) {
                    AnonymousClass1E1.A0M(view);
                }
            }
            if (appBarLayout.A07) {
                boolean z = false;
                if (view.getScrollY() > 0) {
                    z = true;
                }
                if (appBarLayout.A09 != z) {
                    appBarLayout.A09 = z;
                    appBarLayout.refreshDrawableState();
                }
            }
        }

        /* renamed from: A0b */
        public boolean A0M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int round;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            AppBarLayout appBarLayout2 = appBarLayout;
            boolean A0M = super.A0M(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.A02;
            int i3 = this.A02;
            if (i3 >= 0 && (i2 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.A05) {
                    round = childAt.getMinimumHeight() + appBarLayout.getTopInset();
                } else {
                    round = Math.round(((float) childAt.getHeight()) * this.A00);
                }
                A0W(coordinatorLayout, appBarLayout, i4 + round);
            } else if (i2 != 0) {
                boolean z = false;
                if ((i2 & 4) != 0) {
                    z = true;
                }
                if ((i2 & 2) != 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    if (z) {
                        A03(coordinatorLayout, appBarLayout, i5);
                    } else {
                        A0W(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((i2 & 1) != 0) {
                    if (z) {
                        A03(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A0W(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.A02 = 0;
            this.A02 = -1;
            A0Q(C57632eW.A00(A0O(), -appBarLayout.getTotalScrollRange(), 0));
            A05(this, coordinatorLayout2, appBarLayout2, A0O(), 0, true);
            appBarLayout.A00(A0O());
            return A0M;
        }

        public class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR = new C55812bQ();
            public float A00;
            public int A01;
            public boolean A02;

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.A01);
                parcel.writeFloat(this.A00);
                parcel.writeByte(this.A02 ? (byte) 1 : 0);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.A01 = parcel.readInt();
                this.A00 = parcel.readFloat();
                this.A02 = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public final /* bridge */ /* synthetic */ Parcelable A0K(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable A0K = super.A0K(coordinatorLayout, appBarLayout);
            int A0O = A0O();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + A0O;
                if (childAt.getTop() + A0O > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(A0K);
                    savedState.A01 = i;
                    if (bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.A02 = z;
                    savedState.A00 = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return A0K;
        }

        public final /* bridge */ /* synthetic */ void A0L(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.A0L(coordinatorLayout, appBarLayout, savedState.A00);
                this.A02 = savedState.A01;
                this.A00 = savedState.A00;
                this.A05 = savedState.A02;
                return;
            }
            super.A0L(coordinatorLayout, appBarLayout, parcelable);
            this.A02 = -1;
        }

        public void A0Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.A06 == 0 || i == 1) {
                A04(this, coordinatorLayout, appBarLayout);
            }
            this.A04 = new WeakReference(view);
        }

        public void A0a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                AppBarLayout appBarLayout2 = appBarLayout;
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i5 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = A0U(coordinatorLayout, appBarLayout2, A0R() - i2, i4, i5);
                    if (i3 == 1) {
                        int A0R = A0R();
                        if ((i2 < 0 && A0R == 0) || (i2 > 0 && A0R == (-appBarLayout.getDownNestedScrollRange()))) {
                            AnonymousClass1E1.A0M(view);
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
            if ((r4.getHeight() - r6.getHeight()) > r5.getHeight()) goto L_0x0022;
         */
        public boolean A0c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            boolean z2;
            if ((i & 2) != 0) {
                if (!appBarLayout.A07) {
                    boolean z3 = false;
                    if (appBarLayout.getTotalScrollRange() != 0) {
                        z3 = true;
                    }
                    if (z3) {
                        z2 = true;
                    }
                    z2 = false;
                }
                z = true;
                if (z && (valueAnimator = this.A03) != null) {
                    valueAnimator.cancel();
                }
                this.A04 = null;
                this.A06 = i2;
                return z;
            }
            z = false;
            valueAnimator.cancel();
            this.A04 = null;
            this.A06 = i2;
            return z;
        }

        public static void A04(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int A0R = baseBehavior.A0R();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C712339n r4 = (C712339n) childAt.getLayoutParams();
                boolean z = false;
                if ((r4.A00 & 32) == 32) {
                    z = true;
                }
                if (z) {
                    top -= r4.topMargin;
                    bottom += r4.bottomMargin;
                }
                int i2 = -A0R;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                C712339n r7 = (C712339n) childAt2.getLayoutParams();
                int i3 = r7.A00;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        i5 += appBarLayout.getTopInset();
                    }
                    boolean z2 = false;
                    if ((i3 & 2) == 2) {
                        z2 = true;
                    }
                    if (z2) {
                        i5 += childAt2.getMinimumHeight();
                    } else {
                        boolean z3 = false;
                        if ((i3 & 5) == 5) {
                            z3 = true;
                        }
                        if (z3) {
                            int minimumHeight = childAt2.getMinimumHeight() + i5;
                            if (A0R < minimumHeight) {
                                i4 = minimumHeight;
                            } else {
                                i5 = minimumHeight;
                            }
                        }
                    }
                    boolean z4 = false;
                    if ((i3 & 32) == 32) {
                        z4 = true;
                    }
                    if (z4) {
                        i4 += r7.topMargin;
                        i5 -= r7.bottomMargin;
                    }
                    if (A0R < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    baseBehavior.A03(coordinatorLayout, appBarLayout, C57632eW.A00(i4, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            if (r2 < r1) goto L_0x0041;
         */
        public static void A05(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            boolean z3;
            View view2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            if (view != null) {
                int i4 = ((C712339n) view.getLayoutParams()).A00;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    if ((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) {
                        int i5 = -i;
                        int bottom = (view.getBottom() - minimumHeight) - appBarLayout.getTopInset();
                        z2 = true;
                    }
                }
                z2 = false;
                if (appBarLayout.A07) {
                    int childCount2 = coordinatorLayout.getChildCount();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= childCount2) {
                            view2 = null;
                            break;
                        }
                        view2 = coordinatorLayout.getChildAt(i6);
                        if (view2 instanceof AnonymousClass1SD) {
                            break;
                        }
                        i6++;
                    }
                    if (view2 != null) {
                        z2 = false;
                        if (view2.getScrollY() > 0) {
                            z2 = true;
                        }
                    }
                }
                if (appBarLayout.A09 != z2) {
                    appBarLayout.A09 = z2;
                    appBarLayout.refreshDrawableState();
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z) {
                    if (z3) {
                        List list = (List) coordinatorLayout.A0C.A00.get(appBarLayout);
                        coordinatorLayout.A0D.clear();
                        if (list != null) {
                            coordinatorLayout.A0D.addAll(list);
                        }
                        List list2 = coordinatorLayout.A0D;
                        int size = list2.size();
                        boolean z4 = false;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                break;
                            }
                            CoordinatorLayout.Behavior behavior = ((C51052Iz) ((View) list2.get(i7)).getLayoutParams()).A0B;
                            if (!(behavior instanceof ScrollingViewBehavior)) {
                                i7++;
                            } else if (((ScrollingViewBehavior) behavior).A00 != 0) {
                                z4 = true;
                            }
                        }
                        if (!z4) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public final int A0S(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.A0S(view);
        }

        public boolean A0G(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((C51052Iz) view2.getLayoutParams()).A0B;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).A01 + this.A01;
                int i = 0;
                if (this.A00 != 0) {
                    float A0R = A0R(view2);
                    int i2 = this.A00;
                    i = C57632eW.A00((int) (A0R * ((float) i2)), 0, i2);
                }
                AnonymousClass1E1.A0T(view, bottom - i);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.A07) {
                return false;
            }
            boolean z = false;
            if (view.getScrollY() > 0) {
                z = true;
            }
            if (appBarLayout.A09 == z) {
                return false;
            }
            appBarLayout.A09 = z;
            appBarLayout.refreshDrawableState();
            return false;
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C712039k.A0K);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final void A02(boolean z, boolean z2) {
        int i = 2;
        if (z) {
            i = 1;
        }
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        this.A02 = i | i2 | 8;
        requestLayout();
    }

    public float getTargetElevation() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public final void A00(int i) {
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C710638u r0 = (C710638u) this.A05.get(i2);
                if (r0 != null) {
                    r0.BDD(this, i);
                }
            }
        }
    }

    public final void A01(C710538t r2) {
        if (this.A05 == null) {
            this.A05 = new ArrayList();
        }
        if (r2 != null && !this.A05.contains(r2)) {
            this.A05.add(r2);
        }
    }

    public int getDownNestedPreScrollRange() {
        int topInset;
        int i = this.A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C712339n r4 = (C712339n) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = r4.A00;
            if ((i3 & 5) == 5) {
                int i4 = i2 + r4.topMargin + r4.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 = i4 + childAt.getMinimumHeight();
                } else {
                    if ((i3 & 2) != 0) {
                        topInset = childAt.getMinimumHeight();
                    } else {
                        topInset = getTopInset();
                    }
                    i2 = i4 + (measuredHeight - topInset);
                }
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.A00 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C712339n r3 = (C712339n) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + r3.topMargin + r3.bottomMargin;
            int i4 = r3.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= childAt.getMinimumHeight() + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A01 = max;
        return max;
    }

    public final int getTopInset() {
        C35491gS r0 = this.A04;
        if (r0 != null) {
            return r0.A06();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A03;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C712339n r3 = (C712339n) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = r3.A00;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + r3.topMargin + r3.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.A03 = max;
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r1 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 == false) goto L_0x0029;
     */
    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.A0A == null) {
            this.A0A = new int[4];
        }
        int[] iArr = this.A0A;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.A08;
        int i4 = -C0003R.attr.state_liftable;
        if (z) {
            i4 = C0003R.attr.state_liftable;
        }
        iArr[0] = i4;
        if (z) {
            boolean z2 = this.A09;
            i2 = C0003R.attr.state_lifted;
        }
        i2 = -C0003R.attr.state_lifted;
        iArr[1] = i2;
        int i5 = -C0003R.attr.state_collapsible;
        if (z) {
            i5 = C0003R.attr.state_collapsible;
        }
        iArr[2] = i5;
        if (z) {
            boolean z3 = this.A09;
            i3 = C0003R.attr.state_collapsed;
        }
        i3 = -C0003R.attr.state_collapsed;
        iArr[3] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C711839i.A01(this, f);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C712339n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight << 1) + topInset;
    }

    public int getPendingAction() {
        return this.A02;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r0 != false) goto L_0x004a;
     */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
        boolean z3 = false;
        this.A06 = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C712339n) getChildAt(i5).getLayoutParams()).A01 != null) {
                this.A06 = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.A07) {
            int childCount2 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount2) {
                    z2 = false;
                    break;
                }
                int i7 = ((C712339n) getChildAt(i6).getLayoutParams()).A00;
                boolean z4 = true;
                if ((i7 & 1) != 1 || (i7 & 10) == 0) {
                    z4 = false;
                }
                if (z4) {
                    z2 = true;
                    break;
                }
                i6++;
            }
        }
        z3 = true;
        if (this.A08 != z3) {
            this.A08 = z3;
            refreshDrawableState();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    public void setExpanded(boolean z) {
        A02(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.A07 = z;
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = 0;
        setOrientation(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C711839i.A00(this);
            C711839i.A02(this, attributeSet);
        }
        TypedArray A002 = C711939j.A00(context2, attributeSet2, C712039k.A00, 0, 2131886884, new int[0]);
        AnonymousClass1E1.A0a(this, A002.getDrawable(0));
        if (A002.hasValue(4)) {
            this.A02 = (A002.getBoolean(4, false) ? 1 : 2) | 0 | 0;
            requestLayout();
        }
        if (i >= 21 && A002.hasValue(3)) {
            C711839i.A01(this, (float) A002.getDimensionPixelSize(3, 0));
        }
        if (i >= 26) {
            if (A002.hasValue(2)) {
                setKeyboardNavigationCluster(A002.getBoolean(2, false));
            }
            if (A002.hasValue(1)) {
                setTouchscreenBlocksFocus(A002.getBoolean(1, false));
            }
        }
        this.A07 = A002.getBoolean(5, false);
        A002.recycle();
        AnonymousClass1E1.A0c(this, new C712239m(this));
    }

    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
