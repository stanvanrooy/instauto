package com.instagram.music.search;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass3EO;
import p000X.AnonymousClass8A3;
import p000X.C06590Pq;
import p000X.C178307jT;
import p000X.C1899589u;
import p000X.C197828dH;
import p000X.C197898dQ;
import p000X.C197948dW;
import p000X.C27341Hl;
import p000X.C32741bm;
import p000X.C34571ex;

public class MusicOverlaySearchLandingPageFragment extends C27341Hl implements AnonymousClass8A3, AnonymousClass2NF, C32741bm {
    public int A00;
    public C1899589u A01;
    public MusicAttributionConfig A02;
    public C34571ex A03;
    public AnonymousClass3EO A04;
    public C197828dH A05;
    public AnonymousClass0C1 A06;
    public String A07;
    public final List A08 = new ArrayList();
    public FixedTabBar mTabBar;
    public AnonymousClass3DK mTabbedFragmentController;
    public ViewPager mViewPager;

    public final String getModuleName() {
        return "music_overlay_search_landing_page";
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        String str;
        switch (((C197948dW) obj).ordinal()) {
            case 0:
                str = "trending";
                break;
            case 1:
                str = "moods";
                break;
            case 2:
                str = "genres";
                break;
            case 3:
                str = "browse";
                break;
            default:
                throw new IllegalArgumentException("unsupported tab type");
        }
        C197898dQ A002 = C197898dQ.A00(this.A06, new MusicBrowseCategory(str, (String) null, (String) null, (Bundle) null), this.A02, this.A03, this.A07, this.A01, this.A00);
        A002.A01 = this.A05;
        A002.A00 = this.A04;
        return A002;
    }

    public final AnonymousClass3DN AB4(Object obj) {
        return new AnonymousClass3DN(((C197948dW) obj).A00, C0003R.color.music_search_tab_colors, C0003R.color.white, -1, (Drawable) null, C0003R.color.transparent, true, (String) null, (View) null);
    }

    public final boolean AhT() {
        AnonymousClass3DK r0 = this.mTabbedFragmentController;
        if (r0 == null) {
            return true;
        }
        AnonymousClass1HD A012 = r0.A01();
        if (A012 instanceof AnonymousClass8A3) {
            return ((AnonymousClass8A3) A012).AhT();
        }
        return true;
    }

    public final boolean AhU() {
        AnonymousClass3DK r0 = this.mTabbedFragmentController;
        if (r0 == null) {
            return true;
        }
        AnonymousClass1HD A012 = r0.A01();
        if (A012 instanceof AnonymousClass8A3) {
            return ((AnonymousClass8A3) A012).AhU();
        }
        return true;
    }

    public final void B5O(AnonymousClass1HD r3) {
        AnonymousClass3DK r0 = this.mTabbedFragmentController;
        if (r0 != null) {
            r0.A01().setUserVisibleHint(false);
        }
    }

    public final void B5Q(AnonymousClass1HD r3) {
        AnonymousClass3DK r0 = this.mTabbedFragmentController;
        if (r0 != null) {
            r0.A01().setUserVisibleHint(true);
        }
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        AnonymousClass1HD A022 = this.mTabbedFragmentController.A02((C197948dW) obj);
        A022.setUserVisibleHint(true);
        for (int i = 0; i < this.mTabbedFragmentController.getCount(); i++) {
            AnonymousClass1HD item = this.mTabbedFragmentController.getItem(i);
            if (item != A022) {
                item.setUserVisibleHint(false);
            }
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.requestFocus();
        }
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0069, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.MUSIC_BROWSER_REDESIGN, "browse_tab_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x006b;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        List list;
        C197948dW r0;
        int A022 = AnonymousClass0Z0.A02(1814975785);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A06 = AnonymousClass0J1.A06(bundle2);
        this.A03 = (C34571ex) bundle2.getSerializable("music_product");
        this.A07 = bundle2.getString("browse_session_full_id");
        this.A01 = (C1899589u) bundle2.getSerializable("camera_upload_step");
        this.A02 = (MusicAttributionConfig) bundle2.getParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config");
        this.A00 = bundle2.getInt("list_bottom_padding_px");
        this.A08.clear();
        this.A08.add(C197948dW.TRENDING);
        AnonymousClass0C1 r5 = this.A06;
        if (C178307jT.A02(r5)) {
            z = true;
        }
        z = false;
        if (z) {
            list = this.A08;
            r0 = C197948dW.BROWSE;
        } else {
            this.A08.add(C197948dW.MOODS);
            list = this.A08;
            r0 = C197948dW.GENRES;
        }
        list.add(r0);
        addFragmentVisibilityListener(this);
        AnonymousClass0Z0.A09(134232869, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1069210541);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_music_overlay_search_landing_page, viewGroup, false);
        AnonymousClass0Z0.A09(1963726490, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-529656254);
        super.onDestroyView();
        MusicOverlaySearchLandingPageFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-181246409, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.findViewById(C0003R.C0005id.music_overlay_landing_page_tab_bar);
        this.mViewPager = (ViewPager) view.findViewById(C0003R.C0005id.music_overlay_search_results);
        AnonymousClass3DK r2 = new AnonymousClass3DK(this, getChildFragmentManager(), this.mViewPager, this.mTabBar, this.A08);
        this.mTabbedFragmentController = r2;
        r2.A03(this.A08.get(0));
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
