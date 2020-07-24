package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CQB */
public final class CQB implements C27767CQl {
    public final /* synthetic */ CQF A00;

    public CQB(CQF cqf) {
        this.A00 = cqf;
    }

    public final void A9V(ProductCollectionTile productCollectionTile, CRA cra) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cra, "metadata");
        CQF cqf = this.A00;
        cqf.A0B = true;
        AnonymousClass7LG r3 = cqf.A01;
        if (r3 != null) {
            String str = cra.A01;
            C13150hy.A01(str, "metadata.merchantId");
            r3.A00(str, AnonymousClass10U.A00, productCollectionTile.A05);
        }
        this.A00.requireActivity().onBackPressed();
    }

    public final void BCj() {
        CQF cqf = this.A00;
        Context context = cqf.getContext();
        if (context == null) {
            C13150hy.A00();
        }
        C13150hy.A01(context, "context!!");
        if (cqf.isResumed()) {
            AnonymousClass5F9.A00(context, C0003R.string.network_error);
        }
    }

    public final void BOq(C27766CQk cQk) {
        C13150hy.A02(cQk, "state");
        C27773CQr cQr = this.A00.A04;
        if (cQr == null) {
            C13150hy.A03("collectionAdapterWrapper");
        }
        cQr.A00(cQk);
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
