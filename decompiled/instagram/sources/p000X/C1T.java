package p000X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.C1T */
public final class C1T {
    public final ArrayList A00 = new ArrayList();
    public final HashMap A01 = new HashMap();

    public final void A00(C27176Bzt bzt, C27106By5 by5) {
        Integer valueOf = Integer.valueOf(this.A00.size());
        this.A00.add(new C27209C2a(bzt, by5));
        this.A01.put(bzt.A07, valueOf);
        this.A01.put(by5.A08(), valueOf);
    }
}
