package p000X;

import android.content.Context;

/* renamed from: X.ATN */
public final class ATN implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ATL A01;

    public ATN(ATL atl, Context context) {
        this.A01 = atl;
        this.A00 = context;
    }

    public final void run() {
        ATL atl = this.A01;
        Context context = this.A00;
        int i = atl.A00 - 1;
        atl.A00 = i;
        if (i == 0 && atl.A01 != null) {
            if (atl.A06 != null) {
                synchronized (atl) {
                    if (atl.A04 != null) {
                        AnonymousClass09Q.A08("main_process_state");
                        AnonymousClass09Q.A08("main_process_num_deaths");
                        atl.A04 = null;
                    }
                }
                AnonymousClass0ZI.A01(context, atl.A01, 1388711253);
            }
            atl.A03.quit();
            atl.A01 = null;
            atl.A06 = null;
            atl.A03 = null;
            atl.A02 = null;
        }
    }
}
