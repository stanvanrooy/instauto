package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BIX */
public final class BIX implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final C25439BKc A02;
    public final Object A03 = new Object();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A06 = new ArrayList();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C25437BKa bKa = (C25437BKa) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A04.contains(bKa)) {
                    bKa.Ay0(this.A02.AIf());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public BIX(Looper looper, C25439BKc bKc) {
        this.A02 = bKc;
        this.A01 = new C54202Wh(looper, this);
    }

    public final void A00(C25437BKa bKa) {
        AnonymousClass0a2.A02(bKa);
        synchronized (this.A03) {
            if (this.A04.contains(bKa)) {
                String valueOf = String.valueOf(bKa);
                StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.A04.add(bKa);
            }
        }
        if (this.A02.isConnected()) {
            Handler handler = this.A01;
            AnonymousClass0ZA.A0D(handler, handler.obtainMessage(1, bKa));
        }
    }

    public final void A01(BEH beh) {
        AnonymousClass0a2.A02(beh);
        synchronized (this.A03) {
            if (this.A06.contains(beh)) {
                String valueOf = String.valueOf(beh);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.A06.add(beh);
            }
        }
    }
}
