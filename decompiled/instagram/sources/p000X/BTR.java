package p000X;

import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* renamed from: X.BTR */
public class BTR<T> extends AbstractList<List<T>> {
    public final int A00 = 50;
    public final List A01;

    public BTR(List list) {
        this.A01 = list;
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final int size() {
        return C25913Bc3.A00(this.A01.size(), this.A00, RoundingMode.CEILING);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        AnonymousClass0a4.A03(i, size());
        int i2 = this.A00;
        int i3 = i * i2;
        return this.A01.subList(i3, Math.min(i2 + i3, this.A01.size()));
    }
}
