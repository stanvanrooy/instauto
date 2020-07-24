package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;

/* renamed from: X.AM5 */
public final class AM5 {
    public static AMA parseFromJson(C13080hr r4) {
        AMA ama = new AMA();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if (RealtimeProtocol.DIRECT_V2_REACTION_LIKES.equals(A0i)) {
                ama.A01 = r4.A0I();
            } else if ("burst_likes".equals(A0i)) {
                ama.A00 = r4.A0I();
            } else if ("likers".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C227669qs parseFromJson = C227649qq.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                ama.A04 = arrayList;
            } else if ("like_ts".equals(A0i)) {
                ama.A02 = r4.A0J();
            } else if ("user_pay_supporter_info".equals(A0i)) {
                ama.A03 = AM7.parseFromJson(r4);
            } else {
                AnonymousClass1N4.A01(ama, A0i, r4);
            }
            r4.A0f();
        }
        return ama;
    }
}
