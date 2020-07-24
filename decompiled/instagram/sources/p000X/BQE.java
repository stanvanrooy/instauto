package p000X;

import java.security.spec.InvalidParameterSpecException;
import org.json.JSONObject;

/* renamed from: X.BQE */
public final class BQE implements BR9 {
    public AnonymousClass0RN A00;
    public AnonymousClass0QT A01;
    public AnonymousClass0C1 A02;

    public final void A00(String str, int i, JSONObject jSONObject, int i2) {
        String str2;
        int length;
        C25569BQb bQb = new C25569BQb(this.A01.A02("bd_pdc_signals"));
        if (bQb.A0B()) {
            bQb.A08("asid", str);
            bQb.A07("ct", Long.valueOf((long) i));
            String jSONObject2 = jSONObject.toString();
            try {
                String[] split = str.split("-");
                if (split == null || (length = split.length) == 0 || length < 5) {
                    throw new IllegalArgumentException("Null App Session Id");
                }
                String A0E = AnonymousClass000.A0E(split[length - 2], split[length - 1]);
                if (A0E.length() == 16) {
                    str2 = BHY.A00(jSONObject2, A0E);
                    bQb.A08("sjd", str2);
                    bQb.A07("rt", Long.valueOf((long) i2));
                    bQb.A01();
                    return;
                }
                throw new InvalidParameterSpecException("Invalid Length");
            } catch (Throwable th) {
                C54802Yz.A00(th);
                str2 = "{}";
            }
        }
    }

    public final void BtQ(Object obj) {
        try {
            AnonymousClass0C1 r2 = (AnonymousClass0C1) obj;
            this.A02 = r2;
            this.A01 = AnonymousClass0QT.A00(r2, this.A00);
        } catch (ClassCastException e) {
            C54802Yz.A00(e);
        }
    }

    public BQE(AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = AnonymousClass0QT.A00(r2, r3);
    }
}
