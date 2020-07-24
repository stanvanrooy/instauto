package com.instagram.nux.activity;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.nux.fragment.OneTapAutoCompleteLoginLandingFragment;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0CL;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0J5;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1B9;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1P6;
import p000X.AnonymousClass60I;
import p000X.AnonymousClass6KY;
import p000X.C05090Ib;
import p000X.C05640Lj;
import p000X.C05700Lp;
import p000X.C05760Lv;
import p000X.C05860Mt;
import p000X.C06080Nr;
import p000X.C06300On;
import p000X.C06590Pq;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C115224xC;
import p000X.C125085Xm;
import p000X.C129445gM;
import p000X.C129635gk;
import p000X.C129645gl;
import p000X.C129655gm;
import p000X.C129675go;
import p000X.C129685gp;
import p000X.C129715gs;
import p000X.C129845h5;
import p000X.C130005hL;
import p000X.C130375hw;
import p000X.C130445i3;
import p000X.C131305jR;
import p000X.C131355jW;
import p000X.C132945m7;
import p000X.C136265rh;
import p000X.C13910jS;
import p000X.C140125yt;
import p000X.C1428268x;
import p000X.C15890nh;
import p000X.C15940nm;
import p000X.C16030nv;
import p000X.C17850qu;
import p000X.C18090rI;
import p000X.C22760yx;
import p000X.C22790z0;
import p000X.C27341Hl;
import p000X.C35051fj;
import p000X.C35071fl;
import p000X.C35111fp;
import p000X.C485228i;
import p000X.C55982bj;
import p000X.C68172yZ;
import p000X.C72813Hc;

public class SignedOutFragmentActivity extends BaseFragmentActivity implements C129635gk, C129645gl, AnonymousClass1B9, AnonymousClass0J5 {
    public AnonymousClass0RN A00;
    public C130375hw A01;
    public AnonymousClass0CL A02;
    public C68172yZ A03;
    public boolean A04 = true;
    public boolean A05 = false;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public String A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public final C11200ea A0C = new C129675go(this);

    public final boolean A0Y() {
        return true;
    }

    public static void A01(SignedOutFragmentActivity signedOutFragmentActivity) {
        C68172yZ r0 = signedOutFragmentActivity.A03;
        if (r0 == null) {
            return;
        }
        if (r0.getOwnerActivity() == null || !signedOutFragmentActivity.A03.getOwnerActivity().isDestroyed()) {
            signedOutFragmentActivity.A03.cancel();
        }
    }

    public final void A0V(Bundle bundle) {
        String str;
        C27341Hl oneTapLoginLandingFragment;
        int i;
        String str2;
        String str3;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        this.A08 = extras.getBoolean("SHOULD_START_AT_SAC_REG_FLOW", false);
        if (extras.containsKey("IS_ADD_ACCOUNT_FLOW")) {
            this.A0A = extras.getBoolean("IS_ADD_ACCOUNT_FLOW");
        }
        AnonymousClass0CL r1 = this.A02;
        if (this.A0A) {
            str = "is_add_account";
        } else {
            str = "is_not_add_account";
        }
        C22790z0 r3 = C22760yx.A00(r1).A00;
        C35071fl r2 = C35051fj.A0e;
        r3.Bpg(r2);
        r3.A3C(r2, AnonymousClass000.A0E("waterfallId:", C13910jS.A00()));
        r3.A3C(r2, str);
        extras.putBoolean("IS_ADD_ACCOUNT_FLOW", this.A0A);
        extras.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A02.getToken());
        if (extras.containsKey("last_accessed_user_id")) {
            this.A09 = extras.getString("last_accessed_user_id");
        }
        if (((Boolean) AnonymousClass0L6.A00(A0L(), AnonymousClass0L7.MOTION, "modal_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            overridePendingTransition(C0003R.anim.modal_slide_up_enter, C0003R.anim.modal_empty_animation);
        }
        if (extras.containsKey("uid") && extras.containsKey("token") && extras.containsKey("source")) {
            extras.putBoolean("IS_ONE_CLICK_LOGIN", true);
            this.A07 = true;
            this.A06 = extras.getBoolean("bypass");
            Uri A002 = C140125yt.A00(extras);
            String string = extras.getString("uid");
            AnonymousClass0CL r0 = this.A02;
            String string2 = extras.getString("token");
            String string3 = extras.getString("source");
            String string4 = extras.getString("auto_send");
            String A022 = C55982bj.A00().A02();
            String str4 = string;
            if (this.A06) {
                str3 = "accounts/one_click_login_bypass/";
            } else {
                str3 = "accounts/one_click_login/";
            }
            C15890nh r12 = new C15890nh(r0);
            r12.A09 = Constants.ONE;
            r12.A0C = str3;
            r12.A09("uid", str4);
            r12.A09("token", string2);
            r12.A09("source", string3);
            r12.A09("device_id", C05860Mt.A00(this));
            r12.A09("guid", C05860Mt.A02.A05(this));
            String A012 = C05760Lv.A01.A01();
            if (A012 == null) {
                A012 = "";
            }
            r12.A09("adid", A012);
            r12.A0A("auto_send", string4);
            r12.A0A("big_blue_token", A022);
            r12.A05(C129715gs.class, C05090Ib.A00());
            r12.A0G = true;
            C17850qu A032 = r12.A03();
            AnonymousClass0CL r22 = this.A02;
            AnonymousClass0RN r13 = this.A00;
            AnonymousClass0CL r19 = r22;
            AnonymousClass0RN r20 = r13;
            A032.A00 = new C129685gp(A002, string, r19, r20, this, this.A06, A0Q());
            A0N(A032);
            C130005hL.A01(C130005hL.A00(this.A02), "validate_one_click_login_token");
        }
        if (extras.containsKey("smsrecovery") && extras.getBoolean("smsrecovery") && extras.containsKey("token")) {
            C68172yZ r23 = new C68172yZ(this);
            this.A03 = r23;
            r23.A00(getResources().getString(C0003R.string.loading));
            C17850qu A052 = C125085Xm.A05(this, this.A02, extras.getString("token"), (String) null, "phone_number", "link");
            A052.A00 = new C129445gM(this, this.A02, this);
            A0N(A052);
        }
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            AnonymousClass1H6 A0Q = A05().A0Q();
            if (this.A08) {
                C18090rI.A00.A00();
                oneTapLoginLandingFragment = new C132945m7();
                oneTapLoginLandingFragment.setArguments(extras);
                this.A00 = oneTapLoginLandingFragment;
                i = C0003R.C0005id.layout_container_main;
                str2 = "android.secondaryaccount.CreateUsernameFragment";
            } else if ((!C72813Hc.A01(this.A02).A04(this.A02).isEmpty()) || !this.A01.A02().isEmpty()) {
                if (((Boolean) C05640Lj.A01(AnonymousClass0L7.ASSISTED_LOGIN, "enable_assisted_login", false)).booleanValue()) {
                    C15940nm.A02().A03();
                    oneTapLoginLandingFragment = new OneTapAutoCompleteLoginLandingFragment();
                    oneTapLoginLandingFragment.setArguments(extras);
                } else {
                    C15940nm.A02().A03();
                    oneTapLoginLandingFragment = new OneTapLoginLandingFragment();
                    oneTapLoginLandingFragment.setArguments(extras);
                }
                this.A00 = oneTapLoginLandingFragment;
                i = C0003R.C0005id.layout_container_main;
                str2 = "android.nux.OneTapLoginLandingFragment";
            } else if (C129845h5.A06() || !AnonymousClass1BA.A07(this, C0003R.attr.nuxAllowSignUpFlow, true)) {
                C15940nm.A02().A03();
                oneTapLoginLandingFragment = new C131355jW();
                oneTapLoginLandingFragment.setArguments(extras);
                this.A00 = oneTapLoginLandingFragment;
                i = C0003R.C0005id.layout_container_main;
                str2 = "android.nux.LoginLandingFragment";
            } else {
                C15940nm.A02().A03();
                oneTapLoginLandingFragment = new C131305jR();
                oneTapLoginLandingFragment.setArguments(extras);
                this.A00 = oneTapLoginLandingFragment;
                i = C0003R.C0005id.layout_container_main;
                str2 = "android.nux.FacebookLandingFragment";
            }
            A0Q.A04(i, oneTapLoginLandingFragment, str2);
            A0Q.A09();
        }
        if (extras.getBoolean("allow_confirm_email")) {
            new C115224xC(this, extras.getString("confirm_email_nonce"), extras.getString("confirm_email_encoded_email"), false).A00();
        }
    }

