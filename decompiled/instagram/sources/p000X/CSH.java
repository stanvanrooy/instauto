package p000X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.CSH */
public final class CSH extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ CSJ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CSH(CSJ csj, boolean z, List list, boolean z2) {
        super(1);
        this.A00 = csj;
        this.A03 = z;
        this.A01 = list;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0D;
        CRA cra;
        CSQ csq = (CSQ) obj;
        C13150hy.A02(csq, "$receiver");
        if (this.A03) {
            A0D = AnonymousClass10N.A0A(this.A01);
        } else {
            A0D = AnonymousClass10N.A0D(this.A00.A00.A00.A01, AnonymousClass10N.A0A(this.A01));
        }
        Set set = csq.A02;
        List list = this.A01;
        ArrayList<C27702CNw> arrayList = new ArrayList<>();
        for (Object next : list) {
            C27781CQz cQz = ((C27702CNw) next).A00;
            C13150hy.A01(cQz, "item.layoutContent");
            CR3 cr3 = cQz.A00;
            boolean z = true;
            if (cr3 == null || (cra = cr3.A01) == null || !cra.A03) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass10K.A00(arrayList, 10));
        for (C27702CNw cNw : arrayList) {
            arrayList2.add(cNw.A02);
        }
        return CSQ.A00(csq, (String) null, A0D, ALT.A00(set, AnonymousClass10N.A0E(arrayList2)), false, false, this.A02, 1);
    }
}
