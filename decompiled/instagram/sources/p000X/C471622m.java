package p000X;

import java.util.concurrent.Future;

/* renamed from: X.22m  reason: invalid class name and case insensitive filesystem */
public final class C471622m implements Runnable {
    public final /* synthetic */ AnonymousClass22T A00;
    public final /* synthetic */ Future A01;

    public C471622m(AnonymousClass22T r1, Future future) {
        this.A00 = r1;
        this.A01 = future;
    }

    public final void run() {
        Future future;
        if (this.A00.A01.isCancelled() && (future = this.A01) != null) {
            future.cancel(true);
        }
    }
}
