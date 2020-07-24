package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A1e;
import p000X.A3K;
import p000X.AnonymousClass0FY;
import p000X.C206608tl;
import p000X.C23043A0y;

public class WritableNativeArray extends ReadableNativeArray implements C206608tl {
    public static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    public native void pushBoolean(boolean z);

    public native void pushDouble(double d);

    public native void pushInt(int i);

    public native void pushNull();

    public native void pushString(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if ((r3 instanceof com.facebook.react.bridge.WritableNativeArray) != false) goto L_0x0007;
     */
    public void pushArray(A1e a1e) {
        boolean z;
        if (a1e != null) {
            z = false;
        }
        z = true;
        AnonymousClass0FY.A03(z, "Illegal type provided");
        pushNativeArray((WritableNativeArray) a1e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if ((r3 instanceof com.facebook.react.bridge.WritableNativeMap) != false) goto L_0x0007;
     */
    public void pushMap(C23043A0y a0y) {
        boolean z;
        if (a0y != null) {
            z = false;
        }
        z = true;
        AnonymousClass0FY.A03(z, "Illegal type provided");
        pushNativeMap((WritableNativeMap) a0y);
    }

    static {
        A3K.A00();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }
}
