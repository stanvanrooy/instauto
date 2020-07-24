package com.instagram.user.userlist.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.user.recommended.FollowListData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PM;
import p000X.AnonymousClass2AR;
import p000X.AnonymousClass2UZ;
import p000X.AnonymousClass3C0;
import p000X.AnonymousClass3C6;
import p000X.AnonymousClass5DQ;
import p000X.AnonymousClass5SP;
import p000X.AnonymousClass9DA;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C116304z2;
import p000X.C116314z3;
import p000X.C116364zA;
import p000X.C116374zB;
import p000X.C116384zC;
import p000X.C14090jk;
import p000X.C146776Pc;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C33831dZ;
import p000X.C36841ih;
import p000X.C44611wS;
import p000X.C52002Na;
import p000X.C52362Om;
import p000X.C63532pd;
import p000X.C71433Aq;

public class UnifiedFollowFragment extends C27341Hl implements AnonymousClass1PM, C27371Ho, C44611wS, AnonymousClass1HM, C63532pd {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass0C1 A03;
    public AnonymousClass5DQ A04;
    public C116304z2 A05;
    public String A06;
    public WeakReference A07;
    public List A08;
    public Map A09 = new HashMap();
    public boolean A0A;
    public C52002Na A0B;
    public AnonymousClass3C6 A0C;
    public FollowListData A0D;
    public String A0E;
    public TabLayout mTabLayout;
    public ViewPager mViewPager;

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return false;
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final C36841ih APu(AnonymousClass1NJ r2) {
        AnonymousClass1PM r0 = (AnonymousClass1PM) this.A07.get();
        if (r0 != null) {
            return r0.APu(r2);
        }
        return null;
    }

    public final void AqE(AnonymousClass1NJ r2) {
        AnonymousClass1PM r0 = (AnonymousClass1PM) this.A07.get();
        if (r0 != null) {
            r0.AqE(r2);
        }
    }

    public final void B63(AnonymousClass1NJ r4, int i) {
        C52362Om r2 = new C52362Om(getActivity(), this.A03);
        C146776Pc A0T = AnonymousClass2UZ.A00().A0T(r4.APo());
        A0T.A0F = true;
        r2.A02 = A0T.A01();
        r2.A02();
    }

    public final boolean B64(View view, MotionEvent motionEvent, AnonymousClass1NJ r4, int i) {
        return this.A0B.BS6(view, motionEvent, r4, i);
    }

