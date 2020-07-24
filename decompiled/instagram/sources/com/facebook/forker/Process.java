package com.facebook.forker;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Y1;

public final class Process extends Process implements Closeable {
    public static final int FD_STREAM_INPUT = 0;
    public static final int FD_STREAM_OUTPUT = 1;
    public static final int IGNORE_FD = -1;
    public static final int SD_BLACK_HOLE = -3;
    public static final int SD_INHERIT = -2;
    public static final int SD_PIPE = -4;
    public static final int SD_STDOUT = -5;
    public static final int SIGCONT = 18;
    public static final int SIGKILL = 9;
    public static final int SIGSTOP = 19;
    public static final int SIGTERM = 15;
    public static final int SIGTSTP = 20;
    public static final int STATUS_EXITED = 4;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 2;
    public static final int STDERR = 2;
    public static final int STDIN = 0;
    public static final int STDOUT = 1;
    public static final String TAG = "fb-Process";
    public static final int WAIT_RESULT_RUNNING = -2147483646;
    public static final int WAIT_RESULT_STOPPED = -2147483647;
    public static final int WAIT_RESULT_TIMEOUT = Integer.MIN_VALUE;
    public InputStream mChildStderr;
    public OutputStream mChildStdin;
    public InputStream mChildStdout;
    public final int mExitStatus;
    public int mPid = -1;
    public final int mProcessStatus;
    public WaiterThread mWaiterThread = new WaiterThread();

    public final class WaiterThread extends Thread {
        public WaiterThread() {
            super("PidWaiter:Ready");
        }

        public void run() {
            Process.this.nativeWait();
        }
    }

    private native void nativeKill(int i);

    private native int nativeLaunch(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2);

    public static native void nativeUnixClose(int i);

    public static native int nativeUnixCreateTmpFile(String str);

    public static native int nativeUnixOpen(String str);

    public static native int[] nativeUnixPipe(int[] iArr);

    /* access modifiers changed from: private */
    public native void nativeWait();

    public synchronized int exitValueEx() {
        if (this.mProcessStatus == 4) {
        } else {
            throw new IllegalThreadStateException(AnonymousClass000.A05("Process has not yet terminated: ", this.mPid));
        }
        return this.mExitStatus;
    }

