package com.instagram.shopping.fragment.postpurchase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass48W;
import p000X.C06590Pq;
import p000X.C100374Vm;
import p000X.C27341Hl;

public class ProductSharePickerFragment extends C27341Hl {
    public AnonymousClass0C1 A00;
    public C100374Vm A01;
    public final AnonymousClass48W A02 = new AnonymousClass48W(this);
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "instagram_shopping_product_share_picker";
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1949537405);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A00 = AnonymousClass0J1.A06(bundle2);
        this.A01 = new C100374Vm(this.A02, bundle2.getParcelableArrayList("post_purchase_products"), getModuleName());
        AnonymousClass0Z0.A09(-697176260, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2117877323);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_recyclerview, viewGroup, false);
        AnonymousClass0Z0.A09(446941423, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.mRecyclerView.setAdapter(this.A01);
    }
}
