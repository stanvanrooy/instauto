package p000X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DKV */
public final class DKV implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKX A01;
    public final /* synthetic */ C88443sQ A02;

    public DKV(DKX dkx, C88443sQ r2, Handler handler) {
        this.A01 = dkx;
        this.A02 = r2;
        this.A00 = handler;
    }

    public final void run() {
        DKX dkx = this.A01;
        C88443sQ r5 = this.A02;
        Handler handler = this.A00;
        synchronized (dkx) {
            if (dkx.A07 != Constants.ONE) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("mState", DKU.A00(dkx.A07));
                DKO.A01(r5, handler, new IllegalStateException("prepare() must be called before starting audio recording."), hashMap);
            } else {
                if (!dkx.A04.A00) {
                    try {
                        dkx.A02.startRecording();
                    } catch (Exception e) {
                        DKO.A01(r5, handler, e, (Map) null);
                    }
                }
                dkx.A07 = Constants.A0C;
                AnonymousClass0ZA.A0E(dkx.A03, dkx.A06, 961245347);
                DKO.A00(r5, handler);
            }
        }
    }
}
