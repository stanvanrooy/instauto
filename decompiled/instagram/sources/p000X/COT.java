package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.COT */
public final class COT extends C256319p {
    public final /* synthetic */ COH A00;

    public COT(COH coh) {
        this.A00 = coh;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(-1332650095);
        super.onScrollStateChanged(recyclerView, i);
        this.A00.A00.A05(i);
        AnonymousClass0Z0.A0A(-371401695, A03);
    }
}
