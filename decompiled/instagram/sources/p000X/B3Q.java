package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B3Q */
public final class B3Q extends C689130g {
    public B3I A00;
    public List A01 = new ArrayList();

    public B3Q(B3I b3i, B3N b3n) {
        this.A00 = b3i;
        for (int i = 0; i < b3i.A04.size(); i++) {
            List list = this.A01;
            boolean z = false;
            if (b3i.A01 == Constants.ONE) {
                z = true;
            }
            list.add(new B3P(z));
        }
        if (b3i.A01 == Constants.ONE) {
            this.A01.add(new B3O(b3n));
        }
        init(this.A01);
        A00();
    }

    public final void A00() {
        clear();
        List list = this.A00.A04;
        for (int i = 0; i < list.size(); i++) {
            addModel(list.get(i), (C29131Os) this.A01.get(i));
        }
        B3I b3i = this.A00;
        boolean z = false;
        if (b3i.A01 == Constants.ONE) {
            z = true;
        }
        if (z) {
            List list2 = this.A01;
            addModel(b3i, (C29131Os) list2.get(list2.size() - 1));
        }
        updateListView();
    }
}
