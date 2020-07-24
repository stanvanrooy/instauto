package p000X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.0fS  reason: invalid class name and case insensitive filesystem */
public final class C11730fS {
    public int A00 = 0;
    public C254918z A01 = null;
    public Locale A02 = null;
    public Map A03 = null;
    public final AnonymousClass0QT A04;
    public final Map A05 = new HashMap();
    public final C11690fO A06;
    public volatile BlockingQueue A07;

    public static synchronized void A00(C11730fS r4) {
        Locale locale;
        synchronized (r4) {
            if (!(r4.A00 == 0 || (locale = r4.A02) == null)) {
                C254918z r3 = r4.A01;
                Map map = r4.A03;
                if (!(r3 == null || map == null)) {
                    String A012 = C15320mh.A01(r4.A06.AXK(locale));
                    r3.A0A("impressions", map);
                    r3.A08("string_locale", A012);
                    r3.A01();
                }
                r4.A01 = null;
                r4.A03 = null;
                r4.A05.clear();
                r4.A00 = 0;
            }
        }
    }

    public C11730fS(AnonymousClass0QT r3, C11690fO r4) {
        this.A04 = r3;
        this.A06 = r4;
    }
}
