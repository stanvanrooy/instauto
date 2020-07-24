package com.facebook.proxygen;

import com.facebook.proxygen.utils.Preconditions;

public class NativeHandleImpl implements NativeHandle {
    public long mNativeHandle;

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7 == 0) goto L_0x000d;
     */
    public void setNativeHandle(long j) {
        boolean z;
        if (this.mNativeHandle != 0) {
            z = false;
        }
        z = true;
        Preconditions.checkState(z);
        this.mNativeHandle = j;
    }
}
