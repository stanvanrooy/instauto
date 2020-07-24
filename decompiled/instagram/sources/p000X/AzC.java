package p000X;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

/* renamed from: X.AzC */
public final class AzC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ CustomTabsClient$2 A02;

    public AzC(CustomTabsClient$2 customTabsClient$2, int i, Bundle bundle) {
        this.A02 = customTabsClient$2;
        this.A00 = i;
        this.A01 = bundle;
    }

    public final void run() {
        this.A02.A01.A00(this.A00, this.A01);
    }
}
