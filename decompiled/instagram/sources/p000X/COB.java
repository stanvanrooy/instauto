package p000X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;

/* renamed from: X.COB */
public final class COB implements CRB {
    public final /* synthetic */ COC A00;

    public COB(COC coc) {
        this.A00 = coc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 == 0) goto L_0x001c;
     */
    public final boolean Aei(C27702CNw cNw) {
        String str;
        boolean z;
        C13150hy.A02(cNw, "item");
        ProductSourceOverrideState productSourceOverrideState = this.A00.A00.A02;
        String str2 = null;
        if (productSourceOverrideState != null) {
            str = productSourceOverrideState.A02;
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence != null) {
            int length = charSequence.length();
            z = false;
        }
        z = true;
        if (!z) {
            ProductSourceOverrideState productSourceOverrideState2 = this.A00.A00.A02;
            if (productSourceOverrideState2 != null) {
                str2 = productSourceOverrideState2.A02;
            }
            C27781CQz cQz = cNw.A00;
            C13150hy.A01(cQz, "item.layoutContent");
            CR3 cr3 = cQz.A00;
            if (cr3 == null) {
                C13150hy.A00();
            }
            C13150hy.A01(cr3, "item.layoutContent.publi…ctListCollectionContent!!");
            CRA cra = cr3.A01;
            C13150hy.A01(cra, "item.layoutContent.publi…lectionContent!!.metaData");
            if (C13150hy.A05(str2, cra.A01)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void BFv(ProductCollectionTile productCollectionTile, C27702CNw cNw) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        if (!Aei(cNw)) {
            ProductSourceOverrideState productSourceOverrideState = this.A00.A00.A02;
            if (productSourceOverrideState == null) {
                C13150hy.A00();
            }
            ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState.A01;
            Context requireContext = this.A00.A00.requireContext();
            ProductSourceOverrideState productSourceOverrideState2 = this.A00.A00.A02;
            if (productSourceOverrideState2 == null) {
                C13150hy.A00();
            }
            productSourceOverrideStatus.A00(requireContext, productSourceOverrideState2.A00);
            return;
        }
        C27682CNb cNb = this.A00.A00;
        C13150hy.A02(productCollectionTile, "collectionTile");
        AnonymousClass0C1 r1 = (AnonymousClass0C1) cNb.A04.getValue();
        String str = productCollectionTile.A05;
        C27665CMj.A05(r1, C53502Ta.COLLECTION);
        C27665CMj.A00(r1).edit().putString("shopping_collection_id", str).apply();
        CNV cnv = cNb.A00;
        if (cnv == null) {
            C13150hy.A03("logger");
        }
        cnv.A02(new ProductSource(productCollectionTile.A05, C53502Ta.COLLECTION, productCollectionTile.A07));
        Intent intent = new Intent();
        FragmentActivity activity = cNb.getActivity();
        AnonymousClass0a4.A06(activity);
        if (activity == null) {
            C13150hy.A00();
        }
        activity.setResult(-1, intent);
        FragmentActivity activity2 = cNb.getActivity();
        if (activity2 == null) {
            C13150hy.A00();
        }
        activity2.finish();
    }
}
