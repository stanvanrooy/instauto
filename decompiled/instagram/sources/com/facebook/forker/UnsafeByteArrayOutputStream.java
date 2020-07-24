package com.facebook.forker;

import java.io.ByteArrayOutputStream;

public final class UnsafeByteArrayOutputStream extends ByteArrayOutputStream {
    public byte[] getRawBuffer() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            return bArr;
        }
        return toByteArray();
    }

    public UnsafeByteArrayOutputStream() {
    }

    public UnsafeByteArrayOutputStream(int i) {
        super(i);
    }
}
