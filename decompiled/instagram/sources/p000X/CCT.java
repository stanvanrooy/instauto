package p000X;

import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.CCT */
public final class CCT implements C27029Bwg {
    public final /* synthetic */ CCU A00;

    public final void AvI(IgRadioGroup igRadioGroup, int i) {
        if (i == -1) {
            this.A00.A02.A0e = null;
        } else {
            this.A00.A02.A0e = (String) ((CCK) igRadioGroup.findViewById(i)).getTag();
        }
    }

    public CCT(CCU ccu) {
        this.A00 = ccu;
    }
}
