package p000X;

import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1bH  reason: invalid class name and case insensitive filesystem */
public final class C32451bH extends C32461bI {
    public final /* synthetic */ ReboundViewPager A00;

    public C32451bH(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
    }

    public final void A00() {
        ReboundViewPager.A05(this.A00, false, false);
        ReboundViewPager reboundViewPager = this.A00;
        int i = reboundViewPager.A06;
        if (i < reboundViewPager.A09) {
            reboundViewPager.A09 = i;
        }
    }

    public final void onChanged() {
        ReboundViewPager.A05(this.A00, true, false);
        ReboundViewPager reboundViewPager = this.A00;
        reboundViewPager.A09 = reboundViewPager.A06;
    }

    public final void onInvalidated() {
        ReboundViewPager.A05(this.A00, true, false);
        ReboundViewPager reboundViewPager = this.A00;
        reboundViewPager.A09 = reboundViewPager.A06;
    }
}
