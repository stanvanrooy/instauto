package p000X;

import com.facebook.profilo.logger.Logger;

/* renamed from: X.0bX  reason: invalid class name and case insensitive filesystem */
public final class C09510bX implements Runnable {
    public int A00;
    public int A01;
    public Runnable A02;

    public final void run() {
        int writeStandardEntry = Logger.writeStandardEntry(C09680bp.A01, 6, 14, 0, 0, this.A00, this.A01, 0);
        try {
            this.A02.run();
            Logger.writeStandardEntry(C09680bp.A01, 6, 15, 0, 0, this.A00, writeStandardEntry, 0);
        } catch (Throwable th) {
            Logger.writeStandardEntry(C09680bp.A01, 6, 15, 0, 0, this.A00, writeStandardEntry, 0);
            throw th;
        }
    }

    public final String toString() {
        return "RunnableWrapper for " + this.A02;
    }

    public C09510bX(Runnable runnable, int i, int i2) {
        this.A02 = runnable;
        this.A01 = i;
        this.A00 = i2;
    }
}
