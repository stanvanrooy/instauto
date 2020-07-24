package p000X;

/* renamed from: X.0Ga  reason: invalid class name and case insensitive filesystem */
public final class C04790Ga {
    public static String A00(int i) {
        switch (i) {
            case 1:
                return "unknown";
            case 2:
                return "controller_init";
            case 3:
                return "missed_event";
            case 4:
                return "timeout";
            case 5:
                return "new_start";
            case 6:
                return "condition_not_met";
            default:
                return AnonymousClass000.A05("UNKNOWN REASON ", i);
        }
    }
}
