package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.18i  reason: invalid class name and case insensitive filesystem */
public final class C253218i extends Handler {
    public final /* synthetic */ AnonymousClass12C A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C253218i(AnonymousClass12C r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass12C.A05(this.A00);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("Unknown message what = ", i));
    }
}
