package com.facebook.msys.mca;

import com.facebook.msys.mcd.MediaSendManager;
import com.facebook.msys.mci.AuthDataContext;
import com.facebook.msys.mci.DatabaseHealthMonitor;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mcs.SyncHandler;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import p000X.C30188DUm;

public class Mailbox {
    public final NativeHolder mNativeHolder;

    private native int getEventSampleRateNative(int i);

    private native int getStateNative();

    public static native NativeHolder initNativeHolder(int i, String str, AuthDataContext authDataContext, MediaSendManager mediaSendManager, NetworkSession networkSession, NotificationCenter notificationCenter, DatabaseHealthMonitor databaseHealthMonitor, SyncHandler syncHandler, String str2, String str3, MailboxExperimentCache mailboxExperimentCache);

    private native void invalidateNative();

    private native boolean isValidNative();

    private native void logoutAndDeleteNative(NotificationScope notificationScope);

    private native void logoutAndEncryptNative(NotificationScope notificationScope);

    private native void setStateNative(int i, NotificationScope notificationScope);

    private native void setSyncNative(SyncHandler syncHandler);

    static {
        C30188DUm.A00();
    }
}
