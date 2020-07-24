package p000X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.C2G */
public abstract class C2G {
    public Collection A00(C00 c00, C0s c0s, C27179Bzx bzx) {
        HashMap hashMap = new HashMap();
        ((C27187C0l) this).A02(c00, new C1n(c00.A0A(), (String) null), c0s, bzx, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection A01(C27200C1k c1k, C0s c0s, C27179Bzx bzx, C0L c0l) {
        C27187C0l c0l2 = (C27187C0l) this;
        Class A0A = c0l == null ? c1k.A0A() : c0l.A00;
        HashMap hashMap = new HashMap();
        C27179Bzx bzx2 = bzx;
        List<C1n> A0m = bzx.A0m(c1k);
        C0s c0s2 = c0s;
        if (A0m != null) {
            for (C1n c1n : A0m) {
                c0l2.A02(C00.A01(c1n.A01, bzx, c0s), c1n, c0s2, bzx2, hashMap);
            }
        }
        c0l2.A02(C00.A01(A0A, bzx, c0s), new C1n(A0A, (String) null), c0s2, bzx2, hashMap);
        return new ArrayList(hashMap.values());
    }
}
