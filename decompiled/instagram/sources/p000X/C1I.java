package p000X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.C1I */
public final class C1I implements Iterable {
    public LinkedHashMap A00;

    public final void A00(C0F c0f) {
        if (this.A00 == null) {
            this.A00 = new LinkedHashMap();
        }
        this.A00.put(new C27199C1j(c0f.A01), c0f);
    }

    public final Iterator iterator() {
        LinkedHashMap linkedHashMap = this.A00;
        if (linkedHashMap != null) {
            return linkedHashMap.values().iterator();
        }
        return Collections.emptyList().iterator();
    }
}
