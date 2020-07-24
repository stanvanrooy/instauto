package com.facebook.msys.mcs;

import com.facebook.msys.mci.SqliteHolder;
import p000X.C30188DUm;

public class Messaging {
    public static native boolean setContactSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2);

    public static native boolean setMailboxSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, String str);

    static {
        C30188DUm.A00();
    }
}
