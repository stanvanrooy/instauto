package p000X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.BM4 */
public final class BM4 {
    public static boolean A00(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        return TextUtils.isEmpty(uri.getScheme()) || "file".equals(uri.getScheme()) || "content".equals(uri.getScheme());
    }
}
