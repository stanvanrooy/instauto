package p000X;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.AMU */
public final class AMU extends editInstagramCommentData {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ AMG A01;

    public AMU(AMG amg, EditText editText) {
        this.A01 = amg;
        this.A00 = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int before, int count) {
        super.onTextChanged(charSequence, i, before, count);
        AMD amd = this.A01.A02;
        if (amd != null) {
            String charSequence2 = charSequence.toString();
            boolean hasFocus = this.A00.hasFocus();
            boolean z = !TextUtils.isEmpty(charSequence2);
            View view = amd.A0K.A05.A0C;
            view.setEnabled(z);
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            view.setAlpha(f);
            C23442AMp aMp = amd.A06;
            if (aMp != null) {
                aMp.A01(charSequence2, hasFocus);
            }
        }
    }
}
