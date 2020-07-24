package com.facebook.superpack;

import java.io.Closeable;
import java.io.InputStream;
import p000X.AnonymousClass0Y1;

public final class SuperpackFile implements Closeable {
    public int mLength;
    public long mPtr;

    public static native void closeNative(long j);

    public static native long createSuperpackFileNative(String str, InputStream inputStream);

    public static native long createSuperpackFileNative(String str, byte[] bArr);

    public static native int getLengthNative(long j);

    public static native String getNameNative(long j);

    public static native void readBytesNative(long j, int i, int i2, byte[] bArr, int i3);

    public synchronized void close() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0;
        } else {
            throw new IllegalStateException();
        }
    }

    public synchronized String getName() {
        long j;
        j = this.mPtr;
        if (j != 0) {
        } else {
            throw new IllegalStateException();
        }
        return getNameNative(j);
    }

    public void finalize() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0;
            throw new IllegalStateException();
        }
    }

    static {
        AnonymousClass0Y1.A08("superpack-jni");
    }

    public SuperpackFile(long j) {
        if (j != 0) {
            this.mPtr = j;
            this.mLength = getLengthNative(j);
            return;
        }
        throw null;
    }
}
