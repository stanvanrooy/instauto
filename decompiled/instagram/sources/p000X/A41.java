package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.A41 */
public final class A41 implements Iterable {
    public final /* synthetic */ List A00;

    public A41(List list) {
        this.A00 = list;
    }

    public final Iterator iterator() {
        return new A3p(this);
    }
}
