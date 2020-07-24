package com.instagram.reels.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.Set;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1D1;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1OR;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass1W8;
import p000X.AnonymousClass1WN;
import p000X.AnonymousClass1WO;
import p000X.AnonymousClass1WS;
import p000X.AnonymousClass6ZV;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C152416fL;
import p000X.C152426fM;
import p000X.C152456fQ;
import p000X.C152476fS;
import p000X.C152486fT;
import p000X.C152496fU;
import p000X.C152526fX;
import p000X.C152556fa;
import p000X.C152566fb;
import p000X.C152576fc;
import p000X.C152586fd;
import p000X.C152596fe;
import p000X.C152636fj;
import p000X.C152646fk;
import p000X.C152656fl;
import p000X.C152706fq;
import p000X.C17020pY;
import p000X.C23300zv;
import p000X.C256419q;
import p000X.C26321Cu;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C27421Hu;
import p000X.C27541Ig;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C28961Ob;
import p000X.C28971Oc;
import p000X.C31061Wh;
import p000X.C32711bj;
import p000X.C32961c8;
import p000X.C33921di;
import p000X.C34071dx;
import p000X.C35241g2;

public class ReelHomeFragment extends C27341Hl implements AnonymousClass1HM {
    public AnonymousClass1WO A00;
    public C28971Oc A01;
    public AnonymousClass6ZV A02;
    public AnonymousClass1WN A03;
    public AnonymousClass0C1 A04;
    public C28051Kf A05;
    public C152476fS A06;
    public C27541Ig A07;
    public C256419q A08;
    public final ReelViewerConfig A09 = ReelViewerConfig.A00();
    public final AnonymousClass1W5 A0A = new C152486fT(this);
    public final C11200ea A0B = new C152416fL(this);
    public final C11200ea A0C = new C152456fQ(this);
    public final C11200ea A0D = new C152426fM(this);
    public final C27421Hu A0E = new C152646fk(this);
    public final C152656fl A0F = new C152656fl(this);
    public AnonymousClass1WS mClosePill;

    public final String getModuleName() {
        return "reel_home";
    }

    public final boolean isToolbarEnabled() {
        return true;
    }

    public static AnonymousClass1D1 A01(ReelHomeFragment reelHomeFragment) {
        AnonymousClass1HD r1 = reelHomeFragment.mParentFragment;
        if (r1 instanceof AnonymousClass1D1) {
            return (AnonymousClass1D1) r1;
        }
        return (AnonymousClass1D1) reelHomeFragment.getRootActivity();
    }

    public final void configureActionBar(AnonymousClass1EX r8) {
        C27541Ig r0 = this.A07;
        AnonymousClass0a4.A06(r0);
        r0.A05(r8, new C152576fc(this), new C152566fb(this), new C152586fd(this), new C152556fa(this), new C152596fe(this));
        ViewGroup AYU = r8.AYU();
        AYU.setContentDescription(AYU.getResources().getString(C0003R.string.return_to_feed));
    }

