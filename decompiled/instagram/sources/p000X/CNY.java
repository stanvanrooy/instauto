package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.CNY */
public final class CNY extends C256319p {
    public final /* synthetic */ CNZ A00;

    public CNY(CNZ cnz) {
        this.A00 = cnz;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(-168518918);
        super.onScrollStateChanged(recyclerView, i);
        this.A00.A00.A05(i);
        AnonymousClass0Z0.A0A(-57391777, A03);
    }
}
