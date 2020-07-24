package p000X;

import com.instagram.feed.media.ThumbnailImage;

/* renamed from: X.1tj  reason: invalid class name and case insensitive filesystem */
public final class C43071tj {
    public static ThumbnailImage parseFromJson(C13080hr r3) {
        ThumbnailImage thumbnailImage = new ThumbnailImage();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("uri".equals(A0i)) {
                thumbnailImage.A00 = C13270iF.A00(r3);
            }
            r3.A0f();
        }
        return thumbnailImage;
    }

    public static void A00(C13460iZ r1, ThumbnailImage thumbnailImage) {
        r1.A0T();
        if (thumbnailImage.A00 != null) {
            r1.A0d("uri");
            C13270iF.A01(r1, thumbnailImage.A00);
        }
        r1.A0Q();
    }
}
