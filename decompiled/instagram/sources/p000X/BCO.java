package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.BCO */
public final class BCO {
    public static BCP parseFromJson(C13080hr r3) {
        BCP bcp = new BCP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("value".equals(A0i)) {
                r3.A0I();
            } else if (RealtimeProtocol.USERS_ACCOUNT_STATUS.equals(A0i)) {
                BCL.A00(r3.A0r());
            }
            r3.A0f();
        }
        return bcp;
    }
}
