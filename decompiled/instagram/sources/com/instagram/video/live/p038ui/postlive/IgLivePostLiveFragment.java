package com.instagram.video.live.p038ui.postlive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingGridLayoutManager;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2MG;
import p000X.C06590Pq;
import p000X.C2102895a;
import p000X.C2102995b;
import p000X.C2103095d;
import p000X.C2103195e;
import p000X.C27341Hl;

/* renamed from: com.instagram.video.live.ui.postlive.IgLivePostLiveFragment */
public class IgLivePostLiveFragment extends C27341Hl {
    public C2102995b A00;
    public boolean A01;
    public AnonymousClass0C1 A02;
    public GridLayoutManager mLayoutManager;
    public C2103195e mListener;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "live_post_live";
    }

    public static void A00(IgLivePostLiveFragment igLivePostLiveFragment) {
        C2102995b r0 = igLivePostLiveFragment.A00;
        if (r0 != null) {
            AnonymousClass2MG ATh = r0.ATh();
            igLivePostLiveFragment.mRecyclerView.setAdapter(ATh);
            igLivePostLiveFragment.mLayoutManager.A23(new C2103095d(igLivePostLiveFragment, ATh));
            igLivePostLiveFragment.mRecyclerView.A0r(new C2102895a(igLivePostLiveFragment, ATh));
        }
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1499148440);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass0Z0.A09(736073408, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-984910835);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_iglive_post_live, viewGroup, false);
        this.mRecyclerView = (RecyclerView) inflate.findViewById(C0003R.C0005id.recycler_view);
        this.mLayoutManager = new FastScrollingGridLayoutManager(getContext(), 2);
        if (this.A00 != null && this.mRecyclerView.A0J == null) {
            A00(this);
        }
        this.mRecyclerView.setLayoutManager(this.mLayoutManager);
        AnonymousClass0Z0.A09(-235886545, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(332182483);
        super.onDestroy();
        C2103195e r0 = this.mListener;
        if (r0 != null) {
            r0.B5N();
        }
        AnonymousClass0Z0.A09(166812701, A022);
    }
}
