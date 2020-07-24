package com.instagram.nux.fragment;

import android.content.Context;
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
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0CL;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2OA;
import p000X.C019000b;
import p000X.C05640Lj;
import p000X.C06590Pq;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C125085Xm;
import p000X.C129145fs;
import p000X.C129415gJ;
import p000X.C129865h7;
import p000X.C129915hC;
import p000X.C130315hq;
import p000X.C130425i1;
import p000X.C130515iA;
import p000X.C130885il;
import p000X.C130905in;
import p000X.C130915io;
import p000X.C131255jM;
import p000X.C131265jN;
import p000X.C131825kJ;
import p000X.C131845kL;
import p000X.C131875kO;
import p000X.C131885kP;
import p000X.C131905kR;
import p000X.C131935kU;
import p000X.C131965kX;
import p000X.C131985kZ;
import p000X.C132015kc;
import p000X.C132025kd;
import p000X.C132175ks;
import p000X.C132495lO;
import p000X.C134085nx;
import p000X.C134375oQ;
import p000X.C137115t5;
import p000X.C13910jS;
import p000X.C17850qu;
import p000X.C22800z1;
import p000X.C27341Hl;
import p000X.C28351Lj;
import p000X.C35071fl;
import p000X.C55982bj;
import p000X.C55992bk;
import p000X.C72813Hc;
import p000X.C72843Hg;

public class OneTapLoginLandingFragment extends C27341Hl implements AnonymousClass0RN, C137115t5 {
    public C131885kP A00;
    public C130425i1 A01;
    public C130905in A02;
    public AnonymousClass0CL A03;
    public boolean A04 = false;
    public C130315hq A05;
    public C134085nx A06;
    public final C11200ea A07 = new C131905kR(this);
    public ViewGroup mRootView;

    public final /* synthetic */ void BAX(C129915hC r2) {
        r2.A00(false);
    }

    public final String getModuleName() {
        return "one_tap";
    }

    public static List A00(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        List A042 = C72813Hc.A01(oneTapLoginLandingFragment.A03).A04(oneTapLoginLandingFragment.A03);
        if (A042.size() > 1 && ((Boolean) C05640Lj.A00(AnonymousClass0L7.MULTI_TAP_LOGIN_NEW, "enabled", false)).booleanValue()) {
            return A042;
        }
        ArrayList arrayList = new ArrayList();
        if (!A042.isEmpty()) {
            arrayList.add(A042.get(0));
        }
        return arrayList;
    }

    private void A01() {
        TextView textView = (TextView) this.mRootView.findViewById(C0003R.C0005id.left_button);
        textView.setText(getString(C0003R.string.switch_accounts));
        textView.setOnClickListener(new C131875kO(this));
        TextView textView2 = (TextView) this.mRootView.findViewById(C0003R.C0005id.right_button);
        textView2.setText(getString(C0003R.string.nux_dayone_sign_up));
        textView2.setOnClickListener(new C131845kL(this));
        C132175ks.A01(textView, textView2);
    }

    public static void A02(OneTapLoginLandingFragment oneTapLoginLandingFragment, C13910jS r2, C72843Hg r3) {
        C131255jM A032 = r2.A01(oneTapLoginLandingFragment.A03).A03(C129145fs.ONE_TAP);
        if (r3 != null) {
            A032.A03("instagram_id", r3.A03);
        }
        A032.A01();
    }

