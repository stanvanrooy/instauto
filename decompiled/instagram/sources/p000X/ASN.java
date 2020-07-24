package p000X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.ASN */
public final class ASN implements Runnable {
    public final /* synthetic */ ASM A00;
    public final /* synthetic */ ATL A01;

    public ASN(ATL atl, ASM asm) {
        this.A01 = atl;
        this.A00 = asm;
    }

    public final void run() {
        ATL atl = this.A01;
        int i = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        while (atl.A06 == null) {
            try {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                Thread.sleep(10);
                i = i2;
            } catch (InterruptedException unused) {
            }
        }
        boolean z = false;
        if (atl.A06 != null) {
            z = true;
        }
        if (!z) {
            ATK.A00("BrowserLiteCallbacker", "Callback service is not available.", new Object[0]);
            return;
        }
        try {
            this.A00.A00(this.A01.A06);
        } catch (Exception e) {
            this.A00.A01(e);
        }
    }
}
