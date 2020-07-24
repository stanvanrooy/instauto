package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.1zl  reason: invalid class name and case insensitive filesystem */
public final class C46451zl extends AnonymousClass0O9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C46431zj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46451zl(C46431zj r2, Context context) {
        super(140);
        this.A01 = r2;
        this.A00 = context;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ACTION_WARM_UP_WEBVIEW", !this.A01.A01);
        Context context = this.A00;
        boolean z = this.A01.A02;
        if (!z) {
            ATJ.A01(context, "ACTION_WARM_UP", bundle, z);
        }
    }
}
