package p000X;

import java.util.Iterator;

/* renamed from: X.B2H */
public final class B2H implements Runnable {
    public final /* synthetic */ C25119B1s A00;

    public B2H(C25119B1s b1s) {
        this.A00 = b1s;
    }

    public final void run() {
        synchronized (this.A00.A03) {
            Iterator it = this.A00.A03.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
