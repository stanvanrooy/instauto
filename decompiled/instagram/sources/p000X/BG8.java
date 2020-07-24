package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.BG8 */
public final class BG8 {
    public static BGB parseFromJson(C13080hr r3) {
        BGB bgb = new BGB();
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
        return bgb;
    }
}
