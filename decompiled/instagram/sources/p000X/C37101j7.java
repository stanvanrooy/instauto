package p000X;

import java.util.List;

/* renamed from: X.1j7  reason: invalid class name and case insensitive filesystem */
public final class C37101j7 implements C28261La {
    public final /* synthetic */ C37061j3 A00;

    public C37101j7(C37061j3 r1) {
        this.A00 = r1;
    }

    public final boolean apply(Object obj) {
        List list;
        instagramComment r4 = (instagramComment) obj;
        boolean z = false;
        if (r4 == null) {
            return false;
        }
        if (r4.A0I == Constants.ONE && (list = r4.A0Z) != null && !list.isEmpty()) {
            z = true;
        }
        return !z;
    }
}
