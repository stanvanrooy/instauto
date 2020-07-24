package com.facebook.msys.util;

import com.facebook.simplejni.NativeHolder;
import p000X.C30188DUm;

public final class NotificationScope {
    public final McfReferenceHolder mMcfReference = new McfReferenceHolder();
    public final NativeHolder mNativeHolder = initNativeHolder(this);

    public static native NativeHolder initNativeHolder(NotificationScope notificationScope);

    static {
        C30188DUm.A00();
    }
}
