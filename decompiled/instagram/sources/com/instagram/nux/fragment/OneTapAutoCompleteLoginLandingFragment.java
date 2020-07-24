package com.instagram.nux.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.nux.p020ui.NetzDgTermsTextView;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0CL;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2OA;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C129145fs;
import p000X.C129415gJ;
import p000X.C129865h7;
import p000X.C129915hC;
import p000X.C130315hq;
import p000X.C130375hw;
import p000X.C130445i3;
import p000X.C130745iX;
import p000X.C130905in;
import p000X.C130915io;
import p000X.C131255jM;
import p000X.C131265jN;
import p000X.C131745k9;
import p000X.C131765kB;
import p000X.C131785kD;
import p000X.C131815kG;
import p000X.C131835kK;
import p000X.C131865kN;
import p000X.C131895kQ;
import p000X.C131915kS;
import p000X.C131925kT;
import p000X.C131955kW;
import p000X.C131975kY;
import p000X.C131995ka;
import p000X.C132005kb;
import p000X.C132135ko;
import p000X.C132175ks;
import p000X.C132495lO;
import p000X.C134085nx;
import p000X.C137115t5;
import p000X.C13910jS;
import p000X.C22800z1;
import p000X.C27341Hl;
import p000X.C35071fl;
import p000X.C72813Hc;

public class OneTapAutoCompleteLoginLandingFragment extends C27341Hl implements AnonymousClass0RN, C137115t5 {
    public C131895kQ A00;
    public C130445i3 A01;
    public C130375hw A02;
    public C130905in A03;
    public AnonymousClass0CL A04;
    public C130315hq A05;
    public C134085nx A06;
    public ViewGroup mRootView;

    public final /* synthetic */ void BAX(C129915hC r2) {
        r2.A00(false);
    }

    public final String getModuleName() {
        return "one_tap";
    }

    private void A00() {
        TextView textView = (TextView) this.mRootView.findViewById(C0003R.C0005id.left_button);
        textView.setText(getString(C0003R.string.switch_accounts));
        textView.setOnClickListener(new C131865kN(this));
        TextView textView2 = (TextView) this.mRootView.findViewById(C0003R.C0005id.right_button);
        textView2.setText(getString(C0003R.string.nux_dayone_sign_up));
        textView2.setOnClickListener(new C131835kK(this));
        C132175ks.A01(textView, textView2);
    }

    public static void A01(OneTapAutoCompleteLoginLandingFragment oneTapAutoCompleteLoginLandingFragment, C13910jS r2, C131785kD r3) {
        C131255jM A032 = r2.A01(oneTapAutoCompleteLoginLandingFragment.A04).A03(C129145fs.ONE_TAP);
        if (r3 != null) {
            A032.A03("instagram_id", r3.A06());
        }
        A032.A01();
    }

