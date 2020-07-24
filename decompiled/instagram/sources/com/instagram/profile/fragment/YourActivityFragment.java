package com.instagram.profile.fragment;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C112264sK;
import p000X.C112284sM;
import p000X.C112294sO;
import p000X.C27341Hl;
import p000X.C71433Aq;

public class YourActivityFragment extends C27341Hl implements AnonymousClass1HM {
    public AnonymousClass0C1 A00;
    public List A01;
    public TabLayout mTabLayout;
    public ViewPager mViewPager;

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.setTitle(getString(C0003R.string.your_activity_action_bar_title));
        r2.Bo6(true);
    }

    public final String getModuleName() {
        return "YourActivityFragment";
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(848131462);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(requireArguments());
        this.A01 = new ArrayList(Arrays.asList(C112284sM.values()));
        AnonymousClass0Z0.A09(1186322668, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(1994124219);
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), C0003R.style.YourActivityTabLayoutTheme)).inflate(C0003R.layout.your_activity_layout, viewGroup, false);
        AnonymousClass0Z0.A09(913115444, A02);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabLayout = (TabLayout) view.findViewById(C0003R.C0005id.your_activity_tab_layout);
        ViewPager viewPager = (ViewPager) view.findViewById(C0003R.C0005id.your_activity_view_pager);
        this.mViewPager = viewPager;
        viewPager.setAdapter(new C112264sK(this, getChildFragmentManager()));
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        C71433Aq.A00(this.mTabLayout, new C112294sO(this), getResources().getDimensionPixelSize(C0003R.dimen.tab_bar_start_end_padding), C06220Of.A09(this.mTabLayout.getContext()));
    }
}
