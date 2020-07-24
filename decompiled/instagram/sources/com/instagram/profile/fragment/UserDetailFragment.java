package com.instagram.profile.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.p004ui.widget.adapterlayout.AdapterLinearLayout;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.nestablescrollingview.NestableViewPager;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.profile.p021ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.profile.p021ui.refresh.RefreshableAppBarLayoutBehavior;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OZ;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RC;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass12K;
import p000X.AnonymousClass172;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1CF;
import p000X.AnonymousClass1CH;
import p000X.AnonymousClass1D1;
import p000X.AnonymousClass1DW;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EK;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1F6;
import p000X.AnonymousClass1FF;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1I2;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1KT;
import p000X.AnonymousClass1KU;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1NR;
import p000X.AnonymousClass1NW;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1P6;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1UP;
import p000X.AnonymousClass1UR;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1WN;
import p000X.AnonymousClass1XL;
import p000X.AnonymousClass1XN;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass2FD;
import p000X.AnonymousClass2FF;
import p000X.AnonymousClass2KB;
import p000X.AnonymousClass2KC;
import p000X.AnonymousClass2KM;
import p000X.AnonymousClass2NR;
import p000X.AnonymousClass2NV;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2UZ;
import p000X.AnonymousClass2Z2;
import p000X.AnonymousClass380;
import p000X.AnonymousClass382;
import p000X.AnonymousClass383;
import p000X.AnonymousClass384;
import p000X.AnonymousClass385;
import p000X.AnonymousClass387;
import p000X.AnonymousClass388;
import p000X.AnonymousClass38B;
import p000X.AnonymousClass38C;
import p000X.AnonymousClass38D;
import p000X.AnonymousClass38F;
import p000X.AnonymousClass38G;
import p000X.AnonymousClass38H;
import p000X.AnonymousClass38I;
import p000X.AnonymousClass38J;
import p000X.AnonymousClass38K;
import p000X.AnonymousClass38L;
import p000X.AnonymousClass38M;
import p000X.AnonymousClass38N;
import p000X.AnonymousClass38O;
import p000X.AnonymousClass38P;
import p000X.AnonymousClass38Q;
import p000X.AnonymousClass38R;
import p000X.AnonymousClass38S;
import p000X.AnonymousClass38T;
import p000X.AnonymousClass38U;
import p000X.AnonymousClass38V;
import p000X.AnonymousClass38W;
import p000X.AnonymousClass38X;
import p000X.AnonymousClass38Y;
import p000X.AnonymousClass38Z;
import p000X.AnonymousClass392;
import p000X.AnonymousClass397;
import p000X.AnonymousClass39B;
import p000X.AnonymousClass39G;
import p000X.AnonymousClass39H;
import p000X.AnonymousClass39I;
import p000X.AnonymousClass39K;
import p000X.AnonymousClass39L;
import p000X.AnonymousClass39M;
import p000X.AnonymousClass39N;
import p000X.AnonymousClass39X;
import p000X.AnonymousClass3A5;
import p000X.AnonymousClass3A6;
import p000X.AnonymousClass3AC;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass3AJ;
import p000X.AnonymousClass3AM;
import p000X.AnonymousClass3AP;
import p000X.AnonymousClass3AQ;
import p000X.AnonymousClass3AR;
import p000X.AnonymousClass3AT;
import p000X.AnonymousClass3BU;
import p000X.AnonymousClass3C0;
import p000X.AnonymousClass3C6;
import p000X.AnonymousClass41W;
import p000X.AnonymousClass471;
import p000X.AnonymousClass4MQ;
import p000X.AnonymousClass4UW;
import p000X.AnonymousClass4WW;
import p000X.AnonymousClass4XV;
import p000X.AnonymousClass4YN;
import p000X.AnonymousClass54G;
import p000X.AnonymousClass59K;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass5PN;
import p000X.AnonymousClass5T1;
import p000X.AnonymousClass61L;
import p000X.AnonymousClass6AF;
import p000X.AnonymousClass6C0;
import p000X.AnonymousClass6C1;
import p000X.AnonymousClass9IT;
import p000X.AnonymousClass9IU;
import p000X.AnonymousClass9IV;
import p000X.C019000b;
import p000X.C05570Lc;
import p000X.C05640Lj;
import p000X.C05680Ln;
import p000X.C05760Lv;
import p000X.C05860Mt;
import p000X.C06100Nt;
import p000X.C06270Ok;
import p000X.C06570Po;
import p000X.C06590Pq;
import p000X.C100904Xp;
import p000X.C106924jJ;
import p000X.C106954jM;
import p000X.C106984jP;
import p000X.C109094mv;
import p000X.C109114mx;
import p000X.C109124my;
import p000X.C109134mz;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C113054te;
import p000X.C114104vN;
import p000X.C115054wv;
import p000X.C115104x0;
import p000X.C115324xM;
import p000X.C115574xn;
import p000X.C1169750m;
import p000X.C11850fm;
import p000X.C120125Dh;
import p000X.C121495It;
import p000X.C122795Nx;
import p000X.C125085Xm;
import p000X.C125355Zc;
import p000X.C125365Zd;
import p000X.C12670hC;
import p000X.C126785c0;
import p000X.C127735dY;
import p000X.C12800hP;
import p000X.C12810hQ;
import p000X.C12830hS;
import p000X.C128425ef;
import p000X.C128665f4;
import p000X.C13150hy;
import p000X.C132145kp;
import p000X.C132155kq;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C134405oU;
import p000X.C13510ie;
import p000X.C136395rv;
import p000X.C137365tW;
import p000X.C140705zu;
import p000X.C14090jk;
import p000X.C1410060z;
import p000X.C14100jl;
import p000X.C1412562b;
import p000X.C143496Bw;
import p000X.C146186Mt;
import p000X.C154526ir;
import p000X.C154546it;
import p000X.C154866jQ;
import p000X.C15890nh;
import p000X.C15940nm;
import p000X.C15960no;
import p000X.C16050nx;
import p000X.C16170o9;
import p000X.C16180oA;
import p000X.C16310oO;
import p000X.C16880pJ;
import p000X.C16920pO;
import p000X.C17020pY;
import p000X.C17050pb;
import p000X.C17640qZ;
import p000X.C17850qu;
import p000X.C18980sj;
import p000X.C19000sl;
import p000X.C215639Rd;
import p000X.C215679Rh;
import p000X.C217339Yw;
import p000X.C218279b7;
import p000X.C22100xq;
import p000X.C22120xs;
import p000X.C22160xw;
import p000X.C23300zv;
import p000X.C256419q;
import p000X.C26311Ct;
import p000X.C26441Dh;
import p000X.C26571Ea;
import p000X.C27021Ge;
import p000X.C27341Hl;
import p000X.C27381Hp;
import p000X.C27401Hr;
import p000X.C27451Hx;
import p000X.C27661Is;
import p000X.C27691Iv;
import p000X.C27971CYh;
import p000X.C28051Kf;
import p000X.C28341Li;
import p000X.C28538CiX;
import p000X.C28971Oc;
import p000X.C29081On;
import p000X.C29551Qi;
import p000X.C29631Qq;
import p000X.C29671Qu;
import p000X.C30521Ue;
import p000X.C30541Ug;
import p000X.C30671Ut;
import p000X.C30921Vs;
import p000X.C31061Wh;
import p000X.C31071Wi;
import p000X.C31091Wk;
import p000X.C31121Wn;
import p000X.C31131Wo;
import p000X.C31561Yu;
import p000X.C31571Yv;
import p000X.C32711bj;
import p000X.C32921c4;
import p000X.C32991cC;
import p000X.C33051cI;
import p000X.C33231ca;
import p000X.C33451cw;
import p000X.C33601dB;
import p000X.C35041fi;
import p000X.C35111fp;
import p000X.C35151ft;
import p000X.C35241g2;
import p000X.C36981iv;
import p000X.C37111j8;
import p000X.C37141jB;
import p000X.C37201jH;
import p000X.C37591ju;
import p000X.C37721k7;
import p000X.C38031kc;
import p000X.C42251s2;
import p000X.C44841wq;
import p000X.C51052Iz;
import p000X.C51352Ki;
import p000X.C51522Kz;
import p000X.C52002Na;
import p000X.C52362Om;
import p000X.C52912Qs;
import p000X.C52922Qt;
import p000X.C52932Qu;
import p000X.C52952Qw;
import p000X.C53722Ua;
import p000X.C53832Un;
import p000X.C53882Us;
import p000X.C53892Uu;
import p000X.C55262aK;
import p000X.C55602b0;
import p000X.C55872bY;
import p000X.C56202c6;
import p000X.C57942f3;
import p000X.C58422fu;
import p000X.C62902oZ;
import p000X.C62912oa;
import p000X.C63522pc;
import p000X.C63532pd;
import p000X.C63542pe;
import p000X.C63552pf;
import p000X.C63562pg;
import p000X.C63572ph;
import p000X.C63592pj;
import p000X.C63602pk;
import p000X.C63612pl;
import p000X.C63622pm;
import p000X.C63632pn;
import p000X.C63642po;
import p000X.C63652pp;
import p000X.C63662pq;
import p000X.C63672pr;
import p000X.C63682ps;
import p000X.C63692pt;
import p000X.C63702pu;
import p000X.C63712pv;
import p000X.C63722pw;
import p000X.C63732px;
import p000X.C63742py;
import p000X.C63752pz;
import p000X.C63762q0;
import p000X.C63772q1;
import p000X.C63782q2;
import p000X.C64372rN;
import p000X.C689430j;
import p000X.C689530k;
import p000X.C708337w;
import p000X.C708437x;
import p000X.C708537y;
import p000X.C708738a;
import p000X.C709138e;
import p000X.C709838l;
import p000X.C710038o;
import p000X.C710138p;
import p000X.C710538t;
import p000X.C710938x;
import p000X.C711138z;
import p000X.C711339b;
import p000X.C711439c;
import p000X.C711539d;
import p000X.C711739g;
import p000X.C712339n;
import p000X.C713039x;
import p000X.C713139y;
import p000X.C71343Ad;
import p000X.C71493Ay;
import p000X.C71683Bs;
import p000X.C71873Cm;
import p000X.C72793Ha;
import p000X.C72803Hb;
import p000X.C72813Hc;
import p000X.C72843Hg;
import p000X.C72853Hh;
import p000X.C72863Hi;
import p000X.C72873Hj;
import p000X.C73013Ia;
import p000X.C73033Ic;
import p000X.C73043Id;
import p000X.C92673zX;
import p000X.C96174Ec;
import p000X.CYX;

public class UserDetailFragment extends C27341Hl implements C29081On, C30541Ug, AnonymousClass1HK, AnonymousClass1HL, C63522pc, AbsListView.OnScrollListener, C31131Wo, AnonymousClass1HM, AnonymousClass0RC, C27451Hx, C30521Ue, C63532pd, C63542pe, C27381Hp, C27401Hr, C63552pf, C52912Qs, C27021Ge, C51352Ki, C63562pg, C63572ph, AnonymousClass2Z2, C52922Qt {
    public static final Class A1t = UserDetailFragment.class;
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public AnonymousClass1L8 A05;
    public AnonymousClass38D A06;
    public C708537y A07;
    public AnonymousClass38C A08;
    public AnonymousClass1US A09;
    public AnonymousClass0QT A0A;
    public C27661Is A0B;
    public C35041fi A0C;
    public C29631Qq A0D;
    public C28341Li A0E;
    public AnonymousClass1NJ A0F;
    public CYX A0G;
    public C56202c6 A0H;
    public C56202c6 A0I;
    public C56202c6 A0J;
    public C56202c6 A0K;
    public AnonymousClass38X A0L;
    public Reel A0M;
    public Reel A0N;
    public Reel A0O;
    public AnonymousClass39I A0P;
    public C708738a A0Q;
    public AnonymousClass384 A0R;
    public AnonymousClass38F A0S = null;
    public C72793Ha A0T;
    public C72803Hb A0U;
    public AnonymousClass39X A0V;
    public AnonymousClass39B A0W;
    public C132155kq A0X;
    public C708337w A0Y;
    public AnonymousClass5T1 A0Z;
    public UserDetailDelegate A0a;
    public AnonymousClass392 A0b;
    public UserDetailTabController A0c;
    public C708437x A0d;
    public C62902oZ A0e;
    public C711339b A0f;
    public AutoLaunchReelParams A0g;
    public UserDetailLaunchConfig A0h;
    public AnonymousClass397 A0i;
    public AnonymousClass1OC A0j;
    public AnonymousClass1NR A0k;
    public C28971Oc A0l;
    public AnonymousClass38Y A0m;
    public AnonymousClass0C1 A0n;
    public AnonymousClass1KT A0o;
    public AnonymousClass38W A0p;
    public SourceModelInfoParams A0q;
    public C13300iJ A0r;
    public Integer A0s;
    public String A0t;
    public boolean A0u = false;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public int A1A;
    public View A1B;
    public View A1C;
    public ViewStub A1D;
    public AnonymousClass1CH A1E;
    public AnonymousClass1I2 A1F;
    public C29551Qi A1G;
    public C52002Na A1H;
    public C52932Qu A1I;
    public AnonymousClass380 A1J;
    public AnonymousClass1WN A1K;
    public String A1L;
    public String A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public final Handler A1T = new Handler(Looper.getMainLooper());
    public final C27691Iv A1U = C27691Iv.A00();
    public final C63592pj A1V = new C63592pj();
    public final C63602pk A1W = new C63602pk();
    public final C63612pl A1X = new C63612pl(this);
    public final C11200ea A1Y = new C63692pt(this);
    public final C11200ea A1Z = new C63762q0(this);
    public final C11200ea A1a = new C63622pm(this);
    public final C11200ea A1b = new C63632pn(this);
    public final C11200ea A1c = new C63752pz(this);
    public final C11200ea A1d = new C63642po(this);
    public final C11200ea A1e = new C63712pv(this);
    public final C11200ea A1f = new C63732px(this);
    public final C11200ea A1g = new C63702pu(this);
    public final C11200ea A1h = new C63772q1(this);
    public final C11200ea A1i = new C63782q2(this);
    public final C11200ea A1j = new C63722pw(this);
    public final C11200ea A1k = new C63742py(this);
    public final C11200ea A1l = new C63662pq(this);
    public final C11200ea A1m = new C63672pr(this);
    public final C11200ea A1n = new C63682ps(this);
    public final C11200ea A1o = new C63652pp(this);
    public final C28051Kf A1p = C28051Kf.A00();
    public final AnonymousClass2NR A1q = new AnonymousClass2NR();
    public final AnonymousClass1I1 A1r = new AnonymousClass1I1();
    public final AnonymousClass1I1 A1s = new AnonymousClass1I1();
    public Dialog mFBPageControlDialog;
    public Dialog mRemoveFollowerDialog;
    public Dialog mTopAccountInsightsDialog;
    public Dialog mWelcomeToBusinessDialog;

