package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1zN  reason: invalid class name and case insensitive filesystem */
public final class C46221zN extends C256319p {
    public final /* synthetic */ AnonymousClass1zL A00;
    public final /* synthetic */ C46201zK A01;

    public C46221zN(AnonymousClass1zL r1, C46201zK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(982493728);
        AnonymousClass1zL r1 = this.A00;
        r1.A00 = i;
        r1.A04(this.A01);
        AnonymousClass0Z0.A0A(1614750045, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0Z0.A03(-562912238);
        this.A00.A04(this.A01);
        AnonymousClass0Z0.A0A(585624219, A03);
    }
}
