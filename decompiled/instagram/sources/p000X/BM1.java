package p000X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.BM1 */
public final class BM1 implements Handler.Callback {
    public final /* synthetic */ BM0 A00;

    public BM1(BM0 bm0) {
        this.A00 = bm0;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            BM0 bm0 = this.A00;
            synchronized (bm0.A05) {
                try {
                    if (!bm0.A00.hasMessages(1)) {
                        bm0.A01.quit();
                        bm0.A01 = null;
                        bm0.A00 = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } else if (i == 1) {
            BM0 bm02 = this.A00;
            ((Runnable) message.obj).run();
            synchronized (bm02.A05) {
                try {
                    AnonymousClass0ZA.A02(bm02.A00, 0);
                    Handler handler = bm02.A00;
                    AnonymousClass0ZA.A06(handler, handler.obtainMessage(0), (long) bm02.A04);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            return true;
        }
        return true;
    }
}
