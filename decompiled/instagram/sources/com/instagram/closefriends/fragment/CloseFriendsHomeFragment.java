package com.instagram.closefriends.fragment;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.p009ui.widget.search.SearchController;
import com.instagram.video.live.p038ui.streaming.IgLiveWithInviteFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1H4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1UT;
import p000X.AnonymousClass1ZK;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass3AQ;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass54G;
import p000X.AnonymousClass67D;
import p000X.AnonymousClass67G;
import p000X.AnonymousClass7O6;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C109564nn;
import p000X.C11870fo;
import p000X.C13300iJ;
import p000X.C151836eN;
import p000X.C155936lE;
import p000X.C17850qu;
import p000X.C18980sj;
import p000X.C193418Ps;
import p000X.C225379n3;
import p000X.C225389n4;
import p000X.C25007Axz;
import p000X.C256219o;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C27540CHf;
import p000X.C27541CHg;
import p000X.C27546CHm;
import p000X.C27550CHr;
import p000X.C27552CHt;
import p000X.C27553CHu;
import p000X.C27556CHx;
import p000X.C27651Ir;
import p000X.C28351Lj;
import p000X.C30571Uj;
import p000X.C33431cu;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C67692xg;
import p000X.C67712xi;
import p000X.C67782xp;
import p000X.C67852xw;
import p000X.C68172yZ;
import p000X.C6Y;
import p000X.C96584Fr;
import p000X.CHX;
import p000X.CI0;
import p000X.CI1;
import p000X.CI3;
import p000X.CI6;
import p000X.CI7;
import p000X.CI8;

public class CloseFriendsHomeFragment extends C27341Hl implements AnonymousClass1HK, C67692xg, CHX, AnonymousClass67D, AnonymousClass2NF, C33431cu, CI6 {
    public int A00;
    public C52362Om A01;
    public C6Y A02;
    public C109564nn A03;
    public AnonymousClass7O6 A04;
    public AnonymousClass0C1 A05;
    public SearchController A06;
    public List A07;
    public boolean A08;
    public boolean A09 = true;
    public float A0A;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public C67712xi A0E;
    public boolean A0F;
    public final C27541CHg A0G = new C27541CHg();
    public View mHeader;
    public TextView mHeaderDescription;
    public View mMainContainer;
    public View mMembersTabView;
    public TextView mMembersTabViewLabel;
    public C68172yZ mProgressDialog;
    public C151836eN mSearchAdapter;
    public View mSearchRow;
    public AnonymousClass3DK mTabbedFragmentController;

    public final boolean Ae1() {
        return true;
    }

    public final void B3D() {
    }

