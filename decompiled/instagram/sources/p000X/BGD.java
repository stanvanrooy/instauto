package p000X;

import java.util.concurrent.Executor;

/* renamed from: X.BGD */
public final class BGD implements Executor {
    public ThreadLocal A00 = new ThreadLocal();

    private void A00() {
        Integer num = (Integer) this.A00.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() - 1;
        if (intValue == 0) {
            this.A00.remove();
        } else {
            this.A00.set(Integer.valueOf(intValue));
        }
    }

    public final void execute(Runnable runnable) {
        Integer num = (Integer) this.A00.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        this.A00.set(Integer.valueOf(intValue));
        if (intValue <= 15) {
            try {
                runnable.run();
            } catch (Throwable th) {
                A00();
                throw th;
            }
        } else {
            AnonymousClass0Z9.A03(BGC.A03.A01, runnable, 1274109319);
        }
        A00();
    }
}
