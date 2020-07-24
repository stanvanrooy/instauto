package p000X;

/* renamed from: X.DYV */
public final class DYV {
    public static DYY parseFromJson(C13080hr r4) {
        DYY dyy = new DYY();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("device_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if (AnonymousClass0C5.$const$string(377).equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dyy.A00 = str;
            } else if ("zero_provisioned_time".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dyy.A01 = str;
            }
            r4.A0f();
        }
        return dyy;
    }
}
