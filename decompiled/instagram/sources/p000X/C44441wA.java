package p000X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1wA  reason: invalid class name and case insensitive filesystem */
public class C44441wA extends AnonymousClass1YC {
    public ReboundViewPager A00;

    public final boolean A06(View view, int i, Bundle bundle) {
        int i2;
        ReboundViewPager reboundViewPager;
        if (i == 4096) {
            if (this.A00.canScrollHorizontally(1)) {
                reboundViewPager = this.A00;
                i2 = reboundViewPager.A05 + 1;
            }
            return false;
        } else if (i != 8192) {
            return super.A06(view, i, bundle);
        } else {
            if (this.A00.canScrollHorizontally(-1)) {
                reboundViewPager = this.A00;
                i2 = reboundViewPager.A05 - 1;
            }
            return false;
        }
        reboundViewPager.A0I(i2);
        ReboundViewPager reboundViewPager2 = this.A00;
        reboundViewPager2.A0J(reboundViewPager2.A05, i2);
        return false;
    }

    public C44441wA(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
        if (reboundViewPager.getImportantForAccessibility() == 0) {
            AnonymousClass1E1.A0V(this.A00, 1);
        }
    }

    public final void A05(View view, C49532Cp r3) {
        super.A05(view, r3);
        r3.A06(4096);
        r3.A06(8192);
    }

    public final boolean A07(View view, AccessibilityEvent accessibilityEvent) {
        View view2;
        if (accessibilityEvent.getEventType() == 4096 || (view2 = this.A00.A0C) == null) {
            return super.A07(view, accessibilityEvent);
        }
        return view2.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean A08(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            viewGroup.postDelayed(new AnonymousClass5QR(this, viewGroup), 1000);
        }
        return super.A08(viewGroup, view, accessibilityEvent);
    }
}
