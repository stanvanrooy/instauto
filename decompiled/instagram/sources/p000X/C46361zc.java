package p000X;

import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;

/* renamed from: X.1zc  reason: invalid class name and case insensitive filesystem */
public final class C46361zc {
    public static ImageUrl A00(Uri uri) {
        return new SimpleImageUrl(uri.toString());
    }

    public static boolean A02(ImageUrl imageUrl) {
        String AZc;
        if (imageUrl == null || (AZc = imageUrl.AZc()) == null || AZc.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean A03(ImageUrl imageUrl, ImageUrl imageUrl2) {
        if (imageUrl != null) {
            return imageUrl.equals(imageUrl2);
        }
        if (imageUrl2 == null) {
            return true;
        }
        return false;
    }

    public static ImageUrl A01(File file) {
        return A00(Uri.fromFile(file));
    }
}
