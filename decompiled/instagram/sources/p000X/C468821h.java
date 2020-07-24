package p000X;

import com.instagram.feed.media.ClickToMessagingAdsInfo;
import java.util.ArrayList;

/* renamed from: X.21h  reason: invalid class name and case insensitive filesystem */
public final class C468821h {
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
    public static ClickToMessagingAdsInfo.OnFeedMessages parseFromJson(C13080hr r4) {
        ClickToMessagingAdsInfo.OnFeedMessages onFeedMessages = new ClickToMessagingAdsInfo.OnFeedMessages();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("destinationType".equals(A0i)) {
                onFeedMessages.A00 = r4.A0I();
            } else {
                ? r2 = 0;
                if ("greetingText".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    onFeedMessages.A02 = r2;
                } else if ("headerText".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    onFeedMessages.A03 = r2;
                } else if ("genericUrl".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    onFeedMessages.A01 = r2;
                } else if ("icebreakerMessages".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            ClickToMessagingAdsInfo.IcebreakerMessage parseFromJson = C468921j.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                        r2 = arrayList;
                    }
                    onFeedMessages.A04 = r2;
                }
            }
            r4.A0f();
        }
        return onFeedMessages;
    }
}
