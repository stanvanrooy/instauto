package p000X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/* renamed from: X.1w4  reason: invalid class name and case insensitive filesystem */
public final class C44381w4 implements C44391w5 {
    public final Adapter A00;

    public final void BZv(C32461bI r2) {
        this.A00.registerDataSetObserver(r2);
    }

    public final void BsA(C32461bI r2) {
        this.A00.unregisterDataSetObserver(r2);
    }

    public final CharSequence[] getAutofillOptions() {
        return this.A00.getAutofillOptions();
    }

    public final int getCount() {
        return this.A00.getCount();
    }

    public final Object getItem(int i) {
        return this.A00.getItem(i);
    }

    public final long getItemId(int i) {
        return this.A00.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return this.A00.getItemViewType(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.A00.getView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return this.A00.getViewTypeCount();
    }

    public final boolean hasStableIds() {
        return this.A00.hasStableIds();
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.registerDataSetObserver(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A00.unregisterDataSetObserver(dataSetObserver);
    }

    public C44381w4(Adapter adapter) {
        this.A00 = adapter;
    }
}
