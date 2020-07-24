package p000X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.CAY */
public final class CAY extends C256319p {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ CHP A01;

    public CAY(CHP chp, LinearLayoutManager linearLayoutManager) {
        this.A01 = chp;
        this.A00 = linearLayoutManager;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0Z0.A03(385259586);
        C6Y c6y = this.A01.A05;
        c6y.A05 = Math.max(this.A00.A1h(), c6y.A05);
        AnonymousClass0Z0.A0A(-320824574, A03);
    }
}
