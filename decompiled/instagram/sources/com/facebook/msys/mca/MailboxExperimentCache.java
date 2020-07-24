package com.facebook.msys.mca;

import com.facebook.msys.mci.SqliteHolder;
import com.facebook.simplejni.NativeHolder;
import p000X.C30188DUm;

public class MailboxExperimentCache {
    public final NativeHolder mNativeHolder = initNativeHolder();

    public static native NativeHolder initNativeHolder();

    public native void onInit(SqliteHolder sqliteHolder);

    static {
        C30188DUm.A00();
    }
}
