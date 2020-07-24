package com.instagram.profile.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HO;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1YG;
import p000X.AnonymousClass2NV;
import p000X.AnonymousClass382;
import p000X.AnonymousClass383;
import p000X.AnonymousClass392;
import p000X.AnonymousClass3BU;
import p000X.AnonymousClass3BV;
import p000X.AnonymousClass3BW;
import p000X.AnonymousClass3BX;
import p000X.AnonymousClass3BY;
import p000X.AnonymousClass3BZ;
import p000X.AnonymousClass3D1;
import p000X.C06590Pq;
import p000X.C108834mV;
import p000X.C13300iJ;
import p000X.C157526o8;
import p000X.C157646oK;
import p000X.C255119b;
import p000X.C256419q;
import p000X.C27301Hh;
import p000X.C27341Hl;
import p000X.C27361Hn;
import p000X.C27371Ho;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C28121Km;
import p000X.C29081On;
import p000X.C29621Qp;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C36191he;
import p000X.C61622m6;
import p000X.C63522pc;
import p000X.C63532pd;
import p000X.C63562pg;
import p000X.C709938n;
import p000X.C710138p;
import p000X.C710838w;
import p000X.C710938x;
import p000X.C711138z;
import p000X.C71513Ba;
import p000X.C71523Bb;
import p000X.C71573Bg;
import p000X.C71623Bm;
import p000X.C71633Bn;
import p000X.C71643Bo;
import p000X.C71653Bp;
import p000X.C71663Bq;

public class ProfileMediaTabFragment extends C27341Hl implements C27361Hn, AnonymousClass3BU, AnonymousClass3BV, AnonymousClass1HO {
    public AnonymousClass1LO A00;
    public C71523Bb A01;
    public AnonymousClass382 A02;
    public AnonymousClass392 A03;
    public AnonymousClass0C1 A04;
    public C29081On A05;
    public boolean A06;
    public boolean A07;
    public C28051Kf A08;
    public C61622m6 A09;
    public C71663Bq A0A;
    public UserDetailFragment A0B;
    public String A0C;
    public boolean A0D;
    public final AnonymousClass1I1 A0E = new AnonymousClass1I1();
    public final AnonymousClass3BZ A0F = new AnonymousClass3BZ(this);
    public final AnonymousClass3BX A0G = new AnonymousClass3BW(this);
    public final AnonymousClass3BY A0H = new AnonymousClass3BY(this);
    public C256419q mDropFrameWatcher;
    public RecyclerView mRecyclerView;
    public C255119b mScrollingViewProxy;

    public final AnonymousClass1HD A5s() {
        return this;
    }

    public final C27301Hh AMt() {
        return null;
    }

    public final boolean AhS() {
        return false;
    }

    public final void BGg(C709938n r1) {
    }

    public final void BQk() {
    }

    public final void BQq() {
    }

