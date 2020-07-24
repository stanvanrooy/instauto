package p000X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.B77 */
public final class B77 implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();
    public final AtomicInteger A02 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new B79(runnable));
        String str = this.A00;
        int andIncrement = this.A02.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    public B77(String str) {
        AnonymousClass0a2.A03(str, "Name must not be null");
        this.A00 = str;
    }
}
