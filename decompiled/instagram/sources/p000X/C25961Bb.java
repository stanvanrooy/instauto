package p000X;

import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Bb  reason: invalid class name and case insensitive filesystem */
public class C25961Bb {
    public final CookieHandler A00;

    public void A01(URI uri, List list) {
        for (Map.Entry next : this.A00.get(uri, Collections.emptyMap()).entrySet()) {
            for (String r2 : (List) next.getValue()) {
                list.add(new C17190pp((String) next.getKey(), r2));
            }
        }
    }

    public void A02(URI uri, Map map) {
        this.A00.put(uri, map);
    }

    public C25961Bb(CookieHandler cookieHandler) {
        AnonymousClass0a4.A06(cookieHandler);
        this.A00 = cookieHandler;
    }
}
