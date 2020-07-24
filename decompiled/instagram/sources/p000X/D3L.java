package p000X;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.D3L */
public final class D3L implements D8D {
    public final int A00;

    public final long AGn(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof C29264Cuq) || ((C29264Cuq) iOException).A00 != 500) {
            return -9223372036854775807L;
        }
        return 60000;
    }

    public final int AQM(int i) {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    public final long AUd(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof C2101594l) || (iOException instanceof FileNotFoundException) || (iOException instanceof C206408sh)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    public D3L(int i) {
        this.A00 = i;
    }
}
