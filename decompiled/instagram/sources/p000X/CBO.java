package p000X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.CBO */
public final class CBO {
    public static CBO A02;
    public AnonymousClass07T A00 = new AnonymousClass07T(new CBN(this), new CBR(this));
    public String A01;

    public static synchronized void A00(String str, String str2) {
        synchronized (CBO.class) {
            CBO cbo = A02;
            if (cbo != null) {
                cbo.A01 = str2;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s [productName: %s]", str, str2);
                AnonymousClass07T r2 = cbo.A00;
                synchronized (r2) {
                    r2.A05.add(formatStrLocaleSafe);
                    if (r2.A05.size() > 3) {
                        r2.A05.removeFirst();
                    }
                }
            }
        }
    }

    public CBO() {
        AnonymousClass0Q7.A03().A0B(new CBQ(this));
        AnonymousClass07M.A00(new CBP(this));
    }
}
