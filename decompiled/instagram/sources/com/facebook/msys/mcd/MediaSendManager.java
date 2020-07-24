package com.facebook.msys.mcd;

import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;
import p000X.C30188DUm;

public class MediaSendManager {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(NetworkSession networkSession, NotificationCenter notificationCenter, String str, int i);

    static {
        C30188DUm.A00();
    }
}
