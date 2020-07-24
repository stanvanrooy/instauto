package p000X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.ADD */
public final class ADD {
    public final AnonymousClass0XP A00;
    public final File A01;

    public final File A00() {
        if (this.A01.exists()) {
            if (!this.A01.isDirectory()) {
                throw new IOException("Temporary folder is not a directory.");
            } else if (!this.A01.canRead()) {
                throw new IOException("No read permissions for temporary directory.");
            } else if (!this.A01.canWrite()) {
                throw new IOException("No write permissions for temporary directory.");
            }
        } else if (!this.A01.mkdirs()) {
            this.A00.Bbw("TempFileDirectoryManager", String.format("Could not create temporary directory. %s", new Object[]{this.A01.getCanonicalPath()}), (Throwable) null);
        }
        return this.A01;
    }

    public ADD(File file) {
        File canonicalFile = file.getCanonicalFile();
        C23156AAg aAg = new C23156AAg();
        this.A01 = canonicalFile.getCanonicalFile();
        this.A00 = aAg;
    }
}
