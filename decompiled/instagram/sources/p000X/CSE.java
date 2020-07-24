package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.CSE */
public final class CSE extends C27341Hl implements C27371Ho, AnonymousClass1HM {
    public InlineSearchBox A00;
    public CSO A01;
    public CSI A02;
    public AnonymousClass0C1 A03;
    public String A04;
    public final C256319p A05 = new C27832CSy(this);
    public final AnonymousClass662 A06 = new C27808CSa(this);
    public final CRB A07 = new CSF(this);
    public final C27839CTf A08 = new CTC(this);
    public final CSD A09 = new CSD(this);
    public final CTX A0A = new CTX(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "shop_manager_add_collections";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BlI(C0003R.string.add_collection_title);
        r3.A4H(C0003R.string.done, new AnonymousClass70X(this));
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-67643826);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = AnonymousClass0J1.A06(requireArguments);
        String string = requireArguments.getString("waterfall_id");
        AnonymousClass0a4.A06(string);
        this.A04 = string;
        String string2 = requireArguments.getString("prior_module");
        AnonymousClass0a4.A06(string2);
        AnonymousClass0C1 r1 = this.A03;
        CSI csi = new CSI(r1, new CTJ(r1, this, this.A04, string2));
        this.A02 = csi;
        C13150hy.A02("", "query");
        CSI.A00(csi, new C27833CSz(""));
        csi.A05.A04("");
        AnonymousClass0Z0.A09(-220591677, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1083477783);
        View inflate = layoutInflater.inflate(C0003R.layout.shop_management_add_collection_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1092087402, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1870339970);
        super.onDestroyView();
        this.A02.A01 = null;
        AnonymousClass0Z0.A09(-1164766933, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = new CSO(requireContext(), this, this.A07, this.A08, this.A0A);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        recyclerView.A0w(this.A05);
        recyclerView.setAdapter(this.A01.A01);
        C31321Xp r0 = new C31321Xp();
        r0.A0J();
        recyclerView.setItemAnimator(r0);
        InlineSearchBox inlineSearchBox = (InlineSearchBox) view.findViewById(C0003R.C0005id.search_box);
        this.A00 = inlineSearchBox;
        inlineSearchBox.setListener(this.A06);
        inlineSearchBox.setImeOptions(6);
        recyclerView.A0w(new C61622m6(this.A02, C29621Qp.PRODUCT, recyclerView.A0L));
        CSI csi = this.A02;
        CSD csd = this.A09;
        csi.A01 = csd;
        if (csd != null) {
            csd.A00(csi.A00);
        }
    }
}
