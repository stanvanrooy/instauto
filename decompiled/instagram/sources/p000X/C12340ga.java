package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0ga  reason: invalid class name and case insensitive filesystem */
public final class C12340ga extends Handler {
    public C12190gK A00;
    public final C12240gQ A01;

    public final void handleMessage(Message message) {
        C12240gQ r2;
        Object obj = message.obj;
        if (obj instanceof C12390gf) {
            C12390gf r4 = (C12390gf) obj;
            try {
                if (r4.BaM(true) && (r2 = this.A01) != null) {
                    r2.A00(r4, message.arg1, message.arg2, true);
                }
            } catch (Exception e) {
                this.A00.A05(r4, e);
            }
        }
    }

    public C12340ga(Looper looper, C12190gK r2, C12240gQ r3) {
        super(looper);
        this.A00 = r2;
        this.A01 = r3;
    }
}
