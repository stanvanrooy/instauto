package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.UUID;

/* renamed from: X.BT6 */
public final class BT6 implements C31541Ys {
    public final /* synthetic */ C26043Bed A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public BT6(C26043Bed bed, String str, String str2) {
        this.A00 = bed;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AnonymousClass2MW r12 = (AnonymousClass2MW) obj;
        C25639BSx bSx = this.A00.A03;
        String str = this.A02;
        Object obj2 = r12.A00;
        AnonymousClass11J.A00(obj2);
        BT4 bt4 = new BT4(str, (String) obj2, (String) null, (String) null, this.A01);
        String str2 = bt4.A00;
        AnonymousClass11J.A00(str2);
        BT7 bt7 = new BT7(StringFormatUtil.formatStrLocaleSafe("{\"input\":{\"client_mutation_id\":\"%s\",\"actor_id\":\"%s\",\"platform_trust_token\":\"%s\",\"payment_type\":\"%s\",\"authentication_ticket_id\":\"%s\",\"logging_id\":\"%s\"}}", UUID.randomUUID().toString(), bSx.A00.A04(), bt4.A04, bt4.A02, str2, UUID.randomUUID().toString()));
        AnonymousClass25V A002 = AnonymousClass25V.A00(bSx.A00);
        A002.A03(bt7);
        C17850qu A022 = A002.A02(Constants.ONE);
        C26013Be9 A003 = C26013Be9.A00(A022, new C25647BTg(bSx), (AnonymousClass30Z) r12.A01);
        C12810hQ.A02(A022);
        return A003;
    }
}
