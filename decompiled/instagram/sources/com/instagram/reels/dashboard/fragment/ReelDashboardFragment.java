package com.instagram.reels.dashboard.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.p009ui.widget.triangleshape.TriangleShape;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0OW;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BD;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1H4;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1O2;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2Ay;
import p000X.AnonymousClass2E0;
import p000X.AnonymousClass2MT;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass2YL;
import p000X.AnonymousClass34N;
import p000X.AnonymousClass37F;
import p000X.AnonymousClass4LD;
import p000X.AnonymousClass4W3;
import p000X.AnonymousClass5BO;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass5H7;
import p000X.AnonymousClass5HB;
import p000X.AnonymousClass5IA;
import p000X.AnonymousClass5JR;
import p000X.AnonymousClass5JV;
import p000X.AnonymousClass5JW;
import p000X.AnonymousClass5JX;
import p000X.AnonymousClass5JY;
import p000X.AnonymousClass5JZ;
import p000X.AnonymousClass5KC;
import p000X.AnonymousClass5KG;
import p000X.AnonymousClass5KI;
import p000X.AnonymousClass5KK;
import p000X.AnonymousClass5KM;
import p000X.AnonymousClass5KN;
import p000X.AnonymousClass5KP;
import p000X.AnonymousClass5KQ;
import p000X.AnonymousClass5KR;
import p000X.AnonymousClass5KS;
import p000X.AnonymousClass5KT;
import p000X.AnonymousClass5KZ;
import p000X.AnonymousClass5Kj;
import p000X.AnonymousClass5L0;
import p000X.AnonymousClass5L2;
import p000X.AnonymousClass5L4;
import p000X.AnonymousClass5L6;
import p000X.AnonymousClass5LH;
import p000X.AnonymousClass5LI;
import p000X.AnonymousClass5LM;
import p000X.AnonymousClass5M0;
import p000X.AnonymousClass5M7;
import p000X.AnonymousClass5M8;
import p000X.AnonymousClass6UX;
import p000X.AnonymousClass6V7;
import p000X.AnonymousClass6X8;
import p000X.AnonymousClass7VB;
import p000X.AnonymousClass7VC;
import p000X.C06220Of;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C08480Xf;
import p000X.C103884eI;
import p000X.C104054eZ;
import p000X.C104174el;
import p000X.C104184em;
import p000X.C109034mp;
import p000X.C109074mt;
import p000X.C11200ea;
import p000X.C112254sJ;
import p000X.C120605Fh;
import p000X.C121125Hi;
import p000X.C121135Hj;
import p000X.C121145Hk;
import p000X.C121775Jv;
import p000X.C121845Kd;
import p000X.C121875Kg;
import p000X.C121885Kh;
import p000X.C121905Kk;
import p000X.C121945Ko;
import p000X.C121975Kr;
import p000X.C121985Ks;
import p000X.C122005Ku;
import p000X.C122015Kv;
import p000X.C122025Kw;
import p000X.C122035Kx;
import p000X.C122045Ky;
import p000X.C122055Kz;
import p000X.C122075Lb;
import p000X.C122085Lc;
import p000X.C122185Lo;
import p000X.C124685Vw;
import p000X.C13300iJ;
import p000X.C139165x9;
import p000X.C146186Mt;
import p000X.C147956Ua;
import p000X.C15890nh;
import p000X.C16180oA;
import p000X.C16230oG;
import p000X.C16330oQ;
import p000X.C17020pY;
import p000X.C171577Vd;
import p000X.C17510qM;
import p000X.C17850qu;
import p000X.C17910r0;
import p000X.C18810sS;
import p000X.C18980sj;
import p000X.C19020sn;
import p000X.C193418Ps;
import p000X.C213969Km;
import p000X.C21980xe;
import p000X.C22790z0;
import p000X.C23040zR;
import p000X.C23300zv;
import p000X.C249916w;
import p000X.C250016x;
import p000X.C250216z;
import p000X.C26301Cs;
import p000X.C27181Gu;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28351Lj;
import p000X.C29631Qq;
import p000X.C31071Wi;
import p000X.C31151Wq;
import p000X.C31201Wx;
import p000X.C32481bK;
import p000X.C34071dx;
import p000X.C34151eA;
import p000X.C34181eD;
import p000X.C34261eN;
import p000X.C35051fj;
import p000X.C35071fl;
import p000X.C35241g2;
import p000X.C39941no;
import p000X.C44541wK;
import p000X.C44591wP;
import p000X.C476424v;
import p000X.C50282Fr;
import p000X.C52152Nq;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C59032gv;
import p000X.C59302hM;
import p000X.C60562k6;
import p000X.C60572k7;
import p000X.C62452nj;
import p000X.C68172yZ;
import p000X.C78083b8;

public class ReelDashboardFragment extends C27341Hl implements C27371Ho, AnonymousClass1HK, AnonymousClass1E8, C122185Lo, C11200ea, C109074mt, C476424v, AnonymousClass6V7 {
    public int A00;
    public int A01 = -1;
    public AnonymousClass1EG A02;
    public AnonymousClass1US A03;
    public AnonymousClass0QT A04;
    public C31151Wq A05;
    public Reel A06;
    public C50282Fr A07;
    public AnonymousClass5KS A08 = null;
    public C121845Kd A09;
    public AnonymousClass5IA A0A;
    public AnonymousClass0C1 A0B;
    public C109034mp A0C;
    public String A0D;
    public boolean A0E = true;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public long A0I = 0;
    public View A0J;
    public C29631Qq A0K;
    public AnonymousClass6UX A0L;
    public AnonymousClass1UY A0M;
    public C52152Nq A0N;
    public String A0O;
    public String A0P;
    public Set A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public final Runnable A0T = new C121905Kk(this);
    public final Map A0U = new HashMap();
    public final Set A0V = new HashSet();
    public final C11200ea A0W = new C104184em(this);
    public final C11200ea A0X = new C104174el(this);
    public final Map A0Y = new HashMap();
    public TouchInterceptorFrameLayout mContainer;
    public EmptyStateView mEmptyView;
    public ReboundViewPager mImageViewPager;
    public AnonymousClass5JW mListAdapter;
    public ReboundViewPager mListViewPager;
    public AnonymousClass5KZ mPagerAdapter;
    public ReboundViewPager mScrollOwner;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void AtP(C13300iJ r10) {
        C13300iJ r5 = r10;
        if (r10.A0e()) {
            C122005Ku r2 = new C122005Ku(this.A04.A02("unblock_button_tapped"));
            r2.A08("target_id", r10.getId());
            r2.A01();
        } else {
            AnonymousClass5L2 r22 = new AnonymousClass5L2(this.A04.A02("block_button_tapped"));
            r22.A08("target_id", r10.getId());
            r22.A01();
        }
        boolean A0e = r10.A0e();
        C18810sS r1 = C18810sS.A00;
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        r1.A00(context, this.A0B, getModuleName(), r5, new AnonymousClass5KK(this, r10, A0e), r10.AZn(), (String) null);
    }

