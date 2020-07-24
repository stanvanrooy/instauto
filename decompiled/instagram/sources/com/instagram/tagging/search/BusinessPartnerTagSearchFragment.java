package com.instagram.tagging.search;

import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.p009ui.widget.searchedittext.SearchEditText;
import p000X.AXU;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass2MB;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6KF;
import p000X.AnonymousClass6OZ;
import p000X.C019000b;
import p000X.C05230Is;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C11850fm;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C156906n1;
import p000X.C26771Ff;
import p000X.C27341Hl;
import p000X.C28149CcD;
import p000X.C28150CcE;
import p000X.C28151CcF;
import p000X.C28156CcK;
import p000X.C28160CcO;
import p000X.C28163CcR;
import p000X.C28165CcT;
import p000X.C28168CcW;
import p000X.C28170CcY;
import p000X.C37041j1;
import p000X.C52362Om;
import p000X.C68132yV;
import p000X.C68342yv;
import p000X.C68372yy;
import p000X.C68382yz;
import p000X.C84533lp;

public class BusinessPartnerTagSearchFragment extends C27341Hl implements AnonymousClass1HK, C68132yV {
    public View A00;
    public AnonymousClass0RN A01;
    public C68382yz A02;
    public AnonymousClass0C1 A03;
    public C28168CcW A04;
    public C28151CcF A05;
    public String A06;
    public String A07;
    public boolean A08 = false;
    public boolean A09;
    public ContextThemeWrapper A0A;
    public AnonymousClass6KF A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public final Handler A0G = new Handler(Looper.getMainLooper());
    public final ViewTreeObserver.OnGlobalLayoutListener A0H = new AXU(this);
    public final AnonymousClass2MB A0I = new C28150CcE(this);
    public ListView mListView;
    public SearchEditText mSearchEditText;

