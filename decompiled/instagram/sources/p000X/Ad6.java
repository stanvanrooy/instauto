package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Ad6 */
public final class Ad6 {
    public final Ad4 A00 = new Ad4(this);
    public final DirectThreadKey A01;
    public final AnonymousClass0C1 A02;
    public final C23888Ad3 A03;
    public final String A04;
    public final String A05;

    public static void A00(Ad6 ad6, Ad7 ad7) {
        C65882uZ A002 = C19290tE.A00(ad6.A02);
        DirectThreadKey directThreadKey = ad6.A01;
        if (directThreadKey == null) {
            directThreadKey = new DirectThreadKey(ad7.A00);
        }
        A002.Blh(directThreadKey, ad7.A01, (String) null);
    }

    public Ad6(AnonymousClass0C1 r2, String str, C23888Ad3 ad3, String str2, DirectThreadKey directThreadKey) {
        this.A05 = str;
        this.A04 = str2;
        this.A02 = r2;
        this.A03 = ad3;
        this.A01 = directThreadKey;
    }
}
