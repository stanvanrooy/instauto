package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;

/* renamed from: X.C0T */
public final class C0T extends C09 {
    public final C3P A00;

    public final void A04(JsonSerializer jsonSerializer) {
        super.A04(jsonSerializer);
        JsonSerializer jsonSerializer2 = this.A02;
        if (jsonSerializer2 != null) {
            C3P c3p = this.A00;
            if (jsonSerializer2.A09()) {
                c3p = new C2M(c3p, ((UnwrappingBeanSerializer) jsonSerializer2).A00);
            }
            this.A02 = jsonSerializer2.A06(c3p);
        }
    }

    public C0T(C09 c09, C3P c3p) {
        super(c09, c09.A06);
        this.A00 = c3p;
    }

    public C0T(C0T c0t, C3P c3p, C12960hf r3) {
        super(c0t, r3);
        this.A00 = c3p;
    }
}
