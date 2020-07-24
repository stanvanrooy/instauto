package p000X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.BCD */
public final class BCD implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ BCA A01;
    public final /* synthetic */ String A02;

    public BCD(BCA bca, LifecycleCallback lifecycleCallback, String str) {
        this.A01 = bca;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        BCA bca = this.A01;
        if (bca.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = bca.A01;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.A02);
            } else {
                bundle = null;
            }
            lifecycleCallback.A02(bundle);
        }
        if (this.A01.A00 >= 2) {
            this.A00.A05();
        }
        if (this.A01.A00 >= 4) {
            this.A00.A06();
        }
    }
}
