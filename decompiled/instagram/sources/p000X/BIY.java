package p000X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.BIY */
public final class BIY extends C54202Wh {
    public final /* synthetic */ BIW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BIY(BIW biw, Looper looper) {
        super(looper);
        this.A00 = biw;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            BIW biw = this.A00;
            biw.A0E.lock();
            try {
                if (biw.A0K()) {
                    biw.A0B.A08 = true;
                    biw.A00.connect();
                }
            } finally {
                biw.A0E.unlock();
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            BIW.A01(this.A00);
        }
    }
}
