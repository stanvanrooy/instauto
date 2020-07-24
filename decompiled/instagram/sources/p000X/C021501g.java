package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.01g  reason: invalid class name and case insensitive filesystem */
public final class C021501g implements Iterator, Closeable {
    public AnonymousClass01e A00 = null;
    public int A01 = 0;
    public final C021301d[] A02;
    public final /* synthetic */ C021601h A03;

    public C021501g(C021601h r2, C021301d[] r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x00cd, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x00ce, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x00dd, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x00e7, code lost:
        monitor-enter(r11.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r11.A03.A01.remove(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x00f1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x00f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r7 = new java.io.RandomAccessFile(r6, "rw");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (p000X.C021601h.A00(r7) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (r6.exists() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0068, code lost:
        if (r7.length() != 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006a, code lost:
        r6.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r1 = new p000X.AnonymousClass01e(r11.A03, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0084, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0085, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0087, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0088, code lost:
        r4 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x00e0 A[SYNTHETIC, Splitter:B:116:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00af A[SYNTHETIC, Splitter:B:79:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00b4  */
    public static void A00(C021501g r11) {
        File file;
        RandomAccessFile randomAccessFile;
        boolean z;
        while (r11.A00 == null) {
            int i = r11.A01;
            C021301d[] r1 = r11.A02;
            if (i < r1.length) {
                r11.A01 = i + 1;
                file = r1[i].A01;
                boolean z2 = true;
                try {
                    synchronized (r11.A03) {
                        try {
                            if (!r11.A03.A01.contains(file)) {
                                r11.A03.A01.add(file);
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    z = true;
                                    while (true) {
                                        try {
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (IOException e) {
                                        e = e;
                                        randomAccessFile = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        randomAccessFile = null;
                                        z2 = z;
                                        if (randomAccessFile != null) {
                                        }
                                        if (z2) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            AnonymousClass01e r12 = null;
                            r11.A00 = r12;
                        } catch (Throwable th4) {
                            th = th4;
                            z = false;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    randomAccessFile = null;
                    z = false;
                    try {
                        AnonymousClass0DB.A0Q("Spool", e, "unexpected failure opening %s: deleting and continuing scan", file.getName());
                        file.delete();
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (z) {
                            synchronized (r11.A03) {
                                try {
                                    r11.A03.A01.remove(file);
                                } catch (Throwable th5) {
                                    while (true) {
                                        th = th5;
                                        break;
                                    }
                                }
                            }
                        }
                        AnonymousClass01e r122 = null;
                        r11.A00 = r122;
                    } catch (Throwable th6) {
                        th = th6;
                        z2 = z;
                        if (randomAccessFile != null) {
                        }
                        if (z2) {
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    randomAccessFile = null;
                    z2 = false;
                    if (randomAccessFile != null) {
                    }
                    if (z2) {
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
        return;
        synchronized (r11.A03) {
            try {
                r11.A03.A01.remove(file);
            } catch (Throwable th8) {
                while (true) {
                    th = th8;
                    break;
                }
            }
        }
        AnonymousClass01e r1222 = null;
        r11.A00 = r1222;
        synchronized (r11.A03) {
            try {
                r11.A03.A01.remove(file);
            } catch (Throwable th9) {
                while (true) {
                    th = th9;
                    break;
                }
            }
        }
        AnonymousClass01e r12222 = null;
        r11.A00 = r12222;
        synchronized (r11.A03) {
            try {
                r11.A03.A01.remove(file);
            } catch (Throwable th10) {
                while (true) {
                    th = th10;
                    break;
                }
            }
        }
        AnonymousClass01e r122222 = null;
        r11.A00 = r122222;
    }

    public final void close() {
        AnonymousClass01e r0 = this.A00;
        if (r0 != null) {
            try {
                r0.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        A00(this);
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        A00(this);
        AnonymousClass01e r1 = this.A00;
        if (r1 != null) {
            this.A00 = null;
            return r1;
        }
        throw new NoSuchElementException();
    }
}
