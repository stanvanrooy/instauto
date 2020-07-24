package com.instagram.business.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass267;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.AnonymousClass66Y;
import p000X.AnonymousClass675;
import p000X.C05000Hl;
import p000X.C05680Ln;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C134405oU;
import p000X.C137365tW;
import p000X.C14100jl;
import p000X.C1412261x;
import p000X.C1421966a;
import p000X.C1422066b;
import p000X.C1422566h;
import p000X.C1422666i;
import p000X.C1422866k;
import p000X.C1423266o;
import p000X.C146296Nf;
import p000X.C146476Ny;
import p000X.C17850qu;
import p000X.C23300zv;
import p000X.C256319p;
import p000X.C27341Hl;
import p000X.C35151ft;
import p000X.C68142yW;

public class SuggestBusinessFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass63X {
    public AnonymousClass61R A00;
    public C137365tW A01;
    public C1421966a A02;
    public AnonymousClass0C1 A03;
    public String A04;
    public List A05;
    public boolean A06;
    public boolean A07 = true;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public C256319p A0C = new AnonymousClass66Y(this);
    public C146296Nf A0D;
    public AnonymousClass2UH A0E;
    public String A0F;
    public boolean A0G;
    public final C11200ea A0H = new C1422666i(this);
    public AnonymousClass1EW mActionBarService;
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public StepperHeader mStepperHeader;

    public static C146296Nf A00(SuggestBusinessFragment suggestBusinessFragment) {
        AnonymousClass675 r10;
        SuggestBusinessFragment suggestBusinessFragment2 = suggestBusinessFragment;
        if (suggestBusinessFragment.A0D == null) {
            Context context = suggestBusinessFragment.getContext();
            AnonymousClass0C1 r5 = suggestBusinessFragment.A03;
            int i = suggestBusinessFragment.A0B;
            int i2 = suggestBusinessFragment.A0A;
            AnonymousClass1LO r8 = new AnonymousClass1LO(suggestBusinessFragment, true, context, r5);
            AnonymousClass0C1 r1 = suggestBusinessFragment.A03;
            if (r1.A06.A1b != Constants.A0C || !((Boolean) C134405oU.A00(new C05000Hl("is_enabled", AnonymousClass0L7.SMB_ANDROID_ALLOW_CLICK_IN_SUGGEST_BUSINESS_LAUNCHER, false, (String[]) null, (AnonymousClass04H) null), r1, true)).booleanValue()) {
                r10 = null;
            } else {
                r10 = new AnonymousClass675(suggestBusinessFragment2);
            }
            suggestBusinessFragment2.A0D = new C146296Nf(context, r5, i, i2, r8, suggestBusinessFragment2, r10);
        }
        return suggestBusinessFragment2.A0D;
    }

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final void BFZ() {
        this.A07 = false;
        A03(this, "continue", (Map) null);
        AnonymousClass2UH r0 = this.A0E;
        if (r0 != null) {
            r0.AoZ();
        } else {
            getActivity().onBackPressed();
        }
    }

    public final void BLe() {
    }

    public final String getModuleName() {
        return "suggest_business_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static C1412261x A01(SuggestBusinessFragment suggestBusinessFragment) {
        C1412261x r1 = new C1412261x(ConversionStep.SUGGEST_BUSINESS.A00);
        r1.A04 = C14100jl.A01(suggestBusinessFragment.A03);
        r1.A01 = suggestBusinessFragment.A0F;
        return r1;
    }

    public static void A02(SuggestBusinessFragment suggestBusinessFragment) {
        if (suggestBusinessFragment.mView != null && suggestBusinessFragment.A05 != null) {
            C146296Nf A002 = A00(suggestBusinessFragment);
            List list = suggestBusinessFragment.A05;
            if (list != null) {
                A002.A01 = list;
                A002.A0J();
            }
            List list2 = suggestBusinessFragment.A05;
            AnonymousClass267 r4 = new AnonymousClass267();
            AnonymousClass267 r3 = new AnonymousClass267();
            for (int i = 0; i < list2.size(); i++) {
                r4.A08(((C146476Ny) list2.get(i)).A01);
                r3.A08(((C146476Ny) list2.get(i)).A01.getId());
            }
            C17850qu A003 = C68142yW.A00(suggestBusinessFragment.A03, r4.A06(), false);
            A003.A00 = new C1422866k(suggestBusinessFragment);
            suggestBusinessFragment.schedule(A003);
        }
    }

