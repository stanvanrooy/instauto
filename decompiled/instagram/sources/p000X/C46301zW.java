package p000X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1zW  reason: invalid class name and case insensitive filesystem */
public final class C46301zW implements Runnable {
    public final /* synthetic */ C46231zO A00;
    public final /* synthetic */ C46291zV A01;

    public C46301zW(C46231zO r1, C46291zV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C46231zO r2 = this.A00;
        C29211Pa r3 = r2.A01;
        if (r3.A00 == r2.A00) {
            List list = r2.A03;
            C46291zV r1 = this.A01;
            Runnable runnable = r2.A02;
            r3.A02 = list;
            r3.A03 = Collections.unmodifiableList(list);
            r1.A02(r3.A05);
            Iterator it = r3.A06.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
