package com.instagram.settings.common;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.simplewebview.SimpleWebViewActivity;
import java.util.List;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass4Yl;
import p000X.AnonymousClass595;
import p000X.AnonymousClass910;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C1168950d;
import p000X.C120125Dh;
import p000X.C13300iJ;
import p000X.C26771Ff;
import p000X.C27526CGq;
import p000X.C53742Uc;
import p000X.C62442ni;
import p000X.C63802q4;
import p000X.C67852xw;

public class PaymentOptionsFragment extends AnonymousClass2NN implements AnonymousClass1HM, C62442ni {
    public AnonymousClass0C1 A00;
    public C120125Dh A01;
    public String A02;
    public boolean A03;
    public EmptyStateView mEmptyStateView;

    public final void B2G() {
    }

    public final void B2I() {
    }

    public final String getModuleName() {
        return "settings_payments_options";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static AnonymousClass595 A00(Activity activity, AnonymousClass0C1 r8, int i, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("sessionId", str2);
        return new AnonymousClass595(i, (View.OnClickListener) new C1168950d(r8, str, activity, i, bundle));
    }

    public static void A02(PaymentOptionsFragment paymentOptionsFragment, String str) {
        AnonymousClass4Yl r2 = new AnonymousClass4Yl(AnonymousClass0QT.A00(paymentOptionsFragment.A00, paymentOptionsFragment).A02("payflows_init"));
        r2.A08("product", "ig_payment_settings");
        r2.A08("flow_name", "payment_settings");
        r2.A08("flow_step", str);
        r2.A08("event_name", "init");
        r2.A08("session_id", paymentOptionsFragment.A02);
        r2.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (p000X.AnonymousClass2MX.A01(r1) != false) goto L_0x000f;
     */
    public static boolean A03(AnonymousClass0C1 r4) {
        boolean z;
        C13300iJ r1 = r4.A06;
        if (!r1.AeV()) {
            z = false;
        }
        z = true;
        if (!z || !((Boolean) AnonymousClass0L6.A03(r4, AnonymousClass0L7.PAYMENTS_GROWTH_PROMOTE_PAYMENTS_IN_PAYMENTS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r6, p000X.AnonymousClass0L7.PAYMENTS_GROWTH_PROMOTE_PAYMENTS_IN_PAYMENTS, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (p000X.AnonymousClass2MX.A01(r1) != false) goto L_0x001a;
     */
    public static void A01(BaseFragmentActivity baseFragmentActivity, AnonymousClass0C1 r6, List list, String str, Integer num, boolean z) {
        boolean A032;
        boolean z2;
        if (num.intValue() == 1) {
            if (baseFragmentActivity != null) {
                if (z) {
                    C13300iJ r1 = r6.A06;
                    if (!r1.AeV()) {
                        z2 = false;
                    }
                    z2 = true;
                    if (z2) {
                        A032 = true;
                    }
                    A032 = false;
                } else {
                    A032 = A03(r6);
                }
                if (A032) {
                    list.add(0, new AnonymousClass595((int) C0003R.string.biz_payments, (View.OnClickListener) new C27526CGq(r6, baseFragmentActivity)));
                }
            }
            boolean A033 = A03(r6);
            int i = C0003R.string.payment_methods;
            if (A033) {
                i = C0003R.string.account_payments;
            }
            list.add(A00(baseFragmentActivity, r6, i, "IgPaymentsSettingsPaymentMethodsRoute", str));
            list.add(A00(baseFragmentActivity, r6, C0003R.string.security_pin, "IgPaymentsSettingsSecurityPinRoute", str));
            list.add(A00(baseFragmentActivity, r6, C0003R.string.contact_info, "IgPaymentsSettingsContactInfoRoute", str));
            if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.SHOPPING_CHECKOUT_MVP_EXPERIMENT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.STORIES_FUNDRAISER_VIEW_PAYMENT_ADDRESS, "show_delivery_info_settings", false, (AnonymousClass04H) null)).booleanValue()) {
                list.add(A00(baseFragmentActivity, r6, C0003R.string.delivery_info, "IgPaymentsSettingsShippingInfoRoute", str));
            }
        }
    }

    public final void B2H() {
        Context context = getContext();
        if (context != null) {
            SimpleWebViewActivity.A04(context, this.A00, new C53742Uc(AnonymousClass910.A03("https://help.instagram.com/contact/502692143473097?ref=igapp", context)).A00());
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.BlI(C0003R.string.payments);
        r4.Bo6(true);
        AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
        A002.A08 = C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.igds_primary_icon));
        r4.BmE(A002.A00());
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0Z0.A02(-1538088349);
        super.onCreate(bundle);
        this.A01 = new C120125Dh(getContext());
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("com.instagram.settings.intf.ARGUMENT_FORCE_RISK_FETCH", false);
        }
        this.A03 = z;
        setListAdapter(this.A01);
        if (bundle != null) {
            str = bundle.getString("session_id");
        } else {
            str = null;
        }
        if (str != null) {
            this.A02 = str;
        } else {
            this.A02 = UUID.randomUUID().toString();
            A02(this, "payment_settings");
        }
        AnonymousClass0Z0.A09(1837796785, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1502328838);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_listview_with_empty_state, viewGroup, false);
        AnonymousClass0Z0.A09(1849910987, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1492004075);
        super.onDestroyView();
        this.mEmptyStateView = null;
        AnonymousClass0Z0.A09(667903179, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0Z0.A02(1459628635);
        super.onDetach();
        C63802q4.A00(this.A00).A0C.remove(this);
        AnonymousClass0Z0.A09(185793505, A022);
    }

    public final void onResume() {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(-289081184);
        super.onResume();
        C63802q4 A002 = C63802q4.A00(this.A00);
        if (!C63802q4.A02(A002) || A002.A03() == Constants.ZERO) {
            z = false;
        } else {
            A002.A03.A02 = false;
            A002.A01.A01(A002);
            z = true;
        }
        if (z) {
            this.mEmptyStateView.A0M(AnonymousClass2Oq.LOADING);
        }
        AnonymousClass0Z0.A09(1123217473, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session_id", this.A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView = (EmptyStateView) getListView().getEmptyView();
        this.mEmptyStateView = emptyStateView;
        emptyStateView.A0M(AnonymousClass2Oq.LOADING);
        A02(this, "payment_settings_loading");
        C63802q4.A00(this.A00).A0C.add(this);
        if (C63802q4.A00(this.A00).A09 == null || !this.A03) {
            C63802q4.A00(this.A00).A04();
            return;
        }
        C63802q4 A002 = C63802q4.A00(this.A00);
        A002.A03.A02 = false;
        A002.A01.A01(A002);
    }
}
