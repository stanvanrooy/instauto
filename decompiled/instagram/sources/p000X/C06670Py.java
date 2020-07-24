package p000X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Iterator;

/* renamed from: X.0Py  reason: invalid class name and case insensitive filesystem */
public final class C06670Py implements Runnable {
    public final /* synthetic */ C05850Mk A00;

    public C06670Py(C05850Mk r1) {
        this.A00 = r1;
    }

    public final void run() {
        this.A00.A01 = AwakeTimeSinceBootClock.INSTANCE.now();
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("notifyAppBackgrounded", -594607637);
        }
        try {
            Iterator it = this.A00.A05.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0Q6) it.next()).onAppBackgrounded();
            }
            Iterator it2 = this.A00.A04.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass0Q6) it2.next()).onAppBackgrounded();
            }
            while (true) {
                AnonymousClass0O9 r1 = (AnonymousClass0O9) this.A00.A03.poll();
                if (r1 == null) {
                    break;
                }
                this.A00.A02.ADc(r1);
            }
        } finally {
            C05850Mk.A00(this.A00, "postbackground");
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(1664064322);
            }
        }
    }
}
