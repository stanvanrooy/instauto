package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;
import java.util.ArrayList;

/* renamed from: X.1Ya  reason: invalid class name and case insensitive filesystem */
public abstract class C31391Ya {
    public C31451Yg A00;
    public C31451Yg A01;
    public boolean A02 = false;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnonymousClass1Y7 A08;
    public C44661wY A09;
    public RecyclerView A0A;
    public boolean A0B = false;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E = false;
    public final C31431Ye A0F;
    public final C31431Ye A0G;

    public static int A0E(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824)) {
                        i2 = 0;
                        max = 0;
                    }
                }
                max = 0;
                return View.MeasureSpec.makeMeasureSpec(max, i5);
            }
            max = i4;
            i5 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
            return View.MeasureSpec.makeMeasureSpec(max, i5);
        }
        if (i4 < 0) {
            if (i4 != -1) {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i5 = Process.WAIT_RESULT_TIMEOUT;
                    }
                    return View.MeasureSpec.makeMeasureSpec(max, i5);
                }
                max = 0;
                return View.MeasureSpec.makeMeasureSpec(max, i5);
            }
        }
        max = i4;
        i5 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
        return View.MeasureSpec.makeMeasureSpec(max, i5);
        i5 = i2;
        return View.MeasureSpec.makeMeasureSpec(max, i5);
    }

    public void A0f(int i, AnonymousClass1Xu r2) {
    }

    public final void A0h(View view) {
        AnonymousClass1ZN r6 = (AnonymousClass1ZN) view.getLayoutParams();
        Rect A0L = this.A0A.A0L(view);
        int i = 0 + A0L.left + A0L.right;
        int i2 = 0 + A0L.top + A0L.bottom;
        int A0E2 = A0E(this.A06, this.A07, A0P() + A0Q() + r6.leftMargin + r6.rightMargin + i, r6.width, A1b());
        int A0E3 = A0E(this.A03, this.A04, A0U() + A0T() + r6.topMargin + r6.bottomMargin + i2, r6.height, A1c());
        if (A0z(view, A0E2, A0E3, r6)) {
            view.measure(A0E2, A0E3);
        }
    }

    public void A0n(AnonymousClass1PH r1, AnonymousClass1PH r2) {
    }

    public void A0v(RecyclerView recyclerView, int i, int i2) {
    }

    public boolean A0x() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        if (r0 <= r7) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        if (r1 != false) goto L_0x00a8;
     */
    public boolean A12(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        boolean z3;
        int[] iArr = new int[2];
        int A0P = A0P();
        int A0U = A0U();
        int A0Q = this.A06 - A0Q();
        int A0T = this.A03 - A0T();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - A0P;
        int min = Math.min(0, i);
        int i2 = top - A0U;
        int min2 = Math.min(0, i2);
        int i3 = width - A0Q;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - A0T);
        if (this.A0A.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        iArr[0] = max;
        iArr[1] = min2;
        int i4 = iArr[0];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int A0P2 = A0P();
                int A0U2 = A0U();
                int A0Q2 = this.A06 - A0Q();
                int A0T2 = this.A03 - A0T();
                Rect rect2 = this.A0A.A0u;
                RecyclerView.A08(focusedChild, rect2);
                if (rect2.left - i4 < A0Q2 && rect2.right - i4 > A0P2 && rect2.top - min2 < A0T2) {
                    int i5 = rect2.bottom - min2;
                    z3 = true;
                }
            }
            z3 = false;
        }
        if (!(i4 == 0 && min2 == 0)) {
            if (z) {
                recyclerView.scrollBy(i4, min2);
                return true;
            }
            recyclerView.A0l(i4, min2);
            return true;
        }
        return false;
    }

    public int A13(int i, C31291Xl r3, AnonymousClass1Xv r4) {
        return 0;
    }

    public int A14(int i, C31291Xl r3, AnonymousClass1Xv r4) {
        return 0;
    }

    public int A17(AnonymousClass1Xv r2) {
        return 0;
    }

    public int A18(AnonymousClass1Xv r2) {
        return 0;
    }

    public int A19(AnonymousClass1Xv r2) {
        return 0;
    }

    public int A1A(AnonymousClass1Xv r2) {
        return 0;
    }

    public int A1B(AnonymousClass1Xv r2) {
        return 0;
    }

    public int A1C(AnonymousClass1Xv r2) {
        return 0;
    }

    public Parcelable A1D() {
        return null;
    }

    public View A1E(View view, int i, C31291Xl r4, AnonymousClass1Xv r5) {
        return null;
    }

    public abstract AnonymousClass1ZN A1F();

    public void A1K(int i) {
    }

    public void A1L(int i) {
    }

    public void A1M(int i, int i2, AnonymousClass1Xv r3, AnonymousClass1Xu r4) {
    }

    public void A1O(Parcelable parcelable) {
    }

    public void A1S(AnonymousClass1Xv r1) {
    }

    public void A1T(RecyclerView recyclerView) {
    }

    public void A1U(RecyclerView recyclerView, int i, int i2) {
    }

    public void A1V(RecyclerView recyclerView, int i, int i2) {
    }

    public void A1W(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public boolean A1b() {
        return false;
    }

    public boolean A1c() {
        return false;
    }

    public boolean A1e() {
        return false;
    }

    public boolean A1f(AnonymousClass1ZN r2) {
        return r2 != null;
    }

    public static C30743Die A0H(Context context, AttributeSet attributeSet, int i, int i2) {
        C30743Die die = new C30743Die();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1YF.A05, i, i2);
        die.A00 = obtainStyledAttributes.getInt(0, 1);
        die.A01 = obtainStyledAttributes.getInt(10, 1);
        die.A02 = obtainStyledAttributes.getBoolean(9, false);
        die.A03 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return die;
    }

    public int A0P() {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A0Q() {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int A0R() {
        AnonymousClass1Y7 r0 = this.A08;
        if (r0 != null) {
            return r0.A02();
        }
        return 0;
    }

    public final int A0S() {
        AnonymousClass1PH r0;
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            r0 = recyclerView.A0J;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            return r0.getItemCount();
        }
        return 0;
    }

    public final int A0T() {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int A0U() {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View A0a(int i) {
        AnonymousClass1Y7 r0 = this.A08;
        if (r0 != null) {
            return r0.A03(i);
        }
        return null;
    }

    public final void A0b() {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void A0j(View view, Rect rect) {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0L(view));
        }
    }

    public final void A0m(View view, C31291Xl r5) {
        AnonymousClass1Y7 r2 = this.A08;
        int indexOfChild = r2.A01.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (r2.A00.A07(indexOfChild)) {
                AnonymousClass1Y7.A01(r2, view);
            }
            r2.A01.Bbc(indexOfChild);
        }
        r5.A06(view);
    }

    public final void A0q(C31291Xl r7) {
        int size = r7.A05.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AnonymousClass1ZK) r7.A05.get(i)).itemView;
            AnonymousClass1ZK A012 = RecyclerView.A01(view);
            if (!A012.shouldIgnore()) {
                A012.setIsRecyclable(false);
                if (A012.isTmpDetached()) {
                    this.A0A.removeDetachedView(view, false);
                }
                C31341Xr r0 = this.A0A.A0K;
                if (r0 != null) {
                    r0.A0A(A012);
                }
                A012.setIsRecyclable(true);
                AnonymousClass1ZK A013 = RecyclerView.A01(view);
                A013.mScrapContainer = null;
                A013.mInChangeScrap = false;
                A013.clearReturnedFromScrapFlag();
                r7.A08(A013);
            }
        }
        r7.A05.clear();
        ArrayList arrayList = r7.A04;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.A0A.invalidate();
        }
    }

    public void A0r(C31291Xl r2, AnonymousClass1Xv r3, int i, int i2) {
        this.A0A.A0j(i, i2);
    }

    public void A0s(C31291Xl r4, AnonymousClass1Xv r5, C49532Cp r6) {
        if (this.A0A.canScrollVertically(-1) || this.A0A.canScrollHorizontally(-1)) {
            r6.A06(8192);
            r6.A02.setScrollable(true);
        }
        if (this.A0A.canScrollVertically(1) || this.A0A.canScrollHorizontally(1)) {
            r6.A06(4096);
            r6.A02.setScrollable(true);
        }
        r6.A02.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C49562Cs.A00(A16(r4, r5), A15(r4, r5)).A00);
    }

    public final void A0t(C44661wY r7) {
        C44661wY r1 = this.A09;
        if (!(r1 == null || r7 == r1 || !r1.A05)) {
            r1.A01();
        }
        this.A09 = r7;
        RecyclerView recyclerView = this.A0A;
        C31351Xs r12 = recyclerView.A0Q;
        r12.A06.removeCallbacks(r12);
        r12.A03.abortAnimation();
        if (r7.A06) {
            String simpleName = r7.getClass().getSimpleName();
            Log.w("RecyclerView", AnonymousClass000.A0O("An instance of ", simpleName, " was started more than once. Each instance of", simpleName, " is intended to only be used once. You should create a new instance for each use."));
        }
        r7.A03 = recyclerView;
        r7.A02 = this;
        int i = r7.A00;
        if (i != -1) {
            recyclerView.A0y.A06 = i;
            r7.A05 = true;
            r7.A04 = true;
            r7.A01 = recyclerView.A0L.A0Z(i);
            r7.A03.A0Q.A00();
            r7.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void A0u(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.A0A = null;
            this.A08 = null;
            this.A06 = 0;
            this.A03 = 0;
        } else {
            this.A0A = recyclerView;
            this.A08 = recyclerView.A0H;
            this.A06 = recyclerView.getWidth();
            this.A03 = recyclerView.getHeight();
        }
        this.A07 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
        this.A04 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
    }

    public final boolean A0y() {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView == null || !recyclerView.A01) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.A01.A01(r4) == false) goto L_0x0012;
     */
    public final boolean A10(View view, boolean z) {
        boolean z2;
        if (this.A00.A01(view)) {
            z2 = true;
        }
        z2 = false;
        if (z) {
            return z2;
        }
        return !z2;
    }

    public boolean A11(C31291Xl r7, AnonymousClass1Xv r8, int i, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    i4 = (this.A03 - A0U()) - A0T();
                } else {
                    i4 = 0;
                }
                if (this.A0A.canScrollHorizontally(1)) {
                    i3 = (this.A06 - A0P()) - A0Q();
                }
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                if (recyclerView.canScrollVertically(-1)) {
                    i2 = -((this.A03 - A0U()) - A0T());
                } else {
                    i2 = 0;
                }
                if (this.A0A.canScrollHorizontally(-1)) {
                    i3 = -((this.A06 - A0P()) - A0Q());
                }
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.A0A.A0o(i3, i2, true);
                return true;
            }
        }
        return false;
    }

    public int A15(C31291Xl r4, AnonymousClass1Xv r5) {
        AnonymousClass1PH r1;
        RecyclerView recyclerView = this.A0A;
        if (recyclerView == null || (r1 = recyclerView.A0J) == null || !A1b()) {
            return 1;
        }
        return r1.getItemCount();
    }

    public int A16(C31291Xl r3, AnonymousClass1Xv r4) {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView == null || recyclerView.A0J == null || !A1c()) {
            return 1;
        }
        return this.A0A.A0J.getItemCount();
    }

    public AnonymousClass1ZN A1G(Context context, AttributeSet attributeSet) {
        return new AnonymousClass1ZN(context, attributeSet);
    }

    public AnonymousClass1ZN A1H(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof AnonymousClass1ZN) {
            return new AnonymousClass1ZN((AnonymousClass1ZN) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AnonymousClass1ZN((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AnonymousClass1ZN(layoutParams);
    }

    public void A1I(int i) {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            int A022 = recyclerView.A0H.A02();
            for (int i2 = 0; i2 < A022; i2++) {
                recyclerView.A0H.A03(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A1J(int i) {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            int A022 = recyclerView.A0H.A02();
            for (int i2 = 0; i2 < A022; i2++) {
                recyclerView.A0H.A03(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A1P(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A0A.canScrollVertically(-1) && !this.A0A.canScrollHorizontally(-1) && !this.A0A.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AnonymousClass1PH r0 = this.A0A.A0J;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.getItemCount());
            }
        }
    }

    public void A1Q(C31291Xl r3, AnonymousClass1Xv r4) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void A1Z(RecyclerView recyclerView, AnonymousClass1Xv r4, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void A1a(String str) {
        RecyclerView recyclerView = this.A0A;
        if (recyclerView != null) {
            recyclerView.A0z(str);
        }
    }

    public boolean A1d() {
        return this.A02;
    }

    public C31391Ya() {
        C31421Yd r2 = new C31421Yd(this);
        this.A0F = r2;
        C31441Yf r1 = new C31441Yf(this);
        this.A0G = r1;
        this.A00 = new C31451Yg(r2);
        this.A01 = new C31451Yg(r1);
    }

    public static int A0D(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, Math.max(i2, i3));
        }
        if (mode != 1073741824) {
            return Math.max(i2, i3);
        }
        return size;
    }

    public static final int A0F(View view) {
        Rect rect = ((AnonymousClass1ZN) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int A0G(View view) {
        return ((AnonymousClass1ZN) view.getLayoutParams()).A01.getLayoutPosition();
    }

    public static final void A0I(View view, int i, int i2, int i3, int i4) {
        AnonymousClass1ZN r2 = (AnonymousClass1ZN) view.getLayoutParams();
        Rect rect = r2.A03;
        view.layout(i + rect.left + r2.leftMargin, i2 + rect.top + r2.topMargin, (i3 - rect.right) - r2.rightMargin, (i4 - rect.bottom) - r2.bottomMargin);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc  */
    public static void A0J(C31391Ya r8, View view, int i, boolean z) {
        int i2;
        int i3;
        AnonymousClass1ZK A012 = RecyclerView.A01(view);
        if (z || A012.isRemoved()) {
            C31301Xm r2 = r8.A0A.A10;
            C35541gX r1 = (C35541gX) r2.A01.get(A012);
            if (r1 == null) {
                r1 = C35541gX.A00();
                r2.A01.put(A012, r1);
            }
            r1.A00 |= 1;
        } else {
            r8.A0A.A10.A01(A012);
        }
        AnonymousClass1ZN r5 = (AnonymousClass1ZN) view.getLayoutParams();
        if (A012.wasReturnedFromScrap() || A012.isScrap()) {
            if (A012.isScrap()) {
                A012.unScrap();
            } else {
                A012.clearReturnedFromScrapFlag();
            }
            r8.A08.A05(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == r8.A0A) {
            AnonymousClass1Y7 r12 = r8.A08;
            int indexOfChild = r12.A01.indexOfChild(view);
            if (indexOfChild != -1) {
                AnonymousClass1YA r13 = r12.A00;
                if (!r13.A06(indexOfChild)) {
                    i3 = indexOfChild - r13.A01(indexOfChild);
                    if (i == -1) {
                        i = r8.A08.A02();
                    }
                    if (i3 != -1) {
                        throw new IllegalStateException(AnonymousClass000.A06("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:", r8.A0A.indexOfChild(view), r8.A0A.A0R()));
                    } else if (i3 != i) {
                        C31391Ya r6 = r8.A0A.A0L;
                        View A0a = r6.A0a(i3);
                        if (A0a != null) {
                            r6.A0c(i3);
                            r6.A0i(A0a, i);
                        } else {
                            throw new IllegalArgumentException(AnonymousClass000.A06("Cannot move a child from non-existing index:", i3, r6.A0A.toString()));
                        }
                    }
                }
            }
            i3 = -1;
            if (i == -1) {
            }
            if (i3 != -1) {
            }
        } else {
            r8.A08.A06(view, i, false);
            r5.A02 = true;
            C44661wY r22 = r8.A09;
            if (r22 != null && r22.A05) {
                AnonymousClass1ZK A013 = RecyclerView.A01(view);
                if (A013 != null) {
                    i2 = A013.getLayoutPosition();
                } else {
                    i2 = -1;
                }
                if (i2 == r22.A00) {
                    r22.A01 = view;
                }
            }
        }
        if (r5.A00) {
            A012.itemView.invalidate();
            r5.A00 = false;
        }
    }

    public static boolean A0K(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public final int A0V(View view) {
        return view.getBottom() + ((AnonymousClass1ZN) view.getLayoutParams()).A03.bottom;
    }

    public final int A0W(View view) {
        return view.getLeft() - ((AnonymousClass1ZN) view.getLayoutParams()).A03.left;
    }

    public final int A0X(View view) {
        return view.getRight() + ((AnonymousClass1ZN) view.getLayoutParams()).A03.right;
    }

    public final int A0Y(View view) {
        return view.getTop() - ((AnonymousClass1ZN) view.getLayoutParams()).A03.top;
    }

    public View A0Z(int i) {
        int A0R = A0R();
        for (int i2 = 0; i2 < A0R; i2++) {
            View A0a = A0a(i2);
            AnonymousClass1ZK A012 = RecyclerView.A01(A0a);
            if (A012 != null && A012.getLayoutPosition() == i && !A012.shouldIgnore() && (this.A0A.A0y.A08 || !A012.isRemoved())) {
                return A0a;
            }
        }
        return null;
    }

    public final void A0c(int i) {
        A0a(i);
        AnonymousClass1Y7 r2 = this.A08;
        int A002 = AnonymousClass1Y7.A00(r2, i);
        r2.A00.A07(A002);
        r2.A01.ABw(A002);
    }

    public final void A0d(int i, int i2) {
        int A0R = A0R();
        if (A0R == 0) {
            this.A0A.A0j(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Process.WAIT_RESULT_TIMEOUT;
        int i6 = Process.WAIT_RESULT_TIMEOUT;
        for (int i7 = 0; i7 < A0R; i7++) {
            View A0a = A0a(i7);
            Rect rect = this.A0A.A0u;
            RecyclerView.A08(A0a, rect);
            int i8 = rect.left;
            if (i8 < i3) {
                i3 = i8;
            }
            int i9 = rect.right;
            if (i9 > i5) {
                i5 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i6) {
                i6 = i11;
            }
        }
        this.A0A.A0u.set(i3, i4, i5, i6);
        A1N(this.A0A.A0u, i, i2);
    }

    public final void A0e(int i, int i2) {
        this.A06 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A07 = mode;
        if (mode == 0 && !RecyclerView.A19) {
            this.A06 = 0;
        }
        this.A03 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A04 = mode2;
        if (mode2 == 0 && !RecyclerView.A19) {
            this.A03 = 0;
        }
    }

    public final void A0g(int i, C31291Xl r4) {
        View A0a = A0a(i);
        if (A0a(i) != null) {
            this.A08.A04(i);
        }
        r4.A06(A0a);
    }

    public final void A0i(View view, int i) {
        AnonymousClass1ZN r3 = (AnonymousClass1ZN) view.getLayoutParams();
        AnonymousClass1ZK A012 = RecyclerView.A01(view);
        if (A012.isRemoved()) {
            C31301Xm r2 = this.A0A.A10;
            C35541gX r1 = (C35541gX) r2.A01.get(A012);
            if (r1 == null) {
                r1 = C35541gX.A00();
                r2.A01.put(A012, r1);
            }
            r1.A00 |= 1;
        } else {
            this.A0A.A10.A01(A012);
        }
        this.A08.A05(view, i, r3, A012.isRemoved());
    }

    public final void A0k(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((AnonymousClass1ZN) view.getLayoutParams()).A03;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.A0A == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A0A.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A0l(View view, C49532Cp r4) {
        AnonymousClass1ZK A012 = RecyclerView.A01(view);
        if (A012 != null && !A012.isRemoved()) {
            AnonymousClass1Y7 r0 = this.A08;
            if (!r0.A02.contains(A012.itemView)) {
                RecyclerView recyclerView = this.A0A;
                A1R(recyclerView.A0x, recyclerView.A0y, view, r4);
            }
        }
    }

    public final void A0o(C31291Xl r5) {
        for (int A0R = A0R() - 1; A0R >= 0; A0R--) {
            View A0a = A0a(A0R);
            AnonymousClass1ZK A012 = RecyclerView.A01(A0a);
            if (!A012.shouldIgnore()) {
                if (!A012.isInvalid() || A012.isRemoved() || this.A0A.A0J.hasStableIds()) {
                    A0c(A0R);
                    r5.A07(A0a);
                    this.A0A.A10.A01(A012);
                } else {
                    if (A0a(A0R) != null) {
                        this.A08.A04(A0R);
                    }
                    r5.A08(A012);
                }
            }
        }
    }

    public final void A0p(C31291Xl r3) {
        for (int A0R = A0R() - 1; A0R >= 0; A0R--) {
            if (!RecyclerView.A01(A0a(A0R)).shouldIgnore()) {
                A0g(A0R, r3);
            }
        }
    }

    public final boolean A0z(View view, int i, int i2, AnonymousClass1ZN r6) {
        if (view.isLayoutRequested() || !A0K(view.getWidth(), i, r6.width) || !A0K(view.getHeight(), i2, r6.height)) {
            return true;
        }
        return false;
    }

    public void A1N(Rect rect, int i, int i2) {
        int width = rect.width() + A0P() + A0Q();
        int height = rect.height() + A0U() + A0T();
        this.A0A.setMeasuredDimension(A0D(i, width, this.A0A.getMinimumWidth()), A0D(i2, height, this.A0A.getMinimumHeight()));
    }

    public void A1R(C31291Xl r4, AnonymousClass1Xv r5, View view, C49532Cp r7) {
        int i;
        int i2;
        if (A1c()) {
            i = A0G(view);
        } else {
            i = 0;
        }
        if (A1b()) {
            i2 = A0G(view);
        } else {
            i2 = 0;
        }
        r7.A0J(AnonymousClass2F1.A01(i, 1, i2, 1));
    }

    public void A0w(boolean z) {
        this.A02 = z;
    }

    public void A1Y(RecyclerView recyclerView, C31291Xl r2) {
    }

    public void A1X(RecyclerView recyclerView, int i, int i2, Object obj) {
        A0v(recyclerView, i, i2);
    }
}
