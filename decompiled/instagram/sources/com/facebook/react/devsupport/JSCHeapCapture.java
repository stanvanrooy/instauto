package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import p000X.A44;
import p000X.A5B;
import p000X.A5G;
import p000X.AnonymousClass000;

@ReactModule(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    public static final String TAG = "JSCHeapCapture";
    public A5G mCaptureInProgress = null;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    public synchronized void captureComplete(String str, String str2) {
        if (this.mCaptureInProgress != null) {
            if (str2 == null) {
                new File(str);
            } else {
                new A5B(str2);
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, A5G a5g) {
        if (this.mCaptureInProgress != null) {
            new A5B("Heap capture already in progress.");
        } else {
            File file = new File(AnonymousClass000.A0E(str, "/capture.json"));
            file.delete();
            A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.A01(HeapCapture.class);
                if (heapCapture == null) {
                    new A5B("Heap capture js module not registered.");
                } else {
                    this.mCaptureInProgress = a5g;
                    heapCapture.captureHeap(file.getPath());
                }
            }
        }
    }

    public String getName() {
        return TAG;
    }

    public JSCHeapCapture(A44 a44) {
        super(a44);
    }
}
