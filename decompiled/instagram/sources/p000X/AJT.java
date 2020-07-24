package p000X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.AJT */
public final class AJT {
    public static AJS parseFromJson(C13080hr r3) {
        AJS ajs = new AJS();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (AnonymousClass0C5.$const$string(73).equals(A0i) || TraceFieldType.BroadcastId.equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("waver".equals(A0i)) {
                ajs.A00 = C13300iJ.A00(r3);
            }
            r3.A0f();
        }
        return ajs;
    }
}
