package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.C49 */
public final class C49 {
    public C4A A00;
    public List A01 = new ArrayList();
    public final Map A02 = new HashMap();

    public final List A00() {
        ArrayList arrayList = new ArrayList(this.A02.size());
        for (Long longValue : this.A01) {
            C4A c4a = (C4A) this.A02.get(Long.valueOf(longValue.longValue()));
            if (c4a != null) {
                arrayList.add(c4a);
            }
        }
        return arrayList;
    }

    public final List A01(C26813Bsy bsy) {
        ArrayList arrayList = new ArrayList();
        for (Long longValue : this.A01) {
            C4A c4a = (C4A) this.A02.get(Long.valueOf(longValue.longValue()));
            if (c4a != null && c4a.A02 == bsy) {
                arrayList.add(c4a);
            }
        }
        return arrayList;
    }

    public final void A02(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4A c4a = (C4A) it.next();
            arrayList.add(Long.valueOf(c4a.A00));
            if (!this.A02.containsKey(Long.valueOf(c4a.A00))) {
                this.A02.put(Long.valueOf(c4a.A00), c4a);
            }
        }
        this.A01 = arrayList;
    }
}
