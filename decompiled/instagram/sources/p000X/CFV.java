package p000X;

import android.view.View;
import com.instagram.common.p004ui.base.IgCheckBox;

/* renamed from: X.CFV */
public final class CFV implements View.OnClickListener {
    public final /* synthetic */ CE5 A00;
    public final /* synthetic */ IgCheckBox A01;

    public CFV(CE5 ce5, IgCheckBox igCheckBox) {
        this.A00 = ce5;
        this.A01 = igCheckBox;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-2095360540);
        this.A01.toggle();
        if (this.A00.A05.isChecked() || this.A00.A06.isChecked()) {
            CE5 ce5 = this.A00;
            ce5.A0A = CE5.A00(ce5);
            CE5.A01(this.A00);
        } else {
            this.A01.setChecked(true);
        }
        AnonymousClass0Z0.A0C(1280948408, A05);
    }
}
