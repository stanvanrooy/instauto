package p000X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.BM0 */
public final class BM0 {
    public Handler A00;
    public HandlerThread A01;
    public int A02 = 0;
    public Handler.Callback A03 = new BM1(this);
    public final int A04 = 10000;
    public final Object A05 = new Object();
    public final int A06 = 10;
    public final String A07 = "fonts";

    public static void A00(BM0 bm0, Runnable runnable) {
        synchronized (bm0.A05) {
            if (bm0.A01 == null) {
                HandlerThread handlerThread = new HandlerThread(bm0.A07, bm0.A06);
                bm0.A01 = handlerThread;
                handlerThread.start();
                bm0.A00 = new Handler(bm0.A01.getLooper(), bm0.A03);
                bm0.A02++;
            }
            AnonymousClass0ZA.A02(bm0.A00, 0);
            Handler handler = bm0.A00;
            AnonymousClass0ZA.A0D(handler, handler.obtainMessage(1, runnable));
        }
    }
}
