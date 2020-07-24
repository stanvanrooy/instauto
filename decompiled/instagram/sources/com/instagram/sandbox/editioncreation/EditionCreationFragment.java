package com.instagram.sandbox.editioncreation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass5P3;
import p000X.AnonymousClass5P4;
import p000X.AnonymousClass5P5;
import p000X.C06590Pq;
import p000X.C122955Ow;
import p000X.C174407ci;
import p000X.C27341Hl;
import p000X.C31721Zq;

public class EditionCreationFragment extends C27341Hl implements AbsListView.OnScrollListener, AnonymousClass1HM, AnonymousClass2NF {
    public AnonymousClass5P4 A00;
    public AnonymousClass0C1 A01;
    public List A02;
    public final AnonymousClass1I1 A03 = new AnonymousClass1I1();
    public AnonymousClass3DK mTabbedFragmentController;

    public final String getModuleName() {
        return "edition_creation";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        switch (((AnonymousClass5P3) obj).ordinal()) {
            case 0:
                EditionCreationArchiveGridFragment editionCreationArchiveGridFragment = new EditionCreationArchiveGridFragment();
                editionCreationArchiveGridFragment.setArguments(this.mArguments);
                return editionCreationArchiveGridFragment;
            case 1:
                C174407ci r1 = new C174407ci();
                r1.setArguments(this.mArguments);
                return r1;
            default:
                throw new IllegalArgumentException("invalid position");
        }
    }

    public final AnonymousClass3DN AB4(Object obj) {
        String name = ((AnonymousClass5P3) obj).name();
        C122955Ow r1 = new C122955Ow();
        r1.A05 = name;
        r1.A04 = -1;
        return r1.A00();
    }

    public final void BQo(Object obj) {
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BlI(C0003R.string.create_edition_title);
        r3.A4R(getResources().getString(C0003R.string.next));
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-410145620);
        super.onCreate(bundle);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = A06;
        this.A00 = new AnonymousClass5P4(getContext(), A06);
        AnonymousClass0C1 r0 = this.A01;
        Class<AnonymousClass5P5> cls = AnonymousClass5P5.class;
        synchronized (cls) {
            r0.BbT(cls);
        }
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.add(AnonymousClass5P3.ARCHIVE);
        this.A02.add(AnonymousClass5P3.GALLERY);
        AnonymousClass0Z0.A09(-2112818050, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1998300230);
        View inflate = layoutInflater.inflate(C0003R.layout.edition_creation, viewGroup, false);
        AnonymousClass0Z0.A09(1754571090, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1297203167);
        super.onDestroyView();
        AnonymousClass5P5 A002 = AnonymousClass5P5.A00(this.A01);
        A002.A00.remove(this.A00);
        AnonymousClass0Z0.A09(-663246926, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(1811949899);
        this.A03.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(-121370142, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(2088318214);
        this.A03.onScrollStateChanged(absListView, i);
        AnonymousClass0Z0.A0A(880066524, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((BaseFragmentActivity) getActivity()).A0U();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.edition_item_padding);
        recyclerView.A0r(new C31721Zq(dimensionPixelSize, dimensionPixelSize));
        recyclerView.setAdapter(this.A00);
        AnonymousClass5P5 A002 = AnonymousClass5P5.A00(this.A01);
        A002.A00.add(this.A00);
        AnonymousClass3DK r1 = new AnonymousClass3DK(this, getChildFragmentManager(), (ViewPager) view.findViewById(C0003R.C0005id.tabs_viewpager), (FixedTabBar) view.findViewById(C0003R.C0005id.fixed_tabbar_view), this.A02);
        this.mTabbedFragmentController = r1;
        r1.A03(AnonymousClass5P3.ARCHIVE);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
