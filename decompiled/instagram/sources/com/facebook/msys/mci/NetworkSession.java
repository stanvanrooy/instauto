package com.facebook.msys.mci;

import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.DataTaskListener;
import com.facebook.msys.mci.network.common.UrlResponse;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.util.HashMap;
import p000X.AnonymousClass0ZL;
import p000X.C208868z5;
import p000X.C208918zB;
import p000X.C208928zC;
import p000X.C29045Cqy;
import p000X.C59802iX;

public class NetworkSession implements C59802iX {
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public final C29045Cqy mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void nativeDispose();

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    private native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    private native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);

    public void executeInNetworkContext(C208918zB r2) {
        Execution.executeAsync(r2, 3);
    }

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public synchronized void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException) {
        markDataTaskAsCompleted(str, str2, i, urlResponse, bArr, str3, iOException);
        if (this.mCallbackMap.containsKey(str2)) {
            this.mCallbackMap.remove(str2);
        }
    }

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    private void onNewDataTask(DataTask dataTask) {
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    static {
        C208928zC.A00();
    }

    public NetworkSession(String str, NotificationCenter notificationCenter, C208868z5 r5) {
        AnonymousClass0ZL.A01("NetworkSession.new", 1374097078);
        try {
            this.mNotificationCenter = notificationCenter;
            this.mDataTaskListener = r5.A00;
            this.mDisposer = new C29045Cqy(this, r5);
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            getNetworkSessionTimeoutIntervalMs();
        } finally {
            AnonymousClass0ZL.A00(1386476986);
        }
    }

    public void updateDataTaskDownloadProgressCallback(String str, long j, long j2, long j3) {
        updateDataTaskDownloadProgress(str, j, j2, j3);
    }
}
