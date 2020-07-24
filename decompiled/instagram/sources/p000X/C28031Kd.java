package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Kd  reason: invalid class name and case insensitive filesystem */
public final class C28031Kd implements C28041Ke {
    public final C28011Kb A00;
    public final List A01 = new ArrayList();

    public final void A2T(C32781bq r2) {
        this.A01.add(r2);
    }

    public final void clear() {
        this.A01.clear();
    }

    public final Iterator iterator() {
        return new C37271jO(this);
    }

    public C28031Kd(C28011Kb r2) {
        this.A00 = r2;
    }
}
