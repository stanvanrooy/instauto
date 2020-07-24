package p000X;

import android.database.DataSetObserver;

/* renamed from: X.1Ro  reason: invalid class name and case insensitive filesystem */
public final class C29861Ro extends DataSetObserver {
    public final /* synthetic */ C29851Rn A00;

    public C29861Ro(C29851Rn r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        super.onChanged();
        this.A00.A00 = true;
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.A00.A00 = true;
    }
}
