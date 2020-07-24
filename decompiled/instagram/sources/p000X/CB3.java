package p000X;

import java.util.Iterator;

/* renamed from: X.CB3 */
public final class CB3 implements Runnable {
    public final /* synthetic */ C29592D0x A00;
    public final /* synthetic */ C27379CAy A01;

    public CB3(C27379CAy cAy, C29592D0x d0x) {
        this.A01 = cAy;
        this.A00 = d0x;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            this.A01.A04((C27380CAz) it.next());
        }
    }
}
