package p000X;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Fy  reason: invalid class name and case insensitive filesystem */
public final class C04780Fy extends InputStream {
    public IOException A00 = null;
    public InputStream A01;
    public C04800Gb A02;
    public boolean A03 = false;
    public final int A04;

    public C04780Fy(InputStream inputStream) {
        this.A01 = inputStream;
        this.A04 = -1;
        this.A02 = new C04800Gb(inputStream);
    }

    public final int available() {
        if (this.A01 != null) {
            IOException iOException = this.A00;
            if (iOException == null) {
                C04800Gb r0 = this.A02;
                if (r0 == null) {
                    return 0;
                }
                return r0.available();
            }
            throw iOException;
        }
        throw new AnonymousClass0G3("Stream closed");
    }

    public final void close() {
        InputStream inputStream = this.A01;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A01 = null;
            }
        }
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003d A[Catch:{ 097 -> 0x007a, IOException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0036 A[SYNTHETIC] */
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 != 0) {
            if (this.A01 != null) {
                IOException e = this.A00;
                if (e == null) {
                    if (!this.A03) {
                        while (true) {
                            if (i2 <= 0) {
                                break;
                            }
                            try {
                                if (this.A02 == null) {
                                    DataInputStream dataInputStream = new DataInputStream(this.A01);
                                    byte[] bArr2 = new byte[12];
                                    while (true) {
                                        if (dataInputStream.read(bArr2, 0, 1) != -1) {
                                            this.A03 = true;
                                            break;
                                        }
                                        dataInputStream.readFully(bArr2, 1, 3);
                                        if (!(bArr2[0] == 0 && bArr2[1] == 0 && bArr2[2] == 0 && bArr2[3] == 0)) {
                                            dataInputStream.readFully(bArr2, 4, 8);
                                        }
                                        if (dataInputStream.read(bArr2, 0, 1) != -1) {
                                        }
                                    }
                                    dataInputStream.readFully(bArr2, 4, 8);
                                    this.A02 = new C04800Gb(this.A01, this.A04, bArr2);
                                    if (this.A03) {
                                        if (i4 == 0) {
                                            return -1;
                                        }
                                    }
                                }
                                int read = this.A02.read(bArr, i, i2);
                                if (read > 0) {
                                    i4 += read;
                                    i += read;
                                    i2 -= read;
                                } else if (read == -1) {
                                    this.A02 = null;
                                }
                            } catch (AnonymousClass097 unused) {
                                throw new AnonymousClass09D("Garbage after a valid XZ Stream");
                            } catch (IOException e2) {
                                e = e2;
                                this.A00 = e;
                                if (i4 != 0) {
                                    return i4;
                                }
                            }
                        }
                    } else {
                        return -1;
                    }
                }
                throw e;
            }
            throw new AnonymousClass0G3("Stream closed");
        }
        return i4;
    }
}
