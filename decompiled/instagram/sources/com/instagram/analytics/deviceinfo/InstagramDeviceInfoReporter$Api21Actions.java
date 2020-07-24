package com.instagram.analytics.deviceinfo;

import android.system.ErrnoException;
import android.system.Os;
import p000X.C06270Ok;

public class InstagramDeviceInfoReporter$Api21Actions {
    public static void addFileLastAccessTime(C06270Ok r4, String str) {
        try {
            r4.A08("access_date", Long.valueOf(Os.lstat(str).st_atime * 1000));
        } catch (ErrnoException unused) {
        }
    }
}
