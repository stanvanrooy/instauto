package p000X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.C6G */
public final class C6G extends AnonymousClass0O9 {
    public final /* synthetic */ C484728c A00;
    public final /* synthetic */ AnonymousClass0C1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6G(C484728c r2, AnonymousClass0C1 r3) {
        super(634);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2 A[Catch:{ all -> 0x00c3, IOException -> 0x00d0 }] */
    public final void run() {
        Cursor cursor;
        C13300iJ r5;
        try {
            C6H A002 = C6H.A00(this.A01);
            C484728c r4 = this.A00;
            HashMap hashMap = new HashMap();
            SQLiteDatabase A012 = C23194ACe.A00().A01();
            if (A012 != null) {
                Cursor query = A012.query("users", C125565Zx.A00, AnonymousClass000.A0J("viewer_id=='", A002.A00.A04(), "'"), (String[]) null, (String) null, (String) null, (String) null);
                if (query != null && query.moveToFirst()) {
                    do {
                        C13080hr A0A = C12890hY.A00.A0A(query.getString(1));
                        A0A.A0p();
                        C13150hy.A02(A0A, "jp");
                        AnonymousClass0i5 parseFromJson = C13210i4.parseFromJson(A0A);
                        if (parseFromJson != null) {
                            r5 = C13290iI.A01(parseFromJson);
                        } else {
                            r5 = null;
                        }
                        hashMap.put(query.getString(0), r5);
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            }
            r4.A01 = hashMap;
            C484728c r42 = this.A00;
            HashMap hashMap2 = new HashMap();
            SQLiteDatabase A013 = C23194ACe.A00().A01();
            if (A013 != null) {
                Cursor query2 = A013.query(RealtimeProtocol.DIRECT_V2_THREAD, C24686Aro.A00, AnonymousClass000.A0J("viewer_id=='", A002.A00.A04(), "'"), (String[]) null, (String) null, (String) null, (String) null);
                if (query2 != null && query2.moveToFirst()) {
                    do {
                        hashMap2.put(query2.getString(0), C57702ed.parseFromJson(AnonymousClass0IY.A00(A002.A00, query2.getString(1))));
                    } while (query2.moveToNext());
                    if (query2 != null) {
                    }
                } else if (query2 != null) {
                    query2.close();
                }
            }
            r42.A00 = hashMap2;
        } catch (IOException e) {
            AnonymousClass0QD.A05("BanyanCache", "Unable to save to db", e);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
