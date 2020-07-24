package p000X;

import android.os.SystemClock;

/* renamed from: X.0Km  reason: invalid class name and case insensitive filesystem */
public final class C05430Km extends AnonymousClass0O9 {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass0O9 A01;
    public final /* synthetic */ C05380Kf A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05430Km(C05380Kf r5, AnonymousClass0O9 r6) {
        super(r6.mRunnableId, r6.mPriority, r6.mSendToNetworkThreadPool, r6.mMayRunDuringStartup);
        this.A02 = r5;
        this.A01 = r6;
    }

    public final void run() {
        this.A02.A03.set(SystemClock.elapsedRealtime());
        C05380Kf.A00(-1, this.A02.A03.get() - this.A00, "dispatch time exceeded limit", this.A02.A02);
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        this.A01.run();
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        C05380Kf r0 = this.A02;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C05380Kf.A00(-1, currentThreadTimeMillis2 - currentThreadTimeMillis, "compute time exceeded limit", r0.A02);
        C05380Kf.A00(-1, elapsedRealtime - this.A02.A03.get(), "wall clock runtime exceeded limit", this.A02.A02);
        synchronized (this.A02) {
            this.A02.A00 = false;
        }
        C05380Kf.A01(this.A02);
    }

    public final String toString() {
        return this.A01.toString();
    }
}
