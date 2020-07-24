package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.CQ8 */
public final class CQ8 extends C27341Hl implements C27371Ho, AnonymousClass1HM {
    public final C18750sM A00 = C29041Oj.A00(new CQE(this));
    public final C18750sM A01 = C29041Oj.A00(new CQC(this));
    public final C18750sM A02 = C29041Oj.A00(new CQY(this));
    public final CQ9 A03 = new CQ9(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "product_collection_picker";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        C13150hy.A02(r2, "configurer");
        r2.BlI(C0003R.string.product_collection_picker_title);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        AnonymousClass0C1 r1 = (AnonymousClass0C1) this.A02.getValue();
        C13150hy.A01(r1, "userSession");
        return r1;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C13150hy.A02(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0003R.C0005id.search_box);
        C13150hy.A01(findViewById, "view.findViewById(R.id.search_box)");
        InlineSearchBox inlineSearchBox = (InlineSearchBox) findViewById;
        inlineSearchBox.setListener(new C27756CQa(this));
        inlineSearchBox.setImeOptions(6);
        View findViewById2 = view.findViewById(C0003R.C0005id.recycler_view);
        C13150hy.A01(findViewById2, C193418Ps.$const$string(13));
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        C31341Xr r0 = recyclerView.A0K;
        if (r0 != null) {
            ((C31331Xq) r0).A0J();
            recyclerView.setAdapter(((C27773CQr) this.A00.getValue()).A00);
            recyclerView.A0w(new AnonymousClass5AC(inlineSearchBox));
            recyclerView.A0w(new C61622m6((C27763CQh) this.A01.getValue(), C29621Qp.PRODUCT, recyclerView.A0L));
            C27763CQh cQh = (C27763CQh) this.A01.getValue();
            CQ9 cq9 = this.A03;
            cQh.A01 = cq9;
            if (cq9 != null) {
                cq9.BOq(cQh.A00);
                return;
            }
            return;
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-406415292);
        super.onCreate(bundle);
        ((C27763CQh) this.A01.getValue()).A02("");
        AnonymousClass0Z0.A09(1280491710, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(79875888);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.product_collection_picker_fragment, viewGroup, false);
        C13150hy.A01(inflate, C193418Ps.$const$string(8));
        AnonymousClass0Z0.A09(2110840149, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1304753780);
        super.onDestroyView();
        ((C27763CQh) this.A01.getValue()).A01 = null;
        AnonymousClass0Z0.A09(-612291725, A022);
    }
}
