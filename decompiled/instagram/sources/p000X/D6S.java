package p000X;

import java.util.List;

/* renamed from: X.D6S */
public abstract class D6S extends C29739D7f implements D8C {
    public long A00;
    public D8C A01;

    public abstract void release();

    public final List AJC(long j) {
        D8C d8c = this.A01;
        D6U.A01(d8c);
        return d8c.AJC(j - this.A00);
    }

    public final long ALK(int i) {
        D8C d8c = this.A01;
        D6U.A01(d8c);
        return d8c.ALK(i) + this.A00;
    }

    public final int ALL() {
        D8C d8c = this.A01;
        D6U.A01(d8c);
        return d8c.ALL();
    }

    public final int AQo(long j) {
        D8C d8c = this.A01;
        D6U.A01(d8c);
        return d8c.AQo(j - this.A00);
    }

    public final void A03() {
        super.A03();
        this.A01 = null;
    }
}
