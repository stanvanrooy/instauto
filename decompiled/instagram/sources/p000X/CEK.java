package p000X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.CEK */
public final class CEK implements TextWatcher {
    public final /* synthetic */ CEI A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CEK(CEI cei) {
        this.A00 = cei;
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.length() == 0) {
            CEL cel = this.A00.A03;
            ArrayList arrayList = new ArrayList();
            AnonymousClass0a4.A06(arrayList);
            cel.A01 = arrayList;
            cel.notifyDataSetChanged();
            return;
        }
        if (this.A00.A09.A00.containsKey(editable.toString().toLowerCase(Locale.US))) {
            CEI cei = this.A00;
            CEL cel2 = cei.A03;
            List A002 = cei.A09.A00(editable.toString());
            AnonymousClass0a4.A06(A002);
            cel2.A01 = A002;
            cel2.notifyDataSetChanged();
            return;
        }
        this.A00.A02.A0A.A01(new C27484CFa(editable.toString(), new CEJ(this, editable)));
    }
}
