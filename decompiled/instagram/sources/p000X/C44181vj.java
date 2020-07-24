package p000X;

import java.io.Closeable;

/* renamed from: X.1vj  reason: invalid class name and case insensitive filesystem */
public final class C44181vj implements Closeable {
    public int A00;
    public int A01;
    public final C44161vh A02;

    public final void close() {
        this.A02.close();
    }

    public C44181vj(int i, int i2, C44161vh r3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r3;
    }
}