    public static void A03(SuggestBusinessFragment suggestBusinessFragment, String str, Map map) {
        AnonymousClass61R r1 = suggestBusinessFragment.A00;
        if (r1 != null) {
            C1412261x A012 = A01(suggestBusinessFragment);
            A012.A00 = str;
            A012.A08 = map;
            r1.Ano(A012.A00());
        }
    }

    public static void A04(SuggestBusinessFragment suggestBusinessFragment, boolean z) {
        SpinnerImageView spinnerImageView = suggestBusinessFragment.mLoadingSpinner;
        if (spinnerImageView != null && suggestBusinessFragment.mBusinessNavBar != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            spinnerImageView.setVisibility(i);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmI(new C1422566h(this));
        r3.BmB(C0003R.C0004drawable.instagram_x_outline_24, new C1423266o(this));
    }

    public final boolean onBackPressed() {
        AnonymousClass61R r1;
        if (!this.A07 || (r1 = this.A00) == null) {
            return false;
        }
        r1.Ajn(A01(this).A00());
        return false;
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0E = AnonymousClass62H.A01(getActivity());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1391987609);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A03 = AnonymousClass0J1.A06(bundle2);
        this.A0F = bundle2.getString("entry_point");
        this.A06 = bundle2.getBoolean("ARG_CHECKLIST_ITEM_COMPLETED", false);
        String string = bundle2.getString("suggested_business_fetch_entry_point");
        this.A04 = "";
        if (string != null) {
            this.A04 = string;
        }
        boolean z = false;
        if (bundle2.getString("edit_profile_entry") != null) {
            z = true;
        }
        AnonymousClass61R A002 = AnonymousClass62H.A00(this.A03, this, z, this.A0E);
        this.A00 = A002;
        if (A002 != null) {
            A002.AnW(A01(this).A00());
        }
        this.A01 = new C137365tW(this.A03, this);
        this.A02 = new C1421966a();
        this.A0G = bundle2.getBoolean("ARG_SHOW_STEPPER_HEADER", false);
        this.A09 = bundle2.getInt("ARG_STEP_INDEX", -1);
        this.A08 = bundle2.getInt("ARG_STEP_COUNT", -1);
        this.A0B = bundle2.getInt("ARG_TITLE", 0);
        this.A0A = bundle2.getInt("ARG_SUB_TITLE", 0);
        AnonymousClass0Z0.A09(-72314051, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1925800858);
        View inflate = layoutInflater.inflate(C0003R.layout.suggest_business_fragment, viewGroup, false);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        AnonymousClass63U r0 = new AnonymousClass63U(this, businessNavBar);
        this.mBusinessNavBarHelper = r0;
        registerLifecycleListener(r0);
        this.mLoadingSpinner = (SpinnerImageView) inflate.findViewById(C0003R.C0005id.loading_indicator);
        this.A0F = this.mArguments.getString("entry_point");
        this.mActionBarService = AnonymousClass1EW.A03(getActivity());
        this.mBusinessNavBar.setVisibility(8);
        AnonymousClass2UH r02 = this.A0E;
        if (r02 != null && r02.BX2() == null) {
            this.mBusinessNavBar.setPrimaryButtonText((int) C0003R.string.done);
        }
        AnonymousClass0Z0.A09(1206583995, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-785230903);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        C23300zv.A00(this.A03).A03(C35151ft.class, this.A0H);
        AnonymousClass0Z0.A09(358279542, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        if (((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.BIZ_ANDROID_SUGGEST_BIZ_INFINITE_SCROLL, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.mRecyclerView.A0w(this.A0C);
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.mBusinessNavBar.A04(this.mRecyclerView);
        this.mRecyclerView.setAdapter(A00(this));
        C23300zv.A00(this.A03).A02(C35151ft.class, this.A0H);
        if (this.A0G) {
            StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0003R.C0005id.stepper_header);
            this.mStepperHeader = stepperHeader;
            stepperHeader.setVisibility(0);
            this.mStepperHeader.A03(this.A09, this.A08);
        }
        if (((Boolean) C05680Ln.A5X.A03).booleanValue() || this.A05 == null) {
            A04(this, true);
            this.A02.A00(this, this.A03, new C1422066b(this), this.A04);
            return;
        }
        A02(this);
    }
}
