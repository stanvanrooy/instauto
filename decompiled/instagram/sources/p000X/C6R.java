package p000X;

import android.view.View;

/* renamed from: X.C6R */
public final class C6R implements AnonymousClass1NY {
    public final /* synthetic */ C6X A00;

    public C6R(C6X c6x) {
        this.A00 = c6x;
    }

    public final void BBJ(AnonymousClass2O9 r5) {
        this.A00.A01.removeAllViews();
        this.A00.A02.setVisibility(8);
        C6X c6x = this.A00;
        c6x.A07.A05(r5, (Object) null, c6x.A06);
        C6X c6x2 = this.A00;
        View A02 = c6x2.A07.A02(0, (View) null, c6x2.A01);
        this.A00.A07.A04(0, A02);
        this.A00.A01.addView(A02);
    }
}
