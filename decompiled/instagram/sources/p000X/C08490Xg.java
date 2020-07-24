package p000X;

import android.os.Trace;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
public final class C08490Xg {
    public static void A00(String str, String str2) {
        String A0J = AnonymousClass000.A0J(str, str2, "]");
        if (A0J.length() > 127 && str2 != null) {
            A0J = AnonymousClass000.A0J(str, str2.substring(0, (127 - str.length()) - "]".length()), "]");
        }
        Trace.beginSection(A0J);
    }
}
