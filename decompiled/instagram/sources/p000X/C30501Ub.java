package p000X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Ub  reason: invalid class name and case insensitive filesystem */
public final class C30501Ub extends C256319p {
    public final /* synthetic */ AnonymousClass1UY A00;

    public C30501Ub(AnonymousClass1UY r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(-42251684);
        AnonymousClass1UY r1 = this.A00;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        r1.A0C = z;
        AnonymousClass0Z0.A0A(581733640, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C476324u r1;
        int A03 = AnonymousClass0Z0.A03(1638560689);
        AnonymousClass1UY r12 = this.A00;
        if (!r12.A0C && (r1 = r12.A06) != null) {
            r1.A0B(Constants.ZERO);
        }
        AnonymousClass0Z0.A0A(-222818259, A03);
    }
}
