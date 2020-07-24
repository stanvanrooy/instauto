package p000X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFI */
public final class AFI implements TextWatcher {
    public final /* synthetic */ SearchView A00;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AFI(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.A00;
        Editable text = searchView.A0d.getText();
        searchView.A08 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean z = true;
        boolean z2 = !isEmpty;
        SearchView.A04(searchView, z2);
        if (z2) {
            z = false;
        }
        SearchView.A06(searchView, z);
        SearchView.A02(searchView);
        SearchView.A03(searchView);
        if (searchView.A05 != null && !TextUtils.equals(charSequence, searchView.A07)) {
            charSequence.toString();
        }
        searchView.A07 = charSequence.toString();
    }
}