    public final void configureActionBar(AnonymousClass1EX r6) {
        r6.setTitle(this.A0E);
        r6.Bo6(true);
        r6.Bo0(false);
        if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.DISCOVER_ACCOUNTS, "disco_self_following_nav_entrypoint", false, (AnonymousClass04H) null)).booleanValue()) {
            C33831dZ r1 = new C33831dZ();
            r1.A02 = C0003R.C0004drawable.instagram_user_follow_outline_24;
            r1.A01 = C0003R.string.discover_new_people_description;
            r1.A05 = new C116364zA(this);
            ImageView A4J = r6.A4J(r1.A00());
            Runnable A002 = AnonymousClass9DA.A00(getActivity(), A4J, Constants.ONE, this.A03);
            if (A002 != null) {
                A4J.post(A002);
            }
        }
    }

    public final String getModuleName() {
        if (C14090jk.A06(this.A03, this.A06)) {
            return "self_unified_follow_lists";
        }
        return "unified_follow_lists";
    }

    public final void onPageSelected(int i) {
        String str;
        AnonymousClass5DQ r3 = (AnonymousClass5DQ) this.A08.get(i);
        this.A09.get(this.A04);
        this.A09.get(r3);
        AnonymousClass0C1 r5 = this.A03;
        AnonymousClass3C6 r8 = this.A0C;
        String str2 = this.A06;
        if (this.A0A) {
            str = "tab_header";
        } else {
            str = "swipe";
        }
        AnonymousClass3C0.A03(r5, this, "tap_followers", r8, str2, (String) null, (String) null, str);
        C26441Dh.A00(this.A03).A08(this, this.mFragmentManager.A0I(), this.A04.A00, new C116374zB(this, r3));
        C26441Dh.A00(this.A03).A06(this);
        this.A04 = r3;
        this.A0A = false;
        C116304z2 r2 = this.A05;
        AnonymousClass1HD r1 = (AnonymousClass1HD) r2.A00.get(this.A08.indexOf(r3));
        if (r1 instanceof AnonymousClass5SP) {
            AnonymousClass5SP r12 = (AnonymousClass5SP) r1;
            r12.A0J = true;
            if (r12.A0L && !r12.A0I && !r12.A08.AgL() && r12.isResumed()) {
                AnonymousClass5SP.A05(r12);
            }
        }
        C116304z2 r22 = this.A05;
        AnonymousClass1HD r13 = (AnonymousClass1HD) r22.A00.get(this.A08.indexOf(this.A04));
        if (r13 instanceof AnonymousClass1PM) {
            this.A07 = new WeakReference((AnonymousClass1PM) r13);
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1597470263);
        super.onCreate(bundle);
        this.A03 = AnonymousClass0J1.A06(this.mArguments);
        FollowListData followListData = (FollowListData) this.mArguments.getParcelable("UnifiedFollowFragment.INITIAL_FOLLOW_LIST_DATA");
        this.A0D = followListData;
        this.A06 = followListData.A02;
        this.A0E = this.mArguments.getString("UnifiedFollowFragment.PROFILE_USER_NAME");
        this.A02 = this.mArguments.getInt("UnifiedFollowFragment.MUTUAL_FOLLOWERS_COUNT");
        this.A00 = this.mArguments.getInt("UnifiedFollowFragment.FOLLOWER_COUNT");
        this.A01 = this.mArguments.getInt("UnifiedFollowFragment.FOLLOWING_COUNT");
        this.A0C = (AnonymousClass3C6) this.mArguments.getSerializable("UnifiedFollowFragment.EXTRA_LOGGING_FOLLOW_STATUS");
        C019000b.A00(getContext(), C0003R.color.igds_secondary_text);
        C019000b.A00(getContext(), C0003R.color.igds_primary_text);
        boolean A062 = C14090jk.A06(this.A03, this.A06);
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        this.A09 = new HashMap();
        if (A062 || this.A02 <= 0) {
            FollowListData followListData2 = this.A0D;
            if (followListData2.A00 == AnonymousClass5DQ.Mutual) {
                this.A0D = FollowListData.A00(AnonymousClass5DQ.Followers, followListData2.A02);
            }
        } else {
            arrayList.add(AnonymousClass5DQ.Mutual);
        }
        this.A08.add(AnonymousClass5DQ.Followers);
        this.A08.add(AnonymousClass5DQ.Following);
        if (!A062 && this.mArguments.getBoolean("UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS")) {
            this.A08.add(AnonymousClass5DQ.Similar);
        }
        C52002Na r4 = new C52002Na(getContext(), this, getChildFragmentManager(), false, this.A03, this, (AnonymousClass1I6) null, this);
        this.A0B = r4;
        registerLifecycleListener(r4);
        AnonymousClass0Z0.A09(-1883998907, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1546210224);
        View inflate = layoutInflater.cloneInContext(new AnonymousClass2AR(getContext(), (int) C0003R.style.UnifiedFollowListTabLayoutTheme)).inflate(C0003R.layout.unified_follow_fragment_layout, viewGroup, false);
        AnonymousClass0Z0.A09(-1277239527, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1107636717);
        super.onDestroyView();
        UnifiedFollowFragmentLifecycleUtil.cleanupReferences(this);
        this.A09.clear();
        AnonymousClass0Z0.A09(1889666818, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabLayout = (TabLayout) view.findViewById(C0003R.C0005id.unified_follow_list_tab_layout);
        this.mViewPager = (ViewPager) view.findViewById(C0003R.C0005id.unified_follow_list_view_pager);
        C116304z2 r1 = new C116304z2(this, getChildFragmentManager());
        this.A05 = r1;
        this.mViewPager.setAdapter(r1);
        this.mViewPager.A0K(this);
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        C71433Aq.A00(this.mTabLayout, new C116314z3(this), getResources().getDimensionPixelSize(C0003R.dimen.tab_bar_start_end_padding), C06220Of.A09(this.mTabLayout.getContext()));
        AnonymousClass5DQ r12 = this.A0D.A00;
        this.A04 = r12;
        if (this.A08.indexOf(r12) < 0) {
            this.A04 = (AnonymousClass5DQ) this.A08.get(0);
        }
        this.mViewPager.A0I(this.A08.indexOf(this.A04), false);
        this.mViewPager.post(new C116384zC(this));
    }
}
