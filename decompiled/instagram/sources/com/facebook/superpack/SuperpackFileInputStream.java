package com.facebook.superpack;

import java.io.InputStream;

public class SuperpackFileInputStream extends InputStream {
    public int A00;
    public int A01;
    public int A02;
    public Boolean A03;
    public byte[] A04;
    public final SuperpackFile A05;

    public final synchronized void mark(int i) {
        this.A01 = this.A02;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized void reset() {
        this.A02 = this.A01;
    }

    public final synchronized long skip(long j) {
        if (j < 0) {
            return 0;
        }
        int i = this.A02;
        long j2 = (long) i;
        int i2 = this.A00;
        if (j2 + j > ((long) i2)) {
            j = (long) (i2 - i);
        }
        this.A02 = (int) (j2 + j);
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw r0;
     */
    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str) {
        IllegalArgumentException illegalArgumentException;
        if (inputStream == null || inputStream == null) {
            throw null;
        }
        SuperpackArchive superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, str));
        if (superpackArchive.hasNext()) {
            SuperpackFile next = superpackArchive.next();
            if (!superpackArchive.hasNext()) {
                SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, true);
                superpackArchive.close();
                return superpackFileInputStream;
            }
            illegalArgumentException = new IllegalArgumentException();
        } else {
            illegalArgumentException = new IllegalArgumentException();
        }
        throw illegalArgumentException;
    }

    public final void close() {
        if (this.A03.booleanValue()) {
            this.A05.close();
        }
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile) {
        int i;
        if (superpackFile != null) {
            this.A05 = superpackFile;
            this.A02 = 0;
            synchronized (superpackFile) {
                if (superpackFile.mPtr != 0) {
                    i = superpackFile.mLength;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.A00 = i;
            this.A01 = 0;
            this.A04 = null;
            this.A03 = false;
            return;
        }
        throw null;
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile, Boolean bool) {
        this(superpackFile);
        this.A03 = bool;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final synchronized int read() {
        int i;
        if (this.A04 == null) {
            this.A04 = new byte[1];
        }
        int read = read(this.A04);
        i = -1;
        if (read != -1) {
            if (read == 1) {
                byte b = this.A04[0];
                i = b;
                if (b < 0) {
                    i = b + 256;
                }
            } else {
                throw new IllegalStateException("Unexpected number of bytes read");
            }
        }
        return i;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x0062=Splitter:B:49:0x0062, B:19:0x001e=Splitter:B:19:0x001e} */
    public final synchronized int read(byte[] bArr, int i, int i2) {
        Throwable th;
        int i3 = i2;
        synchronized (this) {
            byte[] bArr2 = bArr;
            if (bArr != null) {
                int i4 = i;
                if (i >= 0 && i2 >= 0) {
                    int i5 = i2 + i;
                    int length = bArr.length;
                    if (i5 <= length) {
                        int i6 = this.A02;
                        int i7 = this.A00;
                        if (i6 == i7) {
                            return -1;
                        }
                        if (i6 + i2 > i7) {
                            i3 = i7 - i6;
                        }
                        SuperpackFile superpackFile = this.A05;
                        synchronized (superpackFile) {
                            try {
                                long j = superpackFile.mPtr;
                                if (j == 0) {
                                    throw new IllegalStateException();
                                } else if (bArr == null) {
                                    throw new NullPointerException();
                                } else if (i6 < 0 || i3 < 0) {
                                    throw new IndexOutOfBoundsException();
                                } else if (i + i3 > length) {
                                    throw new IndexOutOfBoundsException();
                                } else if (i6 + i3 <= superpackFile.mLength) {
                                    SuperpackFile.readBytesNative(j, i6, i3, bArr2, i4);
                                } else {
                                    throw new IndexOutOfBoundsException();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        this.A02 += i3;
                        return i3;
                    }
                }
                th = new IndexOutOfBoundsException();
            } else {
                th = new NullPointerException();
            }
            throw th;
        }
    }
}
