package p000X;

import android.widget.PopupWindow;

/* renamed from: X.AL7 */
public final class AL7 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ALA A00;
    public final /* synthetic */ C23400AKz A01;

    public AL7(C23400AKz aKz, ALA ala) {
        this.A01 = aKz;
        this.A00 = ala;
    }

    public final void onDismiss() {
        if (this.A01.A02.A01) {
            ALA ala = this.A00;
            AL4 al4 = ala.A02;
            if (C16810pC.A00.A03(al4.A07, al4.A06.getContext())) {
                ala.A02.A0A.A02(new ALM(ala));
                return;
            }
            AL1 al1 = ala.A02.A09;
            Integer num = Constants.ONE;
            al1.A01(num);
            AL4.A02(ala.A02, ala.A00, ALR.A00(num));
            AL4.A00(ala.A02);
            return;
        }
        this.A00.A01();
    }
}
