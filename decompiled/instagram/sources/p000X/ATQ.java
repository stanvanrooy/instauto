package p000X;

import android.webkit.PermissionRequest;

/* renamed from: X.ATQ */
public final class ATQ implements Runnable {
    public final /* synthetic */ ATR A00;

    public ATQ(ATR atr) {
        this.A00 = atr;
    }

    public final void run() {
        ATR atr = this.A00;
        if (atr.A02.A0E) {
            PermissionRequest permissionRequest = atr.A01;
            permissionRequest.grant(permissionRequest.getResources());
            this.A00.A02.A0E = false;
        }
    }
}
