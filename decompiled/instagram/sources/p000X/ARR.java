package p000X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ARR */
public final class ARR implements Serializable, Cloneable {
    public int A00;
    public final List A01 = new ArrayList();

    public final ARS A00(int i) {
        if (i < 0 || i >= this.A01.size()) {
            return null;
        }
        return (ARS) this.A01.get(i);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ARR(this.A01, this.A00);
    }

    public ARR(List list, int i) {
        this.A00 = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            List list2 = this.A01;
            ARS ars = (ARS) list.get(i2);
            list2.add(new ARS(ars.A03, ars.A01, ars.A02, ars.A00));
        }
    }
}
