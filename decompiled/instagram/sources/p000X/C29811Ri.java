package p000X;

import android.database.DataSetObserver;

/* renamed from: X.1Ri  reason: invalid class name and case insensitive filesystem */
public final class C29811Ri extends DataSetObserver {
    public final /* synthetic */ C29791Rg A00;

    public C29811Ri(C29791Rg r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        super.onChanged();
        C29821Rj r1 = this.A00.A07;
        if (!r1.A04()) {
            r1.A09 = true;
        }
    }

    public final void onInvalidated() {
        super.onInvalidated();
        C29821Rj r1 = this.A00.A07;
        if (!r1.A04()) {
            r1.A09 = true;
        }
    }
}
