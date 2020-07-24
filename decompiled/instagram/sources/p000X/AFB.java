package p000X;

import android.database.Cursor;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFB */
public final class AFB implements Runnable {
    public final /* synthetic */ SearchView A00;

    public AFB(SearchView searchView) {
        this.A00 = searchView;
    }

    public final void run() {
        AEL ael = this.A00.A06;
        if (ael instanceof AEK) {
            ael.A8H((Cursor) null);
        }
    }
}
