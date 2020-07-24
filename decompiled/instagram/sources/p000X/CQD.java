package p000X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.List;

/* renamed from: X.CQD */
public final class CQD {
    public static final C27761CQf A02 = new C27761CQf();
    public final AnonymousClass0QT A00;
    public final String A01;

    public CQD(AnonymousClass0C1 r2, C27371Ho r3, String str) {
        C13150hy.A02(r2, "userSession");
        C13150hy.A02(r3, "insightsHost");
        C13150hy.A02(str, "priorModule");
        this.A01 = str;
        this.A00 = AnonymousClass0QT.A00(r2, r3);
    }

    public final void A00(String str, boolean z, boolean z2, List list, Boolean bool) {
        String str2;
        C13150hy.A02(str, "query");
        C27759CQd cQd = new C27759CQd(this.A00.A02("instagram_shopping_collection_search"));
        C13150hy.A01(cQd, "event");
        if (cQd.A0B()) {
            cQd.A08("product_search_context", "product_collection_picker");
            C13150hy.A01(cQd, "event.setProductSearchContext(SEARCH_CONTEXT)");
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cQd.A08("network_result", str2);
            C13150hy.A01(cQd, "setNetworkResult(if (isS…e NETWORK_RESULT_FAILURE)");
            cQd.A08("search_text", str);
            cQd.A08("prior_module", this.A01);
            if (list == null) {
                list = AnonymousClass10U.A00;
            }
            cQd.A07("result_count", Long.valueOf((long) CNM.A00(list)));
            cQd.A04("is_initial_load", Boolean.valueOf(z2));
            cQd.A04("has_more_results", bool);
            cQd.A01();
        }
    }
}
