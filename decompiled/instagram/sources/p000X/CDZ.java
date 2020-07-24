package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CDZ */
public final class CDZ extends C27341Hl implements AnonymousClass1HM, C27516CGg {
    public ViewPager A00;
    public TabLayout A01;
    public CD3 A02;
    public CDA A03;
    public CD8 A04;
    public C26915Bue A05;
    public CDW A06;
    public AnonymousClass0C1 A07;

    public final String getModuleName() {
        return "promote_create_audience_locations";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void BGX(CDA cda, Integer num) {
        C27473CEp cEp;
        List asList;
        CD3 cd3;
        CFS cfs;
        if (num == Constants.A14) {
            cd3 = this.A02;
            cfs = cd3.A07;
            asList = cfs.A05;
        } else if (num == Constants.A15) {
            CFS cfs2 = this.A02.A07;
            if (cfs2.A00()) {
                cEp = cfs2.A01;
            } else {
                cEp = cfs2.A02;
            }
            if (cEp == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                cEp.A03 = CFL.CUSTOM_LOCATION;
                asList = Arrays.asList(new C27473CEp[]{cEp});
            }
            cd3 = this.A02;
            cfs = cd3.A07;
        } else {
            return;
        }
        AnonymousClass0a4.A06(asList);
        cfs.A04 = asList;
        CDW cdw = this.A06;
        C27452CDu cDu = cd3.A08;
        AnonymousClass0a4.A06(cDu);
        String str = cDu.A02;
        String str2 = cDu.A03;
        int i = cDu.A01;
        int i2 = cDu.A00;
        ImmutableList A002 = cDu.A00();
        cDu.A01();
        ImmutableList A022 = cDu.A02();
        C27452CDu cDu2 = new C27452CDu();
        cDu2.A02 = str;
        cDu2.A03 = str2;
        cDu2.A01 = i;
        cDu2.A00 = i2;
        cDu2.A04 = A002;
        cDu2.A05 = asList;
        cDu2.A06 = A022;
        cdw.A03(cDu2);
        this.A05.A01(!AnonymousClass0OX.A00(asList));
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        r5.BlI(C0003R.string.promote_create_audience_locations_screen_title);
        r5.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
        r5.Bo6(true);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        C26915Bue bue = new C26915Bue(context, r5);
        this.A05 = bue;
        bue.A00(Constants.A12, new CE3(this));
        this.A05.A01(true ^ AnonymousClass0OX.A00(ImmutableList.A09(this.A02.A07.A04)));
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(953656562);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_create_audience_locations_view, viewGroup, false);
        AnonymousClass0Z0.A09(-250452728, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1906481592);
        super.onDestroy();
        this.A03.A0D(this);
        CFS cfs = this.A02.A07;
        cfs.A05 = new ArrayList();
        cfs.A00 = 5;
        cfs.A01 = null;
        cfs.A02 = null;
        cfs.A03 = null;
        cfs.A04 = new ArrayList();
        CDW cdw = this.A06;
        cdw.A08.A00();
        cdw.A00 = C27493CFj.A01;
        AnonymousClass0Z0.A09(1058671257, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(154827584);
        super.onDestroyView();
        CCZ.A03(this.A02, C27398CBr.LOCATIONS_SELECTION);
        AnonymousClass0Z0.A09(1636671122, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00d4, code lost:
        if (r6.A02.A07.A01 != null) goto L_0x00d6;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        this.A02 = ((C945346y) activity).AT6();
        AnonymousClass0a4.A06(activity);
        CDA AT7 = ((CC9) activity).AT7();
        this.A03 = AT7;
        AT7.A0C(this);
        AnonymousClass0C1 r2 = this.A02.A0Q;
        this.A07 = r2;
        FragmentActivity activity2 = getActivity();
        AnonymousClass0a4.A06(activity2);
        this.A04 = new CD8(r2, activity2, this);
        this.A06 = new CDW(C27398CBr.LOCATIONS_SELECTION, view.findViewById(C0003R.C0005id.audience_potential_reach_view), this.A02, this.A04);
        this.A00 = (ViewPager) view.findViewById(C0003R.C0005id.locations_view_pager);
        this.A01 = (TabLayout) view.findViewById(C0003R.C0005id.locations_tab_layout);
        C116344z7 r5 = new C116344z7(getChildFragmentManager());
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList();
        C16310oO.A00.A02();
        arrayList.add(new CE7());
        arrayList.add(new CDY());
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        arrayList2.add(context.getString(C0003R.string.promote_create_audience_locations_regional_tab_title));
        arrayList2.add(context.getString(C0003R.string.promote_create_audience_locations_local_tab_title));
        r5.A01 = arrayList;
        r5.A00 = arrayList2;
        this.A00.setAdapter(r5);
        this.A00.A0K(new CFO(this));
        this.A01.setupWithViewPager(this.A00);
        CFS cfs = this.A02.A07;
        if (cfs.A02 == null && cfs.A05.isEmpty()) {
            z = true;
        }
        z = false;
        if (z && this.A02.A08.A01() != null) {
            ArrayList arrayList3 = new ArrayList(this.A02.A08.A01());
            CFS cfs2 = this.A02.A07;
            if (CDX.A03(arrayList3)) {
                cfs2.A02 = (C27473CEp) arrayList3.get(0);
                cfs2.A00 = ((C27473CEp) arrayList3.get(0)).A02;
                cfs2.A03 = false;
                this.A00.setCurrentItem(1);
            } else {
                AnonymousClass0a4.A06(arrayList3);
                cfs2.A05 = arrayList3;
            }
        }
        CCZ.A04(this.A02, C27398CBr.LOCATIONS_SELECTION);
    }
}
