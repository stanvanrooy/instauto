package p000X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.p009ui.slidecardpageadapter.SlideCardViewModel;
import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;

/* renamed from: X.CCA */
public final class CCA extends C27341Hl implements C256519s, AnonymousClass1HM {
    public C27398CBr A00;
    public C27398CBr A01;
    public CD3 A02;
    public CDA A03;
    public ReboundViewPager A04;
    public CirclePageIndicator A05;
    public boolean A06;
    public AnonymousClass0C1 A07;

    public final void BDU(int i, int i2) {
    }

    public final void BDW(int i) {
    }

    public final void BDX(int i) {
    }

    public final void BDi(int i, int i2) {
    }

    public final void BLD(float f, float f2, C32501bN r3) {
    }

    public final void BLO(C32501bN r1, C32501bN r2) {
    }

    public final void BQW(int i, int i2) {
    }

    public final void BVp(View view) {
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.Bo1(false);
        r4.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
        r4.Bo0(false);
        r4.Bfb(new ColorDrawable(AnonymousClass1BA.A01(getContext(), C0003R.attr.backgroundColorPrimary)));
    }

    public final String getModuleName() {
        return "promote_native_nux";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void onViewCreated(View view, Bundle bundle) {
        SlideCardViewModel slideCardViewModel;
        FragmentActivity activity = getActivity();
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A02 = AT6;
        this.A03 = ((CC9) activity).AT7();
        this.A07 = AT6.A0Q;
        View view2 = view;
        this.A04 = (ReboundViewPager) view2.findViewById(C0003R.C0005id.switch_promote_nux_pager);
        this.A05 = (CirclePageIndicator) view2.findViewById(C0003R.C0005id.page_indicator);
        this.A04.A0L(this);
        this.A04.A0L(this.A05);
        ArrayList arrayList = new ArrayList();
        switch (this.A00.ordinal()) {
            case 3:
                CGJ cgj = this.A02.A0F;
                AnonymousClass0a4.A06(cgj);
                slideCardViewModel = SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_ad_credit, getContext().getString(C0003R.string.promote_edu_title_coupon, new Object[]{cgj.A03}), getContext().getString(C0003R.string.promote_edu_action_reach_people), getContext().getString(C0003R.string.promote_edu_content_coupon, new Object[]{cgj.A03, cgj.A02}), new C27391CBk(this));
            case 4:
                arrayList.add(SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_reach_new_people_v2, getContext().getString(C0003R.string.promote_edu_title_reach_people), getContext().getString(C0003R.string.promote_edu_action_reach_people), getContext().getString(C0003R.string.promote_edu_content_reach_people), new C27390CBj(this)));
                arrayList.add(SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_destination_profile_v2, getContext().getString(C0003R.string.promote_edu_title_profile), getContext().getString(C0003R.string.promote_edu_action_profile), getContext().getString(C0003R.string.promote_edu_content_profile), new CCC(this)));
                arrayList.add(SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_destination_website_v2, getContext().getString(C0003R.string.promote_edu_title_website), getContext().getString(C0003R.string.promote_edu_action_website), getContext().getString(C0003R.string.promote_edu_content_website), new CCE(this)));
                slideCardViewModel = SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_destination_direct, getContext().getString(C0003R.string.promote_edu_title_dm), getContext().getString(C0003R.string.promote_edu_action_dm), getContext().getString(C0003R.string.promote_edu_content_dm), new CCD(this));
            case 5:
                arrayList.add(SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_audience_auto, getContext().getString(C0003R.string.promote_edu_title_auto), getContext().getString(C0003R.string.promote_edu_action_auto), getContext().getString(C0003R.string.promote_edu_content_auto), new CCB(this)));
                if (this.A02.A0O == null) {
                    slideCardViewModel = SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_audience_manual, getContext().getString(C0003R.string.promote_edu_title_manual), getContext().getString(C0003R.string.promote_edu_action_manual), getContext().getString(C0003R.string.promote_edu_content_manual), new C27386CBf(this));
                }
                break;
            case 6:
                String string = getContext().getString(C0003R.string.promote_edu_title_budget);
                String string2 = getContext().getString(C0003R.string.promote_edu_action_budget);
                Context context = getContext();
                CD3 cd3 = this.A02;
                int i = cd3.A03;
                arrayList.add(SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_budget, string, string2, context.getString(C0003R.string.promote_edu_content_budget, new Object[]{CCH.A00((double) i, cd3.A01, cd3.A0f, 0)}), new C27389CBi(this)));
                arrayList.add(SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_edu_duration_v2, getContext().getString(C0003R.string.promote_edu_title_duration), getContext().getString(C0003R.string.promote_edu_action_duration), getContext().getString(C0003R.string.promote_edu_content_duration, new Object[]{Integer.valueOf(this.A02.A04)}), new C27388CBh(this)));
                String string3 = getContext().getString(C0003R.string.promote_edu_title_distribution);
                String string4 = getContext().getString(C0003R.string.promote_edu_action_distribution);
                Context context2 = getContext();
                boolean z = this.A02.A0u;
                int i2 = C0003R.string.promote_edu_content_distribution_feed_story;
                if (z) {
                    i2 = C0003R.string.promote_edu_content_distribution_feed_story_explore;
                }
                slideCardViewModel = SlideCardViewModel.A02(C0003R.C0004drawable.instagram_business_images_promote_stories_feed, string3, string4, context2.getString(i2), new C27387CBg(this));
                arrayList.add(slideCardViewModel);
                break;
        }
        arrayList.add(slideCardViewModel);
        AnonymousClass6PU r14 = new AnonymousClass6PU(arrayList, this.A04, C0003R.layout.promote_nux_slidecard_view, false);
        this.A04.setAdapter((Adapter) r14);
        boolean z2 = this.A06;
        if (!z2 || !this.A02.A0p) {
            if (z2 || this.A01 != C27398CBr.DESTINATION) {
                this.A05.A00(0, r14.getCount());
            } else {
                this.A05.A00(1, r14.getCount());
                this.A04.A0I(1);
            }
            this.A05.setVisibility(0);
        } else {
            this.A05.setVisibility(8);
            this.A04.setDraggingEnabled(false);
        }
        CCZ.A04(this.A02, this.A00);
        super.onViewCreated(view2, bundle);
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        C27398CBr cBr;
        int A022 = AnonymousClass0Z0.A02(503125305);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A07(bundle2, "arguments in nux fragment should never be null");
        AnonymousClass0a4.A07(bundle2.get("step"), "screen information in extra should never be null");
        this.A02 = ((C945346y) getActivity()).AT6();
        this.A01 = (C27398CBr) this.mArguments.get("step");
        boolean z = bundle2.getBoolean("is_enter_flow_nux");
        this.A06 = z;
        switch (this.A01.ordinal()) {
            case 7:
                if (z && this.A02.A0p) {
                    cBr = C27398CBr.NUX_COUPON;
                    break;
                } else {
                    cBr = C27398CBr.NUX_DESTINATION;
                    break;
                }
            case 8:
                cBr = C27398CBr.NUX_AUDIENCE;
                break;
            case 9:
                cBr = C27398CBr.NUX_BUDGET;
                break;
            default:
                super.onCreate(bundle);
                AnonymousClass0Z0.A09(-1679758556, A022);
        }
        this.A00 = cBr;
        super.onCreate(bundle);
        AnonymousClass0Z0.A09(-1679758556, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1479235887);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_nux_view, viewGroup, false);
        AnonymousClass0Z0.A09(1856206976, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-191358856);
        CCZ.A03(this.A02, this.A00);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1168228186, A022);
    }
}
