package p000X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.BH1 */
public final class BH1 implements Runnable {
    public final /* synthetic */ ConnectionResult A00;
    public final /* synthetic */ C25369BGh A01;

    public BH1(C25369BGh bGh, ConnectionResult connectionResult) {
        this.A01 = bGh;
        this.A00 = connectionResult;
    }

    public final void run() {
        this.A01.Ay4(this.A00);
    }
}
