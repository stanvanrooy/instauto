package p000X;

import android.os.Build;

/* renamed from: X.0Yx  reason: invalid class name and case insensitive filesystem */
public final class C08830Yx implements Runnable {
    public final /* synthetic */ C08840Yy A00;
    public final /* synthetic */ long A01;

    public C08830Yx(C08840Yy r1, long j) {
        this.A00 = r1;
        this.A01 = j;
    }

    public final void run() {
        synchronized (this.A00.A01) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } else {
                while (C08840Yy.A03.lastModified() == this.A01) {
                }
            }
            this.A00.A01();
        }
    }
}
