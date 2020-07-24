package p000X;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* renamed from: X.0Gb  reason: invalid class name and case insensitive filesystem */
public final class C04800Gb extends InputStream {
    public InputStream A00;
    public AnonymousClass0Fs A01;
    public int A02;
    public IOException A03 = null;
    public AnonymousClass0IR A04 = null;
    public C04770Fu A05;
    public boolean A06 = false;
    public final C037708k A07 = new C037708k();

    public C04800Gb(InputStream inputStream) {
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        A00(inputStream, -1, bArr);
    }

    public C04800Gb(InputStream inputStream, int i, byte[] bArr) {
        A00(inputStream, i, bArr);
    }

    private void A00(InputStream inputStream, int i, byte[] bArr) {
        C04770Fu r0;
        this.A00 = inputStream;
        this.A02 = i;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = AnonymousClass0GG.A01;
            int length = bArr2.length;
            if (i2 < length) {
                if (bArr[i2] == bArr2[i2]) {
                    i2++;
                } else {
                    throw new AnonymousClass097();
                }
            } else if (C038608u.A01(bArr, length, 2, length + 2)) {
                try {
                    int length2 = bArr2.length;
                    if (bArr[length2] == 0) {
                        byte b = bArr[length2 + 1];
                        if ((b & 255) < 16) {
                            AnonymousClass0Fs r02 = new AnonymousClass0Fs();
                            r02.A00 = b;
                            this.A01 = r02;
                            byte b2 = b;
                            if (b == 0) {
                                r0 = new AnonymousClass094();
                            } else if (b == 1) {
                                r0 = new AnonymousClass096();
                            } else if (b != 4) {
                                if (b == 10) {
                                    try {
                                        r0 = new AnonymousClass093();
                                    } catch (NoSuchAlgorithmException unused) {
                                    }
                                }
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Unsupported Check ID ");
                                stringBuffer.append(b2);
                                throw new AnonymousClass098(stringBuffer.toString());
                            } else {
                                r0 = new AnonymousClass095();
                            }
                            this.A05 = r0;
                            return;
                        }
                    }
                    throw new AnonymousClass098();
                } catch (AnonymousClass098 unused2) {
                    throw new AnonymousClass098("Unsupported options in XZ Stream Header");
                }
            } else {
                throw new AnonymousClass09D("XZ Stream Header is corrupt");
            }
        }
    }

    public final int available() {
        if (this.A00 != null) {
            IOException iOException = this.A03;
            if (iOException == null) {
                AnonymousClass0IR r0 = this.A04;
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
        InputStream inputStream = this.A00;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.A00 = null;
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

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c0, code lost:
        throw new p000X.AnonymousClass098();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c9, code lost:
        r0 = new p000X.AnonymousClass09D("XZ Stream Footer is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01cf, code lost:
        r0 = new p000X.AnonymousClass09D("XZ Stream Footer is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d5, code lost:
        r0 = new p000X.AnonymousClass09D("XZ Index is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        if (r4.A00 != r6.A00) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (r4.A03 != r6.A03) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        if (r4.A01 != r6.A01) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        if (java.util.Arrays.equals(r4.A00.A01(), r6.A00.A01()) == false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e1, code lost:
        r4 = new java.io.DataInputStream(r8);
        r0 = r6.A02;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e9, code lost:
        r3 = r3 + 1;
        r0 = r0 >> 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        if (r0 != 0) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f3, code lost:
        r2 = (int) (3 & (4 - ((((long) (r3 + 1)) + r6.A01) + 4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (r2 <= 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0108, code lost:
        if (r4.readUnsignedByte() != 0) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010a, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        r0 = new p000X.AnonymousClass09D("XZ Index is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0114, code lost:
        r10 = r9.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0119, code lost:
        if (r7 >= 4) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0129, code lost:
        if (((r10 >>> (r7 << 3)) & 255) != ((long) r4.readUnsignedByte())) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        r0 = new p000X.AnonymousClass09D("XZ Index is corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0135, code lost:
        r8 = new byte[12];
        new java.io.DataInputStream(r15.A00).readFully(r8);
        r1 = r8[10];
        r3 = p000X.AnonymousClass0GG.A00;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014e, code lost:
        if (r1 != r3[0]) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0157, code lost:
        if (r8[11] != r3[1]) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015f, code lost:
        if (p000X.C038608u.A01(r8, 4, 6, 0) == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0165, code lost:
        if (r8[8] != 0) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0167, code lost:
        r5 = r8[9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016f, code lost:
        if ((r5 & 255) >= 16) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0171, code lost:
        r6 = new p000X.AnonymousClass0Fs();
        r6.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r6.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017c, code lost:
        if (r7 >= 4) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017e, code lost:
        r6.A01 |= (long) ((r8[r7 + 4] & 255) << (r7 << 3));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0190, code lost:
        r3 = (r6.A01 + 1) * 4;
        r6.A01 = r3;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019d, code lost:
        if (r15.A01.A00 != r5) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a0, code lost:
        if (r0 == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        if (r15.A07.A00() != r3) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ac, code lost:
        r15.A06 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01af, code lost:
        if (r14 > 0) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b1, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ba, code lost:
        throw new p000X.AnonymousClass09D("XZ Stream Footer does not match Stream Header");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01c1 */
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        AnonymousClass09D r0;
        int i4 = i;
        int i5 = i2;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0) {
            byte[] bArr2 = bArr;
            if (i3 <= bArr2.length) {
                int i6 = 0;
                if (i2 != 0) {
                    if (this.A00 != null) {
                        IOException e = this.A03;
                        if (e == null) {
                            if (this.A06) {
                                return -1;
                            }
                            while (i5 > 0) {
                                if (this.A04 == null) {
                                    try {
                                        this.A04 = new AnonymousClass0IR(this.A00, this.A05, this.A02);
                                    } catch (AnonymousClass0HK unused) {
                                        C037708k r6 = this.A07;
                                        InputStream inputStream = this.A00;
                                        CRC32 crc32 = new CRC32();
                                        int i7 = 0;
                                        crc32.update(0);
                                        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
                                        if (C038608u.A00(checkedInputStream) == r6.A02) {
                                            C037708k r4 = new C037708k();
                                            long j = 0;
                                            while (true) {
                                                if (j >= r6.A02) {
                                                    break;
                                                }
                                                try {
                                                    r4.A01(C038608u.A00(checkedInputStream), C038608u.A00(checkedInputStream));
                                                    if (r4.A00 > r6.A00 || r4.A03 > r6.A03 || r4.A01 > r6.A01) {
                                                        r0 = new AnonymousClass09D("XZ Index is corrupt");
                                                    } else {
                                                        j++;
                                                    }
                                                } catch (AnonymousClass0G3 unused2) {
                                                    r0 = new AnonymousClass09D("XZ Index is corrupt");
                                                }
                                            }
                                            r0 = new AnonymousClass09D("XZ Index is corrupt");
                                        } else {
                                            r0 = new AnonymousClass09D("XZ Index is corrupt");
                                        }
                                        throw r0;
                                    } catch (IOException e2) {
                                        e = e2;
                                        this.A03 = e;
                                        if (i6 != 0) {
                                            return i6;
                                        }
                                    } catch (AnonymousClass098 ) {
                                        throw new AnonymousClass098("Unsupported options in XZ Stream Footer");
                                    }
                                }
                                int read = this.A04.read(bArr2, i4, i5);
                                if (read > 0) {
                                    i6 += read;
                                    i4 += read;
                                    i5 -= read;
                                } else if (read == -1) {
                                    C037708k r8 = this.A07;
                                    AnonymousClass0IR r9 = this.A04;
                                    r8.A01(((long) r9.A06) + r9.A08.A00 + ((long) r9.A09.A00), r9.A01);
                                    this.A04 = null;
                                }
                            }
                        }
                        throw e;
                    }
                    throw new AnonymousClass0G3("Stream closed");
                }
                return i6;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
