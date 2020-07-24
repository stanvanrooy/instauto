package p000X;

import android.widget.CompoundButton;

/* renamed from: X.BS4 */
public final class BS4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C25616BRw A00;

    public BS4(C25616BRw bRw) {
        this.A00 = bRw;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C25616BRw bRw = this.A00;
        bRw.A01.A0i(z);
        bRw.A00.A04 = z;
        C12810hQ.A02(new C25597BRd(bRw, bRw.A05, z, true));
    }
}
