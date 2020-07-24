package com.instagram.archive.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.C06590Pq;
import p000X.C122945Ou;
import p000X.C158576pr;
import p000X.C16270oK;
import p000X.C225789nk;
import p000X.C27341Hl;

public class ArchiveReelTabbedFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass2NF {
    public ArchiveReelFragment A00;
    public C122945Ou A01 = C122945Ou.GRID;
    public C27341Hl A02;
    public C27341Hl A03;
    public AnonymousClass0RN A04;
    public C06590Pq A05;
    public final Map A06 = new HashMap();
    public final List A07 = new ArrayList();
    public FixedTabBar mTabBar;
    public AnonymousClass3DK mTabController;
    public ViewPager mViewPager;

    public final void onPageScrollStateChanged(int i) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        C122945Ou r4 = (C122945Ou) obj;
        switch (r4.ordinal()) {
            case 0:
                return this.A00;
            case 1:
                return this.A02;
            case 2:
                return this.A03;
            default:
                throw new IllegalArgumentException("illegal tab: " + r4);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3DN AB4(Object obj) {
        return (AnonymousClass3DN) this.A06.get((C122945Ou) obj);
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        C122945Ou r2 = (C122945Ou) obj;
        this.A01 = r2;
        switch (r2.ordinal()) {
            case 0:
                this.A04 = this.A00;
                return;
            case 1:
                this.A04 = this.A02;
                return;
            default:
                return;
        }
    }

    public final String getModuleName() {
        return this.A04.getModuleName();
    }

    public final boolean onBackPressed() {
        return ((AnonymousClass1HK) this.mTabController.A01()).onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(926378214);
        super.onCreate(bundle);
        this.A05 = AnonymousClass0J1.A00(this.mArguments);
        this.A07.add(C122945Ou.GRID);
        this.A07.add(C122945Ou.CALENDAR);
        this.A07.add(C122945Ou.MAP);
        this.A06.put(C122945Ou.GRID, new AnonymousClass3DN(-1, -1, -1, C0003R.C0004drawable.instagram_story_outline_24, (Drawable) null, -1, true, (String) null, (View) null));
        this.A06.put(C122945Ou.CALENDAR, new AnonymousClass3DN(-1, -1, -1, -1, new C158576pr(getContext()), -1, true, (String) null, (View) null));
        this.A06.put(C122945Ou.MAP, new AnonymousClass3DN(-1, -1, -1, C0003R.C0004drawable.instagram_location_outline_24, (Drawable) null, -1, true, (String) null, (View) null));
        C16270oK.A00.A01();
        Bundle bundle2 = this.mArguments;
        ArchiveReelFragment archiveReelFragment = new ArchiveReelFragment();
        archiveReelFragment.setArguments(bundle2);
        this.A00 = archiveReelFragment;
        C16270oK.A00.A01();
        Bundle bundle3 = this.mArguments;
        ArchiveReelCalendarFragment archiveReelCalendarFragment = new ArchiveReelCalendarFragment();
        archiveReelCalendarFragment.setArguments(bundle3);
        this.A02 = archiveReelCalendarFragment;
        C16270oK.A00.A01();
        Bundle bundle4 = this.mArguments;
        C225789nk r1 = new C225789nk();
        r1.setArguments(bundle4);
        this.A03 = r1;
        this.A04 = this.A00;
        AnonymousClass0Z0.A09(440777051, A022);
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1072015026);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_archive_reel_tabbed_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1865216525, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-635290848);
        super.onDestroyView();
        ArchiveReelTabbedFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-527094096, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FixedTabBar fixedTabBar = (FixedTabBar) view.findViewById(C0003R.C0005id.fixed_tabbar_view);
        this.mTabBar = fixedTabBar;
        fixedTabBar.A06 = true;
        this.mViewPager = (ViewPager) view.findViewById(C0003R.C0005id.view_pager);
        AnonymousClass3DK r1 = new AnonymousClass3DK(this, getChildFragmentManager(), this.mViewPager, this.mTabBar, this.A07);
        this.mTabController = r1;
        r1.A03(this.A01);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
