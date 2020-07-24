package p000X;

import android.os.Looper;
import com.facebook.react.bridge.ReactMarker;

/* renamed from: X.A4I */
public final class A4I implements Runnable {
    public final /* synthetic */ A4c A00;

    public A4I(A4c a4c) {
        this.A00 = a4c;
    }

    public final void run() {
        synchronized (this.A00.A00.A00.A00.mJavaScriptContextHolder) {
        }
        this.A00.A00.A00.A00.mHybridData.resetNative();
        A4U reactQueueConfiguration = this.A00.A00.A00.A00.getReactQueueConfiguration();
        if (reactQueueConfiguration.A01.A01 != Looper.getMainLooper()) {
            reactQueueConfiguration.A01.quitSynchronous();
        }
        if (reactQueueConfiguration.A00.A01 != Looper.getMainLooper()) {
            reactQueueConfiguration.A00.quitSynchronous();
        }
        ReactMarker.logMarker(A3L.DESTROY_CATALYST_INSTANCE_END);
    }
}
