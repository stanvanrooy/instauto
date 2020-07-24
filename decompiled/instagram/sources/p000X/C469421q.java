package p000X;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.21q  reason: invalid class name and case insensitive filesystem */
public abstract class C469421q extends BaseAdapter implements C44391w5 {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final void BZv(C32461bI r2) {
        this.A00.addIfAbsent(r2);
    }

    public final void BsA(C32461bI r2) {
        this.A00.remove(r2);
    }

    public void A01() {
        super.notifyDataSetChanged();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32461bI) it.next()).A00();
        }
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onChanged();
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onInvalidated();
        }
    }
}
