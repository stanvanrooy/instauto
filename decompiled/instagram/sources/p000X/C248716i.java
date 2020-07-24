package p000X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.16i  reason: invalid class name and case insensitive filesystem */
public class C248716i implements C248816j {
    public final SQLiteProgram A00;

    public final void A6W(int i, byte[] bArr) {
        this.A00.bindBlob(i, bArr);
    }

    public final void A6X(int i, double d) {
        this.A00.bindDouble(i, d);
    }

    public final void A6Y(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public final void A6Z(int i) {
        this.A00.bindNull(i);
    }

    public final void A6a(int i, String str) {
        this.A00.bindString(i, str);
    }

    public final void close() {
        this.A00.close();
    }

    public C248716i(SQLiteProgram sQLiteProgram) {
        this.A00 = sQLiteProgram;
    }
}
