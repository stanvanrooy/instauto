package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1sB  reason: invalid class name and case insensitive filesystem */
public final class C42331sB {
    public int A00;
    public List A01 = new ArrayList(Constants.ZERO(3).length);
    public List A02 = new ArrayList(Constants.ZERO(3).length);

    public C42331sB() {
        for (int i = 0; i < Constants.ZERO(3).length; i++) {
            this.A01.add(0);
            this.A02.add(0);
        }
    }

    public static Integer A00(C42421sK r3, boolean z) {
        int ordinal = r3.ordinal();
        switch (ordinal) {
            case 0:
            case 1:
                if (z) {
                    return Constants.ZERO;
                }
                break;
            case 4:
                break;
            case 5:
                return Constants.A0C;
            default:
                AnonymousClass0QD.A01("wrong_endpoint_map", AnonymousClass000.A0G(r3.name(), ":", ordinal));
                return Constants.A0C;
        }
        return Constants.ONE;
    }
}
