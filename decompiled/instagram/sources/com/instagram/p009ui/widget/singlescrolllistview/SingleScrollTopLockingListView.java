package com.instagram.p009ui.widget.singlescrolllistview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19r;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass2KI;
import p000X.C149546aW;
import p000X.C149556aY;

/* renamed from: com.instagram.ui.widget.singlescrolllistview.SingleScrollTopLockingListView */
public class SingleScrollTopLockingListView extends RefreshableListView implements AnonymousClass19r, AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public C149546aW A02;
    public Map A03;
    public GestureDetector A04;
    public boolean A05;
    public final float A06;

    public final void Ar3(int i, int i2, Intent intent) {
    }

    public final void AyU() {
    }

    public final void Ayk(View view) {
    }

    public final void Azd() {
        this.A03 = null;
    }

    public final void Azh() {
        this.A04 = null;
    }

    public final void BE0() {
    }

    public final void BJx() {
    }

    public final void BKp(Bundle bundle) {
    }

    public final void BP6() {
    }

    public final void BVf(View view, Bundle bundle) {
    }

    public final void BVv(Bundle bundle) {
    }

    public final void onStart() {
    }

    private String A00(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": mediaItemsInCache=");
        sb.append(this.A03.keySet().size());
        sb.append(", firstVisiblePosition=");
        sb.append(getFirstVisiblePosition());
        sb.append(", lastVisiblePosition=");
        sb.append(getLastVisiblePosition());
        sb.append(", currentMediaId=");
        AnonymousClass1NJ A002 = C149546aW.A00(this.A02);
        if (A002 != null) {
            str2 = A002.getId();
        } else {
            str2 = null;
        }
        sb.append(str2);
        return sb.toString();
    }

    private void A01() {
        String str;
        int currentViewHeight;
        AnonymousClass1NJ A002 = C149546aW.A00(this.A02);
        if (A002 != null) {
            str = A002.getId();
        } else {
            str = null;
        }
        if (str != null && (currentViewHeight = getCurrentViewHeight()) != -1) {
            if (!this.A03.containsKey(str) || currentViewHeight != ((Integer) this.A03.get(str)).intValue()) {
                this.A03.put(str, Integer.valueOf(currentViewHeight));
            }
        }
    }

    private View getCurrentMediaFooterView() {
        return getChildAt(this.A02.A01() - getFirstVisiblePosition());
    }

    private int getCurrentViewHeight() {
        View childAt = getChildAt(this.A02.A02() - getFirstVisiblePosition());
        View childAt2 = getChildAt(this.A02.A01() - getFirstVisiblePosition());
        if (childAt == null || childAt2 == null) {
            return -1;
        }
        return childAt2.getBottom() - childAt.getTop();
    }

    public final void A06() {
        View currentMediaFooterView = getCurrentMediaFooterView();
        if (currentMediaFooterView != null) {
            smoothScrollBy(currentMediaFooterView.getBottom() - this.A00, 700);
            return;
        }
        AnonymousClass0QD.A01("SingleScrollTopLockingListView", A00("scrollToNextItem_footerNotFound"));
        smoothScrollBy(getHeight() >> 1, 700);
    }

    public final void A07() {
        String str;
        String str2;
        String str3;
        int i;
        AnonymousClass1NJ A0K;
        C149546aW r5 = this.A02;
        AnonymousClass1NJ A002 = C149546aW.A00(r5);
        String str4 = null;
        if (A002 != null) {
            AnonymousClass2KI r0 = r5.A00.A01;
            if (A002 != null) {
                i = r0.APu(A002).getPosition();
            } else {
                i = -1;
            }
            if (i > 0 && (A0K = r5.A00.A01.A0K(i - 1)) != null) {
                str4 = A0K.APo();
            }
        }
        int i2 = 0;
        if (str4 == null || !this.A03.containsKey(str4)) {
            str = "SingleScrollTopLockingListView";
            if (str4 == null) {
                str2 = "scrollToPrevItem_prevItemNull";
            } else {
                str2 = "scrollToPrevItem_prevItemHeightNotCached";
            }
        } else {
            int intValue = ((Integer) this.A03.get(str4)).intValue();
            if (intValue <= 0) {
                str = "SingleScrollTopLockingListView";
                str2 = AnonymousClass000.A05("scrollToPrevItem_prevItemHeight=", intValue);
            } else {
                int i3 = intValue + this.A00;
                int A022 = this.A02.A02();
                int A012 = this.A02.A01();
                View childAt = getChildAt(A022 - getFirstVisiblePosition());
                View childAt2 = getChildAt(A012 - getFirstVisiblePosition());
                if (childAt != null && childAt.getTop() >= 0) {
                    i3 -= childAt.getTop();
                } else if (childAt2 != null && childAt2.getBottom() < getBottom()) {
                    Map map = this.A03;
                    AnonymousClass1NJ A003 = C149546aW.A00(this.A02);
                    if (A003 != null) {
                        str3 = A003.getId();
                    } else {
                        str3 = null;
                    }
                    Integer num = (Integer) map.get(str3);
                    if (num != null) {
                        i2 = num.intValue() - childAt2.getBottom();
                    }
                    i3 += i2;
                }
                smoothScrollBy(-i3, 700);
                return;
            }
        }
        AnonymousClass0QD.A01(str, A00(str2));
        smoothScrollBy(-(getHeight() >> 1), 700);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A04 != null) {
            A01();
            this.A05 = this.A04.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A05 || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(564055402);
        A01();
        AnonymousClass0Z0.A0A(2106638763, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0Z0.A0A(1618540188, AnonymousClass0Z0.A03(-244675548));
    }

    public void setScrollOffset(int i) {
        this.A00 = i;
    }

    public void setTopOffset(int i) {
        this.A01 = i;
    }

    public SingleScrollTopLockingListView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SingleScrollTopLockingListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleScrollTopLockingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new HashMap();
        Resources resources = getResources();
        this.A06 = TypedValue.applyDimension(1, (float) resources.getDimensionPixelSize(C0003R.dimen.fling_velocity_threshold_dp), resources.getDisplayMetrics());
        this.A04 = new GestureDetector(context, new C149556aY(this));
    }
}
