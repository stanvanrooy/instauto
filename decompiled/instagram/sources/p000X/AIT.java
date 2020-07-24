package p000X;

import android.util.SparseArray;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.flipper.core.StateSummary;
import java.util.UUID;

/* renamed from: X.AIT */
public final class AIT implements Be5 {
    public final AnonymousClass0C1 A00;

    public final C26141BgL BbB(SparseArray sparseArray, AnonymousClass30Z r6) {
        AIU aiu = new AIU(StringFormatUtil.formatStrLocaleSafe(StateSummary.$const$string(82), "input", AnonymousClass0C5.$const$string(372), "fbpay_hub", AnonymousClass0C5.$const$string(72), UUID.randomUUID().toString(), "credit_card_id", sparseArray.get(12)));
        AnonymousClass25V A002 = AnonymousClass25V.A00(this.A00);
        A002.A03(aiu);
        C17850qu A02 = A002.A02(Constants.ONE);
        C26013Be9 A003 = C26013Be9.A00(A02, C26021BeH.A01, r6);
        C12810hQ.A02(A02);
        return A003;
    }

    public final C26141BgL BfJ(SparseArray sparseArray, AnonymousClass30Z r9) {
        boolean z = false;
        if (sparseArray.get(12) != null) {
            z = true;
        }
        String str = null;
        if (!z) {
            str = (String) sparseArray.get(13);
        }
        String str2 = (String) sparseArray.get(15);
        AnonymousClass0a4.A06(str2);
        C26141BgL bgL = new C26141BgL();
        C15910nj r1 = new C15910nj();
        if (str != null) {
            r1.A06("creditCardNumber", str);
        }
        r1.A06("csc", str2);
        C17850qu r3 = new C17850qu(C17780qn.A00(668, new C205788rR(r1)).A02(668, new AnonymousClass1C5((C17750qk) null)).A02(668, new C205988ro()), (C17740qj) null, "FetchPaymentToken", "https://secure.facebook.com/payments/generate_token");
        r3.A00 = new C26022BeI(this, z, sparseArray, bgL);
        C12810hQ.A02(r3);
        return bgL;
    }

    public AIT(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }
}
