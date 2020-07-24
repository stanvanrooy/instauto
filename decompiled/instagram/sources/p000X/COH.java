package p000X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.p009ui.widget.spinner.RefreshSpinner;
import java.util.List;

/* renamed from: X.COH */
public final class COH extends C27341Hl implements C27371Ho, C67692xg, AnonymousClass1HM, AnonymousClass662 {
    public InlineSearchBox A00;
    public AnonymousClass0C1 A01;
    public COD A02;
    public COP A03;
    public COL A04;
    public BY6 A05;
    public RefreshSpinner A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public C67712xi A09;
    public final C27286C7a A0A = new COO(this);
    public final C256319p A0B = new COT(this);
    public final BY8 A0C = new COK(this);
    public final C27708COc A0D = new C27708COc(this);
    public final C27707COb A0E = new C27707COb(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "product_tagging_shopping_partners";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void BGZ(C67712xi r4) {
        COD cod = this.A02;
        cod.A00.clear();
        cod.A00.addAll((List) r4.AUa());
        cod.A0J();
    }

    public final void onSearchCleared(String str) {
        this.A00.A04();
        this.A04.A00();
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.shopping_partners_title);
        r2.Bo0(true);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2107665660);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A01 = A062;
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        this.A04 = new COL(this.A0D, A062, context, AnonymousClass1L8.A00(this));
        this.A05 = new BY6(this.A0C, this.A01, context, AnonymousClass1L8.A00(this));
        this.A02 = new COD(context, this.A0E, this.A04);
        AnonymousClass0C1 r9 = this.A01;
        this.A03 = new COP(r9, this);
        C28351Lj r4 = new C28351Lj(getContext(), AnonymousClass1L8.A00(this));
        C13150hy.A02(r9, "userSession");
        C13150hy.A02(r4, AnonymousClass0C5.$const$string(121));
        C67722xj r3 = new C67722xj(r4, new CN5(r9), new C68342yv(), true, true, r9);
        this.A09 = r3;
        r3.BiZ(this);
        AnonymousClass0Z0.A09(-809523120, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(796522613);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_highlight_products_for_partners_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1958386565, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1850827873);
        super.onDestroy();
        this.A00.A04();
        AnonymousClass0Z0.A09(916441600, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(2006332517);
        super.onPause();
        this.A00.A04();
        AnonymousClass0Z0.A09(-960224151, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-386728778);
        super.onResume();
        if (this.A08) {
            this.A08 = false;
            this.A04.A00();
        }
        AnonymousClass0Z0.A09(1848283951, A022);
    }

    public final void onSearchTextChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            onSearchCleared(str);
        } else {
            this.A09.Bjv(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InlineSearchBox inlineSearchBox = (InlineSearchBox) view.findViewById(C0003R.C0005id.search_box);
        this.A00 = inlineSearchBox;
        inlineSearchBox.setListener(this);
        if (!((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.SHOPPING_ANDROID_APPROVED_ACCOUNTS_SEARCH, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
            this.A00.setVisibility(8);
        }
        ((TextView) view.findViewById(C0003R.C0005id.highlight_products_header_learn_more)).setOnClickListener(new COR(this));
        View findViewById = view.findViewById(C0003R.C0005id.add_partner_row);
        ((CircularImageView) findViewById.findViewById(C0003R.C0005id.add_partner_plus_button)).setColorFilter(C019000b.A00(getContext(), C0003R.color.blue_5), PorterDuff.Mode.SRC_IN);
        findViewById.setOnClickListener(new COQ(this));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.A02);
        recyclerView.A0w(this.A0B);
        this.A06 = (RefreshSpinner) view.findViewById(C0003R.C0005id.loading_spinner);
        if (!this.A04.Abq() && !this.A07) {
            this.A04.A00();
        }
    }
}
