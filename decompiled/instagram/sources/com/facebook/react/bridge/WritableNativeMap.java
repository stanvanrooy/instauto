package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A1e;
import p000X.A3K;
import p000X.AnonymousClass0FY;
import p000X.C228259s1;
import p000X.C23043A0y;

public class WritableNativeMap extends ReadableNativeMap implements C228259s1 {
    public static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    public native void putBoolean(String str, boolean z);

    public native void putDouble(String str, double d);

    public native void putInt(String str, int i);

    public native void putNull(String str);

    public native void putString(String str, String str2);

    public C228259s1 copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        AnonymousClass0FY.A03(this instanceof ReadableNativeMap, "Illegal type provided");
        writableNativeMap.mergeNativeMap(this);
        return writableNativeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if ((r4 instanceof com.facebook.react.bridge.WritableNativeArray) != false) goto L_0x0007;
     */
    public void putArray(String str, A1e a1e) {
        boolean z;
        if (a1e != null) {
            z = false;
        }
        z = true;
        AnonymousClass0FY.A03(z, "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) a1e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if ((r4 instanceof com.facebook.react.bridge.WritableNativeMap) != false) goto L_0x0007;
     */
    public void putMap(String str, C23043A0y a0y) {
        boolean z;
        if (a0y != null) {
            z = false;
        }
        z = true;
        AnonymousClass0FY.A03(z, "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) a0y);
    }

    static {
        A3K.A00();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }
}
