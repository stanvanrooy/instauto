package p000X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.D5E */
public final class D5E {
    public final int A00;
    public final int A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public D5E(int i, int i2, List list, List list2, List list3) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = Collections.unmodifiableList(list);
        this.A02 = Collections.unmodifiableList(list2);
        this.A04 = Collections.unmodifiableList(list3);
    }
}
