package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class ReentrantLockFile implements Closeable {
    public static final int ACQUIRE_SHARED = 1;
    public static final boolean LOCK_DEBUG = false;
    public static final ReentrantLockFile sListHead = new ReentrantLockFile();
    public final File lockFileName;
    public FileChannel mChannel;
    public int mLockFlags;
    public final Lock mLockHandle;
    public boolean mLockInProgress;
    public Thread mLockOwner;
    public int mLockShareCount;
    public ReentrantLockFile mNext;
    public ReentrantLockFile mPrev;
    public int mReferenceCount;
    public FileLock mTheLock;

    public final class Lock implements Closeable {
        public Lock() {
        }

        public void close() {
            ReentrantLockFile.this.release();
        }

        public ReentrantLockFile getReentrantLockFile() {
            return ReentrantLockFile.this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0061, code lost:
        return null;
     */
    public synchronized Lock tryAcquire(int i) {
        Throwable th;
        Lock lock;
        FileLock fileLock;
        FileChannel fileChannel = this.mChannel;
        if (fileChannel != null) {
            boolean z = false;
            boolean z2 = false;
            if ((i & 1) != 0) {
                z2 = true;
            }
            if (!this.mLockInProgress) {
                int i2 = this.mLockShareCount;
                if (i2 > 0) {
                    if ((this.mLockFlags & 1) != 0) {
                        z = true;
                    }
                    if ((z2 && z) || (!z && this.mLockOwner == Thread.currentThread())) {
                        this.mLockShareCount = i2 + 1;
                        lock = this.mLockHandle;
                    }
                } else {
                    try {
                        fileLock = fileChannel.tryLock(0, Long.MAX_VALUE, z2);
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null || (!message.contains(": EAGAIN (") && !message.contains(": errno 11 ("))) {
                            th = new RuntimeException(e);
                        } else {
                            fileLock = null;
                        }
                    }
                    if (fileLock != null) {
                        addrefLocked();
                        claimLock(i, fileLock);
                        lock = this.mLockHandle;
                    }
                }
            }
        } else {
            th = new IllegalStateException("cannot acquire closed lock");
            throw th;
        }
    }

    private void addrefLocked() {
        if (this.mChannel != null) {
            this.mReferenceCount++;
            return;
        }
        throw new IllegalStateException("cannot add reference to dead lock");
    }

    private void claimLock(int i, FileLock fileLock) {
        if ((i & 1) == 0) {
            this.mLockOwner = Thread.currentThread();
        }
        this.mTheLock = fileLock;
        this.mLockFlags = i;
        this.mLockShareCount = 1;
    }

    public static synchronized ReentrantLockFile open(File file) {
        FileChannel fileChannel;
        RandomAccessFile randomAccessFile;
        synchronized (ReentrantLockFile.class) {
            File absoluteFile = file.getAbsoluteFile();
            ReentrantLockFile reentrantLockFile = sListHead;
            do {
                reentrantLockFile = reentrantLockFile.mNext;
                if (reentrantLockFile == sListHead) {
                    RandomAccessFile randomAccessFile2 = null;
                    try {
                        randomAccessFile = new RandomAccessFile(absoluteFile, "rw");
                    } catch (Throwable th) {
                        th = th;
                        fileChannel = null;
                        C0015Fs.safeClose((Closeable) randomAccessFile2);
                        C0015Fs.safeClose((Closeable) fileChannel);
                        throw th;
                    }
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        try {
                            ReentrantLockFile reentrantLockFile2 = new ReentrantLockFile(absoluteFile, fileChannel);
                            ReentrantLockFile reentrantLockFile3 = sListHead;
                            reentrantLockFile2.mPrev = reentrantLockFile3;
                            reentrantLockFile2.mNext = reentrantLockFile3.mNext;
                            reentrantLockFile3.mNext = reentrantLockFile2;
                            reentrantLockFile2.mNext.mPrev = reentrantLockFile2;
                            C0015Fs.safeClose((Closeable) null);
                            C0015Fs.safeClose((Closeable) null);
                            return reentrantLockFile2;
                        } catch (Throwable th2) {
                            th = th2;
                            C0015Fs.safeClose((Closeable) randomAccessFile2);
                            C0015Fs.safeClose((Closeable) fileChannel);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = null;
                        randomAccessFile2 = randomAccessFile;
                        C0015Fs.safeClose((Closeable) randomAccessFile2);
                        C0015Fs.safeClose((Closeable) fileChannel);
                        throw th;
                    }
                }
            } while (!absoluteFile.equals(reentrantLockFile.lockFileName));
            synchronized (reentrantLockFile) {
                try {
                    reentrantLockFile.addrefLocked();
                } catch (Throwable th4) {
                    while (true) {
                        th = th4;
                        break;
                    }
                }
            }
            return reentrantLockFile;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        if (r3 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = r10.mChannel.lock(0, Long.MAX_VALUE, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004b, code lost:
        if (r0 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r10.mLockInProgress = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0053, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0055, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x005b, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        claimLock(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r10.mLockInProgress = false;
        notifyAll();
        r0 = r10.mLockHandle;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0066, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0067, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0068, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0069, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x006c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x006e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0074, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0075, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r10.mLockInProgress = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x007e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x008c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x008d, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x008f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0092, code lost:
        close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:35:0x004d, B:67:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0092  */
    public Lock acquireInterruptubly(int i) {
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z3 = true;
        }
        assertMonitorLockNotHeld();
        try {
            synchronized (this) {
                z = false;
                while (tryAcquire(i) == null) {
                    try {
                        if (this.mLockInProgress || this.mLockShareCount != 0) {
                            if (!z) {
                                addrefLocked();
                                z = true;
                            }
                            wait();
                        } else {
                            if (!z) {
                                addrefLocked();
                                z = true;
                            }
                            this.mLockInProgress = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                Lock lock = this.mLockHandle;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
            }
            throw th;
        }
    }

    public void donateLock(Thread thread) {
        boolean z = false;
        if (this.mLockOwner == Thread.currentThread()) {
            z = true;
        }
        Mlog.assertThat(z, "caller must own lock exclusively", new Object[0]);
        this.mLockOwner = thread;
    }

    public Thread getExclusiveOwner() {
        return this.mLockOwner;
    }

    public void stealLock() {
        boolean z = false;
        if (this.mLockOwner != null) {
            z = true;
        }
        Mlog.assertThat(z, "cannot steal unowned lock", new Object[0]);
        this.mLockOwner = Thread.currentThread();
    }

    private void assertMonitorLockNotHeld() {
        Mlog.assertThat(!Thread.holdsLock(this), "lock order violation", new Object[0]);
    }

    public Lock acquire(int i) {
        Lock lock;
        boolean z;
        try {
            lock = acquireInterruptubly(i);
            z = false;
        } catch (InterruptedException unused) {
            z = true;
            lock = null;
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return lock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r2 = com.facebook.common.dextricks.ReentrantLockFile.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = r3.mReferenceCount - 1;
        r3.mReferenceCount = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r0 != 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        r1 = r3.mPrev;
        r1.mNext = r3.mNext;
        r3.mNext.mPrev = r1;
        r3.mPrev = null;
        r3.mNext = null;
        com.facebook.common.dextricks.C0015Fs.safeClose((java.io.Closeable) r3.mChannel);
        r3.mChannel = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return;
     */
    public void close() {
        assertMonitorLockNotHeld();
        synchronized (this) {
            try {
                if (this.mChannel != null) {
                    int i = this.mReferenceCount;
                    if (i > 1) {
                        this.mReferenceCount = i - 1;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r5.mLockOwner == java.lang.Thread.currentThread()) goto L_0x0025;
     */
    public void release() {
        boolean z;
        boolean z2;
        assertMonitorLockNotHeld();
        synchronized (this) {
            z = true;
            boolean z3 = false;
            if (this.mLockShareCount > 0) {
                z3 = true;
            }
            Mlog.assertThat(z3, "lock release balance", new Object[0]);
            boolean z4 = false;
            if ((this.mLockFlags & 1) != 0) {
                z4 = true;
            }
            if (!z4) {
                z2 = false;
            }
            z2 = true;
            Mlog.assertThat(z2, "lock thread affinity", new Object[0]);
            int i = this.mLockShareCount - 1;
            this.mLockShareCount = i;
            if (i == 0) {
                try {
                    this.mTheLock.release();
                    this.mLockOwner = null;
                    this.mTheLock = null;
                    this.mLockFlags = 0;
                    notifyAll();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                z = false;
            }
        }
        if (z) {
            close();
        }
    }

    public ReentrantLockFile() {
        this.lockFileName = null;
        this.mLockHandle = null;
        this.mNext = this;
        this.mPrev = this;
    }

    public ReentrantLockFile(File file, FileChannel fileChannel) {
        this.lockFileName = file;
        this.mChannel = fileChannel;
        this.mReferenceCount = 1;
        this.mLockHandle = new Lock();
    }
}
