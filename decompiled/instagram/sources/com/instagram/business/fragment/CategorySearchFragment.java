package com.instagram.business.fragment;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.p009ui.widget.searchedittext.SearchEditText;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0O3;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass25V;
import p000X.AnonymousClass267;
import p000X.AnonymousClass2MX;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass51x;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass612;
import p000X.AnonymousClass61G;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass626;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass62I;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.AnonymousClass640;
import p000X.AnonymousClass64R;
import p000X.AnonymousClass64V;
import p000X.AnonymousClass65C;
import p000X.AnonymousClass65G;
import p000X.AnonymousClass65I;
import p000X.AnonymousClass65Q;
import p000X.AnonymousClass65R;
import p000X.AnonymousClass65S;
import p000X.AnonymousClass65Z;
import p000X.AnonymousClass660;
import p000X.AnonymousClass672;
import p000X.C019000b;
import p000X.C05000Hl;
import p000X.C05210Iq;
import p000X.C05680Ln;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C12800hP;
import p000X.C128275eQ;
import p000X.C13300iJ;
import p000X.C134405oU;
import p000X.C135395qH;
import p000X.C135765qs;
import p000X.C135845r1;
import p000X.C136395rv;
import p000X.C137335tT;
import p000X.C1409760w;
import p000X.C14100jl;
import p000X.C1412261x;
import p000X.C1415463i;
import p000X.C1415863p;
import p000X.C1416063r;
import p000X.C1416864a;
import p000X.C1417564h;
import p000X.C1418064m;
import p000X.C1418164n;
import p000X.C1418264o;
import p000X.C1418864u;
import p000X.C1419665d;
import p000X.C1419965g;
import p000X.C1420365k;
import p000X.C1423966x;
import p000X.C15300mf;
import p000X.C17850qu;
import p000X.C26771Ff;
import p000X.C28351Lj;
import p000X.C30248DXi;

public class CategorySearchFragment extends AnonymousClass2NN implements AnonymousClass1HK, C1420365k, AnonymousClass1HM, C137335tT, AnonymousClass63X, AnonymousClass672 {
    public int A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public AnonymousClass64R A04;
    public AnonymousClass61R A05;
    public AnonymousClass2UH A06;
    public AnonymousClass65G A07;
    public C1416063r A08;
    public AnonymousClass63U A09;
    public C06590Pq A0A;
    public BusinessInfo A0B;
    public RegFlowExtras A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N;
    public View A0O;
    public C128275eQ A0P;
    public C1419665d A0Q;
    public boolean A0R;
    public final Handler A0S = new C1415463i(this, Looper.getMainLooper());
    public ActionButton mActionButton;
    public BusinessNavBar mBusinessNavBar;
    public View mCategegorySelectedIcon;
    public IgSwitch mCategoryToggle;
    public View mCategoryToggleContainer;
    public ViewGroup mContainer;
    public InlineSearchBox mNewSearchBar;
    public SearchEditText mSearchEditText;
    public StepperHeader mStepperHeader;

    public final void B4R() {
    }

    public final void BJB() {
        this.A0F = false;
    }

    public final void BLe() {
    }

    public final String getModuleName() {
        return "choose_category_with_search";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static C1412261x A00(CategorySearchFragment categorySearchFragment) {
        String str;
        if (categorySearchFragment.A0R) {
            str = "change_category";
        } else {
            str = "choose_category";
        }
        C1412261x r1 = new C1412261x(str);
        r1.A01 = categorySearchFragment.A0D;
        r1.A04 = C14100jl.A01(categorySearchFragment.A0A);
        return r1;
    }

    private void A01() {
        String str;
        RegFlowExtras regFlowExtras;
        if (this.A03.isEmpty()) {
            this.A0O.setVisibility(0);
            if (this.A0H) {
                AnonymousClass0C1 A022 = C05210Iq.A02(this.A0A);
                if (((Boolean) C134405oU.A00(new C05000Hl("is_enabled", AnonymousClass0L7.SMB_CREATOR_SUGGESTED_AND_ALL_CATEGORIES_LAUNCHER, false, (String[]) null, (AnonymousClass04H) null), this.A0A, AnonymousClass62H.A0D(this.A06))).booleanValue()) {
                    C1419665d r6 = this.A0Q;
                    Context context = getContext();
                    AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
                    String A0B2 = A022.A06.A0B();
                    AnonymousClass65I r0 = new AnonymousClass65I(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\",\"%s\":\"%s\"}", "0", AnonymousClass626.A06, RealtimeSubscription.GRAPHQL_MQTT_VERSION, C15300mf.A00()));
                    AnonymousClass25V A003 = AnonymousClass25V.A00(A022);
                    A003.A03(r0);
                    C17850qu A023 = A003.A02(Constants.ONE);
                    A023.A00 = new C1419965g(r6, A0B2, context);
                    C28351Lj.A00(context, A002, A023);
                    return;
                }
                this.A0Q.A02(AnonymousClass626.A06.toString(), C1418064m.CATEGORY, this, getContext(), C12800hP.A02(A022), A022);
                return;
            }
            C1419665d r8 = this.A0Q;
            C06590Pq r1 = this.A0A;
            if (r1.AgN()) {
                C13300iJ A042 = C05210Iq.A04(r1);
                str = A042.AMN();
                if (str == null) {
                    str = A042.AZn();
                }
            } else {
                str = null;
            }
            if (str == null && (regFlowExtras = this.A0C) != null) {
                str = regFlowExtras.A0I;
            }
            Context context2 = getContext();
            AnonymousClass1L8 A004 = AnonymousClass1L8.A00(this);
            String A052 = AnonymousClass62H.A05(this.A0A, this.A06);
            C06590Pq r14 = this.A0A;
            AnonymousClass62H.A06(r14, this.A06);
            r8.A01(str, 10, context2, A004, A052, r14);
            return;
        }
        this.A0J = false;
        A03(this.A03, this.A01);
    }

