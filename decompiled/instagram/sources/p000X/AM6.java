package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;

/* renamed from: X.AM6 */
public final class AM6 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static AM8 parseFromJson(C13080hr r4) {
        AM8 am8 = new AM8();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("burst_likes".equals(A0i)) {
                am8.A00 = r4.A0I();
            } else if (RealtimeProtocol.DIRECT_V2_REACTION_LIKES.equals(A0i)) {
                am8.A01 = r4.A0I();
            } else {
                ? r2 = 0;
                if ("support_tier".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    am8.A02 = C23334AIl.A00(r2);
                } else if ("likers".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            C227669qs parseFromJson = C227649qq.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r2 = arrayList;
                    }
                    C13150hy.A02(r2, "<set-?>");
                    am8.A03 = r2;
                }
            }
            r4.A0f();
        }
        return am8;
    }
}
