package p000X;

import java.util.Iterator;

/* renamed from: X.B2G */
public final class B2G implements Runnable {
    public final /* synthetic */ C25119B1s A00;

    public B2G(C25119B1s b1s) {
        this.A00 = b1s;
    }

    public final void run() {
        synchronized (this.A00.A06) {
            Iterator it = this.A00.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