    public static void A03(OneTapLoginLandingFragment oneTapLoginLandingFragment, List list) {
        oneTapLoginLandingFragment.mRootView.removeAllViews();
        if (list.size() == 1) {
            C72843Hg r2 = (C72843Hg) list.get(0);
            LayoutInflater.from(oneTapLoginLandingFragment.mRootView.getContext()).inflate(C0003R.layout.one_tap_login_landing_single_user, oneTapLoginLandingFragment.mRootView);
            CircularImageView circularImageView = (CircularImageView) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.avatar_image_view);
            ImageUrl imageUrl = r2.A01;
            ImageUrl imageUrl2 = imageUrl;
            if (imageUrl != null) {
                circularImageView.setUrl(imageUrl2, oneTapLoginLandingFragment.getModuleName());
            } else {
                circularImageView.setImageDrawable(C019000b.A03(oneTapLoginLandingFragment.getContext(), C0003R.C0004drawable.profile_anonymous_user));
            }
            ViewGroup viewGroup = (ViewGroup) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.avatar_login_button_container);
            LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.ig_one_tap_log_in_button, viewGroup);
            circularImageView.setOnClickListener(new C131985kZ(oneTapLoginLandingFragment, r2));
            TextView textView = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.one_tap_log_in_button);
            textView.setOnClickListener(new C131965kX(oneTapLoginLandingFragment, r2));
            TextView textView2 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.remove_text_link);
            textView2.setOnClickListener(new C132025kd(oneTapLoginLandingFragment, r2));
            C132175ks.A01(textView2);
            View findViewById = oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.login_landing_logo);
            ((LinearLayout.LayoutParams) findViewById.getLayoutParams()).bottomMargin = oneTapLoginLandingFragment.getResources().getDimensionPixelSize(C0003R.dimen.logo_large_bottom_margin);
            findViewById.requestLayout();
            ((LinearLayout.LayoutParams) circularImageView.getLayoutParams()).bottomMargin = 0;
            circularImageView.requestLayout();
            TextView textView3 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.username);
            textView3.setText(r2.A04);
            textView3.setVisibility(0);
            oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.avatar_login_button_container).setOnClickListener(new C132015kc(oneTapLoginLandingFragment, r2));
            View findViewById2 = oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.remove_text_container);
            ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).topMargin = oneTapLoginLandingFragment.getResources().getDimensionPixelSize(C0003R.dimen.remove_large_top_margin);
            findViewById2.requestLayout();
            textView.setText(C0003R.string.log_in);
        } else {
            LayoutInflater.from(oneTapLoginLandingFragment.mRootView.getContext()).inflate(C0003R.layout.one_tap_login_landing_multiple_users, oneTapLoginLandingFragment.mRootView);
            C131885kP r0 = new C131885kP(oneTapLoginLandingFragment);
            oneTapLoginLandingFragment.A00 = r0;
            r0.A00(list);
            ((ListView) oneTapLoginLandingFragment.mRootView.findViewById(16908298)).setAdapter(oneTapLoginLandingFragment.A00);
        }
        ((NetzDgTermsTextView) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.netz_dg_terms_text_view)).A00(oneTapLoginLandingFragment.A03);
        oneTapLoginLandingFragment.A01();
        C129415gJ.A00((ImageView) oneTapLoginLandingFragment.mRootView.findViewById(C0003R.C0005id.login_landing_logo), AnonymousClass1BA.A03(oneTapLoginLandingFragment.getContext(), C0003R.attr.glyphColorPrimary));
        C130905in r02 = oneTapLoginLandingFragment.A02;
        int size = list.size();
        C22800z1 r4 = r02.A00;
        C35071fl r3 = C130905in.A01;
        C131265jN A002 = C131265jN.A00();
        A002.A01("one_tap_user_count", size);
        r4.A5M(r3, "shown_one_tap_users", (String) null, A002);
    }

    public final void A04(C72843Hg r4) {
        A02(this, C13910jS.RemoveTapped, r4);
        C130905in.A00(this.A02, "remove_one_tap_user");
        AnonymousClass2OA r2 = new AnonymousClass2OA(getActivity());
        r2.A07(C0003R.string.remove_account);
        r2.A0M(getString(C0003R.string.remove_account_body));
        r2.A0A(C0003R.string.remove, new C131825kJ(this, r4));
        r2.A09(C0003R.string.cancel, new C131935kU(this, r4));
        r2.A03().show();
    }

    public final void A05(C72843Hg r16, String str) {
        C131255jM A032 = C13910jS.RegNextPressed.A01(this.A03).A03(C129145fs.ONE_TAP);
        C72843Hg r14 = r16;
        A032.A03("instagram_id", r14.A03);
        A032.A03("entry_point", str);
        A032.A01();
        AnonymousClass0P4 A012 = C13910jS.OneTapLoginAccountClicked.A01(this.A03).A01(C129145fs.ONE_TAP);
        A012.A0E("num_accounts", Integer.valueOf(C72813Hc.A01(this.A03).A04(this.A03).size()));
        AnonymousClass0WN.A01(this.A03).BcG(A012);
        C130905in.A00(this.A02, "click_one_tap_user");
        C130885il r5 = new C130885il(this, this.A03, this, this, C129145fs.ONE_TAP, r14.A04, r14.A03, this, r14);
        C17850qu A042 = C125085Xm.A04(getContext(), this.A03, r14.A02, r14.A03, C55982bj.A00().A02());
        A042.A00 = r5;
        schedule(A042);
    }

    public final void BOg(AnonymousClass0CL r11, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Bundle bundle) {
        String str4 = str3;
        AnonymousClass0CL r1 = r11;
        String str5 = str;
        String str6 = str2;
        this.A05.BOg(r1, str5, str6, str4, z, z2, z3, z4, bundle);
        C130905in r12 = this.A02;
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
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-958745445);
        super.onCreate(bundle);
        AnonymousClass0CL A032 = AnonymousClass0J1.A03(this.mArguments);
        this.A03 = A032;
        registerLifecycleListener(new C132495lO(A032, getActivity(), this, C129145fs.ONE_TAP));
        C134085nx r1 = new C134085nx(this.A03, this);
        this.A06 = r1;
        r1.A00();
        this.A05 = new C130315hq(getActivity());
        if (C130425i1.A03 == null) {
            C130425i1.A03 = new C130425i1();
        }
        C130425i1 r4 = C130425i1.A03;
        this.A01 = r4;
        AnonymousClass0CL r5 = this.A03;
        Context context = getContext();
        r4.A00(r5, context, new C28351Lj(context, AnonymousClass1L8.A00(this)), this, (C130515iA) null);
        AnonymousClass0CL r2 = this.A03;
        C130905in r22 = (C130905in) r2.AVA(C130905in.class, new C130915io(r2));
        this.A02 = r22;
        r22.A02(C72813Hc.A01(this.A03).A04(this.A03).size());
        AnonymousClass0Z0.A09(-2130233287, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(821342675);
        this.mRootView = (ViewGroup) layoutInflater.inflate(C0003R.layout.one_tap_login_landing_fragment, viewGroup, false);
        List A002 = A00(this);
        if (A002.isEmpty()) {
            C134375oQ.A09(this.mFragmentManager, this.mArguments);
            this.A02.A01();
            AnonymousClass0Z0.A09(-367497839, A022);
            return null;
        }
        A02(this, C13910jS.RegScreenLoaded, (C72843Hg) null);
        A03(this, A002);
        ViewGroup viewGroup2 = this.mRootView;
        AnonymousClass0Z0.A09(-673345754, A022);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1615538625);
        super.onDestroyView();
        C11130eT.A01.A03(C55992bk.class, this.A07);
        AnonymousClass0Z0.A09(329104545, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-961620385);
        this.A04 = true;
        super.onPause();
        AnonymousClass0Z0.A09(805243369, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1426368350);
        this.A04 = false;
        super.onResume();
        AnonymousClass0Z0.A09(1550725863, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C11130eT.A01.A02(C55992bk.class, this.A07);
    }
}
