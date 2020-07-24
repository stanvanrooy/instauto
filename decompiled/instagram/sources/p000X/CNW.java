package p000X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;

/* renamed from: X.CNW */
public final class CNW implements COA {
    public final /* synthetic */ CNZ A00;

    public CNW(CNZ cnz) {
        this.A00 = cnz;
    }

    public final boolean AeU(CO9 co9) {
        ProductSourceOverrideState productSourceOverrideState = this.A00.A05;
        if (productSourceOverrideState == null || ((productSourceOverrideState != null && TextUtils.isEmpty(productSourceOverrideState.A02)) || AnonymousClass17M.A00(this.A00.A05.A02, co9.A02))) {
            return true;
        }
        return false;
    }

    public final void Atd(CO9 co9) {
        InlineSearchBox inlineSearchBox = this.A00.A00;
        if (inlineSearchBox != null) {
            inlineSearchBox.A04();
        }
        if (!AeU(co9)) {
            CNZ cnz = this.A00;
            ProductSourceOverrideState productSourceOverrideState = cnz.A05;
            productSourceOverrideState.A01.A00(cnz.getContext(), productSourceOverrideState.A00);
            return;
        }
        AnonymousClass0C1 r1 = this.A00.A01;
        String str = co9.A02;
        C27665CMj.A05(r1, C53502Ta.BRAND);
        C27665CMj.A00(r1).edit().putString("shopping_brand_id", str).apply();
        CNZ cnz2 = this.A00;
        if ("entry_point_creator_swipe_up_to_shop".equals(cnz2.A06)) {
            CNV cnv = cnz2.A03;
            cnv.A00 = new ProductSource(co9.A02, C53502Ta.BRAND);
            AnonymousClass0P4 A002 = CNV.A00(cnv, "merchant_selected");
            A002.A0G("merchant_id", co9.A02);
            A002.A0G("merchant_name", co9.A03);
            CNV.A01(cnv, A002);
        } else {
            cnz2.A03.A02(new ProductSource(co9.A02, C53502Ta.BRAND, co9.A03));
        }
        Intent intent = new Intent();
        intent.putExtra("brand_id", co9.A02);
        intent.putExtra(C193418Ps.$const$string(86), co9.A03);
        FragmentActivity activity = this.A00.getActivity();
        AnonymousClass0a4.A06(activity);
        activity.setResult(-1, intent);
        this.A00.getActivity().finish();
    }
}
