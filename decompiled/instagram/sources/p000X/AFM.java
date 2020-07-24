package p000X;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFM */
public final class AFM implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete A00;

    public AFM(SearchView.SearchAutoComplete searchAutoComplete) {
        this.A00 = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.A00;
        if (searchAutoComplete.A01) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.A01 = false;
        }
    }
}
