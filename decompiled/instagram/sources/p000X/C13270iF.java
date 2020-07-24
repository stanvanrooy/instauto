package p000X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.0iF  reason: invalid class name and case insensitive filesystem */
public final class C13270iF {
    public static ImageUrl A00(C13080hr r2) {
        if (r2.A0g() == C13120hv.VALUE_NULL) {
            return null;
        }
        return new SimpleImageUrl(r2.A0t());
    }

    public static void A01(C13460iZ r1, ImageUrl imageUrl) {
        r1.A0g(imageUrl.AZc());
    }
}
