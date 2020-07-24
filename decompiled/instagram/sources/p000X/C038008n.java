package p000X;

import java.io.IOException;

/* renamed from: X.08n  reason: invalid class name and case insensitive filesystem */
public final class C038008n implements Runnable {
    public final /* synthetic */ C038308q A00;

    public C038008n(C038308q r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass0ZJ.A01(2147483648L, "AppUnpacker.finishUnpackingOnBackgroundThread()", -7120075);
        try {
            C038308q.A00(this.A00);
            C038308q.A01(this.A00);
            AnonymousClass0ZJ.A00(2147483648L, 1392940333);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            AnonymousClass0ZJ.A00(2147483648L, 1721410292);
            throw th;
        }
    }
}
