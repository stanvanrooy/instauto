package p000X;

import android.widget.PopupWindow;

/* renamed from: X.AL3 */
public final class AL3 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ALA A00;
    public final /* synthetic */ C23400AKz A01;

    public AL3(C23400AKz aKz, ALA ala) {
        this.A01 = aKz;
        this.A00 = ala;
    }

    public final void onDismiss() {
        C23399AKy aKy = this.A01.A03;
        if (aKy.A02) {
            ALA ala = this.A00;
            AL4 al4 = ala.A02;
            if (C16810pC.A00.A03(al4.A07, al4.A06.getContext())) {
                ala.A02.A0A.A02(new ALN(ala));
                return;
            }
            AL4.A02(ala.A02, ala.A00, ALR.A00(Constants.ZERO));
            ala.A02.A09.A01(Constants.ZERO);
            AL4.A00(ala.A02);
        } else if (aKy.A00) {
            this.A00.A00();
        } else {
            ALA ala2 = this.A00;
            AL4.A00(ala2.A02);
            ala2.A00.A04(false);
        }
    }
}
