package p000X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;

/* renamed from: X.CNA */
public final class CNA implements CN0 {
    public final /* synthetic */ CNB A00;

    public CNA(CNB cnb) {
        this.A00 = cnb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r6, p000X.AnonymousClass0L7.SHOPPING_ANDROID_SFC_CATALOG_SEGMENTS_PRODUCT_TAGGING, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r1.A02.A04().equals(r1.A08.A02) != false) goto L_0x0048;
     */
    public final void BG3() {
        boolean z;
        boolean z2;
        boolean A0E;
        if (CNB.A02(this.A00)) {
            C17510qM r8 = C17510qM.A00;
            CNB cnb = this.A00;
            FragmentActivity activity = cnb.getActivity();
            AnonymousClass0a4.A06(activity);
            AnonymousClass0C1 r10 = cnb.A02;
            String moduleName = cnb.getModuleName();
            String str = cnb.A0E;
            if (cnb.A0F && r10.A06.A0T() && !CNB.A03(cnb)) {
                z = true;
            }
            z = false;
            CNB cnb2 = this.A00;
            if (cnb2.A0F && cnb2.A02.A06.A0T() && !CNB.A03(cnb2)) {
                AnonymousClass0C1 r6 = cnb2.A02;
                if (!r6.A04().equals(cnb2.A08.A02)) {
                    z2 = true;
                }
            }
            z2 = false;
            CNB cnb3 = this.A00;
            if (((Boolean) AnonymousClass0L6.A03(cnb3.A02, AnonymousClass0L7.SHOPPING_ANDROID_SFC_CATALOG_SEGMENTS_PRODUCT_TAGGING, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                ProductSourceOverrideState productSourceOverrideState = cnb3.A08;
                if (productSourceOverrideState.A01 == ProductSourceOverrideStatus.ALREADY_TAGGED && productSourceOverrideState.A00.A00 != C53502Ta.CATALOG) {
                    A0E = false;
                    r8.A1H(activity, r10, false, moduleName, (String) null, str, (String) null, 1001, cnb, (FragmentActivity) null, z, z2, A0E, this.A00.A08);
                    return;
                }
            }
            A0E = C52952Qw.A0E(cnb3.A02);
            r8.A1H(activity, r10, false, moduleName, (String) null, str, (String) null, 1001, cnb, (FragmentActivity) null, z, z2, A0E, this.A00.A08);
            return;
        }
        CNB cnb4 = this.A00;
        ProductSourceOverrideState productSourceOverrideState2 = cnb4.A08;
        ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState2.A01;
        if (productSourceOverrideStatus != ProductSourceOverrideStatus.A05) {
            Context context = cnb4.getContext();
            AnonymousClass0a4.A06(context);
            productSourceOverrideStatus.A00(context, productSourceOverrideState2.A00);
        }
    }
}
