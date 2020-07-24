package p000X;

import android.net.Uri;

/* renamed from: X.BA4 */
public final class BA4 {
    public static final Uri A00 = new Uri.Builder().scheme("content").authority(A03).appendPath("attribution_info").build();
    public static final Uri A01 = new Uri.Builder().scheme("content").authority(A03).appendPath("device_id").build();
    public static final Uri A02;
    public static final String A03;

    static {
        String A0E = AnonymousClass000.A0E("com.facebook.appmanager", ".attribution");
        A03 = A0E;
        A02 = Uri.parse(AnonymousClass000.A0E("content://", A0E));
    }
}