    public static C71663Bq A00(ProfileMediaTabFragment profileMediaTabFragment) {
        if (profileMediaTabFragment.A0A == null) {
            Context context = profileMediaTabFragment.getContext();
            AnonymousClass392 r1 = profileMediaTabFragment.A03;
            C27371Ho r9 = r1.A05;
            AnonymousClass0C1 r5 = profileMediaTabFragment.A04;
            C13300iJ A072 = r1.A08.A02.A07();
            C28051Kf r4 = profileMediaTabFragment.A08;
            AnonymousClass2NV r12 = r1.A0D;
            Set set = r1.A0H;
            AnonymousClass1LO r3 = profileMediaTabFragment.A00;
            boolean z = profileMediaTabFragment.A06;
            boolean z2 = profileMediaTabFragment.A07;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C71643Bo(profileMediaTabFragment, r9, r5, A072, r12, set));
            if (z) {
                arrayList.add(new C71653Bp(r3, context));
            }
            if (z2) {
                arrayList.add(new C108834mV(r5, profileMediaTabFragment));
            }
            profileMediaTabFragment.A0A = new C71663Bq(r4, new C28121Km(), arrayList);
        }
        return profileMediaTabFragment.A0A;
    }

    public final void BDs(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            this.A09.onScrolled(recyclerView, 0, i);
        }
    }

    public final void BIq(int i) {
        this.mRecyclerView.post(new C71633Bn(this, i));
    }

    public final void BLL(boolean z) {
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.post(new C71623Bm(recyclerView, z));
    }

    public final void BQl() {
        C710838w r2 = this.A03.A0C.A0G;
        C71523Bb r1 = this.A01;
        if (r2.A02) {
            r2.A01 = new WeakReference(r1);
        } else {
            r2.A00 = r1;
        }
        this.A03.A07.A00 = getScrollingViewProxy();
    }

    public final String getModuleName() {
        return this.A03.A04.getModuleName();
    }

    public final C255119b getScrollingViewProxy() {
        if (this.mScrollingViewProxy == null) {
            this.mScrollingViewProxy = AnonymousClass1YG.A00(this.mRecyclerView);
        }
        return this.mScrollingViewProxy;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass1LO r5;
        int A022 = AnonymousClass0Z0.A02(-556154435);
        boolean z = false;
        if (this.A02.A01 == Constants.ONE) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "ProfileMediaTabFragment no longer supports FEED View.");
        AnonymousClass392 AJt = ((C63562pg) this.mParentFragment).AJt();
        this.A03 = AJt;
        UserDetailFragment userDetailFragment = AJt.A0B;
        this.A0B = userDetailFragment;
        this.A05 = new C71513Ba(this, userDetailFragment);
        Context context = getContext();
        AnonymousClass0C1 r3 = this.A04;
        String ASx = ASx();
        LruCache lruCache = (LruCache) AJt.A0F.get(ASx);
        if (lruCache == null) {
            lruCache = new LruCache(100);
            AJt.A0F.put(ASx, lruCache);
        }
        AnonymousClass1LO r10 = new AnonymousClass1LO(this, true, context, r3, lruCache);
        this.A00 = r10;
        Context context2 = getContext();
        AnonymousClass392 r13 = this.A03;
        C63532pd r14 = r13.A06;
        UserDetailFragment userDetailFragment2 = r13.A0A;
        AnonymousClass0C1 r9 = this.A04;
        AnonymousClass2NV r7 = r13.A0D;
        AnonymousClass0RN r6 = r13.A04;
        C29081On r52 = this.A05;
        C710938x r4 = r13.A08;
        AnonymousClass382 r32 = this.A02;
        C63522pc r2 = r13.A0E;
        C710138p r1 = r13.A0C.A0J;
        AnonymousClass3BX r0 = this.A0G;
        C710138p r27 = r1;
        C63522pc r26 = r2;
        AnonymousClass382 r25 = r32;
        C710938x r24 = r4;
        C29081On r23 = r52;
        AnonymousClass0RN r22 = r6;
        AnonymousClass2NV r21 = r7;
        AnonymousClass0C1 r20 = r9;
        AnonymousClass1LO r19 = r10;
        UserDetailFragment userDetailFragment3 = userDetailFragment2;
        C63532pd r17 = r14;
        C71523Bb r15 = new C71523Bb(context2, r17, userDetailFragment3, r19, r20, r21, r22, r23, r24, r25, r26, r27, r0, this.A0D, r13.A09, this);
        this.A01 = r15;
        C71573Bg r12 = C71573Bg.A00;
        if (this.A06) {
            r5 = null;
        } else {
            r5 = this.A00;
        }
        AnonymousClass0C1 r33 = this.A04;
        AnonymousClass392 r02 = this.A03;
        Set set = r02.A0G;
        this.A0E.A0E(new C36191he(this, r15, r12, r5, r33, set, r02.A0D.A00, !this.A07));
        registerLifecycleListener(this.A00);
        C256419q r34 = new C256419q(getActivity(), this.A04, this, 23592965);
        this.mDropFrameWatcher = r34;
        r34.A02 = Constants.ONE;
        registerLifecycleListener(r34);
        this.A0E.A0E(this.mDropFrameWatcher);
        View inflate = layoutInflater.inflate(C0003R.layout.profile_media_tab_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1884346520, A022);
        return inflate;
    }

    public final String ASx() {
        return this.A0C;
    }

    public final void afterOnDestroyView() {
        super.afterOnDestroyView();
        unregisterLifecycleListener(this.mDropFrameWatcher);
        unregisterLifecycleListener(this.A00);
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(134852654);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A04 = A062;
        AnonymousClass0L7 r2 = AnonymousClass0L7.PROFILE_VIEWPOINT_PPR;
        this.A06 = ((Boolean) AnonymousClass0L6.A02(A062, r2, "enable_viewpoint_ppr", false, (AnonymousClass04H) null)).booleanValue();
        this.A07 = ((Boolean) AnonymousClass0L6.A02(this.A04, r2, "enable_prefetch_scheduler_ppr", false, (AnonymousClass04H) null)).booleanValue();
        this.A0D = ((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.PROFILE_GRID_LAYOUT_MANAGER, "enable_grid_layout_manager", false, (AnonymousClass04H) null)).booleanValue();
        this.A02 = (AnonymousClass382) this.mArguments.getSerializable("ProfileMediaTabFragment.profile_tab_mode");
        this.A0C = this.mArguments.getString("ProfileMediaTabFragment.profile_tab_identifier");
        this.A08 = C28021Kc.A00();
        AnonymousClass0Z0.A09(-1846210764, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1237624311);
        super.onDestroyView();
        this.mRecyclerView.A0V();
        this.A03.A0C.A0J.A04.remove(this);
        C710938x r2 = this.A03.A08;
        AnonymousClass383 r0 = this.A02.A00;
        C710938x.A00(r2, r0).A05.remove(this.A0F);
        this.A0E.A0A();
        ProfileMediaTabFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-1192000036, A022);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [androidx.recyclerview.widget.GridLayoutManager, com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void onViewCreated(View view, Bundle bundle) {
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager;
        C29621Qp r4;
        this.mRecyclerView = (RecyclerView) view.findViewById(16908298);
        if (this.A0D) {
            ? fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(getContext(), this.A03.A0D.A00);
            fastScrollingGridLayoutManager.A23(new C157526o8(this));
            fastScrollingLinearLayoutManager = fastScrollingGridLayoutManager;
        } else {
            FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager2 = new FastScrollingLinearLayoutManager(getContext(), 1);
            this.mRecyclerView.setItemAnimator((C31341Xr) null);
            fastScrollingLinearLayoutManager = fastScrollingLinearLayoutManager2;
        }
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.A03.A07.A00 = getScrollingViewProxy();
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.PROFILE_SCROLLER_OVERFETCHING, "is_fix_enabled", false, (AnonymousClass04H) null)).booleanValue();
        AnonymousClass3D1 r3 = new AnonymousClass3D1(this);
        if (this.A0D) {
            r4 = C29621Qp.PROFILE_GRID_CELL;
        } else {
            r4 = C29621Qp.PROFILE_GRID;
        }
        C61622m6 r2 = new C61622m6(r3, r4, fastScrollingLinearLayoutManager, booleanValue, true);
        this.A09 = r2;
        this.A0E.A0D(r2);
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.setRecycledViewPool(this.A03.A02);
        recyclerView.A0w(this.A0E);
        this.mRecyclerView.setAdapter(this.A01);
        this.A03.A0C.A0J.A00(this);
        C710938x r1 = this.A03.A08;
        AnonymousClass383 r0 = this.A02.A00;
        AnonymousClass3BZ r42 = this.A0F;
        C711138z A002 = C710938x.A00(r1, r0);
        if (!A002.A05.contains(r42)) {
            A002.A05.add(r42);
        }
        ProfileMediaTabFragment profileMediaTabFragment = r42.A00;
        RecyclerView recyclerView2 = profileMediaTabFragment.mRecyclerView;
        if (recyclerView2 == null || !recyclerView2.A13()) {
            profileMediaTabFragment.A01.A0J();
        } else {
            recyclerView2.post(new C157646oK(r42, (AnonymousClass1NJ) null));
        }
        this.A08.A04(C32711bj.A00(this), this.mRecyclerView);
        super.onViewCreated(view, bundle);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }
}
