package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.CHV */
public final class CHV {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();
    public final List A02 = new LinkedList();
    public final List A03 = new LinkedList();
    public final List A04 = new LinkedList();

    public static void A00(CHV chv, C13300iJ r2, Integer num) {
        List list;
        chv.A04.remove(r2);
        if (num.equals(Constants.ONE)) {
            list = chv.A02;
        } else if (num.equals(Constants.ZERO)) {
            list = chv.A03;
        } else {
            return;
        }
        list.add(r2);
    }

    public final void A01() {
        for (C155936lE r1 : this.A00) {
            r1.A00 = false;
            this.A01.add(r1);
            C13300iJ r12 = r1.A02;
            this.A04.add(r12);
            this.A02.remove(r12);
            this.A03.remove(r12);
        }
        this.A00.clear();
    }

    public final void A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13300iJ r3 = (C13300iJ) it.next();
            this.A00.add(new C155936lE(r3, true));
            this.A01.remove(new C155936lE(r3, false));
            A00(this, r3, Constants.ONE);
        }
    }
}
