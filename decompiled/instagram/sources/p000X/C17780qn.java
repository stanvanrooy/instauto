package p000X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.0qn  reason: invalid class name and case insensitive filesystem */
public abstract class C17780qn extends AnonymousClass0O9 {
    public Exception A00;
    public Object A01;
    public List A02 = new ArrayList();
    public boolean A03;
    public final Object A04 = new Object();

    public C17780qn(int i) {
        super(i, 2, true, true);
    }

    public static C17780qn A00(int i, Callable callable) {
        return new C17790qo(i, callable);
    }

    private void A01() {
        synchronized (this.A04) {
            for (Runnable run : this.A02) {
                run.run();
            }
            this.A02 = null;
        }
    }

    public final C17780qn A02(int i, C16090o1 r3) {
        return new C17810qq(this, i, r3);
    }

    public final C17780qn A03(C16090o1 r2) {
        return A05(r2, C107604kP.A00);
    }

    public final C17780qn A05(C16090o1 r7, Executor executor) {
        boolean A0B;
        C156126ld r5 = new C156126ld();
        C107704kZ r4 = new C107704kZ(this, r5, r7);
        synchronized (this.A04) {
            A0B = A0B();
            if (!A0B) {
                this.A02.add(new C182507qo(this, executor, r4));
            }
        }
        if (A0B) {
            AnonymousClass0Z9.A03(executor, r4, 1074035732);
        }
        return r5.A00;
    }

    public final Exception A06() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A07() {
        Object obj;
        synchronized (this.A04) {
            if (A0B()) {
                obj = this.A01;
            } else {
                throw new IllegalStateException("Task has not finished");
            }
        }
        return obj;
    }

    public final void A08(Exception exc) {
        synchronized (this.A04) {
            if (!A0B()) {
                this.A03 = true;
                this.A00 = exc;
                A01();
            } else {
                throw new IllegalStateException("Task is already finished");
            }
        }
    }

    public final void A09(Object obj) {
        synchronized (this.A04) {
            if (!A0B()) {
                this.A03 = true;
                this.A01 = obj;
                A01();
            } else {
                throw new IllegalStateException("Task is already finished");
            }
        }
    }

    public final boolean A0A() {
        boolean z;
        synchronized (this.A04) {
            z = false;
            if (this.A00 != null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A0B() {
        boolean z;
        synchronized (this.A04) {
            z = this.A03;
        }
        return z;
    }

    public final C17780qn A04(C16090o1 r2, Executor executor) {
        return A05(r2, executor);
    }
}
