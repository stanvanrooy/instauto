package p000X;

/* renamed from: X.0qf  reason: invalid class name and case insensitive filesystem */
public final class C17700qf extends C17710qg {
    public static final C17700qf A00 = new C17700qf();

    public final Object A03() {
        return null;
    }

    public final boolean A05() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object A02() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final Object A04(Object obj) {
        AnonymousClass0a4.A07(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }
}
