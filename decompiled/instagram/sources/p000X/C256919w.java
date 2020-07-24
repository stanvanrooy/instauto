package p000X;

import android.net.Uri;

/* renamed from: X.19w  reason: invalid class name and case insensitive filesystem */
public final class C256919w implements C257019x {
    public final String A00 = Uri.parse("https://maps.googleapis.com/maps/api/staticmap?").getHost();

    public final void BX7(AnonymousClass1C4 r3, String str) {
        String host = r3.A04.getHost();
        if (host != null && host.equalsIgnoreCase(this.A00)) {
            r3.A01("Referer", "android.instagram.com");
        }
    }
}
