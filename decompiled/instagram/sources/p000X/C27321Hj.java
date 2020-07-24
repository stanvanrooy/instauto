package p000X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.common.p004ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.common.p004ui.widget.recyclerview.MainFeedRecyclerView;
import com.instagram.feed.tooltip.HideLikeCountAuthorTooltipManager;
import com.instagram.igtv.feed.IGTVFeedController;
import com.instagram.notifications.badging.p007ui.component.ToastingBadge;
import com.instagram.p009ui.listview.StickyHeaderListView;
import com.instagram.p009ui.widget.expanding.ExpandingListView;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Hj  reason: invalid class name and case insensitive filesystem */
public final class C27321Hj extends C27331Hk implements C27371Ho, AnonymousClass1HK, AnonymousClass0Q6, AnonymousClass1HL, AnonymousClass1HM, AnonymousClass1HO, C27381Hp, C27391Hq, C27401Hr, C27411Hs, AnonymousClass1Ht, C27421Hu, C27131Gp, C27431Hv {
    public static boolean A1r;
    public static final long A1s = TimeUnit.MINUTES.toMillis(5);
    public static final Class A1t = C27321Hj.class;
    public static final Long A1u = 43200000L;
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public Handler A04 = new Handler();
    public AnonymousClass1CH A05;
    public C27301Hh A06;
    public C11200ea A07;
    public C27511Id A08;
    public C31151Wq A09;
    public C29611Qo A0A;
    public C29601Qn A0B;
    public AnonymousClass1VH A0C;
    public C28981Od A0D;
    public C31011Wc A0E;
    public AnonymousClass1RD A0F;
    public AnonymousClass1WQ A0G;
    public C29151Ou A0H;
    public AnonymousClass1PE A0I;
    public AnonymousClass1W4 A0J;
    public C27581Ik A0K;
    public AnonymousClass1LV A0L;
    public C27541Ig A0M;
    public C27641Iq A0N;
    public AnonymousClass1YO A0O;
    public C28521Mb A0P;
    public C29101Op A0Q;
    public C29111Oq A0R;
    public AnonymousClass1WZ A0S;
    public AnonymousClass1OC A0T;
    public AnonymousClass1NR A0U;
    public AnonymousClass0C1 A0V;
    public AnonymousClass1KT A0W;
    public StickyHeaderListView A0X;
    public AnonymousClass0jO A0Y;
    public C36251hk A0Z;
    public Integer A0a = Constants.ZERO;
    public Future A0b;
    public boolean A0c;
    public boolean A0d = false;
    public boolean A0e;
    public boolean A0f = false;
    public boolean A0g = false;
    public boolean A0h;
    public boolean A0i = false;
    public boolean A0j = false;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public C31121Wn A0o;
    public C11200ea A0p;
    public AnonymousClass1IY A0q;
    public C35201fy A0r;
    public C28051Kf A0s;
    public C27661Is A0t;
    public C36281hn A0u;
    public AnonymousClass1L4 A0v;
    public C29631Qq A0w;
    public HideLikeCountAuthorTooltipManager A0x;
    public AnonymousClass1RD A0y;
    public AnonymousClass1RD A0z;
    public AnonymousClass1RB A10;
    public IGTVFeedController A11;
    public AnonymousClass223 A12;
    public C30981Vz A13;
    public C28541Md A14;
    public C30261Td A15;
    public C29071Om A16;
    public AnonymousClass2FE A17;
    public AnonymousClass1YI A18;
    public C30901Vq A19;
    public AnonymousClass1OV A1A;
    public C29021Oh A1B;
    public C32591bW A1C;
    public ExpandingListView A1D;
    public AnonymousClass1XN A1E;
    public C29851Rn A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K = false;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public final AnonymousClass1I4 A1Q = new AnonymousClass1I4();
    public final C11200ea A1R = new AnonymousClass1IQ(this);
    public final C11200ea A1S = new AnonymousClass1IP(this);
    public final AnonymousClass1I1 A1T = new AnonymousClass1I1();
    public final AnonymousClass1IU A1U = new AnonymousClass1IU();
    public final AnonymousClass1I5 A1V = new AnonymousClass1I5();
    public final boolean A1W = ((Boolean) C05640Lj.A00(AnonymousClass0L7.ALWAYS_USE_SERVER_RECENTS, "is_enabled", false)).booleanValue();
    public final C11200ea A1X = new AnonymousClass1IL(this);
    public final C11200ea A1Y = new AnonymousClass1IJ(this);
    public final C11200ea A1Z = new AnonymousClass1I9(this);
    public final C11200ea A1a = new AnonymousClass1IC(this);
    public final C11200ea A1b = new AnonymousClass1IO(this);
    public final C11200ea A1c = new AnonymousClass1IA(this);
    public final C11200ea A1d = new AnonymousClass1IB(this);
    public final C11200ea A1e = new AnonymousClass1IM(this);
    public final C11200ea A1f = new AnonymousClass1IR(this);
    public final C11200ea A1g = new AnonymousClass1IK(this);
    public final C11200ea A1h = new AnonymousClass1I7(this);
    public final C11200ea A1i = new AnonymousClass1I8(this);
    public final C11200ea A1j = new AnonymousClass1IN(this);
    public final AnonymousClass0O9 A1k = new AnonymousClass1IF(this);
    public final AnonymousClass0O9 A1l = new AnonymousClass1IG(this);
    public final AnonymousClass1I2 A1m = new AnonymousClass1I2();
    public final AnonymousClass1ID A1n = new AnonymousClass1ID();
    public final AnonymousClass1IS A1o = new AnonymousClass1IS(this);
    public final AnonymousClass1IH A1p = new AnonymousClass1IH(this);
    public final C256219o A1q = new AnonymousClass1II(this);

