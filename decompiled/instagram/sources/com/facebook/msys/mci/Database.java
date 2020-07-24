package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.C30187DUl;

public class Database {
    public NativeHolder mNativeHolder;
    public volatile DatabaseConnection mReadOnlyConnection;
    public volatile DatabaseConnection mReadWriteConnection;

    public class InitializedCallback {
        public void onInit(SqliteHolder sqliteHolder) {
        }
    }

    public interface SchemaDeployer {
        int upgrade(SqliteHolder sqliteHolder);
    }

    public static native void enableInteractiveReadOnlyConnection(boolean z);

    public static native void enableReadOnlyConnection(boolean z);

    public static native void enableSingleThreadingMode();

    public static native void enableSqliteErrorLogs();

    public static native NativeHolder initNativeHolder(long j, String str, NotificationCenter notificationCenter, SchemaDeployer schemaDeployer, SchemaDeployer schemaDeployer2, SchemaDeployer schemaDeployer3);

    private native void openNative(OpenCallback openCallback, InitializedCallback initializedCallback);

    public native void delete(Runnable runnable);

    public native long getFacebookUserId();

    public native String getFile();

    public native void reset(Runnable runnable);

    static {
        C30187DUl.A00();
        Execution.initialize();
    }

    public class OpenCallback {
        public void onConfig(int i, DatabaseConnectionSettings databaseConnectionSettings) {
        }

        public void onOpen(boolean z) {
        }

        public boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
            return true;
        }
    }
}
