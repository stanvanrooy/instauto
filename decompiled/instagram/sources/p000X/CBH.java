package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.CBH */
public final class CBH implements C15860ne {
    public final C26631Eg A00;
    public final AnonymousClass0C1 A01;
    public final AnonymousClass1I6 A02;
    public final Context A03;

    public final void BsL(AnonymousClass1NG r1) {
    }

    public final void Ain(AnonymousClass1LW r4) {
        this.A00.A04(AnonymousClass000.A0E("top_items_", this.A01.A04()), new CBJ(this, r4));
    }

    public final void BeQ(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AnonymousClass1NG) it.next()).A04());
        }
        CBM cbm = new CBM();
        cbm.A00 = new ArrayList(linkedHashSet);
        this.A00.A07(AnonymousClass000.A0E("top_items_", this.A01.A04()), cbm, new CBI(this, cbm));
    }

    public final void clear() {
        try {
            C26631Eg r2 = this.A00;
            String A0E = AnonymousClass000.A0E("top_items_", this.A01.A04());
            C12670hC.A01();
            new C26741Fb(r2, A0E).run();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public CBH(Context context, AnonymousClass0C1 r5, AnonymousClass1I6 r6) {
        this.A03 = context;
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = new C26631Eg(context, "top_items", new CBF(this));
    }
}
