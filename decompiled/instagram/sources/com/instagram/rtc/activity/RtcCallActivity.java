package com.instagram.rtc.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.rtc.presentation.core.RtcKeyboardHeightChangeDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000X.ALY;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass10L;
import p000X.AnonymousClass10U;
import p000X.AnonymousClass147;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1J6;
import p000X.AnonymousClass1J9;
import p000X.AnonymousClass1K6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2GT;
import p000X.AnonymousClass77I;
import p000X.AnonymousClass78Y;
import p000X.AnonymousClass79D;
import p000X.AnonymousClass79V;
import p000X.AnonymousClass8D5;
import p000X.AnonymousClass8D7;
import p000X.AnonymousClass8DI;
import p000X.AnonymousClass8M0;
import p000X.Aq6;
import p000X.AtA;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C13150hy;
import p000X.C137125t6;
import p000X.C1664278a;
import p000X.C173857bm;
import p000X.C18750sM;
import p000X.C192508Kx;
import p000X.C193418Ps;
import p000X.C195848Zq;
import p000X.C207728vj;
import p000X.C207838vu;
import p000X.C207858vw;
import p000X.C207918w3;
import p000X.C207988wB;
import p000X.C208008wD;
import p000X.C208018wE;
import p000X.C208568xM;
import p000X.C208578xN;
import p000X.C219359cu;
import p000X.C23402ALb;
import p000X.C23405ALe;
import p000X.C23406ALf;
import p000X.C24334Alz;
import p000X.C24346AmB;
import p000X.C24351AmG;
import p000X.C24352AmH;
import p000X.C24360AmP;
import p000X.C24375Ame;
import p000X.C24392Amw;
import p000X.C24396An0;
import p000X.C24404An8;
import p000X.C24414AnI;
import p000X.C24418AnN;
import p000X.C24419AnO;
import p000X.C24464Ao7;
import p000X.C24483AoQ;
import p000X.C24491AoY;
import p000X.C24494Aob;
import p000X.C24503Aok;
import p000X.C24522Ap5;
import p000X.C24531ApF;
import p000X.C24535ApJ;
import p000X.C24538ApM;
import p000X.C24539ApN;
import p000X.C24543ApS;
import p000X.C24545ApU;
import p000X.C24546ApV;
import p000X.C24547ApW;
import p000X.C24548ApX;
import p000X.C24549ApY;
import p000X.C24550ApZ;
import p000X.C24553Apc;
import p000X.C24556Apf;
import p000X.C24559Api;
import p000X.C24561Apk;
import p000X.C24579Aq3;
import p000X.C24581Aq5;
import p000X.C24582Aq7;
import p000X.C24590AqF;
import p000X.C24595AqK;
import p000X.C24599AqO;
import p000X.C24601AqQ;
import p000X.C24603AqS;
import p000X.C24607AqW;
import p000X.C24608AqX;
import p000X.C24611Aqa;
import p000X.C24614Aqd;
import p000X.C24623Aqm;
import p000X.C24625Aqo;
import p000X.C24626Aqp;
import p000X.C24628Aqr;
import p000X.C24638Ar2;
import p000X.C24653ArH;
import p000X.C24715AsI;
import p000X.C24722AsP;
import p000X.C24725AsS;
import p000X.C24763At5;
import p000X.C24781AtS;
import p000X.C24813Aty;
import p000X.C24814Atz;
import p000X.C24903Aw4;
import p000X.C24935Awd;
import p000X.C253518l;
import p000X.C26441Dh;
import p000X.C27141Gq;
import p000X.C27511Id;
import p000X.C27691Iv;
import p000X.C27731Iz;
import p000X.C27781Je;
import p000X.C27791Jf;
import p000X.C29041Oj;
import p000X.C63022ol;
import p000X.DRU;

public final class RtcCallActivity extends IgFragmentActivity implements AnonymousClass0RN, C137125t6 {
    public static final C173857bm A03 = new C173857bm();
    public C24550ApZ A00;
    public final C18750sM A01 = C29041Oj.A00(C24607AqW.A00);
    public final C18750sM A02 = C29041Oj.A00(new AnonymousClass79D(this));

    public final String getModuleName() {
        return "rtc_call";
    }

