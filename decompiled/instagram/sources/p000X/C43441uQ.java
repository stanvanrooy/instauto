package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;

/* renamed from: X.1uQ  reason: invalid class name and case insensitive filesystem */
public final class C43441uQ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void A00(C43451uR r3, String str, C13080hr r5) {
        if ("is_new_suggestion".equals(str)) {
            r3.A09 = r5.A0O();
        } else if ("user".equals(str)) {
            r3.A02 = C13300iJ.A00(r5);
        } else if ("use".equals(str)) {
            r3.A01 = C13300iJ.A00(r5);
        } else {
            ? r2 = 0;
            if ("algorithm".equals(str)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r3.A03 = r2;
            } else if ("uuid".equals(str)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r3.A05 = r2;
            } else if ("social_context".equals(str)) {
                if (r5.A0g() != C13120hv.VALUE_NULL) {
                    r2 = r5.A0t();
                }
                r3.A04 = r2;
            } else if ("user_story".equals(str)) {
                r3.A00 = C51842Mi.parseFromJson(r5);
            } else if ("media_infos".equals(str)) {
                if (r5.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList = new ArrayList();
                    while (r5.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass1NJ A00 = AnonymousClass1NJ.A00(r5);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                    r2 = arrayList;
                }
                r3.A06 = r2;
            } else if ("followed_by".equals(str)) {
                r3.A07 = r5.A0O();
            }
        }
    }

    public static C43451uR parseFromJson(C13080hr r5) {
        String str;
        C43451uR r4 = new C43451uR();
        if (r5.A0g() != C13120hv.START_OBJECT) {
            r5.A0f();
            return null;
        }
        while (r5.A0p() != C13120hv.END_OBJECT) {
            String A0i = r5.A0i();
            r5.A0p();
            A00(r4, A0i, r5);
            r5.A0f();
        }
        C13300iJ r2 = r4.A02;
        if (r2 != null) {
            C13390iS r1 = r2.A0M;
            if (r1 == C13390iS.FollowStatusUnknown || r1 == C13390iS.FollowStatusFetching) {
                r2.A0M = C13390iS.FollowStatusNotFollowing;
            }
            r2.A0G(Boolean.valueOf(r4.A07));
            return r4;
        }
        C13300iJ r0 = r4.A01;
        if (r0 != null) {
            str = r0.getId();
        } else {
            str = null;
        }
        AnonymousClass0QD.A01("RecommendedUser", StringFormatUtil.formatStrLocaleSafe("The user object is null. uuid: [%s], algorithm: [%s], debugUid: [%s]", r4.A05, r4.A03, str));
        return r4;
    }
}
