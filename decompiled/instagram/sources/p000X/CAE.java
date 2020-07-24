package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.CAE */
public final class CAE extends C256319p {
    public final /* synthetic */ CAA A00;

    public CAE(CAA caa) {
        this.A00 = caa;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(-425656742);
        if (i == 0) {
            CA9 ca9 = this.A00.A00;
            AnonymousClass11J.A00(ca9);
            CA9.A01(ca9);
        }
        super.onScrollStateChanged(recyclerView, i);
        AnonymousClass0Z0.A0A(726153751, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0Z0.A03(-84796657);
        if (i != 0) {
            int A1g = this.A00.A03.A1g();
            int A1h = this.A00.A03.A1h();
            CA9 ca9 = this.A00.A00;
            AnonymousClass11J.A00(ca9);
            int i3 = ca9.A00;
            if (i3 < A1g || i3 > A1h) {
                CA9.A03(ca9, "scroll", true);
            }
            super.onScrolled(recyclerView, i, i2);
        }
        AnonymousClass0Z0.A0A(406741499, A03);
    }
}
