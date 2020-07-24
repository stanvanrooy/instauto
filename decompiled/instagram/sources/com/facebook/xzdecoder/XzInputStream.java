package com.facebook.xzdecoder;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;
import java.io.InputStream;
import p000X.AnonymousClass0YD;

public class XzInputStream extends InputStream {
    public int clientOutPos;
    public byte[] inBuf = new byte[DexStore.LOAD_RESULT_PGO];
    public InputStream inFile;
    public int inPos;
    public int inSize;
    public byte[] outBuf = new byte[DexStore.LOAD_RESULT_PGO];
    public int outPos;
    public long state = initializeState();

    public static native long decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native void end(long j);

    public static native void initializeLibrary();

    public static native long initializeState();

    private boolean readMoreInput() {
        this.inSize = 0;
        this.inPos = 0;
        while (true) {
            int i = this.inSize;
            if (i >= 32768) {
                return true;
            }
            InputStream inputStream = this.inFile;
            byte[] bArr = this.inBuf;
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read == -1) {
                return this.inSize > 0;
            }
            this.inSize += read;
        }
    }

    static {
        AnonymousClass0YD.A01("fb_xzdecoder");
        initializeLibrary();
    }

    private void decodeMoreBytes() {
        long j = this.state;
        byte[] bArr = this.inBuf;
        int i = this.inPos;
        int i2 = this.inSize;
        byte[] bArr2 = this.outBuf;
        long decompressStream = decompressStream(j, bArr, i, i2, bArr2, 0, bArr2.length);
        this.inPos = (int) (decompressStream >>> 32);
        this.outPos = (int) decompressStream;
        this.clientOutPos = 0;
    }

    public void close() {
        this.inFile.close();
        long j = this.state;
        if (j != 0) {
            end(j);
            this.state = 0;
        }
    }

    public XzInputStream(InputStream inputStream) {
        this.inFile = inputStream;
    }

    public int read() {
        if (this.state != 0) {
            if (this.clientOutPos == this.outPos) {
                if (this.inPos == this.inSize && !readMoreInput()) {
                    return -1;
                }
                decodeMoreBytes();
            }
            byte[] bArr = this.outBuf;
            int i = this.clientOutPos;
            this.clientOutPos = i + 1;
            return bArr[i];
        }
        throw new IOException("Stream closed");
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("buf.length = %d, off = %d, len = %d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (this.state != 0) {
            int i4 = i2;
            while (i3 < i2) {
                int i5 = this.clientOutPos;
                int i6 = this.outPos;
                if (i5 < i6) {
                    int min = Math.min(i4, i6 - i5);
                    System.arraycopy(this.outBuf, i5, bArr, i, min);
                    this.clientOutPos += min;
                    i4 -= min;
                    i += min;
                    i3 += min;
                } else if (this.inPos != this.inSize || readMoreInput()) {
                    decodeMoreBytes();
                } else if (i3 == 0) {
                    return -1;
                } else {
                    return i3;
                }
            }
            return i3;
        } else {
            throw new IOException("Stream closed");
        }
    }
}
