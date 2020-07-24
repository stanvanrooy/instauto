package p000X;

/* renamed from: X.0eH  reason: invalid class name and case insensitive filesystem */
public final class C11010eH extends C07400Sy {
    public final Object A00;

    public final boolean A01() {
        return true;
    }

    public final Object A00() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11010eH) {
            return this.A00.equals(((C11010eH) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.A00 + ")";
    }

    public C11010eH(Object obj) {
        this.A00 = obj;
    }
}
