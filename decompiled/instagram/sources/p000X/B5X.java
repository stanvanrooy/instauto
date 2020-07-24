package p000X;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: X.B5X */
public final /* synthetic */ class B5X implements Handler.Callback {
    public final B5W A00;

    public B5X(B5W b5w) {
        this.A00 = b5w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r2 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r2.getBoolean(p000X.AnonymousClass0C5.$const$string(133), false) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r3.A01(new p000X.C25172B4s(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r3.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    public final boolean handleMessage(Message message) {
        B5W b5w = this.A00;
        int i = message.arg1;
        Log.isLoggable("MessengerIpcClient", 3);
        synchronized (b5w) {
            C25171B4r b4r = (C25171B4r) b5w.A04.get(i);
            if (b4r == null) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Received response for unknown request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                return true;
            }
            b5w.A04.remove(i);
            b5w.A00();
        }
    }
}
