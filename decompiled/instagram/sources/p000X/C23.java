package p000X;

import java.util.Collections;
import java.util.LinkedList;

/* renamed from: X.C23 */
public abstract class C23 {
    public C0K A01(C27190C0p c0p, C0L c0l, C3Z c3z) {
        C0C c0c = (C0C) this;
        C27180Bzy A00 = C0C.A00(c0l);
        return A00 == null ? C27180Bzy.A00(c0c.A06(c0p, c0l, c3z, false)) : A00;
    }

    public C0K A02(C27190C0p c0p, C0L c0l, C3Z c3z) {
        C0C c0c = (C0C) this;
        C27180Bzy A00 = C0C.A00(c0l);
        return A00 == null ? C27180Bzy.A00(c0c.A06(c0p, c0l, c3z, false)) : A00;
    }

    public C0K A03(C27190C0p c0p, C0L c0l, C3Z c3z) {
        C27190C0p c0p2 = c0p;
        C31 c31 = null;
        C27179Bzx A01 = c0p.A05(C1A.USE_ANNOTATIONS) ? c0p.A01() : null;
        C0L c0l2 = c0l;
        C00 A00 = C00.A00(c0l.A00, A01, c3z);
        if (A01 != null) {
            c31 = A01.A06(A00);
        }
        C27181Bzz bzz = new C27181Bzz(c0p2, false, c0l2, A00, c31 == null ? "with" : c31.A01);
        bzz.A02();
        return C27180Bzy.A00(bzz);
    }

    public C0K A04(C27191C0q c0q, C0L c0l, C3Z c3z) {
        C27200C1k c1k;
        C0C c0c = (C0C) this;
        C27180Bzy A00 = C0C.A00(c0l);
        if (A00 == null) {
            C27181Bzz A06 = c0c.A06(c0q, c0l, c3z, true);
            A00 = new C27180Bzy(A06);
            A00.A02 = A06.A00();
            LinkedList linkedList = A06.A02;
            if (linkedList != null) {
                if (linkedList.size() > 1) {
                    A06.A04("Multiple 'any-getters' defined (" + A06.A02.get(0) + " vs " + A06.A02.get(1) + ")");
                }
                c1k = (C27200C1k) A06.A02.getFirst();
            } else {
                c1k = null;
            }
            A00.A00 = c1k;
        }
        return A00;
    }

    public C0K A05(C0s c0s, C0L c0l, C3Z c3z) {
        return new C27180Bzy(c0s, c0l, C00.A00(c0l.A00, c0s.A05(C1A.USE_ANNOTATIONS) ? c0s.A01() : null, c3z), Collections.emptyList());
    }
}
