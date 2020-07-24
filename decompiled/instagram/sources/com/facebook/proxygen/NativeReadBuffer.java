package com.facebook.proxygen;

import com.facebook.jni.Countable;
import java.io.IOException;

public class NativeReadBuffer extends Countable implements ReadBuffer {
    public boolean mClosed;
    public boolean mError;
    public boolean mInitialized;

    private native void nativeInit();

    private native int nativeRead(byte[] bArr, int i, int i2);

    private native int nativeSize();

    public void close() {
        try {
            dispose();
        } finally {
            this.mClosed = true;
        }
    }

    private void checkBufferInUsableState() {
        if (!this.mInitialized) {
            throw new IllegalStateException("Buffer not initialized");
        } else if (this.mClosed) {
            throw new IllegalStateException("Buffer already closed");
        } else if (this.mError) {
            throw new IllegalStateException("Trying to read after error");
        }
    }

    public void init() {
        if (!this.mInitialized) {
            nativeInit();
            this.mInitialized = true;
            return;
        }
        throw new IllegalStateException("Already initalized");
    }

    public int read(byte[] bArr, int i, int i2) {
        checkBufferInUsableState();
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative length or offset is not allowed");
        } else if (bArr == null || bArr.length < i + i2) {
            throw new IllegalArgumentException("Array null, or not large enough");
        } else if (i2 == 0) {
            return 0;
        } else {
            try {
                return nativeRead(bArr, i, i2);
            } catch (IOException e) {
                this.mError = true;
                throw e;
            }
        }
    }

    public int size() {
        checkBufferInUsableState();
        return nativeSize();
    }
}
