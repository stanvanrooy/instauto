package p000X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.1Pa  reason: invalid class name and case insensitive filesystem */
public final class C29211Pa {
    public static final Executor A07 = new C29221Pb();
    public int A00;
    public Executor A01;
    public List A02;
    public List A03 = Collections.emptyList();
    public final C29271Pg A04;
    public final C29241Pd A05;
    public final List A06 = new CopyOnWriteArrayList();

    public final void A00(List list, Runnable runnable) {
        int i = this.A00 + 1;
        this.A00 = i;
        List list2 = this.A02;
        List list3 = list;
        Runnable runnable2 = runnable;
        if (list != list2) {
            if (list == null) {
                int size = list2.size();
                this.A02 = null;
                this.A03 = Collections.emptyList();
                this.A05.BIS(0, size);
            } else if (list2 == null) {
                this.A02 = list;
                this.A03 = Collections.unmodifiableList(list);
                this.A05.B7Z(0, list.size());
            } else {
                AnonymousClass0Z9.A03(this.A04.A01, new C46231zO(this, list2, list3, i, runnable2), -1589503485);
                return;
            }
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C29211Pa(C29241Pd r2, C29271Pg r3) {
        this.A05 = r2;
        this.A04 = r3;
        this.A01 = A07;
    }
}
