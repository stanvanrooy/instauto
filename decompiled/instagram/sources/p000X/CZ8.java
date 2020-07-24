package p000X;

import android.widget.LinearLayout;

/* renamed from: X.CZ8 */
public final class CZ8 extends AnonymousClass2LX {
    public final /* synthetic */ CZ3 A00;

    public CZ8(CZ3 cz3) {
        this.A00 = cz3;
    }

    public final void BOK(AnonymousClass1EG r7) {
        CZ3 cz3 = this.A00;
        double A002 = r7.A00();
        Integer num = cz3.A0A;
        if (num == Constants.A0N || num == Constants.A0C) {
            LinearLayout linearLayout = cz3.A07.A04;
            float f = (float) A002;
            cz3.A02.setAlpha(f);
            float f2 = (f * 0.19999999f) + 0.8f;
            linearLayout.setScaleX(f2);
            linearLayout.setScaleY(f2);
            cz3.A02.setVisibility(0);
        }
    }

    public final void BOH(AnonymousClass1EG r11) {
        if (r11.A00() == 1.0d) {
            CZ3 cz3 = this.A00;
            if (cz3.A0A == Constants.A0C) {
                cz3.A0A = Constants.A0N;
                C30551Uh r0 = cz3.A04;
                if (r0 != null) {
                    r0.BE4();
                }
                LinearLayout linearLayout = cz3.A07.A04;
                linearLayout.setScaleX(1.0f);
                linearLayout.setScaleY(1.0f);
                C13880jN.A00.A01();
                if (CZ3.A00(cz3.A05, cz3.A00).AiO()) {
                    cz3.A0L.A0J(cz3.A05, cz3.A07.A08, cz3.A01, cz3.A00, cz3.APu(cz3.A05).A02(), true, cz3);
                    return;
                }
                return;
            }
            return;
        }
        CZ3.A03(this.A00, r11);
    }
}
