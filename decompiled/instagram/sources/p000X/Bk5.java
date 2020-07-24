package p000X;

import android.util.SparseArray;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.UUID;

/* renamed from: X.Bk5 */
public final class Bk5 implements Be5 {
    public final AnonymousClass0C1 A00;

    public final C26141BgL BbB(SparseArray sparseArray, AnonymousClass30Z r6) {
        C26356Bk7 bk7 = new C26356Bk7(StringFormatUtil.formatStrLocaleSafe("{\"%s\":{\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\"}}", "data", "payment_type", "FBPAY_HUB", "client_mutation_id", UUID.randomUUID().toString(), "email_id", sparseArray.get(12)));
        AnonymousClass25V A002 = AnonymousClass25V.A00(this.A00);
        A002.A03(bk7);
        C17850qu A02 = A002.A02(Constants.ONE);
        C26013Be9 A003 = C26013Be9.A00(A02, C26358Bk9.A01, r6);
        C12810hQ.A02(A02);
        return A003;
    }

    public final C26141BgL BfJ(SparseArray sparseArray, AnonymousClass30Z r8) {
        C17850qu A02;
        C31541Ys r0;
        if (sparseArray.get(12) == null) {
            C26357Bk8 bk8 = new C26357Bk8(StringFormatUtil.formatStrLocaleSafe("{\"%s\":{\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\"}}", "data", "payment_type", "FBPAY_HUB", "client_mutation_id", UUID.randomUUID().toString(), "user_input_email_address", sparseArray.get(1), "is_default", sparseArray.get(3)));
            AnonymousClass25V A002 = AnonymousClass25V.A00(this.A00);
            A002.A03(bk8);
            A02 = A002.A02(Constants.ONE);
            r0 = C26358Bk9.A00;
        } else {
            C26355Bk6 bk6 = new C26355Bk6(StringFormatUtil.formatStrLocaleSafe("{\"%s\":{\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\"}}", "data", "payment_type", "FBPAY_HUB", "client_mutation_id", UUID.randomUUID().toString(), "user_input_email_address", sparseArray.get(1), "email_id", sparseArray.get(12), "is_default", sparseArray.get(3)));
            AnonymousClass25V A003 = AnonymousClass25V.A00(this.A00);
            A003.A03(bk6);
            A02 = A003.A02(Constants.ONE);
            r0 = C26358Bk9.A02;
        }
        C26013Be9 A004 = C26013Be9.A00(A02, r0, r8);
        C12810hQ.A02(A02);
        return A004;
    }

    public Bk5(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }
}