    public final void AwG(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void B5A(C13300iJ r1, int i) {
    }

    public final void BIH(C13300iJ r2) {
        this.A0E = null;
        this.A04.BbP();
    }

    public final void BKc(C13300iJ r1, int i) {
    }

    public final String getModuleName() {
        return "people_tagging_search";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.instagram.tagging.search.BusinessPartnerTagSearchFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.instagram.tagging.search.BusinessPartnerTagSearchFragmentV2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.instagram.tagging.search.BusinessPartnerTagSearchFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.instagram.tagging.search.BusinessPartnerTagSearchFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void A00(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, C28168CcW ccW, String str, String str2, String str3, AnonymousClass6KF r11, boolean z, boolean z2, String str4, AnonymousClass0RN r15) {
        BusinessPartnerTagSearchFragment businessPartnerTagSearchFragment;
        Bundle bundle = new Bundle();
        bundle.putString("ARGUMENT_BRANDED_CONTENT_USER_ID", str);
        C05230Is.A00(r6, bundle);
        bundle.putString("TAGGED_MERCHANT_ID", str2);
        bundle.putSerializable("ARGUMENT_SHOPPING_ENTRYPOINT", r11);
        bundle.putString("ARGUMENT_MEDIA_ID", str3);
        bundle.putBoolean("ARGUMENT_SHOW_DESCRIPTION", z);
        bundle.putBoolean("ARGUMENT_IS_EDITING", z2);
        bundle.putString("ARGUMENT_MEDIA_TYPE", str4);
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.BRANDED_CONTENT_TAG_BUSINESS_SEARCH, "v2", false, (AnonymousClass04H) null)).booleanValue()) {
            BusinessPartnerTagSearchFragmentV2 businessPartnerTagSearchFragmentV2 = new BusinessPartnerTagSearchFragmentV2();
            businessPartnerTagSearchFragmentV2.setArguments(bundle);
            businessPartnerTagSearchFragmentV2.A07 = ccW;
            businessPartnerTagSearchFragmentV2.A02 = r15;
            businessPartnerTagSearchFragment = businessPartnerTagSearchFragmentV2;
        } else {
            BusinessPartnerTagSearchFragment businessPartnerTagSearchFragment2 = new BusinessPartnerTagSearchFragment();
            businessPartnerTagSearchFragment2.setArguments(bundle);
            businessPartnerTagSearchFragment2.A04 = ccW;
            businessPartnerTagSearchFragment2.A01 = r15;
            businessPartnerTagSearchFragment = businessPartnerTagSearchFragment2;
        }
        C52362Om r1 = new C52362Om(fragmentActivity, r6);
        r1.A04 = AnonymousClass40t.$const$string(60);
        r1.A02 = businessPartnerTagSearchFragment;
        r1.A02();
        if (!z2) {
            str3 = null;
        }
        C28170CcY ccY = new C28170CcY(AnonymousClass0QT.A00(r6, r15).A02("instagram_bc_add_partner_entry"));
        ccY.A04("is_editing", Boolean.valueOf(z2));
        ccY.A08("media_id", str3);
        ccY.A08("media_type", str4);
        ccY.A08("prior_module", r15.getModuleName());
        ccY.A01();
    }

    public final boolean onBackPressed() {
        this.A04.AET();
        return true;
    }

    public final void A01(String str) {
        String A012 = C06360Ot.A01(str);
        this.mSearchEditText.clearFocus();
        if (TextUtils.isEmpty(A012)) {
            this.A04.AET();
        } else {
            this.A02.A04(A012);
        }
    }

    public final void BUH(C13300iJ r8, int i) {
        if (r8.A0d()) {
            String str = this.A0D;
            if (str == null || str.equals(r8.getId())) {
                this.A0E = r8.getId();
                this.A04.A4g(r8);
                return;
            }
            AnonymousClass2OA r4 = new AnonymousClass2OA(getContext());
            r4.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
            r4.A0V(true);
            AnonymousClass6KF r1 = this.A0B;
            if (r1 == AnonymousClass6KF.FEED_POST) {
                r4.A03 = getResources().getString(C0003R.string.business_partner_and_merchant_products_dialog_title, new Object[]{r8.AZn()});
                r4.A06(C0003R.string.business_partner_and_merchant_products_dialog_message);
            } else if (r1 == AnonymousClass6KF.STORY) {
                r4.A03 = getResources().getString(C0003R.string.business_partner_and_merchant_products_story_dialog_title, new Object[]{r8.AZn()});
                r4.A06(C0003R.string.business_partner_and_merchant_products_story_dialog_message);
            }
            r4.A03().show();
        } else if (r8.A27 != null) {
        } else {
            if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.BC_TAG_APPROVAL_REQUEST, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                C37041j1.A06(getContext(), r8, new C28156CcK(this, r8), new C28163CcR(this, r8));
                return;
            }
            this.A04.A6s(r8);
            AnonymousClass5F9.A00(getContext(), C0003R.string.require_approvals_content);
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-13618702);
        super.onCreate(bundle);
        setRetainInstance(true);
        this.A03 = AnonymousClass0J1.A06(this.mArguments);
        this.A0A = AnonymousClass1BA.A05(getContext(), C0003R.attr.peopleTagSearchTheme);
        this.A06 = this.mArguments.getString("ARGUMENT_BRANDED_CONTENT_USER_ID");
        this.A0D = this.mArguments.getString("TAGGED_MERCHANT_ID");
        this.A07 = this.mArguments.getString("ARGUMENT_MEDIA_ID");
        this.A0E = this.A06;
        Boolean valueOf = Boolean.valueOf(requireArguments().getBoolean("ARGUMENT_IS_EDITING"));
        AnonymousClass0a4.A06(valueOf);
        this.A0F = valueOf.booleanValue();
        String string = requireArguments().getString("ARGUMENT_MEDIA_TYPE");
        AnonymousClass0a4.A06(string);
        this.A0C = string;
        this.A0B = (AnonymousClass6KF) this.mArguments.getSerializable("ARGUMENT_SHOPPING_ENTRYPOINT");
        this.A05 = new C28151CcF(this.A0A, this.A03, this, this, this);
        C68372yy r1 = new C68372yy(this.A03);
        r1.A00 = this;
        r1.A02 = new C68342yv();
        r1.A01 = this.A0I;
        r1.A03 = true;
        this.A02 = r1.A00();
        AnonymousClass0Z0.A09(-1524720054, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1977514068);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(this.A0A).inflate(C0003R.layout.fragment_business_partner_tag_search, viewGroup, false);
        viewGroup2.findViewById(C0003R.C0005id.button_back).setOnClickListener(new C28165CcT(this));
        viewGroup2.setBackgroundColor(AnonymousClass1BA.A01(getContext(), C0003R.attr.backgroundColorPrimary));
        if (bundle != null) {
            this.A09 = bundle.getBoolean("HAS_USER_TYPED_SOMETHING");
        }
        this.mSearchEditText = (SearchEditText) viewGroup2.findViewById(C0003R.C0005id.row_search_edit_text);
        ColorFilter A002 = C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.grey_5));
        this.mSearchEditText.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A002);
        this.mSearchEditText.setClearButtonAlpha(128);
        this.mSearchEditText.setClearButtonColorFilter(A002);
        if (this.mSearchEditText.getBackground() != null) {
            this.mSearchEditText.getBackground().mutate().setColorFilter(A002);
        }
        this.mSearchEditText.setHint(getContext().getString(C0003R.string.search_for_a_partner));
        if (!this.A08) {
            this.mSearchEditText.setOnFilterTextListener(new C28149CcD(this));
        }
        ListView listView = (ListView) viewGroup2.findViewById(16908298);
        this.mListView = listView;
        listView.setOnItemClickListener(new C28160CcO(this));
        AnonymousClass0Z0.A09(1832811627, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-2122271125);
        super.onDestroy();
        this.A02.Azd();
        AnonymousClass0Z0.A09(-704984770, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(328523687);
        super.onDestroyView();
        View view = this.A00;
        String str = null;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.A0H);
            this.A00.getLayoutParams().height = -1;
            this.A00 = null;
        }
        this.mSearchEditText.setOnFilterTextListener((C84533lp) null);
        AnonymousClass0C1 r3 = this.A03;
        AnonymousClass0RN r4 = this.A01;
        boolean z = this.A0F;
        String str2 = this.A0E;
        String str3 = this.A0C;
        if (z) {
            str = this.A07;
        }
        AnonymousClass6OZ.A05(r3, r4, z, str2, str3, str);
        AnonymousClass0Z0.A09(-1072014472, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-259112461);
        super.onPause();
        this.mSearchEditText.A03();
        AnonymousClass0Z0.A09(-1676762041, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-913493072);
        super.onResume();
        if (getActivity() instanceof C11850fm) {
            AnonymousClass0ZA.A0E(this.A0G, new C156906n1(this), 1851975656);
        }
        AnonymousClass0Z0.A09(819368208, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HAS_USER_TYPED_SOMETHING", this.A09);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(-1734288086);
        super.onStart();
        if (this.A08) {
            this.mListView.setVisibility(0);
            C28151CcF ccF = this.A05;
            ccF.A01 = false;
            ccF.A05.A00 = false;
            C28151CcF.A00(ccF);
            this.mSearchEditText.setOnFilterTextListener(new C28149CcD(this));
        }
        AnonymousClass0Z0.A09(-218030513, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mListView.setBackground(new ColorDrawable(AnonymousClass1BA.A01(this.A0A, C0003R.attr.peopleTagSearchBackground)));
        this.mListView.setCacheColorHint(AnonymousClass1BA.A01(this.A0A, C0003R.attr.peopleTagSearchCacheColorHint));
        this.mListView.setAdapter(this.A05);
        this.mSearchEditText.requestFocus();
        this.mSearchEditText.A05();
        if ((getActivity().getWindow().getAttributes().flags & 1024) != 0) {
            View findViewById = getActivity().findViewById(C0003R.C0005id.root);
            this.A00 = findViewById;
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A0H);
            }
        }
        if (this.A06 != null) {
            C13300iJ A022 = C13510ie.A00(this.A03).A02(this.A06);
            C28151CcF ccF = this.A05;
            ccF.A02 = true;
            ccF.A06.A00 = A022;
            C28151CcF.A00(ccF);
            C28151CcF ccF2 = this.A05;
            ccF2.A01 = false;
            ccF2.A05.A00 = false;
            C28151CcF.A00(ccF2);
            this.mListView.setVisibility(0);
        }
    }
}
