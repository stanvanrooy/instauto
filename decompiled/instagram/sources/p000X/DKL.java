package p000X;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: X.DKL */
public final class DKL implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKK A01;
    public final /* synthetic */ DKT A02;

    public DKL(DKK dkk, DKT dkt, Handler handler) {
        this.A01 = dkk;
        this.A02 = dkt;
        this.A00 = handler;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0032 */
    public final void run() {
        DKK dkk = this.A01;
        DKT dkt = this.A02;
        Handler handler = this.A00;
        if (dkk.A06 != Constants.ZERO) {
            DKO.A03(dkt, handler, new IllegalStateException(AnonymousClass000.A0E("Must only call prepare() on a stopped AudioEncoder. Current state is: ", DKQ.A00(dkk.A06))));
            return;
        }
        dkk.A01 = C201528jt.A00("audio/mp4a-latm", DKK.A00(dkk.A04, false), (MediaCodec.Callback) null);
        try {
            dkk.A01 = C201528jt.A00("audio/mp4a-latm", DKK.A00(dkk.A04, true), (MediaCodec.Callback) null);
            dkk.A06 = Constants.ONE;
            DKO.A02(dkt, handler);
        } catch (Exception e) {
            DKO.A03(dkt, handler, e);
        }
    }
}
