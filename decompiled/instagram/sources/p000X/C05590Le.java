package p000X;

/* renamed from: X.0Le  reason: invalid class name and case insensitive filesystem */
public final class C05590Le {
    public final String A00(Integer num, C04440Dz r5) {
        if (num.equals(Constants.A05) || num.equals(Constants.A15)) {
            return "perf";
        }
        if (num.equals(Constants.A0j)) {
            if (r5 == C04440Dz.CRITICAL_REPORT) {
                return "perf";
            }
        } else if (r5 != C04440Dz.CRITICAL_REPORT) {
            return null;
        }
        return "collector";
    }
}
