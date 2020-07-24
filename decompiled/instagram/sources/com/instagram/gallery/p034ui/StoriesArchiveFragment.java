package com.instagram.gallery.p034ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass2MW;
import p000X.AnonymousClass39L;
import p000X.AnonymousClass3AD;
import p000X.AnonymousClass81L;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C124435Uu;
import p000X.C124475Uy;
import p000X.C159486rK;
import p000X.C164446zq;
import p000X.C17020pY;
import p000X.C175327eH;
import p000X.C17710qg;
import p000X.C181127oJ;
import p000X.C181357om;
import p000X.C181367on;
import p000X.C181437ou;
import p000X.C181517p3;
import p000X.C181547p6;
import p000X.C181567p8;
import p000X.C181647pG;
import p000X.C181757pR;
import p000X.C197238cH;
import p000X.C197348cS;
import p000X.C27341Hl;
import p000X.C28341Li;
import p000X.C28591Mi;
import p000X.C28691Ms;
import p000X.C31341Xr;
import p000X.C43791v5;
import p000X.C52382Oo;
import p000X.C61472lr;

/* renamed from: com.instagram.gallery.ui.StoriesArchiveFragment */
public class StoriesArchiveFragment extends C27341Hl implements C28591Mi, AnonymousClass1HK, C61472lr, C52382Oo, C181127oJ, C197348cS {
    public int A00;
    public C28341Li A01;
    public GalleryHomeTabbedFragment A02;
    public C181357om A03;
    public C181567p8 A04;
    public AnonymousClass0C1 A05;
    public int A06;
    public int A07;
    public int A08;
    public C164446zq A09;
    public C175327eH A0A;
    public final Map A0B = new LinkedHashMap();
    public View mEmptyMessage;
    public C197238cH mFastScrollController;
    public C181647pG mGridInsetAdjustmentHelper;
    public GridLayoutManager mLayoutManager;
    public AnonymousClass3AD mLoadingDrawable;
    public ImageView mLoadingSpinner;
    public RefreshableRecyclerViewLayout mRecyclerView;

    public final void B4I(C43791v5 r1) {
    }

    public final void B4J(C17710qg r1) {
    }

    public final void B4K() {
    }

    public final void B4L() {
    }

    public final void B8a(String str) {
    }

    public final void B8b(String str) {
    }

    public final void BAa(String str, String str2) {
    }

    public final void BAi(String str, String str2) {
    }

    public final void BB6(String str, String str2) {
    }

    public final void BBC(String str, String str2) {
    }

    public final void BDV() {
    }

    public final void BDh() {
    }

    public final void Bel() {
    }

    public final String getModuleName() {
        return "gallery_home_stories_tab";
    }

    public final boolean onBackPressed() {
        return false;
    }

