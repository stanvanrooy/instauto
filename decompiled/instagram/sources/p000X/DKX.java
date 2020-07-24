package p000X;

import android.media.AudioRecord;
import android.os.Handler;

/* renamed from: X.DKX */
public final class DKX {
    public int A00;
    public int A01;
    public AudioRecord A02;
    public final Handler A03;
    public final C30048DOc A04;
    public final DKa A05;
    public final Runnable A06 = new DKY(this);
    public volatile Integer A07;

    public final synchronized void A01(C88443sQ r4, Handler handler) {
        A00(this, handler);
        this.A07 = Constants.ZERO;
        AnonymousClass0ZA.A0E(this.A03, new DKZ(this, r4, handler), 1037179280);
    }

    public static void A00(DKX dkx, Handler handler) {
        if (handler == null) {
            throw new IllegalArgumentException("The handler cannot be null");
        } else if (dkx.A03.getLooper() == handler.getLooper()) {
            throw new IllegalStateException("The handler must be on a separate thread then the recording one");
        }
    }

    public DKX(C30048DOc dOc, Handler handler, DKa dKa) {
        this.A04 = dOc;
        this.A03 = handler;
        this.A05 = dKa;
        this.A07 = Constants.ZERO;
        this.A00 = dOc.A00 ? 0 : 4096;
        int i = dOc.A02;
        if (i != 409600) {
            this.A01 = i;
            return;
        }
        C30048DOc dOc2 = this.A04;
        int minBufferSize = AudioRecord.getMinBufferSize(dOc2.A04, dOc2.A03, 2);
        this.A01 = minBufferSize;
        if (minBufferSize <= 0) {
            this.A01 = 409600;
            return;
        }
        int i2 = dOc.A01;
        this.A01 = Math.min((i2 <= 0 ? 2 : i2) * minBufferSize, 409600);
    }
}
