package p000X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.CJQ */
public final class CJQ extends C17920r1 {
    public final /* synthetic */ CJJ A00;

    public CJQ(CJJ cjj) {
        this.A00 = cjj;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(544605417);
        CJJ.A02(this.A00);
        AnonymousClass0Z0.A0A(-535807190, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-102959744);
        this.A00.A0H = true;
        AnonymousClass0Z0.A0A(958550046, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1375344308);
        int A032 = AnonymousClass0Z0.A03(-718736275);
        C27585CJe cJe = ((C27587CJg) obj).A00;
        if (cJe.A03.booleanValue()) {
            CJJ cjj = this.A00;
            cjj.A0B = cJe.A01.A00;
            cjj.A0E = cJe.A04;
            cjj.A0G = ImmutableList.A09(cJe.A05);
            CJJ cjj2 = this.A00;
            CJN cjn = cjj2.A04;
            String str = cJe.A02.A00;
            String str2 = cjj2.A0B;
            ImmutableList A09 = ImmutableList.A09(cJe.A05);
            CJJ cjj3 = this.A00;
            cjn.A01(str, str2, A09, (List) null, cjj3.A0A, CJJ.A01(cjj3));
        } else {
            CJJ.A02(this.A00);
        }
        AnonymousClass0Z0.A0A(-1928863855, A032);
        AnonymousClass0Z0.A0A(-698669592, A03);
    }
}
