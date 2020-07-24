package p000X;

import android.database.sqlite.SQLiteDatabase;
import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.C6H */
public final class C6H implements C06570Po {
    public final AnonymousClass0C1 A00;

    public static synchronized C6H A00(AnonymousClass0C1 r2) {
        C6H c6h;
        Class<C6H> cls = C6H.class;
        synchronized (cls) {
            c6h = (C6H) r2.AVA(cls, new C6I(r2));
        }
        return c6h;
    }

    public final void onUserSessionWillEnd(boolean z) {
        SQLiteDatabase sQLiteDatabase;
        if (z) {
            C23194ACe A002 = C23194ACe.A00();
            synchronized (A002) {
                sQLiteDatabase = A002.A00;
            }
            if (sQLiteDatabase != null) {
                String A0J = AnonymousClass000.A0J("viewer_id=='", this.A00.A04(), "'");
                sQLiteDatabase.delete("ranking_metadata", A0J, (String[]) null);
                sQLiteDatabase.delete("ranking_score", A0J, (String[]) null);
                sQLiteDatabase.delete("users", A0J, (String[]) null);
                sQLiteDatabase.delete(RealtimeProtocol.DIRECT_V2_THREAD, A0J, (String[]) null);
            }
        }
    }

    public C6H(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }
}
