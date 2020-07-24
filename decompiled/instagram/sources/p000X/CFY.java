package p000X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.CFY */
public final class CFY implements TextWatcher {
    public final /* synthetic */ CDG A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CFY(CDG cdg) {
        this.A00 = cdg;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.A00.A03.getText().length() != 0) {
            this.A00.A00.A02(true);
        } else {
            this.A00.A00.A02(false);
        }
    }
}
