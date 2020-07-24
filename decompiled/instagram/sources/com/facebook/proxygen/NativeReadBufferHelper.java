package com.facebook.proxygen;

public class NativeReadBufferHelper {
    public final NativeReadBuffer mReadBuffer;

    private native void nativeEnd(NativeReadBuffer nativeReadBuffer);

    private native void nativeWrite(NativeReadBuffer nativeReadBuffer, byte[] bArr, int i, int i2);

    public void end() {
        nativeEnd(this.mReadBuffer);
    }

    public void write(byte[] bArr, int i, int i2) {
        nativeWrite(this.mReadBuffer, bArr, i, i2);
    }

    public NativeReadBufferHelper(NativeReadBuffer nativeReadBuffer) {
        this.mReadBuffer = nativeReadBuffer;
    }
}
