package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CEC */
public final class CEC implements View.OnClickListener {
    public final /* synthetic */ CG1 A00;
    public final /* synthetic */ C27473CEp A01;

    public CEC(CG1 cg1, C27473CEp cEp) {
        this.A00 = cg1;
        this.A01 = cEp;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1582165381);
        CGZ cgz = this.A00.A01;
        C27473CEp cEp = this.A01;
        CEG ceg = cgz.A00.A06;
        List list = ceg.A01.A07.A05;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C27473CEp) it.next()).A06.equals(cEp.A06)) {
                    it.remove();
                    CFS cfs = ceg.A01.A07;
                    AnonymousClass0a4.A06(list);
                    cfs.A05 = list;
                    CDA.A00(ceg.A02, Constants.A14);
                    ceg.notifyDataSetChanged();
                    break;
                }
            } else {
                break;
            }
        }
        CE7 ce7 = cgz.A00;
        List list2 = ce7.A07.A07.A05;
        ArrayList arrayList = new ArrayList();
        for (int size = list2.size() - 1; size > 0; size--) {
            C27473CEp cEp2 = (C27473CEp) list2.get(size);
            if (CDX.A02(cEp2, list2.subList(0, size))) {
                arrayList.add(cEp2);
            }
        }
        ce7.A09 = arrayList;
        CE7.A00(cgz.A00);
        AnonymousClass0Z0.A0C(1995971708, A05);
    }
}
