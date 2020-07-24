package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.C0O */
public class C0O extends C0N implements Serializable {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f A[RETURN] */
    public static final Object A01(C0O c0o, C13080hr r6, C27123ByY byY) {
        String Aco;
        C13120hv r1;
        C27125Bya A00;
        boolean A0P = r6.A0P();
        if (!A0P) {
            if (c0o.A03 == null) {
                A00 = C27123ByY.A00(r6, C13120hv.START_ARRAY, AnonymousClass000.A0E("need JSON Array to contain As.WRAPPER_ARRAY type information for class ", c0o.A02.A00.getName()));
            }
            Aco = c0o.A04.Aco();
            JsonDeserializer A0C = c0o.A0C(byY, Aco);
            if (c0o.A06 && r6.A0g() == C13120hv.START_OBJECT) {
                C13480ib r12 = new C13480ib((C3U) null);
                r12.A0T();
                r12.A0d(c0o.A05);
                r12.A0g(Aco);
                r6 = C15750nT.A00(r12.A0o(r6), r6);
                r6.A0p();
            }
            Object A06 = A0C.A06(r6, byY);
            if (!A0P || r6.A0p() == (r1 = C13120hv.END_ARRAY)) {
                return A06;
            }
            throw C27123ByY.A00(r6, r1, "expected closing END_ARRAY after type information and deserialized value");
        }
        C13120hv A0p = r6.A0p();
        C13120hv r3 = C13120hv.VALUE_STRING;
        if (A0p == r3) {
            Aco = r6.A0t();
            r6.A0p();
            JsonDeserializer A0C2 = c0o.A0C(byY, Aco);
            C13480ib r122 = new C13480ib((C3U) null);
            r122.A0T();
            r122.A0d(c0o.A05);
            r122.A0g(Aco);
            r6 = C15750nT.A00(r122.A0o(r6), r6);
            r6.A0p();
            Object A062 = A0C2.A06(r6, byY);
            if (!A0P || r6.A0p() == (r1 = C13120hv.END_ARRAY)) {
            }
        } else {
            if (c0o.A03 == null) {
                A00 = C27123ByY.A00(r6, r3, AnonymousClass000.A0J("need JSON String that contains type id (for subtype of ", c0o.A02.A00.getName(), ")"));
            }
            Aco = c0o.A04.Aco();
            JsonDeserializer A0C22 = c0o.A0C(byY, Aco);
            C13480ib r1222 = new C13480ib((C3U) null);
            r1222.A0T();
            r1222.A0d(c0o.A05);
            r1222.A0g(Aco);
            r6 = C15750nT.A00(r1222.A0o(r6), r6);
            r6.A0p();
            Object A0622 = A0C22.A06(r6, byY);
            if (!A0P || r6.A0p() == (r1 = C13120hv.END_ARRAY)) {
            }
        }
        throw A00;
    }

    public Object A09(C13080hr r2, C27123ByY byY) {
        return A01(this, r2, byY);
    }

    public final Object A0A(C13080hr r2, C27123ByY byY) {
        return A01(this, r2, byY);
    }

    public C0O(C0L c0l, C27211C2d c2d, String str, boolean z, Class cls) {
        super(c0l, c2d, str, z, cls);
    }

    public C0O(C0O c0o, C27148BzD bzD) {
        super(c0o, bzD);
    }
}
