package p000X;

/* renamed from: X.DVB */
public final class DVB {
    public static DVC parseFromJson(C13080hr r3) {
        Integer num;
        DVC dvc = new DVC();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("last_week_stories_count".equals(A0i)) {
                dvc.A00 = r3.A0I();
            } else if ("week_over_week_stories_delta".equals(A0i)) {
                dvc.A01 = r3.A0I();
            } else if ("state".equals(A0i)) {
                String A0r = r3.A0r();
                if (A0r != null && !A0r.isEmpty()) {
                    if (A0r.equalsIgnoreCase("NO_ACTIVE_STORIES")) {
                        num = Constants.ONE;
                    } else if (A0r.equalsIgnoreCase("NO_STORIES")) {
                        num = Constants.A0C;
                    } else if (A0r.equalsIgnoreCase("HAS_STORIES")) {
                        num = Constants.A0N;
                    } else if (A0r.equalsIgnoreCase("OPT_IN_REQUIRED")) {
                        num = Constants.A0Y;
                    } else if (A0r.equalsIgnoreCase("ERROR")) {
                        num = Constants.A0j;
                    }
                    dvc.A03 = num;
                }
                num = Constants.ZERO;
                dvc.A03 = num;
            } else if ("summary_stories".equals(A0i)) {
                dvc.A02 = DVD.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dvc;
    }
}
