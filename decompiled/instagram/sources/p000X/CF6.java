package p000X;

import com.instagram.common.p004ui.base.IgEditText;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.CF6 */
public final class CF6 implements C27029Bwg {
    public final /* synthetic */ CDG A00;

    public CF6(CDG cdg) {
        this.A00 = cdg;
    }

    public final void AvI(IgRadioGroup igRadioGroup, int i) {
        CCK cck = (CCK) igRadioGroup.findViewById(i);
        CDG cdg = this.A00;
        if (cdg.A02 == cck) {
            cdg.A00.A02(true);
            C06220Of.A0E(this.A00.A03);
            this.A00.A03.setVisibility(8);
            return;
        }
        IgEditText igEditText = cdg.A03;
        boolean z = false;
        igEditText.setVisibility(0);
        CDG cdg2 = this.A00;
        C27434CDc cDc = cdg2.A00;
        if (cdg2.A03.getText().length() != 0) {
            z = true;
        }
        cDc.A02(z);
    }
}