    public final boolean AbR() {
        return false;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean AhS() {
        return true;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void B9d(String str) {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 64206) {
                this.A0o.A05(i, i2, intent);
            }
            if (i == 2) {
                if (this.A09 == null) {
                    this.A09 = C16330oQ.A00.A04(getContext(), (C31131Wo) getRootActivity(), this.A0V);
                }
                this.A09.Bq6(intent.getData(), 2, false, (String) null);
            } else if (i == 11) {
                if (AnonymousClass1DN.A01()) {
                    ((C26371Cz) getRootActivity()).Bgv(AnonymousClass1DU.FEED.toString());
                    C52362Om r3 = new C52362Om(getActivity(), this.A0V);
                    r3.A0B = true;
                    r3.A02 = C18980sj.A00.A00().A02(C52902Qq.A00(this.A0V, "feed_business_conversion").A03());
                    r3.A02();
                } else {
                    ((C26371Cz) getRootActivity()).Bgv(AnonymousClass1DU.PROFILE.toString());
                }
            } else if (i == 100) {
                this.A0l = true;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public static AnonymousClass2FE A00(C27321Hj r3) {
        if (r3.A17 == null) {
            r3.A17 = new AnonymousClass2FE(r3.A0V, r3, r3, r3.A0W);
        }
        return r3.A17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2 != p000X.Constants.A0C) goto L_0x0013;
     */
    private void A01() {
        boolean z;
        if (!this.A0f) {
            AnonymousClass0h8 r0 = C12600h4.A00().A00;
            if (r0 != null) {
                Integer num = r0.A0C;
                z = true;
            }
            z = false;
            if (z) {
                C27581Ik r2 = this.A0K;
                Integer num2 = Constants.ZERO;
                r2.A00 = num2;
                r2.A01 = num2;
                AnonymousClass0ZA.A08(r2.A05, r2.A07);
                r2.A03 = false;
                r2.A04 = false;
                r2.A02 = false;
                r2.A0C = false;
                C12600h4.A00().A06(this.A0K);
            }
            AnonymousClass1WZ r3 = this.A0S;
            r3.A06.A02(AnonymousClass14J.class, r3.A01);
            AnonymousClass1WZ.A00(r3);
            C31011Wc r1 = this.A0E;
            r1.A07 = false;
            B3G b3g = r1.A04;
            if (b3g != null) {
                r1.A04 = b3g;
                C27321Hj r02 = r1.A0C;
                if (r02 != null) {
                    r02.A0B(r1);
                }
                C31011Wc.A01(r1);
            }
            C27541Ig r12 = this.A0M;
            if (r12 != null) {
                r12.A00 = C33921di.A00(r12.A03).A02;
            }
            boolean z2 = A1r;
            A1r = false;
            if (z2) {
                getScrollingViewProxy().AaK().post(new C152606ff(this));
            }
            C33941dk r5 = new C33941dk();
            ViewGroup viewGroup = AnonymousClass1EW.A03(getActivity()).A07;
            this.A06.A0B((float) this.A02, new C33961dm(this, r5), viewGroup);
            if (A0G()) {
                if (!this.A0e) {
                    this.A0C.BJx();
                    this.A0e = true;
                }
                this.A08.A3j(this.A0D);
            }
            AnonymousClass1YO r6 = this.A0O;
            if (!AnonymousClass1DU.FEED.toString().equals(C26441Dh.A00(this.A0V).A04)) {
                switch (r6.A01.intValue()) {
                    case 0:
                        if (r6.A06.A06() && r6.A0E()) {
                            C28521Mb r52 = r6.A07;
                            if (r52.A02 == null) {
                                r52.A02 = (Boolean) AnonymousClass0L6.A02(r52.A0H, AnonymousClass0L7.FEED_SHORT_SESSION_NEW_POST_PILL, "heavyweight_refresh_on_feed_reappeared", false, (AnonymousClass04H) null);
                            }
                            if (r52.A02.booleanValue()) {
                                AnonymousClass1YO.A00(r6, Constants.A0N);
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (r6.A0F() && r6.A0E()) {
                            C28521Mb r53 = r6.A07;
                            if (r53.A08 == null) {
                                r53.A08 = (Boolean) AnonymousClass0L6.A02(r53.A0H, AnonymousClass0L7.MAINFEED_LIGHTWEIGHT_PILL, "lightweight_refresh_on_feed_reappeared", false, (AnonymousClass04H) null);
                            }
                            if (r53.A08.booleanValue()) {
                                AnonymousClass1YO.A01(r6, false);
                                break;
                            }
                        }
                        break;
                }
            }
        }
        if (!this.A0e) {
            this.A0C.BJx();
            this.A0e = true;
        }
        this.A08.A3j(this.A0D);
        if (!this.A0f) {
            this.A05.A4p(this);
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.CRITICAL_PATH_MANAGER, "move_prefetch_location", false, (AnonymousClass04H) null)).booleanValue()) {
                C12000g1.A01.A01(new C34061dw(this));
            } else {
                Looper.myQueue().addIdleHandler(new AnonymousClass22M(this));
            }
            C34071dx A0V2 = C17020pY.A00().A0V(getActivity(), this.A0V);
            if (A0V2 != null && A0V2.A0a() && A0V2.A0D == AnonymousClass1OY.FEED_ITEM_HEADER) {
                A0V2.A0R();
            }
            Integer num3 = this.A0a;
            if (num3 != Constants.ZERO) {
                this.A0L.A03(num3, (Map) null, (String) null);
                this.A0a = Constants.ZERO;
            }
            C35041fi A002 = C35041fi.A00(this.A0V);
            C35041fi.A00(this.A0V);
            A002.A01("main_feed_fragment_resume");
            C35111fp.A00(this.A0V).A01(this);
            AnonymousClass1F6.A00(this.A0V);
            C12670hC.A02();
            if (C22120xs.A01() && this.A1W) {
                C22120xs.A00().A06(this.A0V);
            }
            C23300zv A003 = C23300zv.A00(this.A0V);
            A003.A02(C35131fr.class, this.A1S);
            A003.A02(C35141fs.class, this.A1R);
            A003.A02(C35151ft.class, this.A07);
            this.A0f = true;
        }
    }

    public static void A03(C27321Hj r4) {
        View view = r4.mView;
        if (view != null) {
            C06220Of.A0E(view);
        }
        AnonymousClass1D1 A082 = r4.A08();
        float f = r4.A08().AXV().A01;
        float A042 = A082.AIZ().A04();
        if (f == A042) {
            r4.Bel();
            return;
        }
        C27171Gt r1 = new C27171Gt();
        r1.A00 = A042;
        r1.A0B = true;
        r1.A09 = "instagram_title";
        A082.Bsx(r1);
    }

    public static void A04(C27321Hj r4) {
        if (r4.A0f) {
            C16980pU.A00.A01(r4.A0V).A00();
            AnonymousClass1WZ r3 = r4.A0S;
            r3.A06.A03(AnonymousClass14J.class, r3.A01);
            if (r3.A03.size() > 0) {
                HashMap hashMap = new HashMap(r3.A03);
                r3.A03.clear();
                for (Map.Entry value : hashMap.entrySet()) {
                    AnonymousClass1WZ.A01(r3, (PendingMedia) value.getValue());
                }
            }
            AnonymousClass0ZA.A02(r3.A00, 0);
            C31011Wc r2 = r4.A0E;
            r2.A07 = true;
            AnonymousClass0ZA.A02(r2.A0A, 3);
            C27321Hj r0 = r2.A0C;
            if (r0 != null) {
                r0.A0C(r2);
            }
            Dialog dialog = r2.A01;
            if (dialog != null) {
                dialog.dismiss();
            }
            r4.A06.A0C(r4.getScrollingViewProxy());
            r4.A05.Bba(r4);
            r4.A0O.A0B();
        }
        if (r4.A0e) {
            r4.A0C.BE0();
            r4.A0e = false;
        }
        r4.A08.BbF(r4.A0D);
        View view = r4.mView;
        if (view != null) {
            C06220Of.A0E(view);
        }
        FragmentActivity activity = r4.getActivity();
        if (!(activity == null || activity.getCurrentFocus() == null)) {
            r4.getActivity().getCurrentFocus().clearFocus();
        }
        if (r4.A0f) {
            AnonymousClass1F6.A00(r4.A0V).A04();
            Future future = r4.A0b;
            if (future != null) {
                future.cancel(true);
            }
            C29101Op r22 = r4.A0Q;
            r22.A02 = null;
            r22.A00 = -1;
            C23300zv A002 = C23300zv.A00(r4.A0V);
            A002.A03(C35131fr.class, r4.A1S);
            A002.A03(C35141fs.class, r4.A1R);
            r4.A0f = false;
        }
    }

    public static void A05(C27321Hj r2) {
        View AXd = ((C26371Cz) r2.getRootActivity()).AXd(AnonymousClass1DU.PROFILE.toString());
        if (!r2.A0d && (AXd instanceof ToastingBadge)) {
            ToastingBadge.getViewModel((ToastingBadge) AXd).A0H.A00(false);
        }
    }

    /* renamed from: A07 */
    public final AnonymousClass1YI getScrollingViewProxy() {
        LinearLayoutManagerCompat linearLayoutManagerCompat;
        if (this.A18 == null) {
            ViewGroup viewGroup = (ViewGroup) this.mView.findViewById(16908298);
            if (viewGroup instanceof ListView) {
                View findViewById = this.mView.findViewById(16908292);
                if (findViewById != null) {
                    ((ListView) viewGroup).setEmptyView(findViewById);
                }
                AnonymousClass0C1 r4 = this.A0V;
                AnonymousClass0L7 r3 = AnonymousClass0L7.NF_SCROLL_FRICTION;
                if (((Boolean) AnonymousClass0L6.A02(r4, r3, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    double doubleValue = ((Double) AnonymousClass0L6.A02(this.A0V, r3, "multiplier", Double.valueOf(1.0d), (AnonymousClass04H) null)).doubleValue();
                    if (doubleValue <= 0.0d) {
                        doubleValue = 1.0d;
                    }
                    ((ListView) viewGroup).setFriction((float) (((double) ViewConfiguration.getScrollFriction()) * doubleValue));
                }
            } else {
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                if (this.A1O) {
                    linearLayoutManagerCompat = new FastScrollingLinearLayoutManager(getContext());
                } else {
                    linearLayoutManagerCompat = new LinearLayoutManagerCompat();
                }
                AnonymousClass0C1 r32 = this.A0V;
                AnonymousClass0L7 r2 = AnonymousClass0L7.MAINFEED_RECYCLERVIEW;
                if (((Boolean) AnonymousClass0L6.A02(r32, r2, "cache_visible_item_positions", false, (AnonymousClass04H) null)).booleanValue()) {
                    linearLayoutManagerCompat.A02 = true;
                }
                recyclerView.setLayoutManager(linearLayoutManagerCompat);
                if (((Boolean) AnonymousClass0L6.A02(this.A0V, r2, "disable_prefetch", false, (AnonymousClass04H) null)).booleanValue()) {
                    C31391Ya r1 = recyclerView.A0L;
                    if (false != r1.A0C) {
                        r1.A0C = false;
                        r1.A05 = 0;
                        RecyclerView recyclerView2 = r1.A0A;
                        if (recyclerView2 != null) {
                            recyclerView2.A0x.A04();
                        }
                    }
                }
                recyclerView.setItemAnimator((C31341Xr) null);
                if (((Boolean) AnonymousClass0L6.A02(this.A0V, r2, "set_has_fixed_size", false, (AnonymousClass04H) null)).booleanValue()) {
                    recyclerView.setHasFixedSize(true);
                }
                AnonymousClass0C1 r42 = this.A0V;
                AnonymousClass0L7 r33 = AnonymousClass0L7.MAINFEED_RECYCLERVIEW;
                int intValue = ((Integer) AnonymousClass0L6.A02(r42, r33, "set_item_view_cache_size", 2, (AnonymousClass04H) null)).intValue();
                if (intValue > 0) {
                    recyclerView.setItemViewCacheSize(intValue);
                }
                this.A1q.A02 = (int) C06220Of.A03(recyclerView.getContext(), ((Integer) AnonymousClass0L6.A02(this.A0V, r33, "on_scroll_threshold_dp", 0, (AnonymousClass04H) null)).intValue());
            }
            this.A18 = (AnonymousClass1YI) AnonymousClass1YG.A00(viewGroup);
        }
        return this.A18;
    }

    public final AnonymousClass1D1 A08() {
        AnonymousClass1HD r1 = this.mParentFragment;
        if (r1 instanceof AnonymousClass1D1) {
            return (AnonymousClass1D1) r1;
        }
        return (AnonymousClass1D1) getRootActivity();
    }

    public final void A0A() {
        if (this.mView != null && getScrollingViewProxy().AaK().getHeight() != 0) {
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.LOW_RAM_ANIMATIONS, "remove_scroll_animations", false, (AnonymousClass04H) null)).booleanValue()) {
                getScrollingViewProxy().BkR(0);
            } else {
                getScrollingViewProxy().Bem(this);
            }
        }
    }

    public final void A0B(C256219o r2) {
        this.A1T.A0E(r2);
    }

    public final void A0C(C256219o r2) {
        this.A1T.A01.remove(r2);
    }

    public final void A0D(Map map) {
        C29071Om r1 = this.A16;
        if (!r1.AgL()) {
            if (r1.AfR()) {
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("action_bar_feed_retry", this);
                C55262aK.A01(A002, getContext());
                AnonymousClass0WN.A01(this.A0V).BcG(A002);
            }
            C29101Op r2 = this.A0Q;
            C51292Kb r12 = C51292Kb.HeadFetch;
            C12670hC.A02();
            if (r2.A02 == null) {
                r2.A02 = r12;
                r2.A00 = r2.A04.now();
            }
            this.A0h = true;
            this.A0L.A03(Constants.A0N, map, (String) null);
            this.A11.A01();
        }
        AnonymousClass1W4 r13 = this.A0J;
        if (!r13.A09.A07()) {
            r13.A06(Constants.A0N);
        }
    }

    public final void A0E(boolean z) {
        if (this.mView != null) {
            getScrollingViewProxy().setIsLoading(z);
        }
        if (!z) {
            this.A0h = false;
        }
        AnonymousClass1XN r0 = this.A1E;
        if (r0 != null) {
            r0.setIsLoading(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00da, code lost:
        if (r0 > 0) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00de, code lost:
        if (r1 != false) goto L_0x00e0;
     */
    public final void A0F(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("onFeedRequestFinished", -87705389);
        }
        try {
            C29101Op r2 = this.A0Q;
            C12670hC.A02();
            if (r2.isActive()) {
                if (z) {
                    long now = r2.A04.now();
                    AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_visible_load", r2.A05);
                    A002.A0G(DatePickerDialogModule.ARG_MODE, r2.A02.A00);
                    A002.A0F("time_elapsed", Long.valueOf(now - r2.A00));
                    A002.A0E("version", 1);
                    r2.A01.BcG(A002);
                }
                r2.A02 = null;
                r2.A00 = -1;
            }
            if (z) {
                this.A0w.A00();
                if (z2 && ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.REACT_NATIVE_OTA_KILL_SWITCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    if (!((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.REACTNATIVE_REALTIME_OTA, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || !((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.REACTNATIVE_REALTIME_OTA, "is_buffer_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
                        AnonymousClass234 A012 = AnonymousClass234.A01(getActivity(), this.A0V);
                        MessageQueue myQueue = Looper.myQueue();
                        synchronized (A012) {
                            if (!A012.A01) {
                                A012.A02 = true;
                                myQueue.addIdleHandler(new AnonymousClass45U(A012));
                            }
                        }
                    } else {
                        FragmentActivity activity = getActivity();
                        AnonymousClass0C1 r7 = this.A0V;
                        int intValue = ((Integer) C05680Ln.ASO.A01(r7)).intValue();
                        C14570l7 A003 = C14570l7.A00(activity);
                        long j = (long) intValue;
                        int A022 = A003.A02();
                        int A032 = A003.A01.A03("check_updates_native_version", 0);
                        long A042 = A003.A01.A04("check_updates_time", 0);
                        if (A022 == A032) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis >= A042) {
                                int i = (currentTimeMillis > (A042 + j) ? 1 : (currentTimeMillis == (A042 + j) ? 0 : -1));
                                z4 = false;
                            }
                            z4 = true;
                            z3 = false;
                        }
                        z3 = true;
                        if (z3) {
                            Looper.myQueue().addIdleHandler(new C472322t(activity, r7));
                        }
                    }
                }
                boolean A0T2 = this.A0I.A0T();
                StickyHeaderListView stickyHeaderListView = this.A0X;
                if (stickyHeaderListView != null) {
                    if (A0T2) {
                        stickyHeaderListView.setBackgroundColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_background));
                    } else if (stickyHeaderListView.getBackground() != null) {
                        this.A0X.setBackgroundResource(0);
                    }
                }
            }
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(1895228401);
            }
        } catch (Throwable th) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(994980565);
            }
            throw th;
        }
    }