    static {
        AnonymousClass0Y1.A08("forker");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0113  */
    public Process(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2, File file) {
        int[] iArr3;
        int i;
        int i2;
        try {
            iArr3 = new int[6];
            int i3 = 0;
            while (i3 < 6) {
                try {
                    iArr3[i3] = -1;
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i = -1;
                    unixClose(i);
                    unixClose(iArr3);
                    safeClose(this.mChildStdin);
                    safeClose(this.mChildStdout);
                    safeClose(this.mChildStderr);
                    if (this.mPid != -1) {
                    }
                    throw th;
                }
            }
            for (int i4 = 0; i4 < 6; i4 += 2) {
                int[] nativeUnixPipe = nativeUnixPipe(new int[2]);
                if (i4 == 0) {
                    iArr3[0] = nativeUnixPipe[1];
                    iArr3[1] = nativeUnixPipe[0];
                } else {
                    iArr3[i4] = nativeUnixPipe[0];
                    iArr3[i4 + 1] = nativeUnixPipe[1];
                }
            }
            int[] iArr4 = new int[6];
            int i5 = 0;
            i = -1;
            while (i5 < 3) {
                try {
                    int i6 = iArr2[i5];
                    if (i6 != -5) {
                        if (i6 != -4) {
                            if (i6 == -3) {
                                i = i == -1 ? nativeUnixOpen("/dev/null") : i;
                                if (i != -1 || file == null) {
                                    i6 = i;
                                } else {
                                    i6 = nativeUnixCreateTmpFile(file.getCanonicalPath());
                                }
                                i2 = -1;
                                if (i6 == -1) {
                                }
                            } else if (i6 != -2) {
                                if (i6 < 0) {
                                    throw new IllegalArgumentException(String.format("illegal stream disposition %s for fd %s", new Object[]{Integer.valueOf(i6), Integer.valueOf(i5)}));
                                }
                            }
                            i2 = i6;
                        } else {
                            i2 = iArr3[(i5 << 1) + 1];
                        }
                        int i7 = i5 << 1;
                        iArr4[i7] = i2;
                        iArr4[i7 + 1] = i5;
                        i5++;
                    }
                    i2 = i5;
                    int i72 = i5 << 1;
                    iArr4[i72] = i2;
                    iArr4[i72 + 1] = i5;
                    i5++;
                } catch (Throwable th2) {
                    th = th2;
                    unixClose(i);
                    unixClose(iArr3);
                    safeClose(this.mChildStdin);
                    safeClose(this.mChildStdout);
                    safeClose(this.mChildStderr);
                    if (this.mPid != -1) {
                    }
                    throw th;
                }
            }
            for (int i8 = 0; i8 < 3; i8++) {
                if (iArr2[i8] == -5) {
                    iArr4[(i8 << 1) + 0] = iArr4[2];
                }
            }
            int nativeLaunch = nativeLaunch(str, strArr, bArr, iArr4, iArr);
            this.mPid = nativeLaunch;
            this.mWaiterThread.setName(AnonymousClass000.A05("PidWaiter:", nativeLaunch));
            this.mChildStdin = (OutputStream) openFdStream(iArr3[0], 1);
            this.mChildStdout = (InputStream) openFdStream(iArr3[2], 0);
            this.mChildStderr = (InputStream) openFdStream(iArr3[4], 0);
            this.mWaiterThread.start();
            unixClose(i);
            unixClose(iArr3);
        } catch (Throwable th3) {
            th = th3;
            iArr3 = null;
            i = -1;
            unixClose(i);
            unixClose(iArr3);
            safeClose(this.mChildStdin);
            safeClose(this.mChildStdout);
            safeClose(this.mChildStderr);
            if (this.mPid != -1) {
                nativeKill(9);
                nativeWait();
            }
            throw th;
        }
    }

    public static String describeStatus(int i) {
        StringBuilder sb;
        if (i < 0) {
            sb = new StringBuilder("killed by signal ");
            i = -i;
        } else if (i <= 0) {
            return "exited successfully";
        } else {
            sb = new StringBuilder("exited with status ");
        }
        sb.append(i);
        return sb.toString();
    }

    public static String fdMagicName(int i) {
        return AnonymousClass000.A09("/proc/", android.os.Process.myPid(), "/task/", android.os.Process.myTid(), "/fd/", i);
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public void destroy() {
        nativeKill(9);
        boolean z = false;
        while (true) {
            try {
                this.mWaiterThread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        synchronized (this) {
            safeClose(this.mChildStdin);
            safeClose(this.mChildStdout);
            safeClose(this.mChildStderr);
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public InputStream getErrorStream() {
        return this.mChildStderr;
    }

    public InputStream getInputStream() {
        return this.mChildStdout;
    }

    public OutputStream getOutputStream() {
        return this.mChildStdin;
    }

    public int getPid() {
        return this.mPid;
    }

    public static Object openFdStream(int i, int i2) {
        String fdMagicName = fdMagicName(i);
        if (i2 != 0) {
            return new FileOutputStream(fdMagicName);
        }
        try {
            return new FileInputStream(fdMagicName);
        } catch (FileNotFoundException unused) {
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i);
            if (i2 == 0) {
                return new ParcelFileDescriptor.AutoCloseInputStream(fromFd);
            }
            return new ParcelFileDescriptor.AutoCloseOutputStream(fromFd);
        }
    }

    public void close() {
        destroy();
    }

    public int exitValue() {
        int exitValueEx = exitValueEx();
        if (exitValueEx < 0) {
            return (-exitValueEx) + 128;
        }
        return exitValueEx;
    }

    public void kill(int i) {
        nativeKill(i);
    }

    public static void unixClose(int i) {
        if (i != -1) {
            nativeUnixClose(i);
        }
    }

    public static void unixClose(int[] iArr) {
        if (iArr != null) {
            for (int unixClose : iArr) {
                unixClose(unixClose);
            }
        }
    }

    public synchronized int waitFor() {
        while (this.mProcessStatus != 4) {
            wait();
        }
        return exitValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    public synchronized int waitFor(int i, int i2) {
        int i3;
        int i4;
        long j = 0;
        while (true) {
            int i5 = this.mProcessStatus;
            i3 = i5 & i2;
            if (i3 == 0 && i5 != 4 && i != 0) {
                if (i > 0) {
                    j = System.currentTimeMillis();
                    wait((long) i);
                } else {
                    wait();
                }
                if (i > 0) {
                    long max = Math.max(0, System.currentTimeMillis() - j);
                    i = ((long) i) < max ? 0 : i - ((int) max);
                }
            } else if (i3 == 0) {
                if (i5 == 1) {
                    i4 = WAIT_RESULT_RUNNING;
                } else if (i5 == 2) {
                    i4 = WAIT_RESULT_STOPPED;
                } else if (i5 == 4) {
                    i4 = this.mExitStatus;
                } else {
                    throw new AssertionError();
                }
            } else if (i == 0) {
                i4 = WAIT_RESULT_TIMEOUT;
            } else {
                throw new RuntimeException(AnonymousClass000.A05("process entered unexpected state ", i5));
            }
        }
        if (i3 == 0) {
        }
        return i4;
    }

    public int waitForUninterruptibly() {
        int waitFor;
        boolean z = false;
        while (true) {
            try {
                waitFor = waitFor();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return waitFor;
    }

    public int waitForUninterruptibly(int i, int i2) {
        long j = 0;
        boolean z = false;
        int i3 = WAIT_RESULT_TIMEOUT;
        while (true) {
            if (i > 0) {
                j = System.currentTimeMillis();
            }
            try {
                i3 = waitFor(i, i2);
                if (i3 != Integer.MIN_VALUE) {
                    break;
                }
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
            if (i > 0) {
                long max = Math.max(0, System.currentTimeMillis() - j);
                if (((long) i) < max) {
                    i = 0;
                    continue;
                } else {
                    i -= (int) max;
                    continue;
                }
            }
            if (i == 0) {
                break;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i3;
    }
}
