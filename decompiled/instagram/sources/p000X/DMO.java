package p000X;

import android.database.Cursor;
import java.io.Closeable;

/* renamed from: X.DMO */
public final class DMO extends C30005DMh implements Closeable {
    public final Cursor A00;

    public static void A00(DMO dmo) {
        boolean z;
        do {
            z = false;
            if (!dmo.A00.isAfterLast()) {
                Cursor cursor = dmo.A00;
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("deleted"));
                if (i != 0) {
                    dmo.A00.moveToNext();
                }
                if (i != 0) {
                    z = true;
                    continue;
                } else {
                    continue;
                }
            }
        } while (z);
    }

    public final void close() {
        this.A00.close();
    }

    public DMO(Cursor cursor) {
        this.A00 = cursor;
    }
}
