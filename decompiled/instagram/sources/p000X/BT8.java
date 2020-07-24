package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.UUID;

/* renamed from: X.BT8 */
public final class BT8 implements C31541Ys {
    public final /* synthetic */ C26043Bed A00;
    public final /* synthetic */ String A01;

    public BT8(C26043Bed bed, String str) {
        this.A00 = bed;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AnonymousClass2MW r12 = (AnonymousClass2MW) obj;
        C25639BSx bSx = this.A00.A03;
        String str = this.A01;
        Object obj2 = r12.A00;
        AnonymousClass11J.A00(obj2);
        BT4 bt4 = new BT4(str, (String) obj2, (String) null, (String) null, (String) null);
        BTB btb = new BTB(StringFormatUtil.formatStrLocaleSafe("{\"input\":{\"client_mutation_id\":\"%s\",\"actor_id\":\"%s\",\"platform_trust_token\":\"%s\",\"payment_type\":\"%s\",\"logging_id\":\"%s\"}}", UUID.randomUUID().toString(), bSx.A00.A04(), bt4.A04, bt4.A02, UUID.randomUUID().toString()));
        AnonymousClass25V A002 = AnonymousClass25V.A00(bSx.A00);
        A002.A03(btb);
        C17850qu A02 = A002.A02(Constants.ONE);
        C26013Be9 A003 = C26013Be9.A00(A02, new C26855Btf(bSx), (AnonymousClass30Z) r12.A01);
        C12810hQ.A02(A02);
        return A003;
    }
}
