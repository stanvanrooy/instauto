package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.feed.media.ClickToMessagingAdsInfo;

/* renamed from: X.21j  reason: invalid class name and case insensitive filesystem */
public final class C468921j {
    public static ClickToMessagingAdsInfo.IcebreakerMessage parseFromJson(C13080hr r4) {
        ClickToMessagingAdsInfo.IcebreakerMessage icebreakerMessage = new ClickToMessagingAdsInfo.IcebreakerMessage();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("messageKey".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                icebreakerMessage.A02 = str;
            } else if (DialogModule.KEY_MESSAGE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                icebreakerMessage.A01 = str;
            } else if ("actionUrl".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                icebreakerMessage.A00 = str;
            }
            r4.A0f();
        }
        return icebreakerMessage;
    }
}
