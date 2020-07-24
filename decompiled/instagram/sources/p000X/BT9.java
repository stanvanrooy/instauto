package p000X;

import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.UUID;

/* renamed from: X.BT9 */
public final class BT9 implements C31541Ys {
    public final /* synthetic */ C26043Bed A00;
    public final /* synthetic */ String A01;

    public BT9(C26043Bed bed, String str) {
        this.A00 = bed;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr;
        String str;
        AnonymousClass2MW r13 = (AnonymousClass2MW) obj;
        C25639BSx bSx = this.A00.A03;
        AnonymousClass30Z r4 = (AnonymousClass30Z) r13.A01;
        String str2 = this.A01;
        Object obj2 = r13.A00;
        AnonymousClass11J.A00(obj2);
        BT4 A002 = BT4.A00(str2, (String) obj2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            objArr = new Object[]{UUID.randomUUID().toString(), bSx.A00.A04(), A002.A04, A002.A02, UUID.randomUUID().toString()};
            str = "{\"input\":{\"client_mutation_id\":\"%s\",\"actor_id\":\"%s\",\"platform_trust_token\":\"%s\",\"payment_type\":\"%s\",\"logging_id\":\"%s\"}}";
        } else {
            objArr = new Object[]{UUID.randomUUID().toString(), bSx.A00.A04(), A002.A04, A002.A02, null, UUID.randomUUID().toString()};
            str = "{\"input\":{\"client_mutation_id\":\"%s\",\"actor_id\":\"%s\",\"platform_trust_token\":\"%s\",\"payment_type\":\"%s\",\"target_account_id\":\"%s\",\"logging_id\":\"%s\"}}";
        }
        BTA bta = new BTA(StringFormatUtil.formatStrLocaleSafe(str, objArr));
        AnonymousClass25V A003 = AnonymousClass25V.A00(bSx.A00);
        A003.A03(bta);
        C17850qu A02 = A003.A02(Constants.ONE);
        C26013Be9 be9 = new C26013Be9(A02, new C26853Btd(bSx), new C26057Ber(bSx), r4);
        C12810hQ.A02(A02);
        return be9;
    }
}
