package com.facebook.cameracore.instagram.xplatardelivery.filedownloader;

import com.facebook.cameracore.xplatardelivery.filedownloader.FileDownloaderJNI;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class IgFileDownloaderJNI extends FileDownloaderJNI {
    public static native HybridData initHybrid(IgXplatFileDownloaderAdapter igXplatFileDownloaderAdapter);

    static {
        AnonymousClass0Y1.A08("ard-android-downloader-ig");
    }

    public IgFileDownloaderJNI(IgXplatFileDownloaderAdapter igXplatFileDownloaderAdapter) {
        this.mHybridData = initHybrid(igXplatFileDownloaderAdapter);
    }
}
