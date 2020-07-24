package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0jo  reason: invalid class name and case insensitive filesystem */
public final class C14130jo extends Handler {
    public final /* synthetic */ C14120jn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14130jo(C14120jn r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r6 >= r8) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r5 = r7[r6];
        r4 = r5.A01.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r3 >= r4) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        ((p000X.C24720AsN) r5.A01.get(r3)).A02.onReceive(r9.A00, r5.A00);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r6 = r6 + 1;
     */
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C14120jn r9 = this.A00;
        while (true) {
            synchronized (r9.A03) {
                int size = r9.A01.size();
                if (size > 0) {
                    C92763zg[] r7 = new C92763zg[size];
                    r9.A01.toArray(r7);
                    r9.A01.clear();
                } else {
                    return;
                }
            }
        }
        while (true) {
        }
    }
}
