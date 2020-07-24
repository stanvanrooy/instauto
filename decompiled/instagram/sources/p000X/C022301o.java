package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.01o  reason: invalid class name and case insensitive filesystem */
public abstract class C022301o {
    public final List A00 = new ArrayList();

    public boolean A04() {
        return false;
    }

    public boolean A05() {
        return false;
    }

    public void A00(AnonymousClass0SX r3) {
        throw new AbstractMethodError("Method needs to be overridden");
    }

    public void A03(AnonymousClass0SY r3) {
        synchronized (this.A00) {
            this.A00.add(r3);
        }
    }

    public void A01(AnonymousClass0SX r1, Runnable runnable) {
        A00(r1);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void A02(AnonymousClass0SX r1, Runnable runnable, boolean z) {
        A01(r1, runnable);
    }
}
