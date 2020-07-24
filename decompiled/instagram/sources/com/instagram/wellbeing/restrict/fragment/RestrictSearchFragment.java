package com.instagram.wellbeing.restrict.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.android.internal.util.Predicate;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.search.SearchController;
import com.instagram.video.live.p038ui.streaming.IgLiveWithInviteFragment;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1H4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass4LH;
import p000X.AnonymousClass4LI;
import p000X.AnonymousClass67D;
import p000X.AnonymousClass67G;
import p000X.AnonymousClass6LX;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C109494nd;
import p000X.C110414pF;
import p000X.C112474sh;
import p000X.C13300iJ;
import p000X.C18320rf;
import p000X.C18980sj;
import p000X.C256219o;
import p000X.C27341Hl;
import p000X.C27651Ir;
import p000X.C28351Lj;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C67712xi;
import p000X.C67782xp;

public class RestrictSearchFragment extends C27341Hl implements AnonymousClass1HM, AnonymousClass67D, C112474sh {
    public AnonymousClass0C1 A00;
    public C67712xi A01;
    public boolean A02;
    public C110414pF mSearchAdapter;
    public SearchController mSearchController;

    public final float AFw(SearchController searchController, Integer num) {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final void Arn(SearchController searchController, float f, float f2, Integer num) {
    }

    public final void BLV(SearchController searchController, boolean z) {
    }

    public final void BOo(SearchController searchController, Integer num, Integer num2) {
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.Bnz(false);
    }

    public final String getModuleName() {
        return "restrict_search";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onSearchTextChanged(String str) {
        this.A01.Bjv(str);
    }

    public final void B3D() {
        FragmentActivity activity = getActivity();
        if (AnonymousClass1H4.A01(this.mFragmentManager) && activity != null) {
            activity.onBackPressed();
        }
    }

    public final void BTr(C13300iJ r9, Integer num) {
        AnonymousClass1HD targetFragment = getTargetFragment();
        if (targetFragment instanceof RestrictHomeFragment) {
            RestrictHomeFragment restrictHomeFragment = (RestrictHomeFragment) targetFragment;
            AnonymousClass1AM r0 = restrictHomeFragment.mFragmentManager;
            if (r0 != null) {
                r0.A10();
                if (num == Constants.ZERO) {
                    AnonymousClass6LX.A08(restrictHomeFragment.A00, "click", "add_account", r9);
                    C18320rf.A00.A06(restrictHomeFragment.getContext(), AnonymousClass1L8.A00(restrictHomeFragment), restrictHomeFragment.A01, r9.getId(), new AnonymousClass4LI(restrictHomeFragment));
                } else if (num == Constants.ONE) {
                    AnonymousClass6LX.A08(restrictHomeFragment.A00, "click", "remove_restricted_account", r9);
                    C18320rf.A00.A07(restrictHomeFragment.getContext(), AnonymousClass1L8.A00(restrictHomeFragment), restrictHomeFragment.A01, r9.getId(), new AnonymousClass4LH(restrictHomeFragment));
                }
            }
        } else {
            AnonymousClass0QD.A02("RestrictSearchFragment", "Target fragment does not implement search delegate.");
        }
    }

    public final void BUI(String str) {
        AnonymousClass1HD targetFragment = getTargetFragment();
        if (targetFragment instanceof RestrictHomeFragment) {
            RestrictHomeFragment restrictHomeFragment = (RestrictHomeFragment) targetFragment;
            AnonymousClass1AM r0 = restrictHomeFragment.mFragmentManager;
            if (r0 != null) {
                r0.A10();
                C52902Qq A012 = C52902Qq.A01(restrictHomeFragment.A01, str, "restrict_search_user_row", restrictHomeFragment.getModuleName());
                C52362Om r2 = new C52362Om(restrictHomeFragment.getActivity(), restrictHomeFragment.A01);
                r2.A02 = C18980sj.A00.A00().A02(A012.A03());
                r2.A02();
                return;
            }
            return;
        }
        AnonymousClass0QD.A02("RestrictSearchFragment", "Target fragment does not implement search delegate.");
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A02) {
            this.mSearchController.A02(true, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A02 = false;
        }
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-879491182);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass0Z0.A09(-95949780, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-199464524);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_restrict_search, viewGroup, false);
        this.A02 = true;
        AnonymousClass0Z0.A09(2027121207, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(983066777);
        super.onDestroyView();
        RestrictSearchFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(583616148, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(2092069830);
        super.onPause();
        C06220Of.A0E(this.mSearchController.mViewHolder.A0B);
        AnonymousClass0Z0.A09(1178945226, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mSearchAdapter = new C110414pF(getRootActivity(), this.A00, this, getModuleName());
        C67712xi A002 = C67782xp.A00(this.A00, new C28351Lj(getContext(), AnonymousClass1L8.A00(this)), AnonymousClass0C5.$const$string(8), new C109494nd(this), (List) null, (IgLiveWithInviteFragment) null, false, (Predicate) null);
        this.A01 = A002;
        A002.BiZ(this.mSearchAdapter);
        SearchController searchController = new SearchController((Activity) getActivity(), (ViewGroup) view.findViewById(C0003R.C0005id.nelson_search_container), -1, C27651Ir.A00(getRootActivity()), (ListAdapter) this.mSearchAdapter, (AnonymousClass67D) this, false, (AnonymousClass67G) null, (C256219o) null);
        this.mSearchController = searchController;
        registerLifecycleListener(searchController);
    }
}
