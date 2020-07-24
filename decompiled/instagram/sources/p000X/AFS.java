package p000X;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFS */
public final class AFS implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView A00;

    public AFS(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.A00;
        View.OnFocusChangeListener onFocusChangeListener = searchView.A00;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
