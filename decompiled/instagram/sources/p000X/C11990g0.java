package p000X;

import android.os.MessageQueue;

/* renamed from: X.0g0  reason: invalid class name and case insensitive filesystem */
public final class C11990g0 implements MessageQueue.IdleHandler {
    public final /* synthetic */ C11960fx A00;

    public C11990g0(C11960fx r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        C11960fx r2 = this.A00;
        r2.A01.A03 = true;
        C11960fx.A00(r2);
        return false;
    }
}
