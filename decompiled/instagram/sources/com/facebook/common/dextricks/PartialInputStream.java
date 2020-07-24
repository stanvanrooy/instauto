package com.facebook.common.dextricks;

import java.io.InputStream;

public final class PartialInputStream extends InputStream {
    public int mBytesRead;
    public final int mBytesToRead;
    public final InputStream mUnderlyingStream;

    public int available() {
        return this.mBytesToRead - this.mBytesRead;
    }

    public PartialInputStream(InputStream inputStream, int i) {
        this.mBytesToRead = i;
        this.mUnderlyingStream = inputStream;
    }

    public int read() {
        if (this.mBytesRead == this.mBytesToRead) {
            return -1;
        }
        int read = this.mUnderlyingStream.read();
        if (read != -1) {
            this.mBytesRead++;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 > 0 && this.mBytesRead == this.mBytesToRead) {
            return -1;
        }
        int read = this.mUnderlyingStream.read(bArr, i, Math.min(i2, this.mBytesToRead - this.mBytesRead));
        if (read > 0) {
            this.mBytesRead += read;
        }
        return read;
    }
}
