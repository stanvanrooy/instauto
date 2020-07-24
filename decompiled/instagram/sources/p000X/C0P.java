package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* renamed from: X.C0P */
public final class C0P extends C0O {
    public final Object A09(C13080hr r3, C27123ByY byY) {
        if (r3.A0g() == C13120hv.START_ARRAY) {
            return super.A0A(r3, byY);
        }
        return A06(r3, byY);
    }

    public final Object A0D(C13080hr r7, C27123ByY byY, C13480ib r9) {
        JsonDeserializer A0B = A0B(byY);
        if (A0B != null) {
            if (r9 != null) {
                r9.A0Q();
                r7 = r9.A0o(r7);
                r7.A0p();
            }
            return A0B.A06(r7, byY);
        }
        Object A00 = C27106By5.A00(r7, this.A02);
        if (A00 != null) {
            return A00;
        }
        if (r7.A0g() == C13120hv.START_ARRAY) {
            return super.A09(r7, byY);
        }
        throw C27123ByY.A00(r7, C13120hv.FIELD_NAME, AnonymousClass000.A0O("missing property '", this.A05, "' that is to contain type id  (for class ", this.A02.A00.getName(), ")"));
    }

    public C0P(C0L c0l, C27211C2d c2d, String str, boolean z, Class cls) {
        super(c0l, c2d, str, z, cls);
    }

    public C0P(C0P c0p, C27148BzD bzD) {
        super(c0p, bzD);
    }
}
