package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C1X */
public final class C1X {
    public final List A00;

    public final void A00(C27123ByY byY, Object obj, C13480ib r7) {
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            C13080hr A0n = r7.A0n();
            A0n.A0p();
            ((C27176Bzt) this.A00.get(i)).A08(A0n, byY, obj);
        }
    }

    public C1X() {
        this.A00 = new ArrayList();
    }

    public C1X(List list) {
        this.A00 = list;
    }
}
