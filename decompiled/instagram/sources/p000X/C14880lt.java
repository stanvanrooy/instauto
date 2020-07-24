package p000X;

import java.util.concurrent.Callable;

/* renamed from: X.0lt  reason: invalid class name and case insensitive filesystem */
public final class C14880lt implements Callable {
    public final /* synthetic */ C14760lT A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Callable A02;

    public C14880lt(C14760lT r1, Callable callable, Object obj) {
        this.A00 = r1;
        this.A02 = callable;
        this.A01 = obj;
    }

    public final Object call() {
        try {
            Object call = this.A02.call();
            C14760lT r2 = this.A00;
            Object obj = this.A01;
            synchronized (r2) {
                r2.A00.remove(obj);
            }
            return call;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            C14760lT r22 = this.A00;
            Object obj2 = this.A01;
            synchronized (r22) {
                r22.A00.remove(obj2);
                throw th;
            }
        }
    }
}
