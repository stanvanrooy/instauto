package p000X;

/* renamed from: X.0qi  reason: invalid class name and case insensitive filesystem */
public final class C17730qi extends C17710qg {
    public final Object A00;

    public final boolean A05() {
        return true;
    }

    public final Object A02() {
        return this.A00;
    }

    public final Object A03() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17730qi) {
            return this.A00.equals(((C17730qi) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.A00 + ")";
    }

    public C17730qi(Object obj) {
        this.A00 = obj;
    }

    public final Object A04(Object obj) {
        AnonymousClass0a4.A07(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.A00;
    }
}
