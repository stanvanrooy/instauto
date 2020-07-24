package p000X;

/* renamed from: X.0Nw  reason: invalid class name and case insensitive filesystem */
public final class C06130Nw implements Runnable {
    public final /* synthetic */ C06120Nv A00;

    public C06130Nw(C06120Nv r1) {
        this.A00 = r1;
    }

    public final void run() {
        while (true) {
            for (int size = this.A00.A02.size() - 1; size >= 0; size--) {
                AnonymousClass0OU r2 = (AnonymousClass0OU) this.A00.A02.get(size);
                AnonymousClass0O9 r0 = (AnonymousClass0O9) this.A00.A03.get(r2);
                AnonymousClass0O9 r4 = r2.A00;
                if (r0 != r4 || r0 == null) {
                    this.A00.A03.put(r2, r4);
                } else {
                    try {
                        if (!r2.A01) {
                            AnonymousClass0QD.A01("IG_EXECUTOR_STUCK_THREAD", AnonymousClass000.A05("Background task got stuck: ", r4.mRunnableId));
                            for (AnonymousClass0O6 onStuckTask : ((C05610Lg) C05700Lp.A00()).A05) {
                                onStuckTask.onStuckTask(r4, r2);
                            }
                            this.A00.A02.add(r2.A00());
                        }
                        this.A00.A02.remove(r2);
                        this.A00.A03.remove(r2);
                    } finally {
                        r2.A01 = true;
                    }
                }
            }
            try {
                Thread.sleep((long) this.A00.A00);
            } catch (InterruptedException e) {
                AnonymousClass0QD.A0A("IG_EXECUTOR_STUCK_THREAD", e);
                return;
            }
        }
    }
}
