package com.instagram.shopping.fragment.variantselector;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass8TO;
import p000X.AnonymousClass9J8;
import p000X.AnonymousClass9JL;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C27341Hl;

public class MultiVariantSelectorLoadingFragment extends C27341Hl {
    public AnonymousClass0C1 A00;
    public AnonymousClass9JL A01;
    public String A02;
    public String A03;
    public EmptyStateView mEmptyStateView;

    public final String getModuleName() {
        return "multi_variant_selector_loading";
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-709850966);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A00 = AnonymousClass0J1.A06(bundle2);
        this.A03 = bundle2.getString("product_id");
        this.A02 = bundle2.getString("merchant_id");
        AnonymousClass0Z0.A09(1456951960, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1928075675);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_empty_state, viewGroup, false);
        AnonymousClass0Z0.A09(-1176040588, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(436504481);
        super.onDestroyView();
        this.mEmptyStateView = null;
        AnonymousClass0Z0.A09(-1831071057, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyStateView = (EmptyStateView) view.findViewById(16908292);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        int i = bundle2.getInt("arg_fixed_height");
        if (i > 0) {
            C06220Of.A0K(this.mEmptyStateView, i);
        }
        this.mEmptyStateView.A0M(AnonymousClass2Oq.LOADING);
        AnonymousClass8TO.A01(getActivity(), AnonymousClass1L8.A00(this), this.A00, this.A03, this.A02, new AnonymousClass9J8(this));
    }
}
