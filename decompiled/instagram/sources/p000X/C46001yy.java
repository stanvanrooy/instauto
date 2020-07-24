package p000X;

import java.util.Iterator;

/* renamed from: X.1yy  reason: invalid class name and case insensitive filesystem */
public final class C46001yy implements Runnable {
    public final /* synthetic */ C45831ye A00;

    public C46001yy(C45831ye r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C45781yU) it.next()).BFL();
        }
    }
}