    public static C152706fq A00(ReelHomeFragment reelHomeFragment) {
        if (reelHomeFragment.getActivity() == null || reelHomeFragment.getRootActivity() == null) {
            return null;
        }
        AnonymousClass1HD r1 = reelHomeFragment.mParentFragment;
        if (r1 instanceof C26321Cu) {
            return ((C26321Cu) r1).ATU();
        }
        return ((C26321Cu) reelHomeFragment.getRootActivity()).ATU();
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        Reel A0G;
        int A022 = AnonymousClass0Z0.A02(-212415847);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A04 = A062;
        new C152636fj(AnonymousClass00B.A01).A0F(getContext(), this, C26441Dh.A00(A062));
        this.A05 = C28021Kc.A00();
        C28961Ob r2 = new C28961Ob();
        r2.A01 = this.A04;
        r2.A00 = this;
        r2.A03 = bundle2.getString("ReelHomeFragment.ARGS_REEL_TRAY_LOGGER_TRAY_SESSION_ID");
        this.A01 = r2.A00();
        C256419q r4 = new C256419q(requireActivity(), this.A04, this, 23622362);
        this.A08 = r4;
        registerLifecycleListener(r4);
        Context context = getContext();
        AnonymousClass0C1 r6 = this.A04;
        C28971Oc r9 = this.A01;
        C152656fl r10 = this.A0F;
        AnonymousClass1W8 r11 = new AnonymousClass1W8(this.A05, r9, AnonymousClass1OR.A00(r6));
        Bundle bundle3 = this.mArguments;
        AnonymousClass0a4.A06(bundle3);
        AnonymousClass6ZV r42 = new AnonymousClass6ZV(context, r6, this, this, r9, r10, r11, bundle3.getInt("ReelHomeFragment.ARGS_SCROLL_OFFSET"), this.A08);
        this.A02 = r42;
        Bundle bundle4 = this.mArguments;
        AnonymousClass0a4.A06(bundle4);
        String string = bundle4.getString("ReelHomeFragment.ARGS_LAST_SEEN_REEL_ID");
        if (string == null) {
            A0G = null;
        } else {
            A0G = C17020pY.A00().A0Q(this.A04).A0G(string);
        }
        r42.A00 = A0G;
        this.A07 = new C27541Ig(this.A04, getActivity(), this.A0E);
        Activity rootActivity = getRootActivity();
        AnonymousClass0C1 r22 = this.A04;
        AnonymousClass6ZV r1 = this.A02;
        this.A00 = new AnonymousClass1WO(rootActivity, r22, r1, r1);
        AnonymousClass1WN A0I = C17020pY.A00().A0I(this, this.A04, A01(this));
        this.A03 = A0I;
        AnonymousClass1OY r3 = AnonymousClass1OY.STORIES_HOME;
        ReelViewerConfig reelViewerConfig = this.A09;
        AnonymousClass6ZV r5 = this.A02;
        this.A06 = new C152476fS(this, r3, reelViewerConfig, r5, A0I, r5, this.A04);
        registerLifecycleListener(this.A07);
        AnonymousClass0Z0.A09(-71323510, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-753064979);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_reel_home, viewGroup, false);
        AnonymousClass0Z0.A09(737652293, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1850692383);
        super.onDestroy();
        C27541Ig r0 = this.A07;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
            this.A07 = null;
        }
        unregisterLifecycleListener(this.A08);
        AnonymousClass0Z0.A09(-292470203, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1849517579);
        super.onDestroyView();
        this.A02.ABs();
        AnonymousClass1WO r0 = this.A00;
        Runnable runnable = r0.A00;
        if (runnable != null) {
            AnonymousClass0ZA.A08(r0.A02, runnable);
        }
        AnonymousClass1WS r2 = this.mClosePill;
        View view = r2.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
            r2.A01 = null;
        }
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A03(C32961c8.class, this.A0C);
        A002.A03(C35241g2.class, this.A0D);
        A002.A03(C31061Wh.class, this.A0B);
        this.mClosePill = null;
        AnonymousClass0Z0.A09(-858003528, A022);
    }

    public final void onPause() {
        C34071dx r2;
        int A022 = AnonymousClass0Z0.A02(314433232);
        super.onPause();
        C152476fS r3 = this.A06;
        if (r3 != null) {
            if (r3.A01.getActivity() != null) {
                r2 = C17020pY.A00().A0T(r3.A01.getActivity());
            } else {
                r2 = null;
            }
            if (r2 != null) {
                r2.A0T();
                if (r2.A0E == r3.A00) {
                    r2.A0E = null;
                    r2.A0F = null;
                }
            }
        }
        AnonymousClass0Z0.A09(1530021208, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r4.A0D == p000X.AnonymousClass1OY.FEED_ITEM_HEADER) goto L_0x0043;
     */
    public final void onResume() {
        C34071dx r4;
        boolean z;
        int A022 = AnonymousClass0Z0.A02(-1221104459);
        super.onResume();
        C27541Ig r1 = this.A07;
        if (r1 != null) {
            r1.A00 = C33921di.A00(r1.A03).A02;
        }
        C152476fS r6 = this.A06;
        if (r6 != null) {
            if (r6.A01.getActivity() != null) {
                r4 = C17020pY.A00().A0V(r6.A01.getActivity(), r6.A06);
            } else {
                r4 = null;
            }
            if (r4 != null && r4.A0a()) {
                z = true;
            }
            z = false;
            if (z) {
                Set set = r4.A0N;
                View AWz = r6.A05.AWz();
                if (AWz != null) {
                    if (AWz.isLaidOut()) {
                        C152476fS.A00(r6, r6.A03, r4, set);
                    } else {
                        AWz.getViewTreeObserver().addOnGlobalLayoutListener(new C152526fX(r6, AWz, r4, set));
                    }
                }
            }
        }
        AnonymousClass0Z0.A09(-99121629, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02.ABG(view);
        ((ViewGroup) view).addView(this.A02.AWz(), 0);
        Context context = view.getContext();
        AnonymousClass1WS r2 = new AnonymousClass1WS(context, C0003R.string.close_stories_home, new C152496fU(this), false);
        this.mClosePill = r2;
        r2.A03((FrameLayout) view);
        AnonymousClass1WS r22 = this.mClosePill;
        AnonymousClass1E1.A0f(r22.A01, context.getString(C0003R.string.stories_tray_see_all_button_transition));
        AnonymousClass1WS r3 = this.mClosePill;
        View view2 = r3.A01;
        if (view2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.gravity = 81;
            r3.A01.setLayoutParams(layoutParams);
        }
        this.mClosePill.A01();
        C28051Kf r23 = this.A05;
        C32711bj A002 = C32711bj.A00(this);
        View AWz = this.A02.AWz();
        if (AWz != null) {
            view = AWz;
        }
        r23.A04(A002, view);
        C23300zv A003 = C23300zv.A00(this.A04);
        A003.A02(C32961c8.class, this.A0C);
        A003.A02(C35241g2.class, this.A0D);
        A003.A02(C31061Wh.class, this.A0B);
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1908379517);
        super.onViewStateRestored(bundle);
        this.A02.Bds(bundle);
        AnonymousClass0Z0.A09(-685081979, A022);
    }
}
