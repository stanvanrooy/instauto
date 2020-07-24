package com.instagram.mainactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.osversionblock.OsVersionBlockingActivity;
import com.instagram.p009ui.swipenavigation.SwipeNavigationContainer;
import com.instagram.p009ui.widget.proxy.ProxyFrameLayout;
import com.instagram.strings.StringBridge;
import com.instagram.util.startup.tracking.TaskLifeDetectingService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000X.APG;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0CA;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0LQ;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0Q7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0h8;
import p000X.AnonymousClass106;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass12I;
import p000X.AnonymousClass18R;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BC;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1D0;
import p000X.AnonymousClass1D3;
import p000X.AnonymousClass1D4;
import p000X.AnonymousClass1D5;
import p000X.AnonymousClass1D6;
import p000X.AnonymousClass1D7;
import p000X.AnonymousClass1D9;
import p000X.AnonymousClass1DH;
import p000X.AnonymousClass1DI;
import p000X.AnonymousClass1DJ;
import p000X.AnonymousClass1DK;
import p000X.AnonymousClass1DN;
import p000X.AnonymousClass1DP;
import p000X.AnonymousClass1DS;
import p000X.AnonymousClass1DT;
import p000X.AnonymousClass1DU;
import p000X.AnonymousClass1DV;
import p000X.AnonymousClass1DW;
import p000X.AnonymousClass1DX;
import p000X.AnonymousClass1DY;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1F5;
import p000X.AnonymousClass1F6;
import p000X.AnonymousClass1FE;
import p000X.AnonymousClass1FN;
import p000X.AnonymousClass1FP;
import p000X.AnonymousClass1FS;
import p000X.AnonymousClass1FW;
import p000X.AnonymousClass1GU;
import p000X.AnonymousClass1GW;
import p000X.AnonymousClass1GX;
import p000X.AnonymousClass1GZ;
import p000X.AnonymousClass1H1;
import p000X.AnonymousClass1H2;
import p000X.AnonymousClass1H3;
import p000X.AnonymousClass1H9;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HH;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HN;
import p000X.AnonymousClass1X7;
import p000X.AnonymousClass1X8;
import p000X.AnonymousClass1X9;
import p000X.AnonymousClass1XB;
import p000X.AnonymousClass1XC;
import p000X.AnonymousClass1XD;
import p000X.AnonymousClass1XE;
import p000X.AnonymousClass2CD;
import p000X.AnonymousClass2CG;
import p000X.AnonymousClass2CH;
import p000X.AnonymousClass2EM;
import p000X.AnonymousClass2MC;
import p000X.AnonymousClass2NH;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass2TI;
import p000X.AnonymousClass2TV;
import p000X.AnonymousClass40C;
import p000X.AnonymousClass4JB;
import p000X.AnonymousClass4JC;
import p000X.AnonymousClass5EG;
import p000X.AnonymousClass6J5;
import p000X.AnonymousClass6JM;
import p000X.AnonymousClass6K3;
import p000X.AnonymousClass6K6;
import p000X.AnonymousClass7VP;
import p000X.AnonymousClass840;
import p000X.C019000b;
import p000X.C05130If;
import p000X.C05140Ig;
import p000X.C05210Iq;
import p000X.C05640Lj;
import p000X.C05760Lv;
import p000X.C05770Lw;
import p000X.C06300On;
import p000X.C06590Pq;
import p000X.C101134Yp;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C11910fs;
import p000X.C12000g1;
import p000X.C125775aK;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C12670hC;
import p000X.C13300iJ;
import p000X.C138635va;
import p000X.C152706fq;
import p000X.C152736ft;
import p000X.C15330mi;
import p000X.C153406h2;
import p000X.C15610nF;
import p000X.C15790nX;
import p000X.C16180oA;
import p000X.C16230oG;
import p000X.C16330oQ;
import p000X.C16380oV;
import p000X.C16620ot;
import p000X.C16670oy;
import p000X.C16710p2;
import p000X.C16880pJ;
import p000X.C17440qF;
import p000X.C174837dU;
import p000X.C17510qM;
import p000X.C18050rE;
import p000X.C185707wY;
import p000X.C18880sZ;
import p000X.C1890185p;
import p000X.C18980sj;
import p000X.C21980xe;
import p000X.C22000xg;
import p000X.C22120xs;
import p000X.C23300zv;
import p000X.C23320zx;
import p000X.C237211o;
import p000X.C252117x;
import p000X.C26171By;
import p000X.C26301Cs;
import p000X.C26311Ct;
import p000X.C26321Cu;
import p000X.C26331Cv;
import p000X.C26351Cx;
import p000X.C26361Cy;
import p000X.C26371Cz;
import p000X.C26381Db;
import p000X.C26391Dc;
import p000X.C26421Df;
import p000X.C26431Dg;
import p000X.C26441Dh;
import p000X.C26461Dj;
import p000X.C26581Eb;
import p000X.C26591Ec;
import p000X.C26781Fg;
import p000X.C26791Fh;
import p000X.C26801Fi;
import p000X.C26811Fj;
import p000X.C26821Fk;
import p000X.C26831Fl;
import p000X.C26861Fo;
import p000X.C26871Fp;
import p000X.C26891Fr;
import p000X.C26901Fs;
import p000X.C26931Fv;
import p000X.C26971Fz;
import p000X.C27001Gc;
import p000X.C27091Gl;
import p000X.C27101Gm;
import p000X.C27111Gn;
import p000X.C27121Go;
import p000X.C27151Gr;
import p000X.C27161Gs;
import p000X.C27171Gt;
import p000X.C27191Gv;
import p000X.C27211Gx;
import p000X.C27221Gy;
import p000X.C27231Gz;
import p000X.C27271He;
import p000X.C27281Hf;
import p000X.C27321Hj;
import p000X.C27341Hl;
import p000X.C27651Ir;
import p000X.C30730DiJ;
import p000X.C30731DiK;
import p000X.C31111Wm;
import p000X.C31151Wq;
import p000X.C31201Wx;
import p000X.C31221Wz;
import p000X.C32991cC;
import p000X.C33211cY;
import p000X.C33221cZ;
import p000X.C33231ca;
import p000X.C33241cb;
import p000X.C33251cc;
import p000X.C33441cv;
import p000X.C33501d1;
import p000X.C33521d3;
import p000X.C33531d4;
import p000X.C33551d6;
import p000X.C33561d7;
import p000X.C33571d8;
import p000X.C33581d9;
import p000X.C33591dA;
import p000X.C33601dB;
import p000X.C38131km;
import p000X.C38171kq;
import p000X.C42681t4;
import p000X.C42701t6;
import p000X.C46081z6;
import p000X.C49892Ea;
import p000X.C51512Ky;
import p000X.C51522Kz;
import p000X.C56342cL;
import p000X.C56352cM;
import p000X.C56362cN;
import p000X.C68262yn;
import p000X.C79603dj;
import p000X.C88243s6;
import p000X.C97684Ka;

public class MainActivity extends BaseFragmentActivity implements AnonymousClass0RN, C26301Cs, C26311Ct, C26321Cu, C26351Cx, C26361Cy, C26371Cz, AnonymousClass1D0, AnonymousClass1D3, C11910fs, AnonymousClass1D4, AnonymousClass1D5, AnonymousClass1D6, AnonymousClass1D7 {
    public static Bundle A0T;
    public int A00;
    public View A01;
    public ViewGroup A02;
    public AnonymousClass1GZ A03;
    public AnonymousClass1DS A04;
    public C26461Dj A05;
    public AnonymousClass0C1 A06;
    public int A07;
    public Intent A08;
    public View A09;
    public View A0A;
    public FrameLayout.LayoutParams A0B;
    public FrameLayout.LayoutParams A0C;
    public C31151Wq A0D;
    public C51522Kz A0E;
    public C27001Gc A0F;
    public AnonymousClass1F5 A0G;
    public C27191Gv A0H;
    public AnonymousClass2CG A0I;
    public AnonymousClass1GU A0J;
    public C26871Fp A0K;
    public C26871Fp A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final AnonymousClass1DI A0Q = new AnonymousClass1DH();
    public final C11200ea A0R = new AnonymousClass1DK(this);
    public final C11200ea A0S = new AnonymousClass1DJ(this);

    public final void A0V(Bundle bundle) {
    }

    public final Activity AJG() {
        return this;
    }

    public final void Bel() {
        C27321Hj.A1r = true;
    }

    public final void Bl5(AnonymousClass1DU r2) {
        Bl4(r2, false);
        A0Z(r2);
    }

    private boolean A01() {
        Intent intent = this.A08;
        if (intent == null || !intent.hasExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_SHOUT_OUT_USERNAME_INTENT") || !this.A08.hasExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_TOOL_TIP_ENABLED")) {
            return false;
        }
        AnonymousClass0C1 r7 = this.A06;
        C174837dU.A01(this, Constants.ONE, AnonymousClass7VP.A00, new AnonymousClass840(this.A08.getStringExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_SHOUT_OUT_USERNAME_INTENT"), this.A08.getStringExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_SHOUT_OUT_HEADER_TITLE_INTENT"), this.A08.getBooleanExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_TOOL_TIP_ENABLED", false), r7, this));
        return true;
    }

    public static boolean A04(MainActivity mainActivity) {
        return A06(mainActivity, (String) null, "long_press_tab_bar", (Intent) null, false, false, AnonymousClass5EG.A01(mainActivity.A06));
    }

