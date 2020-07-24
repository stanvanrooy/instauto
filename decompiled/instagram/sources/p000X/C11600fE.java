package p000X;

import java.io.Serializable;

/* renamed from: X.0fE  reason: invalid class name and case insensitive filesystem */
public final class C11600fE {
    public static C11590fD A00(C11590fD r1) {
        if ((r1 instanceof C11610fF) || (r1 instanceof C11620fG)) {
            return r1;
        }
        if (r1 instanceof Serializable) {
            return new C11620fG(r1);
        }
        return new C11610fF(r1);
    }
}
