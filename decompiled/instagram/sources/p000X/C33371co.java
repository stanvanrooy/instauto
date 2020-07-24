package p000X;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.1co  reason: invalid class name and case insensitive filesystem */
public abstract class C33371co extends OutputStream {
    public boolean A00 = false;
    public boolean A01 = false;
    public final OutputStream A02;

    public abstract FileDescriptor A01();

    public abstract FileChannel A02();

    public abstract void A03();

    public abstract boolean A04();

    public void close() {
        this.A00 = true;
        try {
            this.A02.close();
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public final void flush() {
        try {
            this.A02.flush();
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public C33371co(OutputStream outputStream) {
        this.A02 = outputStream;
    }

    public final void write(int i) {
        try {
            this.A02.write(i);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.A02.write(bArr);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.A02.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }
}
