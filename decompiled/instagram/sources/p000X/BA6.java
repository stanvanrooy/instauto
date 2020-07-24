package p000X;

import android.net.Uri;

/* renamed from: X.BA6 */
public final class BA6 {
    public static final Uri A00 = new Uri.Builder().scheme("content").authority(A01).build();
    public static final String A01 = AnonymousClass000.A0E("com.facebook.appmanager", ".firstparty.settings");

    public static Uri A00(String str) {
        return A00.buildUpon().appendPath("package").appendPath(str).build();
    }
}
