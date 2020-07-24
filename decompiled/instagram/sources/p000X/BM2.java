package p000X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.BM2 */
public final class BM2 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ BLz A01;
    public final /* synthetic */ BM0 A02;
    public final /* synthetic */ Callable A03;

    public BM2(BM0 bm0, Callable callable, Handler handler, BLz bLz) {
        this.A02 = bm0;
        this.A03 = callable;
        this.A00 = handler;
        this.A01 = bLz;
    }

    public final void run() {
        Object obj;
        try {
            obj = this.A03.call();
        } catch (Exception unused) {
            obj = null;
        }
        AnonymousClass0ZA.A0E(this.A00, new BM3(this, obj), 606088017);
    }
}