    public final C27301Hh AMt() {
        return this.A06;
    }

    public final String APo() {
        AnonymousClass1NJ r0;
        int A0J2 = this.A0I.A0J();
        if (A0J2 >= 0) {
            r0 = ((AnonymousClass1NG) this.A0I.A0T.A04(A0J2)).A05();
        } else {
            r0 = null;
        }
        if (r0 != null) {
            return r0.APo();
        }
        return null;
    }

    public final Integer APs() {
        return Constants.ZERO;
    }

    public final C31561Yu AWq(String str) {
        return this.A0t.A00.A02(str);
    }

    public final void BMe() {
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("main_feed_loading_more", this);
        A002.A0E("position", Integer.valueOf(this.A0I.getItemCount()));
        if (this.A0L.A02() != null) {
            A002.A0F("last_feed_update_time", this.A0L.A02());
        }
        AnonymousClass0WN.A01(this.A0V).BcG(A002);
    }

    public final void BXE(boolean z) {
        if (z) {
            this.A06.A0A();
            if (this.mView != null) {
                getScrollingViewProxy().AaK().requestLayout();
            }
        }
        this.A06.A07 = !z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void Bel() {
        boolean z;
        if (!this.mDetached && getScrollingViewProxy() != null) {
            AnonymousClass1YO r2 = this.A0O;
            switch (r2.A01.intValue()) {
                case 0:
                    if (r2.A06.A06()) {
                        AnonymousClass1YO.A00(r2, Constants.ONE);
                        z = true;
                        break;
                    }
                case 1:
                    if (r2.A0F() && r2.A0E()) {
                        AnonymousClass1YO.A01(r2, false);
                        z = true;
                        break;
                    }
                default:
                    z = false;
                    break;
            }
            if (!z) {
                A0A();
                AnonymousClass1W4 r0 = this.A0J;
                if (r0 != null) {
                    r0.A05();
                }
                if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.PTR_ON_BACK_BUTTON, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    Long A022 = this.A0L.A02();
                    long millis = TimeUnit.SECONDS.toMillis((long) ((Integer) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.PTR_ON_BACK_BUTTON, "back_button_cooldown_seconds", 0, (AnonymousClass04H) null)).intValue());
                    if (A022 == null || System.currentTimeMillis() - A022.longValue() > millis) {
                        A09();
                        A0D((Map) null);
                    } else if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.PTR_ON_BACK_BUTTON, "always_resort_stories_tray", false, (AnonymousClass04H) null)).booleanValue()) {
                        AnonymousClass0ZA.A09(this.A04, new C152626fi(this), 250, -439441640);
                    }
                }
            }
        }
    }

    public final void configureActionBar(AnonymousClass1EX r15) {
        View.OnClickListener r9;
        View.OnClickListener r10;
        View.OnClickListener r11;
        View.OnClickListener r12;
        View.OnLongClickListener r13;
        if (this.mView != null) {
            AnonymousClass1EX r8 = r15;
            r15.BmP(this);
            C27541Ig r7 = this.A0M;
            AnonymousClass11J.A00(r7);
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEEDFRAG_LEAKS, "is_title_click_lstnr_fixes", false, (AnonymousClass04H) null)).booleanValue()) {
                r9 = new C33721dO(this.A1p);
            } else {
                r9 = new C479626c(this);
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAIN_FEEDFRAGMENT_MEMORY_LEAK, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                r10 = new C33731dP(this.A1p);
            } else {
                r10 = new C479726d(this);
            }
            AnonymousClass0C1 r3 = this.A0V;
            AnonymousClass0L7 r2 = AnonymousClass0L7.MAINFEEDFRAG_LEAKS;
            if (((Boolean) AnonymousClass0L6.A02(r3, r2, "is_direct_click_lstnr_fixed", false, (AnonymousClass04H) null)).booleanValue()) {
                r11 = new C33741dQ(this.A1p);
            } else {
                r11 = new C479826e(this);
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, r2, "is_right_panel_listener_for_profile_btn_fixed", false, (AnonymousClass04H) null)).booleanValue()) {
                r12 = new C33751dR(this.A1p);
            } else {
                r12 = new C479926f(this);
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, r2, "is_right_panel_long_click_lstnr_fixed", false, (AnonymousClass04H) null)).booleanValue()) {
                r13 = new C33761dS(this.A1p);
            } else {
                r13 = new C480026g(this);
            }
            r7.A05(r8, r9, r10, r11, r12, r13);
            ViewGroup AYU = r15.AYU();
            AYU.setContentDescription(AYU.getResources().getString(C0003R.string.scroll_to_top));
            ImageView imageView = this.A0M.A01;
            if (imageView != null) {
                this.A0U.A00(this.A0T, QPTooltipAnchor.DIRECT_ICON, imageView);
            }
            IGTVFeedController iGTVFeedController = this.A11;
            FragmentActivity activity = getActivity();
            if (((Boolean) AnonymousClass0L6.A02(iGTVFeedController.A03, AnonymousClass0L7.IGTV_HOME_ICON, "show_home_icon", false, (AnonymousClass04H) null)).booleanValue()) {
                C33831dZ r1 = new C33831dZ();
                r1.A04 = iGTVFeedController.A00;
                r1.A01 = C0003R.string.igtv_app_name;
                r1.A05 = new AnonymousClass2JL(iGTVFeedController, activity);
                iGTVFeedController.mEntryPointButton = r15.A4J(r1.A00());
                IGTVFeedController.A00(iGTVFeedController);
            }
            if (AnonymousClass1YN.A02(this.A0V, "ig_select_free_data_banner")) {
                LinearLayout linearLayout = (LinearLayout) r15.A2c(C0003R.layout.zero_rating_video_setting_banner);
                C36251hk r0 = this.A0Z;
                if (r0 != null) {
                    A0C(r0);
                    C23300zv.A00(this.A0V).A03(C105504gy.class, this.A0Z.A05);
                }
                C36251hk r14 = new C36251hk(linearLayout);
                this.A0Z = r14;
                C105474gv.A00(this.A0V, r14);
                A0B(this.A0Z);
                this.A02 = C27651Ir.A00(getContext()) + getResources().getDimensionPixelSize(C0003R.dimen.zero_rating_video_settings_banner_height);
            } else {
                C36251hk r02 = this.A0Z;
                if (r02 != null) {
                    A0C(r02);
                    C23300zv.A00(this.A0V).A03(C105504gy.class, this.A0Z.A05);
                    this.A0Z = null;
                }
                this.A02 = C27651Ir.A00(getContext());
            }
            this.A06.A0E(getScrollingViewProxy(), this.A0I, this.A02);
        }
    }

    public final String getModuleName() {
        return AnonymousClass1DW.A00(Constants.ZERO);
    }

    public final C06590Pq getSession() {
        return this.A0V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == p000X.Constants.A0Y) goto L_0x000d;
     */
    public final boolean onBackPressed() {
        boolean z;
        Integer num = this.A1F.A0B;
        if (num != Constants.ONE) {
            z = false;
        }
        z = true;
        if (!z && !getScrollingViewProxy().AeF() && !this.A0g) {
            Bel();
            z = true;
        }
        this.A0g = false;
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "fill_view_pool", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a4, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "set_has_stable_ids", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0297, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "diff_util_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x02cb, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "notify_item_change", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02e7, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "scrolling_llm", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x047f, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "unregister_viewpoint", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0V, p000X.AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "scroll_direction_fix", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0069;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        AnonymousClass225 r3;
        View.OnClickListener r11;
        Integer num;
        int A022 = AnonymousClass0Z0.A02(587911669);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        this.A0V = AnonymousClass0J1.A06(this.mArguments);
        if (bundle == null || !bundle2.containsKey("use_rv")) {
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
            this.A1N = booleanValue;
            if (booleanValue) {
                z = true;
            }
            z = false;
            this.A1M = z;
            AnonymousClass0C1 r32 = this.A0V;
            if (AnonymousClass1IX.A01 == null) {
                AnonymousClass1IX.A01 = (Boolean) AnonymousClass0L6.A03(r32, AnonymousClass0L7.MAINFEED_PTR_BG_PRIMARY, "is_enabled", false, (AnonymousClass04H) null);
            }
            this.A0n = AnonymousClass1IX.A01.booleanValue();
            if (this.A1N) {
                z2 = true;
            }
            z2 = false;
            this.A0k = z2;
            if (this.A1N) {
                z3 = true;
            }
            z3 = false;
            this.A1O = z3;
        } else {
            this.A1N = bundle2.getBoolean("use_rv");
            this.A1M = bundle2.getBoolean("use_diff_util");
            this.A0n = bundle2.getBoolean("primary_bg_ptr_spinner");
            this.A0k = bundle2.getBoolean("notify_item_change");
            this.A1O = bundle2.getBoolean("scrolling_llm");
        }
        if (this.A1N) {
            z4 = true;
        }
        z4 = false;
        if (this.A1N) {
            z5 = true;
        }
        z5 = false;
        this.A1H = z5;
        if (this.A1N) {
            z6 = true;
        }
        z6 = false;
        this.A1P = z6;
        this.A1L = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEED_REMOVE_EXTRA_SCROLL_LISTENER_REGISTER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.LOAD_MORE_IDLE, "preload_distance_translation_factor", 1, (AnonymousClass04H) null);
        this.A0q = AnonymousClass1IY.A00(this.A0V);
        this.A08 = C27491Ib.A00(getActivity());
        C27541Ig r5 = new C27541Ig(this.A0V, getActivity(), this);
        this.A0M = r5;
        registerLifecycleListener(r5);
        this.A1G = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.ASYNC_VIEW_MODEL_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        this.A0K = new C27581Ik(C12600h4.A00(), getModuleName(), this, Looper.myQueue());
        C12600h4.A00().A06(this.A0K);
        this.A0N = new C27641Iq(this.A0V);
        this.A02 = C27651Ir.A00(getContext());
        this.A0t = new C27661Is(this.A0V);
        AnonymousClass0C1 r52 = this.A0V;
        this.A0W = new AnonymousClass1KT(r52, this, this, new AnonymousClass1KU(this, Constants.A12, r52));
        C28001Ka.A00.A00 = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.VIEWPOINT_OCCLUSION, "pip_enabled", false, (AnonymousClass04H) null)).booleanValue();
        C28051Kf A002 = C28021Kc.A00();
        this.A0s = A002;
        AnonymousClass0C1 r7 = this.A0V;
        AnonymousClass1I5 r6 = this.A1V;
        C28061Kg r33 = new C28061Kg(r7, r6, this, A002);
        C28131Kn r53 = new C28131Kn(r7, r6, this, A002);
        FragmentActivity activity = getActivity();
        Integer num2 = Constants.ZERO;
        C28151Kp r24 = new C28151Kp(r7, this, this, activity, num2, this.A0W, r53);
        C28181Ks r4 = new C28181Ks(r7, r6, A002, r24);
        AnonymousClass0C1 r62 = this.A0V;
        AnonymousClass1L3 r42 = new AnonymousClass1L3(this);
        FragmentActivity activity2 = getActivity();
        new C28151Kp(r62, this, r42, activity2, num2, this.A0W, r53);
        this.A0v = new AnonymousClass1L4(this, getModuleName(), activity2, r62);
        Context context = getContext();
        AnonymousClass1L8 A003 = AnonymousClass1L8.A00(this);
        AnonymousClass0C1 r72 = this.A0V;
        AnonymousClass1L5 r25 = new AnonymousClass1L5(activity2, new AnonymousClass1L7(context, A003, this, r72), Constants.ZERO, r72, this, r53);
        AnonymousClass1LE r43 = new AnonymousClass1LE(r72, this.A1V, this.A0s, r25);
        AnonymousClass0C1 r44 = this.A0V;
        AnonymousClass1LH r34 = new AnonymousClass1LH(r44, this, this);
        AnonymousClass1LJ r252 = new AnonymousClass1LJ(getContext(), this, r44, this, this.A0s);
        AnonymousClass1LO r54 = new AnonymousClass1LO(this, false, getContext(), this.A0V);
        IGTVFeedController A042 = C17660qb.A00.A04(getContext(), this.A0V, this);
        this.A11 = A042;
        registerLifecycleListener(A042);
        AnonymousClass1LV r73 = new AnonymousClass1LV(getContext(), this.A0V, AnonymousClass1L8.A00(this), this.A0N, this.A1V, this, this.A1n);
        this.A0L = r73;
        C28541Md r8 = new C28541Md(this.A0V, this, this.A0K, this.A1V, r73);
        this.A14 = r8;
        registerLifecycleListener(r8);
        AnonymousClass1LV r63 = this.A0L;
        C28541Md r35 = this.A14;
        synchronized (r63.A0J) {
            r63.A03 = r35;
            r63.A00 = SystemClock.elapsedRealtime();
            AnonymousClass1LY r82 = r63.A0F;
            r82.A03.ADc(new C28561Mf(r82, r63, r63.A0H));
            r63.A03.A04(C28571Mg.CACHED, true);
        }
        C15880ng BXM = C15610nF.A00(r63.A0G).BXM();
        if (BXM == null || BXM.A01 == null) {
            AnonymousClass0MT r9 = new AnonymousClass0MT(r63.A09);
            Context context2 = r63.A06;
            if (r63.A04 == null) {
                r63.A04 = new C15780nW(context2);
            }
            C15880ng A004 = C15810nZ.A00(context2, r63.A04, r9, r63.A09.A00(), r63.A0G, -20);
            r63.A09.A02();
            r63.A08.A02(A004.A00, new C28581Mh(r63, A004));
        } else {
            r63.A09.A02();
            C28581Mh r45 = new C28581Mh(r63, BXM);
            C28341Li r74 = r63.A08;
            C17880qx r64 = BXM.A01;
            if (r74.A00 != Constants.ZERO) {
                r74.A04.schedule(new C28611Mk(r64, new C28601Mj(r74, r45, (AnonymousClass2TE) null)));
            }
        }
        C17640qZ r75 = C17640qZ.A00;
        AnonymousClass0C1 r65 = this.A0V;
        HashMap hashMap = new HashMap();
        hashMap.put(QPTooltipAnchor.DIRECT_REPLY_TO_AUTHOR_BUTTON, new AnonymousClass1NH());
        hashMap.put(QPTooltipAnchor.DIRECT_ICON, new AnonymousClass1NO());
        hashMap.put(QPTooltipAnchor.CREATE_POST_ICON, new AnonymousClass1NP());
        hashMap.put(QPTooltipAnchor.PROFILE_TAB, new AnonymousClass1NQ());
        AnonymousClass1NR A0B2 = r75.A0B(r65, hashMap);
        this.A0U = A0B2;
        registerLifecycleListener(A0B2);
        C17640qZ r76 = C17640qZ.A00;
        AnonymousClass0C1 r46 = this.A0V;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.MAIN_FEED;
        AnonymousClass1NW A032 = r76.A03();
        A032.A03 = new AnonymousClass1NX(this);
        A032.A02 = new AnonymousClass1NZ(this);
        C28771Na r66 = new C28771Na(this);
        AnonymousClass1NR r36 = this.A0U;
        A032.A04 = r66;
        A032.A06 = r36;
        A032.A05 = new C28791Nc(this);
        A032.A01 = new C28801Ne(this);
        A032.A00 = new AnonymousClass1Nf(this);
        AnonymousClass1OC A092 = r76.A09(this, this, r46, quickPromotionSlot, A032.A00());
        this.A0T = A092;
        registerLifecycleListener(A092);
        AnonymousClass1OR A005 = AnonymousClass1OR.A00(this.A0V);
        AnonymousClass0C1 r55 = this.A0V;
        String moduleName = getModuleName();
        AnonymousClass1OY r47 = AnonymousClass1OY.IN_FEED_STORIES_TRAY;
        AnonymousClass1OV r37 = new AnonymousClass1OV(r55, AnonymousClass000.A0J(moduleName, "_", r47.A00), r47, A005, this, this, this.A1V);
        this.A1A = r37;
        registerLifecycleListener(r37);
        this.A0D = new C28981Od(this, this, this.A0V, this);
        this.A1B = C17510qM.A00.A0H(this, this.A0V, AnonymousClass1L8.A00(this), this.A0T);
        C29071Om r67 = new C29071Om(this.A0V, this.A0L, this.A14, this);
        this.A16 = r67;
        this.A0Q = new C29101Op(this, r67, new C11060eM(), AnonymousClass0WN.A01(this.A0V));
        this.A0m = ((Boolean) AnonymousClass0L6.A03(this.A0V, AnonymousClass0L7.NEW_EOF_DEMARCATOR, "new_demarcator_enabled", 1, AnonymousClass0LY.A05)).booleanValue();
        this.A0R = new C29111Oq(((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.LOW_RAM_ANIMATIONS, "end_of_feed", 1, (AnonymousClass04H) null)).booleanValue(), new C29141Ot(this));
        AnonymousClass1OP r68 = new AnonymousClass1OP(this.A0V, this, this, this.A0s);
        if (this.A1N) {
            z7 = true;
        }
        z7 = false;
        Context context3 = getContext();
        AnonymousClass0C1 r56 = this.A0V;
        AnonymousClass1I5 r92 = this.A1V;
        C29181Ox A006 = C29181Ox.A00(context3, r56);
        C28981Od r48 = this.A0D;
        this.A0H = new C29151Ou(context3, this, r56, r92, C26611Ee.A00(r56), C26671El.A00(r56), A006, r54, r48, r68, z7, this.A1m, this);
        if (this.A1G) {
            AnonymousClass223 r38 = new AnonymousClass223();
            this.A12 = r38;
            registerLifecycleListener(r38);
        }
        Context context4 = getContext();
        AnonymousClass1L4 r30 = this.A0v;
        C29071Om r342 = this.A16;
        AnonymousClass0C1 r77 = this.A0V;
        AnonymousClass1I5 r372 = this.A1V;
        AnonymousClass1OC r39 = this.A0T;
        C29181Ox.A00(context4, r77);
        AnonymousClass1OV r422 = this.A1A;
        C29151Ou r432 = this.A0H;
        C29111Oq r442 = this.A0R;
        AnonymousClass223 r462 = this.A12;
        AnonymousClass1PQ r57 = new AnonymousClass1PQ(this.A0s, this, AnonymousClass0WN.A01(this.A0V));
        boolean z8 = this.A1N;
        boolean z9 = this.A0k;
        Context context5 = context4;
        C28151Kp r28 = r24;
        C28181Ks r29 = r4;
        AnonymousClass1L5 r31 = r25;
        AnonymousClass1LH r322 = r34;
        AnonymousClass0C1 r362 = r77;
        AnonymousClass1OP r452 = r68;
        C28061Kg r472 = r33;
        AnonymousClass1PQ r482 = r57;
        AnonymousClass1LE r49 = r43;
        AnonymousClass1PE r242 = new AnonymousClass1PE(context5, this, this, r28, r29, r30, r31, r322, r252, r342, this, r362, r372, this, r39, this, A005, r422, r432, r442, r452, r462, r472, r482, r49, this, this, z8, z9, this.A1M, z7, ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "disable_adapter_data_set_changed", false, (AnonymousClass04H) null)).booleanValue());
        this.A0I = r242;
        if (this.A1P) {
            r242.setHasStableIds(true);
        }
        this.A1n.A00 = new C29531Qg(this);
        if (this.A1G) {
            this.A12.A00 = this.A0I;
        }
        C29071Om r310 = this.A16;
        AnonymousClass1PE r58 = this.A0I;
        r310.A01 = r58;
        C28541Md r410 = this.A14;
        r410.A01 = r58;
        C27321Hj r78 = r410.A06;
        AnonymousClass0C1 r69 = r410.A07;
        r410.A03 = new C29541Qh(r78, r58, r69);
        C29551Qi A007 = C29551Qi.A00(r78.getContext(), r69, r78, true);
        A007.A0A(r410.A01);
        r410.A00 = A007;
        r410.A06.registerLifecycleListener(A007);
        if (((Boolean) AnonymousClass0L6.A02(r410.A07, AnonymousClass0L7.HOME_FLASH_FEED, "enable_tail_load_insertion", false, (AnonymousClass04H) null)).booleanValue()) {
            r410.A04 = new C36271hm(r410.A07, r410.A0D, r410.A01, r410.A03, r410.A0C);
        }
        C29601Qn r59 = new C29601Qn(this.A16, C29621Qp.MAIN_FEED.A00);
        this.A0B = r59;
        this.A0A = r59;
        this.A06 = new C27301Hh(getContext(), z4);
        C29631Qq r610 = new C29631Qq(this.A0V, new C29641Qr(this), this.A1N);
        this.A0w = r610;
        registerLifecycleListener(r610);
        C29671Qu r411 = new C29671Qu(this, this, this.A0V);
        r411.BkV(this.A1V);
        registerLifecycleListener(r411);
        boolean booleanValue2 = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.ASYNC_VIEW_MODEL_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        C27301Hh r611 = this.A06;
        AnonymousClass1PE r510 = this.A0I;
        AnonymousClass1I1 r412 = this.A1T;
        if (booleanValue2) {
            r3 = new AnonymousClass225(this);
        } else {
            r3 = null;
        }
        AnonymousClass1RA r79 = new AnonymousClass1RA(this, r611, r510, r412, r3, z4);
        FragmentActivity activity3 = getActivity();
        AnonymousClass1RB r311 = new AnonymousClass1RB(this.A0V);
        this.A10 = r311;
        this.A0y = new AnonymousClass1RD(activity3, r311);
        this.A0z = new AnonymousClass1RD(activity3, new AnonymousClass1RH(this.A0V));
        this.A0F = new AnonymousClass1RD(activity3, new AnonymousClass1RI(this.A0V));
        Context context6 = getContext();
        AnonymousClass0C1 r413 = this.A0V;
        AnonymousClass1RJ r511 = new AnonymousClass1RJ(context6, r413, this, this.A0I, false, this.A1V.AVo(), true);
        C29791Rg r14 = new C29791Rg(this.A0V, getActivity(), this.A0I, this);
        this.A1F = new C29851Rn(getActivity(), this.A0V, this.A0I, r511);
        C29871Rp r2 = new C29871Rp(this, (AnonymousClass1D7) getRootActivity(), this.A0V);
        registerLifecycleListener(new C29911Rt(getActivity(), this.A0V, r2));
        registerLifecycleListener(new C29921Ru(getActivity(), this.A0V, r2));
        C29931Rv r612 = new C29931Rv(this.A0V, this.A1V);
        boolean booleanValue3 = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.LAUNCHER_MAIN_FEED_PPR_VIEWPOINT_MIGRATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        FragmentActivity activity4 = getActivity();
        AnonymousClass0C1 r414 = this.A0V;
        AnonymousClass1PE r312 = this.A0I;
        AnonymousClass1LO r27 = r54;
        if (booleanValue3) {
            r27 = null;
        }
        AnonymousClass1S3 r415 = new AnonymousClass1S3(this, this, this.A0I, new C29961Ry(activity4, r414, this, r312, r27, r612));
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(this.A0V);
        AnonymousClass1PE r613 = this.A0I;
        AnonymousClass1S5 r710 = r30;
        AnonymousClass1PE r332 = r613;
        AnonymousClass1S5 r302 = new AnonymousClass1S5(this, A012, r332, this.A1V, this, new C11060eM(), this.A0m);
        AnonymousClass0C1 r512 = this.A0V;
        AnonymousClass0C1 r313 = r512;
        AnonymousClass1S6 r303 = new AnonymousClass1S6(r313, this, r332, this, r415, C29181Ox.A00(getContext(), r512), r710);
        registerLifecycleListener(r710);
        A0B(r303.A06);
        registerLifecycleListener(r303);
        AnonymousClass1SS r453 = new AnonymousClass1SS();
        AnonymousClass0C1 r112 = this.A0V;
        C28051Kf r10 = this.A0s;
        Context context7 = getContext();
        AnonymousClass1I5 r513 = this.A1V;
        C29951Rx r314 = new C29951Rx(r112, r513);
        C29601Qn r83 = this.A0B;
        AnonymousClass1LO r282 = null;
        if (booleanValue3) {
            r282 = r54;
        }
        List A008 = AnonymousClass1SU.A00(context7, r112, r513, this, r314, C17070pd.MAIN_FEED, r282);
        A008.add(new AnonymousClass1TM(AnonymousClass0JA.A00(r112)));
        A008.add(new AnonymousClass1TR(context7));
        A008.add(new AnonymousClass1TT(context7));
        if (!((Boolean) AnonymousClass0L6.A02(r112, AnonymousClass0L7.LOAD_MORE_IDLE, "paginate_on_idle_only", false, (AnonymousClass04H) null)).booleanValue()) {
            A008.add(new AnonymousClass1TV(r83, ((Boolean) AnonymousClass0L6.A02(r112, AnonymousClass0L7.LOAD_MORE_IDLE, "rate_limit_viewpoint", false, (AnonymousClass04H) null)).booleanValue()));
        }
        if (((Boolean) AnonymousClass0L6.A02(r112, AnonymousClass0L7.FEED_ADS_RENDERING_LOGGING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            A008.add(new C36921ip(context7, r112, this));
        }
        AnonymousClass1ST r315 = new AnonymousClass1ST(r112, this, r10, A008);
        AnonymousClass1AM r243 = this.mFragmentManager;
        AnonymousClass1PE r26 = this.A0I;
        AnonymousClass0C1 r93 = this.A0V;
        AnonymousClass1RJ r12 = r511;
        C30261Td r22 = new C30261Td(this, r243, this, r26, r12, r415, r79, r93, r14, this.A1F, this.A0z, this.A0y, r54, r2, this.A1V, new AnonymousClass1US(getActivity(), r93), C29181Ox.A00(getContext(), r93), this.A0N, this.A0s, r315, r33, AnonymousClass1LX.A00(this.A0V));
        this.A15 = r22;
        Context context8 = getContext();
        AnonymousClass1AM r102 = this.mFragmentManager;
        C30691Uv r222 = new C30691Uv(context8, this, r102, this.A0I, this, this.A0V);
        r222.A0B = r12;
        r222.A0E = r14;
        r222.A05 = r22;
        r222.A04 = r415;
        r222.A09 = r79;
        r222.A0D = r2;
        r222.A01 = r54;
        r222.A0G = this.A1F;
        r222.A0A = this.A0z;
        r222.A08 = new C30701Uw();
        r222.A0F = this.A1V;
        AnonymousClass1VH A009 = r222.A00();
        this.A0C = A009;
        A009.AyU();
        this.A19 = new C30901Vq(this.A0V);
        AnonymousClass1F6.A00(this.A0V).A08(getModuleName(), this.A19, new C30921Vs(this.A0V), AnonymousClass1F6.A0C.intValue());
        this.A13 = new C30981Vz(this, this.A0V, AnonymousClass1L8.A00(this), this, this);
        this.A0J = new AnonymousClass1W4(this, this, this.A0I, this.A0V, A08(), r453, this.A0K, this.A0s, this.A13, this.A1m, this);
        registerLifecycleListener(this.A13);
        registerLifecycleListener(this.A0J);
        A0B(this.A0N);
        A0B(this.A0C);
        A0B(this.A06);
        if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.LOAD_MORE_IDLE, "paginate_on_idle_only", false, (AnonymousClass04H) null)).booleanValue()) {
            C36281hn r711 = new C36281hn(this.A0I, Constants.ONE, ((Integer) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.LOAD_MORE_IDLE, "read_ahead_count", 6, (AnonymousClass04H) null)).intValue(), this.A16, true);
            this.A0u = r711;
            A0B(r711);
        }
        this.A0P = C28521Mb.A00(this.A0V);
        this.A14.A05.A02 = new AnonymousClass1WP(this);
        Context context9 = getContext();
        AnonymousClass1IS r84 = this.A1o;
        if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEEDFRAG_LEAKS, "is_empty_feed_click_lstnr_fixed", false, (AnonymousClass04H) null)).booleanValue()) {
            r11 = new AnonymousClass1WR(this.A1p);
        } else {
            r11 = new C479526b(this);
        }
        AnonymousClass1WQ r614 = new AnonymousClass1WQ(context9, r84, C0003R.string.pull_to_refresh, true, r11);
        this.A0G = r614;
        registerLifecycleListener(r614);
        this.A0Y = C13880jN.A00;
        this.A0I.registerDataSetObserver(new AnonymousClass1WU(this));
        boolean booleanValue4 = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.IGTV_HOME_ICON, "enable_feed_sharing", 1, (AnonymousClass04H) null)).booleanValue();
        boolean A023 = AnonymousClass1WV.A02(this.A0V);
        if (booleanValue4 && A023) {
            num = Constants.A02;
        } else if (booleanValue4) {
            num = Constants.A12;
        } else if (A023) {
            num = Constants.A15;
        } else {
            num = Constants.ONE;
        }
        this.A0S = new AnonymousClass1WZ(this.A0V, num, this.A0I, this);
        this.A0E = new C31011Wc(getActivity(), this.A0V, this, this);
        C23300zv A0010 = C23300zv.A00(this.A0V);
        A0010.A02(C31031We.class, this.A1Z);
        A0010.A02(C31041Wf.class, this.A1g);
        A0010.A02(C31051Wg.class, this.A1d);
        A0010.A02(C31061Wh.class, this.A1i);
        A0010.A02(C31071Wi.class, this.A1h);
        A0010.A02(C31081Wj.class, this.A1a);
        A0010.A02(C31091Wk.class, this.A1B);
        C31101Wl r316 = new C31101Wl(this);
        this.A0p = r316;
        A0010.A02(C31111Wm.class, r316);
        this.A05 = AnonymousClass1CF.A00(this.A0V);
        AnonymousClass0C1 r514 = this.A0V;
        AnonymousClass1AM r317 = this.mFragmentManager;
        this.A0o = new C31121Wn(r514, this, r317, r514.A06, (C52962Qx) null, (C52972Qy) null, Constants.A0z);
        RefreshableListView.A0P = ((Boolean) AnonymousClass0L6.A02(r514, AnonymousClass0L7.ASYNC_VIEW_MODEL_LAUNCHER, "is_intercept_touch_fix_enabled", false, (AnonymousClass04H) null)).booleanValue();
        C15940nm.A02().A06(getContext(), this.A0V);
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0C1 r515 = this.A0V;
            AnonymousClass0L7 r416 = AnonymousClass0L7.LOCK_UNLOCK_DEX;
            boolean booleanValue5 = ((Boolean) AnonymousClass0L6.A02(r515, r416, "enabled", false, (AnonymousClass04H) null)).booleanValue();
            this.A1J = booleanValue5;
            if (!booleanValue5) {
                boolean booleanValue6 = ((Boolean) AnonymousClass0L6.A02(this.A0V, r416, "enabled_bg", false, (AnonymousClass04H) null)).booleanValue();
                this.A1K = booleanValue6;
                if (booleanValue6) {
                    boolean booleanValue7 = ((Boolean) AnonymousClass0L6.A02(this.A0V, r416, "enabled_bg_pri_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    this.A0j = booleanValue7;
                    if (booleanValue7) {
                        this.A01 = ((Integer) AnonymousClass0L6.A02(this.A0V, r416, "bg_pri", 0, (AnonymousClass04H) null)).intValue();
                    }
                }
            }
            if (this.A1J || this.A1K) {
                this.A03 = ((Integer) AnonymousClass0L6.A02(this.A0V, r416, "tenth_percentile", 0, (AnonymousClass04H) null)).intValue();
                this.A0i = ((Boolean) AnonymousClass0L6.A02(this.A0V, r416, "lock_only_executable_range", 1, (AnonymousClass04H) null)).booleanValue();
            }
        } else {
            AnonymousClass0C1 r516 = this.A0V;
            AnonymousClass0L7 r417 = AnonymousClass0L7.LOCK_UNLOCK_DEX_DALVIK;
            boolean booleanValue8 = ((Boolean) AnonymousClass0L6.A02(r516, r417, "enabled", false, (AnonymousClass04H) null)).booleanValue();
            this.A1J = booleanValue8;
            if (!booleanValue8) {
                boolean booleanValue9 = ((Boolean) AnonymousClass0L6.A02(this.A0V, r417, "enabled_bg", false, (AnonymousClass04H) null)).booleanValue();
                this.A1K = booleanValue9;
                if (booleanValue9) {
                    boolean booleanValue10 = ((Boolean) AnonymousClass0L6.A02(this.A0V, r417, "enabled_bg_pri_enabled", 1, (AnonymousClass04H) null)).booleanValue();
                    this.A0j = booleanValue10;
                    if (booleanValue10) {
                        this.A01 = ((Integer) AnonymousClass0L6.A02(this.A0V, r417, "bg_pri", 0, (AnonymousClass04H) null)).intValue();
                    }
                }
            }
            if (this.A1J || this.A1K) {
                this.A03 = ((Integer) AnonymousClass0L6.A02(this.A0V, r417, "tenth_percentile", 0, (AnonymousClass04H) null)).intValue();
                this.A0i = false;
            }
        }
        this.A0K.A0A("FRAGMENT_CREATED");
        AnonymousClass0Z0.A09(-710501971, A022);
    }

    public final void onHiddenChanged(boolean z) {
        if (z) {
            this.A0O.A0B();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass1YI A072 = getScrollingViewProxy();
        A072.Bfh(this.A0I);
        AnonymousClass0C1 r2 = this.A0V;
        ((AnonymousClass1ZH) r2.AVA(AnonymousClass1ZH.class, new AnonymousClass1ZI(r2))).A00 = new WeakReference(A072);
        if (this.A1H) {
            AnonymousClass1PE r11 = this.A0I;
            RecyclerView recyclerView = (RecyclerView) A072.AaK();
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("Prefetch common views", 446855059);
            }
            try {
                C31521Yp recycledViewPool = recyclerView.getRecycledViewPool();
                HashMap hashMap = new HashMap();
                C29151Ou r4 = r11.A0P;
                int intValue = Constants.A0N.intValue();
                int intValue2 = Constants.A0Y.intValue();
                int intValue3 = Constants.A12.intValue();
                int intValue4 = Constants.A0j.intValue();
                int intValue5 = Constants.A09.intValue();
                int intValue6 = Constants.A0A.intValue();
                int intValue7 = Constants.A05.intValue();
                int intValue8 = Constants.A0C.intValue();
                int intValue9 = Constants.A07.intValue();
                int intValue10 = Constants.A06.intValue();
                hashMap.put(r4, new int[]{intValue, intValue2, intValue3, intValue4, intValue5, intValue5, intValue6, intValue7, intValue8, intValue9, intValue10, intValue, intValue2, intValue3, intValue4, intValue5, intValue5, intValue6, intValue7, intValue8, intValue9, intValue10});
                hashMap.put(r11.A0L, new int[]{0});
                hashMap.put(r11.A0a, new int[]{0});
                for (Map.Entry entry : hashMap.entrySet()) {
                    C29131Os r7 = (C29131Os) entry.getKey();
                    for (int intValue11 : (int[]) entry.getValue()) {
                        AnonymousClass1ZK createViewHolder = r11.createViewHolder(recyclerView, ((Integer) r11.A03.A06.get(r7)).intValue() + intValue11);
                        if (r11.A06) {
                            View view2 = createViewHolder.itemView;
                            if (C29281Ph.A01()) {
                                ((C180227mj) view2.getTag(-4848503)).A00 = true;
                            }
                        }
                        recycledViewPool.A03(createViewHolder);
                    }
                }
            } finally {
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(241472347);
                }
            }
        }
        Context context = getContext();
        C32591bW r3 = new C32591bW(context, this.A0I, A072, (float) C27651Ir.A00(context));
        this.A1C = r3;
        this.A1T.A0E(r3.A08);
        this.A06.A0D(A072, this.A0I, this.A02);
        View view3 = view;
        Bundle bundle2 = bundle;
        super.onViewCreated(view3, bundle2);
        this.A0C.BVf(view3, bundle2);
        C28051Kf r112 = this.A0s;
        C32711bj A002 = C32711bj.A00(this);
        ViewGroup AaK = A072.AaK();
        C32761bo r42 = new C32761bo();
        C32781bq[] r12 = {new C32791br(this.A0X)};
        r112.A01.clear();
        for (int i = 0; i < 1; i++) {
            r112.A01.A2T(r12[i]);
        }
        C28051Kf.A01(r112, A002, new C32801bs(AaK, r112.A01), r42);
        if (this.A1N) {
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) this.A0X.findViewById(C0003R.C0005id.refreshable_container);
            AnonymousClass1XN r1 = this.A1E;
            if (r1 instanceof C32861by) {
                A072.BlX((C32861by) r1);
            } else {
                A072.Bm7(new C32871bz(this));
            }
            if (refreshableNestedScrollingParent != null) {
                refreshableNestedScrollingParent.setRefreshDrawableVerticalOffset(C27651Ir.A00(getContext()));
            }
        }
        A072.setPullDownProgressDelegate(this.A0K);
        A072.setIsLoading(this.A16.AgL());
        A072.setDrawBorder(false);
        if (((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.HOME_FEED_SCROLLBAR, "remove_vertical_scrollbar", false, (AnonymousClass04H) null)).booleanValue()) {
            A072.AaK().setVerticalScrollBarEnabled(false);
        }
        if (!this.A1N && !this.A0n) {
            try {
                ((C31171Wu) A072.AaK()).setPullToRefreshBackgroundColor(C019000b.A00(getContext(), C0003R.color.igds_secondary_background));
            } catch (Resources.NotFoundException e) {
                AnonymousClass0DB.A05(A1t, "Error reading attribute color from theme", e);
            }
        }
        this.A0Y.A04(this.mView, AnonymousClass000.A0E("feed_", getModuleName()));
        this.A0Y.A03(this.mView, AnonymousClass1ZA.LoadingData);
        C16380oV.A00.A08(this.A0V, this);
        C23300zv A003 = C23300zv.A00(this.A0V);
        A003.A02(C32921c4.class, this.A1e);
        A003.A02(C32931c5.class, this.A1X);
        A003.A02(C32941c6.class, this.A1j);
        A003.A02(C32951c7.class, this.A1U);
        A003.A02(C32961c8.class, this.A1c);
        A003.A02(C32971c9.class, this.A1Y);
        A003.A02(C32981cA.class, this.A1f);
        if (C22490yW.A00()) {
            C11130eT.A01.A02(C114804wW.class, this.A1b);
        }
        AnonymousClass0C1 r13 = this.A0V;
        FragmentActivity activity = getActivity();
        getModuleName();
        HideLikeCountAuthorTooltipManager hideLikeCountAuthorTooltipManager = new HideLikeCountAuthorTooltipManager(r13, activity);
        this.A0x = hideLikeCountAuthorTooltipManager;
        registerLifecycleListener(hideLikeCountAuthorTooltipManager);
        A0B(this.A0x);
        AnonymousClass0C1 r9 = this.A0V;
        if (!((Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.END_OF_FEED, "caboose_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0L6.A02(r9, AnonymousClass0L7.NEW_EOF_DEMARCATOR, "new_demarcator_enabled", true, AnonymousClass0LY.A05);
        }
        A072.A8n();
        A072.A4V(this.A1q);
        getContext().getTheme().resolveAttribute(C0003R.attr.tabBarHeight, new TypedValue(), true);
        AnonymousClass0Q7.A03().A0B(this);
        C32991cC.A00(this.A0V).A07(view3, C33051cI.STORY);
        AnonymousClass0C1 r32 = this.A0V;
        AnonymousClass0L7 r22 = AnonymousClass0L7.LAYERTYPE_LAUNCHER;
        if (((Boolean) AnonymousClass0L6.A02(r32, r22, "enabled", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, r22, "enabled_software", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                getScrollingViewProxy().AaU().setLayerType(1, (Paint) null);
            }
            if (((Boolean) AnonymousClass0L6.A02(this.A0V, r22, "enabled_hardware", (Object) null, (AnonymousClass04H) null)).booleanValue()) {
                getScrollingViewProxy().AaU().setLayerType(2, (Paint) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        if (r1 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r12.A0L.A02().longValue()) <= A1s) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        if (r2 != p000X.Constants.A0C) goto L_0x0139;
     */
    private void A02() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!isAdded()) {
            this.A1I = true;
            return;
        }
        this.A1I = false;
        AnonymousClass1YO r7 = this.A0O;
        boolean z4 = false;
        if (r7.A07.A01()) {
            C28521Mb r5 = r7.A07;
            if (r5.A0C == null) {
                r5.A0C = (Double) AnonymousClass0L6.A02(r5.A0H, AnonymousClass0L7.MAINFEED_LIGHTWEIGHT_PILL, "lightweight_start_time", Double.valueOf(0.0d), (AnonymousClass04H) null);
            }
            long doubleValue = ((long) r5.A0C.doubleValue()) * 60;
            C28521Mb r8 = r7.A07;
            if (r8.A0B == null) {
                r8.A0B = (Double) AnonymousClass0L6.A02(r8.A0H, AnonymousClass0L7.MAINFEED_LIGHTWEIGHT_PILL, "lightweight_end_time", Double.valueOf(0.0d), (AnonymousClass04H) null);
            }
            long doubleValue2 = ((long) r8.A0B.doubleValue()) * 60;
            if (r7.A05.A02() != null && Math.abs(System.currentTimeMillis() - r7.A05.A02().longValue()) >= TimeUnit.SECONDS.toMillis(doubleValue) && Math.abs(System.currentTimeMillis() - r7.A05.A02().longValue()) <= TimeUnit.SECONDS.toMillis(doubleValue2)) {
                z4 = true;
            }
        }
        if (z4) {
            AnonymousClass1YO r1 = this.A0O;
            if (r1.A07.A01()) {
                AnonymousClass1LV r0 = r1.A05;
                AnonymousClass4YU r4 = new AnonymousClass4YU(r1);
                C28361Lk r3 = r0.A0C;
                AnonymousClass4YS r02 = r3.A00;
                if (r02 != null) {
                    boolean z5 = r02.A00;
                    z3 = true;
                }
                z3 = false;
                if (!z3 && !r3.A01) {
                    r3.A01 = true;
                    C15890nh r2 = new C15890nh(r3.A02);
                    r2.A09 = Constants.A0N;
                    r2.A0C = "feed/new_feed_posts_exist/";
                    r2.A06(AnonymousClass4YR.class, false);
                    C17850qu A032 = r2.A03();
                    A032.A00 = new AnonymousClass4YT(r3, r4);
                    C12810hQ.A02(A032);
                    return;
                }
                return;
            }
            return;
        }
        if (this.A0L.A02() != null) {
            z = true;
        }
        z = false;
        if (z) {
            this.A0J.A06(Constants.ONE);
            if (this.A14.A08) {
                this.A0L.A03(Constants.A0C, (Map) null, (String) null);
                return;
            }
            return;
        }
        C27581Ik r32 = this.A0K;
        AnonymousClass0h8 r03 = r32.A06.A00;
        if (r03 != null) {
            Integer num = r03.A0C;
            z2 = true;
        }
        z2 = false;
        if (z2) {
            Integer num2 = Constants.A0N;
            r32.A00 = num2;
            r32.A01 = num2;
            C27581Ik.A00(r32);
        }
    }

    public static boolean A06(C27321Hj r3) {
        AnonymousClass1D1 A082 = r3.A08();
        boolean z = false;
        if (A082.AIZ().A09(A082.AXV().A01) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z = true;
        }
        if (z || r3.A0G()) {
            return false;
        }
        return true;
    }

    public final void A09() {
        A0A();
        if (this.mView != null && !this.A16.AgL()) {
            AnonymousClass1YI A072 = getScrollingViewProxy();
            if (A072.AhA() && !this.A0h) {
                A072.AEf();
            }
            A0E(true);
        }
    }

    public final boolean A0G() {
        AnonymousClass1D1 A082 = A08();
        if (A082.AXV().A01 == A082.AIZ().A04()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
        p000X.C12810hQ.A02(r3);
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0143, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014f, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015a, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0166, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0172, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017d, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0193, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    public final void BBK(AnonymousClass2FD r11, C27971CYh cYh) {
        boolean z;
        Integer num;
        char c;
        C17850qu r3;
        AnonymousClass2FE A002 = A00(this);
        Integer num2 = Constants.A0N;
        String str = cYh.A02;
        String str2 = str;
        if (str != null) {
            switch (str.hashCode()) {
                case -309952504:
                    boolean equals = str2.equals("connect_contacts");
                    c = 1;
                    break;
                case 237256269:
                    boolean equals2 = str2.equals("change_email");
                    c = 3;
                    break;
                case 247279647:
                    boolean equals3 = str2.equals("change_phone");
                    c = 7;
                    break;
                case 588281647:
                    boolean equals4 = str2.equals("confirm_phone");
                    c = 8;
                    break;
                case 729897211:
                    boolean equals5 = str2.equals("turn_on_sms");
                    c = 6;
                    break;
                case 860524583:
                    boolean equals6 = str2.equals("clicked");
                    c = 0;
                    break;
                case 1151895480:
                    boolean equals7 = str2.equals("turn_on_push");
                    c = 5;
                    break;
                case 1669621673:
                    boolean equals8 = str2.equals("send_confirm_email_with_login");
                    c = 4;
                    break;
                case 1671672458:
                    boolean equals9 = str2.equals("dismiss");
                    c = 2;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    break;
                case 1:
                    C127735dY.A04(A002.A02, A002.A00, A002.A01);
                    z = true;
                    break;
                case 2:
                    break;
                case 3:
                    C52362Om r5 = new C52362Om(A002.A00.getActivity(), A002.A02);
                    r5.A02 = C18980sj.A00.A00().A07(cYh.A00.A00, C115324xM.A00(Constants.ZERO));
                    r5.A02();
                    break;
                case 4:
                    r3 = C115574xn.A08(A002.A02, Constants.ZERO, (String) null, C05860Mt.A00(A002.A00.getContext()), (String) null, (String) null, (List) null);
                    r3.A00 = new C115044wu(A002);
                    break;
                case 5:
                    C06100Nt.A00(A002.A00.getContext());
                    z = true;
                    break;
                case 6:
                    r3 = C115574xn.A06(A002.A02);
                    break;
                case 7:
                    Bundle bundle = new Bundle();
                    C114104vN.A00(bundle, C114104vN.ARGUMENT_EDIT_PROFILE_FLOW);
                    C52362Om r4 = new C52362Om(A002.A00.getActivity(), A002.A02);
                    r4.A08(C15940nm.A02().A03().A07(A002.A02), bundle);
                    r4.A04 = "PhoneNumberEntryFragment.BACKSTATE_NAME";
                    r4.A02();
                    z = true;
                    break;
                case 8:
                    String str3 = cYh.A00.A01;
                    r3 = C115574xn.A01(A002.A02, str3);
                    r3.A00 = new C114044vH(A002, str3);
                    break;
            }
        }
        Integer num3 = cYh.A01;
        if (num3 != Constants.ONE) {
            if (num3 != Constants.ZERO) {
                z = false;
                if (z) {
                    String str4 = cYh.A02;
                    if (str4 != null) {
                        num = C140705zu.A00(str4);
                    } else {
                        Integer num4 = cYh.A01;
                        num = Constants.ONE;
                        if (num4 == num) {
                            num = Constants.A0C;
                        }
                    }
                    AnonymousClass2FF.A01(A002.A02, r11, num, num2);
                }
                String str5 = cYh.A02;
                if ("show_interest_survey".equals(str5) || "turn_on_push".equals(str5) || "turn_on_sms".equals(str5) || "connect_contacts".equals(str5)) {
                    this.A0I.A0Q((AnonymousClass2FD) null);
                }
                if (cYh.A01 == Constants.ONE || "dismiss".equals(cYh.A02)) {
                    this.A0I.A0Q((AnonymousClass2FD) null);
                    return;
                }
                return;
            }
            z = AnonymousClass2FE.A00(A002, cYh.A06);
            if (z) {
            }
            String str52 = cYh.A02;
            this.A0I.A0Q((AnonymousClass2FD) null);
            if (cYh.A01 == Constants.ONE || "dismiss".equals(cYh.A02)) {
            }
        }
        z = true;
        if (z) {
        }
        String str522 = cYh.A02;
        this.A0I.A0Q((AnonymousClass2FD) null);
        if (cYh.A01 == Constants.ONE || "dismiss".equals(cYh.A02)) {
        }
    }

    public final void BBL(AnonymousClass2FD r6) {
        AnonymousClass2FE A002 = A00(this);
        Integer num = Constants.A0N;
        switch (r6.A07.intValue()) {
            case 1:
                A002.A03.A00(C126785c0.MEGAPHONE);
                break;
            case 3:
                C127735dY.A04(A002.A02, A002.A00, A002.A01);
                break;
        }
        AnonymousClass2FF.A01(A002.A02, r6, Constants.ONE, num);
    }

    public final void BBM(AnonymousClass2FD r4) {
        AnonymousClass2FE A002 = A00(this);
        AnonymousClass2FF.A01(A002.A02, r4, Constants.A0C, Constants.A0N);
        this.A0I.A0Q((AnonymousClass2FD) null);
    }

    public final void BBN(AnonymousClass2FD r4) {
        AnonymousClass2FE A002 = A00(this);
        AnonymousClass2FF.A01(A002.A02, r4, Constants.ZERO, Constants.A0N);
    }

    public final void BDE(C26391Dc r5) {
        int A032 = AnonymousClass0Z0.A03(922469910);
        if (!this.A1L) {
            getScrollingViewProxy().A8n();
            getScrollingViewProxy().A4V(this.A1q);
        }
        AnonymousClass1D1 A082 = A08();
        boolean z = false;
        if (A082.AIZ().A09(A082.AXV().A01) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z = true;
        }
        if (z) {
            if (this.A0f) {
                A04(this);
            }
        } else if (A0G()) {
            A01();
        } else {
            this.A0C.A00.BE0();
        }
        AnonymousClass0Z0.A0A(1013186246, A032);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(474205535);
        AnonymousClass1YO r6 = this.A0O;
        switch (r6.A01.intValue()) {
            case 0:
                if (r6.A06.A06() && r6.A0E()) {
                    C28521Mb r5 = r6.A07;
                    if (r5.A00 == null) {
                        r5.A00 = (Boolean) AnonymousClass0L6.A02(r5.A0H, AnonymousClass0L7.FEED_SHORT_SESSION_NEW_POST_PILL, "heavyweight_refresh_on_background", false, (AnonymousClass04H) null);
                    }
                    if (r5.A00.booleanValue()) {
                        AnonymousClass1YO.A00(r6, Constants.A0Y);
                        break;
                    }
                }
                break;
            case 1:
                if (r6.A0F() && r6.A0E()) {
                    C28521Mb r52 = r6.A07;
                    if (r52.A06 == null) {
                        r52.A06 = (Boolean) AnonymousClass0L6.A02(r52.A0H, AnonymousClass0L7.MAINFEED_LIGHTWEIGHT_PILL, "lightweight_refresh_on_app_background", false, (AnonymousClass04H) null);
                    }
                    if (r52.A06.booleanValue()) {
                        AnonymousClass1YO.A01(r6, false);
                        break;
                    }
                }
                break;
        }
        AnonymousClass0Z0.A0A(-1188202864, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0Z0.A03(1859666495);
        AnonymousClass1YO r6 = this.A0O;
        switch (r6.A01.intValue()) {
            case 0:
                if (r6.A06.A06() && r6.A0E()) {
                    C28521Mb r5 = r6.A07;
                    if (r5.A03 == null) {
                        r5.A03 = (Boolean) AnonymousClass0L6.A02(r5.A0H, AnonymousClass0L7.FEED_SHORT_SESSION_NEW_POST_PILL, "heavyweight_refresh_on_foreground", false, (AnonymousClass04H) null);
                    }
                    if (r5.A03.booleanValue()) {
                        AnonymousClass1YO.A00(r6, Constants.A0j);
                        break;
                    }
                }
                break;
            case 1:
                if (r6.A0F() && r6.A0E()) {
                    C28521Mb r52 = r6.A07;
                    if (r52.A09 == null) {
                        r52.A09 = (Boolean) AnonymousClass0L6.A02(r52.A0H, AnonymousClass0L7.MAINFEED_LIGHTWEIGHT_PILL, "lightweight_refresh_on_app_foreground", false, (AnonymousClass04H) null);
                    }
                    if (r52.A09.booleanValue()) {
                        AnonymousClass1YO.A01(r6, false);
                        break;
                    }
                }
                break;
        }
        if (!this.A0J.A0B) {
            A02();
        }
        AnonymousClass0Z0.A0A(-678227246, A032);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A07 = new AnonymousClass1IW(this);
        if (this.A1I) {
            A02();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1156658574);
        boolean z = this.A1N;
        int i = C0003R.layout.layout_main_feed;
        if (z) {
            i = C0003R.layout.layout_main_feed_rv;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        if (this.A1N) {
            this.A1E = AnonymousClass1XL.A01(this.A0V, inflate, new AnonymousClass1XJ(this), false);
            MainFeedRecyclerView mainFeedRecyclerView = (MainFeedRecyclerView) inflate.findViewById(16908298);
            double doubleValue = ((Double) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "fling_velocity_factor", Double.valueOf(0.0d), (AnonymousClass04H) null)).doubleValue();
            if (doubleValue > 0.0d) {
                mainFeedRecyclerView.A00 = doubleValue;
            }
            int intValue = ((Integer) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.MAINFEED_RECYCLERVIEW, "flywheel_timeout_v2", 0, (AnonymousClass04H) null)).intValue();
            if (intValue > 0) {
                mainFeedRecyclerView.A01 = new C46101z8(mainFeedRecyclerView, intValue);
            }
        } else {
            this.A1E = C42751tB.A00(this.A0V, inflate, new C42731t9(this));
            ExpandingListView expandingListView = (ExpandingListView) inflate.findViewById(16908298);
            this.A1D = expandingListView;
            expandingListView.A01 = true;
            expandingListView.A00 = ((Boolean) AnonymousClass0L6.A02(this.A0V, AnonymousClass0L7.FIX_EXPANDING_ANIMATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
            A0B(this.A1D.A02);
        }
        this.A1E.BlL(this.A02 << 1);
        this.A0X = (StickyHeaderListView) inflate.findViewById(C0003R.C0005id.sticky_header_list);
        this.A0C.Ayk(inflate);
        AnonymousClass1YO r3 = new AnonymousClass1YO(this, getContext(), this.A1o, this.A14, this.A0X, this.A0V, this.A0L, new AnonymousClass1YP(this, this.A0I), this);
        this.A0O = r3;
        registerLifecycleListener(r3);
        A0B(this.A0O);
        this.A0O.A0A();
        View AXd = ((C26371Cz) getRootActivity()).AXd(AnonymousClass1DU.SHARE.toString());
        if (AXd != null) {
            this.A0U.A00(this.A0T, QPTooltipAnchor.CREATE_POST_ICON, AXd);
        }
        View AXd2 = ((C26371Cz) getRootActivity()).AXd(AnonymousClass1DU.PROFILE.toString());
        if (AXd2 != null) {
            this.A0U.A00(this.A0T, QPTooltipAnchor.PROFILE_TAB, AXd2);
            if (AXd2 instanceof ToastingBadge) {
                ToastingBadge.getViewModel((ToastingBadge) AXd2).A0H.A00(true);
                this.A0U.A00 = new BE0(this, AXd2);
            }
        }
        AnonymousClass0Z0.A09(-202465098, A022);
        return inflate;
    }

    public final void onDestroy() {
        C31221Wz A012;
        int A022 = AnonymousClass0Z0.A02(1846773901);
        super.onDestroy();
        this.A0C.Azd();
        AnonymousClass1LV r6 = this.A0L;
        synchronized (r6.A0J) {
            r6.A03 = null;
            AnonymousClass1LY r3 = r6.A0F;
            r3.A03.ADc(new C50042Er(r3));
            r6.A02 = null;
        }
        AnonymousClass0ZA.A07(r6.A07, (Object) null);
        r6.A0E.BP6();
        this.A1p.A00 = null;
        C29851Rn r62 = this.A1F;
        if (r62.A0C) {
            ATJ.A01(r62.A0M.getContext(), "ACTION_CLOSE_BROWSER", (Bundle) null, false);
            C29851Rn.A03(r62, false);
        }
        AnonymousClass0ZA.A07(this.A04, (Object) null);
        if (C35221g0.A00(this.A0V).booleanValue() || C35231g1.A00(this.A0V).booleanValue()) {
            this.A1m.A00.clear();
        }
        C27541Ig r0 = this.A0M;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
            this.A0M = null;
        }
        this.A1n.A00 = null;
        C23300zv A002 = C23300zv.A00(this.A0V);
        A002.A03(C31031We.class, this.A1Z);
        A002.A03(C31041Wf.class, this.A1g);
        A002.A03(C31051Wg.class, this.A1d);
        A002.A03(C31061Wh.class, this.A1i);
        A002.A03(C31071Wi.class, this.A1h);
        A002.A03(C31081Wj.class, this.A1a);
        A002.A03(C31091Wk.class, this.A1B);
        A002.A03(C31111Wm.class, this.A0p);
        if (this.A1U != null) {
            C23300zv.A00(this.A0V).A03(C32951c7.class, this.A1U);
        }
        unregisterLifecycleListener(this.A0O);
        unregisterLifecycleListener(this.A0G);
        unregisterLifecycleListener(this.A1A);
        unregisterLifecycleListener(this.A0U);
        unregisterLifecycleListener(this.A0T);
        unregisterLifecycleListener(this.A13);
        if (this.A1G) {
            unregisterLifecycleListener(this.A12);
        }
        AnonymousClass1F6.A00(this.A0V).A07(getModuleName());
        Context context = getContext();
        if (!(context == null || (A012 = C31201Wx.A01(context)) == null)) {
            A012.A06((AnonymousClass2MC) null);
        }
        AnonymousClass0Z0.A09(515855336, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1882381859);
        super.onDestroyView();
        this.A0C.Azh();
        if (this.A1N) {
            getScrollingViewProxy().A8n();
        }
        this.A18 = null;
        C36251hk r0 = this.A0Z;
        if (r0 != null) {
            A0C(r0);
            C23300zv.A00(this.A0V).A03(C105504gy.class, this.A0Z.A05);
            this.A0Z = null;
        }
        this.A0Y.A02(this.mView);
        C16380oV.A00.A09(this.A0V, this);
        C23300zv A002 = C23300zv.A00(this.A0V);
        A002.A03(C32921c4.class, this.A1e);
        A002.A03(C32931c5.class, this.A1X);
        A002.A03(C32941c6.class, this.A1j);
        A002.A03(C32961c8.class, this.A1c);
        A002.A03(C32971c9.class, this.A1Y);
        A002.A03(C32981cA.class, this.A1f);
        if (C22490yW.A00()) {
            C11130eT.A01.A03(C114804wW.class, this.A1b);
        }
        A0C(this.A0x);
        unregisterLifecycleListener(this.A0x);
        C32591bW r1 = this.A1C;
        if (r1 != null) {
            r1.A04.clear();
            r1.A06.unregisterDataSetObserver(r1);
        }
        A0C(this.A0O);
        AnonymousClass0Q7.A03().A0D(this);
        this.A0X = null;
        if (!this.A1N) {
            A0C(this.A1D.A02);
            this.A1D = null;
        }
        this.A0v.A04.clear();
        AnonymousClass0Z0.A09(-1357485887, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0Z0.A02(-1141225939);
        super.onDetach();
        C23300zv.A00(this.A0V).A03(C35151ft.class, this.A07);
        AnonymousClass0Z0.A09(32422632, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1380819072);
        super.onPause();
        C26391Dc AXV = A08().AXV();
        if (AXV != null) {
            AXV.A01(this);
        }
        A04(this);
        if (this.A1J) {
            this.A1l.run();
        } else if (this.A1K) {
            C05700Lp.A00().ADc(this.A1l);
        }
        this.A0q.A06(this.A0r);
        this.A0r = null;
        if (C35221g0.A00(this.A0V).booleanValue() || C35231g1.A00(this.A0V).booleanValue()) {
            this.A1m.A01();
        }
        AnonymousClass0Z0.A09(2116394510, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1803213377);
        super.onResume();
        if (A0G()) {
            A01();
        }
        C26391Dc AXV = A08().AXV();
        AXV.A00(this);
        BDE(AXV);
        if (this.A1J) {
            this.A1k.run();
        } else if (this.A1K) {
            C05700Lp.A00().ADc(this.A1k);
        }
        this.A0q.A04(getContext());
        C35201fy A023 = this.A0q.A02(new C35181fw(this, this.A0V, this));
        this.A0r = A023;
        this.A0q.A07(A023);
        if (C35221g0.A00(this.A0V).booleanValue() || C35231g1.A00(this.A0V).booleanValue()) {
            AnonymousClass1I2.A00(this.A1m);
        }
        AnonymousClass0Z0.A09(-958953122, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A0J.A06.BeV(bundle);
        bundle.putBoolean("use_rv", this.A1N);
        bundle.putBoolean("primary_bg_ptr_spinner", this.A0n);
        bundle.putBoolean("notify_item_change", this.A0k);
        bundle.putBoolean("use_diff_util", this.A1M);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(326736581);
        super.onStart();
        this.A08.BOP((Activity) getContext());
        AnonymousClass0Z0.A09(724876180, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(1054242595);
        super.onStop();
        this.A08.BP6();
        AnonymousClass0Z0.A09(-1669722481, A022);
    }

    public final void onTokenChange() {
        FragmentActivity activity = getActivity();
        C12670hC.A04(new AnonymousClass49N(this, activity, AnonymousClass1EW.A03(activity)));
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1239029826);
        super.onViewStateRestored(bundle);
        this.A0J.BVv(bundle);
        AnonymousClass0Z0.A09(756298190, A022);
    }
}
