package p000X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.CH1 */
public final class CH1 extends C35681gl {
    public final /* synthetic */ C27533CGx A00;

    public CH1(C27533CGx cGx) {
        this.A00 = cGx;
    }

    public final boolean BR2(View view) {
        EditText editText;
        C27533CGx cGx = this.A00;
        if (cGx.A06 == null || (editText = cGx.A00) == null) {
            return false;
        }
        String A01 = C06360Ot.A01(editText.getText());
        if (A01 == null) {
            A01 = "";
        }
        C27535CGz cGz = this.A00.A06.A00.A00;
        if (cGz == null) {
            return true;
        }
        cGz.A00(new CH6(A01));
        return true;
    }
}
