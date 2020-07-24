package com.instagram.business.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.util.HashMap;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1O2;
import p000X.AnonymousClass2MX;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass38H;
import p000X.AnonymousClass3BL;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass612;
import p000X.AnonymousClass61G;
import p000X.AnonymousClass61J;
import p000X.AnonymousClass61K;
import p000X.AnonymousClass61M;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass61U;
import p000X.AnonymousClass61X;
import p000X.AnonymousClass61Y;
import p000X.AnonymousClass61Z;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass62I;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C128275eQ;
import p000X.C13300iJ;
import p000X.C134405oU;
import p000X.C137275tN;
import p000X.C137335tT;
import p000X.C14100jl;
import p000X.C1410161a;
import p000X.C1412261x;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C23300zv;
import p000X.C256119n;
import p000X.C30248DXi;
import p000X.C53882Us;
import p000X.C64372rN;
import p000X.C709238f;

public class ProfileDisplayOptionsFragment extends AnonymousClass2NN implements AnonymousClass1HK, AnonymousClass1HM, C137335tT, AnonymousClass63X {
    public AnonymousClass61R A00;
    public AnonymousClass2UH A01;
    public BusinessInfo A02;
    public BusinessInfo A03;
    public AnonymousClass0C1 A04;
    public C13300iJ A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;
    public IgSwitch mCategoryToggle;
    public ViewGroup mCheckableButtonContainer;
    public IgSwitch mContactsToggle;
    public ImageView mPreviewView;
    public View mRootView;
    public ActionButton mSaveButton;
    public ScrollView mScrollView;

    public static void A02(ProfileDisplayOptionsFragment profileDisplayOptionsFragment, boolean z) {
        ProfileDisplayOptionsFragment profileDisplayOptionsFragment2 = profileDisplayOptionsFragment;
        Context context = profileDisplayOptionsFragment.getContext();
        AnonymousClass0C1 r3 = profileDisplayOptionsFragment.A04;
        String str = profileDisplayOptionsFragment.A06;
        BusinessInfo businessInfo = profileDisplayOptionsFragment.A02;
        String moduleName = profileDisplayOptionsFragment.getModuleName();
        AnonymousClass62I AJp = profileDisplayOptionsFragment.A01.AJp();
        boolean z2 = z;
        C137275tN.A00(profileDisplayOptionsFragment2, context, r3, str, businessInfo, (AnonymousClass62I) null, "profile_display_options", moduleName, AJp.A0F, z2, AJp.A00(), Constants.A0N, profileDisplayOptionsFragment2, AnonymousClass62H.A04(profileDisplayOptionsFragment.A01));
    }

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final void BLe() {
    }

    public final String getModuleName() {
        return "profile_display_options";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ProfileDisplayOptionsFragment profileDisplayOptionsFragment) {
        HashMap hashMap = new HashMap();
        hashMap.put("should_show_public_contacts", String.valueOf(profileDisplayOptionsFragment.A02.A0J));
        hashMap.put("should_show_category", String.valueOf(profileDisplayOptionsFragment.A02.A0I));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("should_show_public_contacts", String.valueOf(profileDisplayOptionsFragment.A03.A0J));
        hashMap2.put("should_show_category", String.valueOf(profileDisplayOptionsFragment.A03.A0I));
        BusinessInfo businessInfo = profileDisplayOptionsFragment.A02;
        boolean z = businessInfo.A0I;
        boolean z2 = businessInfo.A0J;
        AnonymousClass0C1 r5 = profileDisplayOptionsFragment.A04;
        AnonymousClass61Y r4 = new AnonymousClass61Y(profileDisplayOptionsFragment, hashMap2, hashMap);
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.ONE;
        r3.A0C = "business/account/edit_account/";
        r3.A06(C64372rN.class, false);
        r3.A0G = true;
        String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str2 = "0";
        if (z) {
            str2 = str;
        }
        r3.A09("should_show_category", str2);
        if (!z2) {
            str = "0";
        }
        r3.A09("should_show_public_contacts", str);
        C17850qu A032 = r3.A03();
        A032.A00 = new AnonymousClass61J(r4, r5);
        profileDisplayOptionsFragment.schedule(A032);
    }