    private void A00() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (AnonymousClass2MW r0 : this.A0B.values()) {
            C124475Uy r2 = (C124475Uy) r0.A00;
            Reel reel = (Reel) r0.A01;
            if (!reel.A0k(this.A05)) {
                for (int i3 = r2.A00 - 1; i3 >= 0; i3--) {
                    if (i3 < reel.A07(this.A05)) {
                        arrayList.add(new C181437ou(reel.A0C(this.A05, i3).A08, reel, i3, r2.A01, i2));
                    } else {
                        arrayList.add(new C181437ou((AnonymousClass1NJ) null, reel, i3, r2.A01, i2));
                    }
                    i2++;
                }
            }
        }
        View view = this.mEmptyMessage;
        if (!arrayList.isEmpty()) {
            i = 4;
        }
        view.setVisibility(i);
        C181357om r3 = this.A03;
        r3.A00.clear();
        r3.A02.clear();
        r3.A01.clear();
        r3.A00.addAll(arrayList);
        for (int i4 = 0; i4 < r3.AUm(); i4++) {
            r3.A02.add(((C181437ou) r3.A00.get(i4 * 3)).A04);
        }
        r3.notifyDataSetChanged();
        if (this.mFastScrollController == null && !this.A03.A00.isEmpty()) {
            C181757pR r32 = new C181757pR(this.mRecyclerView);
            C181357om r22 = this.A03;
            C197238cH A022 = C197238cH.A02(r32, r22, r22, this.mView.findViewById(C0003R.C0005id.fast_scroll_container), this);
            this.mFastScrollController = A022;
            A022.A05 = new C181547p6(this);
            this.mGridInsetAdjustmentHelper.A00 = A022;
        }
    }

    public final void A4x(int i) {
        this.A06 = i;
        C181647pG r0 = this.mGridInsetAdjustmentHelper;
        if (r0 != null) {
            r0.A00(i);
        }
    }

    public final boolean AgL() {
        if (this.A01.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void B4M(C28691Ms r4) {
        C124435Uu.A00((C124435Uu) r4, this.A05, Constants.ONE, this.A0B);
        A00();
    }

    public final void B8c(String str, boolean z) {
        Reel A0G;
        if (this.A0B.containsKey(str) && !z && (A0G = C17020pY.A00().A0Q(this.A05).A0G(str)) != null && !A0G.A0l(this.A05)) {
            A00();
        }
    }

    public final void BZS(boolean z) {
        this.A01.A02(AnonymousClass39L.A03(this.A05, Constants.A0N, false, false, false, true), this);
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2030254982);
        super.onCreate(bundle);
        this.A02 = (GalleryHomeTabbedFragment) this.mParentFragment;
        this.A05 = AnonymousClass0J1.A06(this.mArguments);
        this.A00 = Math.round(C06220Of.A03(getContext(), 1));
        this.A08 = C06220Of.A09(getContext()) / 3;
        this.A07 = Math.round(((float) this.A08) / C06220Of.A04(getContext().getResources().getDisplayMetrics()));
        this.A0A = this.A02.AMU();
        Context context = getContext();
        String moduleName = getModuleName();
        int i = this.A07;
        GalleryHomeTabbedFragment galleryHomeTabbedFragment = this.A02;
        C181357om r3 = new C181357om(context, moduleName, i, galleryHomeTabbedFragment, galleryHomeTabbedFragment, this);
        this.A03 = r3;
        this.A04 = new C181567p8(this.A05, this, r3);
        C28341Li r4 = new C28341Li(getContext(), this.A05, AnonymousClass1L8.A00(this));
        this.A01 = r4;
        r4.A02(AnonymousClass39L.A03(this.A05, Constants.A0N, false, false, false, true), this);
        AnonymousClass0Z0.A09(2058479349, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AnonymousClass81L.A01(getResources());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1585786565);
        View inflate = layoutInflater.inflate(C0003R.layout.gallery_home, viewGroup, false);
        AnonymousClass0Z0.A09(2022783722, A022);
        return inflate;
    }

    public final void onDestroyView() {
        C164446zq r0;
        int A022 = AnonymousClass0Z0.A02(996635391);
        super.onDestroyView();
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.mRecyclerView;
        if (!(refreshableRecyclerViewLayout == null || (r0 = this.A09) == null)) {
            refreshableRecyclerViewLayout.A0E(r0);
        }
        StoriesArchiveFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-268257983, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-288220167);
        super.onPause();
        C17020pY.A00().A0M(this.A05).A05(this);
        AnonymousClass0Z0.A09(1579760, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1992502006);
        super.onResume();
        C17020pY.A00().A0M(this.A05).A04(this);
        A00();
        AnonymousClass0Z0.A09(855465717, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (ImageView) view.findViewById(C0003R.C0005id.loading_spinner);
        AnonymousClass3AD r4 = new AnonymousClass3AD(getContext(), C0003R.color.transparent, C0003R.color.transparent, new int[]{C0003R.color.transparent, C0003R.color.grey_5}, 2.0f, 0);
        this.mLoadingDrawable = r4;
        this.mLoadingSpinner.setImageDrawable(r4);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = (RefreshableRecyclerViewLayout) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = refreshableRecyclerViewLayout;
        RecyclerView recyclerView = refreshableRecyclerViewLayout.A0P;
        C159486rK.A01(refreshableRecyclerViewLayout);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1);
        this.mLayoutManager = gridLayoutManager;
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.A03);
        recyclerView.setItemViewCacheSize(4);
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout2 = this.mRecyclerView;
        refreshableRecyclerViewLayout2.A0P.A0r(new C181517p3(this));
        C181367on r1 = new C181367on(this);
        this.A09 = r1;
        this.mRecyclerView.A0D(r1);
        View findViewById = view.findViewById(C0003R.C0005id.empty_message);
        this.mEmptyMessage = findViewById;
        ((TextView) findViewById.findViewById(C0003R.C0005id.empty_message_title)).setText(C0003R.string.stories_empty_state_title);
        ((TextView) this.mEmptyMessage.findViewById(C0003R.C0005id.empty_message_description)).setText(C0003R.string.stories_empty_state_description);
        C181647pG r12 = new C181647pG(this.mRecyclerView.A0P);
        r12.A00(this.A06);
        this.mGridInsetAdjustmentHelper = r12;
    }

    public final int AMq(int i) {
        return this.A07;
    }

    public final void B4N(C28691Ms r1) {
    }
}
