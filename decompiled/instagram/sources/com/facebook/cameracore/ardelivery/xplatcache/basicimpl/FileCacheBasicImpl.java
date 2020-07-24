package com.facebook.cameracore.ardelivery.xplatcache.basicimpl;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import java.util.Map;
import p000X.AnonymousClass0Y1;

public class FileCacheBasicImpl extends ARDFileCache {
    public final String mDirectory;

    public static native HybridData initHybrid(String str, long j);

    public native void clear();

    public native void commit(String str);

    public native void flush();

    public native Map.Entry[] getAllMetas();

    public native ARDFileCacheEntry getCacheEntry(String str);

    public native ARDFileCacheEntry getCacheEntryWithoutPromotion(String str);

    public native long getSize();

    public native ARDFileCacheEntry insertAndLock(String str);

    public native ARDFileInMemoryStatus memContains(String str);

    public native boolean remove(String str);

    public native void unlock(String str);

    public native boolean updateExtra(String str, byte[] bArr);

    static {
        AnonymousClass0Y1.A08("ardcache-basic-impl-jni");
    }

    public FileCacheBasicImpl(String str, long j) {
        this.mDirectory = str;
        this.mHybridData = initHybrid(str, j);
    }
}
