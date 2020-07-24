package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: X.0eW  reason: invalid class name and case insensitive filesystem */
public final class C11160eW extends Handler {
    public final /* synthetic */ C11150eV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11160eW(C11150eV r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        ArrayList<Object> arrayList;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C11150eV r4 = this.A00;
        synchronized (r4.A00) {
            arrayList = new ArrayList<>(r4.A00.size());
            for (Object add : r4.A00) {
                arrayList.add(add);
            }
            r4.A00.clear();
        }
        for (Object A002 : arrayList) {
            C11150eV.A00(r4, A002);
        }
    }
}
