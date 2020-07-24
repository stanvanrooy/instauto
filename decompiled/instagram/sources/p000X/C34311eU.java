package p000X;

import com.instagram.feed.media.AttributionUser;
import com.instagram.feed.media.ProfilePicture;

/* renamed from: X.1eU  reason: invalid class name and case insensitive filesystem */
public final class C34311eU {
    public static AttributionUser parseFromJson(C13080hr r4) {
        AttributionUser attributionUser = new AttributionUser();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("instagram_user_id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                attributionUser.A01 = str;
            } else if ("username".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                attributionUser.A02 = str;
            } else if ("profile_picture".equals(A0i)) {
                attributionUser.A00 = C34321eW.parseFromJson(r4);
            } else if ("is_verified".equals(A0i)) {
                attributionUser.A03 = r4.A0O();
            }
            r4.A0f();
        }
        return attributionUser;
    }

    public static void A00(C13460iZ r2, AttributionUser attributionUser) {
        r2.A0T();
        String str = attributionUser.A01;
        if (str != null) {
            r2.A0H("instagram_user_id", str);
        }
        String str2 = attributionUser.A02;
        if (str2 != null) {
            r2.A0H("username", str2);
        }
        if (attributionUser.A00 != null) {
            r2.A0d("profile_picture");
            ProfilePicture profilePicture = attributionUser.A00;
            r2.A0T();
            if (profilePicture.A00 != null) {
                r2.A0d("uri");
                C13270iF.A01(r2, profilePicture.A00);
            }
            r2.A0Q();
        }
        r2.A0I("is_verified", attributionUser.A03);
        r2.A0Q();
    }
}
