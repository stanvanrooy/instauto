package p000X;

import android.util.LruCache;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0fN  reason: invalid class name and case insensitive filesystem */
public class C11680fN implements C11690fO {
    public static final Locale A05 = Locale.ENGLISH;
    public static final Locale A06 = Locale.US;
    public static final Locale A07 = new Locale("fb", "HA");
    public final LruCache A00 = new LruCache(5);
    public final AnonymousClass0IT A01;
    public final LruCache A02 = new LruCache(5);
    public final C11570fB A03;
    public final AtomicReference A04 = new AtomicReference();

    public final Locale AG6() {
        Locale locale = (Locale) this.A01.get();
        Set AFB = this.A03.AFB();
        if (AFB.isEmpty() || AFB.contains(locale.getLanguage())) {
            return locale;
        }
        Locale locale2 = (Locale) this.A00.get(locale);
        if (locale2 == null) {
            locale2 = new Locale(locale.getLanguage(), locale.getCountry());
            this.A00.put(locale, locale2);
        }
        if (AFB.contains(locale2.toString()) || locale.toString().equals(A07.toString())) {
            return locale;
        }
        return A06;
    }

    public final String ALZ() {
        Locale locale = (Locale) this.A04.get();
        if (locale == null) {
            locale = AXK(AG6());
        }
        return C15320mh.A01(locale);
    }

    public final Locale AXK(Locale locale) {
        Set AFB = this.A03.AFB();
        if (AFB.isEmpty()) {
            return locale;
        }
        Locale locale2 = (Locale) this.A00.get(locale);
        if (locale2 == null) {
            locale2 = new Locale(locale.getLanguage(), locale.getCountry());
            this.A00.put(locale, locale2);
        }
        if (AFB.contains(locale2.toString())) {
            return locale2;
        }
        String language = locale.getLanguage();
        if (!AFB.contains(language)) {
            return A05;
        }
        Locale locale3 = (Locale) this.A02.get(language);
        if (locale3 != null) {
            return locale3;
        }
        Locale locale4 = new Locale(language);
        this.A02.put(language, locale4);
        return locale4;
    }

    public C11680fN(C11570fB r3, AnonymousClass0IT r4) {
        this.A03 = r3;
        this.A01 = r4;
    }

    public final Locale A00() {
        Locale AXK = AXK(AG6());
        if ("fil".equals(AXK.getLanguage())) {
            return new Locale("tl", AXK.getCountry());
        }
        return AXK;
    }
}
