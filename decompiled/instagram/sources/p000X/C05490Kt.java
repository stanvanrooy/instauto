package p000X;

import android.os.SystemClock;

/* renamed from: X.0Kt  reason: invalid class name and case insensitive filesystem */
public final class C05490Kt extends AnonymousClass0O9 {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass0O9 A01;
    public final /* synthetic */ C05450Ko A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05490Kt(C05450Ko r5, AnonymousClass0O9 r6) {
        super(r6.mRunnableId, r6.mPriority, r6.mSendToNetworkThreadPool, r6.mMayRunDuringStartup);
        this.A02 = r5;
        this.A01 = r6;
    }

    public final void run() {
        C05450Ko r5 = this.A02;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = r5.A01;
        if (i != -1 && elapsedRealtime - this.A00 > ((long) i)) {
            AnonymousClass0QD.A02("dispatch time exceeded limit", r5.A03);
        }
        SystemClock.currentThreadTimeMillis();
        this.A01.run();
        SystemClock.currentThreadTimeMillis();
        C05450Ko r2 = this.A02;
        SystemClock.elapsedRealtime();
        synchronized (r2) {
            this.A02.A00 = false;
        }
        C05450Ko.A00(this.A02);
    }

    public final String toString() {
        return this.A01.toString();
    }
}
