package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.CHS */
public final class CHS extends C17920r1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C155936lE A01;
    public final /* synthetic */ CHR A02;
    public final /* synthetic */ C13300iJ A03;
    public final /* synthetic */ boolean A04;

    public CHS(CHR chr, boolean z, C13300iJ r3, C155936lE r4, int i) {
        this.A02 = chr;
        this.A04 = z;
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = i;
    }

    public final void onFail(C43791v5 r4) {
        int A032 = AnonymousClass0Z0.A03(1638098962);
        super.onFail(r4);
        this.A01.A00 = !this.A04;
        CHR.A03(this.A02, this.A00);
        CHR.A01(this.A02);
        AnonymousClass0Z0.A0A(-1002503509, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C155936lE r1;
        C155936lE r12;
        List list;
        int A032 = AnonymousClass0Z0.A03(-2114367391);
        int A033 = AnonymousClass0Z0.A03(1470713032);
        super.onSuccess((C28691Ms) obj);
        if (this.A04) {
            CHR chr = this.A02;
            CHV chv = chr.A01;
            C13300iJ r6 = this.A03;
            Integer num = chr.A02;
            chv.A00.add(new C155936lE(r6, true));
            Iterator it = chv.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = null;
                    break;
                }
                r12 = (C155936lE) it.next();
                if (r12.A02.equals(r6)) {
                    break;
                }
            }
            CHV.A00(chv, r6, num);
            list = chv.A01;
        } else {
            CHV chv2 = this.A02.A01;
            C13300iJ r5 = this.A03;
            chv2.A01.add(new C155936lE(r5, false));
            Iterator it2 = chv2.A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = (C155936lE) it2.next();
                if (r1.A02.equals(r5)) {
                    break;
                }
            }
            chv2.A04.add(r5);
            chv2.A02.remove(r5);
            chv2.A03.remove(r5);
            list = chv2.A00;
        }
        list.remove(r12);
        this.A03.A0M(this.A04);
        CHR.A02(this.A02);
        AnonymousClass0Z0.A0A(1034854431, A033);
        AnonymousClass0Z0.A0A(1577630019, A032);
    }
}
