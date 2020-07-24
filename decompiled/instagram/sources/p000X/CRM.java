package p000X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.CRM */
public final class CRM extends C27341Hl implements C27371Ho, AnonymousClass1HM {
    public InlineSearchBox A00;
    public AnonymousClass0C1 A01;
    public C27780CQy A02;
    public CRL A03;
    public C27679CMy A04;
    public String A05;
    public final C256319p A06 = new C27784CRc(this);
    public final AnonymousClass662 A07 = new CRU(this);
    public final CS4 A08 = new CRN(this);
    public final CS3 A09 = new CRK(this);
    public final CRS A0A = new CRS(this);
    public final CN0 A0B = new C27782CRa(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "shop_manager_add_products";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BlI(C0003R.string.add_shop_title);
        r3.A4H(C0003R.string.done, new AnonymousClass70Y(this));
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            this.A03.A04.A01();
            this.A00.A02();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1597211169);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A01 = AnonymousClass0J1.A06(bundle2);
        String string = requireArguments().getString("waterfall_id");
        AnonymousClass0a4.A06(string);
        this.A05 = string;
        String string2 = requireArguments().getString("prior_module");
        AnonymousClass0a4.A06(string2);
        AnonymousClass0C1 r3 = this.A01;
        CRL crl = new CRL(r3, requireContext(), AnonymousClass1L8.A00(this), new C27797CRp(r3, this, this.A05, string2));
        this.A03 = crl;
        C13150hy.A02("", "query");
        CRL.A00(crl, new C27783CRb(""));
        crl.A04.A04("");
        AnonymousClass0Z0.A09(1756438167, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1496999179);
        View inflate = layoutInflater.inflate(C0003R.layout.shop_management_add_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-474610390, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1794369738);
        super.onDestroy();
        this.A00.A04();
        AnonymousClass0Z0.A09(1537060625, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1467437250);
        super.onDestroyView();
        this.A03.A01 = null;
        AnonymousClass0Z0.A09(-1750287684, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02 = new C27780CQy(getContext(), this.A09, this.A08);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        recyclerView.A0w(this.A06);
        recyclerView.setAdapter(this.A02.A00.A00);
        C31321Xp r0 = new C31321Xp();
        r0.A0J();
        recyclerView.setItemAnimator(r0);
        InlineSearchBox inlineSearchBox = (InlineSearchBox) view.findViewById(C0003R.C0005id.search_box);
        this.A00 = inlineSearchBox;
        inlineSearchBox.setListener(this.A07);
        recyclerView.A0w(new C61622m6(this.A03, C29621Qp.PRODUCT, recyclerView.A0L));
        this.A04 = new C27679CMy(this.A0B, view);
        CRL crl = this.A03;
        CRS crs = this.A0A;
        crl.A01 = crs;
        if (crs != null) {
            CQN cqn = crl.A00;
            ProductSource productSource = cqn.A00;
            if (productSource != null) {
                crs.A00.A04.A00(productSource);
            }
            C27780CQy cQy = crs.A00.A02;
            C13150hy.A02(cqn, "state");
            cQy.A00.A00(cqn);
        }
    }
}
