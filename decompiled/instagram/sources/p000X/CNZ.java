package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import java.util.List;

/* renamed from: X.CNZ */
public final class CNZ extends C27341Hl implements C27371Ho, AnonymousClass1HK, C67692xg, C52382Oo, AnonymousClass1HM, AnonymousClass662 {
    public static final C53502Ta A0D = C53502Ta.BRAND;
    public InlineSearchBox A00;
    public AnonymousClass0C1 A01;
    public C27698CNs A02;
    public CNV A03;
    public AnonymousClass9T1 A04;
    public ProductSourceOverrideState A05;
    public String A06;
    public C67712xi A07;
    public C27705CNz A08;
    public final C256319p A09 = new CNY(this);
    public final COA A0A = new CNW(this);
    public final CO7 A0B = new C27683CNc(this);
    public final C27703CNx A0C = new C27696CNq(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void BDV() {
    }

    public final void Bel() {
    }

    public final String getModuleName() {
        return "product_source_selection";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final boolean AgL() {
        return this.A08.AgL();
    }

    public final void BDh() {
        if (this.A02.isEmpty() && !this.A08.AgL()) {
            BZS(false);
        }
        this.A03.A01 = A0D;
    }

    public final void BZS(boolean z) {
        C27705CNz.A00(this.A08, true);
        this.A04.Bse();
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        String str = this.A06;
        if (str == null || !str.equals("entry_point_creator_swipe_up_to_shop")) {
            r3.BlI(C0003R.string.product_source_selection_title);
        } else {
            r3.BlI(C0003R.string.profile_shop_selection_title);
        }
        r3.Bo0(true);
        r3.Bo6(true);
    }

    public final boolean onBackPressed() {
        CNV cnv = this.A03;
        CNV.A01(cnv, CNV.A00(cnv, "product_source_selection_canceled"));
        return false;
    }

    public final void onSearchCleared(String str) {
        this.A00.A04();
    }

    public final void onSearchTextChanged(String str) {
        if (str != null) {
            this.A07.Bjv(str);
        }
    }

    public final void BGZ(C67712xi r4) {
        C27698CNs cNs = this.A02;
        cNs.A00.clear();
        cNs.A00.addAll((List) r4.AUa());
        cNs.A0J();
        this.A04.Bse();
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2042816333);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AnonymousClass0J1.A06(requireArguments);
        this.A06 = requireArguments.getString("brand_selection_entry_point");
        C27705CNz cNz = new C27705CNz(this.A0B, this.A01, getContext(), AnonymousClass1L8.A00(this), this.A06);
        this.A08 = cNz;
        Context context = getContext();
        C27704CNy cNy = new C27704CNy(cNz, context, this.A0C);
        this.A04 = cNy;
        this.A02 = new C27698CNs(context, this.A0A, cNy);
        this.A05 = (ProductSourceOverrideState) requireArguments.getParcelable("product_source_override_state");
        CNV cnv = new CNV(this.A01, this, requireArguments.getBoolean("is_tabbed", false), requireArguments.getString("prior_module_name"), requireArguments.getString("entry_point"), requireArguments.getString("waterfall_id"));
        this.A03 = cnv;
        cnv.A06(requireArguments.getString("initial_tab"), C27665CMj.A01(this.A01), A0D);
        AnonymousClass0C1 r9 = this.A01;
        C67722xj r3 = new C67722xj(new C28351Lj(getContext(), AnonymousClass1L8.A00(this)), new C27689CNj(r9), new C68342yv(), true, true, r9);
        this.A07 = r3;
        r3.BiZ(this);
        BZS(false);
        AnonymousClass0Z0.A09(373691881, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        int A022 = AnonymousClass0Z0.A02(1524531152);
        if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.SHOPPING_ANDROID_BRAND_SELECTION_SEARCH, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            inflate = layoutInflater.inflate(C0003R.layout.layout_brand_selection_fragment, viewGroup, false);
            i = 558158450;
        } else {
            inflate = layoutInflater.inflate(C0003R.layout.layout_recyclerview, viewGroup, false);
            i = 1810029761;
        }
        AnonymousClass0Z0.A09(i, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(82703615);
        super.onDestroy();
        InlineSearchBox inlineSearchBox = this.A00;
        if (inlineSearchBox != null) {
            inlineSearchBox.A04();
        }
        AnonymousClass0Z0.A09(1353846949, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.SHOPPING_ANDROID_BRAND_SELECTION_SEARCH, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            InlineSearchBox inlineSearchBox = (InlineSearchBox) view.findViewById(C0003R.C0005id.search_box);
            this.A00 = inlineSearchBox;
            inlineSearchBox.setListener(this);
            recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
            recyclerView.A0w(this.A09);
        } else {
            recyclerView = (RecyclerView) view;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.A02);
        recyclerView.A0w(new C61622m6(this.A08, C29621Qp.LIST, linearLayoutManager));
    }
}
