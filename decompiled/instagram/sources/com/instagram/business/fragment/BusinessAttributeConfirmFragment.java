package com.instagram.business.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.model.BusinessAttribute;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass3BL;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass613;
import p000X.AnonymousClass616;
import p000X.AnonymousClass617;
import p000X.AnonymousClass61C;
import p000X.AnonymousClass61E;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.AnonymousClass67Z;
import p000X.AnonymousClass67b;
import p000X.C06590Pq;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C27341Hl;

public class BusinessAttributeConfirmFragment extends C27341Hl implements AnonymousClass0RN, AnonymousClass1HK, AnonymousClass61E, AnonymousClass1HM, AnonymousClass63X {
    public AnonymousClass67b A00;
    public BusinessAttribute A01;
    public AnonymousClass0C1 A02;
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;
    public StepperHeader mStepperHeader;

    public final void BLe() {
    }

    public final String getModuleName() {
        return "business_attribute_sync_contact_review";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void AC1() {
        this.mBusinessNavBar.setPrimaryButtonEnabled(false);
    }

    public final void ACw() {
        this.mBusinessNavBar.setPrimaryButtonEnabled(true);
    }

    public final void BFZ() {
        AnonymousClass616.A00(this.A02).A01(this.A00.AJa().A00, (String) null);
        AnonymousClass0C1 r1 = this.A02;
        BusinessAttribute businessAttribute = this.A01;
        String str = businessAttribute.A01;
        String str2 = businessAttribute.A05;
        String str3 = businessAttribute.A06;
        String str4 = businessAttribute.A07;
        String str5 = businessAttribute.A00;
        String str6 = businessAttribute.A02;
        String str7 = businessAttribute.A03;
        Context context = getContext();
        AnonymousClass0C1 r7 = r1;
        C15890nh r3 = new C15890nh(r1);
        r3.A09 = Constants.ONE;
        r3.A0C = "business/account/enable_sync_business_attributes/";
        r3.A06(AnonymousClass617.class, false);
        r3.A0G = true;
        String str8 = "";
        String str9 = str8;
        if (str != null) {
            str9 = str;
        }
        r3.A09(IgReactPurchaseExperienceBridgeModule.EMAIL, str9);
        String str10 = str8;
        if (str2 != null) {
            str10 = str2;
        }
        r3.A09("phone_number", str10);
        String str11 = str8;
        if (str3 != null) {
            str11 = str3;
        }
        r3.A09("street_address", str11);
        if (str4 != null) {
            str8 = str4;
        }
        r3.A09("zip_code", str8);
        if (str7 != null && str6 == null) {
            r3.A09("ig_city_page_id", str7);
        } else if (str6 != null && str7 == null) {
            r3.A09("fb_location_city_id", str6);
        }
        C17850qu A03 = r3.A03();
        A03.A00 = new AnonymousClass613(this, r7, str, str3, str4, str5, context, str2);
        schedule(A03);
    }

    public final void BJB() {
        this.mBusinessNavBarHelper.A00();
    }

    public final void BJH() {
        this.mBusinessNavBarHelper.A01();
    }

    public final boolean onBackPressed() {
        this.A00.Be6();
        return true;
    }

    public static void A00(View view, int i, int i2, String str) {
        view.findViewById(i).setVisibility(0);
        ((TextView) view.findViewById(i).findViewById(C0003R.C0005id.label)).setText(i2);
        ((TextView) view.findViewById(i).findViewById(C0003R.C0005id.content)).setText(str);
    }

    public final void BIz() {
        Context context = getContext();
        if (context != null) {
            AnonymousClass5F9.A02(context, getString(C0003R.string.request_error));
        }
    }

    public final void BJR(AnonymousClass61C r2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmK(C0003R.string.attribute_sync_action_bar_title);
        r3.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new AnonymousClass67Z(this));
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onAttach(Context context) {
        AnonymousClass67b r1;
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof AnonymousClass67b) {
            r1 = (AnonymousClass67b) activity;
        } else {
            r1 = null;
        }
        AnonymousClass0a4.A06(r1);
        this.A00 = r1;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1647085326);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A02 = AnonymousClass0J1.A06(bundle2);
        BusinessAttribute businessAttribute = (BusinessAttribute) this.mArguments.get("sync_attributes");
        this.A01 = businessAttribute;
        AnonymousClass0a4.A06(businessAttribute);
        AnonymousClass0Z0.A09(-1129793690, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        int A022 = AnonymousClass0Z0.A02(-1909567591);
        View inflate = layoutInflater.inflate(C0003R.layout.business_contact_review_fragment, viewGroup, false);
        if (!TextUtils.isEmpty(this.A01.A01)) {
            string = this.A01.A01;
        } else {
            string = getString(C0003R.string.attribute_sync_missing_email);
        }
        if (!TextUtils.isEmpty(this.A01.A05)) {
            string2 = this.A01.A05;
        } else {
            string2 = getString(C0003R.string.attribute_sync_missing_phone);
        }
        Context context = getContext();
        BusinessAttribute businessAttribute = this.A01;
        String A03 = AnonymousClass3BL.A03(context, businessAttribute.A06, businessAttribute.A07, businessAttribute.A00);
        if (TextUtils.isEmpty(A03)) {
            A03 = getString(C0003R.string.attribute_sync_missing_address);
        }
        A00(inflate, C0003R.C0005id.row_email, C0003R.string.landing_email_hint, string);
        A00(inflate, C0003R.C0005id.row_phone, C0003R.string.login_phone_hint, string2);
        A00(inflate, C0003R.C0005id.row_address, C0003R.string.address, A03);
        View findViewById = inflate.findViewById(C0003R.C0005id.contact_confirmation_header);
        findViewById.setVisibility(0);
        ((TextView) findViewById).setText(C0003R.string.attribute_sync_confirm_header);
        ((TextView) inflate.findViewById(C0003R.C0005id.title)).setText(C0003R.string.attribute_sync_confirm_title);
        ((TextView) inflate.findViewById(C0003R.C0005id.subtitle)).setText(C0003R.string.attribute_sync_confirm_subtitle);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        this.mBusinessNavBarHelper = new AnonymousClass63U(this, businessNavBar, C0003R.string.confirm, -1);
        this.mBusinessNavBar.A04((LinearLayout) inflate.findViewById(C0003R.C0005id.scroll_container));
        registerLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0Z0.A09(-1795180848, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(641809781);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        this.mBusinessNavBarHelper = null;
        this.mBusinessNavBar = null;
        this.mStepperHeader = null;
        AnonymousClass0Z0.A09(-103392039, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0003R.C0005id.stepper_header);
        this.mStepperHeader = stepperHeader;
        stepperHeader.setVisibility(0);
        this.mStepperHeader.A03(this.A00.ABJ(), this.A00.BrZ());
    }
}
