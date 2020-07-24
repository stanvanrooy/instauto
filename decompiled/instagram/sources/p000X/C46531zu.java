package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: X.1zu  reason: invalid class name and case insensitive filesystem */
public final class C46531zu implements Closeable {
    public final FileOutputStream A00;
    public final FileLock A01;

    public final void close() {
        try {
            FileLock fileLock = this.A01;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.A00.close();
        }
    }

    public C46531zu(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.A00 = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.A01 = lock;
        } finally {
            this.A00.close();
        }
    }
}
