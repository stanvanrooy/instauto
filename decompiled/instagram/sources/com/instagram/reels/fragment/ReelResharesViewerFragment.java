package com.instagram.reels.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.C06590Pq;
import p000X.C124545Vg;
import p000X.C124565Vi;
import p000X.C124625Vo;
import p000X.C124635Vp;
import p000X.C124645Vr;
import p000X.C124655Vs;
import p000X.C137095t3;
import p000X.C137135t7;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C59012gt;

public class ReelResharesViewerFragment extends AnonymousClass2NN implements AbsListView.OnScrollListener, AnonymousClass1HM, AnonymousClass1W5, C137135t7, C124625Vo {
    public C124645Vr A00;
    public AnonymousClass1UY A01;
    public AnonymousClass0C1 A02;
    public C137095t3 A03;
    public String A04;
    public String A05;
    public final AnonymousClass1I1 A06 = new AnonymousClass1I1();
    public EmptyStateView mEmptyStateView;
    public C124565Vi mHideAnimationCoordinator;

    public final void B4l(Reel reel, C59012gt r2) {
    }

    public final void BHS(Reel reel) {
    }

    public final void BHt(Reel reel) {
    }

    public final String getModuleName() {
        return "reel_view_reshare_reels";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00() {
        C137095t3 r1 = this.A03;
        r1.A01 = false;
        AnonymousClass0C1 r0 = this.A02;
        String str = this.A05;
        String str2 = r1.A00;
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.A0N;
        r2.A0E("media/%s/feed_to_stories_shares/", str);
        r2.A06(C124655Vs.class, false);
        if (!TextUtils.isEmpty(str2)) {
            r2.A09("max_id", str2);
        }
        C17850qu A032 = r2.A03();
        A032.A00 = new C124635Vp(this);
        schedule(A032);
    }

    public static void A01(ReelResharesViewerFragment reelResharesViewerFragment) {
        EmptyStateView emptyStateView;
        AnonymousClass2Oq r0;
        if (reelResharesViewerFragment.mEmptyStateView != null) {
            if (reelResharesViewerFragment.A00.isEmpty()) {
                emptyStateView = reelResharesViewerFragment.mEmptyStateView;
                r0 = AnonymousClass2Oq.EMPTY;
            } else {
                emptyStateView = reelResharesViewerFragment.mEmptyStateView;
                r0 = AnonymousClass2Oq.GONE;
            }
            emptyStateView.A0M(r0);
            reelResharesViewerFragment.mEmptyStateView.A0F();
        }
    }

    public final boolean Abq() {
        return !this.A00.isEmpty();
    }

    public final void AsA(Reel reel, List list, C124545Vg r16, int i, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList();
        Reel reel2 = reel;
        arrayList.add(reel);
        if (this.A01 == null) {
            this.A01 = new AnonymousClass1UY(this.A02, new AnonymousClass1UZ(this), this);
        }
        AnonymousClass1UY r5 = this.A01;
        r5.A0A = this.A04;
        r5.A04 = new C124565Vi(getActivity(), getListView(), this.A00, this);
        r5.A0B = this.A02.A04();
        r5.A05(r16, reel2, arrayList, arrayList, AnonymousClass1OY.RESHARED_REELS_VIEWER, i3, (ReelChainingConfig) null);
    }

    public final void Aix() {
        A00();
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.setTitle(getContext().getString(C0003R.string.reel_reshares_viewer_title));
        r3.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-693643924);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0J1.A06(this.mArguments);
        this.A05 = this.mArguments.getString("ReelResharesViewerFragment.MEDIA_ID");
        this.A04 = UUID.randomUUID().toString();
        C137095t3 r2 = new C137095t3(this.A02, this, this);
        this.A03 = r2;
        C124645Vr r1 = new C124645Vr(getContext(), r2, this);
        this.A00 = r1;
        setListAdapter(r1);
        A00();
        AnonymousClass0Z0.A09(1761469970, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(938315448);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_feed, viewGroup, false);
        AnonymousClass0Z0.A09(1368450246, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1650494628);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1571143073, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1524335398);
        super.onPause();
        AnonymousClass0Z0.A09(63849862, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1617683056);
        super.onResume();
        this.mEmptyStateView.A0J(C0003R.string.reel_reshares_empty_state_title, AnonymousClass2Oq.EMPTY);
        AnonymousClass0Z0.A09(-807043488, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-88796030);
        this.A06.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(794727068, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(288295590);
        this.A06.onScrollStateChanged(absListView, i);
        AnonymousClass0Z0.A0A(2008907920, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A06.A0B(this.A03);
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        getListView().setOnScrollListener(this);
        A01(this);
    }
}
