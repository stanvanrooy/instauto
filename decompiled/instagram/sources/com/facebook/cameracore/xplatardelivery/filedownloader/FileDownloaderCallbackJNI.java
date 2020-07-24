package com.facebook.cameracore.xplatardelivery.filedownloader;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class FileDownloaderCallbackJNI {
    public final HybridData mHybridData;

    public native void onCompletion(String str, String str2, int i, String str3);

    public native void onProgress(double d);

    static {
        AnonymousClass0Y1.A08("ard-android-downloader");
    }

    public FileDownloaderCallbackJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
