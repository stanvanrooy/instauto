package p000X;

/* renamed from: X.0Ky  reason: invalid class name and case insensitive filesystem */
public final class C05540Ky {
    public static AnonymousClass0L0 parseFromJson(C13080hr r3) {
        AnonymousClass0L0 r2 = new AnonymousClass0L0();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("client_config_update_event".equals(A0i)) {
                r2.A00 = AnonymousClass0Kz.parseFromJson(r3);
            } else if ("client_subscription_id".equals(A0i) && r3.A0g() != C13120hv.VALUE_NULL) {
                r3.A0t();
            }
            r3.A0f();
        }
        return r2;
    }
}
