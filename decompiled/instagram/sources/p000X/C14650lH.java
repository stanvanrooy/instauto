package p000X;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0lH  reason: invalid class name and case insensitive filesystem */
public final class C14650lH {
    public final C14760lT A00;
    public final C14780lV A01;
    public final C14770lU A02;

    public final C14970m7 A00(int i, String str, String str2, Integer num, boolean z) {
        RuntimeException runtimeException;
        Integer num2;
        Future future;
        String str3 = str;
        int i2 = i;
        Integer num3 = num;
        String str4 = str2;
        if (!z) {
            try {
                num2 = Constants.ZERO;
            } catch (ExecutionException e) {
                try {
                    throw e.getCause();
                } catch (C46051z3 e2) {
                    throw e2;
                } catch (Error | RuntimeException e3) {
                    throw e3;
                } catch (Throwable th) {
                    runtimeException = new RuntimeException(th);
                }
            } catch (InterruptedException e4) {
                runtimeException = new RuntimeException(e4);
                throw runtimeException;
            }
        } else if (i == this.A02.A04.A03()) {
            num2 = Constants.ONE;
        } else if (i == this.A02.A04.A04()) {
            num2 = Constants.A0C;
        } else {
            num2 = Constants.A0N;
        }
        C14850lq r4 = new C14850lq(i, str, str2);
        C14760lT r3 = this.A00;
        C14870ls r5 = new C14870ls(this, i2, str3, str4, num3, num2);
        synchronized (r3) {
            future = (Future) r3.A00.get(r4);
            if (future == null) {
                future = AnonymousClass0Z9.A02(r3.A01, new C14880lt(r3, r5, r4), -1378072472);
                r3.A00.put(r4, future);
            }
        }
        C14970m7 r1 = (C14970m7) future.get();
        if (num3 == Constants.A0C) {
            A01(Integer.valueOf(i), str, str2);
        }
        return r1;
    }

    public C14650lH(Context context, C14660lI r13, C14580l9 r14, C14670lJ r15, C14700lM r16, C14720lO r17, C14730lP r18, C14750lS r19, ExecutorService executorService) {
        C14760lT r0 = new C14760lT(executorService);
        C14720lO r8 = r17;
        Context context2 = context;
        C14660lI r4 = r13;
        C14580l9 r5 = r14;
        C14770lU r2 = new C14770lU(context2, r4, r5, r15, r16, r8, r18, r19);
        this.A00 = r0;
        this.A02 = r2;
        this.A01 = new C14780lV(this, r8);
    }

    public final void A01(Integer num, String str, String str2) {
        C14780lV r5 = this.A01;
        synchronized (r5) {
            int intValue = num.intValue();
            C14850lq r2 = new C14850lq(intValue, str, str2);
            if (!r5.A02.contains(r2) && r5.A01.A02.A01(intValue, str, str2) == null) {
                r5.A02.add(r2);
                if (!r5.A02.isEmpty() && r5.A00 == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    r5.A00 = newSingleThreadScheduledExecutor;
                    newSingleThreadScheduledExecutor.schedule(new AnonymousClass415(r5, r2), 1, TimeUnit.SECONDS);
                }
            }
        }
    }
}
