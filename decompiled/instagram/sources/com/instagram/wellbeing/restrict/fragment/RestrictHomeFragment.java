package com.instagram.wellbeing.restrict.fragment;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass4RW;
import p000X.AnonymousClass4RX;
import p000X.AnonymousClass4XV;
import p000X.AnonymousClass6LX;
import p000X.C05230Is;
import p000X.C06590Pq;
import p000X.C109484nb;
import p000X.C109554nm;
import p000X.C13300iJ;
import p000X.C18320rf;
import p000X.C27341Hl;
import p000X.C33431cu;
import p000X.C67182wk;

public class RestrictHomeFragment extends C27341Hl implements AnonymousClass2NF, C33431cu {
    public AnonymousClass0QT A00;
    public AnonymousClass0C1 A01;
    public C67182wk A02;
    public View mSearchBar;
    public AnonymousClass3DK mTabbedFragmentController;

    public final boolean Ae1() {
        return false;
    }

    public final String getModuleName() {
        return "restrict_home";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        Bundle bundle = new Bundle();
        C05230Is.A00(this.A01, bundle);
        bundle.putSerializable("list_tab", (C109554nm) obj);
        C18320rf.A00.A04();
        RestrictListFragment restrictListFragment = new RestrictListFragment();
        restrictListFragment.setArguments(bundle);
        return restrictListFragment;
    }

    public final AnonymousClass3DN AB4(Object obj) {
        int i;
        switch (((C109554nm) obj).ordinal()) {
            case 0:
                i = C0003R.string.restricted_accounts_tab_title;
                break;
            case 1:
                i = C0003R.string.not_restricted_accounts_tab_title;
                break;
            default:
                throw new IllegalArgumentException("Invalid tab type");
        }
        return AnonymousClass3DN.A00(i);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new C109484nb(this));
        r3.BlI(C0003R.string.restrict_settings_entrypoint_title);
        r3.Bo0(true);
    }

    public final void onAttachFragment(AnonymousClass1HD r2) {
        super.onAttachFragment(r2);
        if (r2 instanceof RestrictListFragment) {
            ((RestrictListFragment) r2).A03 = this.A02;
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1142976623);
        super.onCreate(bundle);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = A06;
        this.A02 = C18320rf.A00.A05(A06);
        this.A00 = AnonymousClass0QT.A00(this.A01, this);
        AnonymousClass0Z0.A09(-1246214322, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(398444225);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_restrict_home, viewGroup, false);
        AnonymousClass0Z0.A09(275585815, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-829390517);
        super.onDestroyView();
        RestrictHomeFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-1835564703, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.nelson_home_description);
        String string = getString(C0003R.string.restrict_learn_how_it_works);
        SpannableStringBuilder append = new SpannableStringBuilder(getString(C0003R.string.restrict_management_header_description)).append(' ').append(string);
        AnonymousClass4XV.A02(string, append, new AnonymousClass4RW(this, getRootActivity()));
        textView.setHighlightColor(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(append);
        List singletonList = Collections.singletonList(C109554nm.MEMBERS);
        ViewPager viewPager = (ViewPager) view.findViewById(C0003R.C0005id.nelson_home_view_pager);
        AnonymousClass3DK r1 = new AnonymousClass3DK(this, getChildFragmentManager(), viewPager, (FixedTabBar) view.findViewById(C0003R.C0005id.nelson_home_tab_bar), singletonList);
        this.mTabbedFragmentController = r1;
        r1.A03(C109554nm.MEMBERS);
        View findViewById = view.findViewById(C0003R.C0005id.search_row);
        this.mSearchBar = findViewById;
        findViewById.setOnClickListener(new AnonymousClass4RX(this));
        AnonymousClass6LX.A08(this.A00, "impression", "restricted_accounts_list", (C13300iJ) null);
    }

    public final void BQo(Object obj) {
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
