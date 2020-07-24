package p000X;

import com.facebook.C0003R;

/* renamed from: X.C8c */
public final class C8c {
    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CAROUSEL_V2";
            case 2:
                return "IMAGE";
            case 3:
                return "SHOPPING";
            case 4:
                return "VIDEO";
            default:
                return "ALL";
        }
    }

    public static final int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return C0003R.string.post_grid_media_type_carousel_v2;
            case 2:
                return C0003R.string.post_grid_media_type_image;
            case 3:
                return C0003R.string.post_grid_media_type_shopping;
            case 4:
                return C0003R.string.post_grid_media_type_video;
            default:
                return C0003R.string.post_grid_media_type_all;
        }
    }
}
