package com.instagram.genericsurvey.fragment;

import android.content.Context;
import com.instagram.p009ui.viewpager.BakeOffViewPager;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass3DM;
import p000X.AnonymousClass6WR;

public class BakeoffFeedPairSectionController implements AnonymousClass3DM {
    public List A00 = new ArrayList();
    public final Context A01;
    public final AdBakeOffFragment A02;
    public final AnonymousClass0C1 A03;
    public FixedTabBar mFixedTabBar;
    public BakeOffViewPager mFragmentPager;
    public AnonymousClass6WR mPagerAdapter;

    public final void setMode(int i) {
        this.mFragmentPager.A0I(i, true);
        this.mFixedTabBar.A02(i);
    }

    public BakeoffFeedPairSectionController(AdBakeOffFragment adBakeOffFragment, AnonymousClass1AM r3, AnonymousClass0C1 r4, Context context) {
        this.A02 = adBakeOffFragment;
        this.mPagerAdapter = new AnonymousClass6WR(this, r3);
        this.A03 = r4;
        this.A01 = context;
    }
}
