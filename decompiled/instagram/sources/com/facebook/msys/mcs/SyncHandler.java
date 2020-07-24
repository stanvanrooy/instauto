package com.facebook.msys.mcs;

import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseHealthMonitor;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;
import p000X.C30188DUm;

public class SyncHandler {
    public NativeHolder mNativeHolder;

    private native void checkClientUpdateNative(String str);

    private native void enableSyncNative();

    private native void executeSyncNative();

    public static native NativeHolder initNativeHolder(Database database, String str, NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, DatabaseHealthMonitor databaseHealthMonitor, DasmConfigCreator dasmConfigCreator, boolean z);

    private native void notifyAppEnterForegroundNative();

    private native void notifyTaskResponseProcessedNative();

    private native void reportAppStateNative();

    private native void updateAppStateToBackgroundNative();

    private native void updateAppStateToForegroundNative();

    private native void updateNetworkStateFromNetworkSessionNative();

    static {
        C30188DUm.A00();
    }
}
