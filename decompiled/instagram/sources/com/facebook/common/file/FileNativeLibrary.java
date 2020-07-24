package com.facebook.common.file;

import p000X.AnonymousClass0Y1;

public class FileNativeLibrary {
    public static native long[] nativeGetFileSize(String str);

    public static native long[] nativeGetFolderSize(String str);

    static {
        AnonymousClass0Y1.A08("fb_filesystem");
    }
}
