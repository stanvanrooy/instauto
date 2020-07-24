package p000X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFQ */
public final class AFQ implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ SearchView A00;

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AFQ(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.A00.A0H(i);
    }
}
