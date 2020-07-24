package p000X;

import com.instagram.model.shopping.ProductSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.CRJ */
public final class CRJ extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ CRO A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CRJ(CRO cro, boolean z, List list, boolean z2) {
        super(1);
        this.A00 = cro;
        this.A03 = z;
        this.A01 = list;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0D;
        Boolean bool;
        CS2 cs2;
        CS2 cs22;
        CQN cqn = (CQN) obj;
        C13150hy.A02(cqn, "$receiver");
        if (this.A03) {
            A0D = AnonymousClass10N.A0A(this.A01);
        } else {
            A0D = AnonymousClass10N.A0D(this.A00.A00.A00.A02, AnonymousClass10N.A0A(this.A01));
        }
        Set set = cqn.A03;
        List list = this.A01;
        ArrayList<C27702CNw> arrayList = new ArrayList<>();
        for (Object next : list) {
            C27702CNw cNw = (C27702CNw) next;
            C27781CQz cQz = cNw.A00;
            C13150hy.A01(cQz, "item.layoutContent");
            C27789CRh cRh = cQz.A02;
            Boolean bool2 = null;
            if (cRh == null || (cs22 = cRh.A01) == null) {
                bool = null;
            } else {
                bool = cs22.A00;
            }
            boolean z = true;
            if (!C13150hy.A05(bool, true)) {
                C27781CQz cQz2 = cNw.A00;
                C13150hy.A01(cQz2, "item.layoutContent");
                C27788CRg cRg = cQz2.A01;
                if (!(cRg == null || (cs2 = cRg.A01) == null)) {
                    bool2 = cs2.A00;
                }
                if (!C13150hy.A05(bool2, true)) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass10K.A00(arrayList, 10));
        for (C27702CNw cNw2 : arrayList) {
            arrayList2.add(cNw2.A02);
        }
        return CQN.A00(cqn, (String) null, A0D, (ProductSource) null, ALT.A00(set, AnonymousClass10N.A0E(arrayList2)), (Set) null, false, false, this.A02, 21);
    }
}
