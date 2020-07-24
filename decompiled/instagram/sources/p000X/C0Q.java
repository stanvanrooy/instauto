package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.C0Q */
public final class C0Q extends C0N implements Serializable {
    public static final Object A01(C0Q c0q, C13080hr r6, C27123ByY byY) {
        C27125Bya bya;
        C13120hv A0g = r6.A0g();
        C13120hv r4 = C13120hv.START_OBJECT;
        if (A0g == r4) {
            C13120hv A0p = r6.A0p();
            C13120hv r3 = C13120hv.FIELD_NAME;
            if (A0p == r3) {
                String A0t = r6.A0t();
                JsonDeserializer A0C = c0q.A0C(byY, A0t);
                r6.A0p();
                if (c0q.A06 && r6.A0g() == r4) {
                    C13480ib r1 = new C13480ib((C3U) null);
                    r1.A0T();
                    r1.A0d(c0q.A05);
                    r1.A0g(A0t);
                    r6 = C15750nT.A00(r1.A0o(r6), r6);
                    r6.A0p();
                }
                Object A06 = A0C.A06(r6, byY);
                C13120hv A0p2 = r6.A0p();
                C13120hv r12 = C13120hv.END_OBJECT;
                if (A0p2 == r12) {
                    return A06;
                }
                bya = C27123ByY.A00(r6, r12, "expected closing END_OBJECT after type information and deserialized value");
            } else {
                bya = C27123ByY.A00(r6, r3, AnonymousClass000.A0J("need JSON String that contains type id (for subtype of ", c0q.A02.A00.getName(), ")"));
            }
        } else {
            bya = C27123ByY.A00(r6, r4, AnonymousClass000.A0E("need JSON Object to contain As.WRAPPER_OBJECT type information for class ", c0q.A02.A00.getName()));
        }
        throw bya;
    }

    public final Object A09(C13080hr r2, C27123ByY byY) {
        return A01(this, r2, byY);
    }

    public final Object A0A(C13080hr r2, C27123ByY byY) {
        return A01(this, r2, byY);
    }

    public C0Q(C0L c0l, C27211C2d c2d, String str, boolean z) {
        super(c0l, c2d, str, z, (Class) null);
    }

    public C0Q(C0Q c0q, C27148BzD bzD) {
        super(c0q, bzD);
    }
}
