package p000X;

import com.instagram.model.shopping.Product;

/* renamed from: X.CQO */
public final class CQO implements C11200ea {
    public final /* synthetic */ CQM A00;
    public final /* synthetic */ C27702CNw A01;

    public CQO(CQM cqm, C27702CNw cNw) {
        this.A00 = cqm;
        this.A01 = cNw;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1445972725);
        int A032 = AnonymousClass0Z0.A03(-1904539927);
        CQF cqf = this.A00.A00;
        Product product = ((C213669Jf) obj).A00;
        C13150hy.A01(product, C193418Ps.$const$string(102));
        C27702CNw cNw = this.A01;
        CQG cqg = cqf.A07;
        if (cqg == null) {
            C13150hy.A03("productsStateManager");
        }
        cqg.A03(product, cNw);
        if (cqf.A00 != null) {
            AnonymousClass0C1 r1 = cqf.A03;
            if (r1 == null) {
                C13150hy.A03("userSession");
            }
            C23300zv.A00(r1).A03(C213669Jf.class, cqf.A00);
        }
        AnonymousClass0Z0.A0A(-658809785, A032);
        AnonymousClass0Z0.A0A(-2123142447, A03);
    }
}
