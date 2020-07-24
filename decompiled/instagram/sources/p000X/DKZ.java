package p000X;

import android.media.AudioRecord;
import android.os.Handler;

/* renamed from: X.DKZ */
public final class DKZ implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKX A01;
    public final /* synthetic */ C88443sQ A02;

    public DKZ(DKX dkx, C88443sQ r2, Handler handler) {
        this.A01 = dkx;
        this.A02 = r2;
        this.A00 = handler;
    }

    public final void run() {
        DKX dkx = this.A01;
        C88443sQ r2 = this.A02;
        Handler handler = this.A00;
        synchronized (dkx) {
            AudioRecord audioRecord = dkx.A02;
            if (audioRecord != null) {
                audioRecord.release();
            }
            dkx.A02 = null;
            DKO.A00(r2, handler);
        }
    }
}
