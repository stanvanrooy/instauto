package p000X;

/* renamed from: X.AY9 */
public final class AY9 {
    public static AYA parseFromJson(C13080hr r4) {
        AYA aya = new AYA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("vc_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                aya.A01 = str;
            } else if ("encoded_server_data_info".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                aya.A00 = str;
            }
            r4.A0f();
        }
        return aya;
    }
}
