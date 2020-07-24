package p000X;

import android.database.DataSetObserver;

/* renamed from: X.AEO */
public final class AEO extends DataSetObserver {
    public final /* synthetic */ AEL A00;

    public AEO(AEL ael) {
        this.A00 = ael;
    }

    public final void onChanged() {
        AEL ael = this.A00;
        ael.A06 = true;
        AnonymousClass0Z1.A00(ael, -1597326437);
    }

    public final void onInvalidated() {
        AEL ael = this.A00;
        ael.A06 = false;
        AnonymousClass0Z1.A01(ael, -1287184389);
    }
}
