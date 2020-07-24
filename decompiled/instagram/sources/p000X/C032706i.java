package p000X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: X.06i  reason: invalid class name and case insensitive filesystem */
public final class C032706i extends AnonymousClass05A {
    public FileLock A00;
    public final FileChannel A01;
    public final File A02;
    public final /* synthetic */ C032106a A03;

    public final synchronized void A01() {
        try {
            this.A01.close();
        } catch (IOException e) {
            AnonymousClass0DB.A0R("CrossProcessBatchLock", e, "Failed to close the file channel associated with file: %s", this.A02);
        }
        return;
    }

    public final synchronized void A03() {
        RuntimeException runtimeException;
        synchronized (this) {
            while (this.A00 == null) {
                try {
                    this.A00 = this.A01.lock();
                } catch (ClosedChannelException e) {
                    runtimeException = new RuntimeException("File channel is closed prematurely or opened non-writable for: " + this.A02, e);
                } catch (FileLockInterruptionException e2) {
                    AnonymousClass0DB.A0Q("CrossProcessBatchLock", e2, "Interrupted while waiting to lock the file: %s", this.A02);
                } catch (IOException | NonWritableChannelException e3) {
                    runtimeException = new RuntimeException("Failed to lock the file due to an IOException!", e3);
                }
            }
        }
        return;
        throw runtimeException;
    }

    public final synchronized void A04() {
        this.A02.delete();
    }

    public final synchronized void A05() {
        RuntimeException runtimeException;
        synchronized (this) {
            FileLock fileLock = this.A00;
            if (fileLock != null) {
                try {
                    fileLock.release();
                    this.A00 = null;
                } catch (ClosedChannelException e) {
                    runtimeException = new RuntimeException("File Channel has been closed prematurely for: " + this.A02, e);
                    throw runtimeException;
                } catch (IOException e2) {
                    runtimeException = new RuntimeException("Failed to unlock the file due to an IOException!", e2);
                    throw runtimeException;
                }
            } else {
                throw new IllegalStateException("File lock was never held for: " + this.A02);
            }
        }
    }

    public final synchronized boolean A08() {
        boolean z;
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    this.A00 = this.A01.tryLock();
                } catch (ClosedChannelException e) {
                    throw new RuntimeException("File channel closed prematurely for: " + this.A02, e);
                } catch (IOException | OverlappingFileLockException e2) {
                    AnonymousClass0DB.A0N("CrossProcessBatchLock", e2, "IOException happens when trying to lock the file.");
                }
            }
            z = false;
            if (this.A00 != null) {
                z = true;
            }
        }
        return z;
    }

    public final synchronized boolean A09() {
        return !this.A02.exists();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C032706i(C032106a r5, File file) {
        super(r5, file);
        this.A03 = r5;
        if (file.getParentFile().isDirectory() || file.getParentFile().mkdirs()) {
            File file2 = new File(file.getParentFile(), AnonymousClass000.A0E(file.getName(), ".lock"));
            this.A02 = file2;
            this.A01 = new RandomAccessFile(file2, "rw").getChannel();
            return;
        }
        throw new IOException("Unable to create parent directories for: " + file);
    }
}
