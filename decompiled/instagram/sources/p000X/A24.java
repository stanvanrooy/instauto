package p000X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseProtectionSheetModule;

/* renamed from: X.A24 */
public final class A24 implements Runnable {
    public final /* synthetic */ IgReactPurchaseProtectionSheetModule A00;

    public A24(IgReactPurchaseProtectionSheetModule igReactPurchaseProtectionSheetModule) {
        this.A00 = igReactPurchaseProtectionSheetModule;
    }

    public final void run() {
        C17510qM.A00.A0w((FragmentActivity) this.A00.getCurrentActivity(), this.A00.mUserSession);
    }
}
