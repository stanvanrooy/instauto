package p000X;

import com.instagram.feed.media.CropCoordinates;

/* renamed from: X.20x  reason: invalid class name and case insensitive filesystem */
public final class C468020x {
    public static CropCoordinates parseFromJson(C13080hr r4) {
        CropCoordinates cropCoordinates = new CropCoordinates();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("crop_left".equals(A0i)) {
                cropCoordinates.A01 = (float) r4.A0H();
            } else if ("crop_top".equals(A0i)) {
                cropCoordinates.A03 = (float) r4.A0H();
            } else if ("crop_right".equals(A0i)) {
                cropCoordinates.A02 = (float) r4.A0H();
            } else if ("crop_bottom".equals(A0i)) {
                cropCoordinates.A00 = (float) r4.A0H();
            }
            r4.A0f();
        }
        return cropCoordinates;
    }

    public static void A00(C13460iZ r2, CropCoordinates cropCoordinates) {
        r2.A0T();
        r2.A0E("crop_left", cropCoordinates.A01);
        r2.A0E("crop_top", cropCoordinates.A03);
        r2.A0E("crop_right", cropCoordinates.A02);
        r2.A0E("crop_bottom", cropCoordinates.A00);
        r2.A0Q();
    }
}
