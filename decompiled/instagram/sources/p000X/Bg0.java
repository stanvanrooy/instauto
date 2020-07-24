package p000X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Bg0 */
public final class Bg0 implements Runnable {
    public final /* synthetic */ C2102594w A00;
    public final /* synthetic */ C26162Bgg A01;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A02;

    public Bg0(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, C26162Bgg bgg, C2102594w r3) {
        this.A02 = igReactPurchaseExperienceBridgeModule;
        this.A01 = bgg;
        this.A00 = r3;
    }

    public final void run() {
        try {
            FragmentActivity fragmentActivity = (FragmentActivity) this.A02.getCurrentActivity();
            AnonymousClass0a4.A06(fragmentActivity);
            C26162Bgg bgg = this.A01;
            Bundle bundle = new Bundle();
            bundle.putString("AUTH_METHOD_TYPE", "PIN");
            bundle.putString("PAYMENT_TYPE", bgg.A02);
            bundle.putString("PAYMENT_LOGGING_ID", bgg.A00);
            bundle.putStringArray("PTT_UTIL_CAP_NAMES", (String[]) bgg.A03.toArray(new String[0]));
            if (!TextUtils.isEmpty(bgg.A01)) {
                bundle.putString("SIGN_DATA_BY_AUTH_TICKET_DATA", bgg.A01);
                bundle.putString("AUTH_EXTENSION_ID", "SIGN_DATA_BY_AUTH_TICKET");
            }
            C26116Bft.A02("VERIFY_PIN_TO_PAY", bundle);
            C26145BgP bgP = new C26145BgP(bundle);
            C26170Bgo A002 = AnonymousClass11G.A00();
            new C26123Bg1(A002, A002.A03, fragmentActivity, C019000b.A05(fragmentActivity), (C26155BgZ) new ACn(this)).A00(bgP);
        } catch (IllegalArgumentException e) {
            this.A00.reject((Throwable) e);
        }
    }
}
