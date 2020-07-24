package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0Sk  reason: invalid class name and case insensitive filesystem */
public final class C07270Sk extends Handler {
    public final /* synthetic */ C10990eF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07270Sk(C10990eF r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            C10990eF r1 = this.A00;
            C10990eF.A01(r1, new C07300Sn(r1));
            C10990eF r12 = this.A00;
            C10990eF.A01(r12, new C07310So(r12));
        }
    }
}
