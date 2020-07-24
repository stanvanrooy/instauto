package p000X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;

/* renamed from: X.1Np  reason: invalid class name and case insensitive filesystem */
public final class C28881Np {
    public static ImageInfo parseFromJson(C13080hr r4) {
        ImageInfo imageInfo = new ImageInfo();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("candidates".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        ExtendedImageUrl parseFromJson = AnonymousClass0i9.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                imageInfo.A01 = arrayList;
            } else if ("additional_candidates".equals(A0i)) {
                imageInfo.A00 = AnonymousClass1Xg.parseFromJson(r4);
            }
            r4.A0f();
        }
        return imageInfo;
    }

    public static void A00(C13460iZ r2, ImageInfo imageInfo) {
        r2.A0T();
        if (imageInfo.A01 != null) {
            r2.A0d("candidates");
            r2.A0S();
            for (ExtendedImageUrl extendedImageUrl : imageInfo.A01) {
                if (extendedImageUrl != null) {
                    AnonymousClass0i9.A00(r2, extendedImageUrl);
                }
            }
            r2.A0P();
        }
        if (imageInfo.A00 != null) {
            r2.A0d("additional_candidates");
            AnonymousClass1Xh r1 = imageInfo.A00;
            r2.A0T();
            if (r1.A01 != null) {
                r2.A0d("igtv_first_frame");
                AnonymousClass0i9.A00(r2, r1.A01);
            }
            if (r1.A00 != null) {
                r2.A0d("first_frame");
                AnonymousClass0i9.A00(r2, r1.A00);
            }
            r2.A0Q();
        }
        r2.A0Q();
    }
}