    public static boolean A06(MainActivity mainActivity, String str, String str2, Intent intent, boolean z, boolean z2, boolean z3) {
        C138635va A002 = C18050rE.A00.A00().A00(mainActivity.A06.getToken(), str2);
        A002.A00.putBoolean("show_add_account_button", z3);
        if (intent != null) {
            A002.A00.putParcelable("in_app_deeplink_intent", intent);
        }
        A002.A00.putBoolean("hide_logged_in_user", z);
        A002.A00.putBoolean("hide_radio_button_and_badge", z2);
        AnonymousClass2TH r1 = new AnonymousClass2TH(mainActivity.A06);
        r1.A0L = str;
        r1.A0Y = false;
        AnonymousClass2TI A003 = r1.A00();
        C31201Wx.A00(mainActivity);
        A003.A01(mainActivity, A002.A00());
        C05760Lv r0 = C05760Lv.A01;
        r0.A00.edit().putLong("preference_long_press_avatar_account_switcher_last_impression_time", System.currentTimeMillis()).apply();
        return true;
    }

    public final C06590Pq A0L() {
        return this.A06;
    }

    public final int A0O() {
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.COORDINATORLAYOUT_ROOT_LAYOUT, "is_enabled", false)).booleanValue()) {
            return C0003R.layout.layout_activity_main_coordinator_layout;
        }
        return C0003R.layout.layout_activity_main;
    }

    public final C33501d1 A0P() {
        AnonymousClass0C1 r0 = this.A06;
        if (r0 != null) {
            return C33501d1.A00(r0);
        }
        return null;
    }

    public final void A0Z(AnonymousClass1DU r3) {
        C23300zv.A00(this.A06).A04(new C31111Wm());
        C31221Wz r0 = this.A02;
        if (r0 != null) {
            r0.A0B();
        }
        this.A04.A02.A00(r3);
    }

    public final C31151Wq AHp() {
        if (this.A0D == null) {
            this.A0D = C16330oQ.A00.A04(this, APg(), this.A06);
        }
        return this.A0D;
    }

    public final AnonymousClass1DI AIZ() {
        return this.A0Q;
    }

    public final int ANU(AnonymousClass1DU r2) {
        return Collections.unmodifiableList(this.A04.A02.A04).indexOf(r2);
    }

    public final AnonymousClass2CG APg() {
        if (this.A0I == null) {
            this.A0I = new AnonymousClass2CG(this, this.A06, this);
        }
        return this.A0I;
    }

    public final int ARv() {
        return this.A05.A01;
    }

    public final C152706fq ATU() {
        return this.A04.A03.A08;
    }

    public final String AWf() {
        return this.A04.A00().toString();
    }

    public final C26391Dc AXV() {
        return this.A04.A03.AXV();
    }

    public final View AXe() {
        return this.A02;
    }

    public final View AXf() {
        return this.A0A;
    }

    public final boolean Aew(AnonymousClass1DU r3) {
        if (this.A04.A00() == r3) {
            return true;
        }
        return false;
    }

    public final boolean AfV() {
        AnonymousClass1DY r2 = this.A04.A03;
        boolean z = false;
        if (r2.A0A.getPosition() == r2.A0M.A05.A04()) {
            z = true;
        }
        if (!z) {
            return false;
        }
        AnonymousClass1DS r0 = r2.A0J;
        AnonymousClass1DU r22 = AnonymousClass1DU.FEED;
        AnonymousClass1DU A002 = r0.A00();
        boolean z2 = false;
        if (A002 == r22) {
            z2 = true;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final void Aih(DirectShareTarget directShareTarget) {
        AnonymousClass0C1 r1 = this.A06;
        if (r1 != null) {
            C21980xe A002 = C21980xe.A00(this, r1, "one_tap_send_capture", this);
            String A012 = directShareTarget.A01();
            if (A012 != null) {
                A002.A05(A012);
            } else {
                A002.A07(directShareTarget.A05());
            }
            A002.A0C();
        }
    }

    public final void BEf(int i) {
        C26871Fp r0;
        List unmodifiableList = Collections.unmodifiableList(this.A04.A02.A04);
        if (i >= 0 && i < unmodifiableList.size()) {
            AnonymousClass1DU r1 = (AnonymousClass1DU) unmodifiableList.get(i);
            if ((r1 == AnonymousClass1DU.PROFILE && (r0 = this.A0L) != null) || (r1 == AnonymousClass1DU.SEARCH && (r0 = this.A0K) != null)) {
                AnonymousClass1EG r3 = r0.A00;
                r3.A05(1.0d, true);
                r3.A03(1.25d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1 != 0) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    public final void BQh(AnonymousClass1AM r6, AnonymousClass1DU r7) {
        AnonymousClass1FW r0;
        ArrayList arrayList;
        int i;
        boolean z;
        C26461Dj r4 = this.A05;
        int i2 = C26781Fg.A00[r7.ordinal()];
        boolean z2 = false;
        if (i2 == 1) {
            r0 = r4.A04;
        } else if (i2 != 2) {
            if (i2 == 5) {
                r0 = r4.A03;
            }
            if (z2) {
                A0Z(r7);
            }
            AnonymousClass1D9 r1 = this.A0H;
            arrayList = r6.A0A;
            if (arrayList != null) {
                arrayList.remove(r1);
            }
            r6.A0r(this.A0H);
            for (i = 0; i < this.A02.getChildCount(); i++) {
                if (this.A02.getChildAt(i).getTag().equals(r7)) {
                    View childAt = this.A02.getChildAt(i);
                    this.A01.setSelected(false);
                    this.A01 = childAt;
                    childAt.setSelected(true);
                }
            }
            A0U();
        } else {
            r0 = r4.A05;
        }
        if (r0 != null) {
            View view = r0.A03;
            if (view != null) {
                int visibility = view.getVisibility();
                z = true;
            }
            z = false;
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
        }
        AnonymousClass1D9 r12 = this.A0H;
        arrayList = r6.A0A;
        if (arrayList != null) {
        }
        r6.A0r(this.A0H);
        while (i < this.A02.getChildCount()) {
        }
        A0U();
    }

    public final void BRh(AnonymousClass1DU r3) {
        if (r3 == AnonymousClass1DU.NEWS) {
            if (C16880pJ.A00.A05(this.A06)) {
                return;
            }
        } else if (r3 == AnonymousClass1DU.PROFILE) {
            C18980sj.A00.A03(true);
        }
        A0Z(r3);
        if (!Aew(r3)) {
            Bl4(r3, false);
        }
    }

    public final void BXO() {
        A0Z(this.A04.A00());
    }

    public final void Bh6() {
        AnonymousClass1DS r2 = this.A04;
        if (!r2.A05) {
            r2.A02.A01(r2.A00());
            r2.A05 = true;
        }
    }

    public final void BhT(AnonymousClass1DU r4, Bundle bundle) {
        boolean z;
        AnonymousClass1DS r2 = this.A04;
        AnonymousClass1HD A0N2 = r2.A02.A02.A05().A0N(r4.AMC());
        if (A0N2 instanceof AnonymousClass1HN) {
            ((AnonymousClass1HN) A0N2).BhS(bundle);
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r2.A04.put(r4, bundle);
        }
    }

    public final void Bkh(AnonymousClass6JM r3) {
        Bl4(r3.A02, true);
        A0T = r3.A0C;
        A0Z(r3.A02);
    }

    public final void Bl4(AnonymousClass1DU r3, boolean z) {
        AnonymousClass1DS r1 = this.A04;
        if (!r1.A05 || r3 != r1.A00()) {
            r1.A02.A01(r3);
            r1.A05 = true;
        }
    }

    public final void Bl6(int i) {
        this.A00 = i;
        if (getResources().getConfiguration().orientation == 1) {
            AXe().setVisibility(i);
        }
        if (i == 8) {
            AnonymousClass1DS r0 = this.A04;
            r0.A03.A02.setLayoutParams(this.A0C);
            this.A00 = getResources().getDimensionPixelOffset(AnonymousClass1BA.A03(this, C0003R.attr.tabBarHeight));
            C05770Lw A002 = C05770Lw.A00();
            if (A002.A0K()) {
                Azn(A002);
            }
            this.A0A.setVisibility(i);
        } else {
            AnonymousClass1DS r02 = this.A04;
            r02.A03.A02.setLayoutParams(this.A0B);
            this.A0A.setVisibility(this.A07);
            this.A00 = 0;
            C05770Lw A003 = C05770Lw.A00();
            if (A003.A0K()) {
                Azn(A003);
            }
        }
        this.A02.setVisibility(i);
    }

    public final void Bo8(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        AnonymousClass1DS r0 = this.A04;
        if (z) {
            layoutParams = this.A0B;
        } else {
            layoutParams = this.A0C;
        }
        r0.A03.A02.setLayoutParams(layoutParams);
    }

    public final void Brl(AnonymousClass2CH r2) {
        if (!this.A0N) {
            return;
        }
        if (r2 == AnonymousClass2CH.OnCloseToDalvikHeapLimit || r2 == AnonymousClass2CH.OnSystemMemoryCriticallyLowWhileAppInForeground) {
            this.A04.A01();
        }
    }

    public final void Bsx(C27171Gt r3) {
        if (r3.A09.equals("camera_action_bar_button_main_feed")) {
            this.A03.A00(Constants.A0u);
        }
        this.A04.A03.Bsx(r3);
    }

    public final String getModuleName() {
        AnonymousClass1DS r0 = this.A04;
        if (r0 != null) {
            return r0.A03.A03(r0.A06.A05());
        }
        AnonymousClass0QD.A01("MainActivity", "getModuleName - activity was destroyed");
        return "main_activity";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (((p000X.AnonymousClass1HK) r1).onBackPressed() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        if ("launcher_shortcut_glyph".equals(r1) == false) goto L_0x00aa;
     */
    public final void onBackPressed() {
        C27341Hl r1;
        boolean z;
        C79603dj r0;
        C27171Gt r12;
        boolean z2;
        boolean z3;
        boolean z4;
        AnonymousClass0C1 r02 = this.A06;
        if (r02 != null) {
            C32991cC.A00(r02);
        }
        C31221Wz r03 = this.A02;
        if (r03 == null || !r03.A0O()) {
            AnonymousClass1DS r6 = this.A04;
            AnonymousClass1DY r5 = r6.A03;
            C1890185p A012 = AnonymousClass1DY.A01(r5);
            if ((A012 == null || !A012.onBackPressed()) && ((r1 = r5.A06) == null || !(r1 instanceof AnonymousClass1HK) || !((AnonymousClass1HK) r1).onBackPressed())) {
                if (!r5.A0F) {
                    if (A012 != null) {
                        r0 = A012.A01;
                    } else {
                        r0 = null;
                    }
                    if (r0 != null) {
                        String str = r0.A0H;
                        if (!"launcher_shortcut_avatar".equals(str)) {
                        }
                    }
                    C26391Dc r3 = r5.A0M;
                    String str2 = r3.A02;
                    if ("camera_direct_inbox_button".equals(str2)) {
                        r12 = new C27171Gt();
                        r12.A00 = r3.A05.A03();
                        r12.A0B = false;
                    } else {
                        float position = r5.A0A.getPosition();
                        float A042 = r3.A05.A04();
                        if (position != A042) {
                            r12 = new C27171Gt();
                            r12.A00 = A042;
                            r12.A0B = !"camera_action_bar_button_direct_tab".equals(str2);
                        }
                    }
                    r12.A09 = "back";
                    r5.Bsx(r12);
                    z = true;
                }
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                AnonymousClass1DT r32 = r6.A02;
                AnonymousClass1HD A0L2 = r32.A02.A05().A0L(C0003R.C0005id.layout_container_main);
                if (A0L2 instanceof AnonymousClass1HK) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    z4 = true;
                } else if (r32.A05.size() > 1) {
                    r32.A05.pop();
                    r32.A01((AnonymousClass1DU) r32.A05.peek());
                    z4 = true;
                } else {
                    C12600h4 A002 = C12600h4.A00();
                    C12600h4.A03(A002, "killed_by_back_button");
                    A002.A04(C12600h4.A09);
                    z4 = false;
                }
                z2 = false;
            }
            z2 = true;
            if (!z2) {
                super.onBackPressed();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0528, code lost:
        if (p000X.AnonymousClass1DX.A02() != false) goto L_0x052a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x07a2, code lost:
        if (r5.A01(r10, r1, r20, r6, r7) == false) goto L_0x07a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011f, code lost:
        if ("android.intent.action.MAIN".equals(r2.getAction()) == false) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0881 A[SYNTHETIC, Splitter:B:242:0x0881] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x08de  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0903  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0994  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x09b6  */
    public final void onCreate(Bundle bundle) {
        AnonymousClass0C1 r0;
        boolean z;
        boolean z2;
        C27101Gm r02;
        C27121Go r2;
        float A012;
        String str;
        AnonymousClass0h8 r03;
        AnonymousClass0C1 r04;
        AnonymousClass0C1 r3;
        boolean booleanValue;
        int i;
        AnonymousClass1DU r1;
        AnonymousClass1DU r22;
        C26381Db r12;
        float A022;
        int i2;
        String str2;
        AnonymousClass1DU r13;
        int A002 = AnonymousClass0Z0.A00(-1995360868);
        C12600h4 A003 = C12600h4.A00();
        ClassMarkerLoader.loadColdStartClassPreloadingStartMarker();
        C12600h4.A02(A003, "ACTIVITY_ONCREATE_START");
        C12600h4 A004 = C12600h4.A00();
        if (AnonymousClass0Q7.A03().A0H()) {
            C12600h4.A01(A004, this, Constants.ONE, -1, Looper.myQueue());
        }
        C06590Pq A013 = AnonymousClass0J1.A01(this);
        boolean AgN = A013.AgN();
        if (AgN) {
            r0 = C05210Iq.A02(A013);
        } else {
            r0 = null;
        }
        this.A06 = r0;
        if (AgN && getIntent().hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(getIntent().getAction())) {
            String str3 = AnonymousClass1BC.A02.A00;
            if (str3 == null || str3.equals(AnonymousClass1DW.A00(Constants.ZERO))) {
                C15610nF.A00(this.A06).BXl(this, this.A06);
            }
            C15610nF.A00(this.A06).BXm(this.A06);
        }
        Intent intent = getIntent();
        boolean A005 = AnonymousClass1DN.A00();
        if (AgN) {
            AnonymousClass1DP.A00(this.A06);
        }
        Bundle bundle2 = bundle;
        if (bundle != null) {
            AnonymousClass2CD.A00(bundle2, bundle2.getStringArrayList("RESTORE_DISABLED_FRAGMENT_TAGS"));
        }
        Intent intent2 = intent;
        this.A04 = new AnonymousClass1DS(this, this.A06, bundle2, A005, intent, this, this, this.A0Q, this);
        C26421Df.A00 = new WeakReference(this);
        C26431Dg.A02(A013, this, this, intent);
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.OS_VERSION_BLOCKING_CONFIG, "is_enabled", false)).booleanValue()) {
            startActivity(new Intent(this, OsVersionBlockingActivity.class));
            finish();
        }
        C15330mi.A01(this);
        C26441Dh A006 = C26441Dh.A00(A013);
        A006.A07.clear();
        A006.A08.clear();
        A006.A04 = null;
        this.A05 = new C26461Dj(this, this, this.A06);
        super.onCreate(bundle2);
        C26581Eb.A00(this, 1);
        int i3 = 0;
        if (intent.hasCategory("android.intent.category.LAUNCHER")) {
            z = true;
        }
        z = false;
        if (z) {
            if (!isTaskRoot()) {
                AnonymousClass0DB.A0E(getClass().getSimpleName(), "MainActivity is not the root. Finishing activity instead of launching.");
                boolean hasExtra = intent.hasExtra("ShareHandlerActivity.EXTRA_SHARE_INTENT");
                AnonymousClass0QD.A01(AnonymousClass000.A0S("MainTaskActivityIsNotRoot_isShareIntent:", hasExtra), AnonymousClass000.A0S("Finishing main task activity since it is not the root. isShareIntent:", hasExtra));
                finish();
                i = -862312098;
                AnonymousClass0Z0.A07(i, A002);
            }
            C12600h4.A00().A05(C12620h6.LAUNCHER);
        }
        if (AgN) {
            C26591Ec.A00(this.A06).A02(getApplicationContext());
        }
        AnonymousClass1F5 r14 = new AnonymousClass1F5(this, this);
        this.A0G = r14;
        if (bundle == null) {
            r14.A02(this.A06, intent, this);
        }
        if (!AgN) {
            C15790nX.A00.A00(this, A013, AnonymousClass1F5.A00(intent));
            i = -1767716855;
        } else {
            getIntent().putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A06.getToken());
            AnonymousClass0C1 r32 = this.A06;
            Context applicationContext = getApplicationContext();
            AnonymousClass0P4 A007 = AnonymousClass0P4.A00("ig_cellular_data_opt", (AnonymousClass0RN) null);
            A007.A0A("data_saver_mode", Boolean.valueOf(C26171By.A01(r32).A03()));
            A007.A0E("high_quality_network_setting", Integer.valueOf(C26171By.A01(r32).A02()));
            A007.A0E("os_data_saver_settings", Integer.valueOf(C26171By.A00(applicationContext)));
            AnonymousClass0WN.A01(r32).BcG(A007);
            AnonymousClass0P4 A008 = AnonymousClass0P4.A00("ig_dark_mode_opt", (AnonymousClass0RN) null);
            A008.A0A("os_dark_mode_settings", Boolean.valueOf(C17440qF.A00(applicationContext)));
            AnonymousClass0WN.A01(r32).BcG(A008);
            AnonymousClass1F6 A009 = AnonymousClass1F6.A00(this.A06);
            AnonymousClass0C1 r4 = this.A06;
            AnonymousClass1FE r23 = A009.A05;
            Class<AnonymousClass1FS> cls = AnonymousClass1FS.class;
            if (r4.AV9(cls) == null) {
                r4.BYi(cls, new AnonymousClass1FS(r4, r23));
            }
            if (A009.A08.A0C) {
                C38171kq A0010 = C38171kq.A00();
                AnonymousClass1FN r05 = A009.A03;
                synchronized (A0010) {
                    A0010.A00 = r05;
                }
                AnonymousClass12C.A0c.A0J.set(true);
                C38131km A0011 = C38131km.A00();
                AnonymousClass1FP r06 = A009.A02;
                synchronized (A0011) {
                    A0011.A00 = r06;
                }
            } else {
                AnonymousClass12C.A0c.A0O(new AnonymousClass18R(), A009.A04);
            }
            this.A02 = (ViewGroup) findViewById(C0003R.C0005id.tab_bar);
            if (StringBridge.A00) {
                AnonymousClass0QD.A01("failed_to_load_library_logged_in", "failed_to_load_library_logged_in");
                AnonymousClass2OA r24 = new AnonymousClass2OA(this);
                r24.A07(C0003R.string.error);
                r24.A0U(false);
                r24.A06(C0003R.string.unable_to_start);
                r24.A0A(C0003R.string.f118ok, new AnonymousClass4JC(this));
                r24.A03().show();
                i = -705787008;
            } else {
                for (AnonymousClass1DU r42 : Collections.unmodifiableList(this.A04.A02.A04)) {
                    ViewGroup viewGroup = this.A02;
                    if (!this.A04.A09) {
                        str2 = "notification_type_dot";
                    } else if (r42 == AnonymousClass1DU.DIRECT || r42 == AnonymousClass1DU.NEWS) {
                        str2 = "notification_type_count";
                    } else {
                        str2 = "notification_type_badge";
                    }
                    AnonymousClass1FW r242 = new AnonymousClass1FW(this, this.A06, r42, viewGroup, str2, this, this);
                    AnonymousClass106 A023 = C23320zx.A00(this.A06).A02();
                    boolean A014 = A023.A01();
                    boolean A024 = A023.A02();
                    if ((r42 == AnonymousClass1DU.NEWS && !A014) || ((r42 == AnonymousClass1DU.PROFILE && !A024) || r42 == AnonymousClass1DU.DIRECT || r42 == AnonymousClass1DU.SHARE || r42 == AnonymousClass1DU.FEED)) {
                        C26461Dj r5 = this.A05;
                        r5.A0R.add(r242.A05);
                        int i4 = C26781Fg.A00[r242.A05.ordinal()];
                        if (i4 == 1) {
                            r5.A04 = r242;
                            r5.A07 = C16880pJ.A00.A02(r5.A0P, r5.A0O);
                            r13 = AnonymousClass1DU.NEWS;
                        } else if (i4 == 2) {
                            r5.A05 = r242;
                            r13 = AnonymousClass1DU.PROFILE;
                        } else if (i4 == 3) {
                            r5.A02 = r242;
                        } else if (i4 == 4) {
                            r5.A06 = r242;
                        } else if (i4 == 5) {
                            r5.A03 = r242;
                        }
                        C26461Dj.A06(r5, r13, "impression");
                    }
                    ProxyFrameLayout proxyFrameLayout = (ProxyFrameLayout) r242.A04;
                    if (Aew(r42)) {
                        this.A01 = proxyFrameLayout;
                        proxyFrameLayout.setSelected(true);
                    }
                    AnonymousClass1DU r07 = AnonymousClass1DU.FEED;
                    if (AnonymousClass1DU.DIRECT == r42 && ((Boolean) C05640Lj.A00(AnonymousClass0L7.DIRECT_MAIN_TAB_UNIVERSE_V2, "long_press_account_switch_enabled", false)).booleanValue() && AnonymousClass1DN.A02(this.A06)) {
                        proxyFrameLayout.setOnLongClickListener(new AnonymousClass4JB(this));
                    }
                    proxyFrameLayout.setOnClickListener(new C26791Fh(this, r42, proxyFrameLayout));
                    if (r42 == AnonymousClass1DU.PROFILE && A024) {
                        proxyFrameLayout.A02.add(new C125775aK(this));
                    }
                    proxyFrameLayout.A02.add(new C26801Fi(this, r42));
                    proxyFrameLayout.A02.add(new C26811Fj(this, proxyFrameLayout));
                    if (r42 == AnonymousClass1DU.SHARE) {
                        proxyFrameLayout.setProxyToOnClickListener(false);
                        proxyFrameLayout.A02.add(new C26891Fr(this));
                        if (C26901Fs.A00(this.A06, Constants.ZERO).A01) {
                            proxyFrameLayout.setOnLongClickListener(new C26931Fv(this));
                        }
                    } else {
                        proxyFrameLayout.A02.add(new C26821Fk(this, r42));
                    }
                    if (r42 == AnonymousClass1DU.SEARCH && C22120xs.A01()) {
                        proxyFrameLayout.setOnLongClickListener(new C26861Fo(this));
                    }
                    proxyFrameLayout.A02.add(new C26831Fl(this, r42));
                    this.A02.addView(proxyFrameLayout);
                    if (r42.equals(AnonymousClass1DU.FEED)) {
                        this.A01 = proxyFrameLayout;
                    } else if (r42.equals(AnonymousClass1DU.SEARCH)) {
                        this.A0K = new C26871Fp(proxyFrameLayout);
                    } else if (r42.equals(AnonymousClass1DU.PROFILE)) {
                        proxyFrameLayout.setId(C0003R.C0005id.profile_tab);
                        this.A09 = proxyFrameLayout;
                        this.A0L = new C26871Fp(proxyFrameLayout);
                    } else if (r42.equals(AnonymousClass1DU.SHARE)) {
                        C17510qM.A00.A0K(this.A06).A00 = proxyFrameLayout;
                    }
                }
                AnonymousClass1GU r33 = new AnonymousClass1GU(this.A06, this);
                this.A0J = r33;
                r33.A01 = new AnonymousClass1GW(r33, this);
                AnonymousClass1GX r15 = new AnonymousClass1GX(r33, this);
                r33.A00 = r15;
                C11130eT r25 = C11130eT.A01;
                r25.A02(C05140Ig.class, r15);
                r25.A02(C05130If.class, r33.A01);
                this.A03 = new AnonymousClass1GZ("ig_main_activity");
                this.A0F = new C27001Gc(this, this.A06, this.A09, this.A05, A005, this);
                if (intent2.hasExtra("FORCE_LOGOUT_LOGIN_EVENT")) {
                    C51512Ky r34 = new C51512Ky();
                    r34.A09 = getResources().getString(C0003R.string.logged_in_as, new Object[]{this.A06.A06.AZn()});
                    C11130eT.A01.BXT(new C33441cv(r34.A00()));
                }
                this.A0A = findViewById(C0003R.C0005id.tab_bar_shadow);
                AnonymousClass1DS r08 = this.A04;
                AnonymousClass1DY r152 = r08.A03;
                View decorView = r08.A06.getWindow().getDecorView();
                r152.A03 = decorView.findViewById(C0003R.C0005id.layout_container_main_panel);
                r152.A02 = decorView.findViewById(C0003R.C0005id.layout_container_main);
                r152.A04 = decorView.findViewById(C0003R.C0005id.layout_container_left);
                r152.A05 = decorView.findViewById(C0003R.C0005id.layout_container_right);
                SwipeNavigationContainer swipeNavigationContainer = (SwipeNavigationContainer) decorView.findViewById(C0003R.C0005id.swipe_navigation_container);
                r152.A0A = swipeNavigationContainer;
                AnonymousClass1DI r52 = r152.A0M.A05;
                C27101Gm r43 = new C27101Gm(new C27091Gl(r152.A04, r52.A05()));
                C27101Gm r35 = new C27101Gm(new C27091Gl(r152.A03, r52.A04()));
                if (AnonymousClass1DN.A00()) {
                    z2 = false;
                }
                z2 = true;
                if (z2) {
                    r02 = new C27101Gm(new C27091Gl(r152.A05, r52.A06()));
                } else {
                    r02 = null;
                }
                swipeNavigationContainer.A02 = r152;
                swipeNavigationContainer.A03 = r35;
                swipeNavigationContainer.A05 = r43;
                swipeNavigationContainer.A04 = r02;
                int A015 = AnonymousClass1BA.A01(r152.A0H, C0003R.attr.statusBarBackgroundColor);
                if (C27111Gn.A01(r152.A0L)) {
                    r2 = new C46081z6(r152.A0A, r152.A0H, A015);
                } else {
                    r2 = new C42681t4(r152.A0A, r152.A0H, A015);
                }
                r152.A0B = r2;
                r152.A0M.A00(r2);
                r152.A0A.setListener(new C27151Gr(r152, r52));
                C26391Dc r09 = r152.A0M;
                if (bundle != null) {
                    A012 = bundle2.getFloat("MainActivity.BUNDLE_KEY_CURRENT_NAVIGATION_POSITION");
                } else {
                    A012 = r09.A05.A01();
                }
                r152.A00 = A012;
                r152.A01 = A012;
                if (bundle == null) {
                    str = "activity_newly_created";
                } else {
                    str = "activity_recreated";
                }
                C27171Gt r010 = new C27171Gt();
                r010.A00 = A012;
                r010.A0B = false;
                r010.A09 = str;
                r152.Bsx(r010);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.A0B = layoutParams;
                layoutParams.bottomMargin = getResources().getDimensionPixelOffset(AnonymousClass1BA.A03(this, C0003R.attr.tabBarHeight));
                this.A0C = new FrameLayout.LayoutParams(-1, -1);
                if (AnonymousClass1BA.A01(this, C0003R.attr.actionBarShadowVisibility) != 0) {
                    i3 = 8;
                }
                this.A07 = i3;
                this.A0H = new C27191Gv();
                C23300zv.A00(this.A06).A04(new AnonymousClass12I());
                View decorView2 = getWindow().getDecorView();
                decorView2.setSystemUiVisibility(1280);
                AnonymousClass0PB.A02(decorView2, (Runnable) null);
                View decorView3 = getWindow().getDecorView();
                AnonymousClass1E1.A0c(decorView3, new C27211Gx());
                AnonymousClass1E1.A0J(decorView3);
                AnonymousClass1DY r36 = this.A04.A03;
                if (intent2.getData() == null && C16180oA.A00(r36.A0L).A00.getBoolean("has_ever_captured_media_for_recovery", false)) {
                    C88243s6 A0012 = C27221Gy.A00(r36.A0L);
                    if (A0012 != null) {
                        if (!C27221Gy.A03(A0012) || (i2 = A0012.A00) >= 3) {
                            C16180oA.A00(r36.A0L).A00.edit().putString("captured_media_recovery_info", "").apply();
                        } else {
                            AnonymousClass0C1 r26 = r36.A0L;
                            A0012.A00 = i2 + 1;
                            C27221Gy.A01(r26, A0012);
                            C27171Gt r27 = new C27171Gt();
                            r27.A00 = r36.A0M.A05.A05();
                            r27.A0B = false;
                            r27.A09 = "story_captured_media_recovery";
                            C185707wY r011 = A0012.A03;
                            if (r011 != null && r011.A0g) {
                                r27.A03 = AnonymousClass2TV.BOOMERANG;
                            }
                            r36.Bsx(r27);
                        }
                    }
                    AnonymousClass0C1 r44 = r36.A0L;
                    boolean z3 = false;
                    if (C16180oA.A00(r44).A00.getString("pending_capture_intent_capture_mode", (String) null) != null) {
                        z3 = true;
                    }
                    if (z3) {
                        C16180oA A0013 = C16180oA.A00(r44);
                        String string = A0013.A00.getString("pending_capture_intent_capture_mode", (String) null);
                        String string2 = A0013.A00.getString("pending_capture_intent_media_type", (String) null);
                        boolean z4 = A0013.A00.getBoolean("pending_capture_intent_is_reply", false);
                        AnonymousClass2EM r28 = new AnonymousClass2EM(AnonymousClass0QT.A00(r44, C42701t6.A00).A02("story_media_lost"));
                        r28.A04("is_reply", Boolean.valueOf(z4));
                        r28.A08("media_type", string2);
                        r28.A08("capture_mode", string);
                        r28.A01();
                        C42701t6.A00(r44);
                    }
                }
                Context applicationContext2 = getApplicationContext();
                AnonymousClass0C1 r37 = this.A06;
                if (((Boolean) AnonymousClass0L6.A02(r37, AnonymousClass0L7.LAUNCHER_BACKGROUND_WIFI_PREFETCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    C16180oA A0014 = C16180oA.A00(r37);
                    A0014.A00.edit().putBoolean("main_feed_media_prefetch_enabled", ((Boolean) AnonymousClass0L6.A02(r37, AnonymousClass0L7.LAUNCHER_BACKGROUND_WIFI_PREFETCH, "main_feed_enabled", false, (AnonymousClass04H) null)).booleanValue()).apply();
                    Class<C27231Gz> cls2 = C27231Gz.class;
                    synchronized (cls2) {
                        C27231Gz.A01(r37);
                        C27231Gz r16 = new C27231Gz(applicationContext2, r37);
                        AnonymousClass0Q7.A03().A0B(r16);
                        r37.BYi(cls2, r16);
                    }
                } else {
                    C27231Gz.A01(r37);
                }
                AnonymousClass0C1 r53 = this.A06;
                C16230oG.maybeSetupLocationServices(r53, ((Boolean) AnonymousClass0L6.A02(r53, AnonymousClass0L7.PLACE_SIGNATURE, "is_place_signature_enabled", true, (AnonymousClass04H) null)).booleanValue(), ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.LOCATION_INTEGRITY, "is_location_integrity_enabled", true, (AnonymousClass04H) null)).booleanValue());
                AnonymousClass0C1 r29 = this.A06;
                AnonymousClass1H1 r17 = (AnonymousClass1H1) r29.AVA(AnonymousClass1H1.class, new AnonymousClass1H2(this, r29));
                if (!r17.A01 && AnonymousClass1H3.A03(r17.A03)) {
                    r17.A01 = true;
                    AnonymousClass0Q7.A03().A0B(r17);
                }
                AnonymousClass1F5 r54 = this.A0G;
                AnonymousClass0C1 r18 = this.A06;
                String r20 = this.A04.A00().toString();
                AnonymousClass1DI r6 = this.A0Q;
                if (bundle == null) {
                }
                if (!intent2.hasExtra("MainActivityAccountHelper.STARTUP_TAB") || bundle != null) {
                    r54.A01.Bh6();
                    AnonymousClass0C1 r210 = this.A06;
                    ((AnonymousClass1X8) r210.AVA(AnonymousClass1X8.class, new AnonymousClass1X9(r210))).A02 = new WeakReference(this);
                    C12600h4 A0015 = C12600h4.A00();
                    C12600h4.A02(A0015, "ACTIVITY_ONCREATE_END");
                    r03 = A0015.A00;
                    if (r03 != null) {
                        try {
                            AnonymousClass1BH.A04(new Intent(r03.A0B, TaskLifeDetectingService.class), A0015.A00.A0B);
                        } catch (IllegalStateException e) {
                            AnonymousClass0QD.A09("AppStartupTracker", e);
                        }
                    }
                    C26441Dh A0016 = C26441Dh.A00(A013);
                    C12670hC.A02();
                    A0016.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
                    AnonymousClass0P4 A0017 = AnonymousClass0P4.A00("navigation", new C06300On("login"));
                    A0017.A0G("click_point", "cold start");
                    A0017.A0E("nav_depth", 0);
                    A0016.A03 = A0017;
                    A0016.A05 = "login";
                    AnonymousClass1XB.A00 = ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.CRASH_FIX_DETACH_FROM_GL_CONTEXT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    r04 = this.A06;
                    if (r04 != null) {
                        C23300zv A0018 = C23300zv.A00(r04);
                        A0018.A02(AnonymousClass1XC.class, this.A0S);
                        A0018.A02(AnonymousClass1XD.class, this.A0R);
                    }
                    if (((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.PREATTACH_CAMERA_FRAGMENT, "attach_after_startup", false, (AnonymousClass04H) null)).booleanValue()) {
                        C12000g1.A01.A01(new C30730DiJ(this));
                    }
                    if (!AnonymousClass1DN.A00() && ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.DIRECT_INBOX_NAVIGATION_LATENCY_IMPROVEMENTS, "preattach_after_cold_start", false, (AnonymousClass04H) null)).booleanValue()) {
                        C12000g1.A01.A01(new C30731DiK(this));
                    }
                    r3 = this.A06;
                    if (r3 != null && ((Boolean) AnonymousClass0L6.A02(r3, AnonymousClass0L7.NOTIFICATION_RUX_ANDROID, "show_rux", false, (AnonymousClass04H) null)).booleanValue()) {
                        C18880sZ.A00.A00();
                        AnonymousClass2OA r211 = new AnonymousClass2OA(this);
                        r211.A07(C0003R.string.rux_feed_dialog_title);
                        r211.A06(C0003R.string.rux_feed_dialog_msg);
                        r211.A0A(C0003R.string.rux_feed_dialog_primary_button_text, new C153406h2(this, r3));
                        r211.A09(C0003R.string.rux_feed_dialog_negative_button_text, new AnonymousClass40C());
                        r211.A0H(C019000b.A03(this, C0003R.C0004drawable.feed_dialog_img));
                        r211.A03().show();
                    }
                    booleanValue = ((Boolean) AnonymousClass0L6.A00(A013, AnonymousClass0L7.MAINACTIVITY_TRIM_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    this.A0N = booleanValue;
                    if (booleanValue) {
                        C252117x.A02().BZj(this);
                    }
                    C12000g1.A01.A00(new AnonymousClass1XE(this));
                    if (((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.IAP_COLD_START_SYNC, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                        C12000g1.A01.A00(new APG(this));
                    }
                    i = 1905803807;
                } else {
                    if (((Boolean) C05640Lj.A00(AnonymousClass0L7.ACCOUNT_SWITCH_PERSISTED_TABS, "is_enabled", false)).booleanValue()) {
                        String stringExtra = intent2.getStringExtra("MainActivityAccountHelper.STARTUP_TAB");
                        AnonymousClass1DU[] values = AnonymousClass1DU.values();
                        int length = values.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                r22 = null;
                                break;
                            }
                            r22 = values[i5];
                            if (r22.toString().equals(stringExtra)) {
                                break;
                            }
                            i5++;
                        }
                        r54.A01.Bl4(r22, false);
                        String stringExtra2 = intent2.getStringExtra("MainActivityAccountHelper.STARTUP_PANEL");
                        C26381Db[] values2 = C26381Db.values();
                        int length2 = values2.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                r12 = null;
                                break;
                            }
                            r12 = values2[i6];
                            if (r12.toString().equals(stringExtra2)) {
                                break;
                            }
                            i6++;
                        }
                        if (r12 != null) {
                            switch (r12.ordinal()) {
                                case 0:
                                    A022 = r6.A05();
                                    break;
                                case 1:
                                    A022 = r6.A03();
                                    break;
                                case 2:
                                    A022 = r6.A02();
                                    break;
                                default:
                                    A022 = r6.A01();
                                    break;
                            }
                            C26361Cy r38 = r54.A01;
                            C27171Gt r212 = new C27171Gt();
                            r212.A00 = A022;
                            r212.A0B = false;
                            r212.A09 = "startup_uri";
                            r212.A03 = AnonymousClass2TV.NORMAL;
                            r212.A05 = "all";
                            r38.Bsx(r212);
                        }
                    } else {
                        C26361Cy r62 = r54.A01;
                        String stringExtra3 = intent2.getStringExtra("MainActivityAccountHelper.STARTUP_TAB");
                        AnonymousClass1DU[] values3 = AnonymousClass1DU.values();
                        int length3 = values3.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length3) {
                                r1 = null;
                                break;
                            }
                            r1 = values3[i7];
                            if (r1.toString().equals(stringExtra3)) {
                                break;
                            }
                            i7++;
                        }
                        r62.Bl4(r1, false);
                    }
                    AnonymousClass0C1 r2102 = this.A06;
                    ((AnonymousClass1X8) r2102.AVA(AnonymousClass1X8.class, new AnonymousClass1X9(r2102))).A02 = new WeakReference(this);
                    C12600h4 A00152 = C12600h4.A00();
                    C12600h4.A02(A00152, "ACTIVITY_ONCREATE_END");
                    r03 = A00152.A00;
                    if (r03 != null) {
                    }
                    C26441Dh A00162 = C26441Dh.A00(A013);
                    C12670hC.A02();
                    A00162.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
                    AnonymousClass0P4 A00172 = AnonymousClass0P4.A00("navigation", new C06300On("login"));
                    A00172.A0G("click_point", "cold start");
                    A00172.A0E("nav_depth", 0);
                    A00162.A03 = A00172;
                    A00162.A05 = "login";
                    AnonymousClass1XB.A00 = ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.CRASH_FIX_DETACH_FROM_GL_CONTEXT, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    r04 = this.A06;
                    if (r04 != null) {
                    }
                    if (((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.PREATTACH_CAMERA_FRAGMENT, "attach_after_startup", false, (AnonymousClass04H) null)).booleanValue()) {
                    }
                    C12000g1.A01.A01(new C30731DiK(this));
                    r3 = this.A06;
                    C18880sZ.A00.A00();
                    AnonymousClass2OA r2112 = new AnonymousClass2OA(this);
                    r2112.A07(C0003R.string.rux_feed_dialog_title);
                    r2112.A06(C0003R.string.rux_feed_dialog_msg);
                    r2112.A0A(C0003R.string.rux_feed_dialog_primary_button_text, new C153406h2(this, r3));
                    r2112.A09(C0003R.string.rux_feed_dialog_negative_button_text, new AnonymousClass40C());
                    r2112.A0H(C019000b.A03(this, C0003R.C0004drawable.feed_dialog_img));
                    r2112.A03().show();
                    booleanValue = ((Boolean) AnonymousClass0L6.A00(A013, AnonymousClass0L7.MAINACTIVITY_TRIM_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    this.A0N = booleanValue;
                    if (booleanValue) {
                    }
                    C12000g1.A01.A00(new AnonymousClass1XE(this));
                    if (((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.IAP_COLD_START_SYNC, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    }
                    i = 1905803807;
                }
            }
        }
        AnonymousClass0Z0.A07(i, A002);
    }

    public final void onPostResume() {
        WeakReference weakReference;
        boolean ACR;
        C101134Yp r0;
        Bundle bundle;
        C26441Dh.A00(this.A06).A04 = this.A04.A00().toString();
        super.onPostResume();
        if (this.A0O && ((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.FIX_EXTERNAL_INTENT_STORY_SHARE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            if (!A01()) {
                this.A04.A02();
            }
            this.A0O = false;
        }
        AnonymousClass1DS r2 = this.A04;
        AnonymousClass1DT r1 = r2.A02;
        AnonymousClass1DU r02 = r1.A01;
        if (r02 != null) {
            r1.A01(r02);
            r1.A01 = null;
        }
        AnonymousClass1DU r03 = r1.A00;
        if (r03 != null) {
            r1.A00(r03);
            r1.A00 = null;
        }
        AnonymousClass1DY r5 = r2.A03;
        C26381Db r04 = r5.A09;
        if (r04 != null) {
            boolean z = false;
            r5.A04(r04, false);
            r5.A09 = null;
            if (((Boolean) C05640Lj.A00(AnonymousClass0L7.SHORTCUTS_2019, "is_enabled", false)).booleanValue()) {
                if (r5.A0A.getPosition() == r5.A0M.A05.A05()) {
                    z = true;
                }
                if (z) {
                    C1890185p A012 = AnonymousClass1DY.A01(r5);
                    if (A012 == null) {
                        AnonymousClass0QD.A02(r5.A03(r5.A0H.A05()), "mQuickCaptureFragment is null");
                    } else if (!A012.A01.A1E()) {
                        C26391Dc r22 = r5.A0M;
                        boolean z2 = false;
                        if (r22.A05.A0A(r5.A0A.getPosition()) == 1.0f) {
                            z2 = true;
                        }
                        if (z2) {
                            A012.BDE(r22);
                        }
                    }
                }
            }
        }
        Bundle bundle2 = A0T;
        A0T = null;
        if (bundle2 != null && !bundle2.isEmpty()) {
            AnonymousClass1HD A0L2 = this.A04.A02.A02.A05().A0L(C0003R.C0005id.layout_container_main);
            if (bundle2.getBoolean("should_load_args_to_host") && (A0L2 instanceof AnonymousClass1H9) && (bundle = ((AnonymousClass1H9) this.A04.A02.A02.A05().A0L(C0003R.C0005id.layout_container_main)).getChildFragmentManager().A0L(C0003R.C0005id.layout_container_main).mArguments) != null) {
                bundle.putAll(bundle2);
            }
            AnonymousClass0C1 r23 = this.A06;
            AnonymousClass1X8 r24 = (AnonymousClass1X8) r23.AVA(AnonymousClass1X8.class, new AnonymousClass1X9(r23));
            r24.A03 = true | r24.A03;
            AnonymousClass0C1 r3 = this.A06;
            AnonymousClass6K3 A002 = AnonymousClass6J5.A00(new AnonymousClass6J5(), bundle2.getString("screen"));
            if (A002 != null) {
                AnonymousClass6K6 r05 = A002.A00;
                if (r05 == null) {
                    ACR = false;
                } else {
                    ACR = r05.ACR(this, r3, bundle2);
                }
                if (!ACR && (r0 = A002.A01) != null) {
                    r0.BXB(this, r3, bundle2);
                }
            } else {
                throw new RuntimeException("Received unknown starting bundle type");
            }
        }
        AnonymousClass0C1 r25 = this.A06;
        AnonymousClass1X8 r32 = (AnonymousClass1X8) r25.AVA(AnonymousClass1X8.class, new AnonymousClass1X9(r25));
        boolean z3 = this.A0P;
        long j = C16180oA.A00(r32.A01).A00.getLong("reset_to_main_feed_background_time", 0);
        C16180oA.A00(r32.A01).A00.edit().putLong("reset_to_main_feed_background_time", 0).apply();
        if (!(j == 0 || (weakReference = r32.A02) == null || weakReference.get() == null || !z3 || r32.A03)) {
            long j2 = r32.A00;
            long abs = Math.abs(j2 - j);
            long abs2 = Math.abs(System.currentTimeMillis() - j2);
            if (abs > TimeUnit.MINUTES.toMillis(30) && abs2 < 500) {
                Intent intent = new Intent((Context) r32.A02.get(), ((Activity) r32.A02.get()).getClass());
                intent.addFlags(268533760);
                AnonymousClass1BH.A03(intent, (Context) r32.A02.get());
                ((Activity) r32.A02.get()).finish();
            }
        }
        r32.A03 = false;
    }

    public final void A0J(AnonymousClass1HD r14) {
        C27341Hl r1;
        Bundle bundle;
        super.A0J(r14);
        AnonymousClass1DS r5 = this.A04;
        AnonymousClass1DY r6 = r5.A03;
        AnonymousClass1DV A002 = C27271He.A00(r14);
        C26331Cv r11 = r5.A07;
        boolean z = r5.A09;
        if (!C26381Db.CAMERA.equals(A002) || !(r14 instanceof C1890185p)) {
            if (C26381Db.DIRECT.equals(A002) && !z) {
                r1 = (C27341Hl) r14;
                r6.A06 = r1;
            } else if (A002 != null && "fragment_news".equals(A002.AMC()) && (r14 instanceof C27341Hl)) {
                r1 = (C27341Hl) r14;
                r6.A07 = r1;
            } else if (r14 instanceof AnonymousClass1HH) {
                ((AnonymousClass1HH) r14).registerLifecycleListener(new C27281Hf(r6.A0L, r6.A0H, (AnonymousClass0RN) r14));
            }
            if (r1 instanceof AnonymousClass2NH) {
                ((AnonymousClass2NH) r1).Bky(r6);
            }
        } else {
            C1890185p r2 = (C1890185p) r14;
            r6.A0E = new WeakReference(r2);
            FragmentActivity fragmentActivity = r6.A0H;
            C152736ft r7 = new C152736ft(fragmentActivity, r6.A0L, r6.A0M, r11, r6.A0I);
            C152706fq r12 = new C152706fq((ViewGroup) fragmentActivity.getWindow().getDecorView(), r7);
            r6.A08 = r12;
            r2.A06 = r6.A0M;
            r2.A02 = r12;
            r2.A03 = r7;
        }
        if (r14 instanceof AnonymousClass1HN) {
            AnonymousClass1DV A003 = C27271He.A00(r14);
            if (A003 == null) {
                bundle = null;
            } else {
                bundle = (Bundle) r5.A04.remove(A003);
            }
            if (bundle != null && !bundle.isEmpty()) {
                ((AnonymousClass1HN) r14).BhS(bundle);
            }
        }
    }

    public final void A0S() {
        AnonymousClass1H9 r1 = (AnonymousClass1H9) A05().A0L(C0003R.C0005id.layout_container_main);
        if (r1 != null && r1.isAdded()) {
            AnonymousClass1X7.A01(this, r1.getChildFragmentManager());
        }
    }

    public final AnonymousClass1AM AJb() {
        AnonymousClass1HD A0L2 = A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L2 == null) {
            return null;
        }
        return A0L2.getChildFragmentManager();
    }

    public final View AXd(String str) {
        AnonymousClass1DU r2;
        AnonymousClass1DU[] values = AnonymousClass1DU.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r2 = null;
                break;
            }
            r2 = values[i];
            if (r2.toString().equals(str)) {
                break;
            }
            i++;
        }
        if (r2 != null) {
            for (int i2 = 0; i2 < this.A02.getChildCount(); i2++) {
                if (this.A02.getChildAt(i2).getTag().equals(r2)) {
                    return this.A02.getChildAt(i2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("Stub");
    }

    public final int AXg() {
        if (getResources().getConfiguration().orientation == 2) {
            return 8;
        }
        return this.A00;
    }

    public final boolean BG8() {
        return A04(this);
    }

    public final void Bgv(String str) {
        AnonymousClass1DU r1;
        AnonymousClass1DU[] values = AnonymousClass1DU.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = null;
                break;
            }
            r1 = values[i];
            if (r1.toString().equals(str)) {
                break;
            }
            i++;
        }
        if (r1 == null) {
            throw new UnsupportedOperationException("Stub");
        } else if (!Aew(r1)) {
            Bl4(r1, false);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AHp().Ar3(i, i2, intent);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(1419259622);
        C26421Df.A00 = null;
        AnonymousClass0C1 r0 = this.A06;
        if (r0 != null) {
            C23300zv A003 = C23300zv.A00(r0);
            A003.A03(AnonymousClass1XC.class, this.A0S);
            A003.A03(AnonymousClass1XD.class, this.A0R);
            AnonymousClass1DS r2 = this.A04;
            if (r2 != null) {
                float f = r2.A03.A00;
                Object A004 = r2.A00();
                if (f != this.A0Q.A04()) {
                    if (!AnonymousClass1DN.A00() && f == this.A0Q.A03()) {
                        A004 = C26381Db.DIRECT;
                    } else if (f == this.A0Q.A05()) {
                        A004 = C26381Db.CAMERA;
                    } else if (AnonymousClass1DX.A02() && f == this.A0Q.A02()) {
                        A004 = C26381Db.ACTIVITY_FEED;
                    }
                }
                C49892Ea A005 = C49892Ea.A00();
                A005.A00.put(this.A06.A04(), A004);
            }
            C31221Wz A012 = C31201Wx.A01(this);
            if (A012 != null) {
                A012.A06((AnonymousClass2MC) null);
            }
        }
        C26461Dj r22 = this.A05;
        if (r22 != null) {
            C11130eT.A01.A03(C33591dA.class, r22.A0G);
            AnonymousClass1FW r02 = r22.A04;
            if (r02 != null) {
                r02.A03.setVisibility(8);
                r22.A04.A00();
            }
            AnonymousClass1FW r03 = r22.A05;
            if (r03 != null) {
                r03.A03.setVisibility(8);
                r22.A05.A00();
            }
            r22.A0Q.clear();
            r22.A0A = false;
            r22.A01 = 0;
            this.A05 = null;
        }
        AnonymousClass1GU r3 = this.A0J;
        if (r3 != null) {
            C11130eT r23 = C11130eT.A01;
            r23.A03(C05140Ig.class, r3.A00);
            r23.A03(C05130If.class, r3.A01);
            this.A0J = null;
        }
        if (this.A0N) {
            C252117x.A02().A05(this);
        }
        this.A0I = null;
        this.A0D = null;
        this.A0H = null;
        this.A0G = null;
        this.A0F = null;
        super.onDestroy();
        AnonymousClass1DS r24 = this.A04;
        AnonymousClass1DY r04 = r24.A03;
        r04.A0B = null;
        SwipeNavigationContainer swipeNavigationContainer = r04.A0A;
        if (swipeNavigationContainer != null) {
            swipeNavigationContainer.setListener((C27161Gs) null);
            swipeNavigationContainer.A02 = null;
        }
        r24.A03 = null;
        r24.A02 = null;
        r24.A01 = null;
        this.A04 = null;
        AnonymousClass0C1 r05 = this.A06;
        if (r05 != null) {
            AnonymousClass0CA.A00(r05).A01();
        }
        this.A06 = null;
        AnonymousClass0Z0.A07(708340746, A002);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public final void onNewIntent(Intent intent) {
        boolean z;
        Intent intent2 = intent;
        if (!isFinishing()) {
            C26431Dg.A02(this.A06, this, this, intent);
            AnonymousClass1F5 r3 = this.A0G;
            AnonymousClass0C1 r5 = this.A06;
            if (!r3.A01(intent2, r5, this.A04.A00().toString(), this.A0Q, this)) {
                z = r3.A02(r5, intent, this);
            } else {
                z = false;
            }
            if (z) {
                C31221Wz AGw = AGw();
                if (AGw.A0Q()) {
                    AGw.A0B();
                }
            }
            AnonymousClass0C1 r2 = this.A06;
            AnonymousClass1X8 r1 = (AnonymousClass1X8) r2.AVA(AnonymousClass1X8.class, new AnonymousClass1X9(r2));
            r1.A03 = z | r1.A03;
        }
        super.onNewIntent(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (p000X.AnonymousClass1DX.A02() != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r4.A03.A05() != false) goto L_0x002f;
     */
    public final void onPause() {
        boolean z;
        boolean z2;
        int A002 = AnonymousClass0Z0.A00(392973654);
        super.onPause();
        this.A04.A03.A0B.BE0();
        AnonymousClass1DS r4 = this.A04;
        if (AnonymousClass1DN.A00()) {
            z = false;
        }
        z = true;
        boolean z3 = false;
        if (z) {
            z2 = false;
        }
        z2 = true;
        if (z2 && r4.A03.A06()) {
            z3 = true;
        }
        this.A0P = z3;
        C26871Fp r1 = this.A0L;
        if (r1 != null) {
            AnonymousClass1EG r0 = r1.A00;
            r0.A08(r1);
            r0.A02();
        }
        C26871Fp r12 = this.A0K;
        if (r12 != null) {
            AnonymousClass1EG r02 = r12.A00;
            r02.A08(r12);
            r02.A02();
        }
        C26461Dj r42 = this.A05;
        AnonymousClass0ZA.A07(r42.A0F, (Object) null);
        r42.A0Q.clear();
        AnonymousClass1FW r03 = r42.A04;
        if (r03 != null) {
            r03.A00();
        }
        AnonymousClass1FW r04 = r42.A05;
        if (r04 != null) {
            r04.A00();
        }
        AnonymousClass1FW r05 = r42.A02;
        if (r05 != null) {
            r05.A00();
        }
        AnonymousClass0C1 r06 = r42.A0P;
        if (r06 != null) {
            C23300zv A003 = C23300zv.A00(r06);
            A003.A03(C33551d6.class, r42.A0L);
            A003.A03(C33561d7.class, r42.A0H);
            A003.A03(C33571d8.class, r42.A0I);
        }
        C11130eT r2 = C11130eT.A01;
        r2.A03(C33581d9.class, r42.A0K);
        r2.A03(C33601dB.class, r42.A0J);
        C26971Fz r07 = r42.A07;
        if (r07 != null) {
            r07.A01();
        }
        r42.A09 = false;
        C33251cc.A01().Ar2(this);
        AnonymousClass0Z0.A07(990526814, A002);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        AHp().BJh(bundle);
        this.A0P = bundle.getBoolean("MainActivity.should_restore_to_main_feed");
    }

    public final void onResume() {
        AnonymousClass1EG r0;
        AnonymousClass1EG r02;
        AnonymousClass1FW r8;
        int A002 = AnonymousClass0Z0.A00(-850764651);
        C33251cc.A01().Ar6(this);
        C16670oy.A01();
        super.onResume();
        C33521d3 r2 = new C33521d3(this);
        C16670oy A012 = C16670oy.A01();
        AnonymousClass0C1 r6 = this.A06;
        C16620ot r5 = A012.A00;
        C16710p2 A003 = C16620ot.A00(r5, "newstab");
        if (A003 != null) {
            r5.A00.ADc(new C33531d4(r5, A003, r6));
        }
        C16180oA.A01(this.A06, 0);
        C12670hC.A04(C237211o.A00(this.A06).A03);
        C26461Dj r1 = this.A05;
        AnonymousClass0C1 r03 = r1.A0P;
        if (r03 != null) {
            C23300zv A004 = C23300zv.A00(r03);
            A004.A02(C33551d6.class, r1.A0L);
            A004.A02(C33561d7.class, r1.A0H);
            A004.A02(C33571d8.class, r1.A0I);
            C11130eT r62 = C11130eT.A01;
            r62.A02(C33581d9.class, r1.A0K);
            r62.A02(C33591dA.class, r1.A0G);
            r62.A02(C33601dB.class, r1.A0J);
            C26971Fz r04 = r1.A07;
            if (r04 != null) {
                r04.A02();
            }
        }
        AnonymousClass0C1 r05 = r1.A0P;
        if (r05 != null && !C16180oA.A00(r05).A00.getBoolean("direct_seen_tab_moved_nux", false) && (r8 = r1.A02) != null && !r1.A0A) {
            C26461Dj.A03(r1, C0003R.string.tab_direct_messages_nux, r8, new C56362cN(r1), true, 0);
        }
        r1.A09 = true;
        if (r1.A0C) {
            r1.A0C = false;
            C26461Dj.A00(r1);
        } else {
            C26461Dj.A01(r1);
        }
        if (this.A09 != null && AnonymousClass1DN.A02(this.A06)) {
            this.A09.setOnLongClickListener(r2);
        }
        AnonymousClass0LQ r12 = AnonymousClass0LQ.A01;
        if (r12 != null) {
            r12.A0F(this.A06);
            r12.A0D(this.A06);
        }
        C26591Ec.A00(this.A06).A01();
        C26871Fp r13 = this.A0L;
        if (!(r13 == null || (r02 = r13.A00) == null)) {
            r02.A07(r13);
            r02.A02();
        }
        C26871Fp r14 = this.A0K;
        if (!(r14 == null || (r0 = r14.A00) == null)) {
            r0.A07(r14);
            r0.A02();
        }
        AnonymousClass1DY r52 = this.A04.A03;
        C26391Dc r22 = r52.A0M;
        boolean z = false;
        if (r22.A01 == r22.A05.A05()) {
            z = true;
        }
        r52.A0B.BK0(z);
        if (this.A0O && !((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.FIX_EXTERNAL_INTENT_STORY_SHARE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            if (!A01()) {
                this.A04.A02();
            }
            this.A0O = false;
        }
        String str = this.A0M;
        if (str != null) {
            C16380oV.A00.A0C(this.A06, str);
            this.A0M = null;
        }
        C33251cc.A01().A02 = false;
        if (((Boolean) AnonymousClass0L6.A02(this.A06, AnonymousClass0L7.PREATTACH_CAMERA_FRAGMENT, "attach_during_startup", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A04.A03.A04(C26381Db.CAMERA, false);
        }
        C12600h4.A02(C12600h4.A00(), "ACTIVITY_RESUMED");
        AnonymousClass0Z0.A07(1013147563, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AHp().BKp(bundle);
        AnonymousClass1DS r3 = this.A04;
        bundle.putBoolean("MainTabControllerImpl.BUNDLE_KEY_IS_CURRENT_TAB_LOADED", r3.A05);
        AnonymousClass1DY r4 = r3.A03;
        ArrayList arrayList = new ArrayList();
        if (r4.A0A != null) {
            if (r4.A06 != null && r4.A05()) {
                arrayList.add(C26381Db.DIRECT.AMC());
            }
            if (r4.A07 != null) {
                boolean z = false;
                if (r4.A0M.A05.A07(r4.A0A.getPosition()) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    z = true;
                }
                if (z) {
                    arrayList.add(C26381Db.ACTIVITY_FEED.AMC());
                }
            }
            if (AnonymousClass1DY.A01(r4) != null && r4.A06()) {
                arrayList.add(C26381Db.CAMERA.AMC());
            }
        }
        bundle.putStringArrayList("RESTORE_DISABLED_FRAGMENT_TAGS", arrayList);
        AnonymousClass1DT r0 = r3.A02;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = r0.A05.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AnonymousClass1DU) it.next()).toString());
        }
        bundle.putStringArrayList("NavigationController.BUNDLE_KEY_BACK_STACK", arrayList2);
        bundle.putFloat("MainActivity.BUNDLE_KEY_CURRENT_NAVIGATION_POSITION", r3.A03.A00);
        bundle.putBoolean("MainActivity.should_restore_to_main_feed", this.A0P);
    }

    public final void onStart() {
        AnonymousClass1FW r6;
        int i;
        int A002 = AnonymousClass0Z0.A00(523910853);
        super.onStart();
        C12600h4 A003 = C12600h4.A00();
        if (AnonymousClass0Q7.A03().A0H()) {
            C12600h4.A01(A003, this, Constants.A0C, -1, Looper.myQueue());
            C12600h4.A00().A05(C12620h6.LAUNCHER);
        }
        C27001Gc r4 = this.A0F;
        this.A0H.A00(true, this);
        C23300zv A004 = C23300zv.A00(r4.A09);
        A004.A02(C33211cY.class, r4.A03);
        A004.A02(C33221cZ.class, r4.A02);
        A004.A02(C33231ca.class, r4.A05);
        A004.A02(C33241cb.class, r4.A04);
        if (r4.A0A) {
            C22000xg.A00.A02(r4.A09, r4.A06);
            r4.A08.A08();
            C97684Ka r1 = r4.A00;
            if (r1 != null) {
                r1.A01();
            }
        }
        C26461Dj r42 = r4.A08;
        if (r42.A0P != null && !r42.A0A && !AnonymousClass1DN.A01()) {
            if (AnonymousClass1DN.A03(r42.A0P)) {
                if (AnonymousClass1DN.A04(true)) {
                    AnonymousClass0L7 r3 = AnonymousClass0L7.ADD_TOOLTIP_FOR_LONG_PRESS_AVATAR_ACCOUNT_SWITCHER_ENTRYPOINT;
                    if (((Boolean) C05640Lj.A00(r3, "should_show_tooltip", false)).booleanValue() && r42.A05 != null) {
                        int intValue = ((Integer) C05640Lj.A00(r3, "content_version", 0)).intValue();
                        if (intValue != 1) {
                            i = C0003R.string.long_press_profile_tab_tooltip_text_v2;
                            if (intValue != 2) {
                                i = C0003R.string.long_press_profile_tab_tooltip_text_v0;
                            }
                        } else {
                            i = C0003R.string.long_press_profile_tab_tooltip_text_v1;
                        }
                        C26461Dj.A03(r42, i, r42.A05, new C56352cM(r42), false, 500);
                    }
                }
            } else if (AnonymousClass1DN.A04(false) && ((Boolean) C05640Lj.A00(AnonymousClass0L7.LONG_PRESS_SHOW_MAS_WITH_SINGLE_ACCOUNT, "should_show_tooltip", false)).booleanValue() && (r6 = r42.A05) != null) {
                C26461Dj.A03(r42, C0003R.string.long_press_profile_tab_tooltip_text_v2, r6, new C56342cL(r42), false, 1000);
            }
        }
        AnonymousClass0Z0.A07(-1317060568, A002);
    }

    public final void onStop() {
        int A002 = AnonymousClass0Z0.A00(-601180033);
        C27001Gc r3 = this.A0F;
        C27191Gv r5 = this.A0H;
        C23300zv A003 = C23300zv.A00(r3.A09);
        A003.A03(C33211cY.class, r3.A03);
        A003.A03(C33231ca.class, r3.A05);
        A003.A03(C33221cZ.class, r3.A02);
        A003.A03(C33241cb.class, r3.A04);
        r5.A00(false, this);
        if (r3.A0A) {
            C22000xg.A00.A03(r3.A09, r3.A06);
            C97684Ka r32 = r3.A00;
            if (r32 != null) {
                Handler handler = r32.A00;
                if (handler != null) {
                    AnonymousClass0ZA.A07(handler, (Object) null);
                }
                r32.A02.A03(C68262yn.class, r32.A03);
            }
        }
        super.onStop();
        AnonymousClass0Z0.A07(-1794889423, A002);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (!this.A0N) {
            this.A04.A01();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        View view;
        int i;
        View view2;
        super.onWindowFocusChanged(z);
        Intent intent = getIntent();
        if (z && this.A06 != null && intent != null && intent.hasExtra("MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT")) {
            C13300iJ r8 = this.A06.A06;
            AnonymousClass1DY r3 = this.A04.A03;
            C26391Dc r2 = r3.A0M;
            float f = r2.A01;
            if (!(r3.A06 == null && r3.A07 == null) && f == r2.A05.A03()) {
                view = r3.A05;
            } else {
                view = r3.A03;
            }
            if (view != null) {
                C26391Dc r22 = r3.A0M;
                float f2 = r22.A01;
                if (!(r3.A06 == null && r3.A07 == null) && f2 == r22.A05.A03()) {
                    view2 = r3.A05;
                } else {
                    view2 = r3.A03;
                }
                i = view2.getHeight();
            } else {
                i = 0;
            }
            int A002 = C27651Ir.A00(this);
            C51512Ky r7 = new C51512Ky();
            r7.A04 = r8.ASv();
            r7.A06 = Constants.A0C;
            r7.A07 = Constants.ZERO;
            r7.A01 = i - A002;
            r7.A0C = true;
            r7.A09 = getResources().getString(C0003R.string.switched_to, new Object[]{r8.AZn()});
            C51522Kz A003 = r7.A00();
            this.A0E = A003;
            C11130eT.A01.BXT(new C33441cv(A003));
            intent.removeExtra("MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT");
        }
    }

    public final void BiQ(String str) {
        this.A0M = str;
    }

    public final void BkX(boolean z) {
        this.A0O = z;
    }

    public final void Bkl(Intent intent) {
        this.A08 = intent;
    }
}
