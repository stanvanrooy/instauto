package com.instagram.business.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.registration.model.RegFlowExtras;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1KZ;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass3BL;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass61G;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass63Z;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C100934Xs;
import p000X.C12800hP;
import p000X.C128275eQ;
import p000X.C135765qs;
import p000X.C137355tV;
import p000X.C1409760w;
import p000X.C14100jl;
import p000X.C1412261x;
import p000X.C1414863a;
import p000X.C1414963b;
import p000X.C1415063c;
import p000X.C1415763o;
import p000X.C27341Hl;
import p000X.C30248DXi;

public final class ConnectFBPageFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public AnonymousClass61R A00;
    public AnonymousClass2UH A01;
    public BusinessNavBar A02;
    public C06590Pq A03;
    public RegFlowExtras A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public StepperHeader A09;
    public boolean A0A;
    public final AnonymousClass1KZ A0B = new C1414863a(this);

    public final void configureActionBar(AnonymousClass1EX r1) {
    }

    public final String getModuleName() {
        return "connect_fb_page";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static C1412261x A00(ConnectFBPageFragment connectFBPageFragment, String str) {
        C1412261x r1 = new C1412261x(str);
        r1.A01 = connectFBPageFragment.A05;
        r1.A04 = C14100jl.A01(connectFBPageFragment.A03);
        return r1;
    }

    public static void A01(ConnectFBPageFragment connectFBPageFragment, String str, String str2) {
        boolean z;
        if (!connectFBPageFragment.A08) {
            z = false;
        } else {
            C06590Pq r4 = connectFBPageFragment.A03;
            C135765qs.A03(r4, "facebook_connect", connectFBPageFragment.A05, (C06270Ok) null, C14100jl.A01(r4));
            Bundle A022 = connectFBPageFragment.A04.A02();
            A022.putString("entry_point", connectFBPageFragment.A05);
            A022.putString("business_signup", connectFBPageFragment.A06);
            A022.putString("target_page_id", connectFBPageFragment.mArguments.getString("target_page_id"));
            A022.putString("fb_access_token", str);
            A022.putString("fb_user_id", str2);
            AnonymousClass2UH r0 = connectFBPageFragment.A01;
            if (r0 != null) {
                r0.Aoa(A022);
            }
            z = true;
        }
        if (!z) {
            AnonymousClass2UH r1 = connectFBPageFragment.A01;
            if (AnonymousClass62H.A0C(r1)) {
                r1.Aoa(C137355tV.A00(connectFBPageFragment.A03));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010  */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        C06590Pq r2 = this.A03;
        if (i2 == -1) {
            C12800hP.A05(r2, i2, intent, this.A0B, "BusinessConversionUtils");
        } else if (i == 64206) {
            z = true;
            AnonymousClass5F9.A04(C0003R.string.login_to_import_page_info);
            C06590Pq session = getSession();
            AnonymousClass61G.A06(session, "facebook_connect", this.A05, AnonymousClass3BL.A02(session, false), C14100jl.A01(getSession()));
            if (!z) {
                AnonymousClass61R r3 = this.A00;
                if (r3 != null) {
                    C1412261x A002 = A00(this, "facebook_connect");
                    A002.A07 = AnonymousClass3BL.A04(this.A03, false);
                    r3.Ajn(A002.A00());
                }
            } else {
                AnonymousClass61R r32 = this.A00;
                if (r32 != null) {
                    C1412261x A003 = A00(this, "facebook_account_selection");
                    A003.A07 = AnonymousClass3BL.A04(this.A03, true);
                    r32.AlP(A003.A00());
                }
            }
            super.onActivityResult(i, i2, intent);
        }
        z = false;
        if (!z) {
        }
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        if (this.A08) {
            C06590Pq r5 = this.A03;
            C135765qs.A02(r5, "facebook_connect", this.A05, AnonymousClass3BL.A02(r5, true), C14100jl.A01(this.A03));
            AnonymousClass2UH r0 = this.A01;
            if (r0 == null) {
                return false;
            }
            r0.Be6();
            return true;
        } else if (!AnonymousClass62H.A0C(this.A01)) {
            return false;
        } else {
            AnonymousClass61R r3 = this.A00;
            if (r3 != null) {
                C1412261x A002 = A00(this, "facebook_account_selection");
                A002.A07 = AnonymousClass3BL.A04(this.A03, true);
                r3.Ajn(A002.A00());
            }
            if (C1415763o.A05(this.A03)) {
                this.A01.A8B();
                return true;
            }
            this.A01.Be7(C137355tV.A00(this.A03));
            return true;
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A01 = AnonymousClass62H.A01(getActivity());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0063, code lost:
        if (r1 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (r0 == false) goto L_0x0061;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int A022 = AnonymousClass0Z0.A02(-275909405);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A05 = bundle2.getString("entry_point");
        this.A06 = bundle2.getString("business_signup");
        C06590Pq A002 = AnonymousClass0J1.A00(bundle2);
        this.A03 = A002;
        AnonymousClass0a4.A06(A002);
        AnonymousClass1HU r2 = new AnonymousClass1HU();
        r2.A0C(new C128275eQ(getActivity()));
        registerLifecycleListenerSet(r2);
        AnonymousClass2UH r0 = this.A01;
        if (r0 != null) {
            this.A00 = C30248DXi.A00(this.A03, this, r0.ALv(), r0.Aad());
        }
        AnonymousClass2UH r1 = this.A01;
        boolean A0F = AnonymousClass62H.A0F(r1);
        this.A08 = A0F;
        if (!A0F) {
            if (r1 != null) {
                boolean A7s = r1.A7s();
                z2 = true;
            }
            z2 = false;
            z = false;
        }
        z = true;
        this.A07 = z;
        if (this.A08) {
            RegFlowExtras A032 = AnonymousClass62H.A03(bundle2, this.A01);
            this.A04 = A032;
            AnonymousClass0a4.A06(A032);
            C06590Pq r5 = this.A03;
            C135765qs.A04(r5, "facebook_connect", this.A05, AnonymousClass3BL.A02(r5, true), C14100jl.A01(this.A03));
        } else {
            AnonymousClass61R r22 = this.A00;
            if (r22 != null) {
                C1412261x A003 = A00(this, "facebook_account_selection");
                A003.A07 = AnonymousClass3BL.A04(this.A03, true);
                r22.AnW(A003.A00());
            }
        }
        this.A0A = C1409760w.A00(this.A01);
        AnonymousClass0Z0.A09(-616750385, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2006500486);
        View inflate = layoutInflater.inflate(C0003R.layout.connect_fb_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(2026544249, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1715915950);
        super.onResume();
        ((TextView) this.mView.findViewById(C0003R.C0005id.title)).setText(C0003R.string.connect_to_fb);
        TextView textView = (TextView) this.mView.findViewById(C0003R.C0005id.subtitle);
        if (AnonymousClass62H.A0D(this.A01)) {
            String string = getContext().getString(C0003R.string.landing_terms);
            this.A02.setFooterTerms(this.A03, string, getContext().getString(C0003R.string.creator_profile_linked_to_pages, new Object[]{string}));
            this.A02.A01();
        } else {
            textView.setText(C100934Xs.A00(getContext(), this.A03, C0003R.string.no_admin_pages_show));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        AnonymousClass0Z0.A09(-1360048063, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(C0003R.C0005id.connect_text)).setText(C0003R.string.choose_page);
        view.findViewById(C0003R.C0005id.account_row).setOnClickListener(new AnonymousClass63Z(this));
        BusinessNavBar businessNavBar = (BusinessNavBar) view.findViewById(C0003R.C0005id.navigation_bar);
        this.A02 = businessNavBar;
        if (this.A07) {
            businessNavBar.setVisibility(0);
            this.A02.A02();
            this.A02.setSecondaryButtonText(C1415063c.A00(this.A03, this.A01));
            this.A02.setSecondaryButtonOnclickListeners(new C1414963b(this));
        }
        if (this.A0A && this.A01 != null) {
            StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0003R.C0005id.stepper_header);
            this.A09 = stepperHeader;
            stepperHeader.setVisibility(0);
            this.A09.A03(this.A01.ABJ(), this.A01.BrZ());
        }
    }
}
