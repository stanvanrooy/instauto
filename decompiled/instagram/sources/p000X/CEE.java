package p000X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.CEE */
public final class CEE implements TextWatcher {
    public final /* synthetic */ CE6 A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CEE(CE6 ce6) {
        this.A00 = ce6;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            CEZ cez = this.A00.A06;
            List list = Collections.EMPTY_LIST;
            AnonymousClass0a4.A06(list);
            cez.A01 = list;
            cez.notifyDataSetChanged();
        } else {
            if (this.A00.A0F.A00.containsKey(editable.toString().toLowerCase(Locale.US))) {
                CE6 ce6 = this.A00;
                CEZ cez2 = ce6.A06;
                List A002 = ce6.A0F.A00(editable.toString());
                AnonymousClass0a4.A06(A002);
                cez2.A01 = A002;
                cez2.notifyDataSetChanged();
            } else {
                this.A00.A04.A0B.A01(new C27484CFa(editable.toString(), new CEB(this, editable)));
                return;
            }
        }
        CE6.A01(this.A00);
    }
}
