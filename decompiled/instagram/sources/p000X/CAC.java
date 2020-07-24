package p000X;

import android.view.View;

/* renamed from: X.CAC */
public final class CAC implements View.OnClickListener {
    public final /* synthetic */ CAD A00;
    public final /* synthetic */ CA8 A01;
    public final /* synthetic */ CA7 A02;

    public CAC(CA8 ca8, CA7 ca7, CAD cad) {
        this.A01 = ca8;
        this.A02 = ca7;
        this.A00 = cad;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1182980672);
        CAA caa = this.A01.A00;
        CA9 ca9 = caa.A00;
        AnonymousClass11J.A00(ca9);
        AnonymousClass1NJ r3 = this.A02.A00;
        int A03 = caa.A07.A03(r3.APo());
        CAD cad = this.A00;
        if (ca9.A07.A0B() != null && ca9.A07.A0B().equals(r3)) {
            ca9.A07.A0I(r3, A03, A03, CA9.A00(ca9, r3).A02(), cad, true, ca9);
        }
        AnonymousClass0Z0.A0C(-737815650, A05);
    }
}
