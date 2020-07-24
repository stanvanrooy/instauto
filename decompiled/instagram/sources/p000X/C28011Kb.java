package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Kb  reason: invalid class name and case insensitive filesystem */
public final class C28011Kb {
    public boolean A00 = false;
    public final List A01 = new ArrayList();

    public final void A00(View view) {
        if (this.A00) {
            for (C196388an r0 : this.A01) {
                View view2 = (View) r0.A00.get();
                if (view2 != null && view2 == view) {
                    return;
                }
            }
            this.A01.add(new C196388an(view));
        }
    }

    public final void A01(View view) {
        if (this.A00) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((C196388an) it.next()).A00.get();
                if (view2 == null || view2 == view) {
                    it.remove();
                }
            }
        }
    }
}
