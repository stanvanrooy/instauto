package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.14f  reason: invalid class name and case insensitive filesystem */
public final class C243414f implements C243214d {
    public final Map A00 = new HashMap();

    public final synchronized void A8g(String str, AnonymousClass15G r3) {
        A00(str).remove(r3);
    }

    public final synchronized C106364iO AOd(String str, AnonymousClass15G r3) {
        return (C106364iO) A00(str).get(r3);
    }

    public final void Ad8() {
    }

    public final synchronized void Bce(String str, AnonymousClass15G r3, C106364iO r4) {
        A00(str).put(r3, r4);
    }

    private Map A00(String str) {
        if (this.A00.containsKey(str)) {
            return (Map) this.A00.get(str);
        }
        HashMap hashMap = new HashMap();
        this.A00.put(str, hashMap);
        return hashMap;
    }
}