    public static final void A01(RtcCallActivity rtcCallActivity) {
        C26441Dh.A00((AnonymousClass0C1) rtcCallActivity.A02.getValue()).A03(rtcCallActivity, C24396An0.A00(Constants.ZERO));
        if (Build.VERSION.SDK_INT >= 21) {
            rtcCallActivity.finishAndRemoveTask();
        } else {
            rtcCallActivity.finish();
        }
        rtcCallActivity.overridePendingTransition(0, 0);
    }

    public final C06590Pq A0L() {
        return (AnonymousClass0C1) this.A02.getValue();
    }

    public final void onBackPressed() {
        C24550ApZ apZ = this.A00;
        if (apZ == null) {
            C13150hy.A03("presenterBridge");
        }
        if (!apZ.A02.A02(new C24414AnI())) {
            super.onBackPressed();
        }
    }

    private final void A00() {
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C13150hy.A01(window, "window");
            View decorView = window.getDecorView();
            C13150hy.A01(decorView, "window.decorView");
            decorView.setSystemUiVisibility(768);
            int A002 = C019000b.A00(this, C0003R.color.transparent);
            C27141Gq.A01(this, A002);
            AnonymousClass1X4.A02(this, A002);
            AnonymousClass1X4.A03(this, true);
            if (i >= 23) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C24550ApZ apZ = this.A00;
        if (apZ == null) {
            C13150hy.A03("presenterBridge");
        }
        apZ.A02.A02(new C24392Amw(i, i2, intent));
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1203890981);
        getWindow().addFlags(DexStore.LOAD_RESULT_WITH_VDEX_ODEX);
        super.onCreate(bundle);
        setTheme(C0003R.style.CallTheme);
        setContentView((int) C0003R.layout.layout_call_root);
        A00();
        AnonymousClass147.A00((AnonymousClass0C1) this.A02.getValue()).A01((C24608AqX) this.A01.getValue());
        ViewGroup viewGroup = (ViewGroup) findViewById(C0003R.C0005id.call_root);
        C13150hy.A01(viewGroup, "root");
        AnonymousClass1E1.A0c(viewGroup, new C1664278a());
        AnonymousClass0C1 r12 = (AnonymousClass0C1) this.A02.getValue();
        C13150hy.A01(r12, "userSession");
        AnonymousClass1L8 A003 = AnonymousClass1L8.A00(this);
        C13150hy.A01(A003, "getSupportLoaderManager()");
        C24549ApY apY = new C24549ApY(r12, viewGroup, this, A003, this, new AnonymousClass79V(this));
        apY.A06.A00(new C24494Aob(apY.A00, new C24491AoY(apY.A01), apY.A05, apY.A08));
        apY.A06.A00(new C24814Atz(apY.A07, new C24813Aty(apY.A01), apY.A05, apY.A04));
        apY.A06.A00(new C24531ApF(apY.A05));
        AnonymousClass77I r8 = apY.A06;
        Context context = apY.A01.getContext();
        C13150hy.A01(context, "root.context");
        r8.A00(new C24360AmP(context, new C24334Alz(apY.A01, apY.A07), apY.A05));
        apY.A06.A00(new C24561Apk(new C24715AsI(apY.A01)));
        apY.A06.A00(new C24404An8(apY.A00, new C24351AmG(apY.A01), apY.A05, apY.A04));
        apY.A06.A00(new AnonymousClass8D7(apY.A05, apY.A04, apY.A00));
        apY.A06.A00(new C24763At5(apY.A00, new C24781AtS(apY.A01), new AtA(apY.A01), apY.A05, apY.A04));
        apY.A06.A00(new C24419AnO(apY.A00, apY.A05, new C24418AnN(apY.A01)));
        apY.A06.A00(new C24611Aqa(apY.A00, new C24346AmB(apY.A01), new C24614Aqd(apY.A01)));
        Context context2 = apY.A01.getContext();
        C13150hy.A01(context2, "root.context");
        C24628Aqr aqr = new C24628Aqr(context2);
        C24725AsS asS = new C24725AsS(apY.A01, new C24653ArH(apY.A07, apY.A03, apY.A02));
        Context context3 = apY.A01.getContext();
        C13150hy.A01(context3, "root.context");
        C24628Aqr aqr2 = aqr;
        apY.A06.A00(new C24722AsP(context3, apY.A07, asS, aqr2, apY.A05, apY.A04));
        Context context4 = apY.A01.getContext();
        C13150hy.A01(context4, "root.context");
        apY.A06.A00(new C24903Aw4(context4, apY.A07, new C24935Awd(apY.A01), apY.A05, apY.A03));
        AnonymousClass78Y r6 = new AnonymousClass78Y(apY.A07, apY.A01);
        apY.A06.A00(new C207838vu(r6, apY.A05));
        apY.A06.A00(new C207918w3(apY.A00, r6));
        apY.A06.A00(new C23406ALf(apY.A01, apY.A04));
        apY.A06.A00(new C24553Apc());
        AnonymousClass77I r5 = apY.A06;
        Activity activity = apY.A00;
        Context context5 = apY.A01.getContext();
        C13150hy.A01(context5, "root.context");
        AnonymousClass0C1 r15 = apY.A07;
        C24543ApS apS = apY.A05;
        C24543ApS apS2 = apS;
        r5.A00(new C24375Ame(activity, context5, r15, apS2, new C24352AmH(apY.A01), apY.A04));
        apY.A06.A00(new AnonymousClass8D5(apY.A01, apY.A07, apY.A05, apY.A04));
        apY.A06.A00(new C195848Zq(apY.A00, apY.A07, apY.A03, apY.A05));
        HashMap hashMap = new HashMap();
        Class<C24419AnO> cls = C24419AnO.class;
        Class<AnonymousClass8D7> cls2 = AnonymousClass8D7.class;
        hashMap.put(C63022ol.A00(C24414AnI.class), AnonymousClass10L.A03(C63022ol.A00(cls), C63022ol.A00(C24404An8.class), C63022ol.A00(cls2)));
        hashMap.put(C63022ol.A00(AnonymousClass8M0.class), AnonymousClass10L.A03(C63022ol.A00(cls), C63022ol.A00(cls2)));
        AnonymousClass77I r3 = apY.A06;
        C13150hy.A02(hashMap, "orderMap");
        r3.A00 = hashMap;
        AnonymousClass0C1 r4 = apY.A07;
        Context applicationContext = apY.A00.getApplicationContext();
        C13150hy.A01(applicationContext, "activity.applicationContext");
        C24547ApW A004 = C24483AoQ.A00(r4, applicationContext);
        this.A00 = new C24550ApZ(apY.A06, apY.A05, A004.A07, apY.A04, A004.A05);
        RtcKeyboardHeightChangeDetector rtcKeyboardHeightChangeDetector = new RtcKeyboardHeightChangeDetector(this);
        getLifecycle().A06(rtcKeyboardHeightChangeDetector);
        ((C27511Id) rtcKeyboardHeightChangeDetector.A02.getValue()).A3j(new C24559Api(this));
        AnonymousClass0Z0.A07(-689233622, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-1259745508);
        super.onDestroy();
        AnonymousClass147.A00((AnonymousClass0C1) this.A02.getValue()).A00.remove((C24608AqX) this.A01.getValue());
        AnonymousClass0Z0.A07(1912147577, A002);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        if (!isFinishing()) {
            C24550ApZ apZ = this.A00;
            if (apZ == null) {
                C13150hy.A03("presenterBridge");
            }
            apZ.A02.A02(new AnonymousClass8DI(z));
            if (z) {
                C26441Dh.A00((AnonymousClass0C1) this.A02.getValue()).A03(this, C24396An0.A00(Constants.ONE));
            }
        }
    }

    public final void onResume() {
        int A002 = AnonymousClass0Z0.A00(-818108545);
        super.onResume();
        AnonymousClass0QD.A00().BcK(C63022ol.A00(getClass()).ATN());
        AnonymousClass0Z0.A07(-2065037130, A002);
    }

    /* JADX WARNING: type inference failed for: r0v58, types: [X.AqK] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onStart() {
        int A002 = AnonymousClass0Z0.A00(-721187148);
        super.onStart();
        C24550ApZ apZ = this.A00;
        if (apZ == null) {
            C13150hy.A03("presenterBridge");
        }
        C24548ApX apX = apZ.A01;
        C24556Apf apf = apZ.A04;
        C13150hy.A02(apf, "analyticsManager");
        apX.A00 = apf;
        C24543ApS apS = apZ.A02;
        AnonymousClass77I r2 = apZ.A03;
        C24546ApV apV = apZ.A05;
        C13150hy.A02(r2, "registry");
        C13150hy.A02(apV, "manager");
        apS.A00 = r2;
        apS.A01 = apV;
        apZ.A02.A02(new C24503Aok());
        C27691Iv r28 = apZ.A00;
        C24546ApV apV2 = apZ.A05;
        C27791Jf r22 = apV2.A07.A00;
        C27791Jf r3 = apV2.A03;
        C13150hy.A02(r3, "engineModelObservable");
        C13150hy.A02(r22, "usersObservable");
        C27791Jf A09 = C27791Jf.A02(r3, r22, new C208018wE((C207988wB) apV2.A0K.getValue())).A09();
        C13150hy.A01(A09, "Observable\n        .comb…  .distinctUntilChanged()");
        apV2.A0K.getValue();
        C27791Jf r4 = apV2.A03;
        C13150hy.A02(r4, "engineModelObservable");
        C27791Jf A092 = r4.A0D(C208568xM.A00).A09();
        C13150hy.A01(A092, "engineModelObservable\n  …  .distinctUntilChanged()");
        apV2.A0J.getValue();
        C27791Jf r42 = apV2.A03;
        C13150hy.A02(r42, C193418Ps.$const$string(100));
        C27791Jf A093 = r42.A0D(C24582Aq7.A00).A09();
        C13150hy.A01(A093, "engineModels\n          .…  .distinctUntilChanged()");
        C13150hy.A02(A093, "outgoingStateObservable");
        C13150hy.A02(r22, "usersObservable");
        C27791Jf A094 = C27791Jf.A02(A093, r22, new Aq6((C24603AqS) apV2.A0J.getValue())).A09();
        C13150hy.A01(A094, "Observable\n          .co…  .distinctUntilChanged()");
        C27791Jf r43 = apV2.A03;
        C13150hy.A02(r43, "engineModelObservable");
        C13150hy.A02(A093, "outgoingStateObservable");
        C27791Jf A095 = C27791Jf.A02(r43, A093, new C24581Aq5((C24599AqO) apV2.A0G.getValue())).A09();
        C13150hy.A01(A095, "Observable\n          .co…  .distinctUntilChanged()");
        C27791Jf r44 = apV2.A03;
        C13150hy.A02(r44, "engineModelObservable");
        C13150hy.A02(r22, "usersObservable");
        C27791Jf A096 = C27791Jf.A02(r44, r22, new C24545ApU((C24601AqQ) apV2.A0H.getValue())).A09();
        C13150hy.A01(A096, "Observable\n          .co…  .distinctUntilChanged()");
        apV2.A0C.getValue();
        C27791Jf r45 = apV2.A03;
        C13150hy.A02(r45, "engineModelObservable");
        C27791Jf A097 = r45.A0D(C24590AqF.A00).A09();
        C13150hy.A01(A097, "engineModelObservable\n  …  .distinctUntilChanged()");
        C207728vj r14 = (C207728vj) apV2.A0D.getValue();
        C27791Jf A098 = apV2.A05.A00.A09();
        C13150hy.A01(A098, "addFailuresRelay.distinctUntilChanged()");
        C13150hy.A02(A092, "participantIdsObservable");
        C13150hy.A02(A098, "addFailuresObservable");
        C13150hy.A02(A097, "callIdObservable");
        C27791Jf A099 = C27791Jf.A05(A092, r14.A00, A098, A097, new C208578xN(r14)).A0G(C27731Iz.A01).A0H(new C207858vw("", AnonymousClass10U.A00, "", false, false, C219359cu.A00)).A09();
        C13150hy.A01(A099, "Observable\n        .comb…  .distinctUntilChanged()");
        C27791Jf r12 = apV2.A03;
        C27791Jf A0910 = apV2.A05.A02.A09();
        C13150hy.A01(A0910, "addedUsersRelay.distinctUntilChanged()");
        C27781Je r46 = apV2.A06.A01;
        C13150hy.A02(r12, "engineModelObservable");
        C13150hy.A02(r22, "usersObservable");
        C13150hy.A02(A0910, "addedUsersObservable");
        C13150hy.A02(r46, "callExpansionObservable");
        C27791Jf A0911 = C27791Jf.A05(r12, r22, A0910, r46, new C208008wD((C207988wB) apV2.A0K.getValue())).A09();
        C13150hy.A01(A0911, "Observable\n        .comb…  .distinctUntilChanged()");
        ALY aly = apV2.A05;
        C27791Jf r18 = aly.A03;
        C13150hy.A02(r22, "usersObservable");
        C27791Jf A0D = C27791Jf.A02(r22, aly.A01, C24579Aq3.A00).A0F(C24623Aqm.A00).A0D(C23405ALe.A00);
        C13150hy.A01(A0D, "Observable\n          .co… messageArgs)\n          }");
        C27791Jf r1 = apV2.A03;
        C13150hy.A02(r1, "engineModelObservable");
        C27791Jf A0912 = r1.A0D(new C24535ApJ((C24522Ap5) apV2.A0E.getValue())).A09();
        C13150hy.A01(A0912, "engineModelObservable\n  …  .distinctUntilChanged()");
        C27791Jf A0913 = apV2.A09.A01.A09();
        C13150hy.A01(A0913, "playbackStateRelay.distinctUntilChanged()");
        C27791Jf r47 = apV2.A08.A01;
        C13150hy.A02(A0912, "userCapabilitiesObservable");
        C27791Jf A0914 = A0912.A0D(new C24625Aqo((C24626Aqp) apV2.A0F.getValue())).A09();
        C13150hy.A01(A0914, "userCapabilitiesObservab…  .distinctUntilChanged()");
        C27791Jf r13 = apV2.A03;
        C13150hy.A02(r13, "engineModelObservable");
        C27791Jf A0915 = r13.A0D(new C24539ApN((C24464Ao7) apV2.A0I.getValue())).A09();
        C13150hy.A01(A0915, "engineModelObservable\n  …  .distinctUntilChanged()");
        C27791Jf r15 = apV2.A03;
        C13150hy.A02(r15, "engineModelObservable");
        C27791Jf A0916 = r15.A0D(C24538ApM.A00).A09();
        C13150hy.A01(A0916, "engineModelObservable\n  …  .distinctUntilChanged()");
        C27791Jf r0 = ((C23402ALb) apV2.A0A.getValue()).A00;
        C27791Jf A0917 = ((C192508Kx) apV2.A0B.getValue()).A02.A09();
        C13150hy.A01(A0917, "effectsRelay.distinctUntilChanged()");
        List<C27791Jf> A032 = AnonymousClass10L.A03(A09, A094, A095, A096, A099, A0911, r18, A0913, r47, A0914, A0915, A0916, r0, A0D, A0917);
        ArrayList arrayList = new ArrayList(A032.size());
        for (C27791Jf r02 : A032) {
            arrayList.add(r02.A00);
        }
        AnonymousClass1J6.A01(arrayList, AnonymousClass0C5.$const$string(124));
        C27791Jf r23 = new C27791Jf(AnonymousClass1J9.A00(new AnonymousClass1K6(arrayList)).A02(DRU.A08));
        C13150hy.A01(r23, "Observable.merge(\n      …callArEffectsObservable))");
        AnonymousClass2GT r16 = apZ.A06;
        if (r16 != null) {
            r16 = new C24595AqK(r16);
        }
        r28.A02(r23, (C253518l) r16);
        C26441Dh.A00((AnonymousClass0C1) this.A02.getValue()).A06(this);
        AnonymousClass0Z0.A07(-1994104353, A002);
    }

    public final void onStop() {
        int A002 = AnonymousClass0Z0.A00(1087097273);
        super.onStop();
        C24550ApZ apZ = this.A00;
        if (apZ == null) {
            C13150hy.A03("presenterBridge");
        }
        apZ.A02.A02(new C24638Ar2());
        apZ.A00.A01();
        C24543ApS apS = apZ.A02;
        apS.A00 = null;
        apS.A01 = null;
        AnonymousClass0ZA.A07(apS.A02, (Object) null);
        apS.A03.clear();
        apZ.A01.A00 = null;
        if (Build.VERSION.SDK_INT >= 26 && isInPictureInPictureMode()) {
            C173857bm r2 = A03;
            AnonymousClass0C1 r1 = (AnonymousClass0C1) this.A02.getValue();
            C13150hy.A01(r1, "userSession");
            r2.A00(this, r1);
        }
        AnonymousClass0Z0.A07(-1178881364, A002);
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        C24550ApZ apZ = this.A00;
        if (apZ == null) {
            C13150hy.A03("presenterBridge");
        }
        apZ.A02.A02(new AnonymousClass8M0());
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A00();
        }
    }
}
