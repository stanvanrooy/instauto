package p000X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.CEF */
public final class CEF implements TextWatcher {
    public final /* synthetic */ CE7 A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CEF(CE7 ce7) {
        this.A00 = ce7;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            CE7.A01(this.A00, new ArrayList());
            return;
        }
        if (this.A00.A0F.A00.containsKey(editable.toString().toLowerCase(Locale.US))) {
            List A002 = this.A00.A0F.A00(editable.toString());
            A002.removeAll(this.A00.A07.A07.A05);
            CE7.A01(this.A00, A002);
            return;
        }
        this.A00.A04.A0C.A01(new C27484CFa(editable.toString(), new CED(this, editable)));
    }
}
