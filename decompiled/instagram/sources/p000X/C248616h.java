package p000X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.16h  reason: invalid class name and case insensitive filesystem */
public final class C248616h implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ C248516g A00;
    public final /* synthetic */ AnonymousClass16R A01;

    public C248616h(AnonymousClass16R r1, C248516g r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.A00.A6c(new C248716i(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
