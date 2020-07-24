package p000X;

import java.util.Map;

/* renamed from: X.1od  reason: invalid class name and case insensitive filesystem */
public final class C40421od {
    public final C40581ot A00;
    public final C40441of A01;

    public C40421od(AnonymousClass0C1 r3) {
        this.A01 = new C40441of(r3);
        this.A00 = new C40581ot(r3, (String) null);
    }

    public static C17710qg A00(String str, Map map) {
        if (map.containsKey(str)) {
            return C17710qg.A01(map.get(str));
        }
        return C17700qf.A00;
    }
}
