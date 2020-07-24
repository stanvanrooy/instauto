package com.instagram.newsfeed.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2NQ;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2P5;
import p000X.AnonymousClass2PE;
import p000X.AnonymousClass2PH;
import p000X.AnonymousClass6TX;
import p000X.AnonymousClass6TZ;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C152086en;
import p000X.C152116eq;
import p000X.C152126er;
import p000X.C152136es;
import p000X.C152146et;
import p000X.C152166ew;
import p000X.C152186ey;
import p000X.C152196ez;
import p000X.C152206f0;
import p000X.C152216f1;
import p000X.C152226f2;
import p000X.C152236f3;
import p000X.C23300zv;
import p000X.C239512q;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C28341Li;
import p000X.C31241Xc;
import p000X.C32711bj;
import p000X.C52492Pa;
import p000X.C58252fd;

public class BundledActivityFeedFragment extends C27341Hl implements C27371Ho, AnonymousClass1HM, AnonymousClass2NQ {
    public AnonymousClass0QT A00;
    public C152116eq A01;
    public C152146et A02;
    public AnonymousClass6TX A03;
    public C152196ez A04;
    public AnonymousClass0C1 A05;
    public boolean A06;
    public C28051Kf A07;
    public AnonymousClass2PE A08;
    public C152126er A09;
    public AnonymousClass2P5 A0A;
    public final C11200ea A0B = new C152166ew(this);
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "instagram_bundled_activity_feed";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(BundledActivityFeedFragment bundledActivityFeedFragment) {
        ArrayList arrayList = new ArrayList();
        C239512q A0I = ImmutableList.A09(bundledActivityFeedFragment.A04.A00).iterator();
        while (A0I.hasNext()) {
            for (C58252fd r0 : ((C152086en) A0I.next()).A01) {
                arrayList.add(r0.A06);
            }
        }
        C152216f1 r1 = new C152216f1(bundledActivityFeedFragment.A00.A02("instagram_bundled_activity_feed_notifications_load"));
        r1.A09("notification_ids", arrayList);
        r1.A01();
    }

    public static void A01(BundledActivityFeedFragment bundledActivityFeedFragment) {
        AnonymousClass2Oq r0;
        C152126er r3 = bundledActivityFeedFragment.A09;
        AnonymousClass2Oq r2 = r3.A00;
        C152146et r1 = r3.A02;
        if (r1.AgL()) {
            r0 = AnonymousClass2Oq.LOADING;
        } else if (r1.AfR()) {
            r0 = AnonymousClass2Oq.ERROR;
        } else {
            r0 = AnonymousClass2Oq.EMPTY;
        }
        r3.A00 = r0;
        if (r0 != r2) {
            r3.A04.A01.A0J();
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        if (this.A03 == AnonymousClass6TX.A01) {
            r3.BlI(C0003R.string.bundled_activity_feed_actionbar_shopping_title);
        } else {
            r3.BlI(C0003R.string.bundled_activity_feed_actionbar_default_title);
        }
        r3.Bo6(true);
    }

    public final AnonymousClass2OA AAQ(AnonymousClass2OA r1) {
        r1.A0K(this);
        return r1;
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-869836863);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A05 = A062;
        this.A00 = AnonymousClass0QT.A00(A062, this);
        this.A04 = (C152196ez) A062.AVA(C152196ez.class, new C152206f0());
        Serializable serializable = bundle2.getSerializable("bundled_notification_type");
        AnonymousClass0a4.A06(serializable);
        this.A03 = (AnonymousClass6TX) serializable;
        String string = bundle2.getString("shopping_bundled_activity_feed_entry_point");
        AnonymousClass0C1 r4 = this.A05;
        this.A02 = new C152146et(r4, new C28341Li(getContext(), r4, AnonymousClass1L8.A00(this)), this, this.A03, string);
        this.A09 = new C152126er(requireActivity(), this.A03, this.A02, this);
        C28051Kf A002 = C28021Kc.A00();
        this.A07 = A002;
        this.A0A = new AnonymousClass2P5(this.A05, A002, getModuleName());
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0C1 r6 = this.A05;
        C152136es r2 = new C152136es(this, this, requireActivity, r6, this.mFragmentManager, this, this, new AnonymousClass2PH(this, r6, this, AnonymousClass0QT.A00(r6, this)));
        this.A08 = r2;
        r2.A01 = this;
        this.A01 = new C152116eq(requireContext(), this.A05, this, (HashSet) bundle2.getSerializable("highlighted_story_ids"), this.A09, this.A03, this.A08);
        new C152226f2(this.A00.A02("instagram_bundled_activity_feed_impression")).A01();
        if (!ImmutableList.A09(this.A04.A00).isEmpty()) {
            this.A06 = true;
            A00(this);
            C152116eq r3 = this.A01;
            ImmutableList A092 = ImmutableList.A09(this.A04.A00);
            r3.A0A.clear();
            r3.A0A.addAll(A092);
            this.A01.A0J();
            if (this.A03 == AnonymousClass6TX.A01) {
                C23300zv.A00(this.A05).BXT(new AnonymousClass6TZ(0));
            }
        } else {
            this.A02.A00();
        }
        C23300zv.A00(this.A05).A02(C52492Pa.class, this.A0B);
        AnonymousClass0Z0.A09(457172497, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-768381458);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new C152186ey(this));
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        RecyclerView recyclerView = (RecyclerView) this.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0Z0.A09(-547364322, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1397769470);
        C23300zv.A00(this.A05).A03(C52492Pa.class, this.A0B);
        if (!this.A06) {
            new C152236f3(this.A00.A02("instagram_bundled_activity_feed_abandoned")).A01();
        }
        super.onDestroy();
        AnonymousClass0Z0.A09(-346964267, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1136831575);
        this.A08.A0D.clear();
        super.onPause();
        AnonymousClass0Z0.A09(-1455358572, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-971072613);
        super.onResume();
        AnonymousClass0Z0.A09(-319947974, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView.setAdapter(this.A01);
        this.A07.A04(C32711bj.A00(this), this.mRecyclerView);
        A01(this);
    }
}
