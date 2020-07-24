package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.CD1 */
public final class CD1 extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, C27385CBe, C27516CGg {
    public View A00;
    public ViewStub A01;
    public CD8 A02;
    public CD3 A03;
    public CDA A04;
    public AnonymousClass0C1 A05;
    public boolean A06;
    public boolean A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public ViewStub A0E;
    public ViewStub A0F;
    public ViewStub A0G;
    public ImageView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public C26915Bue A0L;
    public CD2 A0M;
    public CDE A0N;
    public StepperHeader A0O;
    public SpinnerImageView A0P;

    public final String getModuleName() {
        return "promote_budget_duration";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00(int i, int i2) {
        TextView textView = this.A0K;
        CD3 cd3 = this.A03;
        textView.setText(getString(C0003R.string.promote_total_spend_text, CCH.A00((double) i, cd3.A01, cd3.A0f, 0), CCH.A01(getContext(), i2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    public static void A01(CD1 cd1) {
        Object A032;
        CD3 cd3 = cd1.A03;
        if (!cd3.A0v) {
            boolean z = true;
            if (!cd3.A03()) {
                if (!((String) AnonymousClass0L6.A02(cd1.A05, AnonymousClass0L7.SMB_ADS_GROWTH_HOLDOUT_2020_H1, "group_type", "test", (AnonymousClass04H) null)).equals("control")) {
                    A032 = AnonymousClass0L6.A02(cd1.A05, AnonymousClass0L7.PROMOTE_BUDGET_SCREEN_ADD_PAYMENT_ENTRY_POINT, "is_enabled", false, (AnonymousClass04H) null);
                }
                z = false;
                if (!z) {
                    return;
                }
            } else {
                AnonymousClass0C1 r3 = cd1.A05;
                AnonymousClass0L7 r2 = AnonymousClass0L7.PROMOTE_BUDGET_SCREEN_ADD_PAYMENT_ENTRY_POINT;
                if (((Boolean) AnonymousClass0L6.A03(r3, r2, "show_existing_payment", false, (AnonymousClass04H) null)).booleanValue()) {
                    A032 = AnonymousClass0L6.A03(cd1.A05, r2, "is_enabled", false, (AnonymousClass04H) null);
                }
                z = false;
                if (!z) {
                }
            }
        }
        boolean z2 = false;
        cd1.A0D.setVisibility(0);
        if (cd1.A0C == null) {
            cd1.A0C = cd1.A0G.inflate();
        }
        cd1.A0M.A00(cd1.A0C);
        if (cd1.A03.A0N != null) {
            cd1.A0A.setVisibility(0);
            if (cd1.A0B == null) {
                cd1.A0B = cd1.A0F.inflate();
            }
            cd1.A0M.A01(cd1.A0B);
        }
        C26915Bue bue = cd1.A0L;
        if (bue != null) {
            CD3 cd32 = cd1.A03;
            if (!cd32.A0v || cd32.A05()) {
                z2 = true;
            }
            bue.A01(z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r9.A05, p000X.AnonymousClass0L7.BUDGET_RECOMMENDATION_V1, "enable_warning_message_icon", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        r0 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r9.A05, p000X.AnonymousClass0L7.BUDGET_RECOMMENDATION_V1, "enable_budget_suggestion", false, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r9.A05, p000X.AnonymousClass0L7.BUDGET_RECOMMENDATION_V1, "enable_warning_message", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0046;
     */
    public static void A02(CD1 cd1) {
        boolean z;
        boolean z2;
        CD3 cd3;
        Map map;
        CD3 cd32 = cd1.A03;
        Map map2 = cd32.A0n;
        boolean z3 = true;
        int i = 0;
        if (map2 != null && map2.containsKey(Integer.valueOf(cd32.A05))) {
            CD3 cd33 = cd1.A03;
            if (((Integer) cd33.A0n.get(Integer.valueOf(cd33.A05))).intValue() >= cd1.A03.A02) {
                z = true;
            }
        }
        z = false;
        if (z) {
            z2 = true;
        }
        z2 = false;
        if (!z && (map = cd3.A0m) != null && map.containsKey(Integer.valueOf(cd3.A05))) {
            CD3 cd34 = cd1.A03;
            if (((Integer) cd34.A0m.get(Integer.valueOf(cd34.A05))).intValue() == cd1.A03.A02) {
            }
        }
        z3 = false;
        TextView textView = cd1.A0J;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        ImageView imageView = cd1.A0H;
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        TextView textView2 = cd1.A0I;
        if (!z3) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public static void A03(CD1 cd1, boolean z) {
        View view = cd1.A09;
        int i = 0;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        } else if (z) {
            CCZ.A08(cd1.A03, C27398CBr.BUDGET, "ad_account_budget_limit_warning");
            View inflate = cd1.A0E.inflate();
            cd1.A09 = inflate;
            inflate.findViewById(C0003R.C0005id.budget_ads_manager_link_text).setOnClickListener(new C27395CBo(cd1));
            cd1.A09.setVisibility(0);
        }
    }

    public static void A04(CD1 cd1, boolean z) {
        if (z) {
            cd1.A0P.setLoadingStatus(C168617Hz.LOADING);
            cd1.A08.setVisibility(8);
            return;
        }
        cd1.A0P.setLoadingStatus(C168617Hz.SUCCESS);
        cd1.A08.setVisibility(0);
    }

    public final void BGX(CDA cda, Integer num) {
        if (num == Constants.A0N || num == Constants.A0Y) {
            CD3 cd3 = this.A03;
            A00(cd3.A06, cd3.A05);
            A03(this, this.A03.A04());
            this.A0N.A01();
            A02(this);
        }
    }

    public final void BMj() {
        this.A04.A0E(false);
    }

    public final boolean onBackPressed() {
        CCZ.A07(this.A03, C27398CBr.BUDGET, "back_button");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004d, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A03(r5.A05, p000X.AnonymousClass0L7.BUDGET_RECOMMENDATION_V1, "should_fetch_budget_recommendations", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x004f;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        FragmentActivity activity = getActivity();
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A03 = AT6;
        CDA AT7 = ((CC9) activity).AT7();
        this.A04 = AT7;
        this.A05 = AT6.A0Q;
        AT7.A0C(this);
        this.A02 = new CD8(this.A03.A0Q, getActivity(), this);
        if (!this.A03.A02()) {
            z = true;
        }
        z = false;
        this.A07 = z;
        View view2 = view;
        this.A08 = view2.findViewById(C0003R.C0005id.budget_and_duration_content_view);
        this.A0O = (StepperHeader) view2.findViewById(C0003R.C0005id.stepper_header);
        this.A01 = (ViewStub) view2.findViewById(C0003R.C0005id.education_bar_stub);
        this.A0K = (TextView) view2.findViewById(C0003R.C0005id.total_spend_text_view);
        this.A0E = (ViewStub) view2.findViewById(C0003R.C0005id.budget_warning_stub);
        this.A0G = (ViewStub) view2.findViewById(C0003R.C0005id.unified_payment_row_view_stub);
        View findViewById = view2.findViewById(C0003R.C0005id.unified_payment_row_divider);
        this.A0D = findViewById;
        findViewById.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_background));
        this.A0F = (ViewStub) view2.findViewById(C0003R.C0005id.tax_info_row_stub);
        View findViewById2 = view2.findViewById(C0003R.C0005id.tax_info_row_divider);
        this.A0A = findViewById2;
        findViewById2.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_background));
        this.A0P = (SpinnerImageView) view2.findViewById(C0003R.C0005id.loading_spinner);
        this.A0J = (TextView) view2.findViewById(C0003R.C0005id.budget_recommendation_warning_text);
        this.A0H = (ImageView) view2.findViewById(C0003R.C0005id.budget_recommendation_warning_icon);
        this.A0I = (TextView) view2.findViewById(C0003R.C0005id.budget_recommendation_suggestion_text);
        this.A0M = new CD2(this.A03, getActivity(), this, C27398CBr.BUDGET);
        if (this.A04.A04) {
            A01(this);
        }
        if (this.A03.A0v) {
            this.A0O.setVisibility(8);
        } else {
            this.A0O.A04(2, this.A06);
        }
        this.A0N = new CDE(view2, this.A03, this.A04, this.A02);
        this.A0O.A02();
        View inflate = this.A01.inflate();
        this.A00 = inflate;
        ((TextView) inflate.findViewById(C0003R.C0005id.bottom_bar_text)).setText(C0003R.string.promote_budget_duration_education_bar_text);
        this.A00.setOnClickListener(new C27394CBn(this));
        CD3 cd3 = this.A03;
        A00(cd3.A06, cd3.A05);
        Context context = getContext();
        C27497CFn cFn = new C27497CFn(view2, "budget_slider");
        Context context2 = getContext();
        CD3 cd32 = this.A03;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) AnonymousClass0L6.A02(cd32.A0Q, AnonymousClass0L7.PROMOTE_BUDGET_OPTIONS_FROM_SERVER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            for (Integer intValue : cd32.A0i) {
                arrayList.add(context2.getString(C0003R.string.promote_budget_slider_knob_text, new Object[]{CCH.A00((double) intValue.intValue(), cd32.A01, cd32.A0f, 0)}));
            }
        } else {
            for (Integer intValue2 : CCH.A00) {
                arrayList.add(context2.getString(C0003R.string.promote_budget_slider_knob_text, new Object[]{CCH.A00((double) (intValue2.intValue() * cd32.A00), cd32.A01, cd32.A0f, 0)}));
            }
        }
        C27453CDv.A00(context, cFn, Collections.unmodifiableList(arrayList), this.A03, this.A04);
        Context context3 = getContext();
        C27497CFn cFn2 = new C27497CFn(view2, "duration_slider");
        Context context4 = getContext();
        ArrayList arrayList2 = new ArrayList();
        for (Integer intValue3 : CCH.A01) {
            arrayList2.add(CCH.A01(context4, intValue3.intValue()));
        }
        C27453CDv.A00(context3, cFn2, Collections.unmodifiableList(arrayList2), this.A03, this.A04);
        if (this.A03.A04()) {
            A03(this, true);
        }
        CD3 cd33 = this.A03;
        int i = cd33.A04;
        if (i == 0 || cd33.A03 == 0) {
            CCZ.A04(cd33, C27398CBr.BUDGET);
        } else {
            C27398CBr cBr = C27398CBr.BUDGET;
            HashMap hashMap = new HashMap();
            hashMap.put("default_duration_in_days", Integer.toString(i));
            hashMap.put("default_daily_budget_with_offset", Integer.toString(cd33.A03));
            AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A0Y);
            A002.A0G("step", cBr.toString());
            C06270Ok A003 = C06270Ok.A00();
            A003.A0C(hashMap);
            A002.A08("configurations", A003);
            CCZ.A0G(cd33, A002);
        }
        this.A0N.A01();
        super.onViewCreated(view2, bundle);
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        r5.BlI(C0003R.string.promote_budget_duration_screen_title);
        r5.Bo6(true);
        C26915Bue bue = new C26915Bue(getContext(), r5);
        this.A0L = bue;
        if (this.A03.A0v) {
            bue.A00(Constants.A12, new C27400CBt(this));
            this.A0L.A01(this.A03.A03());
            return;
        }
        bue.A00(Constants.ONE, new C27399CBs(this));
        this.A0L.A01(true);
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1812892182);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_budget_duration_view, viewGroup, false);
        AnonymousClass0Z0.A09(841214326, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1010820426);
        this.A09 = null;
        this.A0C = null;
        this.A0G = null;
        this.A0D = null;
        this.A0B = null;
        this.A0F = null;
        this.A0A = null;
        this.A0P = null;
        this.A0K = null;
        this.A0J = null;
        this.A0H = null;
        this.A0I = null;
        this.A04.A0D(this);
        CCZ.A03(this.A03, C27398CBr.BUDGET);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1662561482, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0Z0.A02(-282181572);
        super.onResume();
        if (!this.A04.A04) {
            this.A02.A04(new CDK(this));
        }
        if (this.A07) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(CGY.A00(Constants.ONE));
            arrayList.add(CGY.A00(Constants.ZERO));
            CD8 cd8 = this.A02;
            C27465CEh cEh = new C27465CEh(this);
            CD3 cd3 = cd8.A04;
            AnonymousClass0C1 r14 = cd3.A0Q;
            String str2 = cd3.A0R;
            String str3 = cd3.A0Z;
            String str4 = cd3.A0S;
            String ccn = cd3.A0D.toString();
            String A012 = AnonymousClass2VV.A01();
            if (CDV.A05(cd8.A04.A00())) {
                str = null;
            } else {
                str = cd8.A04.A0d;
            }
            CD3 cd32 = cd8.A04;
            List list = cd32.A0i;
            List list2 = CCH.A01;
            boolean z = cd32.A10;
            boolean z2 = cd32.A0u;
            C15890nh r2 = new C15890nh(r14);
            r2.A09 = Constants.ONE;
            r2.A0C = "ads/promote/budget_recommendation/";
            r2.A09("fb_auth_token", str2);
            r2.A09("media_id", str3);
            r2.A09("ad_account_id", str4);
            r2.A09("recommendation_types", new JSONArray(arrayList).toString());
            r2.A09("destination", ccn);
            r2.A09("flow_id", A012);
            r2.A0A("audience_id", str);
            r2.A09("daily_budget_options_with_offset", new JSONArray(list).toString());
            r2.A09("duration_options", new JSONArray(list2).toString());
            r2.A0C("is_story_placement_eligible", z);
            r2.A0C("is_explore_placement_eligible", z2);
            r2.A06(C27478CEu.class, false);
            C17850qu A032 = r2.A03();
            A032.A00 = cEh;
            cd8.A09.schedule(A032);
        }
        AnonymousClass0Z0.A09(1578068341, A022);
    }
}
