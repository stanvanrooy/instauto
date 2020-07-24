package p000X;

import android.content.Context;
import android.content.Intent;
import com.facebook.C0003R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CQ9 */
public final class CQ9 implements C27767CQl {
    public final /* synthetic */ CQ8 A00;

    public CQ9(CQ8 cq8) {
        this.A00 = cq8;
    }

    public final void A9V(ProductCollectionTile productCollectionTile, CRA cra) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cra, "metadata");
        Intent intent = new Intent();
        intent.putExtra("merchant_id", cra.A01);
        intent.putExtra("product_collection_id", productCollectionTile.A05);
        intent.putExtra(AnonymousClass0C5.$const$string(375), productCollectionTile.A03.toString());
        intent.putExtra(C193418Ps.$const$string(136), productCollectionTile.A07);
        AnonymousClass1HD targetFragment = this.A00.getTargetFragment();
        if (targetFragment == null) {
            C13150hy.A00();
        }
        targetFragment.onActivityResult(11, -1, intent);
        this.A00.requireActivity().onBackPressed();
    }

    public final void BCj() {
        AnonymousClass5F9.A00(this.A00.getContext(), C0003R.string.network_error);
    }

    public final void BOq(C27766CQk cQk) {
        C13150hy.A02(cQk, "state");
        ((C27773CQr) this.A00.A00.getValue()).A00(cQk);
    }

    public final void BoB(String str, String str2) {
        C13150hy.A02(str, DialogModule.KEY_TITLE);
        C13150hy.A02(str2, "description");
        Context requireContext = this.A00.requireContext();
        C13150hy.A01(requireContext, "requireContext()");
        CQA.A02(requireContext, str, str2);
    }

    public final void Bod(String str) {
        C13150hy.A02(str, "taggedBusinessPartnerUsername");
        Context requireContext = this.A00.requireContext();
        C13150hy.A01(requireContext, "requireContext()");
        CQA.A00(requireContext, str);
    }

    public final void Boe(String str) {
        C13150hy.A02(str, "taggedMerchantUsername");
        Context requireContext = this.A00.requireContext();
        C13150hy.A01(requireContext, "requireContext()");
        CQA.A01(requireContext, str);
    }
}
