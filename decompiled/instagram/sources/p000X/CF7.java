package p000X;

import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.CF7 */
public final class CF7 implements C27029Bwg {
    public final /* synthetic */ CDC A00;

    public final void AvI(IgRadioGroup igRadioGroup, int i) {
        if (i == -1) {
            CDC cdc = this.A00;
            cdc.A04.A0A(cdc.A03, (String) null);
            return;
        }
        String str = (String) ((CCK) igRadioGroup.findViewById(i)).getTag();
        CDC cdc2 = this.A00;
        CDA cda = cdc2.A04;
        boolean A01 = CDC.A01(cdc2, str);
        if (cda.A01 != A01) {
            cda.A01 = A01;
            CDA.A00(cda, Constants.A0C);
        }
        CDC cdc3 = this.A00;
        cdc3.A04.A0A(cdc3.A03, str);
    }

    public CF7(CDC cdc) {
        this.A00 = cdc;
    }
}
