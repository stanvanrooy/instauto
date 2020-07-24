package p000X;

import java.util.ArrayList;

/* renamed from: X.AM7 */
public final class AM7 {
    public static AM9 parseFromJson(C13080hr r4) {
        AM9 am9 = new AM9();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("like_count_by_support_tier".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AM8 parseFromJson = AM6.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                C13150hy.A02(arrayList, "<set-?>");
                am9.A02 = arrayList;
            } else if ("supporter_tier_likes".equals(A0i)) {
                am9.A01 = r4.A0I();
            } else if ("supporter_tier_burst_likes".equals(A0i)) {
                am9.A00 = r4.A0I();
            }
            r4.A0f();
        }
        return am9;
    }
}
