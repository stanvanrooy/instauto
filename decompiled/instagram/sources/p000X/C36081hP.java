package p000X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.1hP  reason: invalid class name and case insensitive filesystem */
public final class C36081hP extends InputStream {
    public boolean A00 = false;
    public final BufferedOutputStream A01;
    public final File A02;
    public final File A03;
    public final InputStream A04;

    public static File getPendingFile(File file) {
        return new File(AnonymousClass000.A0E(file.getPath(), ".pending"));
    }

    public final int available() {
        return this.A04.available();
    }

    public final void close() {
        this.A01.close();
        this.A04.close();
        if (this.A00) {
            this.A03.renameTo(this.A02);
        } else {
            this.A03.delete();
        }
    }

    public final void mark(int i) {
        throw new RuntimeException("Operation not supported");
    }

    public final boolean markSupported() {
        throw new RuntimeException("Operation not supported");
    }

    public final void reset() {
        throw new RuntimeException("Operation not supported");
    }

    public final long skip(long j) {
        throw new RuntimeException("Operation not supported");
    }

    public C36081hP(InputStream inputStream, File file) {
        this.A04 = inputStream;
        this.A02 = file;
        File pendingFile = getPendingFile(file);
        this.A03 = pendingFile;
        this.A01 = new BufferedOutputStream(new FileOutputStream(pendingFile));
    }

    public final int read() {
        this.A00 = false;
        int read = this.A04.read();
        if (read != -1) {
            this.A01.write(read);
        }
        this.A00 = true;
        return read;
    }

    public final int read(byte[] bArr) {
        this.A00 = false;
        int read = this.A04.read(bArr);
        if (read != -1) {
            this.A01.write(bArr, 0, read);
        }
        this.A00 = true;
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        this.A00 = false;
        int read = this.A04.read(bArr, i, i2);
        if (read != -1) {
            this.A01.write(bArr, i, read);
        }
        this.A00 = true;
        return read;
    }
}
