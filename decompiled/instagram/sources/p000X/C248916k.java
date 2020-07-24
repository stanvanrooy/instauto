package p000X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.16k  reason: invalid class name and case insensitive filesystem */
public final class C248916k extends C248716i implements C249016l {
    public final SQLiteStatement A00;

    public final int ADh() {
        SQLiteStatement sQLiteStatement = this.A00;
        AnonymousClass0ZG.A00(-959512267);
        int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
        AnonymousClass0ZG.A00(1643129917);
        return executeUpdateDelete;
    }

    public final long Bon() {
        SQLiteStatement sQLiteStatement = this.A00;
        AnonymousClass0ZG.A00(1712711431);
        long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
        AnonymousClass0ZG.A00(1203533753);
        return simpleQueryForLong;
    }

    public final void execute() {
        SQLiteStatement sQLiteStatement = this.A00;
        AnonymousClass0ZG.A00(-1373470719);
        sQLiteStatement.execute();
        AnonymousClass0ZG.A00(-1154077242);
    }

    public C248916k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.A00 = sQLiteStatement;
    }
}
