package p000X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.1Ea  reason: invalid class name and case insensitive filesystem */
public final class C26571Ea {
    public ViewStub A00;
    public View A01;
    public C32211am A02;

    public final int A00() {
        View view = this.A01;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public final View A01() {
        if (this.A01 == null) {
            this.A01 = this.A00.inflate();
            this.A00 = null;
        }
        C32211am r1 = this.A02;
        if (r1 != null) {
            r1.B7G(this.A01);
            this.A02 = null;
        }
        return this.A01;
    }

    public final void A02(int i) {
        if (i == 8) {
            View view = this.A01;
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            return;
        }
        A01().setVisibility(i);
    }

    public final boolean A04() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final void A03(C32211am r1) {
        this.A02 = r1;
    }

    public C26571Ea(View view) {
        this.A01 = view;
    }

    public C26571Ea(ViewStub viewStub) {
        this.A00 = viewStub;
    }
}
