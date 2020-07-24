package p000X;

/* renamed from: X.DI0 */
public final class DI0 implements Runnable, C27711Ix, C29946DHw {
    public Thread A00;
    public final AnonymousClass1JN A01;
    public final Runnable A02;

    public final void dispose() {
        if (this.A00 == Thread.currentThread()) {
            AnonymousClass1JN r1 = this.A01;
            if (r1 instanceof AnonymousClass1JM) {
                AnonymousClass1JM r12 = (AnonymousClass1JM) r1;
                if (!r12.A01) {
                    r12.A01 = true;
                    r12.A00.shutdown();
                    return;
                }
                return;
            }
        }
        this.A01.dispose();
    }

    public DI0(Runnable runnable, AnonymousClass1JN r2) {
        this.A02 = runnable;
        this.A01 = r2;
    }

    public final void run() {
        this.A00 = Thread.currentThread();
        try {
            this.A02.run();
        } finally {
            dispose();
            this.A00 = null;
        }
    }
}
