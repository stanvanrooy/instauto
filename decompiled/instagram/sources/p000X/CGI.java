package p000X;

import android.widget.CompoundButton;

/* renamed from: X.CGI */
public final class CGI implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CD3 A00;

    public CGI(CD3 cd3) {
        this.A00 = cd3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A00.A0x = compoundButton.isChecked();
    }
}
