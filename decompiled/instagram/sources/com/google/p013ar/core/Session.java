package com.google.p013ar.core;

import android.content.Context;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000X.B84;
import p000X.B9P;
import p000X.BYU;
import p000X.BYX;

/* renamed from: com.google.ar.core.Session */
public class Session {
    public final BYU faceCache;
    public final long nativeSymbolTableHandle;
    public long nativeWrapperHandle;
    public SharedCamera sharedCamera;

    private native long[] nativeAcquireAllAnchors(long j);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    public static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeUpdate(long j, long j2);

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native long nativeReleaseSessionOwnership(long j);

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.A00);
    }

    public void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0;
        }
        super.finalize();
    }

    public Config getConfig() {
        Config config = new Config(this);
        nativeGetConfig(this.nativeWrapperHandle, config.A00);
        return config;
    }

    public List getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        ArrayList arrayList = new ArrayList(r4);
        for (long cameraConfig : nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.A00)) {
            arrayList.add(new CameraConfig(this, cameraConfig));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.A00);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.A00);
        return frame;
    }

    public static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        int i2;
        for (B9P b9p : B9P.values()) {
            if (b9p.A00 == i) {
                Class cls = b9p.A01;
                if (cls != null) {
                    if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                        i2 = 0;
                    }
                    String str2 = b9p.A02;
                    if (str2 == null && str == null) {
                        throw ((Exception) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    if (str2 != null || str == null) {
                        if (str2 == null || str != null) {
                            String valueOf = String.valueOf(str2);
                            String valueOf2 = String.valueOf(str);
                            if (valueOf2.length() != 0) {
                                str = valueOf.concat(valueOf2);
                            } else {
                                str = new String(valueOf);
                            }
                        } else {
                            str = str2;
                        }
                    }
                    Exception exc = (Exception) b9p.A01.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[(r8 + i2)];
                    int i3 = 0;
                    while (i3 < i2) {
                        stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                        i3++;
                    }
                    for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
                        stackTraceElementArr[i3] = stackTraceElement;
                        i3++;
                    }
                    exc.setStackTrace(stackTraceElementArr);
                    throw exc;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected error code: ");
        sb.append(i);
        throw new B84(sb.toString());
    }

    public Session() {
        this.faceCache = new BYU();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    public Session(Context context, Set set) {
        this.faceCache = new BYU();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((BYX) it.next()).A00;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(BYX.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
        }
    }
}