    public final void AwG(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        List singletonList = Collections.singletonList(reel);
        AnonymousClass1UY r4 = this.A0M;
        r4.A0A = this.A0O;
        r4.A04 = new C124685Vw((Activity) getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), (AnonymousClass1W5) new C120605Fh(this));
        r4.A07(gradientSpinnerAvatarView, reel, singletonList, singletonList, singletonList, AnonymousClass1OY.REEL_VIEWER_LIST);
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void BRl(C13300iJ r9) {
        C13300iJ r3 = r9;
        if (r9.A0f()) {
            C121985Ks r2 = new C121985Ks(AnonymousClass0QT.A00(this.A0B, this).A02("unhide_story_button_tapped"));
            r2.A08("target_id", r9.getId());
            r2.A01();
        } else {
            AnonymousClass5L0 r22 = new AnonymousClass5L0(AnonymousClass0QT.A00(this.A0B, this).A02("hide_story_button_tapped"));
            r22.A08("target_id", r9.getId());
            r22.A01();
        }
        if (this.A0C == null) {
            this.A0C = new C109034mp(this, this.A0B);
        }
        this.A0C.A00(r3, this, "dashboard", false, this.A06.A0W());
    }

    public static C39941no A01(ReelDashboardFragment reelDashboardFragment) {
        ReboundViewPager reboundViewPager = reelDashboardFragment.mListViewPager;
        if (reboundViewPager == null) {
            return null;
        }
        return reelDashboardFragment.A07.A0A(reelDashboardFragment.A0B, reboundViewPager.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r1.A0Z() != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (p000X.AnonymousClass5JZ.A00(r2, r3) != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2.A0Z() != false) goto L_0x0019;
     */
    private void A03() {
        boolean z;
        boolean z2;
        boolean z3;
        View view;
        AnonymousClass0C1 r3 = this.A0B;
        Reel reel = this.A06;
        if (!reel.A0x) {
            z = false;
        }
        z = true;
        if (!z) {
            z2 = false;
        }
        z2 = true;
        AnonymousClass0a4.A0A(z2);
        C23300zv A002 = C23300zv.A00(this.A0B);
        A002.A02(C35241g2.class, this);
        A002.A02(C31071Wi.class, this.A0N);
        A002.A02(C104054eZ.class, this.A0W);
        A002.A02(C103884eI.class, this.A0X);
        AnonymousClass0C1 r0 = this.A0B;
        Reel reel2 = this.A06;
        if (!AnonymousClass5JZ.A00(reel2, r0)) {
            z3 = true;
        }
        z3 = false;
        if (z3 || (view = this.A0J) == null) {
            this.A0J.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        C50282Fr r4 = new C50282Fr(this.A0B, this.A06, -1, false, this.A0Q);
        this.A07 = r4;
        if (this.A01 == -1) {
            this.A01 = r4.A05(this.A0B, this.A0P);
        }
        AnonymousClass5KZ r1 = this.mPagerAdapter;
        r1.A00 = this.A07;
        AnonymousClass0Z1.A00(r1, -1574714095);
        AnonymousClass5JW r12 = this.mListAdapter;
        r12.A01 = this.A07;
        AnonymousClass0Z1.A00(r12, -1416777687);
        this.mListAdapter.A00 = this.A01;
        this.mEmptyView.setVisibility(8);
        this.mImageViewPager.A0I(this.A01);
        this.mListViewPager.A0I(this.A01);
        if (this.A0S) {
            this.A0S = false;
            int i = this.A01;
            if (i >= 0 && i < this.A07.A03(this.A0B)) {
                C39941no A0A2 = this.A07.A0A(this.A0B, this.A01);
                C121775Jv r32 = new C121775Jv(AnonymousClass0QT.A00(this.A0B, this).A02("reel_more_action"));
                r32.A06("m_t", Integer.valueOf(A0A2.A01()));
                r32.A08("m_pk", A0A2.getId());
                r32.A06("reel_position", Integer.valueOf(this.A01));
                r32.A08("reel_type", this.A06.A0I());
                r32.A06("reel_size", Integer.valueOf(C50282Fr.A00(this.A07, this.A0B).size()));
                r32.A08("action", "viewers_list_impression");
                C34261eN A003 = C60572k7.A00(A0A2);
                if (A003 != null) {
                    r32.A08("poll_id", A003.A01);
                }
                r32.A01();
                A0A(this, this.A01);
            }
        }
    }

    public static void A04(ReelDashboardFragment reelDashboardFragment) {
        View view = reelDashboardFragment.mView;
        if (view != null) {
            int intValue = ((Integer) AnonymousClass0L6.A02(reelDashboardFragment.A0B, AnonymousClass0L7.PUBLISHER_STORIES_MIGRATION, "reel_refresh_rate_limit_ms", 0, (AnonymousClass04H) null)).intValue();
            view.removeCallbacks(reelDashboardFragment.A0T);
            view.postDelayed(reelDashboardFragment.A0T, (long) intValue);
        }
    }

    public static void A05(ReelDashboardFragment reelDashboardFragment) {
        reelDashboardFragment.mEmptyView.setVisibility(0);
        reelDashboardFragment.mEmptyView.A0M(AnonymousClass2Oq.LOADING);
        AnonymousClass2E0.A00(reelDashboardFragment.A0B).A03(reelDashboardFragment.A0D, (String) null, reelDashboardFragment);
        AnonymousClass2E0 A002 = AnonymousClass2E0.A00(reelDashboardFragment.A0B);
        String str = reelDashboardFragment.A0D;
        String moduleName = reelDashboardFragment.getModuleName();
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        A002.A04(hashSet, (C59302hM) null, (Map) null, moduleName);
    }

    public static void A07(ReelDashboardFragment reelDashboardFragment) {
        if (reelDashboardFragment.A0E) {
            reelDashboardFragment.A06.A0K();
        }
        if (reelDashboardFragment.A06.A0l(reelDashboardFragment.A0B)) {
            if (reelDashboardFragment.A0J() && !reelDashboardFragment.mFragmentManager.A16("ReelViewerFragment.BACK_STACK_NAME", 1)) {
                reelDashboardFragment.getActivity().finish();
            }
        } else if (C50282Fr.A00(reelDashboardFragment.A07, reelDashboardFragment.A0B).isEmpty()) {
            A06(reelDashboardFragment);
        } else if (!A0K(reelDashboardFragment)) {
            A04(reelDashboardFragment);
        }
        reelDashboardFragment.A0E = true;
    }

    public static void A08(ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass5M7 r4 = new AnonymousClass5M7(reelDashboardFragment.getContext(), reelDashboardFragment.A0B, reelDashboardFragment.mFragmentManager, AnonymousClass1L8.A00(reelDashboardFragment));
        Reel reel = reelDashboardFragment.A06;
        r4.A03 = reelDashboardFragment;
        int size = reel.A0J(r4.A09).size();
        r4.A00 = size;
        C121775Jv r2 = new C121775Jv(AnonymousClass0QT.A00(r4.A09, r4.A03).A02("reel_more_action"));
        r2.A06("reel_size", Integer.valueOf(size));
        r2.A08("action", "'save_whole_story'");
        r2.A01();
        r4.A04 = AnonymousClass000.A0J(C193418Ps.$const$string(6), r4.A07.getPackageName(), "/raw/silent_static_image_audio");
        AnonymousClass5JR.A03(r4.A01);
        Context context = r4.A07;
        C28351Lj.A00(context, r4.A02, new AnonymousClass5M8(r4, context, r4.A09, reel));
    }

    public static void A09(ReelDashboardFragment reelDashboardFragment, float f, RectF rectF) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = reelDashboardFragment.mContainer;
        if (touchInterceptorFrameLayout != null) {
            double d = (double) f;
            float A012 = (float) C27181Gu.A01(d, 0.0d, 1.0d, 1.0d, 5.0d);
            touchInterceptorFrameLayout.setScaleX(A012);
            reelDashboardFragment.mContainer.setScaleY(A012);
            float width = ((float) (reelDashboardFragment.mContainer.getWidth() >> 1)) - rectF.centerX();
            float height = ((float) (reelDashboardFragment.mContainer.getHeight() >> 1)) - rectF.centerY();
            reelDashboardFragment.mContainer.setTranslationX((float) C27181Gu.A01(d, 0.0d, 1.0d, 0.0d, (double) (width * 5.0f)));
            reelDashboardFragment.mContainer.setTranslationY((float) C27181Gu.A01(d, 0.0d, 1.0d, 0.0d, (double) (height * 5.0f)));
        }
    }

    public static void A0A(ReelDashboardFragment reelDashboardFragment, int i) {
        if (i >= 0 && i < reelDashboardFragment.A07.A03(reelDashboardFragment.A0B)) {
            C39941no A0A2 = reelDashboardFragment.A07.A0A(reelDashboardFragment.A0B, i);
            if (A0A2.A08 != null) {
                C122045Ky r2 = new C122045Ky(AnonymousClass0QT.A00(reelDashboardFragment.A0B, reelDashboardFragment).A02("reel_viewer_dashboard_feedback"));
                r2.A06("total_view_count", Integer.valueOf(A0A2.A02()));
                r2.A08("media_id", A0A2.A08.A0u());
                r2.A01();
            }
        }
    }

    public static void A0C(ReelDashboardFragment reelDashboardFragment, View view) {
        if (!reelDashboardFragment.A0R) {
            reelDashboardFragment.A0R = true;
            RectF A0A2 = C06220Of.A0A(view);
            Bundle bundle = new Bundle();
            bundle.putString("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", "reel_dashboard");
            bundle.putParcelable("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", A0A2);
            C59032gv.A00(reelDashboardFragment.A0B, TransparentModalActivity.class, "reel_dashboard_add_to_story_camera", bundle, reelDashboardFragment.getActivity()).A06(reelDashboardFragment.getContext());
        }
    }

    public static void A0E(ReelDashboardFragment reelDashboardFragment, AnonymousClass5L6 r4) {
        String str;
        AnonymousClass5JW r1 = reelDashboardFragment.mListAdapter;
        if (r1 != null && (str = r4.A08) != null) {
            AnonymousClass5JX r0 = (AnonymousClass5JX) r1.A09.get(C16180oA.A00(r1.A07).A00.getString(AnonymousClass000.A0E("reel_viewers_list_megaphone_item_id", str), (String) null));
            if (r0 != null) {
                AnonymousClass5H7 r3 = r0.A0Y;
                C16180oA.A00(r3.A08).A00.edit().putBoolean(AnonymousClass000.A0E("dismissed_reel_viewers_list_megaphone", str), true).apply();
                r3.A04();
            }
        }
    }

    public static void A0F(ReelDashboardFragment reelDashboardFragment, C13300iJ r3) {
        C122035Kx r2 = new C122035Kx(AnonymousClass0QT.A00(reelDashboardFragment.A0B, reelDashboardFragment).A02("reel_viewer_dashboard_overflow_cancel"));
        r2.A08("target_id", r3.getId());
        r2.A01();
    }

    public static void A0H(ReelDashboardFragment reelDashboardFragment, String str) {
        C52902Qq A012 = C52902Qq.A01(reelDashboardFragment.A0B, str, "reel_dashboard_user", reelDashboardFragment.getModuleName());
        if (reelDashboardFragment.A0J()) {
            C52362Om r2 = new C52362Om(reelDashboardFragment.getActivity(), reelDashboardFragment.A0B);
            r2.A02 = C18980sj.A00.A00().A02(A012.A03());
            r2.A02();
        }
    }

    private boolean A0J() {
        AnonymousClass1AM r0 = this.mFragmentManager;
        FragmentActivity activity = getActivity();
        if (r0 == null || !AnonymousClass1H4.A01(r0) || activity == null) {
            return false;
        }
        return true;
    }

    public final void A0N(String str, String str2) {
        C52362Om r3 = new C52362Om(getActivity(), this.A0B);
        C17020pY.A00();
        AnonymousClass5M0 r2 = new AnonymousClass5M0();
        Bundle bundle = new Bundle();
        bundle.putString("ReelQuestionResponsesListFragment.REEL_ID", str);
        bundle.putString("ReelQuestionResponsesListFragment.REEL_ITEM_ID", str2);
        r2.setArguments(bundle);
        r3.A02 = r2;
        r3.A02();
    }

    public final void ArT(AnonymousClass5LM r13) {
        List A0W2;
        C249916w r1 = r13.A01.A0M;
        switch (r1.AQj().intValue()) {
            case 2:
                String id = r1.getId();
                C52362Om r2 = new C52362Om(getActivity(), this.A0B);
                r2.A02 = C16230oG.A00.getFragmentFactory().Apr(id);
                r2.A02();
                return;
            case 3:
                String id2 = r1.getId();
                C52362Om r4 = new C52362Om(getActivity(), this.A0B);
                r4.A02 = C17910r0.A00.A01().A01(new Hashtag(id2), getModuleName(), "DEFAULT");
                r4.A02();
                return;
            case 5:
                C39941no A012 = A01(this);
                if (A012 != null && (A0W2 = A012.A0W(C34181eD.PRODUCT)) != null && !A0W2.isEmpty()) {
                    C34151eA r3 = (C34151eA) A0W2.get(0);
                    C213969Km A0Q2 = C17510qM.A00.A0Q(requireActivity(), r3.A03(), this.A0B, this, "reel_dashboard", (String) null);
                    A0Q2.A02 = A012.A08;
                    A0Q2.A08 = null;
                    A0Q2.A06 = r3;
                    A0Q2.A02();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void Azu(AnonymousClass5HB r5, C13300iJ r6, C39941no r7, boolean z) {
        AnonymousClass5BO A012 = C19020sn.A00.A04().A01(this.A0B, this, "reel_dashboard_viewer");
        A012.A00.putString("DirectReplyModalFragment.reel_id", r7.A0F);
        A012.A00.putString("DirectReplyModalFragment.reel_item_id", r7.getId());
        A012.A00.putBoolean("DirectReplyModalFragment.is_archive_reel", z);
        A012.A00.putString("DirectReplyModalFragment.viewer_user_id", r6.getId());
        C31201Wx.A01(getContext()).A0F(A012.A00());
    }

    public final void B9Z(String str) {
        this.mEmptyView.A0M(AnonymousClass2Oq.ERROR);
        AnonymousClass5F9.A01(getContext(), C0003R.string.network_error, 0);
    }

    public final void B9g(String str, boolean z) {
        Reel A0G2 = ReelStore.A02(this.A0B).A0G(this.A0D);
        this.A06 = A0G2;
        if (!A0G2.A0l(this.A0B)) {
            A03();
        } else if (A0J() && !this.mFragmentManager.A16("ReelViewerFragment.BACK_STACK_NAME", 1)) {
            getActivity().finish();
        }
    }

    public final void BDT(AnonymousClass5HB r7) {
        C13300iJ r3 = r7.A07;
        C122025Kw r4 = new C122025Kw(AnonymousClass0QT.A00(this.A0B, this).A02("reel_viewer_dashboard_overflow_click"));
        r4.A08("target_id", r3.getId());
        r4.A01();
        if (((Boolean) AnonymousClass0L6.A02(this.A0B, AnonymousClass0L7.STORY_VIEWER_LIST_GRAPH_EVOLUTION_ACTIONS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            String id = r3.getId();
            AnonymousClass5KR r2 = new AnonymousClass5KR();
            Bundle bundle = new Bundle();
            bundle.putString("ReelDashboardActionsFragment.VIEWER_USER_ID", id);
            r2.setArguments(bundle);
            r2.A01 = this;
            AnonymousClass2TH r1 = new AnonymousClass2TH(this.A0B);
            r1.A0L = r3.AZn();
            r1.A0G = new AnonymousClass5KQ(this, r7, r3);
            r1.A00().A06(getContext(), r2);
            return;
        }
        if (this.A0A == null) {
            this.A0A = new AnonymousClass5IA(getRootActivity());
        }
        this.A0A.A00(r3, this.A06, new AnonymousClass5KT(this, r7));
    }

    public final void BGp(C147956Ua r2, int i) {
        this.A0L.A04(r2, i);
    }

    public final void BHN() {
        AnonymousClass0Z1.A00(this.mListAdapter, -1062088194);
    }

    public final void BHO(C13300iJ r4, boolean z) {
        if (z) {
            C122055Kz r2 = new C122055Kz(AnonymousClass0QT.A00(this.A0B, this).A02("hide_story_dialog_confirmed"));
            r2.A08("target_id", r4.getId());
            r2.A01();
            return;
        }
        C121975Kr r22 = new C121975Kr(AnonymousClass0QT.A00(this.A0B, this).A02("unhide_story_dialog_confirmed"));
        r22.A08("target_id", r4.getId());
        r22.A01();
    }

    public final void BOK(AnonymousClass1EG r6) {
        ReboundViewPager reboundViewPager = this.mImageViewPager;
        if (reboundViewPager != this.mScrollOwner) {
            reboundViewPager.A0F((float) r6.A00(), true);
        }
    }

    public final void BRk(AnonymousClass5LM r11) {
        Context context;
        int i;
        Context context2;
        int i2;
        AnonymousClass2OA r2;
        Context context3;
        int i3;
        C39941no A0A2 = this.A07.A0A(this.A0B, this.mListViewPager.A06);
        if (this.A09 == null) {
            this.A09 = new C121845Kd(this.A0B, this);
        }
        C121845Kd r7 = this.A09;
        r7.A00 = new WeakReference(this);
        String name = r11.A01.A0M.getName();
        boolean A14 = A0A2.A14();
        boolean z = r11.A02;
        AnonymousClass5KC r6 = new AnonymousClass5KC(r7, r11, A0A2, this);
        if (z) {
            if (A14) {
                context3 = r7.A01;
                i3 = C0003R.string.unhide_video_from_multi_author_story_title;
            } else {
                context3 = r7.A01;
                i3 = C0003R.string.unhide_photo_from_multi_author_story_title;
            }
            String string = context3.getString(i3);
            r2 = new AnonymousClass2OA(r7.A01);
            r2.A0K(r7.A02);
            r2.A0W(new CharSequence[]{string}, r6);
        } else {
            if (A14) {
                context = r7.A01;
                i = C0003R.string.hide_video_from_multi_author_story_title;
            } else {
                context = r7.A01;
                i = C0003R.string.hide_photo_from_multi_author_story_title;
            }
            String string2 = context.getString(i, new Object[]{name});
            if (A14) {
                context2 = r7.A01;
                i2 = C0003R.string.hide_video_from_multi_author_story_message;
            } else {
                context2 = r7.A01;
                i2 = C0003R.string.hide_photo_from_multi_author_story_message;
            }
            String string3 = context2.getString(i2, new Object[]{name});
            boolean z2 = r11.A02;
            int i4 = C0003R.string.hide_from_multi_author_story_button;
            if (z2) {
                i4 = C0003R.string.f118ok;
            }
            r2 = new AnonymousClass2OA(r7.A01);
            r2.A03 = string2;
            r2.A0M(string3);
            r2.A09(C0003R.string.cancel, new AnonymousClass5Kj(r7));
            r2.A0A(i4, r6);
        }
        r2.A0U(true);
        r2.A0V(true);
        r2.A03().show();
    }

    public final void BW5(AnonymousClass5HB r4) {
        C13300iJ r0 = r4.A07;
        if (r0 != null) {
            String id = r0.getId();
            C122015Kv r1 = new C122015Kv(AnonymousClass0QT.A00(this.A0B, this).A02("reel_viewer_dashboard_profile_click"));
            r1.A08("target_id", id);
            r1.A01();
            A0H(this, id);
        }
    }

    public final String getModuleName() {
        String str;
        if (this.A00 == 1) {
            str = "replay_";
        } else {
            str = "reel_";
        }
        return AnonymousClass000.A0E(str, "dashboard");
    }

    public final boolean onBackPressed() {
        String id;
        if (this.A0F || this.A06 == null) {
            return false;
        }
        if (A02(this).A0b()) {
            return true;
        }
        this.A0F = false;
        RectF A002 = A00(this);
        if (this.A07.A0J(this.A0B)) {
            id = null;
        } else {
            C50282Fr r4 = this.A07;
            AnonymousClass0C1 r3 = this.A0B;
            id = r4.A0A(r3, Math.min(this.mImageViewPager.A06, r4.A03(r3) - 1)).getId();
        }
        A02(this).A0X(this.A06, (List) null, -2, id, (RectF) null, A002, new AnonymousClass5KM(this, A002), false, AnonymousClass1OY.DASHBOARD, this.A0Q);
        return true;
    }

    public static RectF A00(ReelDashboardFragment reelDashboardFragment) {
        ReboundViewPager reboundViewPager;
        Context context = reelDashboardFragment.getContext();
        if (context == null || !((reboundViewPager = reelDashboardFragment.mImageViewPager) == null || reboundViewPager.A0C == null)) {
            int[] iArr = new int[2];
            View view = reelDashboardFragment.mImageViewPager.A0C;
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            return new RectF((float) i, (float) i2, (float) (i + view.getWidth()), (float) (i2 + view.getHeight()));
        }
        float A092 = ((float) C06220Of.A09(context)) / 2.0f;
        float A082 = ((float) C06220Of.A08(reelDashboardFragment.getContext())) / 2.0f;
        return new RectF(A092, A082, A092, A082);
    }

    public static C34071dx A02(ReelDashboardFragment reelDashboardFragment) {
        return C17020pY.A00().A0V(reelDashboardFragment.getActivity(), reelDashboardFragment.A0B);
    }

    public static void A06(ReelDashboardFragment reelDashboardFragment) {
        if (reelDashboardFragment.A0J()) {
            AnonymousClass0QD.A01("ReelDashboardListAdapter", "Resetting view holder id counter");
            AnonymousClass5JW.A0D = 0;
            reelDashboardFragment.getActivity().onBackPressed();
        }
    }

    public static void A0B(ReelDashboardFragment reelDashboardFragment, int i) {
        AnonymousClass1HD targetFragment = reelDashboardFragment.getTargetFragment();
        if (targetFragment instanceof ReelViewerFragment) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) targetFragment;
            C50282Fr r2 = reelDashboardFragment.A07;
            AnonymousClass0C1 r1 = reelDashboardFragment.A0B;
            String id = r2.A0A(r1, Math.min(i, r2.A03(r1) - 1)).getId();
            C50282Fr r22 = reelViewerFragment.A0Y;
            if (r22 != null) {
                AnonymousClass0C1 r12 = reelViewerFragment.A1F;
                r22.A0G(r12, r22.A05(r12, id));
            }
        }
    }

    public static void A0D(ReelDashboardFragment reelDashboardFragment, C39941no r7, String str) {
        AnonymousClass0a4.A06(reelDashboardFragment.getActivity());
        C121945Ko r1 = new C121945Ko(AnonymousClass0QT.A00(reelDashboardFragment.A0B, reelDashboardFragment).A02("ig_aqr_tap_to_see_responders"));
        r1.A08("selected", str);
        r1.A01();
        C52362Om r5 = new C52362Om(reelDashboardFragment.getActivity(), reelDashboardFragment.A0B);
        C17020pY.A00();
        String str2 = r7.A0F;
        String id = r7.getId();
        C122075Lb r2 = new C122075Lb();
        Bundle bundle = new Bundle();
        bundle.putString("ReelUserListFragment.REEL_ID", str2);
        bundle.putString("ReelUserListFragment.REEL_ITEM_ID", id);
        if (str != null) {
            bundle.putString("ReelUserListFragment.REEL_REACTION", str);
        }
        r2.setArguments(bundle);
        r5.A02 = r2;
        r5.A02();
    }

    public static void A0G(ReelDashboardFragment reelDashboardFragment, Boolean bool, String str) {
        if (bool.booleanValue()) {
            C52362Om r2 = new C52362Om(reelDashboardFragment.getActivity(), reelDashboardFragment.A0B);
            C139165x9 r1 = new C139165x9(reelDashboardFragment.A0B);
            r1.A03(str);
            r1.A04("");
            r2.A02 = r1.A02();
            r2.A02();
            return;
        }
        AnonymousClass1BH.A0H(C08480Xf.A00(str), reelDashboardFragment.getContext());
    }

    public static void A0I(ReelDashboardFragment reelDashboardFragment, String str, String str2, boolean z, AnonymousClass5JV r11) {
        C15890nh r3;
        if (reelDashboardFragment.isVisible()) {
            AnonymousClass5LH r2 = new AnonymousClass5LH(reelDashboardFragment, str, r11);
            if (reelDashboardFragment.A00 == 1) {
                r3 = new C15890nh(reelDashboardFragment.A0B);
                r3.A09 = Constants.A0N;
                r3.A0E("live/%s/get_post_live_viewers_list/", str);
                if (str2 != null) {
                    r3.A09("max_id", str2);
                }
            } else {
                AnonymousClass0C1 r5 = reelDashboardFragment.A0B;
                r3 = new C15890nh(r5);
                r3.A09 = Constants.A0N;
                r3.A0C = C06360Ot.formatString("media/%s/list_reel_media_viewer/", str.split("_")[0]);
                if (str2 != null) {
                    r3.A09("max_id", str2);
                }
                if (z) {
                    r3.A0C("include_blacklist_sample", true);
                }
                Pair A002 = C23040zR.A00(r5);
                r3.A0A((String) A002.first, (String) A002.second);
            }
            r3.A06(AnonymousClass5LI.class, false);
            C17850qu A032 = r3.A03();
            A032.A00 = r2;
            reelDashboardFragment.schedule(A032);
        }
    }

    public static boolean A0K(ReelDashboardFragment reelDashboardFragment) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - reelDashboardFragment.A0I <= ((long) ((Integer) AnonymousClass0L6.A02(reelDashboardFragment.A0B, AnonymousClass0L7.PUBLISHER_STORIES_MIGRATION, "reel_refresh_rate_limit_ms", 0, (AnonymousClass04H) null)).intValue())) {
            return false;
        }
        reelDashboardFragment.A0I = currentTimeMillis;
        reelDashboardFragment.A0V.clear();
        reelDashboardFragment.mListAdapter.A09.clear();
        int min = Math.min(reelDashboardFragment.mListViewPager.A05, reelDashboardFragment.A07.A03(reelDashboardFragment.A0B) - 1);
        float f = (float) min;
        reelDashboardFragment.mListViewPager.A0D(f);
        reelDashboardFragment.mImageViewPager.A0D(f);
        A0B(reelDashboardFragment, min);
        View view = reelDashboardFragment.mView;
        if (view != null) {
            view.removeCallbacks(reelDashboardFragment.A0T);
        }
        return true;
    }

    public final void A0L(View view, Integer num, C39941no r12) {
        AnonymousClass7VB r3;
        String str;
        switch (num.intValue()) {
            case 0:
                C34261eN A002 = C60572k7.A00(r12);
                C121775Jv r2 = new C121775Jv(AnonymousClass0QT.A00(this.A0B, this).A02("reel_more_action"));
                r2.A08("poll_id", A002.A01);
                r2.A06("m_t", Integer.valueOf(r12.A01()));
                r2.A08("m_pk", r12.getId());
                r2.A06("reel_position", Integer.valueOf(this.mListViewPager.A05));
                r2.A08("reel_type", this.A06.A0I());
                r2.A06("reel_size", Integer.valueOf(C50282Fr.A00(this.A07, this.A0B).size()));
                r2.A08("action", "poll_result_see_all_click");
                r2.A01();
                C52362Om r5 = new C52362Om(getActivity(), this.A0B);
                C17020pY.A00();
                String str2 = r12.A0F;
                String id = r12.getId();
                C122085Lc r22 = new C122085Lc();
                Bundle bundle = new Bundle();
                bundle.putString("ReelUserListFragment.REEL_ID", str2);
                bundle.putString("ReelUserListFragment.REEL_ITEM_ID", id);
                r22.setArguments(bundle);
                r5.A02 = r22;
                r5.A02();
                return;
            case 1:
                RectF A0A2 = C06220Of.A0A(view);
                C68172yZ r4 = new C68172yZ(getContext());
                r4.A00(getString(C0003R.string.loading));
                Context context = getContext();
                AnonymousClass1NJ r23 = r12.A08;
                AnonymousClass0a4.A06(r23);
                AnonymousClass2MT A003 = AnonymousClass6X8.A00(context, r23, "ReelDashboardFragment", false);
                A003.A00 = new AnonymousClass4W3(this, r4, A0A2, r12);
                schedule(A003);
                return;
            case 2:
                C52362Om r52 = new C52362Om(getActivity(), this.A0B);
                C17020pY.A00();
                String str3 = r12.A0F;
                String id2 = r12.getId();
                AnonymousClass5M0 r24 = new AnonymousClass5M0();
                Bundle bundle2 = new Bundle();
                bundle2.putString("ReelQuestionResponsesListFragment.REEL_ID", str3);
                bundle2.putString("ReelQuestionResponsesListFragment.REEL_ITEM_ID", id2);
                r24.setArguments(bundle2);
                r52.A02 = r24;
                r52.A02();
                return;
            case 3:
                C52362Om r6 = new C52362Om(getActivity(), this.A0B);
                C17020pY.A00();
                String str4 = r12.A0F;
                String id3 = r12.getId();
                C121135Hj r25 = new C121135Hj();
                Bundle bundle3 = new Bundle();
                bundle3.putString("ReelQuizRespondersListFragment.REEL_ID", str4);
                bundle3.putString("ReelQuizRespondersListFragment.REEL_ITEM_ID", id3);
                bundle3.putInt("ReelQuizRespondersListFragment.QUIZ_OPTION_INDEX", -1);
                r25.setArguments(bundle3);
                r6.A02 = r25;
                r6.A02();
                return;
            case 4:
                String str5 = ((C34151eA) r12.A0W(C34181eD.SLIDER).get(0)).A0V.A05;
                C121775Jv r26 = new C121775Jv(AnonymousClass0QT.A00(this.A0B, this).A02("reel_more_action"));
                r26.A08("slider_id", str5);
                r26.A06("m_t", Integer.valueOf(r12.A01()));
                r26.A08("m_pk", r12.getId());
                r26.A06("reel_position", Integer.valueOf(this.mListViewPager.A05));
                r26.A08("reel_type", this.A06.A0I());
                r26.A06("reel_size", Integer.valueOf(C50282Fr.A00(this.A07, this.A0B).size()));
                r26.A08("action", "slider_result_see_all_click");
                r26.A01();
                C52362Om r53 = new C52362Om(getActivity(), this.A0B);
                C17020pY.A00();
                String str6 = r12.A0F;
                String id4 = r12.getId();
                C121125Hi r27 = new C121125Hi();
                Bundle bundle4 = new Bundle();
                bundle4.putString("ReelSliderVotersListFragment.REEL_ID", str6);
                bundle4.putString("ReelSliderVotersListFragment.REEL_ITEM_ID", id4);
                r27.setArguments(bundle4);
                r53.A02 = r27;
                r53.A02();
                return;
            case 5:
                C52362Om r54 = new C52362Om(getActivity(), this.A0B);
                C17020pY.A00();
                String str7 = r12.A0F;
                String id5 = r12.getId();
                C121145Hk r28 = new C121145Hk();
                Bundle bundle5 = new Bundle();
                bundle5.putString("ReelFundraiserDonorsListFragment.REEL_ID", str7);
                bundle5.putString("ReelFundraiserDonorsListFragment.REEL_ITEM_ID", id5);
                r28.setArguments(bundle5);
                r54.A02 = r28;
                r54.A02();
                return;
            case 6:
                C171577Vd A022 = C60562k6.A02(r12);
                if (A022 != null && (str = A022.A05) != null) {
                    C21980xe A004 = C21980xe.A00(getActivity(), this.A0B, "reel_viewer_dashboard", this);
                    A004.A05(str);
                    A004.A0C();
                    return;
                }
                return;
            case 7:
                C34151eA A012 = AnonymousClass7VC.A01(r12);
                if (A012 == null) {
                    r3 = null;
                } else {
                    r3 = A012.A0O;
                }
                AnonymousClass0a4.A06(r3);
                AnonymousClass7VB r32 = r3;
                AnonymousClass0C1 r55 = this.A0B;
                String str8 = r32.A05;
                AnonymousClass0a4.A06(str8);
                HashMap hashMap = new HashMap();
                hashMap.put("sticker_id", str8);
                C146186Mt.A04(r55, this, hashMap, "ig_cg_create_thanks_sticker_begin");
                AnonymousClass0C1 r56 = this.A0B;
                Context context2 = getContext();
                C13300iJ r62 = r32.A02;
                String str9 = r32.A08;
                int[] iArr = AnonymousClass7VB.A0F;
                int A0A3 = AnonymousClass0OW.A0A(str9, iArr[0]);
                int A0A4 = AnonymousClass0OW.A0A(r32.A07, iArr[1]);
                int A0A5 = AnonymousClass0OW.A0A(r32.A0D, -16777216);
                Bundle bundle6 = new Bundle();
                bundle6.putString(C193418Ps.$const$string(63), "fundraiser_creator_thanks_sticker");
                bundle6.putInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_GRADIENT_START_BACKGROUND_COLOR", A0A3);
                bundle6.putInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_GRADIENT_END_BACKGROUND_COLOR", A0A4);
                bundle6.putInt("ReelFundraiserShareConstants.ARGUMENTS_KEY_MESSAGE_COLOR", A0A5);
                try {
                    bundle6.putString("ReelFundraiserShareConstants.ARGUMENTS_KEY_FUNDRAISER_RECIPIENT", AnonymousClass1O2.A02(r62));
                    C59032gv.A00(r56, TransparentModalActivity.class, AnonymousClass0C5.$const$string(283), bundle6, (Activity) context2).A06(context2);
                    return;
                } catch (IOException unused) {
                    AnonymousClass0QD.A02("ReelFundraiserShareHelper", "Could not json serialize model User for the fundraiser public thanks sticker.");
                    return;
                }
            case 8:
                A0D(this, r12, (String) null);
                return;
            default:
                throw new UnsupportedOperationException("Unknown CTA type");
        }
    }

    public final void A0M(AnonymousClass5L6 r6) {
        C22790z0 r4;
        C35071fl r3;
        long j;
        String str;
        A0E(this, r6);
        if (r6.A04 != null) {
            String str2 = r6.A08;
            if ("IMBE".equals(str2)) {
                AnonymousClass5L4 A002 = AnonymousClass5L4.A00(this.A0B);
                r4 = A002.A05.A00;
                r3 = C35051fj.A0R;
                j = A002.A00;
                str = "imbe_producer_nux_megaphone_learn_more_click";
            } else {
                if ("IMBE_DISCLOSURE".equals(str2)) {
                    C16180oA.A00(this.A0B).A00.edit().putBoolean("story_imbe_viewershett_disclosure_view", true).apply();
                    AnonymousClass5L4 A003 = AnonymousClass5L4.A00(this.A0B);
                    r4 = A003.A05.A00;
                    r3 = C35051fj.A0R;
                    j = A003.A00;
                    str = "imbe_producer_disclosure_learn_more_click";
                }
                A0G(this, Boolean.valueOf(r6.A09), r6.A04);
            }
            r4.A5H(r3, j, str);
            A0G(this, Boolean.valueOf(r6.A09), r6.A04);
        }
    }

    public final C06590Pq getSession() {
        return this.A0B;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A05.Ar3(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        Set emptySet;
        int A022 = AnonymousClass0Z0.A02(-1890387254);
        super.onCreate(bundle);
        this.A0B = AnonymousClass0J1.A06(this.mArguments);
        this.A0P = this.mArguments.getString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_STARTING_ID", "");
        this.A00 = this.mArguments.getInt("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_DASHBOARD_TYPE", 0);
        if (this.mArguments.containsKey("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ITEMS_FILTER")) {
            emptySet = (HashSet) this.mArguments.getSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ITEMS_FILTER");
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0Q = emptySet;
        this.A0D = this.mArguments.getString("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_ID");
        this.mArguments.getSerializable("ReelDashboardFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_SOURCE");
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r0 = this.A0B;
        this.A03 = new AnonymousClass1US(activity, r0);
        C112254sJ r4 = new C112254sJ(this);
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.ONE;
        r2.A0C = "friendships/blocked_reels/";
        r2.A06(C62452nj.class, false);
        r2.A0G = true;
        C17850qu A032 = r2.A03();
        A032.A00 = r4;
        schedule(A032);
        AnonymousClass0C1 r22 = this.A0B;
        this.A05 = C16330oQ.A00.A04(getContext(), new AnonymousClass37F(r22, this, getActivity(), true), r22);
        this.A0M = new AnonymousClass1UY(r22, new AnonymousClass1UZ(this), this);
        this.A0O = UUID.randomUUID().toString();
        this.A0L = new AnonymousClass6UX(getActivity(), this.mFragmentManager, this, AnonymousClass1L8.A00(this), this.A0B, new AnonymousClass5KI(this));
        this.A0K = new C29631Qq(this.A0B, new AnonymousClass5KP(this));
        this.A04 = AnonymousClass0QT.A00(this.A0B, this);
        registerLifecycleListener(this.A0L);
        AnonymousClass0Z0.A09(2124690749, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2009539416);
        this.A0K.A01();
        View inflate = layoutInflater.inflate(C0003R.layout.layout_reel_dashboard, viewGroup, false);
        AnonymousClass0Z0.A09(1680729826, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(451452209);
        super.onDestroy();
        C23300zv A002 = C23300zv.A00(this.A0B);
        A002.A03(C103884eI.class, this.A0X);
        A002.A03(C104054eZ.class, this.A0W);
        AnonymousClass0Z0.A09(1204104507, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(687076920);
        super.onDestroyView();
        for (Map.Entry entry : this.A0U.entrySet()) {
            ((AnonymousClass2Ay) entry.getKey()).BbQ((AnonymousClass34N) entry.getValue());
        }
        AnonymousClass2E0.A00(this.A0B).A01(this);
        this.A0U.clear();
        this.A0K.A02();
        C23300zv A002 = C23300zv.A00(this.A0B);
        A002.A03(C35241g2.class, this);
        A002.A03(C31071Wi.class, this.A0N);
        if (!AnonymousClass0PB.A06()) {
            AnonymousClass1X4.A04(getRootActivity().getWindow(), this.mView, true);
        }
        this.mImageViewPager.A0C();
        this.mListViewPager.A0C();
        Map map = this.A0Y;
        AnonymousClass5JW r0 = this.mListAdapter;
        HashMap hashMap = new HashMap();
        for (AnonymousClass5JX r02 : r0.A09.values()) {
            hashMap.put(r02.A0G, r02.A0U.onSaveInstanceState());
        }
        map.putAll(hashMap);
        AnonymousClass1AM childFragmentManager = getChildFragmentManager();
        List<AnonymousClass1HD> A023 = childFragmentManager.A0Q.A02();
        if (A023 != null) {
            for (AnonymousClass1HD r1 : A023) {
                if (r1 != null) {
                    AnonymousClass1H6 A0Q2 = childFragmentManager.A0Q();
                    A0Q2.A0D(r1);
                    A0Q2.A0A();
                }
            }
            childFragmentManager.A0U();
        }
        this.A01 = this.mListViewPager.A06;
        ReelDashboardFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(1309051660, A022);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0Z0.A03(189513239);
        int A033 = AnonymousClass0Z0.A03(63037455);
        A07(this);
        AnonymousClass0Z0.A0A(991935204, A033);
        AnonymousClass0Z0.A0A(-978355889, A032);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(2064633428);
        super.onPause();
        this.A02.A08(this);
        A02(this).A0T();
        this.A01 = this.mImageViewPager.getCurrentDataIndex();
        AnonymousClass0Z0.A09(-2145780949, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(616376431);
        super.onResume();
        this.A0R = false;
        this.A02.A07(this);
        if (!AnonymousClass0PB.A06()) {
            AnonymousClass1X4.A04(getRootActivity().getWindow(), this.mView, false);
        }
        C34071dx A023 = A02(this);
        if (A023.A0a()) {
            if (A023.A0D == AnonymousClass1OY.REEL_VIEWER_LIST) {
                A023.A0R();
            } else {
                this.mImageViewPager.post(new AnonymousClass5KN(this));
            }
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r4 = this.A0B;
        if (C16180oA.A00(r4).A00.getBoolean("story_imbe_viewershett_disclosure_view", false)) {
            C16180oA.A00(r4).A00.edit().putBoolean("story_imbe_viewershett_disclosure_view", false).apply();
            C78083b8.A01(activity, r4, "270931707454285");
        }
        AnonymousClass0Z0.A09(1457218999, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(-1655461092);
        super.onStart();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        AnonymousClass0Z0.A09(-238287450, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(-561065050);
        super.onStop();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(956678890, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0H = C06220Of.A09(getContext()) / 5;
        this.A0G = getResources().getDimensionPixelOffset(C0003R.dimen.reel_dashboard_image_spacing);
        this.mContainer = (TouchInterceptorFrameLayout) view.findViewById(C0003R.C0005id.container);
        view.findViewById(C0003R.C0005id.button_close).setOnClickListener(new C121885Kh(this));
        if (this.A00 == 0 && ((Boolean) AnonymousClass0L6.A02(this.A0B, AnonymousClass0L7.SAVE_ALL, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            View findViewById = view.findViewById(C0003R.C0005id.button_saveall);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new AnonymousClass5KG(this));
        }
        View findViewById2 = view.findViewById(C0003R.C0005id.button_settings);
        this.A0J = findViewById2;
        findViewById2.setOnClickListener(new AnonymousClass4LD(this));
        EmptyStateView emptyStateView = (EmptyStateView) view.findViewById(16908292);
        this.mEmptyView = emptyStateView;
        if (this.A00 == 0) {
            emptyStateView.A0K(new C121875Kg(this), AnonymousClass2Oq.ERROR);
        }
        ReboundViewPager reboundViewPager = (ReboundViewPager) view.findViewById(C0003R.C0005id.view_pager);
        this.mImageViewPager = reboundViewPager;
        reboundViewPager.setExtraBufferSize(4);
        AnonymousClass5KZ r1 = new AnonymousClass5KZ(this.A0B, this.A0H, C06220Of.A04(getResources().getDisplayMetrics()), this, this);
        this.mPagerAdapter = r1;
        this.mImageViewPager.setAdapter((Adapter) r1);
        ReboundViewPager reboundViewPager2 = this.mImageViewPager;
        reboundViewPager2.setOverridePageSize(this.A0H);
        reboundViewPager2.setPageSpacing((float) this.A0G);
        this.mImageViewPager.A0L(new AnonymousClass2YL(this));
        this.mImageViewPager.setScrollMode(C32481bK.WHEEL_OF_FORTUNE);
        this.mImageViewPager.setItemPositioner(new C44541wK(this.A0H, this.A0G, 0.7f));
        this.mListViewPager = (ReboundViewPager) view.findViewById(C0003R.C0005id.list_view_pager);
        AnonymousClass0C1 r4 = this.A0B;
        AnonymousClass5JW r3 = new AnonymousClass5JW(r4, this, this, this, AnonymousClass1BD.A00(r4), new AnonymousClass5JY(this.A0B), AnonymousClass1BA.A07(getContext(), C0003R.attr.reelDashboardShareButtonEnabled, true));
        this.mListAdapter = r3;
        this.A0N = new C52152Nq(getContext(), this.A0B, r3);
        AnonymousClass5JW r2 = this.mListAdapter;
        Map map = this.A0Y;
        r2.A0A.clear();
        r2.A0A.putAll(map);
        this.A0Y.clear();
        this.mListViewPager.setAdapter((Adapter) this.mListAdapter);
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(AnonymousClass1EA.A01(70.0d, 8.0d));
        this.A02 = A002;
        this.mListViewPager.A0L(new C44591wP(this));
        TriangleShape triangleShape = (TriangleShape) view.findViewById(C0003R.C0005id.notch);
        triangleShape.setNotchCenterXOn(this.mImageViewPager);
        triangleShape.invalidate();
        int i = this.A00;
        if (i == 1) {
            C250016x A012 = C250016x.A01(this.A0B);
            this.A06 = (Reel) A012.A02.get(C250216z.REPLAY);
            A03();
        } else if (i == 0) {
            Reel A0G2 = ReelStore.A02(this.A0B).A0G(this.A0D);
            this.A06 = A0G2;
            if (A0G2 == null) {
                A05(this);
            } else {
                A03();
            }
        }
    }
}
