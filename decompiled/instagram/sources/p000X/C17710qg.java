package p000X;

import java.io.Serializable;

/* renamed from: X.0qg  reason: invalid class name and case insensitive filesystem */
public abstract class C17710qg implements Serializable {
    public abstract Object A02();

    public abstract Object A03();

    public abstract Object A04(Object obj);

    public abstract boolean A05();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public static C17710qg A00(Object obj) {
        if (obj == null) {
            return C17700qf.A00;
        }
        return new C17730qi(obj);
    }

    public static C17710qg A01(Object obj) {
        AnonymousClass0a4.A06(obj);
        return new C17730qi(obj);
    }
}
