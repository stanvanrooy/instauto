package com.instagram.genericsurvey.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Q6;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1LI;
import p000X.AnonymousClass1LK;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1PL;
import p000X.AnonymousClass1RA;
import p000X.AnonymousClass1RD;
import p000X.AnonymousClass1RH;
import p000X.AnonymousClass1RJ;
import p000X.AnonymousClass1S2;
import p000X.AnonymousClass1S3;
import p000X.AnonymousClass1ST;
import p000X.AnonymousClass1SU;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass1VH;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2UZ;
import p000X.AnonymousClass6TG;
import p000X.AnonymousClass6Y6;
import p000X.AnonymousClass6YC;
import p000X.AnonymousClass6YE;
import p000X.AnonymousClass6YF;
import p000X.AnonymousClass6Z5;
import p000X.AnonymousClass6ZG;
import p000X.AnonymousClass6ZJ;
import p000X.AnonymousClass6ZK;
import p000X.AnonymousClass6a7;
import p000X.C06170Oa;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C124685Vw;
import p000X.C149066Zb;
import p000X.C149166Zl;
import p000X.C149186Zp;
import p000X.C149206Zr;
import p000X.C149216Zs;
import p000X.C149256Zw;
import p000X.C149396aG;
import p000X.C149406aH;
import p000X.C149416aI;
import p000X.C149466aN;
import p000X.C149486aP;
import p000X.C153166ge;
import p000X.C15890nh;
import p000X.C159166qo;
import p000X.C15960no;
import p000X.C17020pY;
import p000X.C17070pd;
import p000X.C17850qu;
import p000X.C23300zv;
import p000X.C256119n;
import p000X.C26301Cs;
import p000X.C27301Hh;
import p000X.C27371Ho;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C29181Ox;
import p000X.C29631Qq;
import p000X.C29671Qu;
import p000X.C29791Rg;
import p000X.C29851Rn;
import p000X.C29951Rx;
import p000X.C30691Uv;
import p000X.C30701Uw;
import p000X.C32711bj;
import p000X.C34071dx;
import p000X.C37141jB;
import p000X.C37591ju;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C49022Ak;
import p000X.C51852Mj;
import p000X.C52172Ns;
import p000X.C52362Om;
import p000X.C57002dP;
import p000X.C57012dQ;
import p000X.C57042dT;
import p000X.C68072yO;
import p000X.C711639e;

