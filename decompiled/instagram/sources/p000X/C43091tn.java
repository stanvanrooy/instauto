package p000X;

/* renamed from: X.1tn  reason: invalid class name and case insensitive filesystem */
public enum C43091tn {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    FRONT,
    BACK;

    public static C43091tn A00(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.equalsIgnoreCase("FRONT")) {
                return FRONT;
            }
            if (str.equalsIgnoreCase("BACK")) {
                return BACK;
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
