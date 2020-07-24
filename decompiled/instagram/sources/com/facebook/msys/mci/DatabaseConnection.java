package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.C30187DUl;

public class DatabaseConnection {
    public final NativeHolder mNativeHolder;

    public interface DatabaseRunnable {
        void run(SqliteHolder sqliteHolder);
    }

    public native void execute(DatabaseRunnable databaseRunnable);

    public native int getMode();

    static {
        C30187DUl.A00();
    }

    public DatabaseConnection(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
