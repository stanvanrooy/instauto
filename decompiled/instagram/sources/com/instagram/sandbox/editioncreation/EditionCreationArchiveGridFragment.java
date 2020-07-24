package com.instagram.sandbox.editioncreation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.C0003R;
import com.facebook.forker.Process;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass2MW;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass39L;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass5P5;
import p000X.AnonymousClass5V9;
import p000X.AnonymousClass5VB;
import p000X.AnonymousClass5VR;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C124345Uk;
import p000X.C124365Un;
import p000X.C124385Up;
import p000X.C124395Uq;
import p000X.C124435Uu;
import p000X.C124475Uy;
import p000X.C124545Vg;
import p000X.C124625Vo;
import p000X.C17020pY;
import p000X.C17710qg;
import p000X.C197238cH;
import p000X.C197318cP;
import p000X.C28341Li;
import p000X.C28591Mi;
import p000X.C28691Ms;
import p000X.C39941no;
import p000X.C43041tf;
import p000X.C43791v5;
import p000X.C52382Oo;
import p000X.C61472lr;
import p000X.C62652o6;

public class EditionCreationArchiveGridFragment extends AnonymousClass2NN implements C28591Mi, C61472lr, C52382Oo, AbsListView.OnScrollListener, C124625Vo {
    public C28341Li A00;
    public AnonymousClass5V9 A01;
    public AnonymousClass0C1 A02;
    public boolean A03;
    public View A04;
    public C197238cH A05;
    public final Map A06 = new LinkedHashMap();
    public final AnonymousClass1I1 A07 = new AnonymousClass1I1();
    public EmptyStateView mEmptyStateView;
    public AnonymousClass5VR mReelLoader;

