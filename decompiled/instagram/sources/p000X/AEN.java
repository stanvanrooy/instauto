package p000X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.AEN */
public final class AEN extends ContentObserver {
    public final /* synthetic */ AEL A00;

    public final boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AEN(AEL ael) {
        super(new Handler());
        this.A00 = ael;
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        AEL ael = this.A00;
        if (ael.A05 && (cursor = ael.A02) != null && !cursor.isClosed()) {
            ael.A06 = ael.A02.requery();
        }
    }
}
