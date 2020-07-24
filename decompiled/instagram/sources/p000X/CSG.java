package p000X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.CSG */
public final class CSG extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ CSK A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CSG(CSK csk, boolean z, List list, boolean z2) {
        super(1);
        this.A00 = csk;
        this.A03 = z;
        this.A01 = list;
        this.A02 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r1 != false) goto L_0x0042;
     */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0D;
        boolean z;
        CRA cra;
        CSX csx = (CSX) obj;
        C13150hy.A02(csx, "$receiver");
        if (this.A03) {
            A0D = AnonymousClass10N.A0A(this.A01);
        } else {
            A0D = AnonymousClass10N.A0D(this.A00.A00.A00.A01, AnonymousClass10N.A0A(this.A01));
        }
        Set set = csx.A02;
        List list = this.A01;
        ArrayList<C27702CNw> arrayList = new ArrayList<>();
        for (Object next : list) {
            C27781CQz cQz = ((C27702CNw) next).A00;
            C13150hy.A01(cQz, "item.layoutContent");
            CR3 cr3 = cQz.A00;
            if (!(cr3 == null || (cra = cr3.A01) == null)) {
                boolean z2 = cra.A03;
                z = true;
            }
            z = false;
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass10K.A00(arrayList, 10));
        for (C27702CNw cNw : arrayList) {
            arrayList2.add(cNw.A02);
        }
        return CSX.A00(csx, (String) null, A0D, ALT.A00(set, AnonymousClass10N.A0E(arrayList2)), false, false, this.A02, 1);
    }
}
