package p000X;

/* renamed from: X.0eI  reason: invalid class name and case insensitive filesystem */
public final class C11020eI extends C07400Sy {
    public static final C11020eI A00 = new C11020eI();

    public final boolean A01() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 1502476572;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object A00() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
