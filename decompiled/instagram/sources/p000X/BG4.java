package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.BG4 */
public final class BG4 {
    public static BG7 parseFromJson(C13080hr r3) {
        BG7 bg7 = new BG7();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (RealtimeProtocol.USERS_ACCOUNT_STATUS.equals(A0i)) {
                String A0r = r3.A0r();
            }
            r3.A0f();
        }
        return bg7;
    }
}
