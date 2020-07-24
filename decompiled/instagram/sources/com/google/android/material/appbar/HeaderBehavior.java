package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.forker.Process;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import p000X.C23274AFt;
import p000X.C51052Iz;
import p000X.C57632eW;
import p000X.C712339n;

public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public VelocityTracker A00;
    public OverScroller A01;
    public Runnable A02;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public boolean A06;

    public void A0V(CoordinatorLayout coordinatorLayout, View view) {
        if (this instanceof AppBarLayout.BaseBehavior) {
            AppBarLayout.BaseBehavior.A04((AppBarLayout.BaseBehavior) this, coordinatorLayout, (AppBarLayout) view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r1 = (android.view.View) r0.get();
     */
    public boolean A0X(View view) {
        View view2;
        if (!(this instanceof AppBarLayout.BaseBehavior)) {
            return false;
        }
        WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).A04;
        return weakReference == null || (view2 != null && view2.isShown() && !view2.canScrollVertically(-1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != 3) goto L_0x002e;
     */
    public boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.A05 < 0) {
            this.A05 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.A06) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.A03;
                    if (!(i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1)) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.A04) > this.A05) {
                            this.A06 = true;
                            this.A04 = y;
                        }
                    }
                }
            }
            this.A06 = false;
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A00;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A00 = null;
            }
        } else {
            this.A06 = false;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (A0X(view) && coordinatorLayout.A0J(view, x, y2)) {
                this.A04 = y2;
                this.A03 = motionEvent.getPointerId(0);
                if (this.A00 == null) {
                    this.A00 = VelocityTracker.obtain();
                }
            }
        }
        VelocityTracker velocityTracker2 = this.A00;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r8 != 3) goto L_0x002b;
     */
    public boolean A0I(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        if (this.A05 < 0) {
            this.A05 = ViewConfiguration.get(coordinatorLayout2.getContext()).getScaledTouchSlop();
        }
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        View view2 = view;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.A00;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent2);
                    this.A00.computeCurrentVelocity(1000);
                    float yVelocity = this.A00.getYVelocity(this.A03);
                    int i2 = -A0T(view2);
                    Runnable runnable = this.A02;
                    if (runnable != null) {
                        view2.removeCallbacks(runnable);
                        this.A02 = null;
                    }
                    if (this.A01 == null) {
                        this.A01 = new OverScroller(view2.getContext());
                    }
                    this.A01.fling(0, A0O(), 0, Math.round(yVelocity), 0, 0, i2, 0);
                    if (this.A01.computeScrollOffset()) {
                        C23274AFt aFt = new C23274AFt(this, coordinatorLayout2, view2);
                        this.A02 = aFt;
                        view2.postOnAnimation(aFt);
                    } else {
                        A0V(coordinatorLayout2, view2);
                    }
                }
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.A03);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.A04 - y;
                    if (!this.A06 && Math.abs(i3) > (i = this.A05)) {
                        this.A06 = true;
                        i3 = i3 > 0 ? i3 - i : i3 + i;
                    }
                    if (this.A06) {
                        this.A04 = y;
                        A0U(coordinatorLayout2, view2, A0R() - i3, A0S(view2), 0);
                    }
                }
                return false;
            }
            this.A06 = false;
            this.A03 = -1;
            VelocityTracker velocityTracker2 = this.A00;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A00 = null;
            }
        } else {
            int x = (int) motionEvent2.getX();
            int y2 = (int) motionEvent2.getY();
            if (coordinatorLayout2.A0J(view2, x, y2) && A0X(view2)) {
                this.A04 = y2;
                this.A03 = motionEvent2.getPointerId(0);
                if (this.A00 == null) {
                    this.A00 = VelocityTracker.obtain();
                }
            }
            return false;
        }
        VelocityTracker velocityTracker3 = this.A00;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent2);
        }
        return true;
    }

    public int A0R() {
        if (!(this instanceof AppBarLayout.BaseBehavior)) {
            return A0O();
        }
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        return baseBehavior.A0O() + baseBehavior.A01;
    }

    public int A0S(View view) {
        int downNestedScrollRange;
        if (!(this instanceof AppBarLayout.BaseBehavior)) {
            downNestedScrollRange = view.getHeight();
        } else {
            downNestedScrollRange = ((AppBarLayout) view).getDownNestedScrollRange();
        }
        return -downNestedScrollRange;
    }

    public int A0T(View view) {
        if (!(this instanceof AppBarLayout.BaseBehavior)) {
            return view.getHeight();
        }
        return ((AppBarLayout) view).getTotalScrollRange();
    }

    public int A0U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4;
        List list;
        int A002;
        View view2 = view;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (!(this instanceof AppBarLayout.BaseBehavior)) {
            int A0O = A0O();
            if (i2 == 0 || A0O < i6 || A0O > i7 || A0O == (A002 = C57632eW.A00(i5, i6, i7))) {
                return 0;
            }
            A0Q(A002);
            return A0O - A002;
        }
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        int A0R = baseBehavior.A0R();
        if (i2 == 0 || A0R < i6 || A0R > i7) {
            baseBehavior.A01 = 0;
        } else {
            int A003 = C57632eW.A00(i5, i6, i7);
            if (A0R != A003) {
                if (appBarLayout.A06) {
                    int abs = Math.abs(A003);
                    int childCount = appBarLayout.getChildCount();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= childCount) {
                            break;
                        }
                        View childAt = appBarLayout.getChildAt(i9);
                        C712339n r8 = (C712339n) childAt.getLayoutParams();
                        Interpolator interpolator = r8.A01;
                        if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                            i9++;
                        } else if (interpolator != null) {
                            int i10 = r8.A00;
                            if ((i10 & 1) != 0) {
                                i8 = childAt.getHeight() + r8.topMargin + r8.bottomMargin + 0;
                                if ((i10 & 2) != 0) {
                                    i8 -= childAt.getMinimumHeight();
                                }
                            }
                            if (childAt.getFitsSystemWindows()) {
                                i8 -= appBarLayout.getTopInset();
                            }
                            if (i8 > 0) {
                                float f = (float) i8;
                                i4 = Integer.signum(A003) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                            }
                        }
                    }
                }
                i4 = A003;
                boolean A0Q = baseBehavior.A0Q(i4);
                int i11 = A0R - A003;
                baseBehavior.A01 = A003 - i4;
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                if (!A0Q && appBarLayout.A06 && (list = (List) coordinatorLayout2.A0C.A00.get(appBarLayout)) != null && !list.isEmpty()) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        View view3 = (View) list.get(i12);
                        CoordinatorLayout.Behavior behavior = ((C51052Iz) view3.getLayoutParams()).A0B;
                        if (behavior != null) {
                            behavior.A0G(coordinatorLayout2, view3, appBarLayout);
                        }
                    }
                }
                appBarLayout.A00(baseBehavior.A0O());
                int i13 = 1;
                if (A003 < A0R) {
                    i13 = -1;
                }
                AppBarLayout.BaseBehavior.A05(baseBehavior, coordinatorLayout2, appBarLayout, A003, i13, false);
                return i11;
            }
        }
        return 0;
    }

    public final void A0W(CoordinatorLayout coordinatorLayout, View view, int i) {
        A0U(coordinatorLayout, view, i, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE);
    }

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
