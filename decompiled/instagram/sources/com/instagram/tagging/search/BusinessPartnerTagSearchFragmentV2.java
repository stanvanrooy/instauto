package com.instagram.tagging.search;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.searchedittext.SearchEditText;
import java.util.List;
import p000X.AXT;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass2MB;
import p000X.AnonymousClass60P;
import p000X.AnonymousClass6KF;
import p000X.AnonymousClass6OZ;
import p000X.AnonymousClass6P7;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C110864py;
import p000X.C11850fm;
import p000X.C127435d4;
import p000X.C156896n0;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C26771Ff;
import p000X.C27341Hl;
import p000X.C28148CcC;
import p000X.C28152CcG;
import p000X.C28153CcH;
import p000X.C28164CcS;
import p000X.C28167CcV;
import p000X.C28168CcW;
import p000X.C28169CcX;
import p000X.C28188Ccq;
import p000X.C28190Ccs;
import p000X.C28192Ccu;
import p000X.C28193Ccv;
import p000X.C28194Ccw;
import p000X.C28211CdE;
import p000X.C28241Cdi;
import p000X.C28347CfR;
import p000X.C28390Cg8;
import p000X.C37041j1;
import p000X.C68342yv;
import p000X.C68372yy;
import p000X.C68382yz;

public class BusinessPartnerTagSearchFragmentV2 extends C27341Hl implements AnonymousClass1HK {
    public View A00;
    public AnonymousClass6KF A01;
    public AnonymousClass0RN A02;
    public C28188Ccq A03;
    public C28192Ccu A04;
    public C68382yz A05;
    public AnonymousClass0C1 A06;
    public C28168CcW A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public ContextThemeWrapper A0G;
    public String A0H;
    public boolean A0I;
    public final Handler A0J = new Handler(Looper.getMainLooper());
    public final ViewTreeObserver.OnGlobalLayoutListener A0K = new AXT(this);
    public final C28190Ccs A0L = new C28167CcV(this);
    public final C28211CdE A0M = new C28169CcX(this);
    public final C28193Ccv A0N = new C28241Cdi(this);
    public final AnonymousClass2MB A0O = new C28152CcG(this);
    public final C28347CfR A0P = new C28148CcC(this);
    public TextView mDescriptionTextView;
    public NestedScrollView mNestedScrollView;
    public RecyclerView mRecyclerView;
    public SearchEditText mSearchEditText;

    public final String getModuleName() {
        return "people_tagging_search";
    }

    public static void A00(BusinessPartnerTagSearchFragmentV2 businessPartnerTagSearchFragmentV2) {
        businessPartnerTagSearchFragmentV2.A04.A01();
        C28188Ccq ccq = businessPartnerTagSearchFragmentV2.A03;
        ccq.A0K();
        ccq.notifyDataSetChanged();
    }

