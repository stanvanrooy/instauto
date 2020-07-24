package p000X;

import com.facebook.C0003R;

/* renamed from: X.CPG */
public final class CPG {
    public final /* synthetic */ C27682CNb A00;

    public CPG(C27682CNb cNb) {
        this.A00 = cNb;
    }

    public final void A00(CPH cph) {
        C13150hy.A02(cph, "state");
        C27775CQt cQt = (C27775CQt) this.A00.A03.getValue();
        C13150hy.A02(cph, "state");
        C68832zy r4 = new C68832zy();
        if (cph.A03) {
            r4.A01(new CTY(cph.A00));
        } else if (cph.A01.isEmpty()) {
            r4.A01(new CTZ(cQt.A00.getString(C0003R.string.no_results_found), (String) null));
        } else {
            for (C27702CNw cNw : cph.A01) {
                if (CNO.A00(cNw.A03) == Constants.A0N) {
                    r4.A01(new CR8(cNw, 0, false, false));
                }
            }
            if (cph.A02) {
                r4.A01(new C27837CTd());
            }
        }
        cQt.A01.A06(r4);
    }
}