    public static void A02(OneTapAutoCompleteLoginLandingFragment oneTapAutoCompleteLoginLandingFragment, List list) {
        oneTapAutoCompleteLoginLandingFragment.mRootView.removeAllViews();
        if (list.size() == 1) {
            C131785kD r2 = (C131785kD) list.get(0);
            LayoutInflater.from(oneTapAutoCompleteLoginLandingFragment.mRootView.getContext()).inflate(C0003R.layout.one_tap_login_landing_single_user, oneTapAutoCompleteLoginLandingFragment.mRootView);
            CircularImageView circularImageView = (CircularImageView) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.avatar_image_view);
            ImageUrl A012 = r2.A01();
            if (A012 != null) {
                circularImageView.setUrl(A012);
            } else {
                circularImageView.setImageDrawable(C019000b.A03(oneTapAutoCompleteLoginLandingFragment.getContext(), C0003R.C0004drawable.profile_anonymous_user));
            }
            circularImageView.setOnClickListener(new C131975kY(oneTapAutoCompleteLoginLandingFragment, r2));
            ViewGroup viewGroup = (ViewGroup) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.avatar_login_button_container);
            boolean z = r2 instanceof C131765kB;
            int i = C0003R.layout.ig_one_tap_log_in_button;
            if (z) {
                switch (((C131765kB) r2).A03.ordinal()) {
                    case 0:
                        i = C0003R.layout.fb_one_tap_log_in_button;
                        break;
                    case 1:
                        i = C0003R.layout.google_one_tap_log_in_button;
                        break;
                    default:
                        throw new RuntimeException("Unknown account type!");
                }
            }
            LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup);
            View findViewById = oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.one_tap_log_in_button);
            findViewById.setOnClickListener(new C131955kW(oneTapAutoCompleteLoginLandingFragment, r2));
            TextView textView = (TextView) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.remove_text_link);
            textView.setOnClickListener(new C131995ka(oneTapAutoCompleteLoginLandingFragment, r2));
            C132175ks.A01(textView);
            View findViewById2 = oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.login_landing_logo);
            ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).bottomMargin = oneTapAutoCompleteLoginLandingFragment.getResources().getDimensionPixelSize(C0003R.dimen.logo_large_bottom_margin);
            findViewById2.requestLayout();
            ((LinearLayout.LayoutParams) circularImageView.getLayoutParams()).bottomMargin = 0;
            circularImageView.requestLayout();
            TextView textView2 = (TextView) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.username);
            textView2.setText(r2.A07());
            textView2.setVisibility(0);
            oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.avatar_login_button_container).setOnClickListener(new C132005kb(oneTapAutoCompleteLoginLandingFragment, r2));
            View findViewById3 = oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.remove_text_container);
            ((LinearLayout.LayoutParams) findViewById3.getLayoutParams()).topMargin = oneTapAutoCompleteLoginLandingFragment.getResources().getDimensionPixelSize(C0003R.dimen.remove_large_top_margin);
            findViewById3.requestLayout();
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(C0003R.string.log_in);
            }
        } else {
            LayoutInflater.from(oneTapAutoCompleteLoginLandingFragment.mRootView.getContext()).inflate(C0003R.layout.one_tap_login_landing_multiple_users, oneTapAutoCompleteLoginLandingFragment.mRootView);
            C131895kQ r0 = new C131895kQ(oneTapAutoCompleteLoginLandingFragment);
            oneTapAutoCompleteLoginLandingFragment.A00 = r0;
            r0.A00(list);
            ((ListView) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(16908298)).setAdapter(oneTapAutoCompleteLoginLandingFragment.A00);
        }
        ((NetzDgTermsTextView) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.netz_dg_terms_text_view)).A00(oneTapAutoCompleteLoginLandingFragment.A04);
        oneTapAutoCompleteLoginLandingFragment.A00();
        C129415gJ.A00((ImageView) oneTapAutoCompleteLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.login_landing_logo), C0003R.color.igds_primary_icon);
        C130905in r02 = oneTapAutoCompleteLoginLandingFragment.A03;
        int size = list.size();
        C22800z1 r4 = r02.A00;
        C35071fl r3 = C130905in.A01;
        C131265jN A002 = C131265jN.A00();
        A002.A01("one_tap_user_count", size);
        r4.A5M(r3, "shown_one_tap_users", (String) null, A002);
    }

    public final void A03(C131785kD r4) {
        A01(this, C13910jS.RemoveTapped, r4);
        C130905in.A00(this.A03, "remove_one_tap_user");
        AnonymousClass2OA r2 = new AnonymousClass2OA(getActivity());
        r2.A07(C0003R.string.remove_account);
        r2.A0M(getString(C0003R.string.remove_account_body));
        r2.A0A(C0003R.string.remove, new C131815kG(this, r4));
        r2.A09(C0003R.string.cancel, new C131925kT(this, r4));
        r2.A03().show();
    }

    public final void A04(C131785kD r9, String str) {
        C131255jM A032 = C13910jS.RegNextPressed.A01(this.A04).A03(C129145fs.ONE_TAP);
        A032.A03("instagram_id", r9.A06());
        A032.A03("entry_point", str);
        A032.A01();
        AnonymousClass0P4 A012 = C13910jS.OneTapLoginAccountClicked.A01(this.A04).A01(C129145fs.ONE_TAP);
        A012.A0E("num_accounts", Integer.valueOf(C72813Hc.A01(this.A04).A04(this.A04).size()));
        AnonymousClass0WN.A01(this.A04).BcG(A012);
        C130905in.A00(this.A03, "click_one_tap_user");
        C130745iX.A00.A01(this.A04, r9, this, C129145fs.ONE_TAP, this, new C132135ko(this));
    }

    public final void BOg(AnonymousClass0CL r11, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Bundle bundle) {
        String str4 = str3;
        AnonymousClass0CL r1 = r11;
        String str5 = str;
        String str6 = str2;
        this.A05.BOg(r1, str5, str6, str4, z, z2, z3, z4, bundle);
        C130905in r12 = this.A03;
        C130905in.A00(r12, "start_2fac_login");
        r12.A00.ADB(C130905in.A01);
    }

    public final void B9z() {
    }

    public final void BCW() {
    }

    public final void BML() {
    }

    public final void BMN() {
    }

    public final void BMO() {
    }

    public final void BOX(C129865h7 r1) {
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1776937894);
        super.onCreate(bundle);
        AnonymousClass0CL A032 = AnonymousClass0J1.A03(this.mArguments);
        this.A04 = A032;
        registerLifecycleListener(new C132495lO(A032, getActivity(), this, C129145fs.ONE_TAP));
        C134085nx r1 = new C134085nx(this.A04, this);
        this.A06 = r1;
        r1.A00();
        this.A05 = new C130315hq(getActivity());
        this.A01 = C130445i3.A00();
        this.A02 = new C130375hw(getContext(), this);
        AnonymousClass0CL r2 = this.A04;
        C130905in r22 = (C130905in) r2.AVA(C130905in.class, new C130915io(r2));
        this.A03 = r22;
        r22.A02(C72813Hc.A01(this.A04).A04(this.A04).size());
        AnonymousClass0Z0.A09(659298687, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1667860821);
        this.mRootView = (ViewGroup) layoutInflater.inflate(C0003R.layout.one_tap_login_landing_fragment, viewGroup, false);
        Map A023 = this.A02.A02();
        this.A01.A01(this.A04, getContext(), this, new C131745k9(this, A023, new C131915kS(this)));
        ViewGroup viewGroup2 = this.mRootView;
        AnonymousClass0Z0.A09(-1452068624, A022);
        return viewGroup2;
    }
}
