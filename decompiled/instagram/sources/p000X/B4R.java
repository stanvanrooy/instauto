package p000X;

import java.util.Set;

/* renamed from: X.B4R */
public final class B4R {
    public int A00;
    public long A01;
    public Set A02;

    public B4R(Set set) {
        this.A02 = set;
        this.A00 = 1;
        this.A01 = System.currentTimeMillis();
    }

    public B4R(Set set, long j, int i) {
        this.A02 = set;
        this.A00 = i;
        this.A01 = j;
    }
}
