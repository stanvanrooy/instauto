package p000X;

import android.view.View;

/* renamed from: X.1Xq  reason: invalid class name and case insensitive filesystem */
public abstract class C31331Xq extends C31341Xr {
    public boolean A00 = true;

    public final boolean A0D(AnonymousClass1ZK r8, C37351jW r9, C37351jW r10) {
        int i;
        int i2;
        AnonymousClass1ZK r2 = r8;
        if (r9 == null || ((i = r9.A00) == (i2 = r10.A00) && r9.A01 == r10.A01)) {
            return A0T(r8);
        }
        return A0V(r2, i, r9.A01, i2, r10.A01);
    }

    public final void A0J() {
        this.A00 = false;
    }

    public void A0K(AnonymousClass1ZK r1) {
    }

    public void A0L(AnonymousClass1ZK r1) {
    }

    public void A0M(AnonymousClass1ZK r1) {
    }

    public void A0N(AnonymousClass1ZK r1) {
    }

    public void A0O(AnonymousClass1ZK r1) {
    }

    public abstract boolean A0T(AnonymousClass1ZK r1);

    public abstract boolean A0U(AnonymousClass1ZK r1);

    public abstract boolean A0V(AnonymousClass1ZK r1, int i, int i2, int i3, int i4);

    public abstract boolean A0W(AnonymousClass1ZK r1, AnonymousClass1ZK r2, int i, int i2, int i3, int i4);

    public boolean A0C(AnonymousClass1ZK r3) {
        if (!this.A00 || r3.isInvalid()) {
            return true;
        }
        return false;
    }

    public final boolean A0E(AnonymousClass1ZK r9, C37351jW r10, C37351jW r11) {
        int i;
        int i2;
        int i3 = r10.A00;
        int i4 = r10.A01;
        AnonymousClass1ZK r3 = r9;
        View view = r9.itemView;
        if (r11 == null) {
            i = view.getLeft();
        } else {
            i = r11.A00;
        }
        if (r11 == null) {
            i2 = view.getTop();
        } else {
            i2 = r11.A01;
        }
        if (r9.isRemoved() || (i3 == i && i4 == i2)) {
            return A0U(r9);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return A0V(r3, i3, i4, i, i2);
    }

    public final boolean A0F(AnonymousClass1ZK r8, C37351jW r9, C37351jW r10) {
        int i = r9.A00;
        int i2 = r10.A00;
        AnonymousClass1ZK r2 = r8;
        if (i == i2 && r9.A01 == r10.A01) {
            A0R(r8);
            return false;
        }
        return A0V(r2, i, r9.A01, i2, r10.A01);
    }

    public final boolean A0G(AnonymousClass1ZK r8, AnonymousClass1ZK r9, C37351jW r10, C37351jW r11) {
        int i;
        int i2;
        int i3 = r10.A00;
        int i4 = r10.A01;
        AnonymousClass1ZK r2 = r9;
        if (r9.shouldIgnore()) {
            i2 = i4;
            i = i3;
        } else {
            i = r11.A00;
            i2 = r11.A01;
        }
        return A0W(r8, r2, i3, i4, i, i2);
    }

    public final void A0Q(AnonymousClass1ZK r2) {
        C31361Xx r0 = this.A04;
        if (r0 != null) {
            r0.Arm(r2);
        }
    }

    public final void A0P(AnonymousClass1ZK r2) {
        A0K(r2);
        C31361Xx r0 = this.A04;
        if (r0 != null) {
            r0.Arm(r2);
        }
    }

    public final void A0R(AnonymousClass1ZK r2) {
        A0M(r2);
        C31361Xx r0 = this.A04;
        if (r0 != null) {
            r0.Arm(r2);
        }
    }

    public final void A0S(AnonymousClass1ZK r2) {
        A0N(r2);
        C31361Xx r0 = this.A04;
        if (r0 != null) {
            r0.Arm(r2);
        }
    }
}
