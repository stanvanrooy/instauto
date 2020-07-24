package p000X;

import com.facebook.proxygen.ReadBuffer;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1Cm  reason: invalid class name and case insensitive filesystem */
public final class C26281Cm extends InputStream {
    public C45341xi A00;
    public boolean A01;
    public final ReadBuffer A02;

    public final synchronized int available() {
        return this.A02.size();
    }

    public final synchronized void close() {
        if (!this.A01) {
            this.A02.close();
            this.A01 = true;
        }
    }

    public final boolean markSupported() {
        return false;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) {
        throw new UnsupportedOperationException();
    }

    public C26281Cm(ReadBuffer readBuffer) {
        this.A02 = readBuffer;
    }

    public final synchronized int read() {
        byte b;
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        b = -1;
        if (read != -1) {
            if (read == 1) {
                b = bArr[0];
            } else {
                throw new IllegalStateException(AnonymousClass000.A05("Liger ReadBufferInputStream n=", read));
            }
        }
        return b;
    }

    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001a A[LOOP:0: B:7:0x000f->B:14:0x001a, LOOP_END] */
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        if (!this.A01) {
            C45341xi r0 = this.A00;
            if (r0 == null) {
                read = this.A02.read(bArr, i, i2);
                while (read == 0) {
                    wait(1000);
                    r0 = this.A00;
                    if (r0 == null) {
                        read = this.A02.read(bArr, i, i2);
                    }
                }
            }
            throw r0;
        }
        throw new IOException("Buffer is Closed");
        return read;
    }
}
