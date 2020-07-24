package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.CP0 */
public final class CP0 {
    public static CP3 parseFromJson(C13080hr r3) {
        CP3 cp3 = new CP3();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user".equals(A0i)) {
                cp3.A01 = C13300iJ.A00(r3);
            } else if (RealtimeProtocol.USERS_ACCOUNT_STATUS.equals(A0i)) {
                cp3.A00 = CP1.parseFromJson(r3);
            }
            r3.A0f();
        }
        return cp3;
    }
}
