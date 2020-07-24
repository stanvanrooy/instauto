package p000X;

import com.facebook.profilo.logger.Logger;
import java.util.concurrent.Callable;

/* renamed from: X.0bY  reason: invalid class name and case insensitive filesystem */
public final class C09520bY implements Callable {
    public int A00;
    public int A01;
    public Callable A02;

    public final Object call() {
        int writeStandardEntry = Logger.writeStandardEntry(C09680bp.A01, 6, 14, 0, 0, this.A00, this.A01, 0);
        try {
            return this.A02.call();
        } finally {
            Logger.writeStandardEntry(C09680bp.A01, 6, 15, 0, 0, this.A00, writeStandardEntry, 0);
        }
    }

    public final String toString() {
        return "CallableWrapper for " + this.A02;
    }

    public C09520bY(Callable callable, int i, int i2) {
        this.A02 = callable;
        this.A01 = i;
        this.A00 = i2;
    }
}
