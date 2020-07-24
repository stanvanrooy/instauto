package p000X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.AOU */
public final class AOU {
    public static AOU A05;
    public static final AnonymousClass9N5 A06 = new AnonymousClass9N5();
    public final FragmentActivity A00;
    public final AnonymousClass0C1 A01;
    public final CZX A02 = new CZX(this);
    public final C18750sM A03 = C18730sK.A00(new APF(this));
    public final C18750sM A04 = C18730sK.A00(APZ.A00);

    public AOU(AnonymousClass0C1 r2, FragmentActivity fragmentActivity) {
        C13150hy.A02(r2, "userSession");
        C13150hy.A02(fragmentActivity, "activity");
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public static final void A00(AOU aou, Integer num, String str) {
        C2114199x A002 = C2114299y.A00(aou.A01);
        Integer num2 = Constants.ZERO;
        Object A022 = ((AOZ) aou.A04.getValue()).A00.A02();
        if (A022 == null) {
            C13150hy.A00();
        }
        AOV aov = (AOV) A022;
        AnonymousClass9A1 r2 = new AnonymousClass9A1();
        r2.A03(aov.A02);
        r2.A04(aov.A03);
        C13150hy.A02(str, "amountUSD");
        r2.A00.put("amount_usd", str);
        r2.A02(num2);
        r2.A01(num2);
        A002.A00(num, num2, r2.A00());
    }
}
