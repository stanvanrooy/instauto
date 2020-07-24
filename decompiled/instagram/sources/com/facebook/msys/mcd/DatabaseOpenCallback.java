package com.facebook.msys.mcd;

import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.SqliteHolder;
import p000X.C30188DUm;

public class DatabaseOpenCallback extends Database.OpenCallback {
    private native boolean onConfigNative(SqliteHolder sqliteHolder, int i, boolean z, long j);

    static {
        C30188DUm.A00();
    }

    public boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
        super.onConfig(sqliteHolder, i, z, j, databaseConnectionSettings);
        return onConfigNative(sqliteHolder, i, z, j);
    }
}
