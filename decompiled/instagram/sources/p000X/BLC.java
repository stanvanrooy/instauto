package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.BLC */
public final class BLC implements C29792DAb {
    public final Handler A00;

    public final Looper APT() {
        return this.A00.getLooper();
    }

    public final Message AqK(int i, int i2, int i3) {
        return this.A00.obtainMessage(i, i2, i3);
    }

    public final Message AqL(int i, int i2, int i3, Object obj) {
        return this.A00.obtainMessage(i, i2, i3, obj);
    }

    public final Message AqM(int i, Object obj) {
        return this.A00.obtainMessage(i, obj);
    }

    public final void Bb9(int i) {
        AnonymousClass0ZA.A02(this.A00, i);
    }

    public final boolean BfD(int i) {
        return AnonymousClass0ZA.A0B(this.A00, i);
    }

    public final boolean BfE(int i, long j) {
        return AnonymousClass0ZA.A0C(this.A00, i, j);
    }

    public BLC(Handler handler) {
        this.A00 = handler;
    }
}
