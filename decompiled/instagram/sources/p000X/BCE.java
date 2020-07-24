package p000X;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.BCE */
public final class BCE implements Runnable {
    public final /* synthetic */ LifecycleCallback A00;
    public final /* synthetic */ BCB A01;
    public final /* synthetic */ String A02;

    public BCE(BCB bcb, LifecycleCallback lifecycleCallback, String str) {
        this.A01 = bcb;
        this.A00 = lifecycleCallback;
        this.A02 = str;
    }

    public final void run() {
        Bundle bundle;
        BCB bcb = this.A01;
        if (bcb.A00 > 0) {
            LifecycleCallback lifecycleCallback = this.A00;
            Bundle bundle2 = bcb.A01;
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
