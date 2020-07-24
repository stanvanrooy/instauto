package p000X;

import android.os.SystemClock;

/* renamed from: X.0Sv  reason: invalid class name and case insensitive filesystem */
public final class C07380Sv implements Runnable {
    public final Runnable A00;
    public volatile long A01;
    public volatile long A02;
    public final /* synthetic */ AnonymousClass0Sw A03;

    public C07380Sv(AnonymousClass0Sw r1, Runnable runnable) {
        this.A03 = r1;
        this.A00 = runnable;
        SystemClock.uptimeMillis();
    }

    public final void run() {
        SystemClock.uptimeMillis();
        SystemClock.currentThreadTimeMillis();
        this.A00.run();
        SystemClock.currentThreadTimeMillis();
        SystemClock.uptimeMillis();
        synchronized (this.A03) {
            this.A03.A00 = false;
        }
        AnonymousClass0Sw.A01(this.A03);
    }
}