    public static void A0B(UserDetailFragment userDetailFragment, Context context) {
        userDetailFragment.A18 = false;
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        r2.A0U(true);
        r2.A0V(true);
        r2.A07(C0003R.string.import_facebook_page_post_success_dialog_title);
        r2.A06(C0003R.string.import_facebook_page_post_success_dialog_subtitle);
        r2.A0A(C0003R.string.f118ok, new C109114mx(userDetailFragment));
        r2.A03().show();
    }

    public C31121Wn A0G() {
        return null;
    }

    public boolean A0Q() {
        return false;
    }

    public final boolean AbR() {
        return false;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void Ar4(int i, int i2) {
    }

    public final void Ar5(int i, int i2) {
    }

    public final void ArX() {
    }

    public final void Ay9() {
    }

    public final void B3c() {
    }

    public final void BBL(AnonymousClass2FD r1) {
    }

    public final void BBN(AnonymousClass2FD r4) {
        r4.A08 = true;
        if (C1412562b.A01(r4)) {
            this.A1Q = true;
        }
        AnonymousClass2FF.A01(this.A0n, r4, Constants.ZERO, Constants.A0j);
    }

    public final void BLK(float f, int i) {
    }

    public final void BLW() {
    }

    public final void BPC() {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static C71343Ad A00(UserDetailFragment userDetailFragment) {
        C71343Ad r1;
        ArrayList arrayList = new ArrayList();
        Reel reel = userDetailFragment.A0M;
        if (reel == null || reel.A0C.A08.A00()) {
            Reel reel2 = userDetailFragment.A0O;
            if (reel2 != null) {
                arrayList.add(reel2);
            }
            Reel reel3 = userDetailFragment.A0N;
            if (reel3 != null) {
                arrayList.add(reel3);
            }
        } else {
            arrayList.add(reel);
        }
        if (!arrayList.isEmpty()) {
            r1 = new C71343Ad(arrayList);
        } else {
            r1 = null;
        }
        C709138e r0 = userDetailFragment.A0c.A0E;
        r0.A0A = r1;
        C709138e.A00(r0);
        return r1;
    }

    private void A02() {
        UserDetailTabController userDetailTabController;
        boolean z;
        C13300iJ r1;
        boolean z2;
        if (!this.A1S || (r1 = this.A0r) == null || !r1.A0m()) {
            userDetailTabController = this.A0c;
            z = false;
        } else {
            if (r1.AZn() == null) {
                AnonymousClass0QD.A01("UserDetailFragment", "A user has null username, causing NPE when calling \nmDisplayedUser.getUsername().length() in text.setSpan()");
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                UserDetailTabController userDetailTabController2 = this.A0c;
                String AZn = this.A0r.AZn();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getContext().getString(C0003R.string.x_wants_to_follow_you, new Object[]{AZn}));
                AnonymousClass4XV.A02(AZn, spannableStringBuilder, new AnonymousClass4UW(C019000b.A00(getContext(), C0003R.color.igds_primary_text)));
                C709138e r0 = userDetailTabController2.A0E;
                r0.A0G = spannableStringBuilder;
                C709138e.A00(r0);
                userDetailTabController = this.A0c;
                z = true;
            } else {
                return;
            }
        }
        C709138e r02 = userDetailTabController.A0E;
        r02.A0J = z;
        C709138e.A00(r02);
    }

    private void A03() {
        C44841wq r1;
        C13300iJ r0 = this.A0r;
        if (r0 != null && (r1 = r0.A06) != null && r1 != C44841wq.NONE) {
            this.A0j.BSr(EnumSet.of(Trigger.PROFILE_OTHER_CHECKOUT_TOOLTIP), A01());
        }
    }

    private void A04(Context context) {
        C05760Lv.A01.A00.edit().putBoolean("has_seen_top_account_insights_dialog", true).apply();
        String A0E2 = AnonymousClass000.A0E("@", this.A0r.AZn());
        AnonymousClass2OA r4 = new AnonymousClass2OA(context);
        r4.A03 = getResources().getString(C0003R.string.top_account_alert_dialog_title, new Object[]{A0E2});
        r4.A06(C0003R.string.top_account_alert_dialog_message);
        r4.A0A(C0003R.string.get_started, new AnonymousClass4MQ(this));
        r4.A08(C0003R.string.close, new AnonymousClass6C0(this));
        r4.A0U(true);
        r4.A0V(true);
        Dialog A032 = r4.A03();
        this.mTopAccountInsightsDialog = A032;
        A032.show();
    }

    private void A05(Context context, C13300iJ r11) {
        String str;
        String str2;
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        if (!r11.A0X()) {
            str = null;
        } else {
            str = r11.A0K.A01;
        }
        r2.A03 = str;
        if (!r11.A0X()) {
            str2 = null;
        } else {
            str2 = r11.A0K.A00;
        }
        r2.A0M(str2);
        r2.A08(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
        r2.A0U(true);
        r2.A0V(true);
        Dialog A032 = r2.A03();
        this.mFBPageControlDialog = A032;
        A032.show();
        AnonymousClass0C1 r6 = this.A0n;
        String A012 = C14100jl.A01(r6);
        C06270Ok A002 = C06270Ok.A00();
        A002.A07("order", 0);
        AnonymousClass0P4 A003 = C53882Us.A00(Constants.A15);
        A003.A0G("entry_point", "profile_view");
        A003.A0G("step", "landing_page");
        A003.A0G("fb_user_id", A012);
        A003.A0G("component", "page_control_notice");
        A003.A08("selected_values", A002);
        AnonymousClass0WN.A01(r6).BcG(A003);
        C15890nh r22 = new C15890nh(this.A0n);
        r22.A09 = Constants.ONE;
        r22.A0C = "users/set_has_seen_notice/";
        r22.A06(C64372rN.class, false);
        r22.A0G = true;
        r22.A09("has_seen_fb_page_control_notice", "true");
        schedule(r22.A03());
        this.A1N = true;
    }

    private void A06(AbsListView absListView, int i, int i2, int i3) {
        Integer num;
        this.A1s.onScroll(absListView, i, i2, i3);
        AnonymousClass382 A062 = this.A0c.A06();
        if (A062 != null) {
            num = A062.A01;
        } else {
            num = null;
        }
        if (num == Constants.ZERO) {
            this.A1r.onScroll(absListView, i, i2, i3);
        }
    }

    public static void A0A(UserDetailFragment userDetailFragment, int i) {
        ViewGroup viewGroup = userDetailFragment.A04;
        if (viewGroup != null && viewGroup.findViewById(C0003R.C0005id.profile_tombstone) == null) {
            userDetailFragment.A04.addView(userDetailFragment.A03);
            ((TextView) userDetailFragment.A03.findViewById(C0003R.C0005id.tombstone_block_after_report)).setText(userDetailFragment.getString(C0003R.string.tombstone_reported_profile_is_blocked, userDetailFragment.A0r.AZn()));
            TextView textView = (TextView) userDetailFragment.A03.findViewById(C0003R.C0005id.tombstone_feedback_text);
            if (i != 1) {
                textView.setText(C0003R.string.tombstone_report_feedback);
            } else {
                textView.setText(C0003R.string.tombstone_report_spam_feedback);
            }
            userDetailFragment.A03.setVisibility(0);
            userDetailFragment.A03.bringToFront();
            userDetailFragment.A04.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        if (((p000X.C72843Hg) r2.A00.get(r1)).A02 != null) goto L_0x0096;
     */
    public static void A0C(UserDetailFragment userDetailFragment, boolean z) {
        String str;
        boolean z2;
        C15890nh r3 = new C15890nh(userDetailFragment.A0n);
        Integer num = Constants.A0N;
        r3.A09 = num;
        r3.A06(C64372rN.class, false);
        String A0H2 = userDetailFragment.A0H();
        if (A0H2 != null) {
            r3.A0C = "users/{user_id}/info/";
            r3.A0B = "users/{user_id}/info/";
            str = MemoryDumpUploadJob.EXTRA_USER_ID;
        } else {
            r3.A0C = "users/{user_name}/usernameinfo/";
            r3.A0B = "users/{user_name}/usernameinfo/";
            A0H2 = userDetailFragment.A0h.A0E;
            str = "user_name";
        }
        r3.A09(str, A0H2);
        r3.A09("from_module", userDetailFragment.A1L);
        r3.A08 = num;
        boolean A0Q2 = userDetailFragment.A0Q();
        if (A0Q2 && Boolean.FALSE.equals(Boolean.valueOf(C06100Nt.A01(userDetailFragment.getContext())))) {
            r3.A09("push_disabled", "true");
        }
        C17850qu A032 = r3.A03();
        A032.A00 = new AnonymousClass39N(userDetailFragment, z, (AnonymousClass12K) userDetailFragment.A0n.AV9(AnonymousClass12K.class));
        userDetailFragment.schedule(A032);
        if (A0Q2) {
            C72813Hc A012 = C72813Hc.A01(userDetailFragment.A0n);
            String A042 = userDetailFragment.A0n.A04();
            if (A012.A00.containsKey(A042) && ((C72843Hg) A012.A00.get(A042)).A05) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                Context context = userDetailFragment.getContext();
                AnonymousClass0C1 r2 = userDetailFragment.A0n;
                C15890nh r32 = new C15890nh(r2);
                r32.A09 = Constants.ONE;
                r32.A0C = "accounts/fetch_onetap/";
                r32.A09("device_id", C05860Mt.A00(context));
                r32.A09("guid", C05860Mt.A02.A05(context));
                r32.A0A("phone_id", AnonymousClass0OZ.A00(r2).AZO());
                r32.A06(C125355Zc.class, false);
                r32.A0G = true;
                C17850qu A033 = r32.A03();
                A033.A00 = new C125365Zd(r2, userDetailFragment);
                C12810hQ.A02(A033);
            }
        }
        A08(userDetailFragment);
        if (A0Q2 && C71493Ay.A01(userDetailFragment.A0r, userDetailFragment.A0n)) {
            AnonymousClass0C1 r4 = userDetailFragment.A0n;
            C109094mv r33 = new C109094mv(userDetailFragment);
            C15890nh r22 = new C15890nh(r4);
            r22.A09 = Constants.ONE;
            r22.A0C = "business/instant_experience/get_should_badge_comm_hub_entry_point/";
            r22.A06(AnonymousClass4YN.class, false);
            AnonymousClass59K.A00(r22, r4);
            C17850qu A034 = r22.A03();
            A034.A00 = r33;
            userDetailFragment.schedule(A034);
        }
    }

    private boolean A0D() {
        String str;
        String str2;
        AnonymousClass1UP A002 = C37201jH.A00(this.A0F, this.A01, getContext());
        if (A002 == null || A002.A00 != AnonymousClass1UR.AD_DESTINATION_PROFILE_VISIT || (str = A002.A09) == null) {
            return false;
        }
        C13300iJ r0 = this.A0r;
        if (r0 != null) {
            str2 = r0.getId();
        } else {
            str2 = this.A0h.A0D;
            if (str2 == null) {
                return false;
            }
        }
        return str2.equals(str);
    }

    private boolean A0E(AnonymousClass382 r6) {
        if (r6.A01 != Constants.ONE || !((Boolean) AnonymousClass0L6.A02(this.A0n, AnonymousClass0L7.PROFILE_LAZY_LOAD_CAROUSEL_MEDIA, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final String A0H() {
        C13300iJ r0 = this.A0r;
        if (r0 != null) {
            return r0.getId();
        }
        return this.A0h.A0D;
    }

    public final String A0I() {
        C13300iJ r0 = this.A0r;
        if (r0 != null) {
            return r0.AZn();
        }
        return this.A0h.A0E;
    }

    public final void A0J() {
        View findViewById;
        int i;
        if (this.A1C == null) {
            this.A1C = this.A1D.inflate();
        }
        Context context = getContext();
        View view = this.A1C;
        C13300iJ r0 = this.A0r;
        ImageUrl ASv = r0.ASv();
        C106954jM r4 = r0.A0D;
        UserDetailDelegate userDetailDelegate = this.A0a;
        if (r4.A00 == Constants.ZERO) {
            IgImageView igImageView = (IgImageView) view.findViewById(C0003R.C0005id.blocked_profile_header_imageview);
            if (ASv != null) {
                igImageView.setUrl(ASv);
            } else {
                igImageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.profile_anonymous_user));
            }
            ((TextView) view.findViewById(C0003R.C0005id.restricted_account_title)).setText(r4.A02);
            ((TextView) view.findViewById(C0003R.C0005id.restricted_account_subtitle)).setText(r4.A01);
            TextView textView = (TextView) view.findViewById(C0003R.C0005id.left_button);
            textView.setText((CharSequence) r4.A03.get(0));
            textView.setOnClickListener(new C106924jJ(userDetailDelegate));
            TextView textView2 = (TextView) view.findViewById(C0003R.C0005id.right_button);
            textView2.setText((CharSequence) r4.A03.get(1));
            textView2.setOnClickListener(new C106984jP(userDetailDelegate));
            findViewById = view.findViewById(C0003R.C0005id.divider_line);
            i = 0;
        } else {
            IgImageView igImageView2 = (IgImageView) view.findViewById(C0003R.C0005id.blocked_profile_header_imageview);
            if (ASv != null) {
                igImageView2.setUrl(ASv);
            } else {
                igImageView2.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.profile_anonymous_user));
            }
            ((TextView) view.findViewById(C0003R.C0005id.restricted_account_title)).setText(r4.A02);
            ((TextView) view.findViewById(C0003R.C0005id.restricted_account_subtitle)).setText(r4.A01);
            findViewById = view.findViewById(C0003R.C0005id.divider_line);
            i = 8;
        }
        findViewById.setVisibility(i);
        view.findViewById(C0003R.C0005id.button_container).setVisibility(i);
        this.A0c.A09();
    }

    public final void A0K() {
        View view = this.A1C;
        if (view != null) {
            view.setVisibility(8);
        }
        this.A0c.A0B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r1 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1 == false) goto L_0x001c;
     */
    public final void A0L() {
        boolean z;
        boolean z2;
        C63592pj r2;
        List A002;
        List list;
        this.A1V.A00.clear();
        C13300iJ r22 = this.A0r;
        if (r22 != null) {
            if (!A0Q()) {
                Boolean bool = r22.A0t;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z2 = true;
                }
                z2 = false;
                if (!z2 || (list = r22.A2s) == null || list.isEmpty()) {
                    r2 = this.A1V;
                    A002 = AnonymousClass39H.A00(this.A0n, this.A0r);
                } else {
                    C63592pj r23 = this.A1V;
                    r23.A00.add(new C28538CiX(this.A0r));
                    r2 = this.A1V;
                    A002 = this.A0r.A2s;
                }
                r2.A00.addAll(A002);
            }
            Boolean bool2 = this.A0r.A0T;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                z = true;
            }
            z = false;
            if (z && (!this.A1V.A00.isEmpty())) {
                this.A0c.A0D(AnonymousClass2KM.Open);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r0.A06() == p000X.AnonymousClass382.A06) goto L_0x0013;
     */
    public final void A0M(AnonymousClass382 r9) {
        boolean z;
        if (r9 != null) {
            AnonymousClass384 r3 = this.A0R;
            AnonymousClass383 r2 = r9.A00;
            UserDetailTabController userDetailTabController = this.A0c;
            if (userDetailTabController != null) {
                z = false;
            }
            z = true;
            ((AnonymousClass387) r3.A00.get(r2)).A00(false, false, z, A0H(), A0I(), A0E(r9));
        }
    }

    public final void A0N(String str) {
        C132155kq r1;
        String str2;
        C132155kq r2;
        if (this.A0X == null && (((str2 = this.A0t) != null || A0F(this)) && str.equals(str2))) {
            C708337w r5 = this.A0Y;
            AnonymousClass0C1 r7 = this.A0n;
            C13300iJ r3 = this.A0r;
            if (r3 != null) {
                r2 = new C132155kq();
                String id = r3.getId();
                C15890nh r4 = new C15890nh(r7);
                r4.A09 = Constants.A0N;
                r4.A0E("friendships/unfollow_chaining_count/%s/", id);
                r4.A06(AnonymousClass4WW.class, false);
                C17850qu A032 = r4.A03();
                A032.A00 = new C132145kp(r5, r2, r7, r3);
                AnonymousClass3C0.A05(r7, r5.A01, "unfollow_chaining_count_prefetch", AnonymousClass3C6.A00(r7, r3), r3.getId(), new String[0]);
                C12810hQ.A02(A032);
            } else {
                r2 = null;
            }
            this.A0X = r2;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE) && (r1 = this.A0X) != null) {
            r1.A01(this.A1X);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    public final void A0O(boolean z) {
        UserDetailLaunchConfig userDetailLaunchConfig;
        AnonymousClass0P4 r2;
        String str;
        this.A0c.A0F(this.A0r);
        this.A0S = AnonymousClass38F.A00(this.A0r);
        boolean A0Q2 = A0Q();
        if (A0Q2 && C36981iv.A07(this.A0n.A06) && isResumed()) {
            A04(getContext());
        }
        boolean z2 = false;
        if (this.A1Q && !this.A0r.A0t() && this.A1P) {
            this.A0c.A0E((AnonymousClass2FD) null);
            this.A1Q = false;
        }
        C13300iJ r22 = this.A0r;
        if (r22.A0t() != this.A1P) {
            z2 = true;
        }
        boolean z3 = z | z2;
        if (isResumed() && z3) {
            this.A1P = r22.A0t();
            BaseFragmentActivity.A00(AnonymousClass1EW.A03(getActivity()));
            A03();
        }
        if (A0Q2 && this.A0r.A0X() && !this.A1N) {
            A05(getContext(), this.A0r);
        }
        A02();
        C13300iJ r9 = this.A0r;
        if (this.A14 && r9 != null) {
            this.A14 = false;
            C22160xw r5 = C22160xw.A00;
            ViewStub viewStub = (ViewStub) this.A04.findViewById(C0003R.C0005id.nametag_result_card_stub);
            if (viewStub != null) {
                viewStub.inflate();
                ViewStub viewStub2 = (ViewStub) this.A04.findViewById(C0003R.C0005id.nametag_result_view_stub);
                if (!(r5 == null || viewStub2 == null)) {
                    AnonymousClass38D r10 = this.A06;
                    AnonymousClass0C1 r3 = this.A0n;
                    if (C14090jk.A05(r3, r9)) {
                        r2 = r10.A04("ig_follow_url_nametag_self_nametag_scanned");
                    } else {
                        r2 = null;
                        C13390iS r1 = r9.A0M;
                        if (r1 == C13390iS.FollowStatusFollowing) {
                            str = "ig_follow_url_nametag_already_following";
                        } else {
                            if (r1 == C13390iS.FollowStatusRequested) {
                                str = "ig_follow_url_nametag_already_requested_to_follow";
                            }
                            if (r2 != null) {
                                r2.A0G("target_username", r9.AZn());
                                r2.A0G("target_userid", r9.getId());
                            }
                            String AZn = r9.AZn();
                            String id = r9.getId();
                            AnonymousClass0P4 A042 = r10.A04("ig_follow_url_nametag_card_impression");
                            A042.A0G("target_username", AZn);
                            A042.A0G("target_userid", id);
                            AnonymousClass0WN.A01(r10.A00).BcG(A042);
                            r5.A01(getActivity(), (ViewGroup) this.A04.findViewById(C0003R.C0005id.nametag_outer_container), this.A0n, r9, r10, true, getModuleName());
                        }
                        r2 = r10.A04(str);
                        if (r2 != null) {
                        }
                        String AZn2 = r9.AZn();
                        String id2 = r9.getId();
                        AnonymousClass0P4 A0422 = r10.A04("ig_follow_url_nametag_card_impression");
                        A0422.A0G("target_username", AZn2);
                        A0422.A0G("target_userid", id2);
                        AnonymousClass0WN.A01(r10.A00).BcG(A0422);
                        r5.A01(getActivity(), (ViewGroup) this.A04.findViewById(C0003R.C0005id.nametag_outer_container), this.A0n, r9, r10, true, getModuleName());
                    }
                    AnonymousClass0WN.A01(r3).BcG(r2);
                    String AZn22 = r9.AZn();
                    String id22 = r9.getId();
                    AnonymousClass0P4 A04222 = r10.A04("ig_follow_url_nametag_card_impression");
                    A04222.A0G("target_username", AZn22);
                    A04222.A0G("target_userid", id22);
                    AnonymousClass0WN.A01(r10.A00).BcG(A04222);
                    r5.A01(getActivity(), (ViewGroup) this.A04.findViewById(C0003R.C0005id.nametag_outer_container), this.A0n, r9, r10, true, getModuleName());
                }
            }
        }
        C19000sl r23 = C19000sl.A00;
        C13300iJ r12 = this.A0r;
        if (!(r12 == null || (userDetailLaunchConfig = this.A0h) == null || !userDetailLaunchConfig.A0N || this.A10 || r23 == null)) {
            this.A10 = true;
            r23.A0A(this.A0n, r12);
        }
        A08(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r0.A06() == p000X.AnonymousClass382.A06) goto L_0x0048;
     */
    public final void A0P(boolean z, AnonymousClass382 r10) {
        boolean z2;
        if (r10 != null) {
            AnonymousClass384 r0 = this.A0R;
            if (!((AnonymousClass387) r0.A00.get(r10.A00)).A02()) {
                C62912oa r02 = (C62912oa) this.A0e.A00.get(18284548);
                if (r02 != null) {
                    AnonymousClass00B.A01.markerPoint(r02.A00, "DATA_LOAD_START");
                }
                this.A0d.A00.A03();
                AnonymousClass384 r3 = this.A0R;
                AnonymousClass383 r2 = r10.A00;
                UserDetailTabController userDetailTabController = this.A0c;
                if (userDetailTabController != null) {
                    z2 = false;
                }
                z2 = true;
                ((AnonymousClass387) r3.A00.get(r2)).A00(true, z, z2, A0H(), A0I(), A0E(r10));
            }
        }
    }

    public final boolean A0R() {
        return AnonymousClass17M.A00(this.A0n.A06, this.A0r);
    }

    public final boolean A0S(AnonymousClass382 r3) {
        if (r3 != null) {
            AnonymousClass384 r0 = this.A0R;
            if (!((AnonymousClass387) r0.A00.get(r3.A00)).A00.A03()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        if (((p000X.AnonymousClass387) r0.A00.get(r3.A00)).A02() == false) goto L_0x0014;
     */
    public final boolean A0T(AnonymousClass382 r3) {
        if (r3 != null) {
            AnonymousClass384 r0 = this.A0R;
        }
        if (this.A0x) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e A[SYNTHETIC] */
    public final /* bridge */ /* synthetic */ boolean A2J(Object obj) {
        boolean z;
        C38031kc r0;
        for (Reel reel : ((C35241g2) obj).A01) {
            if (AnonymousClass17M.A00(reel.A0M.AZf(), this.A0r)) {
                return true;
            }
            C13300iJ r1 = this.A0r;
            if (!(!reel.A0W() || (r0 = reel.A0C) == null || r1 == null)) {
                boolean contains = r0.A04().contains(r1);
                z = true;
                if (contains) {
                    continue;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            continue;
            if (z) {
            }
        }
        return false;
    }

    public final void A36(AnonymousClass0P4 r3) {
        r3.A0G("grid_index", String.valueOf(this.A1A));
        r3.A0G("media_id", this.A1M);
    }

    public final void AE3(boolean z) {
        C13300iJ r1 = this.A0r;
        if (r1 != null) {
            this.A0c.A0F(r1);
            A0P(z, this.A0c.A06());
            A07(this);
            this.A0r.A0D = null;
        }
        A0C(this, z);
        C72793Ha r3 = this.A0T;
        if (r3 != null && r3.A06) {
            C15890nh r2 = new C15890nh(r3.A05);
            r2.A09 = Constants.ONE;
            r2.A0C = "archive/reel/profile_archive_badge/";
            r2.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
            r2.A06(C72853Hh.class, false);
            C17850qu A032 = r2.A03();
            A032.A00 = new C72863Hi(r3);
            r3.A04.schedule(A032);
        }
        if (this.A0U != null) {
            if (!((Boolean) C05570Lc.A02(C72873Hj.A00(), this.A0n)).booleanValue()) {
                AnonymousClass0C1 r12 = this.A0n;
                if (!r12.A06.AeV() || !((Boolean) C05570Lc.A02(AnonymousClass41W.A00(), r12)).booleanValue()) {
                    return;
                }
            }
            this.A0U.A05();
        }
    }

    public final AnonymousClass392 AJt() {
        return this.A0b;
    }

    public final boolean Abq() {
        AnonymousClass382 A062 = this.A0c.A06();
        if (A062 != null) {
            UserDetailTabController userDetailTabController = this.A0c;
            if (!C710938x.A00(userDetailTabController.A0F, A062.A00).A02.A0G()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean Abs() {
        return A0S(this.A0c.A06());
    }

    public final boolean AfR() {
        AnonymousClass382 A062 = this.A0c.A06();
        if (A062 != null) {
            AnonymousClass384 r0 = this.A0R;
            if (!((AnonymousClass387) r0.A00.get(A062.A00)).A01()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean AgJ() {
        AnonymousClass382 A062 = this.A0c.A06();
        if (this.A0r == null || A062 == null) {
            return false;
        }
        if (A0T(A062)) {
            UserDetailTabController userDetailTabController = this.A0c;
            if (C710938x.A00(userDetailTabController.A0F, A062.A00).A02.A03() != 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean AgL() {
        return A0T(this.A0c.A06());
    }

    public final boolean AhU() {
        UserDetailTabController userDetailTabController = this.A0c;
        if (userDetailTabController != null) {
            boolean z = true;
            if (userDetailTabController.A01 != 1) {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Aix() {
        A0M(this.A0c.A06());
    }

    public final void Anj(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0d.A04();
        this.A0a.Anj(str, str2, str3, str4, str5, str6);
    }

    public final void AtF() {
        C52362Om r2 = new C52362Om(getActivity(), this.A0n);
        C18980sj.A00.A00();
        r2.A02 = new C121495It();
        r2.A02();
    }

    public final void B63(AnonymousClass1NJ r22, int i) {
        AnonymousClass382 A062;
        String str;
        String str2;
        int i2;
        ArrayList arrayList;
        String str3;
        if (isResumed() && (A062 = this.A0c.A06()) != null) {
            UserDetailDelegate userDetailDelegate = this.A0a;
            int[] iArr = C689530k.A02;
            int ordinal = A062.ordinal();
            int i3 = iArr[ordinal];
            if (i3 == 1) {
                str = "tap_tagged_grid_post";
                str2 = "tagged_tab";
            } else if (i3 == 2) {
                str = "tap_grid_post";
                str2 = "grid_tab";
            } else {
                throw new IllegalStateException("Must log post click from tab " + A062);
            }
            AnonymousClass1NJ r1 = r22;
            C06270Ok BYO = userDetailDelegate.A0H.BYO(r1);
            AnonymousClass0C1 r10 = userDetailDelegate.A0K;
            UserDetailFragment userDetailFragment = userDetailDelegate.A0H;
            C13300iJ A072 = userDetailDelegate.A0I.A07();
            int i4 = AnonymousClass2NV.A01.A00;
            int i5 = i;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("instagram_thumbnail_click", userDetailFragment);
            AnonymousClass3C0.A02(A002, r1, A072, i / i4, i % i4);
            if (BYO != null) {
                A002.A04(BYO);
            }
            AnonymousClass0WN.A01(r10).BcG(A002);
            AnonymousClass3C0.A03(userDetailDelegate.A0K, userDetailDelegate.A0H, str, UserDetailDelegate.A01(userDetailDelegate), UserDetailDelegate.A02(userDetailDelegate), userDetailDelegate.A0M, userDetailDelegate.A0N, str2);
            this.A1M = r1.APo();
            this.A1A = i5;
            Bundle bundle = new Bundle();
            bundle.putString("shopping_session_id", this.A0h.A0B);
            this.A1q.A03(BYO(r1));
            C52362Om r6 = new C52362Om(getActivity(), this.A0n);
            C53722Ua A0S2 = AnonymousClass2UZ.A00().A0S();
            A0S2.A02 = "User_Feed";
            int i6 = C71683Bs.A00[ordinal];
            if (i6 == 1) {
                i2 = C0003R.string.posts_tab_title;
            } else if (i6 == 2) {
                i2 = C0003R.string.tagged_tab_title;
            } else {
                throw new IllegalArgumentException("Cannot get a Feed tab Title for Profile Tab Mode: " + A062);
            }
            A0S2.A03 = getString(i2);
            A0S2.A04 = r1.APo();
            UserDetailTabController userDetailTabController = this.A0c;
            AnonymousClass382 A063 = userDetailTabController.A06();
            if (A063 != null) {
                C711138z A003 = C710938x.A00(userDetailTabController.A0F, A063.A00);
                arrayList = new ArrayList();
                A003.A02.A09(A003.A03);
                for (AnonymousClass1NJ APo : A003.A02.A01) {
                    arrayList.add(APo.APo());
                }
            } else {
                arrayList = null;
            }
            A0S2.A08 = arrayList;
            if (A0Q()) {
                str3 = "feed_contextual_self_profile";
            } else {
                str3 = "feed_contextual_profile";
            }
            A0S2.A05 = str3;
            A0S2.A0D = true;
            AnonymousClass384 r0 = this.A0R;
            A0S2.A01 = new ContextualFeedNetworkConfig(((AnonymousClass387) r0.A00.get(A062.A00)).A00.A01, A0H(), A0I(), A062.A00.A00);
            A0S2.A00 = bundle;
            A0S2.A01(this.A1q);
            r6.A02 = A0S2.A00();
            r6.A0B = true;
            r6.A02();
        }
    }

    public final boolean B64(View view, MotionEvent motionEvent, AnonymousClass1NJ r4, int i) {
        return this.A1H.BS6(view, motionEvent, r4, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0196, code lost:
        r3.A02();
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01ac, code lost:
        p000X.AnonymousClass4X8.A00(r11.A0n, r11.A0r, "megaphone", new p000X.C105654hD(r11, r3), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0225, code lost:
        r11.A0c.A0E((p000X.AnonymousClass2FD) null);
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x024b, code lost:
        r2.A02();
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0259, code lost:
        if (r4.equals("promote_merged_media_learn_more") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0265, code lost:
        if (r4.equals("open_besties_list") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0271, code lost:
        if (r4.equals("get_started") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x027c, code lost:
        if (r4.equals("add_link") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0288, code lost:
        if (r4.equals("not_seller") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0293, code lost:
        if (r4.equals("enroll_two_factor") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x029f, code lost:
        if (r4.equals("connect_contacts") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02ab, code lost:
        if (r4.equals("invite_fb_friends") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b8, code lost:
        if (r4.equals("report_spam") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02c5, code lost:
        if (r4.equals("reset_password_link") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02d2, code lost:
        if (r4.equals("reset_password_page") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02dd, code lost:
        if (r4.equals("change_email") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02e8, code lost:
        if (r4.equals("change_phone") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02f4, code lost:
        if (r4.equals("send_confirm_email") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02ff, code lost:
        if (r4.equals("confirm_phone") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x030c, code lost:
        if (r4.equals("turn_on_sms") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0319, code lost:
        if (r4.equals("report_not_spam") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0324, code lost:
        if (r4.equals("learn_more") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0330, code lost:
        if (r4.equals("gmail_oauth_confirm_email") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x033d, code lost:
        if (r4.equals("turn_on_push") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0349, code lost:
        if (r4.equals("not_business") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0355, code lost:
        if (r4.equals("dismiss") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0360, code lost:
        if (r4.equals("create_biz_account") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x036c, code lost:
        if (r4.equals("branded_content_learn_more") == false) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    public final void BBK(AnonymousClass2FD r12, C27971CYh cYh) {
        boolean z;
        Integer num;
        char c;
        C52362Om r2;
        C52362Om r3;
        String str = cYh.A02;
        String str2 = str;
        boolean z2 = false;
        if (str != null) {
            this.A11 = true;
            switch (str.hashCode()) {
                case -2010246945:
                    c = 21;
                    break;
                case -1928544577:
                    c = 22;
                    break;
                case -1820671848:
                    c = 19;
                    break;
                case -1236063016:
                    c = 7;
                    break;
                case -1095606677:
                    c = 20;
                    break;
                case -832190501:
                    c = 4;
                    break;
                case -309952504:
                    c = 9;
                    break;
                case -284682232:
                    c = 10;
                    break;
                case -246580364:
                    c = 12;
                    break;
                case -9826258:
                    c = 14;
                    break;
                case -9715005:
                    c = 15;
                    break;
                case 237256269:
                    c = 0;
                    break;
                case 247279647:
                    c = 2;
                    break;
                case 448092390:
                    c = 1;
                    break;
                case 588281647:
                    c = 3;
                    break;
                case 729897211:
                    c = 18;
                    break;
                case 839600096:
                    c = 13;
                    break;
                case 972484720:
                    c = 5;
                    break;
                case 1008606868:
                    c = 16;
                    break;
                case 1151895480:
                    c = 8;
                    break;
                case 1339016108:
                    c = 11;
                    break;
                case 1671672458:
                    c = 17;
                    break;
                case 1753763902:
                    c = 6;
                    break;
                case 1961859695:
                    c = 23;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    C27341Hl A072 = C18980sj.A00.A00().A07(cYh.A00.A00, C115324xM.A00(Constants.A0C));
                    r3 = new C52362Om(getActivity(), this.A0n);
                    r3.A02 = A072;
                    break;
                case 1:
                    C17850qu A082 = C115574xn.A08(this.A0n, Constants.ONE, (String) null, C05860Mt.A00(getContext()), (String) null, (String) null, (List) null);
                    A082.A00 = new C115054wv(this);
                    schedule(A082);
                    z = true;
                    break;
                case 2:
                    Bundle bundle = new Bundle();
                    C114104vN.A00(bundle, C114104vN.ARGUMENT_EDIT_PROFILE_FLOW);
                    r2 = new C52362Om(getActivity(), this.A0n);
                    r2.A08(C15940nm.A02().A03().A07(this.A0n), bundle);
                    r2.A04 = "PhoneNumberEntryFragment.BACKSTATE_NAME";
                    break;
                case 3:
                    C17850qu A012 = C115574xn.A01(this.A0n, cYh.A00.A01);
                    A012.A00 = new C109134mz(this, cYh.A00.A01);
                    schedule(A012);
                    z = true;
                    break;
                case 4:
                    AnonymousClass1HD A013 = C16050nx.A00.A00().A01(false, false, C113054te.MEGAPHONE);
                    r3 = new C52362Om(getActivity(), this.A0n);
                    r3.A04 = "two_fac_start_state_name";
                    r3.A02 = A013;
                    break;
                case 5:
                    UserDetailDelegate userDetailDelegate = this.A0a;
                    C53882Us.A01();
                    Intent intent = new Intent(UserDetailDelegate.A00(userDetailDelegate), BusinessConversionActivity.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userDetailDelegate.A0K.getToken());
                    bundle2.putString("entry_point", "megaphone");
                    bundle2.putInt("intro_entry_position", 0);
                    bundle2.putInt("business_account_flow", C53892Uu.A00(Constants.ZERO));
                    intent.putExtras(bundle2);
                    AnonymousClass1BH.A0B(intent, 11, userDetailDelegate.A0H);
                    z = true;
                    break;
                case 6:
                    C53882Us.A01();
                    Intent intent2 = new Intent(getContext(), BusinessConversionActivity.class);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A0n.getToken());
                    bundle3.putString("entry_point", "megaphone");
                    bundle3.putInt("business_account_flow", C53892Uu.A00(Constants.ONE));
                    intent2.putExtras(bundle3);
                    AnonymousClass1BH.A0B(intent2, 12, this);
                    z = true;
                    break;
                case 7:
                    C16310oO.A00.A00();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("entry_point", "call_to_action_megaphone");
                    C1410060z r22 = new C1410060z();
                    r22.setArguments(bundle4);
                    r3 = new C52362Om(getActivity(), this.A0n);
                    r3.A02 = r22;
                    break;
                case 8:
                    C06100Nt.A00(getContext());
                    break;
                case 9:
                    C127735dY.A04(this.A0n, this, this);
                    break;
                case 10:
                    AnonymousClass0WN.A01(this.A0n).BcG(AnonymousClass0P4.A00("invite_megaphone_clicked", this));
                    if (!C1169750m.A01(getContext(), this.A0n)) {
                        this.A0o.A00(C126785c0.INVITE_FRIENDS);
                        break;
                    } else {
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("FacebookContactListFragment.REFERRING_SCREEN", C128665f4.A00(this.A0s));
                        C52362Om r23 = new C52362Om(getActivity(), this.A0n);
                        r23.A02 = AnonymousClass2UZ.A00().A0D(bundle5);
                        r23.A02();
                        break;
                    }
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                case 20:
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    z2 = true;
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    C17850qu A0B2 = C125085Xm.A0B(this.A0n);
                    A0B2.A00 = new AnonymousClass5PN(this);
                    schedule(A0B2);
                    break;
                case 15:
                    C52362Om r24 = new C52362Om(getActivity(), this.A0n);
                    r24.A02 = C15940nm.A02().A03().A08((String) null);
                    r24.A02();
                    break;
                case 16:
                    C143496Bw.A02(this.A0n, getContext(), cYh.A00.A00, "megaphone", true, this);
                    break;
                case 18:
                    schedule(C115574xn.A06(this.A0n));
                    break;
                case 19:
                    AnonymousClass0C1 r5 = this.A0n;
                    C52952Qw.A0C(r5, r5.A06, getModuleName(), "megaphone", getActivity(), true);
                    z = true;
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    AnonymousClass471.A00(getContext(), this.A0n);
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    this.A09.A00(AnonymousClass54G.MEGAPHONE);
                    break;
                case 23:
                    C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(this.A0n, "IgBrandedContentOnboardingApp");
                    newReactNativeLauncher.BlH(getString(C0003R.string.branded_content));
                    r2 = newReactNativeLauncher.BrT(getActivity());
                    break;
            }
        } else {
            Integer num2 = cYh.A01;
            if (num2 != Constants.ONE) {
                String str3 = cYh.A06;
                if (num2 == Constants.ZERO && !TextUtils.isEmpty(str3)) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)), (Bundle) null);
                    z = true;
                    if (z) {
                        if (cYh.A01 == Constants.ONE) {
                            this.A0c.A0E((AnonymousClass2FD) null);
                        }
                        String str4 = cYh.A02;
                        if (str4 != null) {
                            num = C140705zu.A00(str4);
                        } else {
                            Integer num3 = cYh.A01;
                            num = Constants.ONE;
                            if (num3 == num) {
                                num = Constants.A0C;
                            }
                        }
                        if (C1412562b.A01(r12)) {
                            C1412562b.A00(this.A0n, num, Constants.A0j, this.A0r, r12.A00.A00);
                            return;
                        } else {
                            AnonymousClass2FF.A01(this.A0n, r12, num, Constants.A0j);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        z = false;
        if (z) {
        }
    }

    public final void BBM(AnonymousClass2FD r8) {
        this.A0c.A0E((AnonymousClass2FD) null);
        if (C1412562b.A01(r8)) {
            AnonymousClass0C1 r6 = this.A0n;
            Integer num = Constants.A0j;
            String str = r8.A00.A00;
            Integer num2 = Constants.A0C;
            C115104x0 r3 = new C115104x0(r6, num2, this);
            C12830hS r1 = AnonymousClass2FF.A00;
            C17850qu A002 = AnonymousClass2FF.A00(r6, "business_conversion", num2, num, str);
            A002.A00 = r3;
            r1.schedule(A002);
            return;
        }
        AnonymousClass2FF.A01(this.A0n, r8, Constants.A0C, Constants.A0j);
    }

    public final void BCU() {
        this.A0a.Avr("activation_card_name");
    }

    public final Map BYU() {
        C13300iJ r1 = this.A0r;
        if (r1 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C689430j.A00(hashMap, r1);
        return hashMap;
    }

    public final void BZo(AbsListView.OnScrollListener onScrollListener) {
        this.A1s.A0B(onScrollListener);
    }

    public final void Bel() {
        if (this.mView != null) {
            UserDetailTabController userDetailTabController = this.A0c;
            if (((Boolean) AnonymousClass0L6.A02(userDetailTabController.A02, AnonymousClass0L7.LOW_RAM_ANIMATIONS, "remove_scroll_animations", false, (AnonymousClass04H) null)).booleanValue()) {
                userDetailTabController.mAppBarLayout.A02(true, false);
            } else {
                userDetailTabController.mAppBarLayout.A02(true, true);
            }
            userDetailTabController.mPullToRefresh.AD3();
            C710138p r4 = userDetailTabController.A0J;
            r4.A03.clear();
            for (AnonymousClass3BU r0 : r4.A04) {
                r0.BLL(false);
                r4.A03.add(r0.ASx());
            }
        }
    }

    public final void Bs9(AbsListView.OnScrollListener onScrollListener) {
        this.A1s.A0C(onScrollListener);
    }

    public void configureActionBar(AnonymousClass1EX r5) {
        AnonymousClass39X r0 = this.A0V;
        if (r0 == null) {
            String name = A1t.getName();
            StringBuilder sb = new StringBuilder("Has parent?: ");
            boolean z = false;
            if (this.mParentFragment == null) {
                z = true;
            }
            sb.append(z);
            sb.append("isResumed(): ");
            sb.append(isResumed());
            AnonymousClass0QD.A01(name, sb.toString());
            return;
        }
        r0.configureActionBar(r5);
        View view = this.A0V.A01;
        if (view != null) {
            this.A0k.A00(this.A0j, QPTooltipAnchor.MENU_ICON, view);
            if (view instanceof FadeInFollowButton) {
                UserDetailTabController userDetailTabController = this.A0c;
                FadeInFollowButton fadeInFollowButton = (FadeInFollowButton) view;
                userDetailTabController.mOverFlowFollowButton = fadeInFollowButton;
                fadeInFollowButton.A01();
                UserDetailTabController.A02(userDetailTabController, true);
            }
        }
        if (this.A0r != null) {
            ViewGroup AYU = r5.AYU();
            this.A1B = AYU;
            this.A0k.A00(this.A0j, QPTooltipAnchor.SWITCH_ACCOUNT, AYU);
        }
    }

    public final C06590Pq getSession() {
        return this.A0n;
    }

    public final boolean onBackPressed() {
        String str;
        AnonymousClass1NJ r0;
        C56202c6 r1 = this.A0K;
        if (r1 != null && r1.A07()) {
            r1.A06(false);
        }
        C56202c6 r12 = this.A0H;
        if (r12 != null && r12.A07()) {
            r12.A06(false);
        }
        C56202c6 r13 = this.A0J;
        if (r13 != null && r13.A07()) {
            r13.A06(false);
        }
        C56202c6 r14 = this.A0I;
        if (r14 != null && r14.A07()) {
            r14.A06(false);
        }
        if (isAdded() && !A0R() && C16170o9.A00()) {
            SourceModelInfoParams sourceModelInfoParams = this.A0q;
            if (sourceModelInfoParams == null || sourceModelInfoParams.A06 == null || (r0 = this.A0F) == null || !r0.Aho()) {
                C13300iJ r02 = this.A0r;
                if (r02 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("full_name", r02.AMN());
                    hashMap.put("username", this.A0r.AZn());
                    hashMap.put("viewed_profile_id", this.A0r.getId());
                    boolean AeV = this.A0r.AeV();
                    String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    String str3 = "0";
                    if (AeV) {
                        str3 = str2;
                    }
                    hashMap.put("is_business", str3);
                    if (!this.A0r.A0s()) {
                        str2 = "0";
                    }
                    hashMap.put("is_verified", str2);
                    if (this.A0r.A0M == C13390iS.FollowStatusFollowing) {
                        str = "follow";
                    } else {
                        str = "non-follow";
                    }
                    hashMap.put("follow_status", str);
                }
            } else {
                C16170o9.A00.A01(getActivity(), this.A0n, "176351389670594");
            }
        }
        return this.A1H.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r7v19, types: [android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0617, code lost:
        if (r1 != false) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0683, code lost:
        if (r1 != false) goto L_0x0685;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x071e, code lost:
        if (A0R() == false) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0847, code lost:
        if (p000X.C30671Ut.A0J(r0.A0n, r0.A0F) != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f2, code lost:
        if (r1 != null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01f9, code lost:
        if (r6.A0J == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03de, code lost:
        if (A0D() == false) goto L_0x03e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public void onCreate(Bundle bundle) {
        Integer num;
        AutoLaunchReelParams autoLaunchReelParams;
        String str;
        boolean z;
        QuickPromotionSlot quickPromotionSlot;
        boolean z2;
        List arrayList;
        boolean z3;
        C13300iJ r4;
        int A022 = AnonymousClass0Z0.A02(87233361);
        this.A0n = AnonymousClass0J1.A06(this.mArguments);
        Parcelable parcelable = this.mArguments.getParcelable("ProfileLaunchConstants.LAUNCH_CONFIG");
        AnonymousClass0a4.A06(parcelable);
        UserDetailLaunchConfig userDetailLaunchConfig = (UserDetailLaunchConfig) parcelable;
        this.A0h = userDetailLaunchConfig;
        this.A0Y = new C708337w();
        if (userDetailLaunchConfig.A0D != null) {
            this.A0r = C13510ie.A00(this.A0n).A02(this.A0h.A0D);
        } else if (userDetailLaunchConfig.A0E != null) {
            this.A0r = (C13300iJ) C13510ie.A00(this.A0n).A02.get(this.A0h.A0E);
        } else {
            throw new RuntimeException("User Detail Fragment started without user id or username");
        }
        if (A0F(this)) {
            this.A0t = (String) AnonymousClass0L6.A02(this.A0n, AnonymousClass0L7.UNFOLLOW_CHAINING_PREFETCHING_LAUNCHER, "prefetch_point", "profile", (AnonymousClass04H) null);
        }
        AnonymousClass00B r42 = AnonymousClass00B.A01;
        boolean A0Q2 = A0Q();
        UserDetailLaunchConfig userDetailLaunchConfig2 = this.A0h;
        C708437x r5 = new C708437x(r42, A0Q2, userDetailLaunchConfig2.A05, userDetailLaunchConfig2.A0C);
        this.A0d = r5;
        r5.A0F(getContext(), this, C26441Dh.A00(this.A0n));
        this.A05 = AnonymousClass1L8.A00(this);
        this.A0e = C62902oZ.A00();
        this.A07 = C708537y.A00(this.A0n);
        this.A0C = C35041fi.A00(this.A0n);
        this.A1J = new AnonymousClass380(this, this.A0n, this.A1p);
        ArrayList<AnonymousClass382> arrayList2 = new ArrayList<>();
        arrayList2.add(AnonymousClass382.FULL_AUDIENCE_MEDIA_GRID);
        arrayList2.add(AnonymousClass382.PHOTOS_OF_YOU_MEDIA_GRID);
        ArrayList arrayList3 = new ArrayList();
        for (AnonymousClass382 r1 : arrayList2) {
            arrayList3.add(r1.A00);
        }
        this.A0R = new AnonymousClass384(getContext(), this.A0n, this.A05, new AnonymousClass385(this), arrayList3);
        if (this.A0h.A0C == null && (r4 = this.A0r) != null && Constants.ZERO != r4.A1o && AnonymousClass388.A02(this.A0n, r4)) {
            A0P(false, AnonymousClass382.A04);
            this.A0v = true;
        }
        super.onCreate(bundle);
        for (C62912oa r12 : C62902oZ.A00().A00.values()) {
            AnonymousClass00B.A01.markerPoint(r12.A00, "FRAGMENT_ON_CREATE");
        }
        for (C62912oa r13 : C62902oZ.A00().A00.values()) {
            AnonymousClass00B.A01.markerAnnotate(r13.A00, "is_self", A0Q2);
        }
        this.A12 = AnonymousClass38B.A00(this.A0n, true);
        this.A08 = new AnonymousClass38C(this.A0n, this, UUID.randomUUID().toString());
        this.A06 = new AnonymousClass38D(this, this.A0n);
        AnonymousClass1D1 r2 = null;
        this.A0l = C17020pY.A00().A0G(this.A0n, this, (String) null);
        AnonymousClass0C1 r7 = this.A0n;
        this.A0A = AnonymousClass0QT.A00(r7, this);
        if (A0Q2) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        this.A0s = num;
        this.A0o = new AnonymousClass1KT(r7, this, this, new AnonymousClass1KU(this, num, r7));
        if (bundle == null) {
            autoLaunchReelParams = this.A0h.A01;
        } else {
            autoLaunchReelParams = null;
        }
        this.A0g = autoLaunchReelParams;
        UserDetailLaunchConfig userDetailLaunchConfig3 = this.A0h;
        this.A1S = userDetailLaunchConfig3.A0O;
        this.A1L = userDetailLaunchConfig3.A06;
        SourceModelInfoParams sourceModelInfoParams = userDetailLaunchConfig3.A03;
        this.A0q = sourceModelInfoParams;
        if (sourceModelInfoParams != null) {
            if (sourceModelInfoParams.A06 != null) {
                this.A0F = AnonymousClass1PZ.A00(this.A0n).A02(this.A0q.A06);
            }
            SourceModelInfoParams sourceModelInfoParams2 = this.A0q;
            if (sourceModelInfoParams2.A04 == null) {
                this.A01 = sourceModelInfoParams2.A00;
                this.A02 = sourceModelInfoParams2.A02;
            }
        }
        UserDetailLaunchConfig userDetailLaunchConfig4 = this.A0h;
        String str2 = userDetailLaunchConfig4.A07;
        String str3 = str2;
        if (str2 != null) {
            String str4 = userDetailLaunchConfig4.A08;
            str = str4;
        }
        str3 = null;
        str = null;
        if (A0Q2) {
            z = true;
        }
        z = false;
        this.A0y = z;
        boolean z4 = userDetailLaunchConfig4.A0L;
        this.A14 = z4;
        if (z4) {
            AnonymousClass38D r72 = this.A06;
            String A0I2 = A0I();
            AnonymousClass0P4 A042 = r72.A04("ig_profile_impression");
            A042.A0G("target_username", A0I2);
            AnonymousClass0WN.A01(r72.A00).BcG(A042);
        }
        this.A1O = ((Boolean) AnonymousClass0L6.A02(this.A0n, AnonymousClass0L7.APR_LAZY_BUILD_REQUEST_INFRA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        C13300iJ r43 = this.A0r;
        if (r43 != null) {
            this.A0S = AnonymousClass38F.A00(r43);
            r43.A1u = 0;
        }
        C29631Qq r6 = new C29631Qq(this.A0n, new AnonymousClass38G(this));
        this.A0D = r6;
        r6.A01();
        C23300zv A002 = C23300zv.A00(this.A0n);
        A002.A02(AnonymousClass38H.class, this.A1a);
        A002.A02(AnonymousClass38I.class, this.A1k);
        A002.A02(C32921c4.class, this.A1j);
        A002.A02(C31091Wk.class, this.A1g);
        A002.A02(AnonymousClass38J.class, this.A1d);
        A002.A02(AnonymousClass38K.class, this.A1c);
        A002.A02(AnonymousClass38L.class, this.A1Z);
        A002.A02(C33231ca.class, this.A1o);
        A002.A02(AnonymousClass38M.class, this.A1b);
        A002.A02(AnonymousClass38N.class, this.A1i);
        C11130eT.A01.A02(AnonymousClass1FF.class, this.A1f);
        this.A0E = new C28341Li(getContext(), this.A0n, this.A05);
        C17640qZ r8 = C17640qZ.A00;
        AnonymousClass0C1 r73 = this.A0n;
        HashMap hashMap = new HashMap();
        hashMap.put(QPTooltipAnchor.SWITCH_ACCOUNT, new AnonymousClass38O());
        hashMap.put(QPTooltipAnchor.SHOP, new AnonymousClass38P());
        hashMap.put(QPTooltipAnchor.MENU_ICON, new AnonymousClass38Q());
        hashMap.put(QPTooltipAnchor.REEL_ITEM, new AnonymousClass38R());
        hashMap.put(QPTooltipAnchor.PROFILE_BANNER, new AnonymousClass38S());
        AnonymousClass1NR A0B2 = r8.A0B(r73, hashMap);
        this.A0k = A0B2;
        if (A0Q2) {
            quickPromotionSlot = QuickPromotionSlot.PERSONAL_PROFILE;
        } else {
            quickPromotionSlot = QuickPromotionSlot.OTHER_PROFILE;
        }
        C17640qZ r82 = C17640qZ.A00;
        AnonymousClass0C1 r62 = this.A0n;
        AnonymousClass1NW A032 = r82.A03();
        A032.A03 = new AnonymousClass38T(this);
        A032.A04 = new AnonymousClass38U(this);
        A032.A06 = A0B2;
        A032.A05 = new AnonymousClass38V(this);
        this.A0j = r82.A09(this, this, r62, quickPromotionSlot, A032.A00());
        if (getRootActivity() instanceof AnonymousClass1D1) {
            r2 = (AnonymousClass1D1) getRootActivity();
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r44 = this.A0n;
        this.A09 = new AnonymousClass1US(activity, r44);
        this.A0p = new AnonymousClass38W();
        this.A0L = new AnonymousClass38X();
        this.A0m = new AnonymousClass38Y();
        AnonymousClass38Z r422 = new AnonymousClass38Z(getContext(), r44, A0Q2, false, true, this, AnonymousClass1OY.PROFILE_HIGHLIGHTS_TRAY);
        UserDetailLaunchConfig userDetailLaunchConfig5 = this.A0h;
        String str5 = userDetailLaunchConfig5.A0D;
        String str6 = userDetailLaunchConfig5.A05;
        String str7 = userDetailLaunchConfig5.A06;
        UserDetailEntryInfo userDetailEntryInfo = userDetailLaunchConfig5.A02;
        AnonymousClass0C1 r83 = this.A0n;
        C71873Cm r45 = new C71873Cm(this, r83);
        C256419q r14 = new C256419q(getActivity(), r83, this, 23592965);
        this.A0Q = new C708738a(this.A0d.A02);
        this.A1G = C29551Qi.A00(getContext(), this.A0n, this, false);
        SourceModelInfoParams sourceModelInfoParams3 = this.A0q;
        boolean z5 = true;
        if (sourceModelInfoParams3 == null || sourceModelInfoParams3.A04 == null) {
            AnonymousClass1NJ r63 = this.A0F;
            if (r63 != null) {
                if (r63.Aho()) {
                    if (!r63.A1f()) {
                        if (C17050pb.A08(this.A0F, this.A01)) {
                            if (A0D()) {
                            }
                        }
                    }
                }
            }
            z5 = false;
        } else {
            AnonymousClass1NJ r64 = this.A0F;
            if (r64 != null && r64.Aho()) {
                if (r64.A16() == null || (r64.A16().isEmpty() && TextUtils.isEmpty(r64.A0p()) && r64.A0m() == null)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                }
            }
            z5 = false;
        }
        if (z5) {
            CYX A003 = CYX.A00(getContext());
            this.A0G = A003;
            registerLifecycleListener(A003);
        }
        this.A1F = new AnonymousClass1I2();
        C709138e r29 = new C709138e(getContext(), this.A0n, this, r2, AnonymousClass382.A04, A0R(), A0Q2, this.A1V, str5, str6, str7, userDetailEntryInfo, r422, this, this.A0j, this.A0k, this.A1F);
        C709838l A012 = C16310oO.A00.A01(this, this.A0n);
        AnonymousClass2NV r22 = AnonymousClass2NV.A02;
        AnonymousClass1AM childFragmentManager = getChildFragmentManager();
        AnonymousClass0C1 r142 = this.A0n;
        AnonymousClass1US r132 = this.A09;
        C710038o r52 = new C710038o(this);
        C71873Cm r20 = r45;
        UserDetailTabController userDetailTabController = new UserDetailTabController(getContext(), A0Q2, this, r20, this, r22, childFragmentManager, A012, r142, r29, this, this, r132, this, r52, this, this, this.A0Q, this, this.A1G, this.A0k, this.A0j, this.A0h, this.A1W, this);
        this.A0b = userDetailTabController.AJt();
        this.A0c = userDetailTabController;
        if (!this.A1R) {
            C37141jB A033 = C37591ju.A03("profile_view", this);
            A033.A2x = this.A0n.A06.getId();
            A033.A14 = this.A02;
            A033.A0k = this.A01;
            if (!TextUtils.isEmpty(A0H())) {
                A033.A4u = A0H();
            } else {
                A033.A4v = A0I();
            }
            AnonymousClass1NJ r53 = this.A0F;
            if (r53 != null) {
                String APo = r53.APo();
                A033.A3w = APo;
                A033.A3v = APo;
                A033.A50 = r53.AYw();
            }
            AnonymousClass0WN.A01(this.A0n).BcG(A033.A03());
            this.A1R = true;
        }
        C708738a r54 = this.A0Q;
        r54.A01 = this;
        r54.A02 = this.A0c;
        AnonymousClass397 r65 = new AnonymousClass397(this.A0n, this.A0r, A0Q2);
        this.A0i = r65;
        registerLifecycleListener(r65);
        AnonymousClass39B r40 = new AnonymousClass39B(this, r422, this.A0n, A0R(), this.A0c, this.A0g, this.A0d.A03);
        this.A0W = r40;
        registerLifecycleListener(r40);
        AnonymousClass1D1 r55 = null;
        this.A1H = new C52002Na(getContext(), this, this.mFragmentManager, true, this.A0n, this, (AnonymousClass1I6) null, this.A0c);
        UserDetailTabController userDetailTabController2 = this.A0c;
        AnonymousClass1NJ r74 = this.A0F;
        C709138e r66 = userDetailTabController2.A0E;
        r66.A02 = r74;
        r66.A0E = this.A0q;
        C29671Qu r75 = new C29671Qu(this, this, this.A0n);
        r75.A02 = this.A0h.A0B;
        AnonymousClass1HU r67 = new AnonymousClass1HU();
        r67.A0C(this.A1G);
        r67.A0C(r75);
        r67.A0C(this.A1H);
        r67.A0C(this.A0j);
        r67.A0C(this.A0k);
        r67.A0C(r14);
        registerLifecycleListenerSet(r67);
        C31561Yu r68 = null;
        this.A1s.A0B(new AnonymousClass39G(this));
        A0L();
        if (A0Q2) {
            AnonymousClass0C1 r46 = this.A0n;
            this.A1I = new C52932Qu(this, r46);
            this.A0T = new C72793Ha(r46, getActivity(), this, this, A0R());
            C72803Hb r47 = new C72803Hb(this, this.A0n);
            this.A0U = r47;
            registerLifecycleListener(r47);
            AnonymousClass0a4.A0C(A0Q2, "Can only load my stories from self fragment");
            ReelStore A0Q3 = C17020pY.A00().A0Q(this.A0n);
            Reel reel = (Reel) A0Q3.A0E.get(A0Q3.A0A.A04());
            this.A0O = reel;
            if (reel != null) {
                A00(this);
            }
        }
        this.A0P = new AnonymousClass39I(this, this.A0n);
        AE3(false);
        ? rootActivity = getRootActivity();
        C17020pY A004 = C17020pY.A00();
        AnonymousClass0C1 r3 = this.A0n;
        if (rootActivity instanceof AnonymousClass1D1) {
            r55 = rootActivity;
        }
        this.A1K = A004.A0I(this, r3, r55);
        C11130eT.A01.A02(AnonymousClass1P6.class, this.A1e);
        if (!C12800hP.A0J(this.A0n)) {
            boolean z6 = false;
            if (System.currentTimeMillis() - C42251s2.A01(this.A0n).getLong("last_invite_prefetch_access_notoken", 0) >= 86400000) {
                z6 = true;
            }
        }
        C73013Ia A005 = C73013Ia.A00(getContext(), this.A0n);
        AnonymousClass1L8 r76 = this.A05;
        AnonymousClass0C1 r15 = this.A0n;
        C13300iJ r56 = r15.A06;
        String A006 = C14100jl.A00(r15);
        if (A005.getCachedResponse(r56.getId()) == null) {
            C73013Ia.A01(A005, r76, A006, 0, new C73033Ic(A005, r56));
        }
        if (!C12800hP.A0J(this.A0n)) {
            C42251s2.A01(this.A0n).edit().putLong("last_invite_prefetch_access_notoken", System.currentTimeMillis()).apply();
        }
        if (!C12800hP.A0J(this.A0n)) {
            boolean z7 = false;
            if (System.currentTimeMillis() - C42251s2.A01(this.A0n).getLong("last_invite_count_access_notoken", 0) >= 86400000) {
                z7 = true;
            }
        }
        AnonymousClass0C1 r48 = this.A0n;
        schedule(C73043Id.A00(r48, C14100jl.A00(r48), C12800hP.A0J(this.A0n)));
        UserDetailDelegate userDetailDelegate = new UserDetailDelegate(getActivity(), this, this.A0c, A0G(), this.A0n, r2, this.A09, this.A1I, this.A0T, this.A0U, this, this.A0W, this.A0h, this.A0A, this.A1J);
        this.A0a = userDetailDelegate;
        userDetailDelegate.A02 = this.A0g;
        userDetailDelegate.A04 = str3;
        userDetailDelegate.A05 = str;
        registerLifecycleListener(userDetailDelegate);
        UserDetailTabController userDetailTabController3 = this.A0c;
        UserDetailDelegate userDetailDelegate2 = this.A0a;
        C709138e r16 = userDetailTabController3.A0E;
        r16.A0B = userDetailDelegate2;
        r16.A0S.A00.A00 = userDetailDelegate2;
        this.A1E = AnonymousClass1CF.A00(this.A0n);
        C11850fm r10 = (C11850fm) getActivity();
        AnonymousClass0C1 r84 = this.A0n;
        UserDetailDelegate userDetailDelegate3 = this.A0a;
        AnonymousClass1AM r57 = this.mFragmentManager;
        UserDetailLaunchConfig userDetailLaunchConfig6 = this.A0h;
        AnonymousClass39I r32 = this.A0P;
        if (!AnonymousClass1BA.A07(getContext(), C0003R.attr.canAccessSelfProfile, true)) {
            z2 = false;
        }
        z2 = true;
        AnonymousClass39X r162 = new AnonymousClass39X(r10, r84, this, userDetailDelegate3, r57, userDetailLaunchConfig6, r32, this, z2, r2);
        this.A0V = r162;
        AnonymousClass1HU r23 = new AnonymousClass1HU();
        r23.A0C(r162);
        r23.A0C(r162.A02);
        registerLifecycleListenerSet(r23);
        AnonymousClass0C1 r58 = this.A0n;
        this.A0f = new C711339b(r58, ((Integer) AnonymousClass0L6.A02(r58, AnonymousClass0L7.GPS_PROFILE_LAUNCHER, "row_fetch_limit", 60, (AnonymousClass04H) null)).intValue(), this.A0c.A06());
        AnonymousClass1F6.A00(this.A0n).A08(getModuleName(), this.A0f, new C30921Vs(this.A0n), AnonymousClass1F6.A0C.intValue());
        C27661Is r33 = new C27661Is(this.A0n);
        this.A0B = r33;
        C13300iJ r17 = this.A0r;
        if (r17 != null) {
            r68 = r33.A00.A02(r17.getId());
        }
        if (r68 == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(r68.A01.size());
            for (AnonymousClass2KB r18 : r68.A01) {
                arrayList.add(new AnonymousClass2KC(r18.A04, r18.A06));
            }
        }
        AnonymousClass0a4.A09(true);
        C31571Yv r49 = new C31571Yv((String) null, arrayList, 0, 0, 0);
        C709138e r19 = this.A0c.A0E;
        r19.A01 = r49;
        C709138e.A00(r19);
        this.A1U.A02(this.A0B.A00.A01.A0F(new C711439c(this.A0n.A04())), new C711539d(this));
        AnonymousClass0Z0.A09(1085524915, A022);
    }

    public final void onTokenChange() {
        C12670hC.A04(new C109124my(this));
    }

    private Map A01() {
        C13300iJ r0;
        if (A0Q() || (r0 = this.A0r) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("other_profile_username", r0.AZn());
        hashMap.put("other_profile_igid", this.A0r.getId());
        return hashMap;
    }

    public static void A07(UserDetailFragment userDetailFragment) {
        if (!userDetailFragment.A0Q()) {
            C55602b0.A00(userDetailFragment.A0n).A07(userDetailFragment.A0r);
        }
        String id = userDetailFragment.A0r.getId();
        if (userDetailFragment.A1O) {
            userDetailFragment.scheduleLazily(new C154866jQ(userDetailFragment, id));
        } else {
            C17850qu A0A2 = C17020pY.A00().A0A(id, userDetailFragment.A0n);
            A0A2.A00 = new AnonymousClass39K(userDetailFragment);
            userDetailFragment.schedule(A0A2);
        }
        AnonymousClass39B r5 = userDetailFragment.A0W;
        AnonymousClass00B.A01.markerStart(18284551);
        r5.A05.A03();
        UserDetailFragment userDetailFragment2 = r5.A07;
        C17850qu A012 = AnonymousClass39L.A01(userDetailFragment2.getContext(), r5.A08, id, Constants.A0N, true);
        A012.A00 = new AnonymousClass39M(r5.A08, r5, r5.A09);
        userDetailFragment2.schedule(A012);
    }

    public static void A08(UserDetailFragment userDetailFragment) {
        if (userDetailFragment.A0Q()) {
            AnonymousClass0C1 r1 = userDetailFragment.A0n;
            if (r1.A06.A0q()) {
                new C137365tW(r1, userDetailFragment).A01("profile", new AnonymousClass61L(userDetailFragment));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if (r0 >= 6) goto L_0x00c9;
     */
    public static void A09(UserDetailFragment userDetailFragment) {
        int A032;
        Boolean bool;
        boolean z;
        if (userDetailFragment.A0Q() && userDetailFragment.A1W.A01 <= 0) {
            if (!userDetailFragment.A15) {
                AnonymousClass0C1 r1 = userDetailFragment.A0n;
                if (!r1.A06.AeV() || !C16180oA.A00(r1).A00.getBoolean("show_business_welcome_dialog", false)) {
                    return;
                }
            }
            C16180oA.A00(userDetailFragment.A0n).A0j(false);
            userDetailFragment.A15 = false;
            Context context = userDetailFragment.getContext();
            AnonymousClass2OA r2 = new AnonymousClass2OA(context);
            r2.A0U(true);
            r2.A0V(true);
            r2.A03 = userDetailFragment.getString(C0003R.string.welcome_to_instagram_business, userDetailFragment.A0r.AZn());
            AnonymousClass382 A062 = userDetailFragment.A0c.A06();
            if (A062 == null) {
                A032 = -1;
            } else {
                UserDetailTabController userDetailTabController = userDetailFragment.A0c;
                A032 = C710938x.A00(userDetailTabController.A0F, A062.A00).A02.A03();
            }
            if (!userDetailFragment.A13) {
                if (userDetailFragment.A00 > 0) {
                    if (C12800hP.A0J(userDetailFragment.A0n) && A032 >= 0) {
                        z = true;
                    }
                    z = false;
                    if (z) {
                        userDetailFragment.A07.A04(userDetailFragment.getModuleName());
                        C708537y.A01(userDetailFragment.A07, "import_welcome_dialog", "start_step");
                        r2.A06(C0003R.string.import_facebook_page_content_dialog_message);
                        r2.A0A(C0003R.string.import_facebook_page_content_add_photo_label, new C154526ir(userDetailFragment));
                        r2.A09(C0003R.string.not_now, new C154546it(userDetailFragment));
                    }
                }
                if (userDetailFragment.A19) {
                    C13300iJ r3 = userDetailFragment.A0r;
                    boolean z2 = false;
                    if (r3.A0p() && (bool = r3.A0X) != null) {
                        z2 = bool.booleanValue();
                    }
                    if (z2) {
                        String string = context.getString(C0003R.string.learn_more);
                        r2.A0T(string, new SpannableStringBuilder(context.getString(C0003R.string.learn_more_about_claim_page_in_setting, new Object[]{userDetailFragment.A0r.A0B(), string})), new C100904Xp(userDetailFragment, context, string));
                        r2.A0A(C0003R.string.go_to_profile, new AnonymousClass6C1(userDetailFragment));
                    }
                }
                r2.A06(C0003R.string.have_more_tools_to_connect_to_audience);
                r2.A0A(C0003R.string.go_to_profile, new AnonymousClass6C1(userDetailFragment));
            } else if (C136395rv.A01(userDetailFragment.A0n, true)) {
                boolean A072 = C134405oU.A07(userDetailFragment.A0n, false, false);
                int i = C0003R.string.creator_conversion_success_dialog_title;
                if (A072) {
                    i = C0003R.string.creator_conversion_success_dialog_title_simplified;
                }
                r2.A07(i);
                r2.A06(C0003R.string.creator_conversion_success_dialog_body_simplified);
                r2.A0A(C0003R.string.creator_conversion_success_dialog_body_simplified_cta, new C96174Ec(userDetailFragment));
                r2.A09(C0003R.string.skip, (DialogInterface.OnClickListener) null);
            } else {
                r2.A07(C0003R.string.creator_conversion_success_dialog_title);
                r2.A06(C0003R.string.creator_conversion_success_dialog_body);
                r2.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
            }
            userDetailFragment.mWelcomeToBusinessDialog = r2.A03();
            userDetailFragment.mWelcomeToBusinessDialog.show();
        }
    }

    public static boolean A0F(UserDetailFragment userDetailFragment) {
        C13300iJ r2;
        if (userDetailFragment.A0Q() || (r2 = userDetailFragment.A0r) == null || r2.getId() == null || !Boolean.TRUE.equals(r2.A1A) || r2.A0M != C13390iS.FollowStatusFollowing) {
            return false;
        }
        return true;
    }

    public final void AbX(Intent intent) {
        ((C26311Ct) getRootActivity()).APg().AbX(intent);
    }

    public final void Avk(AnonymousClass1NJ r16, int i, int i2, IgImageView igImageView) {
        Integer num;
        C215679Rh r9;
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r3 = this.A0n;
        AnonymousClass1NJ r2 = this.A0F;
        SourceModelInfoParams sourceModelInfoParams = this.A0q;
        if (sourceModelInfoParams == null || sourceModelInfoParams.A04 == null) {
            num = Constants.A0C;
        } else {
            num = Constants.A15;
        }
        if (sourceModelInfoParams.A04 != null) {
            Reel A0G2 = C17020pY.A00().A0Q(r3).A0G(sourceModelInfoParams.A04);
            AnonymousClass0C1 r10 = r3;
            r9 = new C215679Rh(r10, activity, num, this, C17020pY.A00().A0C(r3, sourceModelInfoParams.A05, sourceModelInfoParams.A07, A0G2, sourceModelInfoParams.A01, sourceModelInfoParams.A03));
            r9.A01(sourceModelInfoParams);
            r9.A07 = A0G2;
        } else {
            C37111j8 r14 = new C37111j8(r3, r2);
            r14.A00 = sourceModelInfoParams.A00;
            r14.A01 = sourceModelInfoParams.A02;
            r9 = new C215679Rh(r3, activity, num, this, r14);
            r9.A06 = r2;
            r9.A01(sourceModelInfoParams);
            r9.A00(r2, r14, igImageView);
            r9.A0D = true;
        }
        if (!A0D() || !C30671Ut.A0J(this.A0n, this.A0F)) {
            new C215639Rd(r9).A02();
        } else {
            new C215639Rd(r9).A03(this.A0n, this.A0F, "profile_cta");
        }
    }

    public final void B59() {
        if (C22100xq.A01()) {
            C52362Om r2 = new C52362Om(getActivity(), this.A0n);
            r2.A02 = C22100xq.A00().A02().A02("profile_activation_card", (String) null, (String) null, (String) null, (Boolean) null, (String) null, -1, false);
            r2.A02();
        }
    }

    public final void BG9() {
        C31121Wn A0G2 = A0G();
        AnonymousClass0a4.A06(A0G2);
        A0G2.A06(getContext());
    }

    public final void BHw() {
        if (!AgL()) {
            if (AfR()) {
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("action_bar_feed_retry", this);
                C55262aK.A01(A002, getContext());
                AnonymousClass0WN.A01(this.A0n).BcG(A002);
            }
            AE3(true);
            this.A0j.BL5(A01());
        }
    }

    public final void BUE(int i) {
        String str;
        A0A(this, i);
        C16880pJ.A00(this.A0n).A00 = true;
        C13300iJ r4 = this.A0r;
        if (r4 != null && C16170o9.A00()) {
            C16170o9 r3 = C16170o9.A00;
            FragmentActivity activity = getActivity();
            AnonymousClass0C1 r1 = this.A0n;
            if (r4.AeV()) {
                str = "317704565734863";
            } else {
                str = "2450088378341050";
            }
            r3.A01(activity, r1, str);
        }
    }

    public final C06270Ok BYN() {
        C06270Ok A002 = C06270Ok.A00();
        A002.A09("entity_page_id", A0H());
        A002.A09("entity_page_name", A0I());
        AnonymousClass382 A062 = this.A0c.A06();
        if (A062 != null) {
            A002.A09("media_thumbnail_section", A062.A02);
        }
        return A002;
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    public final void BpW(File file, int i) {
        AnonymousClass6AF.A02(getActivity(), i, file);
    }

    public final String getModuleName() {
        Integer num;
        if (A0Q()) {
            num = Constants.A0Y;
        } else {
            num = Constants.A0N;
        }
        return AnonymousClass1DW.A00(num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r2.A02 == null) goto L_0x004a;
     */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 12) {
            AnonymousClass0C1 r2 = this.A0n;
            C13150hy.A02(r2, "userSession");
            C06570Po A012 = r2.AVA(C217339Yw.class, C218279b7.A00);
            C13150hy.A01(A012, "userSession.getScopedCla…veyController()\n        }");
            C217339Yw r22 = (C217339Yw) A012;
            FragmentActivity activity = getActivity();
            AnonymousClass0C1 r4 = this.A0n;
            C13150hy.A02(activity, "activity");
            C13150hy.A02(r4, "userSession");
            if (r22.A00 == 0) {
                long j = r22.A01;
                if (j >= ArLinkScanControllerImpl.ERROR_DELAY_MS) {
                    if (!(r22.A03 == null || r22.A04 == null || r22.A05 == null)) {
                        z = true;
                    }
                    z = false;
                    if (z && C16170o9.A00()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("time_spent", String.valueOf(((float) j) / ((float) 1000)));
                        String str = r22.A03;
                        if (str == null) {
                            C13150hy.A00();
                        }
                        hashMap.put("merchant_id", str);
                        String str2 = r22.A04;
                        if (str2 == null) {
                            C13150hy.A00();
                        }
                        hashMap.put("merchant_name", str2);
                        Boolean bool = r22.A02;
                        if (bool == null) {
                            C13150hy.A00();
                        }
                        hashMap.put("is_customized", String.valueOf(bool.booleanValue()));
                        String str3 = r22.A05;
                        if (str3 == null) {
                            C13150hy.A00();
                        }
                        hashMap.put("shopping_session_id", str3);
                        C16170o9 r1 = C16170o9.A00;
                        if (r1 == null) {
                            C13150hy.A00();
                        }
                        r1.A02(activity, r4, "530613820963047", hashMap);
                        r22.A01 = 0;
                        String str4 = null;
                        r22.A03 = str4;
                        r22.A04 = str4;
                        r22.A05 = str4;
                        r22.A02 = null;
                        r22.A00 = 0;
                    }
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-881398489);
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A0n, AnonymousClass0L7.PTR_SPINNER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        int i = C0003R.layout.refreshable_profile_tabbed_viewpager_legacy;
        if (booleanValue) {
            i = C0003R.layout.swipe_refresh_profile_tabbed_viewpager;
        }
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(i, viewGroup, false);
        this.A1p.A04(C32711bj.A00(this), inflate);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0003R.C0005id.coordinator_root_layout);
        this.A04 = viewGroup2;
        View inflate2 = layoutInflater2.inflate(C0003R.layout.layout_profile_tombstone, viewGroup2, false);
        this.A03 = inflate2;
        TextView textView = (TextView) inflate2.findViewById(C0003R.C0005id.tombstone_show_post);
        textView.getPaint().setFakeBoldText(true);
        ((TextView) this.A03.findViewById(C0003R.C0005id.tombstone_header_text)).getPaint().setFakeBoldText(true);
        textView.setOnClickListener(new C713039x(this));
        UserDetailTabController userDetailTabController = this.A0c;
        ViewGroup viewGroup3 = this.A04;
        AnonymousClass1XN A002 = AnonymousClass1XL.A00(this.A0n, inflate, new C713139y(this));
        userDetailTabController.mRootLayout = (C711739g) viewGroup3;
        userDetailTabController.mPullToRefresh = A002;
        userDetailTabController.mHeaderContainer = viewGroup3.findViewById(C0003R.C0005id.profile_header_container);
        AdapterLinearLayout adapterLinearLayout = (AdapterLinearLayout) viewGroup3.findViewById(C0003R.C0005id.profile_header_fixed_list);
        userDetailTabController.mAdapterLinearLayout = adapterLinearLayout;
        adapterLinearLayout.setAdapter(userDetailTabController.A0E);
        userDetailTabController.mViewPager = (NestableViewPager) viewGroup3.findViewById(C0003R.C0005id.profile_viewpager);
        userDetailTabController.mPagerTabsContainer = viewGroup3.findViewById(C0003R.C0005id.profile_tabs_container);
        userDetailTabController.mPrivateProfileEmptyStateViewStubHolder = new C26571Ea((ViewStub) viewGroup3.findViewById(C0003R.C0005id.private_profile_empty_state_stub));
        userDetailTabController.mViewPager.setAdapter(userDetailTabController.A0D);
        userDetailTabController.mViewPager.A0K(userDetailTabController);
        userDetailTabController.mViewPager.setPassThroughEdge(2);
        TabLayout tabLayout = (TabLayout) viewGroup3.findViewById(C0003R.C0005id.profile_tab_layout);
        userDetailTabController.mTabLayout = tabLayout;
        tabLayout.setupWithViewPager(userDetailTabController.mViewPager);
        Context context = viewGroup3.getContext();
        int A003 = C019000b.A00(context, C0003R.color.igds_primary_icon);
        userDetailTabController.A00 = A003;
        userDetailTabController.mTabLayout.setSelectedTabIndicatorColor(A003);
        int A004 = C019000b.A00(context, C0003R.color.igds_secondary_background);
        userDetailTabController.mAdapterLinearLayout.setBackgroundColor(A004);
        userDetailTabController.mTabLayout.setBackgroundColor(A004);
        userDetailTabController.mRootLayout.setOnMeasureListener(new AnonymousClass3A5(userDetailTabController));
        ((C51052Iz) userDetailTabController.mViewPager.getLayoutParams()).A00(new AppBarLayout.ScrollingViewBehavior());
        userDetailTabController.mPrivateProfileEmptyStateViewStubHolder.A03(new AnonymousClass3AC(userDetailTabController));
        userDetailTabController.mPullToRefreshSpinnerContainer = viewGroup3.findViewById(C0003R.C0005id.swipe_refresh_animated_progressbar_container);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(C0003R.dimen.profile_pull_to_refresh_stroke_width, typedValue, true);
        float f = typedValue.getFloat();
        int[] iArr = {C0003R.color.white, C0003R.color.grey_1, C0003R.color.grey_2};
        context.getResources().getDimensionPixelSize(C0003R.dimen.profile_pull_to_refresh_corner_radius);
        AnonymousClass3AD r9 = new AnonymousClass3AD(context, C0003R.color.grey_2, C0003R.color.grey_4, iArr, f, context.getResources().getDimensionPixelSize(C0003R.dimen.profile_pull_to_refresh_padding));
        userDetailTabController.mRefreshDrawable = r9;
        AnonymousClass1E1.A0a(userDetailTabController.mPullToRefreshSpinnerContainer, r9);
        View findViewById = viewGroup3.findViewById(C0003R.C0005id.swipe_refresh_animated_progressbar_container_background);
        userDetailTabController.mPullToRefreshSpinnerContainerBg = findViewById;
        findViewById.setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (!userDetailTabController.A0Q || !userDetailTabController.A07) {
            if (userDetailTabController.A0O) {
                userDetailTabController.mPullToRefresh.setIsLoading(true);
            } else {
                ((C51052Iz) userDetailTabController.mPullToRefreshSpinnerContainer.getLayoutParams()).A03 = 17;
                userDetailTabController.mRefreshDrawable.A01(1.0f);
                userDetailTabController.mRefreshDrawable.A03(true);
            }
        }
        AppBarLayout appBarLayout = (AppBarLayout) viewGroup3.findViewById(C0003R.C0005id.tab_appbar);
        userDetailTabController.mAppBarLayout = appBarLayout;
        C51052Iz r7 = (C51052Iz) appBarLayout.getLayoutParams();
        RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = new RefreshableAppBarLayoutBehavior(viewGroup3, new AnonymousClass3AJ(userDetailTabController));
        userDetailTabController.mRefreshableLayoutBehavior = refreshableAppBarLayoutBehavior;
        float f2 = (float) C0003R.dimen.profile_pull_to_refresh_container_height;
        refreshableAppBarLayoutBehavior.A02 = f2;
        refreshableAppBarLayoutBehavior.A00 = f2 * 1.2f;
        refreshableAppBarLayoutBehavior.A0E.add(userDetailTabController.mViewPager);
        RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior2 = userDetailTabController.mRefreshableLayoutBehavior;
        refreshableAppBarLayoutBehavior2.A03 = userDetailTabController.mPullToRefresh;
        UserDetailFragment userDetailFragment = userDetailTabController.A0I;
        if (!refreshableAppBarLayoutBehavior2.A0F.contains(userDetailFragment)) {
            refreshableAppBarLayoutBehavior2.A0F.add(userDetailFragment);
        }
        RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior3 = userDetailTabController.mRefreshableLayoutBehavior;
        AnonymousClass3AM r1 = new AnonymousClass3AM(userDetailTabController);
        if (!refreshableAppBarLayoutBehavior3.A0D.contains(r1)) {
            refreshableAppBarLayoutBehavior3.A0D.add(r1);
        }
        userDetailTabController.mPullToRefreshSpinnerContainer.getViewTreeObserver().addOnPreDrawListener(userDetailTabController.A0B);
        userDetailTabController.mViewPager.A0K(userDetailTabController.mRefreshableLayoutBehavior);
        r7.A00(userDetailTabController.mRefreshableLayoutBehavior);
        ((C712339n) userDetailTabController.mHeaderContainer.getLayoutParams()).A00 = 3;
        UserDetailTabController.A00(userDetailTabController);
        userDetailTabController.mAppBarLayout.A01(userDetailTabController.A0C);
        UserDetailTabController.A01(userDetailTabController);
        C26571Ea r3 = userDetailTabController.mPrivateProfileEmptyStateViewStubHolder;
        if (r3 != null) {
            int i2 = 8;
            if (UserDetailTabController.A04(userDetailTabController)) {
                i2 = 0;
            }
            r3.A02(i2);
        }
        if (userDetailTabController.mViewPager != null && ((Boolean) C05680Ln.A1X.A00()).booleanValue()) {
            userDetailTabController.mViewPager.setSwipingDisabled(true);
            TabLayout tabLayout2 = userDetailTabController.mTabLayout;
            if (tabLayout2 != null) {
                tabLayout2.setSelectedTabIndicatorHeight(0);
            }
        }
        this.A0Y.A01 = this;
        AnonymousClass0Z0.A09(1573621974, A022);
        return inflate;
    }

    public void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(2069910675);
        super.onDestroy();
        this.A0Y = null;
        C62902oZ r6 = this.A0e;
        for (C62912oa r0 : r6.A00.values()) {
            AnonymousClass00B.A01.markerEnd(r0.A00, 228);
        }
        r6.A00.clear();
        this.A0D.A02();
        this.A1F.A00.clear();
        C23300zv A002 = C23300zv.A00(this.A0n);
        A002.A03(AnonymousClass38H.class, this.A1a);
        A002.A03(AnonymousClass38I.class, this.A1k);
        A002.A03(C32921c4.class, this.A1j);
        A002.A03(AnonymousClass38J.class, this.A1d);
        A002.A03(AnonymousClass38K.class, this.A1c);
        A002.A03(C31091Wk.class, this.A1g);
        A002.A03(AnonymousClass38L.class, this.A1Z);
        A002.A03(C33231ca.class, this.A1o);
        A002.A03(AnonymousClass38M.class, this.A1b);
        A002.A03(AnonymousClass38N.class, this.A1i);
        AnonymousClass1F6.A00(this.A0n).A07(getModuleName());
        C11130eT r2 = C11130eT.A01;
        r2.A03(AnonymousClass1P6.class, this.A1e);
        r2.A03(AnonymousClass1FF.class, this.A1f);
        this.A0a = null;
        this.A0O = null;
        this.A0M = null;
        this.A0G = null;
        UserDetailFragmentLifecycleUtil.cleanupReferences(this);
        this.A1U.A01();
        AnonymousClass0Z0.A09(-1790473099, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-2051733767);
        C23300zv A002 = C23300zv.A00(this.A0n);
        A002.A03(AnonymousClass3AP.class, this.A1Y);
        A002.A03(C35241g2.class, this);
        A002.A03(C31061Wh.class, this.A1n);
        A002.A03(C35151ft.class, this.A1l);
        A002.A03(C31071Wi.class, this.A1m);
        C11130eT.A01.A03(C33601dB.class, this.A1h);
        this.A1r.A0C(this.A1G);
        UserDetailDelegate userDetailDelegate = this.A0a;
        userDetailDelegate.A03 = null;
        C51522Kz r2 = userDetailDelegate.A00;
        if (r2 != null) {
            C11130eT.A01.BXT(new C33451cw(r2));
        }
        UserDetailTabController userDetailTabController = this.A0c;
        userDetailTabController.mPullToRefreshSpinnerContainer.getViewTreeObserver().removeOnPreDrawListener(userDetailTabController.A0B);
        RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = userDetailTabController.mRefreshableLayoutBehavior;
        refreshableAppBarLayoutBehavior.A0D.clear();
        refreshableAppBarLayoutBehavior.A0F.clear();
        userDetailTabController.mRefreshableLayoutBehavior.A0E.clear();
        NestableViewPager nestableViewPager = userDetailTabController.mViewPager;
        RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior2 = userDetailTabController.mRefreshableLayoutBehavior;
        List list = nestableViewPager.A0B;
        if (list != null) {
            list.remove(refreshableAppBarLayoutBehavior2);
        }
        List list2 = userDetailTabController.mViewPager.A0B;
        if (list2 != null) {
            list2.remove(userDetailTabController);
        }
        userDetailTabController.mViewPager.removeCallbacks(userDetailTabController.A0N);
        AppBarLayout appBarLayout = userDetailTabController.mAppBarLayout;
        C710538t r1 = userDetailTabController.A0C;
        List list3 = appBarLayout.A05;
        if (!(list3 == null || r1 == null)) {
            list3.remove(r1);
        }
        userDetailTabController.mRootLayout.setOnMeasureListener((AnonymousClass3A6) null);
        userDetailTabController.mTabLayout.setupWithViewPager((ViewPager) null);
        UserDetailTabControllerLifecycleUtil.cleanupReferences(userDetailTabController);
        userDetailTabController.A05 = false;
        AnonymousClass0ZA.A07(this.A1T, (Object) null);
        this.A0Y.A00();
        C132155kq r3 = this.A0X;
        if (r3 != null) {
            synchronized (r3.A00) {
                r3.A00.clear();
                r3.A02.set((Object) null);
                r3.A01.set((Object) null);
            }
            this.A0X = null;
        }
        this.A1B = null;
        this.A03 = null;
        this.A04 = null;
        this.A1D = null;
        this.A1C = null;
        super.onDestroyView();
        AnonymousClass0Z0.A09(577079271, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r1 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r1 == false) goto L_0x0079;
     */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        ViewGroup viewGroup;
        boolean z;
        boolean z2;
        C38031kc r0;
        int A032 = AnonymousClass0Z0.A03(1724632349);
        int A033 = AnonymousClass0Z0.A03(-1001041658);
        boolean z3 = false;
        for (Reel reel : ((C35241g2) obj).A01) {
            if (!AnonymousClass17M.A00(reel.A0M.AZf(), this.A0r)) {
                C13300iJ r1 = this.A0r;
                if (!(!reel.A0W() || (r0 = reel.A0C) == null || r1 == null)) {
                    boolean contains = r0.A04().contains(r1);
                    z2 = true;
                }
                z2 = false;
                if (!z2) {
                }
            }
            if (reel.A0W()) {
                this.A0M = reel;
            } else if (reel.A0X()) {
                this.A0N = reel;
            } else {
                if (reel.A0x) {
                    boolean z4 = false;
                    if (reel.A0I == AnonymousClass172.USER) {
                        z4 = true;
                    }
                    z = true;
                }
                z = false;
                if (z) {
                    this.A0O = reel;
                }
            }
            if (!reel.A0g.isEmpty()) {
                z3 = true;
            }
        }
        A00(this);
        if (z3 && (viewGroup = this.A04) != null) {
            viewGroup.post(new C122795Nx(this));
        }
        AnonymousClass0Z0.A0A(-1872431388, A033);
        AnonymousClass0Z0.A0A(-120476979, A032);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1929973316);
        super.onPause();
        this.A0a.BE0();
        this.A1F.A01();
        this.A1E.Bba(this);
        AnonymousClass1F6.A00(this.A0n).A04();
        this.A0K = null;
        this.A0H = null;
        this.A0J = null;
        this.A0I = null;
        AnonymousClass0Z0.A09(1287515447, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (((java.lang.Boolean) p000X.C05570Lc.A02(p000X.AnonymousClass41W.A00(), r2)).booleanValue() != false) goto L_0x0119;
     */
    public void onResume() {
        boolean z;
        C35041fi r2;
        String str;
        boolean z2;
        boolean z3;
        C13300iJ r0;
        int A022 = AnonymousClass0Z0.A02(1463695753);
        super.onResume();
        if (AnonymousClass3AQ.A00) {
            AnonymousClass1US r22 = this.A09;
            FragmentActivity activity = getActivity();
            AnonymousClass3AQ.A00 = false;
            if (C16170o9.A00()) {
                C16170o9.A00.A01(activity, r22.A01, "990751857734378");
            }
        }
        if (this.A11) {
            this.A11 = false;
            AE3(false);
        }
        boolean A0Q2 = A0Q();
        if (A0Q2 && this.A18) {
            A0B(this, getContext());
        }
        if (A0Q2 && this.A16) {
            this.A16 = false;
            AnonymousClass2OA r3 = new AnonymousClass2OA(getContext());
            r3.A07(C0003R.string.branded_content_tools_ready_dialog_title);
            r3.A06(C0003R.string.branded_content_tools_ready_dialog_description);
            r3.A09(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
            r3.A03().show();
        }
        if (A0Q2 && this.A17) {
            this.A17 = false;
            AnonymousClass5F9.A01(getActivity(), C0003R.string.import_facebook_page_media_failed, 0);
        }
        if (A0Q2 && C36981iv.A07(this.A0n.A06)) {
            A04(getContext());
        }
        AnonymousClass3AR A002 = AnonymousClass3AR.A00(this.A0n);
        C13300iJ r02 = this.A0r;
        if (r02 == null) {
            z = false;
        } else {
            z = A002.A00.getBoolean(r02.getId(), false);
        }
        if (z) {
            A0A(this, AnonymousClass3AR.A00(this.A0n).A01(this.A0r));
        }
        if (A0Q2 && (r0 = this.A0r) != null && r0.A0X() && !this.A1N) {
            A05(getContext(), this.A0r);
        }
        if (C22120xs.A01() && ((Boolean) C05640Lj.A00(AnonymousClass0L7.ALWAYS_USE_SERVER_RECENTS, "is_enabled", false)).booleanValue()) {
            C22120xs.A00().A06(this.A0n);
        }
        if (this.A0U != null) {
            if (!((Boolean) C05570Lc.A02(C72873Hj.A00(), this.A0n)).booleanValue()) {
                AnonymousClass0C1 r23 = this.A0n;
                if (r23.A06.AeV()) {
                }
            }
            C72803Hb r32 = this.A0U;
            AnonymousClass0C1 r24 = r32.A05;
            C27341Hl r03 = r32.A01;
            int i = r32.A00;
            C92673zX r4 = new C92673zX(AnonymousClass0QT.A00(r24, r03).A02("ig_profile_fb_entrypoint_seen"));
            r4.A06("badge_count", Integer.valueOf(i));
            r4.A01();
            this.A0U.A05();
        }
        if (A0Q2) {
            r2 = this.A0C;
            str = "self_fragment_resume";
        } else {
            r2 = this.A0C;
            str = "user_detail_fragment_resume";
        }
        r2.A01(str);
        this.A1E.A4p(this);
        A02();
        C35111fp.A00(this.A0n).A01(this);
        AnonymousClass1F6.A00(this.A0n).A05();
        C13300iJ r25 = this.A0r;
        if (r25 != null) {
            Boolean bool = r25.A14;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = false;
            }
            if (z2) {
                Boolean bool2 = r25.A0j;
                if (bool2 != null) {
                    z3 = bool2.booleanValue();
                } else {
                    z3 = false;
                }
                if (z3 && r25.A03 != null && ((Boolean) AnonymousClass0L6.A02(this.A0n, AnonymousClass0L7.BUSINESS_PROFILE_DONATE_CTA_ANDROID, "can_donate", false, (AnonymousClass04H) null)).booleanValue()) {
                    AnonymousClass0C1 r5 = this.A0n;
                    String str2 = this.A0r.A03.A01;
                    HashMap hashMap = new HashMap();
                    hashMap.put("charity_user_id", str2);
                    hashMap.put("source_name", "charity_profile");
                    hashMap.put("fundraiser_type", Integer.toString(14));
                    C146186Mt.A04(r5, this, hashMap, "ig_cg_view_fundraiser");
                }
            }
        }
        if (AnonymousClass3AT.A08(this.A0n, this.A0r)) {
            if (this.A12) {
                C13300iJ r26 = this.A0r;
                C58422fu r04 = r26.A0A;
                if (r04 != null) {
                    this.A08.A02(r04.A01, r04.A05, r04.A06, r26.getId(), r04.A03);
                }
            } else {
                C13300iJ r33 = this.A0r;
                AnonymousClass2A5 r27 = r33.A0G;
                C57942f3 A003 = AnonymousClass3AT.A00(r33, r27);
                if (A003 != null) {
                    this.A08.A02(A003.A00, A003.A02, A003.A03, r33.getId(), r27.A00);
                }
            }
        }
        AnonymousClass1I2.A00(this.A1F);
        AnonymousClass0Z0.A09(-1506986660, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-1769774720);
        A06(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(584745596, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        Integer num;
        int A032 = AnonymousClass0Z0.A03(-53923730);
        this.A1s.onScrollStateChanged(absListView, i);
        AnonymousClass382 A062 = this.A0c.A06();
        if (A062 != null) {
            num = A062.A01;
        } else {
            num = null;
        }
        if (num == Constants.ZERO) {
            this.A1r.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0Z0.A0A(177190262, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass9IU r7;
        Integer num;
        CYX cyx;
        super.onViewCreated(view, bundle);
        if (this.A0F == null && (cyx = this.A0G) != null) {
            unregisterLifecycleListener(cyx);
            this.A0G = null;
        } else if (this.A0G != null) {
            if (!A0D() || !C30671Ut.A0J(this.A0n, this.A0F)) {
                r7 = new AnonymousClass9IU(requireContext(), this, this.A0n, this);
            } else {
                r7 = new C128425ef(requireContext(), this, this.A0n, this);
            }
            View A002 = AnonymousClass9IU.A00(getContext(), this.A04);
            AnonymousClass9IV r5 = (AnonymousClass9IV) A002.getTag();
            AnonymousClass1NJ r3 = this.A0F;
            AnonymousClass9IT r2 = new AnonymousClass9IT(this.A02, this.A01);
            SourceModelInfoParams sourceModelInfoParams = this.A0q;
            if (sourceModelInfoParams == null || sourceModelInfoParams.A04 == null) {
                num = Constants.A0C;
            } else {
                num = Constants.A15;
            }
            r7.A01(r5, r3, r2, num);
            this.A04.addView(A002);
            this.A04.invalidate();
            this.A0G.A02(A002);
            UserDetailTabController userDetailTabController = this.A0c;
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.universal_cta_empty_button_view_height);
            C710138p r32 = userDetailTabController.A0J;
            r32.A00 = dimensionPixelSize;
            r32.A02.clear();
            for (AnonymousClass3BU r0 : r32.A04) {
                r0.BIq(dimensionPixelSize);
                r32.A02.add(r0.ASx());
            }
        }
        C23300zv A003 = C23300zv.A00(this.A0n);
        A003.A02(AnonymousClass3AP.class, this.A1Y);
        A003.A02(C35241g2.class, this);
        A003.A02(C31061Wh.class, this.A1n);
        A003.A02(C35151ft.class, this.A1l);
        A003.A02(C31071Wi.class, this.A1m);
        C11130eT.A01.A02(C33601dB.class, this.A1h);
        this.A1D = (ViewStub) view.findViewById(C0003R.C0005id.blocked_profile_stub);
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A0n, AnonymousClass0L7.QP_PROFILE_TRIGGER_INVESTIGATION, "profile_triggers_disabled", false, (AnonymousClass04H) null)).booleanValue();
        if (A0Q() || booleanValue) {
            String str = "";
            for (String A0J2 : this.A0n.A05.A04((String) null)) {
                str = AnonymousClass000.A0J(str, A0J2, ",");
            }
            HashSet hashSet = new HashSet();
            hashSet.add(Trigger.LOGGED_IN_USER_ID_LOADED);
            if (!booleanValue) {
                Set set = (Set) C37721k7.A01.get(QuickPromotionSlot.PERSONAL_PROFILE);
                if (set != null) {
                    hashSet.addAll(set);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("logged_in_user_ids", str);
            this.A0j.BSr(hashSet, hashMap);
        }
        this.A0j.BL5(A01());
        A03();
        AnonymousClass1EK A004 = C55872bY.A00(this.A0c.mViewPager);
        if (A004 != null) {
            A004.setKeepObservingAfterRequestDisallowTouchEvent(true);
        }
        A0N("profile");
        C32991cC.A00(this.A0n).A07(view, C33051cI.GENERIC_PROFILE_BROWSER);
    }

    public final void Bps(Intent intent, int i) {
        AnonymousClass1BH.A0B(intent, i, this);
    }
}
