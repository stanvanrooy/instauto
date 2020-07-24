package p000X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.CH2 */
public final class CH2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ C27533CGx A00;

    public CH2(C27533CGx cGx) {
        this.A00 = cGx;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String trim = textView.getText().toString().trim();
        if (this.A00.A06 == null || 4 != i || TextUtils.isEmpty(trim)) {
            return false;
        }
        C27535CGz cGz = this.A00.A06.A00.A00;
        if (cGz == null) {
            return true;
        }
        cGz.A00(new CH6(trim));
        return true;
    }
}
