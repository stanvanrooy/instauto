package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AL4 */
public final class AL4 {
    public static final long A0D = TimeUnit.SECONDS.toMillis(60);
    public C191188Ff A00;
    public C38031kc A01;
    public C23718AZy A02;
    public String A03;
    public String A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final C27341Hl A06;
    public final AnonymousClass0C1 A07;
    public final C13300iJ A08;
    public final AL1 A09;
    public final C23400AKz A0A;
    public final String A0B;
    public final ALD A0C;

    public static void A00(AL4 al4) {
        C23300zv.A00(al4.A07).A03(C23721Aa5.class, al4.A02);
        AnonymousClass0ZA.A07(al4.A05, (Object) null);
    }

    public static void A01(AL4 al4) {
        C27341Hl r0 = al4.A06;
        Context context = r0.getContext();
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(r0);
        AnonymousClass0C1 r1 = al4.A07;
        String str = al4.A04;
        AXY axy = new AXY(context, A002, r1);
        axy.A01 = str;
        axy.A02(al4.A0B, Constants.ONE, (Integer) null, (AWN) null);
    }

    public static void A02(AL4 al4, AWZ awz, String str) {
        AL5 al5 = new AL5(al4, str, awz);
        ALD ald = al4.A0C;
        if (C35251g3.A09(ald.A02, ALD.A04)) {
            C178347jX r0 = ald.A00;
            if (r0 != null) {
                r0.A00();
            }
            al5.A02();
            return;
        }
        C35251g3.A02(ald.A01, new AL6(ald, al5), ALD.A04);
    }

    public AL4(C38031kc r4, AnonymousClass0C1 r5, Activity activity, C27341Hl r7, C13300iJ r8, C23400AKz aKz, ALP alp) {
        this.A0B = r4.A0I;
        this.A01 = r4;
        this.A07 = r5;
        this.A06 = r7;
        this.A08 = r8;
        this.A0A = aKz;
        Context context = r7.getContext();
        this.A0C = new ALD(activity, context, alp);
        AL1 al1 = new AL1(r5, C55262aK.A00(context));
        al1.A02 = r8.getId();
        al1.A01 = this.A0B;
        this.A09 = al1;
    }
}
