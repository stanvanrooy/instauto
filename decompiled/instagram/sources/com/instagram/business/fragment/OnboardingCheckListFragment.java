package com.instagram.business.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.business.p015ui.BusinessNavBar;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2MG;
import p000X.AnonymousClass2MJ;
import p000X.AnonymousClass2UH;
import p000X.AnonymousClass38N;
import p000X.AnonymousClass61R;
import p000X.AnonymousClass62H;
import p000X.AnonymousClass656;
import p000X.AnonymousClass66U;
import p000X.AnonymousClass66V;
import p000X.AnonymousClass66W;
import p000X.AnonymousClass66t;
import p000X.AnonymousClass94I;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C137365tW;
import p000X.C1418464q;
import p000X.C1422266d;
import p000X.C1422466g;
import p000X.C1422766j;
import p000X.C1423066m;
import p000X.C1423166n;
import p000X.C1423866w;
import p000X.C23300zv;
import p000X.C26771Ff;
import p000X.C27341Hl;
import p000X.DCY;

public class OnboardingCheckListFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public Handler A00;
    public C1418464q A01;
    public C1423866w A02;
    public AnonymousClass656 A03;
    public AnonymousClass66U A04;
    public AnonymousClass2MG A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08;
    public AnonymousClass2UH A09;
    public AnonymousClass0C1 A0A;
    public boolean A0B;
    public boolean A0C;
    public final C11200ea A0D = new C1422466g(this);
    public BusinessNavBar mBusinessNavBar;
    public ImageView mConfettiView;
    public ViewGroup mLayoutContent;
    public ProgressBar mProgressBar;
    public RecyclerView mRecyclerView;
    public TextView mStepsCompletedTextView;
    public TextView mSubTitleTextView;
    public TextView mTitleTextView;

    public final String getModuleName() {
        return "onboarding_checklist_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(OnboardingCheckListFragment onboardingCheckListFragment) {
        AnonymousClass2UH r0;
        if (!onboardingCheckListFragment.A0C || (r0 = onboardingCheckListFragment.A09) == null) {
            onboardingCheckListFragment.getActivity().onBackPressed();
        } else {
            r0.A8B();
        }
    }

    public final boolean onBackPressed() {
        if (this.A07) {
            AnonymousClass66U r0 = this.A04;
            AnonymousClass61R r1 = r0.A01;
            if (r1 != null) {
                r1.Ajn(AnonymousClass66U.A00(r0).A00());
            }
        } else {
            AnonymousClass66U r02 = this.A04;
            AnonymousClass61R r12 = r02.A01;
            if (r12 != null) {
                r12.AlP(AnonymousClass66U.A00(r02).A00());
            }
        }
        AnonymousClass2UH r2 = this.A09;
        if (AnonymousClass62H.A0E(r2)) {
            AnonymousClass0a4.A06(r2);
            r2.Be6();
            return true;
        } else if (!AnonymousClass62H.A0D(r2)) {
            return false;
        } else {
            A00(this);
            return true;
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.Bm6(C0003R.C0004drawable.instagram_x_outline_24, new AnonymousClass66t(this)).setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.igds_primary_icon)));
        if (this.A0B) {
            r4.BmC(C0003R.C0004drawable.instagram_arrow_back_24, new C1423166n(this), C0003R.string.close);
        }
    }

    public final C06590Pq getSession() {
        return this.A0A;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A09 = AnonymousClass62H.A01(getActivity());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(415085458);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A0A = AnonymousClass0J1.A06(bundle2);
        this.A06 = bundle2.getString("entry_point");
        boolean z = false;
        if (bundle2.getString("edit_profile_entry") != null) {
            z = true;
        }
        AnonymousClass61R A002 = AnonymousClass62H.A00(this.A0A, this, z, this.A09);
        this.A01 = new C1418464q();
        this.A03 = new AnonymousClass656(this.A0A);
        this.A02 = new C1423866w(getContext());
        this.A00 = new Handler(Looper.getMainLooper());
        AnonymousClass2UH r1 = this.A09;
        this.A0B = AnonymousClass62H.A0E(r1);
        boolean A0C2 = AnonymousClass62H.A0C(r1);
        this.A0C = A0C2;
        AnonymousClass0C1 r4 = this.A0A;
        this.A04 = new AnonymousClass66U(r4, this, new C137365tW(r4, this), A002, this.A06, getContext(), A0C2);
        C23300zv.A00(r4).A02(AnonymousClass38N.class, this.A0D);
        AnonymousClass66U r0 = this.A04;
        AnonymousClass61R r12 = r0.A01;
        if (r12 != null) {
            r12.AnW(AnonymousClass66U.A00(r0).A00());
        }
        AnonymousClass0Z0.A09(138482686, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1390027536);
        View inflate = layoutInflater.inflate(C0003R.layout.onboarding_check_list_fragment, viewGroup, false);
        this.mRecyclerView = (RecyclerView) inflate.findViewById(C0003R.C0005id.recycler_onboarding_check_list);
        AnonymousClass2MJ A002 = AnonymousClass2MG.A00(getContext());
        A002.A01 = true;
        A002.A01(new AnonymousClass66V(this));
        A002.A01(new C1422766j());
        this.A05 = A002.A00();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.mRecyclerView.setAdapter(this.A05);
        this.mTitleTextView = (TextView) inflate.findViewById(C0003R.C0005id.title);
        this.mSubTitleTextView = (TextView) inflate.findViewById(C0003R.C0005id.subtitle);
        this.mStepsCompletedTextView = (TextView) inflate.findViewById(C0003R.C0005id.text_steps_completed);
        this.mProgressBar = (ProgressBar) inflate.findViewById(C0003R.C0005id.progressbar_loading);
        this.mLayoutContent = (ViewGroup) inflate.findViewById(C0003R.C0005id.layout_content);
        this.mConfettiView = (ImageView) inflate.findViewById(C0003R.C0005id.image_confetti);
        this.mBusinessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        C1423866w r2 = this.A02;
        r2.A01 = this.mConfettiView;
        DCY A003 = AnonymousClass94I.A00(r2.A00, C0003R.raw.countdown_sticker_confetti);
        r2.A02 = A003;
        if (A003 != null) {
            A003.A3M(new C1423066m(r2));
        }
        r2.A01.setImageDrawable(r2.A02);
        this.mBusinessNavBar.setPrimaryButtonOnclickListeners(new C1422266d(this));
        AnonymousClass0Z0.A09(1573267864, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1164212644);
        super.onDestroy();
        C23300zv.A00(this.A0A).A03(AnonymousClass38N.class, this.A0D);
        AnonymousClass0Z0.A09(41845197, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        AnonymousClass66U r3 = this.A04;
        if (r3.A06 == null) {
            if (r3.A07) {
                str = "conversion";
            } else {
                str = "profile";
            }
            r3.A03.A01(str, new AnonymousClass66W(r3));
            return;
        }
        OnboardingCheckListFragment onboardingCheckListFragment = r3.A02;
        ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
        if (!(progressBar == null || onboardingCheckListFragment.mLayoutContent == null)) {
            progressBar.setVisibility(8);
            onboardingCheckListFragment.mLayoutContent.setVisibility(0);
        }
        r3.processData(r3.A06);
    }
}