    public static void A01(ProfileDisplayOptionsFragment profileDisplayOptionsFragment, Integer num, boolean z) {
        C13300iJ r1;
        boolean z2;
        String str;
        ProfileDisplayOptionsFragment profileDisplayOptionsFragment2 = profileDisplayOptionsFragment;
        AnonymousClass612 r2 = new AnonymousClass612(profileDisplayOptionsFragment.A02);
        try {
            r1 = AnonymousClass1O2.A01(AnonymousClass1O2.A02(profileDisplayOptionsFragment.A05));
        } catch (IOException unused) {
            AnonymousClass0QD.A02(profileDisplayOptionsFragment.getModuleName(), "Exception on serialize and deserialize User");
            r1 = null;
        }
        profileDisplayOptionsFragment.A05 = r1;
        C13300iJ r13 = r1;
        if (r1 != null) {
            switch (num.intValue()) {
                case 0:
                    r2.A0I = z;
                    r1.A1O = Boolean.valueOf(z);
                    z2 = profileDisplayOptionsFragment.A03.A0I;
                    str = "switch_display_category";
                    break;
                case 1:
                    r2.A0J = z;
                    r1.A1P = Boolean.valueOf(z);
                    z2 = profileDisplayOptionsFragment.A03.A0J;
                    str = "switch_display_contact";
                    break;
                default:
                    return;
            }
            profileDisplayOptionsFragment.A02 = r2.A00();
            AnonymousClass61K r12 = (AnonymousClass61K) profileDisplayOptionsFragment.mAdapter;
            if (r1 != null) {
                r12.clear();
                C709238f r11 = r12.A01;
                r11.A06 = r13;
                r11.A09 = false;
                r11.A01 = null;
                r11.A02 = null;
                r11.A05 = null;
                r11.A04 = null;
                r11.A00 = null;
                r11.A07 = null;
                r11.A03 = null;
                r11.A08 = false;
                r12.addModel(r11, r12.A02, r12.A00);
                r12.updateListView();
            }
            C256119n.A01(profileDisplayOptionsFragment2.getListView());
            if (profileDisplayOptionsFragment2.A00 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("is_profile_info_shown", String.valueOf(z2));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("is_profile_info_shown", String.valueOf(z));
                AnonymousClass61R r22 = profileDisplayOptionsFragment2.A00;
                C1412261x r14 = new C1412261x("profile_display_options");
                r14.A01 = profileDisplayOptionsFragment2.A06;
                r14.A00 = str;
                r14.A07 = hashMap;
                r14.A08 = hashMap2;
                r14.A04 = C14100jl.A01(profileDisplayOptionsFragment2.A04);
                r22.Ajy(r14.A00());
            }
        }
    }

    public static boolean A03(ProfileDisplayOptionsFragment profileDisplayOptionsFragment) {
        AnonymousClass2UH r0 = profileDisplayOptionsFragment.A01;
        if (r0 == null || !AnonymousClass62H.A0D(r0) || !C134405oU.A05(profileDisplayOptionsFragment.A04, false)) {
            return false;
        }
        return true;
    }

    public final void BFZ() {
        AnonymousClass2UH r0 = this.A01;
        if (r0 != null) {
            r0.AJp().A01(this.A02);
            if (A03(this)) {
                A00(this);
            } else {
                boolean z = false;
                if (this.A04.A06.A1o == Constants.A0C) {
                    z = true;
                }
                if (z) {
                    AnonymousClass2OA r2 = new AnonymousClass2OA(getContext());
                    r2.A07(C0003R.string.change_to_private_with_done_switch_dialog_title_creator);
                    r2.A06(C0003R.string.change_to_private_with_done_switch_dialog_content_creator);
                    r2.A0A(C0003R.string.change_to_private_with_done_switch_dialog_cta_creator, new AnonymousClass61Z(this));
                    r2.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
                    r2.A0E((DialogInterface.OnCancelListener) null);
                    r2.A03().show();
                } else {
                    A02(this, false);
                }
            }
        }
        AnonymousClass61R r22 = this.A00;
        if (r22 != null) {
            C1412261x r1 = new C1412261x("profile_display_options");
            r1.A01 = this.A06;
            r1.A00 = "continue";
            r1.A04 = C14100jl.A01(this.A04);
            r22.Ano(r1.A00());
        }
    }

