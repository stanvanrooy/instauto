package p000X;

import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.textwithentities.TextWithEntities;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;

/* renamed from: X.CD0 */
public final class CD0 extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, C27522CGm, C27385CBe, C27516CGg {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public CD8 A05;
    public C27434CDc A06;
    public CFE A07;
    public CD3 A08;
    public CDA A09;
    public IgImageView A0A;
    public StepperHeader A0B;
    public AnonymousClass0C1 A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public ViewStub A0K;
    public ViewStub A0L;
    public ViewStub A0M;
    public ViewStub A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public C26915Bue A0R;
    public CD2 A0S;
    public SpinnerImageView A0T;
    public final C17920r1 A0U = new C27397CBq(this);

    public final String getModuleName() {
        return "promote_review";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00() {
        Spanned spanned;
        String str;
        TextWithEntities textWithEntities;
        C27430CCy cCy = this.A08.A0H.A00;
        if (cCy == null || (textWithEntities = cCy.A00) == null || TextUtils.isEmpty(textWithEntities.A00)) {
            spanned = null;
        } else {
            C46431zj.A00(this.A0C).A02(getActivity());
            spanned = C229149ww.A00(this.A08.A0H.A00.A00, AnonymousClass1BA.A03(getContext(), C0003R.attr.textColorRegularLink), new CFF(this));
        }
        if (!TextUtils.isEmpty(spanned)) {
            if (this.A0Q == null) {
                this.A0Q = (TextView) this.A0K.inflate();
            }
            CD3 cd3 = this.A08;
            C27431CCz cCz = cd3.A0H;
            if (!cCz.A01) {
                C27430CCy cCy2 = cCz.A00;
                if (cCy2 != null) {
                    str = cCy2.A01;
                } else {
                    str = "";
                }
                AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A06);
                A002.A0G("component", "integrity_disapproval_message");
                C06270Ok A003 = C06270Ok.A00();
                A003.A09("integrity_disapproval_reason", str);
                A002.A08("configurations", A003);
                CCZ.A0G(cd3, A002);
                this.A08.A0H.A01 = true;
            }
            this.A0Q.setText(spanned);
            this.A0Q.setMovementMethod(LinkMovementMethod.getInstance());
            C06220Of.A0L(this.A0O, 0);
        } else if (this.A0Q != null) {
            C06220Of.A0L(this.A0O, getResources().getDimensionPixelSize(C0003R.dimen.promote_header_horizontal_padding));
            this.A0Q.setVisibility(8);
        }
    }