    public final void onBackPressed() {
        if (this.A04) {
            super.onBackPressed();
        }
    }

    public final C06590Pq A0L() {
        return this.A02;
    }

    public final String AOU() {
        return this.A09;
    }

    public final boolean Ae4() {
        return this.A0A;
    }

    public final void BiD(boolean z) {
        this.A0B = z;
    }

    public final void finish() {
        super.finish();
        if (((Boolean) AnonymousClass0L6.A00(A0L(), AnonymousClass0L7.MOTION, "modal_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            overridePendingTransition(C0003R.anim.modal_empty_animation, C0003R.anim.modal_slide_down_exit);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-2128268932);
        this.A02 = AnonymousClass0J1.A04(this);
        this.A01 = new C130375hw(this, (AnonymousClass0RN) null);
        super.onCreate(bundle);
        C16030nv.A01().A0G(this, this.A02, bundle);
        C05700Lp.A00().ADc(new C129655gm(this));
        C05700Lp.A00().ADc(new AnonymousClass60I(this));
        if (C06080Nr.A07(getApplicationContext()) && !C129845h5.A06() && !C129845h5.A07()) {
            AnonymousClass0Q7.A03().A0B(AnonymousClass6KY.A00(this));
        }
        C11130eT.A01.A02(AnonymousClass1P6.class, this.A0C);
        C130445i3 A003 = C130445i3.A00();
        synchronized (A003.A01) {
            A003.A00 = null;
        }
        C485228i.A00(this.A02).A03();
        C1428268x.A00().A03();
        AnonymousClass0Z0.A07(1293936791, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(1429927205);
        super.onDestroy();
        C55982bj.A00().A01 = null;
        C1428268x.A00().A04();
        C136265rh.A03.A03(this);
        C11130eT.A01.A03(AnonymousClass1P6.class, this.A0C);
        AnonymousClass0Z0.A07(2075760122, A002);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A04 = bundle.getBoolean("allow_back", true);
        this.A0B = bundle.getBoolean("is_nux_flow", false);
        this.A05 = bundle.getBoolean("has_followed", false);
        this.A07 = bundle.getBoolean("is_one_click_login", false);
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(164377301);
        super.onResume();
        C35111fp.A00(this.A02).A01(new C06300On("ig_app_auth"));
        setRequestedOrientation(1);
        AnonymousClass0Z0.A07(-923890750, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C16030nv.A01().A0E(bundle);
        bundle.putBoolean("allow_back", this.A04);
        bundle.putBoolean("is_nux_flow", this.A0B);
        bundle.putBoolean("has_followed", this.A05);
        bundle.putBoolean("is_one_click_login", this.A07);
    }
}
