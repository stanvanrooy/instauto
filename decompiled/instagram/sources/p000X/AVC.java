package p000X;

/* renamed from: X.AVC */
public final class AVC {
    public static AVD parseFromJson(C13080hr r3) {
        String A0t;
        AVD avd = new AVD();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("error_message".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                avd.A00 = A0t;
            } else {
                AnonymousClass1N4.A01(avd, A0i, r3);
            }
            r3.A0f();
        }
        return avd;
    }
}
