package p000X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;

/* renamed from: X.CD5 */
public final class CD5 extends C27341Hl implements AnonymousClass1HM, CGS, C27522CGm {
    public View A00;
    public ViewStub A01;
    public TextView A02;
    public TextView A03;
    public CD8 A04;
    public C27434CDc A05;
    public CD3 A06;
    public AnonymousClass0C1 A07;
    public Integer A08;
    public String A09;
    public ViewStub A0A;
    public TextView A0B;
    public SpinnerImageView A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;

    public final String getModuleName() {
        return "promote_error";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00() {
        AnonymousClass0a4.A07(this.A08, "Error type should not be null for action button");
        C27434CDc cDc = this.A05;
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r4 = this.A07;
        Integer num = this.A08;
        CD3 cd3 = this.A06;
        C46431zj.A00(r4).A02(cDc.A04.getContext());
        cDc.A03(false);
        cDc.A03.setOnClickListener(new CG5(cDc, this));
        switch (num.intValue()) {
            case 0:
                cDc.A05.setText(C0003R.string.promote_error_continue_to_self_resolution);
                return;
            case 1:
            case 2:
            case 6:
                cDc.A05.setText(C0003R.string.promote_error_request_review);
                return;
            case 3:
                cDc.A05.setText(C0003R.string.promote_error_pay_now_label);
                return;
            case 4:
            case C120125Dh.VIEW_TYPE_BADGE:
                cDc.A05.setText(C0003R.string.promote_change_ad_account_button_label);
                return;
            case 16:
                cDc.A05.setText(C0003R.string.promote_error_claim_page_label);
                cDc.A01(activity, r4, cd3);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                cDc.A05.setText(C0003R.string.promote_error_publish_page_label);
                return;
            case 18:
                cDc.A05.setText(C0003R.string.promote_error_create_page_label);
                cDc.A01(activity, r4, cd3);
                return;
            default:
                return;
        }
    }

    private void A01() {
        if (this.A0B == null) {
            this.A0B = (TextView) this.A0A.inflate();
        }
        this.A0B.setVisibility(0);
        this.A0B.setOnClickListener(new CE2(this));
    }

    private void A02() {
        String str;
        if (this.A08 == Constants.A0J || (str = this.A0E) == null || this.A09 == null) {
            this.A03.setText(C0003R.string.promote_error_title_network_error);
            this.A02.setText(C0003R.string.promote_error_description_network_error);
            return;
        }
        this.A03.setText(str);
        AnonymousClass0a4.A07(this.A09, "If the description is null, a default error view will be showed.");
        Integer num = this.A08;
        if (num == Constants.A0C || num == Constants.A0u) {
            String string = getString(C0003R.string.promote_error_description_banhammer_policy_name);
            String string2 = getString(C0003R.string.promote_error_description_banhammer, string);
            C46431zj.A00(this.A07).A02(getActivity());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            AnonymousClass4XV.A02(string, spannableStringBuilder, new C27463CEf(this, C019000b.A00(this.A00.getContext(), C0003R.color.blue_5)));
            this.A02.setText(spannableStringBuilder);
            this.A02.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.A02.setText(this.A09);
    }

    public static void A03(CD5 cd5, boolean z) {
        TextView textView;
        View view;
        int i = 8;
        if (z) {
            cd5.A0C.setLoadingStatus(C168617Hz.LOADING);
            cd5.A00.setVisibility(8);
            View view2 = cd5.A05.A04;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            textView = cd5.A0B;
            if (textView == null) {
                return;
            }
        } else {
            cd5.A0C.setLoadingStatus(C168617Hz.SUCCESS);
            cd5.A00.setVisibility(0);
            if (cd5.A04() && (view = cd5.A05.A04) != null) {
                view.setVisibility(0);
            }
            textView = cd5.A0B;
            if (textView == null) {
                return;
            }
            if (cd5.A05()) {
                i = 0;
            }
        }
        textView.setVisibility(i);
    }

    private boolean A04() {
        Integer num = this.A08;
        if (num == Constants.A0A || num == Constants.A08 || num == Constants.A09 || num == Constants.A05 || num == Constants.A0Y || num == Constants.A0N || num == Constants.A0u || num == Constants.ONE || num == Constants.A0C || num == Constants.ZERO) {
            return true;
        }
        return false;
    }

    private boolean A05() {
        Integer num = this.A08;
        if (num == Constants.A14 || num == Constants.A05 || num == Constants.A07 || num == Constants.A0Y) {
            return true;
        }
        return false;
    }

    public final void Aqn() {
        AnonymousClass0C1 r3;
        FragmentActivity fragmentActivity;
        String str;
        String str2;
        AnonymousClass0a4.A07(this.A08, "Error type should not be null for action button");
        switch (this.A08.intValue()) {
            case 0:
                CCZ.A07(this.A06, C27398CBr.ERROR, "ad_account_disabled_self_resolution");
                this.A0G = true;
                FragmentActivity activity = getActivity();
                AnonymousClass0a4.A06(activity);
                AnonymousClass0C1 r6 = this.A07;
                String str3 = this.A0D;
                AnonymousClass0a4.A07(str3, "ad account ID is non-null for DD flow");
                String str4 = this.A0F;
                AnonymousClass0a4.A07(str4, "payment method ID is non-null for DD flow");
                Bundle bundle = new Bundle();
                bundle.putString("entryPoint", "instagram");
                bundle.putString("paymentAccountID", str3);
                bundle.putString("wizardName", "RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION");
                bundle.putString("paymentMethodID", str4);
                C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r6);
                newReactNativeLauncher.BlH(activity.getString(C0003R.string.promote_error_pay_now_label));
                newReactNativeLauncher.Bjt(bundle);
                newReactNativeLauncher.BkI("BillingWizardIGRoute");
                newReactNativeLauncher.BrT(activity).A02();
                return;
            case 1:
                CCZ.A07(this.A06, C27398CBr.ERROR, "request_review_ads_payment_risk");
                r3 = this.A07;
                fragmentActivity = getActivity();
                AnonymousClass0a4.A06(fragmentActivity);
                str = getString(C0003R.string.promote_error_appeal_form_title);
                str2 = "https://help.instagram.com/contact/502692143473097";
                break;
            case 2:
                CCZ.A07(this.A06, C27398CBr.ERROR, "request_review_ads_integrity_policy");
                r3 = this.A07;
                fragmentActivity = getActivity();
                AnonymousClass0a4.A06(fragmentActivity);
                str = getString(C0003R.string.promote_error_appeal_form_title);
                str2 = "https://help.instagram.com/contact/534180673793883";
                break;
            case 3:
                CCZ.A07(this.A06, C27398CBr.ERROR, "pay_now");
                this.A0G = true;
                String str5 = this.A0D;
                if (str5 != null) {
                    FragmentActivity activity2 = getActivity();
                    AnonymousClass0a4.A06(activity2);
                    AnonymousClass0C1 r32 = this.A07;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("entryPoint", "instagram");
                    bundle2.putString("paymentAccountID", str5);
                    C53832Un newReactNativeLauncher2 = C16920pO.getInstance().newReactNativeLauncher(r32);
                    newReactNativeLauncher2.BlH(activity2.getString(C0003R.string.promote_error_pay_now_label));
                    newReactNativeLauncher2.Bjt(bundle2);
                    newReactNativeLauncher2.BkI("AdsPaymentsPayNowRoute");
                    newReactNativeLauncher2.BrT(activity2).A02();
                    return;
                }
                return;
            case 4:
            case C120125Dh.VIEW_TYPE_BADGE:
                CCZ.A07(this.A06, C27398CBr.ERROR, "payments");
                this.A0G = true;
                BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) getActivity();
                if (((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.PROMOTE_PAYMENT_SETTING_IGBA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    C23802AbW.A00(baseFragmentActivity, AnonymousClass1L8.A00(baseFragmentActivity), this.A07, new CF5(this, baseFragmentActivity));
                    return;
                } else {
                    BY5.A02(baseFragmentActivity, "promote_no_permissions", C27398CBr.ERROR, this.A07);
                    return;
                }
            case 6:
                CCZ.A07(this.A06, C27398CBr.ERROR, "request_review_banhammer");
                r3 = this.A07;
                fragmentActivity = getActivity();
                AnonymousClass0a4.A06(fragmentActivity);
                str = getString(C0003R.string.promote_error_appeal_form_title);
                str2 = "https://help.instagram.com/contact/580480516016036";
                break;
            case 16:
                CCZ.A07(this.A06, C27398CBr.ERROR, "claim");
                C1190758z.A00(getContext(), this.A07, this.A06.A0R, false, AnonymousClass1L8.A00(this), new CE0(this));
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                CCZ.A07(this.A06, C27398CBr.ERROR, "publish");
                C1191459g.A00(getContext(), this.A07, AnonymousClass1L8.A00(this), new C27451CDt(this));
                return;
            case 18:
                CCZ.A07(this.A06, C27398CBr.ERROR, "create");
                C1190758z.A00(getContext(), this.A07, this.A06.A0R, true, AnonymousClass1L8.A00(this), new CE1(this));
                return;
            default:
                return;
        }
        C115564xm.A00(r3, fragmentActivity, str, str2);
    }

    public final void BF1() {
        this.A08 = Constants.A0J;
        A03(this, false);
        A02();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    public final void BF2(CFA cfa) {
        CD3 cd3;
        C27398CBr cBr;
        String str;
        String str2;
        this.A0C.setLoadingStatus(C168617Hz.SUCCESS);
        if (cfa.A06 || cfa.A01 == null) {
            C16310oO.A00.A02();
            CCI cci = new CCI();
            C52362Om r2 = new C52362Om(getActivity(), this.A07);
            r2.A08 = false;
            r2.A02 = cci;
            r2.A02();
            return;
        }
        if (C27500CFq.A00(this.A07).booleanValue()) {
            CGB cgb = cfa.A01;
            CGC cgc = cgb.A00;
            this.A0E = cgc.A02;
            this.A09 = cgb.A02;
            Integer num = cgb.A01;
            this.A08 = num;
            this.A0F = cgc.A03;
            cd3 = this.A06;
            cBr = C27398CBr.ERROR;
            str = C27460CEc.A02(num);
            str2 = cgb.A03;
        } else {
            CEN cen = cfa.A04;
            if (cen == null) {
                Integer num2 = Constants.A0J;
                this.A08 = num2;
                CCZ.A0D(this.A06, C27398CBr.ERROR, C27460CEc.A01(num2), getString(C0003R.string.promote_error_description_network_error));
                A03(this, false);
                A02();
                if (A05()) {
                    A01();
                }
                if (!A04()) {
                    this.A05.A00();
                    View view = this.A05.A04;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    A00();
                    return;
                }
                return;
            }
            this.A0E = cen.A04;
            this.A09 = cen.A02;
            this.A08 = C27460CEc.A00(CF8.A00(cen.A00()));
            this.A0F = cen.A03;
            cd3 = this.A06;
            cBr = C27398CBr.ERROR;
            str = cen.A01;
            str2 = this.A09;
        }
        CCZ.A0D(cd3, cBr, str, str2);
        A03(this, false);
        A02();
        if (A05()) {
        }
        if (!A04()) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    public final void configureActionBar(AnonymousClass1EX r3) {
        int i;
        r3.setTitle(CGT.A00(getContext(), this.A08));
        if (this.mFragmentManager.A0I() == 0) {
            boolean z = this.A06.A12;
            i = C0003R.C0004drawable.instagram_x_outline_24;
        }
        i = C0003R.C0004drawable.instagram_arrow_back_24;
        r3.Bg9(i);
        r3.Bo1(false);
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1859127664);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.A0E = bundle2.getString("error_title");
        this.A09 = bundle2.getString(TraceFieldType.Error);
        this.A0D = bundle2.getString("adAccountID");
        this.A08 = C27460CEc.A00(bundle2.getString("error_type"));
        this.A0F = bundle2.getString("paymentMethodID");
        AnonymousClass0Z0.A09(-1763667249, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(986148906);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_error_view, viewGroup, false);
        AnonymousClass0Z0.A09(622422238, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1633271395);
        super.onDestroyView();
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
        this.A0C = null;
        this.A0B = null;
        this.A01 = null;
        this.A0A = null;
        AnonymousClass0Z0.A09(1278714154, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 == p000X.Constants.ZERO) goto L_0x0021;
     */
    public final void onResume() {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(750325690);
        super.onResume();
        if (this.A0G) {
            Integer num = this.A08;
            if (!(num == Constants.A05 || num == Constants.A0Y || num == Constants.A0N)) {
                z = false;
            }
            z = true;
            if (z) {
                this.A0G = false;
                A03(this, true);
                this.A04.A00(this, C27398CBr.ERROR);
            }
        }
        AnonymousClass0Z0.A09(-72355982, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        this.A0C = spinnerImageView;
        spinnerImageView.setLoadingStatus(C168617Hz.SUCCESS);
        this.A01 = (ViewStub) view.findViewById(C0003R.C0005id.promote_empty_view_stub);
        this.A05 = new C27434CDc(view, C27398CBr.ERROR);
        this.A0A = (ViewStub) view.findViewById(C0003R.C0005id.promote_error_learn_more_link_view_stub);
        FragmentActivity activity = getActivity();
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A06 = AT6;
        this.A07 = AT6.A0Q;
        ((BaseFragmentActivity) activity).A0U();
        this.A04 = new CD8(this.A07, getActivity(), this);
        if (A05()) {
            A01();
        }
        if (this.A00 == null) {
            View inflate = this.A01.inflate();
            this.A00 = inflate;
            TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.promote_empty_view_title);
            this.A03 = textView;
            textView.setText(C0003R.string.promote_error_title_network_error);
            TextView textView2 = (TextView) this.A00.findViewById(C0003R.C0005id.promote_empty_view_description);
            this.A02 = textView2;
            textView2.setText(C0003R.string.promote_error_description_network_error);
            if (this.A08 == Constants.A0N) {
                ((ImageView) this.A00.findViewById(C0003R.C0005id.promote_empty_view_icon)).setImageDrawable(AnonymousClass953.A00(getResources(), C0003R.C0004drawable.instagram_business_images_account_unsettled_icon));
            }
        }
        A02();
        if (A04()) {
            this.A05.A00();
            A00();
        }
    }
}
