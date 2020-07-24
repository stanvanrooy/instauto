package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Xz  reason: invalid class name and case insensitive filesystem */
public final class C31381Xz implements AnonymousClass1Y0 {
    public final /* synthetic */ RecyclerView A00;

    public final void BYI(AnonymousClass1ZK r3, C37351jW r4, C37351jW r5) {
        boolean A0F;
        r3.setIsRecyclable(false);
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A0U) {
            A0F = recyclerView.A0K.A0G(r3, r3, r4, r5);
        } else {
            A0F = recyclerView.A0K.A0F(r3, r4, r5);
        }
        if (A0F) {
            this.A00.A0a();
        }
    }

    public C31381Xz(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void BYE(AnonymousClass1ZK r3, C37351jW r4, C37351jW r5) {
        RecyclerView recyclerView = this.A00;
        r3.setIsRecyclable(false);
        if (recyclerView.A0K.A0D(r3, r4, r5)) {
            recyclerView.A0a();
        }
    }

    public final void BYG(AnonymousClass1ZK r3, C37351jW r4, C37351jW r5) {
        this.A00.A0x.A09(r3);
        RecyclerView recyclerView = this.A00;
        RecyclerView.A0F(recyclerView, r3);
        r3.setIsRecyclable(false);
        if (recyclerView.A0K.A0E(r3, r4, r5)) {
            recyclerView.A0a();
        }
    }

    public final void BsH(AnonymousClass1ZK r4) {
        RecyclerView recyclerView = this.A00;
        recyclerView.A0L.A0m(r4.itemView, recyclerView.A0x);
    }
}
