package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.UUID;

/* renamed from: X.BT1 */
public final class BT1 implements C31541Ys {
    public final /* synthetic */ C26043Bed A00;
    public final /* synthetic */ String A01;

    public BT1(C26043Bed bed, String str) {
        this.A00 = bed;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AnonymousClass2MW r9 = (AnonymousClass2MW) obj;
        C25639BSx bSx = this.A00.A03;
        String str = this.A01;
        Object obj2 = r9.A00;
        AnonymousClass11J.A00(obj2);
        BT4 A002 = BT4.A00(str, (String) obj2);
        String uuid = UUID.randomUUID().toString();
        AnonymousClass0C1 r4 = bSx.A00;
        BT2 bt2 = new BT2(StringFormatUtil.formatStrLocaleSafe("{\"input\":{\"client_mutation_id\":\"%s\",\"actor_id\":\"%s\",\"platform_trust_token\":\"%s\",\"payment_type\":\"%s\",\"format_type\":\"NUM_4_DIGITS\"}}", uuid, r4.A04(), A002.A04, A002.A02));
        AnonymousClass25V A003 = AnonymousClass25V.A00(r4);
        A003.A03(bt2);
        C17850qu A02 = A003.A02(Constants.ONE);
        C26013Be9 A004 = C26013Be9.A00(A02, new C26834BtK(bSx), (AnonymousClass30Z) r9.A01);
        C12810hQ.A02(A02);
        return A004;
    }
}
