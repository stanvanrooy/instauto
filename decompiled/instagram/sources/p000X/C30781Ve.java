package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ve  reason: invalid class name and case insensitive filesystem */
public final class C30781Ve {
    public boolean A00;
    public final List A01 = new ArrayList();
    public final int A02;
    public final AnonymousClass0PR A03;
    public final AnonymousClass0PQ A04;

    public final View A00() {
        if (this.A01.isEmpty()) {
            return null;
        }
        return (View) this.A01.remove(0);
    }

    public final void A01() {
        if (!this.A00 && this.A01.size() < this.A02) {
            this.A00 = true;
            this.A04.BY9(this.A03, new C30791Vf(this));
        }
    }

    public C30781Ve(AnonymousClass0PQ r2, int i, AnonymousClass0PR r4) {
        this.A04 = r2;
        this.A02 = i;
        this.A03 = r4;
    }
}