    public final void BJB() {
        AnonymousClass63U r0 = this.mBusinessNavBarHelper;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void BJH() {
        AnonymousClass63U r0 = this.mBusinessNavBarHelper;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void BJO() {
        AnonymousClass2UH r4 = this.A01;
        if (r4 != null) {
            BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) r4;
            String str = this.A04.A06.A2U;
            C06590Pq r1 = businessConversionActivity.A06;
            if (r1.AgN()) {
                C23300zv A002 = C23300zv.A00(C05210Iq.A02(r1));
                String A052 = C05210Iq.A05(businessConversionActivity.A06);
                boolean z = false;
                if (str == null) {
                    z = true;
                }
                int A003 = businessConversionActivity.A01.A00();
                boolean z2 = !"composer_branded_content_tools".equals(businessConversionActivity.A01.A0B);
                A002.BXT(new AnonymousClass38H(A052, z, A003, z2, z2));
            }
            this.A01.AoZ();
        }
        AnonymousClass0C1 r3 = this.A04;
        AnonymousClass61G.A07(r3, "profile_display_options", this.A06, C14100jl.A01(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r0 == false) goto L_0x002d;
     */
    public final void configureActionBar(AnonymousClass1EX r3) {
        int i;
        if (this.A07) {
            this.mSaveButton = r3.BmI(new AnonymousClass61X(this));
        }
        if (!AnonymousClass62H.A0D(this.A01) || !C134405oU.A05(this.A04, false)) {
            AnonymousClass2UH r0 = this.A01;
            if (r0 != null) {
                boolean A7s = r0.A7s();
                i = C0003R.C0004drawable.instagram_x_outline_24;
            }
            i = C0003R.C0004drawable.instagram_arrow_back_24;
            r3.BmB(i, new AnonymousClass61M(this));
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass61R r2 = this.A00;
        if (r2 != null) {
            C1412261x r1 = new C1412261x("profile_display_options");
            r1.A01 = this.A06;
            r1.A04 = C14100jl.A01(this.A04);
            r2.Ajn(r1.A00());
        }
        if (A03(this)) {
            this.A01.A8B();
        }
        AnonymousClass2UH r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        r0.Be6();
        return true;
    }

    public final void BJ3(String str, String str2) {
        AnonymousClass5F9.A02(getContext(), str);
        AnonymousClass0C1 r5 = this.A04;
        String str3 = this.A06;
        String A012 = C14100jl.A01(r5);
        AnonymousClass0P4 A002 = C53882Us.A00(Constants.A14);
        A002.A0G("step", "profile_display_options");
        A002.A0G("entry_point", str3);
        A002.A0G("fb_user_id", A012);
        A002.A0G("error_message", str);
        AnonymousClass0WN.A01(r5).BcG(A002);
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A01 = AnonymousClass62H.A01(getActivity());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r1.A01 == null) goto L_0x00c4;
     */
    public final void onCreate(Bundle bundle) {
        String str;
        C13300iJ r1;
        boolean z;
        C13300iJ r4;
        String str2;
        int A022 = AnonymousClass0Z0.A02(1678781454);
        super.onCreate(bundle);
        this.A04 = AnonymousClass0J1.A06(this.mArguments);
        this.A06 = this.mArguments.getString("entry_point");
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        if (this.mArguments.getString("edit_profile_entry") != null) {
            z4 = true;
        }
        this.A07 = z4;
        Integer num = null;
        if (z4) {
            str = null;
            num = Constants.A0u;
        } else {
            AnonymousClass2UH r0 = this.A01;
            if (r0 != null) {
                num = r0.ALv();
                str = r0.Aad();
            } else {
                str = null;
            }
        }
        if (num != null) {
            this.A00 = C30248DXi.A00(this.A04, this, num, str);
        }
        AnonymousClass1HU r5 = new AnonymousClass1HU();
        r5.A0C(new C128275eQ(getActivity()));
        registerLifecycleListenerSet(r5);
        this.A03 = new AnonymousClass612(AnonymousClass62H.A02(this.mArguments, this.A01)).A00();
        try {
            r1 = AnonymousClass1O2.A01(AnonymousClass1O2.A02(this.A04.A06));
        } catch (IOException unused) {
            AnonymousClass0QD.A02(getModuleName(), "Exception on serialize and deserialize User");
            r1 = null;
        }
        this.A05 = r1;
        if (this.A07 && ((!AnonymousClass2MX.A00(r1) || !C134405oU.A04(this.A04, false)) && AnonymousClass2MX.A00(this.A05))) {
            z2 = false;
        }
        this.A08 = z2;
        C13300iJ r6 = this.A05;
        boolean z5 = true;
        if (r6 != null) {
            if (r6.A1b == Constants.ONE) {
                BusinessInfo businessInfo = this.A03;
                if (businessInfo.A09 == null) {
                    if (businessInfo.A00 == null) {
                    }
                }
            }
            if (AnonymousClass3BL.A00(r6, this.A04, true, false) <= 0) {
                z5 = false;
            }
        }
        if (this.A07 && AnonymousClass2MX.A00(this.A05)) {
            z5 &= C134405oU.A06(this.A04, false);
        }
        this.A09 = z5;
        AnonymousClass612 r12 = new AnonymousClass612(this.A03);
        if (this.A08) {
            z = this.A04.A06.A0V();
        } else {
            z = false;
        }
        r12.A0I = z;
        if (z5) {
            z3 = this.A04.A06.A0W();
        }
        r12.A0J = z3;
        BusinessInfo A002 = r12.A00();
        this.A03 = A002;
        BusinessInfo A003 = new AnonymousClass612(A002).A00();
        this.A02 = A003;
        if (!this.A07 && (r4 = this.A05) != null) {
            r4.A1b = Constants.A0N;
            r4.A10 = false;
            r4.A28 = A003.A0F;
            r4.A1O = Boolean.valueOf(A003.A0I);
            r4.A1P = Boolean.valueOf(A003.A0J);
            String str3 = A003.A09;
            if (!(str3 == null || str3 == null)) {
                r4.A2d = str3;
            }
            PublicPhoneContact publicPhoneContact = A003.A01;
            if (!(publicPhoneContact == null || (str2 = publicPhoneContact.A03) == null)) {
                r4.A2e = str2;
            }
            Address address = A003.A00;
            Address address2 = address;
            if (address != null) {
                String str4 = address.A04;
                if (str4 != null) {
                    r4.A23 = str4;
                }
                String str5 = address2.A01;
                if (str5 != null) {
                    r4.A21 = str5;
                }
                String str6 = address2.A02;
                if (str6 != null) {
                    r4.A22 = str6;
                }
            }
        }
        AnonymousClass61R r2 = this.A00;
        if (r2 != null) {
            C1412261x r13 = new C1412261x("profile_display_options");
            r13.A01 = this.A06;
            r13.A04 = C14100jl.A01(this.A04);
            r2.AnW(r13.A00());
        }
        AnonymousClass0Z0.A09(1339703207, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-707383834);
        View inflate = layoutInflater.inflate(C0003R.layout.profile_display_options_fragment, viewGroup, false);
        this.mRootView = inflate;
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        if (this.A07) {
            businessNavBar.setVisibility(8);
        } else {
            businessNavBar.setVisibility(0);
            AnonymousClass63U r3 = new AnonymousClass63U(this, this.mBusinessNavBar, C0003R.string.done, -1);
            this.mBusinessNavBarHelper = r3;
            registerLifecycleListener(r3);
            ScrollView scrollView = (ScrollView) inflate.findViewById(C0003R.C0005id.scroll_view);
            this.mScrollView = scrollView;
            this.mBusinessNavBar.A04(scrollView);
        }
        ((TextView) inflate.findViewById(C0003R.C0005id.title)).setText(C0003R.string.profile_display_title);
        TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.subtitle);
        if (C134405oU.A06(this.A04, false) || C134405oU.A05(this.A04, false)) {
            textView.setText(C0003R.string.profile_display_subtitle_flexible_contact_info);
        } else {
            textView.setText(C0003R.string.profile_display_subtitle);
        }
        View findViewById = inflate.findViewById(C0003R.C0005id.row_category);
        View findViewById2 = inflate.findViewById(C0003R.C0005id.row_contacts);
        this.mCategoryToggle = (IgSwitch) findViewById.findViewById(C0003R.C0005id.toggle);
        this.mContactsToggle = (IgSwitch) findViewById2.findViewById(C0003R.C0005id.toggle);
        if (this.A08) {
            this.mCategoryToggle.setChecked(this.A02.A0I);
            ((TextView) findViewById.findViewById(C0003R.C0005id.title)).setText(C0003R.string.profile_display_option_category);
            IgSwitch igSwitch = this.mCategoryToggle;
            Integer num = Constants.ZERO;
            igSwitch.setToggleListener(new C1410161a(this, num));
            findViewById.setOnClickListener(new AnonymousClass61U(this, igSwitch, num));
        } else {
            findViewById.setVisibility(8);
        }
        if (this.A09) {
            this.mContactsToggle.setChecked(this.A02.A0J);
            ((TextView) findViewById2.findViewById(C0003R.C0005id.title)).setText(C0003R.string.profile_display_option_contacts);
            IgSwitch igSwitch2 = this.mContactsToggle;
            Integer num2 = Constants.ONE;
            igSwitch2.setToggleListener(new C1410161a(this, num2));
            findViewById2.setOnClickListener(new AnonymousClass61U(this, igSwitch2, num2));
        } else {
            findViewById2.setVisibility(8);
        }
        AnonymousClass0Z0.A09(-1540886589, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(132873547);
        super.onDestroyView();
        if (!this.A07) {
            unregisterLifecycleListener(this.mBusinessNavBarHelper);
        }
        AnonymousClass0Z0.A09(-1528182555, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1948731935);
        super.onResume();
        if (this.A08) {
            this.mCategoryToggle.setChecked(this.A02.A0I);
        }
        if (this.A09) {
            this.mContactsToggle.setChecked(this.A02.A0J);
        }
        AnonymousClass0Z0.A09(391554211, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AnonymousClass2UH r0;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        AnonymousClass0C1 r2 = this.A04;
        C13300iJ r1 = this.A05;
        if (AnonymousClass2MX.A01(r1) || ((r0 = this.A01) != null && AnonymousClass62H.A0D(r0))) {
            z = true;
        } else {
            z = false;
        }
        setListAdapter(new AnonymousClass61K(context, r2, r1, z));
        C256119n.A01(getListView());
    }
}
