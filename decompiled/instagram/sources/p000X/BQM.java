package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.BQM */
public final class BQM {
    public final LinkedBlockingDeque A00;
    public final int A01;

    public final synchronized Object A00() {
        if (this.A00.isEmpty()) {
            return null;
        }
        return this.A00.peekLast();
    }

    public final synchronized List A01() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final synchronized void A02(Object obj) {
        int remainingCapacity;
        if (this.A01 > 0) {
            if (!this.A00.isEmpty()) {
                synchronized (this) {
                    remainingCapacity = this.A00.remainingCapacity();
                }
                if (remainingCapacity == 0) {
                    this.A00.removeFirst();
                }
            }
            this.A00.offer(obj);
        }
    }

    public BQM(int i) {
        this.A00 = new LinkedBlockingDeque(i);
        this.A01 = i;
    }
}