    public final void BLV(SearchController searchController, boolean z) {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    private void A00() {
        Resources resources;
        int i;
        if (!this.A0F) {
            StringBuilder sb = new StringBuilder();
            if (this.A03 == C109564nn.SUGGESTIONS) {
                resources = getResources();
                i = C0003R.string.close_friends_home_suggestions_header_text;
            } else {
                resources = getResources();
                i = C0003R.string.close_friends_home_header_text_v4;
            }
            String string = resources.getString(i);
            sb.append(string);
            sb.append(" ");
            String string2 = getResources().getString(C0003R.string.close_friends_home_header_action_text);
            sb.append(string2);
            SpannableString spannableString = new SpannableString(AnonymousClass000.A0J(string, " ", string2));
            C225379n3 r3 = new C225379n3(this);
            int lastIndexOf = sb.lastIndexOf(string2);
            spannableString.setSpan(r3, lastIndexOf, string2.length() + lastIndexOf, 33);
            this.mHeaderDescription.setText(spannableString);
            this.mHeaderDescription.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void A01(CloseFriendsHomeFragment closeFriendsHomeFragment) {
        if (closeFriendsHomeFragment.mProgressDialog == null) {
            CI1 A012 = closeFriendsHomeFragment.A0G.A01();
            if (A012.A00()) {
                closeFriendsHomeFragment.A02.A00();
                AnonymousClass3AQ.A00 = true;
                if (AnonymousClass1H4.A01(closeFriendsHomeFragment.mFragmentManager)) {
                    closeFriendsHomeFragment.getActivity().onBackPressed();
                }
            } else if (A012.A02.isEmpty() || !C30571Uj.A01(closeFriendsHomeFragment.A05)) {
                A02(closeFriendsHomeFragment, A012);
            } else {
                C30571Uj.A00(closeFriendsHomeFragment.getContext(), new C27550CHr(closeFriendsHomeFragment, A012));
            }
        }
    }

    public static void A02(CloseFriendsHomeFragment closeFriendsHomeFragment, CI1 ci1) {
        C68172yZ r2 = new C68172yZ(closeFriendsHomeFragment.getContext());
        closeFriendsHomeFragment.mProgressDialog = r2;
        r2.A00(closeFriendsHomeFragment.getContext().getResources().getString(C0003R.string.close_friends_home_saving));
        closeFriendsHomeFragment.mProgressDialog.show();
        ArrayList arrayList = new ArrayList();
        for (C13300iJ id : ci1.A02) {
            arrayList.add(id.getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (C13300iJ id2 : ci1.A03) {
            arrayList2.add(id2.getId());
        }
        C17850qu A022 = C25007Axz.A02(closeFriendsHomeFragment.A05, closeFriendsHomeFragment, Constants.ONE, arrayList, arrayList2);
        A022.A00 = new C27540CHf(closeFriendsHomeFragment, ci1);
        closeFriendsHomeFragment.schedule(A022);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        return AnonymousClass1UT.A00.A04(this.A05.getToken(), (C109564nn) obj);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3DN AB4(Object obj) {
        switch (((C109564nn) obj).ordinal()) {
            case 0:
                return new AnonymousClass3DN(-1, -1, -1, -1, (Drawable) null, -1, true, (String) null, this.mMembersTabView);
            case 1:
                return AnonymousClass3DN.A00(C0003R.string.close_friends_home_suggestions_tab_label);
            default:
                throw new IllegalArgumentException(C193418Ps.$const$string(162));
        }
    }

    public final float AFw(SearchController searchController, Integer num) {
        return (float) this.mHeader.getHeight();
    }

    public final void Arn(SearchController searchController, float f, float f2, Integer num) {
        float height = f2 - ((float) this.mHeader.getHeight());
        AnonymousClass1EW.A03(getActivity()).A07.setTranslationY(height);
        this.mMainContainer.setTranslationY(height);
    }

    public final void Awv(C27541CHg cHg) {
        SearchController searchController = this.A06;
        if (searchController.A04()) {
            searchController.A01(true, (float) this.mHeader.getHeight());
        }
        boolean z = false;
        if (this.A06.A05 == Constants.ZERO) {
            z = true;
        }
        if (!z) {
            this.mTabbedFragmentController.A03(C109564nn.MEMBERS);
        }
        this.A04.A01(new ArrayList(this.A0G.A01).size());
        this.mMembersTabViewLabel.setCompoundDrawables((Drawable) null, (Drawable) null, this.A04, (Drawable) null);
        this.mMembersTabViewLabel.setCompoundDrawablePadding(this.A00);
        BaseFragmentActivity.A00(AnonymousClass1EW.A03(getActivity()));
    }

    public final void BMg(C27541CHg cHg, C13300iJ r5, boolean z, CI0 ci0, String str, int i) {
        CI7 ci7 = new CI7(AnonymousClass0QT.A00(this.A05, new C27546CHm(this, ci0)).A02("ig_search_result_selected"));
        ci7.A06("position", Integer.valueOf(i));
        ci7.A04("selected", Boolean.valueOf(z));
        ci7.A08("uid", r5.getId());
        if (ci0 == CI0.SEARCH) {
            ci7.A08("query", this.A0E.ATP());
        }
        if (str != null) {
            ci7.A08("rank_token", str);
        }
        ci7.A01();
    }

    public final void BOo(SearchController searchController, Integer num, Integer num2) {
        AnonymousClass3DK r1 = this.mTabbedFragmentController;
        AnonymousClass3DK.A00(r1, r1.A00.getCurrentItem());
        if (num == Constants.ZERO) {
            CloseFriendsListFragment.A00((CloseFriendsListFragment) this.mTabbedFragmentController.A02(C109564nn.SUGGESTIONS));
            CloseFriendsListFragment.A00((CloseFriendsListFragment) this.mTabbedFragmentController.A02(C109564nn.MEMBERS));
        }
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        C109564nn r3 = (C109564nn) obj;
        if (r3 != this.A03) {
            if (isResumed()) {
                C26441Dh.A00(this.A05).A02(getActivity());
            }
            CloseFriendsListFragment.A00((CloseFriendsListFragment) this.mTabbedFragmentController.A01());
            this.A03 = r3;
            CloseFriendsListFragment.A00((CloseFriendsListFragment) this.mTabbedFragmentController.A01());
            if (isResumed()) {
                C26441Dh.A00(this.A05).A06(this);
            }
            A00();
        }
    }

    public final void BR4(AnonymousClass1ZK r7, C155936lE r8, boolean z, CI0 ci0, int i, String str) {
        this.A0G.A03(r8.A02, z, ci0, i, str);
    }

    public final void BR8(C13300iJ r5) {
        SearchController searchController = this.A06;
        if (searchController.A04()) {
            searchController.A01(true, (float) this.mHeader.getHeight());
        }
        AnonymousClass1HD A022 = C18980sj.A00.A00().A02(C52902Qq.A01(this.A05, r5.getId(), "favorites_home_user_row", getModuleName()).A03());
        C52362Om r0 = this.A01;
        r0.A02 = A022;
        r0.A02();
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
        A002.A05 = 0;
        r5.Bo6(false);
        r5.Bo0(false);
        r5.BlI(C0003R.string.close_friends_home_action_bar_title);
        AnonymousClass1EW.A03(getActivity()).A4S(getContext().getResources().getString(C0003R.string.done), new C27553CHu(this));
        r5.BmE(A002.A00());
    }

    public final String getModuleName() {
        if (this.A03 == C109564nn.MEMBERS) {
            return "favorites_home_list";
        }
        return "favorites_home_suggestions";
    }

    public final boolean onBackPressed() {
        Integer num;
        if (this.A0G.A01().A00() || this.A08) {
            C6Y c6y = this.A02;
            if (c6y.A08 == null) {
                if (this.A08) {
                    num = Constants.ONE;
                } else {
                    num = Constants.ZERO;
                }
                c6y.A08 = num;
            }
            c6y.A00();
            AnonymousClass3AQ.A00 = true;
            return false;
        }
        this.A02.A08 = Constants.A0C;
        A01(this);
        return true;
    }

    public final void onSearchTextChanged(String str) {
        this.A0E.Bjv(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int A002;
        ViewGroup viewGroup;
        C109564nn r0;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        this.mMainContainer = view2.findViewById(C0003R.C0005id.main_container);
        this.mHeader = view2.findViewById(C0003R.C0005id.header);
        this.mHeaderDescription = (TextView) view2.findViewById(C0003R.C0005id.close_friends_home_description);
        this.mSearchRow = view2.findViewById(C0003R.C0005id.search_box);
        boolean z = this.mArguments.getBoolean("in_bottom_sheet");
        this.A0F = z;
        View view3 = this.mHeader;
        if (z) {
            A002 = 0;
        } else {
            A002 = C27651Ir.A00(getContext());
        }
        C06220Of.A0Q(view3, A002);
        if (this.A0F) {
            this.mHeaderDescription.setVisibility(8);
        }
        FixedTabBar fixedTabBar = (FixedTabBar) view2.findViewById(C0003R.C0005id.fixed_tabbar_view);
        View inflate = fixedTabBar.A02.inflate(C0003R.layout.members_tab_header, fixedTabBar.A03, false);
        this.mMembersTabView = inflate;
        this.mMembersTabViewLabel = (TextView) inflate.findViewById(C0003R.C0005id.label);
        AnonymousClass7O6 r5 = new AnonymousClass7O6(new ArrayList(this.A0G.A01).size(), this.A0D, this.A0B, this.A0A, (float) this.A0C, 0);
        this.A04 = r5;
        this.mMembersTabViewLabel.setCompoundDrawables((Drawable) null, (Drawable) null, r5, (Drawable) null);
        this.mMembersTabViewLabel.setCompoundDrawablePadding(this.A00);
        this.mMembersTabViewLabel.setTextColor(this.A0D);
        this.mMembersTabView.setOnClickListener(new C27556CHx(this));
        C151836eN r11 = new C151836eN(getContext(), this.A05, CI0.SEARCH, this, (C96584Fr) null);
        this.mSearchAdapter = r11;
        r11.setHasStableIds(true);
        C67712xi A003 = C67782xp.A00(this.A05, new C28351Lj(getContext(), AnonymousClass1L8.A00(this)), AnonymousClass0C5.$const$string(74), new C225389n4(this), (List) null, (IgLiveWithInviteFragment) null, false, new CI3(this));
        this.A0E = A003;
        A003.BiZ(this);
        if (this.A0F) {
            viewGroup = ((C11870fo) getActivity()).AVK();
        } else {
            viewGroup = (ViewGroup) view2.findViewById(C0003R.C0005id.search_container);
        }
        SearchController searchController = new SearchController((Activity) getActivity(), viewGroup, -1, -1, (ListAdapter) this.mSearchAdapter, (AnonymousClass67D) this, false, (AnonymousClass67G) null, (C256219o) null);
        this.A06 = searchController;
        registerLifecycleListener(searchController);
        this.mSearchRow.setOnClickListener(new C27552CHt(this));
        A00();
        AnonymousClass3DK r4 = new AnonymousClass3DK(this, getChildFragmentManager(), (ViewPager) view2.findViewById(C0003R.C0005id.view_pager), fixedTabBar, this.A07);
        this.mTabbedFragmentController = r4;
        if (this.A09) {
            this.A09 = false;
            if (this.A05.A06.A0Y()) {
                r0 = C109564nn.MEMBERS;
            } else {
                r0 = C109564nn.SUGGESTIONS;
            }
            r4.A03(r0);
        }
    }

    public final C27541CHg AVg() {
        return this.A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r4.isEmpty() == false) goto L_0x0043;
     */
    public final void BGZ(C67712xi r10) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (C13300iJ r2 : (List) r10.AUa()) {
            arrayList.add(new C155936lE(r2, this.A0G.A03.contains(r2)));
        }
        if (!r10.ATP().isEmpty() && !r10.AgL()) {
            z = true;
        }
        z = false;
        this.mSearchAdapter.A0L(arrayList, z, r10.AgL(), false, r10.ATX());
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final void onAttachFragment(AnonymousClass1HD r2) {
        super.onAttachFragment(r2);
        if (r2 instanceof CloseFriendsListFragment) {
            CloseFriendsListFragment closeFriendsListFragment = (CloseFriendsListFragment) r2;
            closeFriendsListFragment.A01 = this.A0G;
            C151836eN r0 = closeFriendsListFragment.A02;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            }
            closeFriendsListFragment.A00 = this.A02;
        }
    }

    public final void onCreate(Bundle bundle) {
        C109564nn r0;
        int A022 = AnonymousClass0Z0.A02(-615565842);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A05 = A062;
        this.A02 = new C6Y(A062, new CI8(this));
        this.A01 = new C52362Om(getActivity(), this.A05);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.containsKey("entry_point")) {
            this.A02.A06 = (AnonymousClass54G) this.mArguments.getSerializable("entry_point");
        }
        this.A00 = Math.round(C06220Of.A03(getContext(), 8));
        this.A0B = Math.round(C06220Of.A03(getContext(), 4));
        this.A0C = getContext().getResources().getDimensionPixelSize(C0003R.dimen.top_tabbar_text_size_normal);
        this.A0A = C06220Of.A03(getContext(), 4);
        this.A0D = new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{C019000b.A00(getContext(), C0003R.color.igds_primary_text), C019000b.A00(getContext(), C0003R.color.igds_secondary_text)});
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        arrayList.add(C109564nn.MEMBERS);
        this.A07.add(C109564nn.SUGGESTIONS);
        if (this.mArguments.containsKey("initial_tab")) {
            r0 = (C109564nn) this.mArguments.getSerializable("initial_tab");
        } else {
            r0 = C109564nn.MEMBERS;
        }
        this.A03 = r0;
        AnonymousClass0Z0.A09(1139039980, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1625573782);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_close_friends_home, viewGroup, false);
        AnonymousClass0Z0.A09(2101531515, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(928136442);
        super.onDestroyView();
        CloseFriendsHomeFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(1257064421, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(929614566);
        super.onPause();
        this.A0G.A02(this);
        AnonymousClass0Z0.A09(794863815, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1801419261);
        super.onResume();
        this.A0G.A02.add(new WeakReference(this));
        this.mTabbedFragmentController.A03(this.A03);
        AnonymousClass0Z0.A09(1495315898, A022);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