public class GenericSurveyFragment extends AnonymousClass2NN implements C27371Ho, AnonymousClass1HK, AnonymousClass0Q6, AnonymousClass1LK, AbsListView.OnScrollListener, AnonymousClass1HM, C149486aP, AnonymousClass1LI, AnonymousClass6YE {
    public int A00 = -1;
    public long A01;
    public long A02;
    public ViewGroup A03;
    public AnonymousClass6Z5 A04;
    public C57042dT A05;
    public C153166ge A06;
    public AnonymousClass6a7 A07;
    public AnonymousClass0C1 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public C28051Kf A0E;
    public C29631Qq A0F;
    public AnonymousClass1RJ A0G;
    public AnonymousClass1UY A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public final List A0L = new ArrayList();
    public final C11200ea A0M = new C149416aI(this);
    public final C11200ea A0N = new C149406aH(this);
    public final AnonymousClass1I1 A0O = new AnonymousClass1I1();
    public final AnonymousClass1I6 A0P = AnonymousClass6TG.A00();
    public ViewGroup mContentContainer;
    public ViewGroup mEndScreen;
    public ViewStub mEndScreenViewStub;
    public SpinnerImageView mLoadingSpinner;
    public C149206Zr mNavbarController;
    public ViewGroup mRetryView;
    public ViewStub mRetryViewStub;

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return true;
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A01(GenericSurveyFragment genericSurveyFragment) {
        AnonymousClass0C1 r0 = genericSurveyFragment.A08;
        String str = genericSurveyFragment.A09;
        String str2 = genericSurveyFragment.A0I;
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.A0N;
        r2.A0C = "survey/get/";
        r2.A09("type", str);
        r2.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
        r2.A0A("extra_data_token", str2);
        r2.A06(C149216Zs.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new C149186Zp(genericSurveyFragment);
        genericSurveyFragment.schedule(A032);
    }

    public static void A02(GenericSurveyFragment genericSurveyFragment) {
        genericSurveyFragment.mContentContainer.setVisibility(8);
        C149466aN r4 = genericSurveyFragment.A07.A01;
        switch (r4.A01.intValue()) {
            case 0:
                View A002 = C57012dQ.A00(genericSurveyFragment.getContext(), genericSurveyFragment.A03);
                C57012dQ.A01((C57002dP) A002.getTag(), r4.A00, new C49022Ak(), genericSurveyFragment);
                genericSurveyFragment.A03.addView(A002);
                genericSurveyFragment.A03.invalidate();
                return;
            case 1:
                if (genericSurveyFragment.mEndScreen == null) {
                    genericSurveyFragment.mEndScreen = (ViewGroup) genericSurveyFragment.mEndScreenViewStub.inflate();
                }
                genericSurveyFragment.mEndScreen.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public static void A04(GenericSurveyFragment genericSurveyFragment) {
        C06220Of.A0E(genericSurveyFragment.mView);
        genericSurveyFragment.A01 = System.currentTimeMillis();
        genericSurveyFragment.A02 = 0;
        AnonymousClass6Z5 r2 = genericSurveyFragment.A04;
        r2.A03.clear();
        AnonymousClass6ZJ r1 = r2.A00;
        r1.A07.clear();
        r1.A01 = 0;
        r1.A05 = false;
        r1.A04 = false;
        r1.A00 = 0;
        r1.A02 = 0;
        r1.A06 = false;
        r2.A02.A06();
        AnonymousClass6Z5.A00(r2);
        if (genericSurveyFragment.A00 >= genericSurveyFragment.A0L.size() - 1) {
            genericSurveyFragment.A0B = true;
            A03(genericSurveyFragment);
            A02(genericSurveyFragment);
            return;
        }
        AnonymousClass1RJ r12 = genericSurveyFragment.A0G;
        if (r12.A0G()) {
            r12.A0F("context_switch");
        }
        genericSurveyFragment.A00++;
        A03(genericSurveyFragment);
        genericSurveyFragment.A04.A01(((C149166Zl) genericSurveyFragment.A0L.get(genericSurveyFragment.A00)).A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r8.equals("done_button") != false) goto L_0x0011;
     */
    private void A05(String str) {
        boolean z;
        if (!str.equals("auto_exit_after_completion")) {
            z = false;
        }
        z = true;
        C23300zv.A00(this.A08).BXT(new C159166qo(this.A09, this.A0I, this.A0K, this.A0J, z));
        String AVo = this.A0P.AVo();
        String A002 = C149396aG.A00(this.A07, this.A00);
        AnonymousClass0C1 r2 = this.A08;
        C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "exit_event"), this);
        A032.A4c = AVo;
        A032.A46 = A002;
        A032.A3U = str;
        AnonymousClass0WN.A01(r2).BdB(A032.A03());
    }

    public final void Avl() {
        A05("close_button");
        this.mFragmentManager.A0W();
    }

    public final void Avq() {
        A05("done_button");
        this.mFragmentManager.A0W();
    }

    public final void AwM() {
        C153166ge r1 = this.A06;
        if (r1 == null || this.A05 == null || TextUtils.isEmpty(r1.A03)) {
            AnonymousClass6a7 r12 = this.A07;
            String str = r12.A03;
            String str2 = this.A09;
            String A002 = C149396aG.A00(r12, this.A00);
            long currentTimeMillis = (this.A02 + System.currentTimeMillis()) - this.A01;
            AnonymousClass0C1 r5 = this.A08;
            C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "skip_button"), this);
            A032.A4p = str;
            A032.A4q = str2;
            A032.A46 = A002;
            A032.A1t = currentTimeMillis;
            A032.A1y = C06270Ok.A00();
            AnonymousClass0WN.A01(r5).BdB(A032.A03());
            A04(this);
            return;
        }
        AnonymousClass6a7 r13 = this.A07;
        String str3 = r13.A03;
        String str4 = this.A09;
        String A003 = C149396aG.A00(r13, this.A00);
        String str5 = this.A06.A05;
        AnonymousClass0C1 r3 = this.A08;
        C37141jB A033 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "skip_question"), this);
        A033.A4p = str3;
        A033.A4q = str4;
        A033.A46 = A003;
        A033.A4L = str5;
        A033.A1y = C06270Ok.A00();
        AnonymousClass0WN.A01(r3).BcG(A033.A03());
        C06220Of.A0E(this.mView);
        A03(this);
        AnonymousClass6Z5 r52 = this.A04;
        C57042dT r4 = this.A05;
        String str6 = this.A06.A03;
        AnonymousClass6ZJ r2 = r52.A00;
        int i = 0;
        while (true) {
            if (i < r4.A00()) {
                if (r4.A02(i).A05.equals(str6)) {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        r2.A00(i);
        AnonymousClass6Z5.A00(r52);
    }

    public final /* bridge */ /* synthetic */ void B4n(Object obj, Object obj2) {
        AnonymousClass6a7 r0 = this.A07;
        String str = r0.A03;
        String str2 = this.A09;
        String str3 = ((C149166Zl) r0.A05.get(this.A00)).A00;
        int i = ((AnonymousClass6ZJ) obj2).A01;
        AnonymousClass0C1 r6 = this.A08;
        C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "response"), this);
        A032.A47 = "partial";
        A032.A4p = str;
        A032.A4q = str2;
        A032.A46 = str3;
        A032.A1L = i;
        C06170Oa A002 = C06170Oa.A00();
        C153166ge A022 = ((C57042dT) obj).A02(i);
        C06270Ok A003 = C06270Ok.A00();
        A003.A09("question_id", A022.A05);
        A003.A04("answers", A022.A01());
        A002.A00.add(A003);
        A032.A1z = A002;
        A032.A1y = C06270Ok.A00();
        AnonymousClass0WN.A01(r6).BdB(A032.A03());
        C476524w A072 = C476624x.A07(this.mView);
        A072.A0N();
        A072.A0E(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A072.A0O();
        C06220Of.A0E(this.mView);
    }

    public final /* bridge */ /* synthetic */ void B4p(Object obj, Object obj2) {
        C57042dT r14 = (C57042dT) obj;
        AnonymousClass6ZJ r15 = (AnonymousClass6ZJ) obj2;
        AnonymousClass6a7 r0 = this.A07;
        String str = r0.A03;
        String str2 = this.A09;
        String str3 = ((C149166Zl) r0.A05.get(this.A00)).A00;
        String str4 = null;
        for (AnonymousClass6ZK r2 : ((C149166Zl) this.A07.A05.get(this.A00)).A01) {
            Integer num = r2.A07;
            if (num == Constants.ZERO || num == Constants.A0C) {
                str4 = r2.A02.APo();
            }
        }
        int i = r15.A02;
        AnonymousClass0C1 r5 = this.A08;
        C37141jB A032 = C37591ju.A03(AnonymousClass000.A0E("instagram_survey_", "response"), this);
        A032.A4p = str;
        A032.A47 = "finished";
        A032.A4q = str2;
        A032.A46 = str3;
        A032.A3v = str4;
        A032.A1t = (this.A02 + System.currentTimeMillis()) - this.A01;
        A032.A1L = i;
        A032.A1z = r14.A01();
        A032.A1y = C06270Ok.A00();
        AnonymousClass0WN.A01(r5).BdB(A032.A03());
        if (this.A00 >= this.A0L.size() - 1) {
            A05("auto_exit_after_completion");
        }
        A04(this);
    }

    public final void BGl(C153166ge r1, C57042dT r2) {
        this.A06 = r1;
        this.A05 = r2;
    }

    public final void BGn(String str, int i) {
        String str2 = str;
        int i2 = i;
        C149256Zw.A00(this.A0P.AVo(), C149396aG.A00(this.A07, this.A00), str2, i2, this, this.A08);
    }

    public final void BHk(Reel reel, AnonymousClass6YC r15, List list) {
        this.A04.A00.A06 = true;
        if (this.A0H == null) {
            this.A0H = new AnonymousClass1UY(this.A08, new AnonymousClass1UZ(this), this);
        }
        AnonymousClass1UY r5 = this.A0H;
        r5.A0A = this.A0P.AVo();
        r5.A04 = new C124685Vw(getRootActivity(), r15.ASZ(), Constants.ONE, new C149066Zb(this));
        List list2 = list;
        r5.A05(r15, reel, list2, list2, AnonymousClass1OY.RATE_ADS, 0, (ReelChainingConfig) null);
    }

    public final void BNR(C51852Mj r4, C49022Ak r5) {
        if (r4.A00.equals("bake_off")) {
            this.mFragmentManager.A0W();
            C52362Om r2 = new C52362Om(getActivity(), this.A08);
            r2.A02 = AnonymousClass2UZ.A00().A0K((String) null);
            r2.A02();
        }
    }

    public final void configureActionBar(AnonymousClass1EX r8) {
        AnonymousClass1EX r2 = r8;
        this.mNavbarController.A01(r8);
        if (this.A0C) {
            C149206Zr r1 = this.mNavbarController;
            AnonymousClass6a7 r0 = this.A07;
            r1.A02(r2, r0.A02, this.A0B, r0.A06, r0.A07);
            this.mNavbarController.A00(this.A00, this.A07.A00, this.A0L.size());
        }
    }

    public final boolean onBackPressed() {
        A05("back_button");
        C34071dx A002 = A00();
        if (A002 == null || !A002.A0b()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1795258400);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A08 = A062;
        this.A04 = new AnonymousClass6Z5(getContext(), this, A062, this);
        this.A09 = this.mArguments.getString("GenericSurveyFragment.SURVEY_TYPE");
        this.A0I = this.mArguments.getString("GenericSurveyFragment.EXTRA_DATA_TOKEN");
        this.A0K = this.mArguments.getString("GenericSurveyFragment.ARGUMENTS_TRACKING_TOKEN");
        this.A0J = this.mArguments.getString("GenericSurveyFragment.ARGUMENTS_PARENT_MEDIA_ID");
        C23300zv.A00(this.A08).A02(C711639e.class, this.A0M);
        C23300zv.A00(this.A08).A02(C52172Ns.class, this.A0N);
        AnonymousClass1LO r11 = new AnonymousClass1LO(this, false, getContext(), this.A08);
        C27301Hh r3 = new C27301Hh(getContext());
        AnonymousClass6Z5 r7 = this.A04;
        AnonymousClass1RA r1 = new AnonymousClass1RA(this, r3, r7, this.A0O);
        this.A0G = new AnonymousClass1RJ(getContext(), this.A08, this, r7, (String) null);
        AnonymousClass1S2 r14 = new AnonymousClass1S2(getContext(), this.A08, (C27371Ho) this, (AnonymousClass1PL) this.A04, r11, (AnonymousClass1I6) null);
        AnonymousClass6Z5 r4 = this.A04;
        AnonymousClass1S3 r8 = new AnonymousClass1S3(this, this, r4, r14);
        C29791Rg r9 = new C29791Rg(this.A08, getActivity(), r4, this);
        C29851Rn r72 = new C29851Rn(getActivity(), this.A08, this.A04, this.A0G);
        C68072yO r26 = new C68072yO();
        AnonymousClass1RD r6 = new AnonymousClass1RD(getActivity(), new AnonymousClass1RH(this.A08));
        C28051Kf A002 = C28021Kc.A00();
        this.A0E = A002;
        Context context = getContext();
        AnonymousClass0C1 r5 = this.A08;
        AnonymousClass1I6 r42 = this.A0P;
        AnonymousClass1I6 r17 = r42;
        AnonymousClass1ST r32 = new AnonymousClass1ST(r5, this, A002, AnonymousClass1SU.A00(context, r5, r17, this, new C29951Rx(r5, r42), C17070pd.NOT_SET, (AnonymousClass1LO) null));
        AnonymousClass1RJ r15 = this.A0G;
        AnonymousClass0C1 r10 = this.A08;
        AnonymousClass1I6 r142 = this.A0P;
        AnonymousClass1RJ r21 = r15;
        AnonymousClass6Y6 r16 = new AnonymousClass6Y6(this, this.mFragmentManager, this, this.A04, r21, r8, r1, r9, r72, r26, r10, r142, r11, r6, new AnonymousClass1US(getActivity(), r10), C29181Ox.A00(getContext(), r10), this.A0E, r32);
        C30691Uv r143 = new C30691Uv(getContext(), this, this.mFragmentManager, this.A04, this, this.A08);
        r143.A0B = this.A0G;
        r143.A04 = r8;
        r143.A0F = this.A0P;
        r143.A09 = r1;
        r143.A0E = r9;
        r143.A05 = r16;
        r143.A01 = r11;
        r143.A0G = r72;
        r143.A0A = r6;
        r143.A0D = r26;
        r143.A08 = new C30701Uw();
        AnonymousClass1VH A003 = r143.A00();
        this.A0F = new C29631Qq(this.A08, new AnonymousClass6ZG(this));
        C29671Qu r12 = new C29671Qu(this, this, this.A08);
        registerLifecycleListener(this.A0F);
        registerLifecycleListener(r12);
        registerLifecycleListener(A003);
        this.A0O.A0B(A003);
        A01(this);
        setListAdapter(this.A04);
        AnonymousClass0Z0.A09(1582036265, A022);
    }

    private C34071dx A00() {
        if (getActivity() == null) {
            return null;
        }
        return C17020pY.A00().A0T(getActivity());
    }

    public static void A03(GenericSurveyFragment genericSurveyFragment) {
        ((BaseFragmentActivity) genericSurveyFragment.getActivity()).AFO().A0E();
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final C06590Pq getSession() {
        return this.A08;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(719571197);
        this.A02 += System.currentTimeMillis() - this.A01;
        AnonymousClass0Z0.A0A(-808301759, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(1451412524);
        this.A01 = System.currentTimeMillis();
        AnonymousClass0Z0.A0A(543659890, A032);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-707673643);
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_ad_survey, viewGroup, false);
        this.A03 = (ViewGroup) inflate.findViewById(C0003R.C0005id.layout_container);
        this.mEndScreenViewStub = (ViewStub) inflate.findViewById(C0003R.C0005id.survey_end_screen);
        this.mRetryViewStub = (ViewStub) inflate.findViewById(C0003R.C0005id.survey_retry);
        this.mContentContainer = (ViewGroup) inflate.findViewById(C0003R.C0005id.content_container);
        this.mLoadingSpinner = (SpinnerImageView) inflate.findViewById(C0003R.C0005id.loading_spinner);
        this.mNavbarController = new C149206Zr(this, getResources());
        ViewGroup viewGroup2 = this.A03;
        AnonymousClass0Z0.A09(-1305064042, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(100112190);
        super.onDestroy();
        AnonymousClass0Q7.A03().A0D(this);
        C23300zv.A00(this.A08).A03(C711639e.class, this.A0M);
        C23300zv.A00(this.A08).A03(C52172Ns.class, this.A0N);
        AnonymousClass0Z0.A09(-1121700583, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1898914274);
        super.onDestroyView();
        this.A03 = null;
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(44631198, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(578613551);
        getActivity().getWindow().setSoftInputMode(this.A0D);
        C06220Of.A0E(this.mView);
        super.onPause();
        AnonymousClass0Z0.A09(1882648723, A022);
    }

    public final void onResume() {
        C34071dx A002;
        int A022 = AnonymousClass0Z0.A02(-72329843);
        super.onResume();
        this.A0D = getActivity().getWindow().getAttributes().softInputMode;
        getActivity().getWindow().setSoftInputMode(16);
        C34071dx A003 = A00();
        if (!(A003 == null || !A003.A0a() || (A002 = A00()) == null)) {
            this.A03.post(new AnonymousClass6YF(this, A002));
        }
        if (this.A0A) {
            A04(this);
            this.A0A = false;
        }
        AnonymousClass0Z0.A09(-1881938449, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-762507138);
        if (this.A04.Aey()) {
            if (C256119n.A04(absListView)) {
                this.A04.Aq6();
            }
            AnonymousClass0Z0.A0A(1192902625, A032);
        }
        this.A0O.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(1192902625, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(-2067981848);
        if (!this.A04.Aey()) {
            this.A0O.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0Z0.A0A(-971736117, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0E.A04(C32711bj.A00(this), getListView());
        SpinnerImageView spinnerImageView = this.mLoadingSpinner;
        int i = 0;
        if (this.A0C) {
            i = 8;
        }
        spinnerImageView.setVisibility(i);
        if (this.A0B) {
            A02(this);
            return;
        }
        AnonymousClass0Q7.A03().A0B(this);
        getListView().setOnScrollListener(this);
    }
}
