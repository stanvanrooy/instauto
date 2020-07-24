package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.ADZ */
public final class ADZ extends Handler {
    public final /* synthetic */ ADR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ADZ(ADR adr, Looper looper) {
        super(looper);
        this.A00 = adr;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 99) {
            ADR.A00(this.A00);
            return;
        }
        throw new RuntimeException(AnonymousClass000.A05("Unknown message: ", i));
    }
}
