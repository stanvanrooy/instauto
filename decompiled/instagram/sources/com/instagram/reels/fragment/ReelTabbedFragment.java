package com.instagram.reels.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.C06590Pq;
import p000X.C122075Lb;
import p000X.C122085Lc;
import p000X.C26301Cs;
import p000X.C27341Hl;

public abstract class ReelTabbedFragment extends C27341Hl implements AnonymousClass1HM, AnonymousClass2NF {
    public AnonymousClass0C1 A00;
    public Object A01;
    public FixedTabBar mTabBar;
    public AnonymousClass3DK mTabController;
    public ViewPager mViewPager;

    public String A00() {
        Context context;
        int i;
        if (!(this instanceof C122075Lb)) {
            context = ((C122085Lc) this).getContext();
            i = C0003R.string.reel_poll_voters_list_title;
        } else {
            context = ((C122075Lb) this).getContext();
            i = C0003R.string.reel_quick_reactors_list_title;
        }
        return context.getString(i);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public void BQo(Object obj) {
        this.A01 = obj;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.setTitle(A00());
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(1266917897);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass0Z0.A09(-1434313498, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-595811932);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_reel_poll_voters_tabbed_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-161193037, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0Z0.A02(535496155);
        super.onDestroyView();
        this.mTabController = null;
        this.mTabBar = null;
        this.mViewPager = null;
        AnonymousClass0Z0.A09(-746455306, A02);
    }

    public final void onStart() {
        int A02 = AnonymousClass0Z0.A02(-1925579052);
        super.onStart();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(8);
        }
        AnonymousClass0Z0.A09(-1315473197, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0Z0.A02(592199521);
        super.onStop();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(632173158, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.findViewById(C0003R.C0005id.fixed_tabbar_view);
        this.mViewPager = (ViewPager) view.findViewById(C0003R.C0005id.view_pager);
    }
}
