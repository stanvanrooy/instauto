package p000X;

import android.content.Context;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.discovery.recyclerview.p032ui.DiscoveryRecyclerView;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.guides.intf.GuideGridFragmentConfig;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1Uf  reason: invalid class name and case insensitive filesystem */
public final class C30531Uf extends C27341Hl implements C29081On, AnonymousClass1I6, C30541Ug, AnonymousClass1HK, AnonymousClass0Q6, AnonymousClass1HL, C29091Oo, AnonymousClass1HM, AnonymousClass0RC, C30551Uh, AnonymousClass1HO, C30521Ue, C30561Ui {
    public int A00;
    public AnonymousClass2M1 A01;
    public AnonymousClass0QT A02;
    public C53472Sx A03;
    public C53062Ri A04;
    public C41711qm A05;
    public AnonymousClass2RO A06;
    public C53112Rn A07;
    public AnonymousClass2RM A08;
    public AnonymousClass2TB A09;
    public C53262Sc A0A;
    public ExploreTopicCluster A0B;
    public AnonymousClass2T2 A0C;
    public C52012Nb A0D;
    public C29631Qq A0E;
    public AnonymousClass1UY A0F;
    public AnonymousClass0C1 A0G;
    public AnonymousClass2RY A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Boolean A0P;
    public String A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public long A0U;
    public AnonymousClass1CH A0V;
    public AnonymousClass1LO A0W;
    public C27301Hh A0X;
    public C53182Ru A0Y;
    public C28051Kf A0Z;
    public C53372Sn A0a;
    public C53382So A0b;
    public AnonymousClass2RN A0c;
    public AnonymousClass1OC A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g;
    public final C52912Qs A0h = new AnonymousClass2RE(this);
    public final AnonymousClass2NR A0i = new AnonymousClass2NR();
    public final AnonymousClass2NV A0j = AnonymousClass2NV.A01;
    public final C27381Hp A0k = new AnonymousClass2RH(this);
    public final C11200ea A0l = new AnonymousClass2RA(this);
    public final C11200ea A0m = new AnonymousClass2RB(this);
    public final C11200ea A0n = new AnonymousClass2RD(this);
    public final C11200ea A0o = new AnonymousClass2R9(this);
    public final C11200ea A0p = new AnonymousClass2RC(this);
    public final AnonymousClass2R6 A0q = new AnonymousClass2R5(this);
    public final AnonymousClass2RJ A0r = new AnonymousClass2RI(this);
    public final AnonymousClass2R1 A0s = new AnonymousClass2R0(this);
    public final AnonymousClass2R8 A0t = new AnonymousClass2R7(this);
    public final AnonymousClass2RG A0u = new AnonymousClass2RF(this);
    public final AnonymousClass2RK A0v = new AnonymousClass2RK(this);
    public final AnonymousClass2RL A0w = new AnonymousClass2RL(this);
    public final AnonymousClass2R4 A0x = new AnonymousClass2R4(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean AhS() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void Aix() {
        A08(false, false);
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static int A00(C30531Uf r3) {
        C53262Sc r32 = r3.A0A;
        for (int count = r32.A00.getCount() - 1; count >= 0; count--) {
            C40371oY r1 = (C40371oY) r32.A00.getItem(count);
            if (r1 instanceof C40361oX) {
                return r32.A01.AMb((C40361oX) r1).A01 + 1;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r1 != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        if (r8.A0O.booleanValue() != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r2.A0D = r0;
        r2.A02 = r8.A0B;
        r1 = r8.A0i;
        r0 = new android.os.Bundle();
        r2.A00 = r0;
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (((java.lang.Integer) p000X.AnonymousClass0L6.A03(r8.A0G, p000X.AnonymousClass0L7.HP1_DIMENSIONS, "left_page_size", -1, (p000X.AnonymousClass04H) null)).intValue() == -1) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r1 = r9.A09;
        r7 = r8.A0G;
        r6 = r8.getContext();
        r4 = r8.getResources();
        r3 = new java.util.HashMap();
        r1 = p000X.AnonymousClass1PZ.A00(r7).A02(r1);
        p000X.AnonymousClass0a4.A06(r1);
        new p000X.AnonymousClass1SR(r6, r7, r8, p000X.C29181Ox.A00(r6, r7), p000X.C17070pd.EXPLORE_FEED).A02(r1, new p000X.C36841ih(r1), r3);
        r3.put("screen_height", java.lang.Integer.valueOf(p000X.C06220Of.A08(r6)));
        r3.put("action_bar_height", java.lang.Integer.valueOf(p000X.C27651Ir.A00(r6)));
        r3.put("tab_bar_height", java.lang.Integer.valueOf(r4.getDimensionPixelSize(com.facebook.C0003R.dimen.tab_bar_height)));
        r2.A0A = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x010e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r8.A0I.booleanValue() != false) goto L_0x0045;
     */
    public static C939844r A01(C30531Uf r8, DiscoveryChainingItem discoveryChainingItem, String str) {
        boolean z;
        C939844r r2 = new C939844r();
        if (str == null) {
            str = r8.A06.AIw();
        }
        r2.A04 = str;
        r2.A01 = discoveryChainingItem;
        r2.A05 = "topical_explore";
        r2.A07 = r8.A0Q;
        r2.A06 = r8.getModuleName();
        if (r8.A0S) {
            if (r8.A0I == null) {
                r8.A0I = (Boolean) AnonymousClass0L6.A02(r8.A0G, AnonymousClass0L7.SMPLT, "always_show_pill", false, AnonymousClass0LY.A03);
            }
        }
        if (r8.A0O == null) {
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r8.A0G, AnonymousClass0L7.EXPLORE_UNIFIED_POST_CHAINS, "disable_see_more_posts_pill", false, (AnonymousClass04H) null)).booleanValue();
            boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(r8.A0G, AnonymousClass0L7.PERSONALIZED_MEDIA_CHAIN_SOURCING, "never_show_pill", false, (AnonymousClass04H) null)).booleanValue();
            if (!booleanValue) {
                z = false;
            }
            z = true;
            r8.A0O = Boolean.valueOf(z);
        }
        boolean z2 = true;
    }

    public static C149916bA A02(C30531Uf r4, AnonymousClass1NJ r5) {
        C149916bA r3 = new C149916bA();
        r3.A09 = r5.getId();
        r3.A00 = r5.APx().A00;
        r3.A08 = r5.A0c(r4.A0G).getId();
        r3.A0A = r5.A0o();
        r3.A04 = (String) ((C150006bJ) r4.A0G.AVA(C150006bJ.class, new C150066bS())).A00.get(r4.A0e);
        r3.A06 = r4.A09.A00;
        r3.A03 = r4.A0e;
        r3.A02 = r4.A0c.A02();
        return r3;
    }

    public static String A03(C30531Uf r5) {
        ExploreTopicCluster exploreTopicCluster = r5.A0B;
        if (exploreTopicCluster == null) {
            return "";
        }
        return C38201kt.A00("discover/topical_explore/", exploreTopicCluster.A05, (String) null, (String) null, r5.A06.AoP(true));
    }

    private void A04() {
        AnonymousClass1F6.A00(this.A0G).A08(getModuleName(), new AnonymousClass2TF(this.A0G), new C30921Vs(this.A0G), AnonymousClass1F6.A0C.intValue());
    }

    public static void A05(C30531Uf r3, DiscoveryChainingConfig discoveryChainingConfig) {
        C52362Om r2 = new C52362Om(r3.getActivity(), r3.A0G);
        r2.A0B = true;
        C18220rV r0 = C18220rV.A00;
        if (r0 != null) {
            r2.A02 = r0.A00().A00(discoveryChainingConfig);
            r2.A03 = r3.A0h;
            r2.A02();
            r3.A0S = true;
            return;
        }
        throw new RuntimeException("Error! Trying to access DiscoveryChainingPlugin without an instance!");
    }

    public static void A06(C30531Uf r3, GuideGridFragmentConfig guideGridFragmentConfig) {
        C52362Om r2 = new C52362Om(r3.getActivity(), r3.A0G);
        r2.A0B = true;
        r2.A02 = C18830sU.A00.A00().A00(r3.A0G, guideGridFragmentConfig);
        r2.A03 = r3.A0h;
        r2.A02();
    }

    public static void A07(C30531Uf r5, boolean z) {
        if (z) {
            AnonymousClass0C1 r4 = r5.A0G;
            String str = r5.A0Q;
            C06270Ok BYN = r5.BYN();
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("explore_home_pull_to_refresh", r5);
            A002.A0G("session_id", str);
            if (BYN != null) {
                A002.A04(BYN);
            }
            AnonymousClass0WN.A01(r4).BcG(A002);
        }
        if (r5.AfR()) {
            AnonymousClass0P4 A003 = AnonymousClass0P4.A00("action_bar_feed_retry", r5);
            C55262aK.A01(A003, r5.getContext());
            AnonymousClass0WN.A01(r5.A0G).BcG(A003);
        }
        r5.A08(true, z);
    }

    private void A08(boolean z, boolean z2) {
        String str;
        boolean z3 = z;
        AnonymousClass2TC r3 = new AnonymousClass2TC(this, z3, z2);
        if (z && this.A0g) {
            C37991kY A012 = C37991kY.A01(this.A0G);
            if (!A012.A03()) {
                A012.A01 = null;
                A012.A00 = 0;
            }
            C38801ls r2 = A012.A01;
            A012.A01 = null;
            A012.A00 = 0;
            C38801ls r1 = r2;
            if (r2 != null) {
                this.A01.A00.A02();
                this.A09 = new AnonymousClass2TB(new C28341Li(getContext(), this.A0G, AnonymousClass1L8.A00(this), r1.AQs(), r1.AeH()));
                r3.B4M(r1);
                if (((Boolean) AnonymousClass0L6.A02(this.A0G, AnonymousClass0L7.EXPLORE_STARTUP_PREFETCH_OPTIMIZATION, "use_cache_if_exists_instead_of_startup_prefetch", false, (AnonymousClass04H) null)).booleanValue()) {
                    AnonymousClass0C1 r22 = this.A0G;
                    ((C38161kp) r22.AVA(C38161kp.class, new C38181kr(r22))).A00.edit().putBoolean("prefetch_and_store_to_disk_on_next_startup", true).apply();
                    return;
                }
                return;
            }
        }
        C52992Rb AoP = this.A06.AoP(z3);
        if (z) {
            AnonymousClass2TB r23 = this.A09;
            r23.A01.A01 = null;
            r23.A00 = null;
        }
        ExploreTopicCluster exploreTopicCluster = this.A0B;
        if (exploreTopicCluster == null) {
            str = null;
        } else {
            str = exploreTopicCluster.A05;
        }
        AnonymousClass2TB r24 = this.A09;
        String str2 = r24.A01.A01;
        String str3 = r24.A00;
        AnonymousClass0C1 r9 = this.A0G;
        String str4 = "discover/topical_explore/";
        if (exploreTopicCluster != null && exploreTopicCluster.A01 == C40181oE.SHOPPING) {
            str4 = "commerce/destination/";
        }
        String A002 = C38201kt.A00(str4, str, str2, str3, AoP);
        C15890nh r6 = new C15890nh(r9);
        r6.A09 = Constants.A0N;
        r6.A0C = str4;
        Class<C38211ku> cls = C38211ku.class;
        r6.A06 = new C22930zG(cls, new AnonymousClass0IZ(r9));
        r6.A0B = A002;
        r6.A08 = Constants.A0C;
        C17850qu A032 = r6.A03();
        AnonymousClass0C1 r92 = this.A0G;
        String str5 = "discover/topical_explore/";
        ExploreTopicCluster exploreTopicCluster2 = this.A0B;
        if (exploreTopicCluster2 != null && exploreTopicCluster2.A01 == C40181oE.SHOPPING) {
            str5 = "commerce/destination/";
        }
        String str6 = this.A0Q;
        String moduleName = getModuleName();
        C52992Rb[] r5 = {AoP};
        String A003 = C38201kt.A00(str5, str, str2, str3, r5);
        C15890nh r62 = new C15890nh(r92);
        r62.A09 = Constants.A0N;
        r62.A0C = str5;
        r62.A06(cls, false);
        r62.A09("session_id", str6);
        r62.A09("is_prefetch", "false");
        r62.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
        r62.A0C("use_sectional_payload", true);
        r62.A0C("include_fixed_destinations", true);
        r62.A0C("omit_cover_media", true);
        r62.A0A("module", moduleName);
        r62.A0A("cluster_id", str);
        r62.A0A("grid_pagination_token", str3);
        if (str5.equals("discover/topical_explore/") && C932441n.A00(r92).booleanValue()) {
            r62.A03 = C15920nk.CriticalAPI;
        }
        C16160o8.A04(r62, str2);
        Location lastLocation = C16230oG.A00.getLastLocation(r92, 10800000, 50000.0f);
        if (lastLocation != null) {
            r62.A09("lat", String.valueOf(lastLocation.getLatitude()));
            r62.A09("lng", String.valueOf(lastLocation.getLongitude()));
        }
        r62.A0B = A003;
        r62.A08 = Constants.ONE;
        for (int i = 0; i < 1; i++) {
            C52992Rb r0 = r5[i];
            if (r0 != null) {
                r0.ApB(r62);
            }
        }
        C17850qu A033 = r62.A03();
        AnonymousClass2TB r12 = this.A09;
        C28341Li.A00(r12.A01, A033, A032, 4500, 0, new AnonymousClass2TD(r12, r3));
    }

    public final void A68() {
        if (this.A09.A01.A04()) {
            A08(false, false);
        }
    }

    public final C27301Hh AMt() {
        return this.A0X;
    }

    public final String AVo() {
        return this.A0Q;
    }

    public final boolean Abq() {
        return this.A0A.Abq();
    }

    public final boolean Abs() {
        return this.A09.A01.A03();
    }

    public final boolean AfR() {
        if (this.A09.A01.A00 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public final boolean AgL() {
        Integer num = this.A09.A01.A00;
        if (num == Constants.ZERO || num == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    public final void BAg(AnonymousClass1NJ r7, boolean z) {
        boolean z2;
        C53382So r3 = this.A0b;
        C40351oW A002 = C53382So.A00(r3);
        if (A002 != null && A002.APe().equals(r7)) {
            C38891m1 r5 = A002.A00;
            if (z) {
                r5.A00().A01 = Constants.A0C;
            }
            boolean z3 = true;
            if (r5.A00 >= r5.A07.size() - 1) {
                z3 = false;
            }
            if (z3) {
                r5.A00++;
                r3.A03.BqX(r7, "hide", true);
                r3.A02.A01(A002.getId());
                r3.A02.Brq();
                z2 = true;
                if (z2) {
                    this.A07.BqX(r7, "hide", true);
                    this.A0A.A01(r7.getId());
                    return;
                }
                return;
            }
            C53442Su r1 = r3.A01;
            r1.A00 = r5.A01;
            r1.A00();
        }
        z2 = false;
        if (z2) {
        }
    }

    public final void BE4() {
        this.A07.BWw("peek");
    }

    public final void BE5() {
        this.A07.Bdw();
    }

    public final Map BYU() {
        ExploreTopicCluster exploreTopicCluster = this.A0B;
        if (exploreTopicCluster == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = this.A0Q;
        C66882wF.A03(hashMap, str, exploreTopicCluster, AnonymousClass302.A00(str).A00);
        return hashMap;
    }

    public final void Bel() {
        this.A0A.Beh();
        this.A06.Bei();
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        C40181oE r1;
        this.A06.configureActionBar(r5);
        AnonymousClass2RO r3 = this.A06;
        C27301Hh r2 = this.A0X;
        C53262Sc r0 = this.A0A;
        r3.A9R(r2, r0.getScrollingViewProxy(), r0.ADq());
        AnonymousClass2RY r22 = this.A0H;
        C13150hy.A02(r5, "configurer");
        ExploreTopicCluster exploreTopicCluster = r22.A02;
        if (exploreTopicCluster != null) {
            r1 = exploreTopicCluster.A01;
        } else {
            r1 = null;
        }
        if (r1 == C40181oE.SHOPPING) {
            r5.A4N(Constants.A04, new C1667279r(r22));
            C33831dZ r12 = new C33831dZ();
            r12.A02 = C0003R.C0004drawable.instagram_business_outline_24;
            r12.A01 = C0003R.string.shopping_directory_suggested_shops_action_button_text;
            r12.A05 = new C1667179q(r22);
            r5.A4J(r12.A00());
        }
    }

    public final String getModuleName() {
        return AnonymousClass1DW.A00(Constants.ONE);
    }

    public final C06590Pq getSession() {
        return this.A0G;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass2RO r8;
        C52012Nb r13;
        boolean z;
        long j;
        int A022 = AnonymousClass0Z0.A02(-65388470);
        this.A0G = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass2M1 r5 = new AnonymousClass2M1(31784973, IgReactGeoGatingModule.SETTING_TYPE_FEED, AnonymousClass00B.A01);
        this.A01 = r5;
        r5.A0F(getContext(), this, C26441Dh.A00(this.A0G));
        super.onCreate(bundle);
        ExploreFragmentConfig exploreFragmentConfig = (ExploreFragmentConfig) this.mArguments.getParcelable("ExploreFragment.ARGUMENT_CONFIG");
        this.A00 = exploreFragmentConfig.A00;
        this.A0g = exploreFragmentConfig.A04;
        this.A0B = exploreFragmentConfig.A02;
        String str = exploreFragmentConfig.A03;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        this.A0Q = str;
        this.A0e = UUID.randomUUID().toString();
        AnonymousClass0C1 r3 = this.A0G;
        this.A02 = AnonymousClass0QT.A00(r3, this);
        this.A0f = AnonymousClass1F6.A00(r3).A08.A08.A01;
        this.A08 = new AnonymousClass2RM(this.A0G, this, this.A00, this.A0Q);
        this.A0c = new AnonymousClass2RN(getContext(), getActivity(), this, AnonymousClass1L8.A00(this), this.A0G, this, this.A0u, exploreFragmentConfig.A01, "topical_explore", exploreFragmentConfig.A02, (String) null);
        this.A0H = new AnonymousClass2RY(getActivity(), this.A0G, this.A0h, this.A0Q, this, this.A0B);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0R = bundle2.getString("topic");
        }
        if (this.A00 == 0) {
            Context context = getContext();
            AnonymousClass0C1 r10 = this.A0G;
            FragmentActivity activity = getActivity();
            C53002Rc r132 = new C53002Rc(context, (BaseFragmentActivity) activity, r10);
            AnonymousClass0C1 r4 = this.A0G;
            r8 = new AnonymousClass2RZ(context, r10, activity, this, r132, new C52932Qu(this, r4), this.A0x, this.A08, new C53012Rd(r4));
        } else {
            r8 = new AnonymousClass9WW(getContext(), this.A0B, this, this.A0c);
        }
        this.A06 = r8;
        Context context2 = getContext();
        this.A05 = new C41711qm(context2, getModuleName(), this.A0G);
        this.A0X = new C27301Hh(context2);
        this.A04 = C53062Ri.A00(this.A0G);
        Context context3 = getContext();
        AnonymousClass0C1 r7 = this.A0G;
        this.A07 = C53092Rl.A00(context3, r7, this, this.A0Q, ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.CONCURRENT_GRID_VIDEO_AUTOPLAY, "is_explore_enabled", false, (AnonymousClass04H) null)).booleanValue());
        this.A0Y = new C53182Ru();
        this.A0Z = C28021Kc.A00();
        this.A0V = AnonymousClass1CF.A00(this.A0G);
        C17640qZ r11 = C17640qZ.A00;
        this.A0d = r11.A09(this, this, this.A0G, QuickPromotionSlot.EXPLORE, r11.A03().A00());
        this.A0W = new AnonymousClass1LO(this, true, getContext(), this.A0G);
        AnonymousClass0C1 r72 = this.A0G;
        C53192Rv r133 = new C53192Rv(r72, new C53222Ry(r72), this.A0r, this, (AnonymousClass2PB) null);
        Context context4 = getContext();
        AnonymousClass0C1 r82 = this.A0G;
        AnonymousClass2MJ A002 = new AnonymousClass2S0(context4, r82, this, this.A07, this.A0s, this.A0t, this.A0Y, this.A0W, r133, true).A00();
        A002.A01(new AnonymousClass2SE());
        AnonymousClass2S1 r134 = new AnonymousClass2S1(context4, this, r133, r82, A002);
        AnonymousClass0C1 r9 = this.A0G;
        AnonymousClass2SV r83 = new AnonymousClass2SV(r9);
        r83.A05 = this.A0q;
        r83.A04 = r134;
        r83.A06 = r133;
        r83.A07 = this.A07;
        r83.A02 = this;
        r83.A08 = this.A0j;
        r83.A03 = this.A0Z;
        r83.A0B = this.A00 == 0 ? new AnonymousClass2SR[]{new AnonymousClass2SS(), new AnonymousClass2SQ(true)} : new AnonymousClass2SR[]{new AnonymousClass2SQ(false)};
        r83.A0A = ((Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.EXPLORE_RECYCLERVIEW, "increase_view_pool", false, (AnonymousClass04H) null)).booleanValue();
        r83.A00 = ((Double) AnonymousClass0L6.A02(this.A0G, AnonymousClass0L7.EXPLORE_GRID_SCROLL_FRICTION, "scroll_friction_factor", Double.valueOf(1.0d), (AnonymousClass04H) null)).doubleValue();
        this.A0A = (C53262Sc) r83.A00();
        this.A0F = new AnonymousClass1UY(this.A0G, new AnonymousClass1UZ(this), this);
        if (((Boolean) AnonymousClass0L6.A02(this.A0G, AnonymousClass0L7.EXPLORE_PEEK_REDESIGN, "show_redesign", false, (AnonymousClass04H) null)).booleanValue()) {
            r13 = new CZ3(getContext(), this.A0G, this, this.mFragmentManager, this.A0A.ADp(), this, this);
        } else {
            r13 = new C52002Na(getContext(), this, this.mFragmentManager, false, this.A0G, this, this, this.A0A.ADp());
        }
        C52012Nb r135 = r13;
        this.A0D = r135;
        r135.Bh8(this);
        C256419q r52 = new C256419q(getActivity(), this.A0G, this, 23592967);
        this.A0E = new C29631Qq(this.A0G, new C53362Sm(this));
        this.A0a = new C53372Sn(getContext(), this.A0G, this.A0v);
        this.A0b = new C53382So(this.A0G, r133, this.A0A, this.A07, this);
        C53472Sx r136 = new C53472Sx(this.A0e, this.A0G, this, getActivity(), this, this.A0w);
        this.A03 = r136;
        registerLifecycleListener(r136);
        AnonymousClass1HU r42 = new AnonymousClass1HU();
        r42.A0C(r52);
        r42.A0C(this.A0W);
        r42.A0C(this.A0E);
        r42.A0C(this.A0D);
        r42.A0C(this.A0d);
        r42.A0C(this.A0Y);
        r42.A0C(this.A0a);
        r42.A0C(this.A0b);
        registerLifecycleListenerSet(r42);
        this.A0C = new AnonymousClass2T2(this.A0Z, getContext(), this.A0G, this, this.A0W, this.A0A.ADo(), this.A0Q, this.A0B);
        this.A0A.BZw(r52, this.A0X);
        C23300zv A003 = C23300zv.A00(this.A0G);
        A003.A02(AnonymousClass2T9.class, this.A0l);
        A003.A02(C52172Ns.class, this.A0m);
        if (this.A0f) {
            A04();
        }
        if (this.A00 == 0) {
            AnonymousClass0C1 r92 = this.A0G;
            String str2 = this.A0Q;
            boolean A032 = C37991kY.A01(r92).A03();
            C37991kY A012 = C37991kY.A01(this.A0G);
            if (A012.A03()) {
                j = System.currentTimeMillis() - A012.A00;
            } else {
                j = -1;
            }
            AnonymousClass2TA r32 = new AnonymousClass2TA(AnonymousClass0QT.A00(r92, this).A02("explore_topical_session_start"));
            r32.A07("age_of_prefetch_ms", Long.valueOf(j));
            r32.A04("is_prefetch", Boolean.valueOf(A032));
            r32.A08("session_id", str2);
            r32.A01();
        }
        String A033 = A03(this);
        List list = (List) this.A04.A05.A00(A033);
        if (list == null || list.isEmpty()) {
            this.A09 = new AnonymousClass2TB(new C28341Li(getContext(), this.A0G, AnonymousClass1L8.A00(this)));
            A08(true, false);
        } else {
            String str3 = (String) this.A04.A03.A00(A033);
            Context context5 = getContext();
            AnonymousClass0C1 r15 = this.A0G;
            AnonymousClass1L8 A004 = AnonymousClass1L8.A00(this);
            Boolean bool = (Boolean) this.A04.A00.A00(A033);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.A09 = new AnonymousClass2TB(new C28341Li(context5, r15, A004, str3, Boolean.valueOf(z).booleanValue()));
            this.A0A.A01.A06(list, str3);
            this.A0c.BCm((C218329bD) this.A04.A04.A00(A033));
        }
        if (!this.A0f) {
            A04();
        }
        AnonymousClass0Z0.A09(-1320582646, A022);
    }

    public final boolean AgJ() {
        if (AgL()) {
            return this.A0A.Abq();
        }
        return true;
    }

    public final C06270Ok BYN() {
        C06270Ok A002 = C06270Ok.A00();
        this.A06.A5W(A002);
        ExploreTopicCluster exploreTopicCluster = this.A0B;
        if (exploreTopicCluster != null) {
            A002.A09("topic_cluster_id", exploreTopicCluster.A05);
            A002.A09("topic_cluster_title", exploreTopicCluster.A07);
            A002.A09("topic_cluster_type", exploreTopicCluster.A01.A00);
            A002.A09("topic_cluster_debug_info", exploreTopicCluster.A04);
            A002.A09("session_id", this.A0Q);
        }
        return A002;
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(720776757);
        this.A0U = SystemClock.elapsedRealtime();
        AnonymousClass0Z0.A0A(649472866, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r6 == false) goto L_0x0065;
     */
    public final void onAppForegrounded() {
        boolean z;
        DiscoveryRecyclerView discoveryRecyclerView;
        int i;
        int A032 = AnonymousClass0Z0.A03(-963239964);
        C53262Sc r7 = this.A0A;
        if (SystemClock.elapsedRealtime() - this.A0U >= 1200000 && (discoveryRecyclerView = r7.A02) != null) {
            boolean z2 = true;
            if (!(r7.A01 == null || discoveryRecyclerView == null || discoveryRecyclerView.getChildCount() == 0)) {
                FlowingGridLayoutManager flowingGridLayoutManager = r7.A01;
                if (flowingGridLayoutManager.A0S() != 0 && !flowingGridLayoutManager.A08.isEmpty()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= flowingGridLayoutManager.A08.size()) {
                            break;
                        }
                        i = ((Integer) flowingGridLayoutManager.A08.get(i2)).intValue();
                        if (flowingGridLayoutManager.A06.contains(flowingGridLayoutManager.A07.A00(i))) {
                            break;
                        }
                        i2++;
                    }
                }
                i = -1;
                if (i != 0) {
                    z2 = false;
                }
            }
            z = true;
        }
        z = false;
        if (z) {
            A07(this, false);
        }
        AnonymousClass0Z0.A0A(1083582581, A032);
    }

    public final boolean onBackPressed() {
        C34071dx A0T2 = C17020pY.A00().A0T(getActivity());
        if (this.A0D.onBackPressed()) {
            return true;
        }
        if (A0T2 == null || !A0T2.A0b()) {
            return false;
        }
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1436834244);
        View inflate = layoutInflater.inflate(this.A0A.AOq(), viewGroup, false);
        this.A06.Ayj(layoutInflater, viewGroup);
        C11130eT r2 = C11130eT.A01;
        r2.A02(C33661dH.class, this.A0p);
        r2.A02(AnonymousClass1FF.class, this.A0n);
        C23300zv.A00(this.A0G).A02(C61572m1.class, this.A0o);
        AnonymousClass0Z0.A09(-1178653587, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-566555920);
        super.onDestroy();
        C23300zv A002 = C23300zv.A00(this.A0G);
        A002.A03(AnonymousClass2T9.class, this.A0l);
        A002.A03(C52172Ns.class, this.A0m);
        AnonymousClass1F6.A00(this.A0G).A07(getModuleName());
        AnonymousClass0Z0.A09(389133246, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1239787221);
        super.onDestroyView();
        this.A0A.Azh();
        this.A06.Azh();
        C11130eT r2 = C11130eT.A01;
        r2.A03(C33661dH.class, this.A0p);
        r2.A03(AnonymousClass1FF.class, this.A0n);
        C23300zv.A00(this.A0G).A03(C61572m1.class, this.A0o);
        AnonymousClass0Q7.A03().A0D(this);
        AnonymousClass0Z0.A09(-816058742, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-561029359);
        this.A0A.BEz();
        this.A07.BaO();
        super.onPause();
        this.A06.BE0();
        C34071dx A0T2 = C17020pY.A00().A0T(getActivity());
        if (A0T2 != null) {
            A0T2.A0T();
        }
        this.A0X.A0C(this.A0A.getScrollingViewProxy());
        AnonymousClass1F6.A00(this.A0G).A04();
        this.A0V.Bba(this.A0k);
        AnonymousClass0C1 r2 = this.A0G;
        C13740j9 r0 = ((C42971tY) r2.AVA(C42971tY.class, new C42981tZ(r2))).A00;
        if (r0 != null) {
            r0.A08();
        }
        AnonymousClass0Z0.A09(-1118671192, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1866034560);
        super.onResume();
        this.A06.BJx();
        this.A06.A9S(this.A0X);
        this.A0A.BJx();
        AnonymousClass1F6.A00(this.A0G).A05();
        C34071dx A0T2 = C17020pY.A00().A0T(getActivity());
        if (A0T2 != null && A0T2.A0a()) {
            A0T2.A0U((RectF) null, (RectF) null, (AnonymousClass309) null);
        }
        this.A0V.A4p(this.A0k);
        C35111fp.A00(this.A0G).A01(this);
        C05680Ln.ADc.A02(this.A0G);
        AnonymousClass0Z0.A09(1591652767, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A.BVg(view, AgL());
        this.A0A.Bm9(this);
        AnonymousClass0Q7.A03().A0B(this);
        this.A0d.BL4();
    }

    public final void BZo(AbsListView.OnScrollListener onScrollListener) {
    }

    public final void Bs9(AbsListView.OnScrollListener onScrollListener) {
    }
}
