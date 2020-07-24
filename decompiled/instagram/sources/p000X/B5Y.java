package p000X;

import android.util.Log;

/* renamed from: X.B5Y */
public final /* synthetic */ class B5Y implements Runnable {
    public final B5W A00;
    public final C25171B4r A01;

    public B5Y(B5W b5w, C25171B4r b4r) {
        this.A00 = b5w;
        this.A01 = b4r;
    }

    public final void run() {
        B5W b5w = this.A00;
        int i = this.A01.A01;
        synchronized (b5w) {
            C25171B4r b4r = (C25171B4r) b5w.A04.get(i);
            if (b4r != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                b5w.A04.remove(i);
                b4r.A01(new C25172B4s(3, "Timed out waiting for response"));
                b5w.A00();
            }
        }
    }
}
