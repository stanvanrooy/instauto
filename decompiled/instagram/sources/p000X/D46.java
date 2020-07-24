package p000X;

/* renamed from: X.D46 */
public final class D46 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "null_format";
            case 2:
                return "waiting_for_keys";
            case 3:
                return "no_output_buffer";
            case 4:
                return "surface_not_ready";
            case 5:
                return "force_end";
            case 6:
                return "buffer_below_threshold";
            default:
                return "unknown";
        }
    }
}
