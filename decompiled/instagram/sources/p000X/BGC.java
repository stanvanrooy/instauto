package p000X;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.BGC */
public final class BGC {
    public static final BGC A03 = new BGC();
    public final Executor A00;
    public final ExecutorService A01;
    public final ScheduledExecutorService A02;

    public BGC() {
        boolean contains;
        ExecutorService A002;
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            contains = false;
        } else {
            contains = property.toLowerCase(Locale.US).contains("android");
        }
        if (!contains) {
            A002 = Executors.newCachedThreadPool();
        } else {
            A002 = C204378om.A00();
        }
        this.A01 = A002;
        this.A02 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = new BGD();
    }
}
