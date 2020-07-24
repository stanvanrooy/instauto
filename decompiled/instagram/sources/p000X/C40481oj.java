package p000X;

import java.util.List;
import java.util.Map;

/* renamed from: X.1oj  reason: invalid class name and case insensitive filesystem */
public final class C40481oj {
    public final int A00;
    public final List A01;
    public final Map A02;

    public C40481oj(List list, Map map, int i) {
        this.A01 = list;
        this.A02 = map;
        this.A00 = i;
        boolean z = true;
        AnonymousClass11J.A03(!list.isEmpty());
        AnonymousClass11J.A03(this.A01.size() == this.A02.size());
        AnonymousClass11J.A03(this.A00 <= 0 ? false : z);
    }
}
