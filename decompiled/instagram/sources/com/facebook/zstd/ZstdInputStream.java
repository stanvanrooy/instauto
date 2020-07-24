package com.facebook.zstd;

import com.facebook.jni.HybridData;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000X.AnonymousClass0YD;

public class ZstdInputStream extends FilterInputStream {
    public int mBufferSize = 4096;
    public final HybridData mHybridData = initHybrid(4096);
    public byte[] mInBuf = new byte[4096];
    public byte[] mOutBuf = new byte[4096];
    public boolean sourceEOF = false;

    private native boolean canWrite();

    public static native HybridData initHybrid(int i);

    private native int nativeRead(byte[] bArr, int i);

    private native void nativeWrite(byte[] bArr, int i);

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
    }

    static {
        AnonymousClass0YD.A01("zstddecoder");
    }

    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || bArr.length - i3 < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    break;
                }
                if (canWrite()) {
                    int read = this.in.read(this.mInBuf);
                    if (read == -1) {
                        this.sourceEOF = true;
                    } else {
                        nativeWrite(this.mInBuf, read);
                    }
                }
                int nativeRead = nativeRead(this.mOutBuf, Math.min(this.mBufferSize, i2 - i4));
                if (this.sourceEOF) {
                    if (nativeRead == 0) {
                        throw new IOException("Unexpected end of ZSTD stream");
                    } else if (nativeRead == -1) {
                        if (i4 == 0) {
                            return -1;
                        }
                    }
                }
                System.arraycopy(this.mOutBuf, 0, bArr, i + i4, nativeRead);
                i4 += nativeRead;
            }
            return i4;
        }
    }
}
