package p000X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFO */
public final class AFO implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView A00;

    public AFO(SearchView searchView) {
        this.A00 = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.A00.A0E();
        return true;
    }
}