    private void A01() {
        TextView textView;
        String string;
        C27408CCb cCb = this.A08.A0L;
        if (cCb != null) {
            textView = this.A0O;
            string = getString(C0003R.string.promote_review_estimate_reach_text, Integer.valueOf(cCb.A00), Integer.valueOf(cCb.A01));
        } else {
            textView = this.A0O;
            string = getString(C0003R.string.promote_review_header_subtitle);
        }
        textView.setText(string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1 <= 0) goto L_0x0030;
     */
    public static void A02(CD0 cd0) {
        boolean z;
        TextView textView;
        String str;
        if (cd0.A08.A0N != null) {
            if (cd0.A0J == null) {
                cd0.A0J = cd0.A0N.inflate();
            }
            cd0.A0S.A01(cd0.A0J);
            cd0.A0I.setVisibility(0);
        }
        CG4 cg4 = cd0.A08.A0K;
        if (!(cg4 == null || (str = cg4.A03) == null)) {
            int length = str.length();
            z = true;
        }
        z = false;
        if (z && (textView = cd0.A0P) != null) {
            textView.setText(cg4.A03);
            cd0.A0P.setVisibility(0);
        }
        View view = cd0.A0F;
        if (view != null) {
            view.setVisibility(8);
        }
        cd0.A0S.A00(cd0.A0E);
    }

    public static void A03(CD0 cd0) {
        long j;
        CD3 cd3 = cd0.A08;
        if (!cd3.A02() || !cd3.A04() || !((Boolean) AnonymousClass0L6.A02(cd0.A0C, AnonymousClass0L7.PROMOTE_SPEND_LIMIT_IMPROVEMENT, "has_warning_in_summary", false, (AnonymousClass04H) null)).booleanValue()) {
            View view = cd0.A0H;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (cd0.A0H == null) {
            CCZ.A08(cd0.A08, C27398CBr.REVIEW, "ad_account_spend_limit_row");
            cd0.A0H = cd0.A0M.inflate();
        }
        ((TextView) AnonymousClass1E1.A07(cd0.A0H, C0003R.C0005id.primary_text)).setText(C0003R.string.promote_budget_spend_limit_row_title);
        TextView textView = (TextView) AnonymousClass1E1.A07(cd0.A0H, C0003R.C0005id.secondary_text);
        Object[] objArr = new Object[2];
        CD3 cd32 = cd0.A08;
        if (cd32.A02()) {
            int i = cd32.A01;
            j = ((long) Math.ceil(((double) cd32.A0K.A01) / ((double) i))) * ((long) i);
        } else {
            j = 0;
        }
        objArr[0] = CCH.A00((double) j, cd32.A01, cd32.A0f, 0);
        CD3 cd33 = cd0.A08;
        objArr[1] = CCH.A00((double) cd33.A0K.A00, cd33.A01, cd33.A0f, 0);
        textView.setText(cd0.getString(C0003R.string.promote_budget_spend_limit_row_subtitle, objArr));
        textView.setVisibility(0);
        ((IgSimpleImageView) AnonymousClass1E1.A07(cd0.A0H, C0003R.C0005id.warning_icon)).setVisibility(0);
        cd0.A0H.setOnClickListener(new C27396CBp(cd0));
    }

    public static void A04(CD0 cd0) {
        Integer num;
        CD3 cd3 = cd0.A08;
        CGB cgb = cd3.A0G;
        if (cgb == null || (num = cgb.A00.A00) == null) {
            cd0.A06.A02(cd3.A03());
        } else if (num.intValue() != 0) {
            cd0.A06.A02(true);
        } else {
            cd0.A06.A02(false);
        }
    }

    public static void A06(CD0 cd0, boolean z) {
        cd0.A0R.A02(!z);
        cd0.A0D = z;
        cd0.A06.A03(z);
    }

    public static void A07(CD0 cd0, boolean z) {
        if (z) {
            cd0.A0T.setLoadingStatus(C168617Hz.LOADING);
            cd0.A0G.setVisibility(8);
            return;
        }
        cd0.A0T.setLoadingStatus(C168617Hz.SUCCESS);
        cd0.A0G.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    public final void Aqn() {
        boolean z;
        CCZ.A07(this.A08, C27398CBr.REVIEW, "create_promotion");
        CD3 cd3 = this.A08;
        C27514CGe cGe = cd3.A0J;
        if (cGe.A01) {
            boolean z2 = cGe.A00;
            z = true;
        }
        z = false;
        if (!cd3.A03()) {
            String string = getString(C0003R.string.promote_review_create_promotion_no_payment);
            A05(this, string);
            CCZ.A0B(this.A08, C27398CBr.REVIEW, string);
            A06(this, false);
        } else if (z) {
            FragmentActivity activity = getActivity();
            AnonymousClass0C1 r6 = this.A0C;
            String str = cd3.A0W;
            String str2 = cd3.A0Z;
            Bundle bundle = new Bundle();
            bundle.putString("entryPoint", str);
            bundle.putString("instagramMediaID", str2);
            bundle.putString("igUserID", r6.A04());
            bundle.putString("fbUserID", C14100jl.A01(r6));
            bundle.putString("waterfallID", AnonymousClass2VV.A01());
            C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r6);
            newReactNativeLauncher.BlH(activity.getString(C0003R.string.promote_non_discrimination_title));
            newReactNativeLauncher.Bjt(bundle);
            newReactNativeLauncher.BkI("IgPromoteNonDiscriminationPolicyRoute");
            newReactNativeLauncher.BrT(activity).A02();
            this.A09.A0E(false);
            A06(this, false);
        } else {
            this.A05.A01(new CDI(this));
            A06(this, true);
        }
    }

    public final void BGX(CDA cda, Integer num) {
        if (Constants.A0u == num) {
            A00();
        } else if (Constants.A02 == num) {
            A01();
        }
    }

    public final void BMj() {
        this.A09.A0E(false);
    }

    public final boolean onBackPressed() {
        CCZ.A07(this.A08, C27398CBr.REVIEW, "back_button");
        return this.A0D;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Context context;
        CCf cCf;
        CD3 AT6 = ((C945346y) getActivity()).AT6();
        this.A08 = AT6;
        this.A0C = AT6.A0Q;
        View view2 = view;
        this.A0B = (StepperHeader) view2.findViewById(C0003R.C0005id.stepper_header);
        this.A0O = (TextView) view2.findViewById(C0003R.C0005id.estimate_reach_text);
        View findViewById = view2.findViewById(C0003R.C0005id.audience_row);
        AnonymousClass0a4.A07(findViewById, "audience row can not be null in Review ");
        this.A00 = findViewById;
        View findViewById2 = view2.findViewById(C0003R.C0005id.budget_duration_row);
        AnonymousClass0a4.A07(findViewById2, "budget duration row can not be null in Review");
        this.A01 = findViewById2;
        View findViewById3 = view2.findViewById(C0003R.C0005id.destination_row);
        AnonymousClass0a4.A07(findViewById3, "destination row can not be null in Review");
        this.A02 = findViewById3;
        View findViewById4 = view2.findViewById(C0003R.C0005id.payment_row);
        AnonymousClass0a4.A07(findViewById4, "payment row can not be null in Review");
        this.A0E = findViewById4;
        CD3 cd3 = this.A08;
        FragmentActivity activity = getActivity();
        C27398CBr cBr = C27398CBr.REVIEW;
        this.A0S = new CD2(cd3, activity, this, cBr);
        View findViewById5 = view2.findViewById(C0003R.C0005id.payment_row_divider);
        AnonymousClass0a4.A07(findViewById5, "payment row divider can not be null in Review");
        this.A0F = findViewById5;
        ViewStub viewStub = (ViewStub) view2.findViewById(C0003R.C0005id.tax_info_row_stub);
        AnonymousClass0a4.A07(viewStub, "tax view can not be null in Review");
        this.A0N = viewStub;
        View findViewById6 = view2.findViewById(C0003R.C0005id.tax_info_row_divider);
        AnonymousClass0a4.A07(findViewById6, "tax view divider row divider can not be null in Review");
        this.A0I = findViewById6;
        TextView textView = (TextView) view2.findViewById(C0003R.C0005id.footer_message_text);
        AnonymousClass0a4.A07(textView, "footer message text view can not be null in Review");
        this.A0P = textView;
        ViewStub viewStub2 = (ViewStub) view2.findViewById(C0003R.C0005id.review_process_expectation_stub);
        AnonymousClass0a4.A07(viewStub2, "payment row divider can not be null in Review");
        this.A0L = viewStub2;
        this.A04 = (ViewStub) view2.findViewById(C0003R.C0005id.preview_row_stub);
        this.A0G = view2.findViewById(C0003R.C0005id.review_screen_content_view);
        this.A0T = (SpinnerImageView) view2.findViewById(C0003R.C0005id.loading_spinner);
        this.A0K = (ViewStub) view2.findViewById(C0003R.C0005id.integrity_message_stub);
        this.A0M = (ViewStub) AnonymousClass1E1.A07(view2, C0003R.C0005id.spend_limit_row_view_stub);
        FragmentActivity activity2 = getActivity();
        this.A09 = ((CC9) activity2).AT7();
        this.A05 = new CD8(this.A08.A0Q, activity2, this);
        this.A09.A0C(this);
        this.A0B.A04(3, false);
        A01();
        TextView textView2 = (TextView) this.A02.findViewById(C0003R.C0005id.primary_text);
        AnonymousClass0a4.A07(textView2, "Primary text can not be null in destination row");
        textView2.setText(C0003R.string.promote_destination_screen_title);
        AnonymousClass0a4.A07(this.A08.A0D, "destination can not be null in Review");
        AnonymousClass0a4.A07(getContext(), "context can not be null in Review");
        CD3 cd32 = this.A08;
        switch (cd32.A0D.ordinal()) {
            case 0:
                str = "@".concat(this.A0C.A06.AZn());
                context = getContext();
                cCf = CCf.VIEW_INSTAGRAM_PROFILE;
                break;
            case 1:
                String str2 = cd32.A0U;
                AnonymousClass0a4.A06(str2);
                AnonymousClass0a4.A06(cd32.A0A);
                str = C27411CCe.A02(str2);
                context = getContext();
                cCf = this.A08.A0A;
                break;
            case 2:
                str = "@".concat(this.A0C.A06.AZn());
                context = getContext();
                cCf = CCf.INSTAGRAM_MESSAGE;
                break;
            default:
                throw new UnsupportedOperationException("Unknown Destination");
        }
        String A012 = CCf.A01(context, cCf);
        TextView textView3 = (TextView) this.A02.findViewById(C0003R.C0005id.secondary_text);
        if (textView3 != null) {
            textView3.setText(C06360Ot.formatString("%s | %s", A012, str));
            textView3.setVisibility(0);
        }
        ((TextView) this.A00.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_audience_screen_title);
        CFW A002 = this.A08.A00();
        AnonymousClass11J.A02(!TextUtils.isEmpty(A002.A05));
        String str3 = A002.A05;
        TextView textView4 = (TextView) this.A00.findViewById(C0003R.C0005id.secondary_text);
        textView4.setText(str3);
        textView4.setVisibility(0);
        ((TextView) this.A01.findViewById(C0003R.C0005id.primary_text)).setText(C0003R.string.promote_budget_duration_screen_title);
        Context context2 = getContext();
        if (context2 != null) {
            CD3 cd33 = this.A08;
            String string = context2.getString(C0003R.string.promote_review_budget_duration_details_text, new Object[]{CCH.A00((double) cd33.A06, cd33.A01, cd33.A0f, 0), CCH.A01(getContext(), this.A08.A05)});
            TextView textView5 = (TextView) this.A01.findViewById(C0003R.C0005id.secondary_text);
            textView5.setText(string);
            textView5.setVisibility(0);
        }
        A00();
        View inflate = this.A04.inflate();
        this.A03 = inflate;
        inflate.setOnClickListener(new CDO(this));
        IgImageView igImageView = (IgImageView) this.A03.findViewById(C0003R.C0005id.media_preview_thumbnail);
        this.A0A = igImageView;
        igImageView.setUrl(this.A08.A0P, getModuleName());
        C27434CDc cDc = new C27434CDc(view2, cBr);
        this.A06 = cDc;
        cDc.A00();
        C27433CDb.A01(this.A06, this, getActivity(), this.A0C, this.A08, false);
        A04(this);
        this.A0L.inflate();
        if (!C24001AgJ.A00(this.A0C) && this.A08.A0y) {
            CFE cfe = new CFE(view2);
            this.A07 = cfe;
            FragmentActivity activity3 = getActivity();
            CD3 cd34 = this.A08;
            if (cfe.A03 == null) {
                View inflate2 = cfe.A0B.inflate();
                cfe.A03 = inflate2;
                cfe.A09 = (TextView) inflate2.findViewById(C0003R.C0005id.political_ads_title);
                cfe.A06 = (TextView) cfe.A03.findViewById(C0003R.C0005id.political_ads_explanation);
                cfe.A05 = (TextView) cfe.A03.findViewById(C0003R.C0005id.political_ads_disclaimer);
                cfe.A02 = cfe.A03.findViewById(C0003R.C0005id.issue_list_text);
                cfe.A07 = (TextView) cfe.A03.findViewById(C0003R.C0005id.ads_policy_text);
                cfe.A08 = (TextView) cfe.A03.findViewById(C0003R.C0005id.terms_text);
                cfe.A01 = cfe.A03.findViewById(C0003R.C0005id.learn_more_text);
                cfe.A04 = (TextView) cfe.A03.findViewById(C0003R.C0005id.checkbox_confirm_text);
                cfe.A0A = (AppCompatCheckBox) cfe.A03.findViewById(C0003R.C0005id.political_ads_checkbox);
                cfe.A00 = cfe.A03.getContext();
            }
            AnonymousClass0C1 r5 = cd34.A0Q;
            C46431zj.A00(r5).A02(cfe.A00);
            CD3 cd35 = cd34;
            AnonymousClass0C1 r15 = r5;
            cfe.A02.setOnClickListener(new CFD(cd35, cBr, "help_link_political_ads_legislative_issues", activity3, r15, "https://www.facebook.com/business/help/214754279118974"));
            cfe.A07.setOnClickListener(new CFD(cd35, cBr, "help_link_political_ads_policy", activity3, r15, "https://www.facebook.com/policies/ads/restricted_content/political"));
            cfe.A08.setOnClickListener(new CFD(cd35, cBr, "help_link_political_ads_terms", activity3, r15, "https://www.facebook.com/legal/terms"));
            cfe.A01.setOnClickListener(new CFD(cd35, cBr, "help_link_political_ads_learn_more", activity3, r15, "https://www.facebook.com/business/help/1838453822893854"));
            cfe.A0A.setChecked(cd34.A0x);
            cfe.A0A.setClickable(true);
            cfe.A0A.setOnCheckedChangeListener(new CGI(cd34));
            if (cd34.A14) {
                cfe.A09.setText(C0003R.string.promote_review_political_ads_title_updated);
                cfe.A06.setText(C0003R.string.promote_review_political_ads_explanation_update);
                cfe.A05.setText(C0003R.string.promote_review_political_ads_disclaimer_update);
                cfe.A07.setText(C0003R.string.promote_review_political_ads_ad_policy_link_text_update);
                cfe.A08.setText(C0003R.string.f122x9c4f6244);
                cfe.A04.setText(C0003R.string.promote_review_political_ads_checkbox_confirm_update);
                cfe.A02.setVisibility(8);
            } else {
                cfe.A09.setText(C0003R.string.promote_review_political_ads_title);
                cfe.A06.setText(C0003R.string.promote_review_political_ads_explanation);
                cfe.A05.setText(C0003R.string.promote_review_political_ads_disclaimer);
                cfe.A07.setText(C0003R.string.promote_review_political_ads_ad_policy_link_text);
                cfe.A08.setText(C0003R.string.promote_review_political_ads_terms_and_conditions_link_text);
                cfe.A04.setText(C0003R.string.promote_review_political_ads_checkbox_confirm);
                cfe.A02.setVisibility(0);
            }
        }
        A07(this, !this.A09.A04);
        if (this.A09.A04) {
            A07(this, false);
            this.A0B.A02();
            A02(this);
            A03(this);
            A04(this);
        }
        CCZ.A04(this.A08, cBr);
        super.onViewCreated(view2, bundle);
    }

    public static void A05(CD0 cd0, String str) {
        Context context = cd0.getContext();
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = cd0.getString(C0003R.string.promote_review_create_promotion_error_message);
            }
            C53642Tq.A01(context, str, 0).show();
        }
    }

