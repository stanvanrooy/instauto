package p000X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.CFX */
public final class CFX implements TextWatcher {
    public final /* synthetic */ CDQ A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CFX(CDQ cdq) {
        this.A00 = cdq;
    }

    public final void afterTextChanged(Editable editable) {
        String str = this.A00.A03;
        if (str == null || str.equals(editable.toString()) || editable.length() == 0) {
            this.A00.A00.A02(false);
        } else {
            this.A00.A00.A02(true);
        }
    }
}
