package com.instagram.business.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.igds.components.stepperheader.StepperHeader;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass61G;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass643;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C1409760w;
import p000X.C14100jl;
import p000X.C1413362k;
import p000X.C1413562m;
import p000X.C1413662n;
import p000X.C27341Hl;

public class PageLoaderFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public AnonymousClass2UH A00;
    public C06590Pq A01;
    public String A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public StepperHeader mStepperHeader;

    public final String getModuleName() {
        return "page_loader_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(PageLoaderFragment pageLoaderFragment) {
        C06590Pq r3 = pageLoaderFragment.A01;
        AnonymousClass61G.A07(r3, "page_checking", pageLoaderFragment.A02, C14100jl.A01(r3));
        AnonymousClass0ZA.A0E(pageLoaderFragment.A03, new C1413662n(pageLoaderFragment), -1905728808);
    }

    public final boolean onBackPressed() {
        C06590Pq r4 = this.A01;
        AnonymousClass61G.A06(r4, "page_checking", this.A02, (C06270Ok) null, C14100jl.A01(r4));
        this.A00.Be6();
        return true;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new C1413562m(this));
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        AnonymousClass2UH A012 = AnonymousClass62H.A01(requireActivity());
        AnonymousClass0a4.A06(A012);
        this.A00 = A012;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-593018380);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = AnonymousClass0J1.A00(bundle2);
        this.A02 = bundle2.getString("entry_point");
        AnonymousClass0Z0.A09(-1343559612, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(934127579);
        View inflate = layoutInflater.inflate(C0003R.layout.fb_page_loader_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-2007181298, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C1409760w.A00(this.A00)) {
            StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0003R.C0005id.stepper_header);
            this.mStepperHeader = stepperHeader;
            stepperHeader.setVisibility(0);
            this.mStepperHeader.A03(this.A00.ABJ(), this.A00.BrZ());
        }
        C1413362k r4 = new C1413362k(this, this.A01, requireContext(), this.A02, this.A00);
        Context requireContext = requireContext();
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
        C06590Pq r1 = this.A01;
        AnonymousClass643.A00(requireContext, A002, r1, r4, AnonymousClass62H.A05(r1, this.A00));
    }
}
