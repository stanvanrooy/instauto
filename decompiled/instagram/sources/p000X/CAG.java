package p000X;

import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.CAG */
public final class CAG implements C710538t {
    public final /* synthetic */ CAA A00;

    public CAG(CAA caa) {
        this.A00 = caa;
    }

    public final void BDD(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.getTotalScrollRange() > 0) {
            if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                CA9 ca9 = this.A00.A00;
                AnonymousClass11J.A00(ca9);
                CA9.A03(ca9, "scroll", true);
                this.A00.A01 = false;
            }
            if (i == 0) {
                CAA caa = this.A00;
                if (!caa.A01) {
                    CA9 ca92 = caa.A00;
                    AnonymousClass11J.A00(ca92);
                    CA9.A01(ca92);
                    this.A00.A01 = true;
                }
            }
        }
    }
}
