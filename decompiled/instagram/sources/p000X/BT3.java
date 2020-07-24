package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.UUID;

/* renamed from: X.BT3 */
public final class BT3 implements C31541Ys {
    public final /* synthetic */ C26043Bed A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public BT3(C26043Bed bed, String str, String str2, String str3) {
        this.A00 = bed;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AnonymousClass2MW r14 = (AnonymousClass2MW) obj;
        C25639BSx bSx = this.A00.A03;
        String str = this.A02;
        Object obj2 = r14.A00;
        AnonymousClass11J.A00(obj2);
        BT4 bt4 = new BT4(str, (String) obj2, this.A01, this.A03, (String) null);
        BT5 bt5 = new BT5(StringFormatUtil.formatStrLocaleSafe("{\"input\":{\"client_mutation_id\":\"%s\",\"new_pin\":{\"sensitive_string_value\":\"%s\"},\"password\":{\"sensitive_string_value\":\"%s\"},\"platform_trust_token\":\"%s\"}}", UUID.randomUUID().toString(), bt4.A03, bt4.A01, bt4.A04));
        AnonymousClass25V A002 = AnonymousClass25V.A00(bSx.A00);
        A002.A03(bt5);
        C17850qu A022 = A002.A02(Constants.ONE);
        C26013Be9 A003 = C26013Be9.A00(A022, new C26844BtU(bSx), (AnonymousClass30Z) r14.A01);
        C12810hQ.A02(A022);
        return A003;
    }
}