    private void A02() {
        String str;
        String str2;
        AnonymousClass65G r0 = this.A07;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A00;
        }
        if (r0 == null) {
            str2 = null;
        } else {
            str2 = r0.A01;
        }
        AnonymousClass612 r1 = new AnonymousClass612(this.A0B);
        r1.A07 = str;
        r1.A0F = str2;
        BusinessInfo A002 = r1.A00();
        this.A0B = A002;
        AnonymousClass2UH r02 = this.A06;
        if (r02 != null) {
            r02.AJp().A01(A002);
        }
    }

    private void A03(ImmutableList immutableList, ImmutableList immutableList2) {
        AnonymousClass64R r3 = this.A04;
        r3.clear();
        if (immutableList != null && !immutableList.isEmpty()) {
            r3.addModel(r3.A00.getString(C0003R.string.suggested_categories), r3.A01);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                AnonymousClass65G r1 = (AnonymousClass65G) it.next();
                if (!TextUtils.isEmpty(r1.A00) && !TextUtils.isEmpty(r1.A01)) {
                    r3.addModel(r1, r3.A01);
                }
            }
            if (immutableList2 != null && !immutableList2.isEmpty()) {
                r3.addModel(2, r3.A01);
            }
        }
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            r3.addModel(r3.A00.getString(C0003R.string.all_categories), r3.A01);
            Iterator it2 = immutableList2.iterator();
            while (it2.hasNext()) {
                AnonymousClass65G r12 = (AnonymousClass65G) it2.next();
                if (!TextUtils.isEmpty(r12.A00) && !TextUtils.isEmpty(r12.A01)) {
                    r3.addModel(r12, r3.A01);
                }
            }
        }
        AnonymousClass0Z1.A00(r3, 1246774284);
    }

    public static void A04(CategorySearchFragment categorySearchFragment) {
        String str;
        if (categorySearchFragment.A05 != null) {
            C1412261x A002 = A00(categorySearchFragment);
            AnonymousClass65G r0 = categorySearchFragment.A07;
            if (r0 == null) {
                str = null;
            } else {
                str = r0.A00;
            }
            if (str != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("category_id", str);
                A002.A08 = hashMap;
            }
            categorySearchFragment.A05.AlP(A002.A00());
        }
    }

    public static void A05(CategorySearchFragment categorySearchFragment) {
        SearchEditText searchEditText;
        InlineSearchBox inlineSearchBox;
        boolean z = categorySearchFragment.A0L;
        if (z && (inlineSearchBox = categorySearchFragment.mNewSearchBar) != null && !categorySearchFragment.A0K) {
            inlineSearchBox.A04();
        } else if (!z && (searchEditText = categorySearchFragment.mSearchEditText) != null) {
            searchEditText.A03();
        }
    }

    public static void A07(CategorySearchFragment categorySearchFragment, int i, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("data_count", String.valueOf(i));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str2, str3);
        AnonymousClass61R r1 = categorySearchFragment.A05;
        if (r1 != null) {
            C1412261x A002 = A00(categorySearchFragment);
            A002.A00 = str;
            A002.A08 = hashMap2;
            A002.A06 = hashMap;
            r1.AlN(A002.A00());
        }
    }

    public static void A09(CategorySearchFragment categorySearchFragment, String str) {
        AnonymousClass65G r0 = categorySearchFragment.A07;
        if (r0 != null) {
            if (!str.equals(r0.A01)) {
                categorySearchFragment.A07 = null;
                A06(categorySearchFragment);
            } else {
                return;
            }
        }
        categorySearchFragment.A0F(true);
        categorySearchFragment.A0E = str;
        A08(categorySearchFragment, str);
    }

    public static void A0A(CategorySearchFragment categorySearchFragment, String str, ImmutableList immutableList) {
        if (str != null && str.equals(categorySearchFragment.A0E)) {
            if (!categorySearchFragment.A0K || categorySearchFragment.A08.A02.A04()) {
                categorySearchFragment.A02 = immutableList;
                categorySearchFragment.A0J = true;
                AnonymousClass64R r3 = categorySearchFragment.A04;
                r3.clear();
                if (immutableList == null || immutableList.isEmpty()) {
                    r3.addModel(r3.A00.getString(C0003R.string.no_results_found), r3.A02);
                } else {
                    Iterator it = immutableList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass65G r1 = (AnonymousClass65G) it.next();
                        if (!TextUtils.isEmpty(r1.A00) && !TextUtils.isEmpty(r1.A01)) {
                            r3.addModel(r1, r3.A01);
                        }
                    }
                }
                AnonymousClass0Z1.A00(r3, 1173353327);
            }
        }
    }

    public static void A0B(CategorySearchFragment categorySearchFragment, String str, String str2) {
        if (categorySearchFragment.A05 != null) {
            C1412261x A002 = A00(categorySearchFragment);
            A002.A00 = str;
            if (str2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("category_id", str2);
                A002.A08 = hashMap;
            }
            categorySearchFragment.A05.Ano(A002.A00());
        }
    }

    public static void A0C(CategorySearchFragment categorySearchFragment, String str, String str2, String str3, String str4) {
        if (categorySearchFragment.A05 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            AnonymousClass61R r1 = categorySearchFragment.A05;
            C1412261x A002 = A00(categorySearchFragment);
            A002.A00 = str;
            A002.A08 = hashMap;
            A002.A03 = str4;
            r1.AlO(A002.A00());
        }
    }

    public static void A0D(CategorySearchFragment categorySearchFragment, boolean z) {
        AnonymousClass612 r1 = new AnonymousClass612(categorySearchFragment.A0B);
        r1.A0I = z;
        categorySearchFragment.A0B = r1.A00();
        if (categorySearchFragment.A05 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("switch_display_category", String.valueOf(z));
            AnonymousClass61R r12 = categorySearchFragment.A05;
            C1412261x A002 = A00(categorySearchFragment);
            A002.A00 = "switch_display_category";
            A002.A08 = hashMap;
            r12.Ano(A002.A00());
        }
    }

    public static void A0E(CategorySearchFragment categorySearchFragment, boolean z) {
        SearchEditText searchEditText;
        if (z) {
            if (!categorySearchFragment.A0L && (searchEditText = categorySearchFragment.mSearchEditText) != null) {
                searchEditText.setSelection(searchEditText.getText().length());
            }
            A0B(categorySearchFragment, "category_search_box", (String) null);
        } else {
            A05(categorySearchFragment);
        }
        categorySearchFragment.A0F(Boolean.valueOf(z));
    }

    private void A0F(Boolean bool) {
        InlineSearchBox inlineSearchBox;
        boolean z = this.A0L;
        if (z && (inlineSearchBox = this.mNewSearchBar) != null) {
            String str = "";
            if (!z) {
                SearchEditText searchEditText = this.mSearchEditText;
                if (searchEditText != null) {
                    str = searchEditText.getSearchString();
                }
            } else if (inlineSearchBox != null) {
                str = inlineSearchBox.getSearchString();
            }
            if (TextUtils.isEmpty(str)) {
                this.mNewSearchBar.setVisibilityOfCustomActionButton(false);
            } else if (this.A07 == null || bool == null || bool.booleanValue()) {
                this.mNewSearchBar.setVisibilityOfCustomActionButton(false);
                this.mNewSearchBar.setVisibilityOfClearButton(true);
                return;
            } else {
                this.mNewSearchBar.setVisibilityOfCustomActionButton(true);
            }
            this.mNewSearchBar.setVisibilityOfClearButton(false);
        }
    }

    public final void A0G(String str) {
        if (this.A00 == 0) {
            this.A00 = this.mContainer.getPaddingTop();
        }
        this.mContainer.setPadding(0, 0, 0, 0);
        if (TextUtils.isEmpty(str)) {
            A01();
        }
    }

    public final boolean A0H() {
        if (!this.A0K || !this.A08.A02.A04()) {
            return false;
        }
        return true;
    }

    public final void AC1() {
        if (this.mBusinessNavBar.getVisibility() == 0) {
            this.mBusinessNavBar.setPrimaryButtonEnabled(false);
            return;
        }
        ActionButton actionButton = this.mActionButton;
        if (actionButton != null) {
            actionButton.setEnabled(false);
        }
    }

    public final void ACw() {
        if (this.mBusinessNavBar.getVisibility() == 0) {
            this.mBusinessNavBar.setPrimaryButtonEnabled(true);
            return;
        }
        ActionButton actionButton = this.mActionButton;
        if (actionButton != null) {
            actionButton.setEnabled(true);
        }
    }

    public final void B4P(String str, C1418064m r5, String str2) {
        A0C(this, "searched_category", "category_search_keyword", this.A0E, str2);
    }

    public final void B4Q() {
        this.A0O.setVisibility(8);
    }

    public final void B4S(AnonymousClass65Z r6, C1418064m r7, String str) {
        int size;
        List list;
        AnonymousClass267 r4 = new AnonymousClass267();
        if (!(r6 == null || (list = r6.A00) == null || list.isEmpty())) {
            for (AnonymousClass660 r0 : r6.A00) {
                String str2 = r0.A00;
                String str3 = r0.A01;
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    r4.A08(new AnonymousClass65G(str2, str3));
                }
            }
        }
        this.A03 = r4.A06();
        this.A01 = ImmutableList.A01();
        if (A0I()) {
            this.A0J = false;
            A03(this.A03, this.A01);
        }
        List list2 = r6.A00;
        if (list2 == null) {
            size = 0;
        } else {
            size = list2.size();
        }
        A07(this, size, "searched_category", "category_search_keyword", this.A0E);
    }

    public final void B4X(String str, String str2) {
        this.A0O.setVisibility(8);
        if (A0I()) {
            AnonymousClass5F9.A02(getContext(), str2);
            if (this.A03.isEmpty()) {
                AnonymousClass64R r1 = this.A04;
                r1.clear();
                AnonymousClass0Z1.A00(r1, -202084427);
            } else {
                this.A0J = false;
                A03(this.A03, this.A01);
            }
            A0C(this, "suggested_category", "page_name", str, str2);
        }
    }

    public final void B4Y(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        this.A03 = immutableList;
        if (immutableList2 != null) {
            this.A01 = immutableList2;
        }
        this.A0O.setVisibility(8);
        if (A0I()) {
            this.A0J = false;
            A03(this.A03, this.A01);
        }
        A07(this, immutableList.size(), "suggested_category", "page_name", str);
    }

    public final void BFZ() {
        String str;
        String str2;
        boolean z;
        AnonymousClass2UH r0;
        String str3;
        AnonymousClass65G r02 = this.A07;
        if (r02 == null) {
            str = null;
        } else {
            str = r02.A00;
        }
        A0B(this, "continue", str);
        A02();
        if (!this.A0G) {
            z = false;
        } else {
            C06590Pq r8 = this.A0A;
            RegFlowExtras regFlowExtras = this.A0C;
            AnonymousClass2UH r9 = this.A06;
            C135845r1 r6 = new C135845r1(this, r8, r9, regFlowExtras, this.A0D);
            if (!C135395qH.A00(r8, this, this, regFlowExtras.A0I, regFlowExtras.A08, r6) && r9 != null) {
                r9.Aob(regFlowExtras.A02(), ConversionStep.EDIT_USERNAME, false);
            }
            C06590Pq r62 = this.A0A;
            String str4 = this.A0D;
            C06270Ok A002 = C06270Ok.A00();
            AnonymousClass65G r03 = this.A07;
            if (r03 == null) {
                str2 = null;
            } else {
                str2 = r03.A00;
            }
            A002.A09("category_id", str2);
            C135765qs.A03(r62, "choose_category", str4, A002, C14100jl.A01(this.A0A));
            z = true;
        }
        if (!z && (r0 = this.A06) != null) {
            if (((BusinessConversionActivity) r0).A0a()) {
                ((BusinessConversionActivity) this.A06).A0Z(this, getContext(), "choose_category", this);
                return;
            }
            AnonymousClass2UH r3 = this.A06;
            AnonymousClass65G r04 = this.A07;
            if (r04 == null) {
                str3 = null;
            } else {
                str3 = r04.A00;
            }
            Bundle bundle = new Bundle();
            bundle.putString("subcategory_id", str3);
            r3.Aoa(bundle);
            A04(this);
        }
    }

    public final void BJH() {
        this.A09.A01();
        this.A0F = true;
        AnonymousClass0O3.A00().A01(new AnonymousClass65C(this), 8000);
    }

    public final void BJO() {
        AnonymousClass0ZA.A0E(this.A0S, new AnonymousClass640(this), 1937005693);
    }

    public final void BPx(C1423966x r2) {
        AnonymousClass2UH r0 = this.A06;
        if (r0 != null) {
            r0.AJp().A03 = r2;
        }
        BJO();
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        if (this.A0R) {
            ActionButton BmG = r4.BmG(C0003R.string.change_category, C0003R.C0004drawable.instagram_arrow_back_24, new C1415863p(this));
            this.mActionButton = BmG;
            BmG.setEnabled(false);
            r4.setIsLoading(this.A0I);
            if (!A0H()) {
                A06(this);
                return;
            }
            return;
        }
        r4.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new AnonymousClass51x(this));
    }

    public final boolean onBackPressed() {
        SearchEditText searchEditText;
        InlineSearchBox inlineSearchBox;
        if (this.A0F) {
            return true;
        }
        this.A07 = null;
        ImmutableList A012 = ImmutableList.A01();
        this.A03 = A012;
        this.A01 = A012;
        boolean z = this.A0L;
        if (z && (inlineSearchBox = this.mNewSearchBar) != null) {
            inlineSearchBox.A07("");
        } else if (!z && (searchEditText = this.mSearchEditText) != null) {
            searchEditText.setText("");
        }
        A0B(this, "clear_category_search_box", (String) null);
        this.A07 = null;
        A06(this);
        if (!this.A0M) {
            if (this.A0G) {
                C06590Pq r3 = this.A0A;
                C135765qs.A02(r3, "choose_category", this.A0D, (C06270Ok) null, C14100jl.A01(r3));
            } else {
                AnonymousClass61R r1 = this.A05;
                if (r1 != null) {
                    r1.Ajn(A00(this).A00());
                }
            }
        }
        if (!this.A0R) {
            A02();
            AnonymousClass2UH r0 = this.A06;
            if (r0 != null) {
                r0.Be6();
                return true;
            }
        }
        return false;
    }

    public CategorySearchFragment() {
        ImmutableList A012 = ImmutableList.A01();
        this.A03 = A012;
        this.A02 = A012;
        this.A01 = A012;
        this.A0F = false;
        this.A00 = 0;
    }

    public static void A06(CategorySearchFragment categorySearchFragment) {
        View view;
        InlineSearchBox inlineSearchBox;
        if (categorySearchFragment.isResumed()) {
            AnonymousClass65G r3 = categorySearchFragment.A07;
            if (r3 != null) {
                boolean z = categorySearchFragment.A0L;
                if (z && (inlineSearchBox = categorySearchFragment.mNewSearchBar) != null) {
                    inlineSearchBox.A07(r3.A01);
                    categorySearchFragment.A0F(false);
                    if (!categorySearchFragment.A0K) {
                        categorySearchFragment.mNewSearchBar.clearFocus();
                    }
                } else if (!(z || (view = categorySearchFragment.mCategegorySelectedIcon) == null || categorySearchFragment.mSearchEditText == null)) {
                    view.setVisibility(0);
                    categorySearchFragment.mSearchEditText.setText(categorySearchFragment.A07.A01);
                    categorySearchFragment.mSearchEditText.setClearButtonEnabled(true);
                    categorySearchFragment.mSearchEditText.clearFocus();
                }
                View view2 = categorySearchFragment.mCategoryToggleContainer;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                AnonymousClass64R r1 = categorySearchFragment.A04;
                r1.clear();
                AnonymousClass0Z1.A00(r1, -202084427);
                categorySearchFragment.ACw();
                return;
            }
            if (categorySearchFragment.A0L) {
                categorySearchFragment.A0F((Boolean) null);
            } else {
                View view3 = categorySearchFragment.mCategegorySelectedIcon;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            View view4 = categorySearchFragment.mCategoryToggleContainer;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            categorySearchFragment.A03(categorySearchFragment.A03, categorySearchFragment.A01);
            categorySearchFragment.AC1();
        }
    }

    public static void A08(CategorySearchFragment categorySearchFragment, String str) {
        if (TextUtils.isEmpty(str)) {
            categorySearchFragment.A01();
            return;
        }
        if (categorySearchFragment.A0S.hasMessages(1)) {
            AnonymousClass0ZA.A02(categorySearchFragment.A0S, 1);
        }
        AnonymousClass0ZA.A06(categorySearchFragment.A0S, categorySearchFragment.A0S.obtainMessage(1, str), 300);
    }

    public final boolean A0I() {
        if (A0H() && TextUtils.isEmpty(this.A08.A02.mViewHolder.A0B.getSearchString())) {
            return true;
        }
        if (A0H()) {
            return false;
        }
        String str = "";
        if (this.A0L) {
            InlineSearchBox inlineSearchBox = this.mNewSearchBar;
            if (inlineSearchBox != null) {
                str = inlineSearchBox.getSearchString();
            }
        } else {
            SearchEditText searchEditText = this.mSearchEditText;
            if (searchEditText != null) {
                str = searchEditText.getSearchString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    public final void BJ3(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            AnonymousClass5F9.A02(context, str);
        }
        this.A09.A00();
    }

    public final void BPw() {
        BJO();
    }

    public final C06590Pq getSession() {
        return this.A0A;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A06 = AnonymousClass62H.A01(getActivity());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0094, code lost:
        if (p000X.AnonymousClass62H.A0F(r7.A06) != false) goto L_0x0096;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        AnonymousClass62I AJp;
        BusinessInfo businessInfo;
        int A022 = AnonymousClass0Z0.A02(-1520925387);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A0A = AnonymousClass0J1.A00(bundle2);
        this.A0D = this.mArguments.getString("entry_point");
        BusinessInfo A002 = new AnonymousClass612(AnonymousClass62H.A02(this.mArguments, this.A06)).A00();
        this.A0B = A002;
        AnonymousClass2UH r0 = this.A06;
        if (!(r0 == null || (businessInfo = AJp.A07) == null)) {
            AnonymousClass612 r1 = new AnonymousClass612(A002);
            r1.A07 = businessInfo.A07;
            r1.A08 = businessInfo.A08;
            r1.A0F = businessInfo.A0F;
            r1.A0H = true;
            BusinessInfo A003 = r1.A00();
            this.A0B = A003;
            (AJp = r0.AJp()).A01(A003);
        }
        C128275eQ r12 = new C128275eQ(getActivity());
        this.A0P = r12;
        registerLifecycleListener(r12);
        AnonymousClass62H.A04(this.A06);
        this.A0Q = new C1419665d(this);
        boolean z2 = true;
        boolean z3 = false;
        if (bundle2.getString("edit_profile_entry") != null) {
            z3 = true;
        }
        this.A0R = z3;
        if (!TextUtils.equals(bundle2.getString("business_signup"), "business_signup_flow")) {
            z = false;
        }
        z = true;
        this.A0G = z;
        if (z) {
            RegFlowExtras A032 = AnonymousClass62H.A03(this.mArguments, this.A06);
            this.A0C = A032;
            AnonymousClass0a4.A06(A032);
        }
        AnonymousClass2UH r13 = this.A06;
        if ((!AnonymousClass62H.A0D(r13) || !this.A0A.AgN()) && (r13 != null || !AnonymousClass2MX.A01(C05210Iq.A04(this.A0A)))) {
            z2 = false;
        }
        this.A0H = z2;
        Integer num = null;
        if (this.A0R) {
            str = null;
            num = Constants.A0u;
        } else {
            AnonymousClass2UH r02 = this.A06;
            if (r02 != null) {
                num = r02.ALv();
                str = r02.Aad();
            } else {
                str = null;
            }
        }
        if (num != null) {
            this.A05 = C30248DXi.A00(this.A0A, this, num, str);
        }
        HashMap hashMap = null;
        if (this.A0G) {
            C06590Pq r5 = this.A0A;
            C135765qs.A04(r5, "choose_category", this.A0D, (C06270Ok) null, C14100jl.A01(r5));
        } else if (this.A05 != null) {
            BusinessInfo businessInfo2 = this.A0B;
            if (businessInfo2 != null && businessInfo2.A0H) {
                String str2 = businessInfo2.A07;
                String str3 = businessInfo2.A08;
                hashMap = new HashMap();
                hashMap.put("prefilled_category_id", str2);
                hashMap.put("prefilled_category_name", str3);
            }
            C1412261x A004 = A00(this);
            A004.A07 = AnonymousClass61G.A00(this.A0B);
            A004.A08 = hashMap;
            this.A05.AnW(A004.A00());
        }
        AnonymousClass0Z0.A09(1431519609, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0070, code lost:
        if (r4 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e9, code lost:
        if (r8.ALv() != p000X.Constants.A0Y) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        if (((java.lang.Boolean) r4).booleanValue() != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0255, code lost:
        if (r8.ALv() != p000X.Constants.A0C) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0259, code lost:
        if (r4 != false) goto L_0x025b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x020c  */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3;
        BusinessInfo businessInfo;
        boolean z;
        boolean z2;
        C05000Hl r13;
        Object A002;
        boolean z3;
        C06590Pq r4;
        int A022 = AnonymousClass0Z0.A02(900866477);
        ViewGroup viewGroup2 = viewGroup;
        View inflate = layoutInflater.inflate(C0003R.layout.category_search_fragment, viewGroup2, false);
        this.mContainer = viewGroup2;
        if (AnonymousClass62H.A0D(this.A06) || C134405oU.A04(this.A0A, false)) {
            i = C0003R.string.select_category;
            i2 = C0003R.string.category_search_description_flexible_hia;
        } else {
            boolean z4 = this.A0R;
            i = C0003R.string.choose_category;
            i2 = C0003R.string.select_category_description;
            if (z4) {
                i = C0003R.string.change_category;
            }
        }
        ((TextView) inflate.findViewById(C0003R.C0005id.title)).setText(i);
        ((TextView) inflate.findViewById(C0003R.C0005id.subtitle)).setText(i2);
        this.A0O = inflate.findViewById(C0003R.C0005id.suggested_category_progress_spinner);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        if (this.A0H) {
            boolean A003 = C136395rv.A00(this.A0A, true);
            i3 = C0003R.string.done;
        }
        i3 = C0003R.string.next;
        AnonymousClass63U r7 = new AnonymousClass63U(this, businessNavBar, i3, -1);
        this.A09 = r7;
        registerLifecycleListener(r7);
        if (this.A0R) {
            this.mBusinessNavBar.setVisibility(8);
        }
        if (C1409760w.A00(this.A06)) {
            StepperHeader stepperHeader = (StepperHeader) inflate.findViewById(C0003R.C0005id.stepper_header);
            this.mStepperHeader = stepperHeader;
            stepperHeader.setVisibility(0);
            this.mStepperHeader.A03(this.A06.ABJ(), this.A06.BrZ());
        }
        AnonymousClass2UH r5 = this.A06;
        if (r5 != null) {
            businessInfo = r5.AJp().A06;
        } else {
            businessInfo = this.A0B;
        }
        this.A0B = businessInfo;
        C06590Pq r6 = this.A0A;
        boolean A0C2 = AnonymousClass62H.A0C(r5);
        AnonymousClass0L7 r11 = AnonymousClass0L7.BIZ_BUSINESS_CONVERSION_PROMINENT_SEARCH_BAR;
        boolean booleanValue = ((Boolean) C134405oU.A00(new C05000Hl("is_enabled", r11, false, (String[]) null, (AnonymousClass04H) null), r6, A0C2)).booleanValue();
        this.A0L = booleanValue;
        AnonymousClass2UH r8 = this.A06;
        if (r8 != null) {
            z = true;
        }
        z = false;
        boolean z5 = true;
        if (z) {
            if (booleanValue) {
                A002 = C134405oU.A00(new C05000Hl("is_enabled", AnonymousClass0L7.SMB_GROWTH_ANDROID_SWITCH_TO_CREATOR_MOVE_SEARCH_BAR_LAUNCHER, (Object) null, (String[]) null, (AnonymousClass04H) null), this.A0A, true);
            }
            z5 = false;
            this.A0K = z5;
            this.mNewSearchBar = (InlineSearchBox) inflate.findViewById(C0003R.C0005id.search_box);
            this.mSearchEditText = (SearchEditText) inflate.findViewById(C0003R.C0005id.search_edit_text);
            this.mCategegorySelectedIcon = inflate.findViewById(C0003R.C0005id.check_icon);
            if (!this.A0L) {
                View findViewById = inflate.findViewById(C0003R.C0005id.search);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = inflate.findViewById(C0003R.C0005id.divider);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                InlineSearchBox inlineSearchBox = this.mNewSearchBar;
                if (inlineSearchBox != null) {
                    inlineSearchBox.A06(C0003R.C0004drawable.instagram_check_outline_24, C0003R.string.category_selected_checkmark_description, (View.OnClickListener) null);
                    InlineSearchBox inlineSearchBox2 = this.mNewSearchBar;
                    inlineSearchBox2.A05.A04(C019000b.A00(getContext(), C0003R.color.igds_success), C019000b.A00(getContext(), C0003R.color.igds_success));
                    if (((Boolean) C134405oU.A00(new C05000Hl("is_all_categories_hint_enabled", r11, false, (String[]) null, (AnonymousClass04H) null), this.A0A, AnonymousClass62H.A0C(this.A06))).booleanValue()) {
                        this.mNewSearchBar.setHint((int) C0003R.string.search_categories);
                    }
                }
            } else {
                InlineSearchBox inlineSearchBox3 = this.mNewSearchBar;
                if (inlineSearchBox3 != null) {
                    inlineSearchBox3.setVisibility(8);
                }
                SearchEditText searchEditText = this.mSearchEditText;
                if (searchEditText != null) {
                    searchEditText.setHint(C0003R.string.search_category);
                    ColorFilter A004 = C26771Ff.A00(AnonymousClass1BA.A01(getContext(), C0003R.attr.glyphColorSecondary));
                    this.mSearchEditText.setClearButtonColorFilter(A004);
                    this.mSearchEditText.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A004);
                }
            }
            if (!this.A0K) {
                this.A0N = getActivity().getWindow().getAttributes().softInputMode;
                getActivity().getWindow().setSoftInputMode(32);
            }
            if (this.A0H && C136395rv.A00(this.A0A, true)) {
                boolean z6 = this.A0B.A0I;
                r4 = this.A0A;
                if (r4.AgN()) {
                    z6 = C05210Iq.A02(r4).A06.A0V();
                }
                View findViewById3 = inflate.findViewById(C0003R.C0005id.row_category_toggle);
                this.mCategoryToggleContainer = findViewById3;
                ((TextView) findViewById3.findViewById(C0003R.C0005id.title)).setText(C0003R.string.profile_display_option_category);
                IgSwitch igSwitch = (IgSwitch) this.mCategoryToggleContainer.findViewById(C0003R.C0005id.toggle);
                this.mCategoryToggle = igSwitch;
                igSwitch.setChecked(z6);
            }
            AnonymousClass0Z0.A09(-1504032663, A022);
            return inflate;
        }
        if (booleanValue) {
            C06590Pq r72 = this.A0A;
            if (!AnonymousClass62H.A0E(r8)) {
                if (r8 != null) {
                    z3 = true;
                }
                z3 = false;
                z2 = false;
            }
            z2 = true;
            if (this.A0H) {
                r13 = C05680Ln.AVp;
            } else {
                r13 = new C05000Hl("is_enabled", AnonymousClass0L7.SMB_GROWTH_ANDROID_BUSINESS_MOVE_SEARCH_BAR_LAUNCHER, (Object) null, (String[]) null, (AnonymousClass04H) null);
            }
            A002 = C134405oU.A00(r13, r72, z2);
        }
        z5 = false;
        this.A0K = z5;
        this.mNewSearchBar = (InlineSearchBox) inflate.findViewById(C0003R.C0005id.search_box);
        this.mSearchEditText = (SearchEditText) inflate.findViewById(C0003R.C0005id.search_edit_text);
        this.mCategegorySelectedIcon = inflate.findViewById(C0003R.C0005id.check_icon);
        if (!this.A0L) {
        }
        if (!this.A0K) {
        }
        boolean z62 = this.A0B.A0I;
        r4 = this.A0A;
        if (r4.AgN()) {
        }
        View findViewById32 = inflate.findViewById(C0003R.C0005id.row_category_toggle);
        this.mCategoryToggleContainer = findViewById32;
        ((TextView) findViewById32.findViewById(C0003R.C0005id.title)).setText(C0003R.string.profile_display_option_category);
        IgSwitch igSwitch2 = (IgSwitch) this.mCategoryToggleContainer.findViewById(C0003R.C0005id.toggle);
        this.mCategoryToggle = igSwitch2;
        igSwitch2.setChecked(z62);
        AnonymousClass0Z0.A09(-1504032663, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-124459057);
        this.A0P.Azd();
        unregisterLifecycleListener(this.A0P);
        super.onDestroy();
        AnonymousClass0Z0.A09(-250357024, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1373520753);
        unregisterLifecycleListener(this.A09);
        this.A0O = null;
        this.A09 = null;
        ImmutableList A012 = ImmutableList.A01();
        this.A03 = A012;
        this.A01 = A012;
        if (!this.A0K) {
            getActivity().getWindow().setSoftInputMode(this.A0N);
        }
        super.onDestroyView();
        AnonymousClass0Z0.A09(-1438308237, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0Z0.A02(188475854);
        if (this.A0S.hasMessages(1)) {
            AnonymousClass0ZA.A02(this.A0S, 1);
        }
        super.onDetach();
        AnonymousClass0Z0.A09(134978222, A022);
    }

    public final void onResume() {
        int i;
        int A022 = AnonymousClass0Z0.A02(-667455641);
        super.onResume();
        if (A0H()) {
            i = 865937908;
        } else {
            A06(this);
            if (this.A07 != null) {
                i = -1702985895;
            } else {
                if (A0I()) {
                    A01();
                } else {
                    String str = "";
                    if (this.A0L) {
                        InlineSearchBox inlineSearchBox = this.mNewSearchBar;
                        if (inlineSearchBox != null) {
                            str = inlineSearchBox.getSearchString();
                        }
                    } else {
                        SearchEditText searchEditText = this.mSearchEditText;
                        if (searchEditText != null) {
                            str = searchEditText.getSearchString();
                        }
                    }
                    A08(this, str);
                }
                i = -1631083842;
            }
        }
        AnonymousClass0Z0.A09(i, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        SearchEditText searchEditText;
        InlineSearchBox inlineSearchBox;
        IgSwitch igSwitch;
        BusinessInfo businessInfo;
        super.onViewCreated(view, bundle);
        this.A04 = new AnonymousClass64R(getContext(), this);
        ListView listView = (ListView) this.mView.findViewById(16908298);
        listView.setAdapter(this.A04);
        listView.setOnScrollListener(new C1418264o(this));
        boolean z = this.A0L;
        if (z && this.mNewSearchBar != null) {
            AnonymousClass0WN.A01(this.A0A).Ba2((TextView) this.mNewSearchBar.findViewById(C0003R.C0005id.search_edit_text));
        } else if (!z && this.mSearchEditText != null) {
            AnonymousClass0WN.A01(this.A0A).Ba2(this.mSearchEditText);
            this.mSearchEditText.setClearButtonEnabled(false);
        }
        if (this.A0K) {
            View findViewById = view.findViewById(C0003R.C0005id.header);
            C1416063r r3 = new C1416063r(getActivity(), this.A04, this, (ViewGroup) view.findViewById(C0003R.C0005id.main_screen_container), (ViewGroup) view.findViewById(C0003R.C0005id.search_container), findViewById, this.mNewSearchBar);
            this.A08 = r3;
            registerLifecycleListener(r3);
        } else {
            boolean z2 = this.A0L;
            if (z2 && (inlineSearchBox = this.mNewSearchBar) != null) {
                inlineSearchBox.setListener(new C1417564h(this));
                inlineSearchBox.setEditTextOnFocusChangeListener(new AnonymousClass65R(this));
            } else if (!z2 && (searchEditText = this.mSearchEditText) != null) {
                searchEditText.setOnFocusChangeListener(new AnonymousClass65S(this));
                SearchEditText searchEditText2 = this.mSearchEditText;
                searchEditText2.setOnKeyboardListener(new C1418864u(this));
                searchEditText2.setOnFilterTextListener(new AnonymousClass64V(this));
                searchEditText2.setSearchClearListener(new C1418164n(this));
            }
        }
        if (!(this.A06 == null || (businessInfo = this.A0B) == null)) {
            String str = businessInfo.A07;
            String str2 = businessInfo.A08;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.A07 = new AnonymousClass65G(str, str2);
            }
        }
        View view2 = this.mCategoryToggleContainer;
        if (view2 != null && (igSwitch = this.mCategoryToggle) != null) {
            igSwitch.setToggleListener(new AnonymousClass65Q(this));
            view2.setOnClickListener(new C1416864a(this));
        }
    }
}