    public final void B4J(C17710qg r1) {
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

    public final String getModuleName() {
        return "edition_creation";
    }

    private void A00() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass2MW r1 : this.A06.values()) {
            C124475Uy r2 = (C124475Uy) r1.A00;
            Reel reel = (Reel) r1.A01;
            if (!reel.A0k(this.A02)) {
                int i = 0;
                if (!reel.A0l(this.A02)) {
                    while (i < reel.A07(this.A02)) {
                        arrayList.add(new AnonymousClass5VB(reel.A0C(this.A02, i), reel, i, r2.A01, Constants.A0C));
                        i++;
                    }
                } else {
                    while (i < r2.A00) {
                        arrayList.add(new AnonymousClass5VB((C39941no) null, reel, i, r2.A01, Constants.ONE));
                        i++;
                    }
                }
            }
        }
        AnonymousClass5V9 r4 = this.A01;
        r4.A01.A06();
        r4.A05.clear();
        int size = arrayList.size();
        if (size > 9) {
            int i2 = size % 3;
            int i3 = 3 - i2;
            if (i2 == 0) {
                i3 = 0;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                r4.A01.A0A(new AnonymousClass5VB((C39941no) null, (Reel) null, 0, 0, Constants.ZERO));
            }
        }
        r4.A01.A0F(arrayList);
        r4.A00();
        A01();
    }

    private void A01() {
        EmptyStateView emptyStateView;
        AnonymousClass2Oq r0;
        AnonymousClass2Oq r02;
        EmptyStateView emptyStateView2 = this.mEmptyStateView;
        if (emptyStateView2 != null) {
            if (AgL()) {
                r02 = AnonymousClass2Oq.LOADING;
            } else {
                boolean z = false;
                if (this.A00.A00 == Constants.ONE) {
                    z = true;
                }
                if (z) {
                    r02 = AnonymousClass2Oq.ERROR;
                } else {
                    if (this.A01.isEmpty()) {
                        emptyStateView = this.mEmptyStateView;
                        r0 = AnonymousClass2Oq.EMPTY;
                    } else {
                        emptyStateView = this.mEmptyStateView;
                        r0 = AnonymousClass2Oq.GONE;
                    }
                    emptyStateView.A0M(r0);
                    this.mEmptyStateView.A0F();
                }
            }
            emptyStateView2.A0M(r02);
            this.mEmptyStateView.A0F();
        }
    }

    public final boolean AgL() {
        if (this.A00.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void AsA(Reel reel, List list, C124545Vg r7, int i, int i2, int i3, boolean z) {
        C39941no A0C = reel.A0C(this.A02, i3);
        if (A0C.A12() || z) {
            AnonymousClass5P5 A002 = AnonymousClass5P5.A00(this.A02);
            AnonymousClass1NJ r2 = A0C.A08;
            if (A002.A03.containsKey(r2.getId())) {
                A002.A03.remove(r2.getId());
                A002.A01.remove(r2.A0k());
            } else {
                A002.A03.put(r2.getId(), r2);
                A002.A01.put(r2.A0k(), r2);
            }
            for (C124395Uq BB5 : A002.A00) {
                BB5.BB5();
            }
            return;
        }
        AnonymousClass5F9.A01(getContext(), C0003R.string.cannot_be_selected, 0);
    }

    public final /* bridge */ /* synthetic */ void B4M(C28691Ms r4) {
        C124435Uu.A00((C124435Uu) r4, this.A02, Constants.ZERO, this.A06);
        A00();
        A02(this.mView);
        int count = this.A01.getCount();
        int i = count - 1;
        if (!this.A03 && count > 0) {
            this.A03 = true;
            getListView().setSelectionFromTop(i, 0);
        }
    }

    public final void B8c(String str, boolean z) {
        Reel A0G;
        if (this.A06.containsKey(str) && !z && (A0G = C17020pY.A00().A0Q(this.A02).A0G(str)) != null && !A0G.A0l(this.A02)) {
            A00();
        }
    }

    public final void BZS(boolean z) {
        this.A00.A02(AnonymousClass39L.A03(this.A02, Constants.A0N, false, false, false, false), this);
    }

    private void A02(View view) {
        int i;
        ListView listView = getListView();
        listView.setVerticalScrollBarEnabled(false);
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.fast_scroll_container);
        if (viewStub != null) {
            this.A04 = viewStub.inflate();
        }
        int A002 = C124345Uk.A00(getContext());
        AnonymousClass5V9 r6 = this.A01;
        int count = r6.getCount();
        if (count > 0) {
            View view2 = r6.getView(count - 1, (View) null, getListView());
            view2.measure(View.MeasureSpec.makeMeasureSpec(C06220Of.A09(getContext()), Process.WAIT_RESULT_TIMEOUT), View.MeasureSpec.makeMeasureSpec(0, 0));
            i = view2.getMeasuredHeight();
        } else {
            i = 0;
        }
        C197238cH r1 = this.A05;
        if (r1 != null) {
            this.A07.A0C(r1);
        }
        C124365Un r62 = new C124365Un(listView);
        AnonymousClass5V9 r7 = this.A01;
        C197238cH r4 = new C197238cH(new C197318cP(r62, r7, A002, i), r62, r7, r7, this.A04);
        this.A05 = r4;
        this.A07.A0B(r4);
    }

    public final void B4I(C43791v5 r4) {
        AnonymousClass5F9.A01(getActivity(), C0003R.string.could_not_refresh_feed, 0);
        A01();
    }

    public final void B4K() {
        ((RefreshableListView) getListView()).setIsLoading(false);
        C62652o6.A00(false, this.mView);
    }

    public final void B4L() {
        if (getListViewSafe() != null) {
            ((RefreshableListView) getListViewSafe()).setIsLoading(true);
        }
        A01();
    }

    public final void B4N(C28691Ms r1) {
    }

    public final void Bel() {
        C43041tf.A00(this, getListView());
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(114030922);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A02 = A062;
        AnonymousClass5V9 r1 = new AnonymousClass5V9(getContext(), A062, this);
        this.A01 = r1;
        setListAdapter(r1);
        C28341Li r3 = new C28341Li(getContext(), this.A02, AnonymousClass1L8.A00(this));
        this.A00 = r3;
        r3.A02(AnonymousClass39L.A03(this.A02, Constants.A0N, false, false, false, false), this);
        AnonymousClass0Z0.A09(2044454725, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1493079657);
        View inflate = layoutInflater.inflate(C0003R.layout.edition_creation_archive_grid, viewGroup, false);
        AnonymousClass0Z0.A09(1288369975, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1358458019);
        super.onDestroyView();
        AnonymousClass5P5 A002 = AnonymousClass5P5.A00(this.A02);
        A002.A00.remove(this.A01);
        AnonymousClass0Z0.A09(-1080061908, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1448937407);
        super.onPause();
        C17020pY.A00().A0M(this.A02).A05(this);
        this.A07.A0C(this.mReelLoader);
        C197238cH r1 = this.A05;
        if (r1 != null) {
            this.A07.A0C(r1);
        }
        AnonymousClass0Z0.A09(-1373749044, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1341080036);
        super.onResume();
        C17020pY.A00().A0M(this.A02).A04(this);
        this.A07.A0B(this.mReelLoader);
        C197238cH r1 = this.A05;
        if (r1 != null) {
            this.A07.A0B(r1);
        }
        EmptyStateView emptyStateView = this.mEmptyStateView;
        AnonymousClass2Oq r2 = AnonymousClass2Oq.ERROR;
        emptyStateView.A0H(C0003R.C0004drawable.loadmore_icon_refresh_compound, r2);
        this.mEmptyStateView.A0K(new C124385Up(this), r2);
        A00();
        AnonymousClass0Z0.A09(-1673479051, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(928263334);
        this.A07.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(644225384, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(-504556024);
        this.A07.onScrollStateChanged(absListView, i);
        AnonymousClass0Z0.A0A(913666750, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        refreshableListView.AC3();
        boolean z = false;
        refreshableListView.setDrawBorder(false);
        refreshableListView.setOnScrollListener(this);
        if (AgL() && !this.A01.isEmpty()) {
            z = true;
        }
        C62652o6.A00(z, this.mView);
        A01();
        AnonymousClass5P5 A002 = AnonymousClass5P5.A00(this.A02);
        A002.A00.add(this.A01);
        this.mReelLoader = new AnonymousClass5VR(this.A01, this.A02, this);
        A02(view);
    }
}
