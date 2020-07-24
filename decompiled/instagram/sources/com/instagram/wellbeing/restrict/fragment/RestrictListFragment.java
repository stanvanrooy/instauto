package com.instagram.wellbeing.restrict.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.C0003R;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass6LX;
import p000X.C06590Pq;
import p000X.C109504ng;
import p000X.C109524ni;
import p000X.C109534nj;
import p000X.C109544nk;
import p000X.C109554nm;
import p000X.C110414pF;
import p000X.C112474sh;
import p000X.C13300iJ;
import p000X.C17850qu;
import p000X.C18320rf;
import p000X.C18980sj;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C67182wk;

public class RestrictListFragment extends AnonymousClass2NN implements C112474sh {
    public AnonymousClass0C1 A00;
    public C110414pF A01;
    public C109554nm A02;
    public C67182wk A03;
    public AnonymousClass0QT A04;
    public EmptyStateView mEmptyStateView;

    public final String getModuleName() {
        return "restrict_list";
    }

    public final void BUI(String str) {
        C52902Qq A012 = C52902Qq.A01(this.A00, str, "restrict_list_user_row", getModuleName());
        C52362Om r2 = new C52362Om(getActivity(), this.A00);
        r2.A02 = C18980sj.A00.A00().A02(A012.A03());
        r2.A02();
    }

    public static void A00(RestrictListFragment restrictListFragment, C109554nm r3) {
        switch (r3.ordinal()) {
            case 0:
                C17850qu A012 = C18320rf.A00.A01(restrictListFragment.A00);
                A012.A00 = new C109504ng(restrictListFragment);
                restrictListFragment.schedule(A012);
                return;
            case 1:
                return;
            default:
                throw new IllegalArgumentException("Unsupported tab type");
        }
    }

    public final void BTr(C13300iJ r8, Integer num) {
        switch (num.intValue()) {
            case 0:
                AnonymousClass6LX.A08(this.A04, "click", "add_account", r8);
                C18320rf.A00.A06(getContext(), AnonymousClass1L8.A00(this), this.A00, r8.getId(), new C109534nj(this));
                return;
            case 1:
                AnonymousClass6LX.A08(this.A04, "click", "remove_restricted_account", r8);
                C18320rf.A00.A07(getContext(), AnonymousClass1L8.A00(this), this.A00, r8.getId(), new C109524ni(this));
                return;
            default:
                return;
        }
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1391276577);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A00 = A06;
        this.A04 = AnonymousClass0QT.A00(A06, this);
        this.A01 = new C110414pF(getRootActivity(), this.A00, this, getModuleName());
        C109554nm r0 = (C109554nm) bundle2.getSerializable("list_tab");
        AnonymousClass0a4.A06(r0);
        this.A02 = r0;
        A00(this, r0);
        AnonymousClass0Z0.A09(-248478393, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-254584183);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_restrict_list, viewGroup, false);
        ((ListView) inflate.findViewById(16908298)).setAdapter(this.A01);
        EmptyStateView emptyStateView = (EmptyStateView) inflate.findViewById(16908292);
        this.mEmptyStateView = emptyStateView;
        emptyStateView.A0N(getString(C0003R.string.no_restricted_accounts_message), AnonymousClass2Oq.EMPTY);
        emptyStateView.A0M(AnonymousClass2Oq.NOT_LOADED);
        emptyStateView.A0K(new C109544nk(this), AnonymousClass2Oq.ERROR);
        AnonymousClass0Z0.A09(1021452588, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(993463998);
        super.onDestroyView();
        this.mEmptyStateView = null;
        AnonymousClass0Z0.A09(-933464259, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1880860755);
        super.onPause();
        Iterator it = this.A03.A02.iterator();
        while (it.hasNext()) {
            RestrictListFragment restrictListFragment = (RestrictListFragment) ((WeakReference) it.next()).get();
            if (restrictListFragment == null || restrictListFragment == this) {
                it.remove();
            }
        }
        AnonymousClass0Z0.A09(1705696020, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-2004441339);
        super.onResume();
        C67182wk r2 = this.A03;
        r2.A02.add(new WeakReference(this));
        C67182wk.A00(r2, this);
        AnonymousClass0Z0.A09(1735582649, A022);
    }
}