    public final void configureActionBar(AnonymousClass1EX r6) {
        r6.BlI(C0003R.string.promote_review_screen_title);
        C26915Bue bue = new C26915Bue(getContext(), r6);
        this.A0R = bue;
        C27491CFh cFh = new C27491CFh(this);
        AnonymousClass2xx r1 = bue.A02;
        r1.A03 = C0003R.C0004drawable.instagram_arrow_back_24;
        r1.A0B = cFh;
        bue.A01.Bo6(true);
        bue.A02(true);
    }

    public final C06590Pq getSession() {
        return this.A0C;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1864804889);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_review_view, viewGroup, false);
        AnonymousClass0Z0.A09(-1398474153, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1657681610);
        this.A09.A0D(this);
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A0J = null;
        this.A0E = null;
        this.A03 = null;
        this.A0Q = null;
        this.A0F = null;
        this.A0I = null;
        this.A0N = null;
        this.A0P = null;
        this.A0L = null;
        this.A04 = null;
        this.A0K = null;
        this.A0H = null;
        this.A0M = null;
        CCZ.A03(this.A08, C27398CBr.REVIEW);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1955860586, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1697154256);
        super.onResume();
        if (!this.A09.A04) {
            A07(this, true);
            this.A05.A04(new CDJ(this));
        }
        AnonymousClass0Z0.A09(-1440324311, A022);
    }
}
