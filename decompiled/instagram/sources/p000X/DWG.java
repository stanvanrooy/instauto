package p000X;

/* renamed from: X.DWG */
public final class DWG {
    public static DWS parseFromJson(C13080hr r3) {
        DWS dws = new DWS();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("total_count_graph".equals(A0i)) {
                dws.A00 = DWD.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dws;
    }
}
