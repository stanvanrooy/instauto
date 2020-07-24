package p000X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.0Ts  reason: invalid class name and case insensitive filesystem */
public final class C07600Ts implements TextWatcher {
    public final /* synthetic */ AnonymousClass05C A00;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C07600Ts(AnonymousClass05C r1) {
        this.A00 = r1;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00.Bch(Constants.ONE);
    }
}
