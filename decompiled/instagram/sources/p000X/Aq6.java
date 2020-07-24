package p000X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.Aq6 */
public final class Aq6 implements C29069CrM {
    public final /* synthetic */ C24603AqS A00;

    public Aq6(C24603AqS aqS) {
        this.A00 = aqS;
    }

    public final /* bridge */ /* synthetic */ Object A5Y(Object obj, Object obj2) {
        C24585AqA aqA = (C24585AqA) obj;
        C208128wR r15 = (C208128wR) obj2;
        C24585AqA aqA2 = C24585AqA.A02;
        if (aqA == aqA2) {
            return new C24612Aqb(aqA2, AnonymousClass10U.A00, "");
        }
        Map map = r15.A00;
        C13150hy.A01(aqA, "outgoingState");
        C24603AqS aqS = this.A00;
        Collection values = map.values();
        ArrayList<C13300iJ> arrayList = new ArrayList<>();
        for (Object next : values) {
            if (!C13150hy.A05((C13300iJ) next, aqS.A00.A06)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass10K.A00(arrayList, 10));
        for (C13300iJ ASv : arrayList) {
            arrayList2.add(ASv.ASv());
        }
        C24603AqS aqS2 = this.A00;
        Collection values2 = map.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : values2) {
            if (!C13150hy.A05((C13300iJ) next2, aqS2.A00.A06)) {
                arrayList3.add(next2);
            }
        }
        return new C24612Aqb(aqA, arrayList2, AnonymousClass10N.A09(arrayList3, (CharSequence) null, (CharSequence) null, (CharSequence) null, AnonymousClass7PM.A00, 31));
    }
}
