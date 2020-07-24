package p000X;

import java.util.Comparator;

/* renamed from: X.D8p */
public final /* synthetic */ class D8p implements Comparator {
    public final /* synthetic */ D9C A00;

    public /* synthetic */ D8p(D9C d9c) {
        this.A00 = d9c;
    }

    public final int compare(Object obj, Object obj2) {
        D9C d9c = this.A00;
        return d9c.AVB(obj2) - d9c.AVB(obj);
    }
}
