package p000X;

import java.util.Map;

/* renamed from: X.AX4 */
public final class AX4 {
    public final AnonymousClass0C1 A00;

    public AX4(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void A00(String str, String str2, Map map) {
        AnonymousClass0P4 A01 = AnonymousClass0P4.A01(str, str2);
        for (Map.Entry entry : map.entrySet()) {
            A01.A0G((String) entry.getKey(), (String) entry.getValue());
        }
        AnonymousClass0WN.A01(this.A00).BcG(A01);
    }
}
