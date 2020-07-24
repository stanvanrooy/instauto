package p000X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.CH3 */
public final class CH3 implements TextWatcher {
    public final /* synthetic */ C27533CGx A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CH3(C27533CGx cGx) {
        this.A00 = cGx;
    }

    public final void afterTextChanged(Editable editable) {
        CH5 ch5 = this.A00.A06;
        if (ch5 != null) {
            String obj = editable.toString();
            C27535CGz cGz = ch5.A00.A00;
            if (cGz != null) {
                cGz.A00(new CH7(obj));
            }
        }
    }
}
