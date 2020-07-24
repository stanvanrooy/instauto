package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.01f  reason: invalid class name and case insensitive filesystem */
public final class C021401f implements Closeable {
    public final File A00;
    public final RandomAccessFile A01;
    public final /* synthetic */ C021601h A02;

    public C021401f(C021601h r1, File file, RandomAccessFile randomAccessFile) {
        this.A02 = r1;
        this.A00 = file;
        this.A01 = randomAccessFile;
    }

    public final void close() {
        synchronized (this.A02) {
            this.A02.A01.remove(this.A00);
        }
        this.A01.close();
    }
}
