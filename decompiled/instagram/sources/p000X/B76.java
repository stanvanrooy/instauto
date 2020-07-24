package p000X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.B76 */
public final class B76 implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new B79(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public B76(String str) {
        AnonymousClass0a2.A03(str, "Name must not be null");
        this.A00 = str;
    }
}
