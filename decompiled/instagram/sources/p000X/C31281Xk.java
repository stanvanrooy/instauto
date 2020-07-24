package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Xk  reason: invalid class name and case insensitive filesystem */
public final class C31281Xk extends AnonymousClass1PW {
    public final /* synthetic */ RecyclerView A00;

    public C31281Xk(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void A08(int i, int i2) {
        this.A00.A0z((String) null);
        AnonymousClass1Y2 r4 = this.A00.A0G;
        boolean z = false;
        if (i2 >= 1) {
            r4.A04.add(r4.AqP(1, i, i2, (Object) null));
            r4.A00 |= 1;
            if (r4.A04.size() == 1) {
                z = true;
            }
        }
        if (z) {
            A0D();
        }
    }

    public final void A09(int i, int i2) {
        this.A00.A0z((String) null);
        AnonymousClass1Y2 r5 = this.A00.A0G;
        boolean z = false;
        if (i2 >= 1) {
            r5.A04.add(r5.AqP(2, i, i2, (Object) null));
            r5.A00 |= 2;
            if (r5.A04.size() == 1) {
                z = true;
            }
        }
        if (z) {
            A0D();
        }
    }

    public final void A0A(int i, int i2, int i3) {
        this.A00.A0z((String) null);
        AnonymousClass1Y2 r5 = this.A00.A0G;
        boolean z = false;
        if (i != i2) {
            if (i3 == 1) {
                r5.A04.add(r5.AqP(8, i, i2, (Object) null));
                r5.A00 |= 8;
                if (r5.A04.size() == 1) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
        }
        if (z) {
            A0D();
        }
    }

    public final void A0B(int i, int i2, Object obj) {
        this.A00.A0z((String) null);
        AnonymousClass1Y2 r5 = this.A00.A0G;
        boolean z = false;
        if (i2 >= 1) {
            r5.A04.add(r5.AqP(4, i, i2, obj));
            r5.A00 |= 4;
            if (r5.A04.size() == 1) {
                z = true;
            }
        }
        if (z) {
            A0D();
        }
    }

    public final void A0C() {
        this.A00.A0z((String) null);
        RecyclerView recyclerView = this.A00;
        recyclerView.A0y.A0C = true;
        recyclerView.A11(true);
        if (!this.A00.A0G.A0A()) {
            this.A00.requestLayout();
        }
    }

    public final void A0D() {
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A02 || !recyclerView.A03) {
            recyclerView.A00 = true;
            recyclerView.requestLayout();
            return;
        }
        recyclerView.postOnAnimation(recyclerView.A0r);
    }
}
