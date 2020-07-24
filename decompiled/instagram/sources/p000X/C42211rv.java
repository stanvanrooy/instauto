package p000X;

/* renamed from: X.1rv  reason: invalid class name and case insensitive filesystem */
public final class C42211rv extends AnonymousClass0O9 {
    public final /* synthetic */ C12050g6 A00;

    public final void run() {
        try {
            this.A00.A03.set(true);
            while (!this.A00.A01.Agl() && !this.A00.A02.isEmpty()) {
                Runnable runnable = (Runnable) this.A00.A02.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.A00.A03.set(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42211rv(C12050g6 r2) {
        super(315);
        this.A00 = r2;
    }
}
