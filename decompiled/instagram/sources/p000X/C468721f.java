package p000X;

import com.instagram.feed.media.ClickToMessagingAdsInfo;

/* renamed from: X.21f  reason: invalid class name and case insensitive filesystem */
public final class C468721f {
    public static ClickToMessagingAdsInfo parseFromJson(C13080hr r3) {
        ClickToMessagingAdsInfo clickToMessagingAdsInfo = new ClickToMessagingAdsInfo();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("pageID".equals(A0i)) {
                clickToMessagingAdsInfo.A00 = r3.A0J();
            } else if ("isEligibleForOnFeedMessages".equals(A0i)) {
                clickToMessagingAdsInfo.A02 = r3.A0O();
            } else if ("model".equals(A0i)) {
                clickToMessagingAdsInfo.A01 = C468821h.parseFromJson(r3);
            }
            r3.A0f();
        }
        return clickToMessagingAdsInfo;
    }
}
