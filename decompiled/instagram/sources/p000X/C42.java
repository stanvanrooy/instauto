package p000X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.C42 */
public final class C42 extends AWZ {
    public final /* synthetic */ C27233C3z A00;
    public final /* synthetic */ C24967AxA A01;

    public C42(C27233C3z c3z, C24967AxA axA) {
        this.A00 = c3z;
        this.A01 = axA;
    }

    public final void A03(Exception exc) {
        C24984AxR.A02(exc, this.A01);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        Long valueOf;
        List<C46> list = ((C47) obj).A00;
        ArrayList arrayList = new ArrayList(list.size());
        for (C46 c46 : list) {
            C26813Bsy bsy = (C26813Bsy) C26813Bsy.A01.get(c46.A03);
            if (bsy == null) {
                bsy = C26813Bsy.A06;
            }
            long j = c46.A00;
            C13300iJ r9 = c46.A01;
            String str = c46.A04;
            Integer num = Constants.ZERO;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Long l = c46.A02;
            if (l == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(timeUnit.convert(l.longValue(), TimeUnit.SECONDS));
            }
            arrayList.add(new C4A(j, r9, str, bsy, num, valueOf));
        }
        C24984AxR.A01(arrayList, this.A01);
        C24984AxR.A00(this.A01);
    }
}
