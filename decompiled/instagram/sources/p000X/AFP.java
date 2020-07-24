package p000X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFP */
public final class AFP implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView A00;

    public AFP(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.A0J(i);
    }
}