    public final boolean onBackPressed() {
        this.A07.AET();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(193657510);
        super.onCreate(bundle);
        this.A06 = AnonymousClass0J1.A06(this.mArguments);
        this.A0G = AnonymousClass1BA.A05(getContext(), C0003R.attr.peopleTagSearchTheme);
        this.A08 = this.mArguments.getString("ARGUMENT_BRANDED_CONTENT_USER_ID");
        this.A0B = this.mArguments.getString("TAGGED_MERCHANT_ID");
        this.A0A = this.mArguments.getString("ARGUMENT_MEDIA_ID");
        this.A0C = this.A08;
        Boolean valueOf = Boolean.valueOf(requireArguments().getBoolean("ARGUMENT_IS_EDITING"));
        AnonymousClass0a4.A06(valueOf);
        this.A0I = valueOf.booleanValue();
        String string = requireArguments().getString("ARGUMENT_MEDIA_TYPE");
        AnonymousClass0a4.A06(string);
        this.A0H = string;
        this.A01 = (AnonymousClass6KF) this.mArguments.getSerializable("ARGUMENT_SHOPPING_ENTRYPOINT");
        Boolean valueOf2 = Boolean.valueOf(requireArguments().getBoolean("ARGUMENT_SHOW_DESCRIPTION"));
        AnonymousClass0a4.A06(valueOf2);
        this.A0E = valueOf2.booleanValue();
        C68342yv r15 = new C68342yv();
        C68372yy r3 = new C68372yy(this.A06);
        r3.A00 = this;
        r3.A02 = r15;
        r3.A01 = this.A0O;
        r3.A03 = true;
        this.A05 = r3.A00();
        C28211CdE cdE = this.A0M;
        C28190Ccs ccs = this.A0L;
        C28211CdE cdE2 = cdE;
        C28190Ccs ccs2 = ccs;
        C28192Ccu ccu = new C28192Ccu(r15, cdE2, ccs2, this.A0N, C28194Ccw.A00, 0);
        this.A04 = ccu;
        FragmentActivity activity = getActivity();
        this.A03 = new C28188Ccq(activity, ccu, new AnonymousClass6P7(activity, this.A06, this.A0P, (C28390Cg8) null, (String) null, false, false, false, true), this.A0L, this.A0M, (C110864py) null);
        AnonymousClass0Z0.A09(521775470, A022);
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1449836428);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(this.A0G).inflate(C0003R.layout.fragment_business_partner_tag_search_v2, viewGroup, false);
        viewGroup2.findViewById(C0003R.C0005id.button_back).setOnClickListener(new C28164CcS(this));
        viewGroup2.setBackgroundColor(AnonymousClass1BA.A01(getContext(), C0003R.attr.backgroundColorPrimary));
        if (bundle != null) {
            this.A0F = bundle.getBoolean("HAS_USER_TYPED_SOMETHING");
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
        this.mSearchEditText.setOnFilterTextListener(new C28153CcH(this));
        AnonymousClass0Z0.A09(-1687752177, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(572472114);
        super.onDestroy();
        this.A05.Azd();
        AnonymousClass0Z0.A09(1859085617, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1415218727);
        super.onDestroyView();
        View view = this.A00;
        String str = null;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.A0K);
            this.A00.getLayoutParams().height = -1;
            this.A00 = null;
        }
        AnonymousClass0C1 r3 = this.A06;
        AnonymousClass0RN r4 = this.A02;
        boolean z = this.A0I;
        String str2 = this.A0C;
        String str3 = this.A0H;
        if (z) {
            str = this.A0A;
        }
        AnonymousClass6OZ.A05(r3, r4, z, str2, str3, str);
        AnonymousClass0Z0.A09(-1302336460, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1025999087);
        super.onPause();
        this.mSearchEditText.A03();
        AnonymousClass0Z0.A09(1272603549, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1807486776);
        super.onResume();
        C15890nh r2 = new C15890nh(this.A06);
        r2.A09 = Constants.A0N;
        r2.A0C = "business/branded_content/get_whitelist_sponsors/";
        r2.A06(C127435d4.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new AnonymousClass60P(this);
        schedule(A032);
        if (getActivity() instanceof C11850fm) {
            AnonymousClass0ZA.A0E(this.A0J, new C156896n0(this), -1260517703);
        }
        AnonymousClass0Z0.A09(-64369915, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HAS_USER_TYPED_SOMETHING", this.A0F);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(1433269552);
        super.onStart();
        this.A03.A01 = false;
        AnonymousClass0Z0.A09(1899114959, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mNestedScrollView = (NestedScrollView) AnonymousClass1E1.A07(view, C0003R.C0005id.nested_scroll_view);
        this.mDescriptionTextView = (TextView) AnonymousClass1E1.A07(view, C0003R.C0005id.description);
        if (this.A0E) {
            String string = getString(C0003R.string.learn_more_text);
            String string2 = getString(C0003R.string.ad_library);
            FragmentActivity activity = getActivity();
            AnonymousClass0a4.A06(activity);
            AnonymousClass0C1 r6 = this.A06;
            String string3 = getString(C0003R.string.allow_business_partner_promote_post_description_v1, string2, string);
            Context context = getContext();
            AnonymousClass0a4.A06(context);
            this.mDescriptionTextView.setText(C37041j1.A00(activity, r6, string3, string, string2, context, Constants.ZERO, getModuleName()));
            this.mDescriptionTextView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mDescriptionTextView.setHighlightColor(C019000b.A00(requireContext(), C0003R.color.igds_transparent));
            this.mDescriptionTextView.setVisibility(0);
        }
        this.mRecyclerView = (RecyclerView) AnonymousClass1E1.A07(view, C0003R.C0005id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.A03);
        A00(this);
        if ((getActivity().getWindow().getAttributes().flags & 1024) != 0) {
            View findViewById = getActivity().findViewById(C0003R.C0005id.root);
            this.A00 = findViewById;
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A0K);
            }
        }
    }
}
