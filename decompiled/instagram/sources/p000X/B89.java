package p000X;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.B89 */
public final class B89 extends AnonymousClass2GL {
    public static final int A00;
    public static final B89 A01 = new B89();
    public static volatile Executor pool;

    public final String toString() {
        return "CommonPool";
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer A0F = C63282pB.A0F(str);
            if (A0F == null || (i = A0F.intValue()) < 1) {
                throw new IllegalStateException(AnonymousClass000.A0E("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
        } else {
            i = -1;
        }
        A00 = i;
    }

    public static final int A00() {
        Integer valueOf = Integer.valueOf(A00);
        boolean z = false;
        if (valueOf.intValue() > 0) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors < 1) {
            return 1;
        }
        return availableProcessors;
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0081 A[Catch:{ RejectedExecutionException -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0084 A[Catch:{ RejectedExecutionException -> 0x00e0 }] */
    public final void dispatch(AnonymousClass2GC r9, Runnable runnable) {
        Class<?> cls;
        ExecutorService executorService;
        ExecutorService executorService2;
        Integer num;
        boolean z;
        Object obj;
        try {
            Executor executor = pool;
            ExecutorService executorService3 = executor;
            if (executor == null) {
                synchronized (this) {
                    Executor executor2 = pool;
                    executorService3 = executor2;
                    if (executor2 == null) {
                        if (System.getSecurityManager() != null) {
                            executorService = Executors.newFixedThreadPool(A00(), new C24721AsO(new AtomicInteger()));
                        } else {
                            ExecutorService executorService4 = null;
                            try {
                                cls = Class.forName("java.util.concurrent.ForkJoinPool");
                            } catch (Throwable unused) {
                                cls = null;
                            }
                            if (cls != null) {
                                if (A00 < 0) {
                                    try {
                                        Method method = cls.getMethod("commonPool", new Class[0]);
                                        if (method != null) {
                                            obj = method.invoke((Object) null, new Object[0]);
                                        } else {
                                            obj = null;
                                        }
                                        if (!(obj instanceof ExecutorService)) {
                                            obj = null;
                                        }
                                        executorService2 = (ExecutorService) obj;
                                    } catch (Throwable unused2) {
                                        executorService2 = null;
                                    }
                                    if (executorService2 != null) {
                                        AnonymousClass0Z9.A01(executorService2, B8A.A00, 334529106);
                                        try {
                                            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService2, new Object[0]);
                                            if (!(invoke instanceof Integer)) {
                                                invoke = null;
                                            }
                                            num = (Integer) invoke;
                                        } catch (Throwable unused3) {
                                            num = null;
                                        }
                                        if (num != null) {
                                            z = true;
                                            if (num.intValue() >= 1) {
                                                if (!z) {
                                                    executorService2 = null;
                                                }
                                                if (executorService2 != null) {
                                                    executorService = executorService2;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (!z) {
                                        }
                                        if (executorService2 != null) {
                                        }
                                    }
                                }
                                try {
                                    Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(A00())});
                                    if (!(newInstance instanceof ExecutorService)) {
                                        newInstance = null;
                                    }
                                    executorService4 = (ExecutorService) newInstance;
                                } catch (Throwable unused4) {
                                }
                                if (executorService4 != null) {
                                    executorService = executorService4;
                                } else {
                                    executorService = Executors.newFixedThreadPool(A00(), new C24721AsO(new AtomicInteger()));
                                }
                            } else {
                                executorService = Executors.newFixedThreadPool(A00(), new C24721AsO(new AtomicInteger()));
                            }
                        }
                        pool = executorService;
                        executorService3 = executorService;
                    }
                }
            }
            AnonymousClass0Z9.A03(executorService3, runnable, -626824780);
        } catch (RejectedExecutionException unused5) {
            BU0.A00.A0B(runnable);
        }
    }
}
