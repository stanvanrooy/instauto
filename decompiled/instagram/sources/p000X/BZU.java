package p000X;

import com.facebook.common.dextricks.DexStore;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.BZU */
public final class BZU extends BZV {
    public int A00 = 0;
    public int A01 = 0;
    public char A02 = 0;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0189 A[SYNTHETIC] */
    public final int read(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        boolean z;
        int read;
        byte[] bArr;
        int read2;
        byte[] bArr2;
        byte[] bArr3 = this.A03;
        if (bArr3 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || (i3 = i + i2) > cArr.length) {
            throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
        }
        char c = this.A02;
        if (c != 0) {
            i4 = i + 1;
            cArr[i] = c;
            this.A02 = 0;
        } else {
            int i8 = this.A00;
            int i9 = this.A01;
            int i10 = i8 - i9;
            if (i10 < 4) {
                this.A00 += i8 - i10;
                if (i10 > 0) {
                    if (i9 > 0) {
                        for (int i11 = 0; i11 < i10; i11++) {
                            bArr3[i11] = bArr3[i9 + i11];
                        }
                        this.A01 = 0;
                    }
                    this.A00 = i10;
                    while (true) {
                        i7 = this.A00;
                        if (i7 < 4) {
                            z = true;
                            break;
                        }
                        InputStream inputStream = this.A02;
                        if (inputStream == null) {
                            read = -1;
                        } else {
                            byte[] bArr4 = this.A03;
                            read = inputStream.read(bArr4, i7, bArr4.length - i7);
                        }
                        if (read >= 1) {
                            this.A00 += read;
                        } else if (read < 0) {
                            if (this.A03 && (bArr = this.A03) != null) {
                                this.A03 = null;
                                this.A05.A02(bArr);
                            }
                            int i12 = this.A00;
                            throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i12 + ", needed " + 4 + ", at char #" + this.A01 + ", byte #" + (this.A00 + i12) + ")");
                        }
                    }
                    throw new IOException("Strange I/O stream, returned 0 bytes on read");
                }
                this.A01 = 0;
                InputStream inputStream2 = this.A02;
                if (inputStream2 == null) {
                    read2 = -1;
                } else {
                    read2 = inputStream2.read(bArr3);
                }
                if (read2 < 1) {
                    this.A00 = 0;
                    if (read2 < 0) {
                        if (this.A03 && (bArr2 = this.A03) != null) {
                            this.A03 = null;
                            this.A05.A02(bArr2);
                        }
                        z = false;
                    }
                    throw new IOException("Strange I/O stream, returned 0 bytes on read");
                }
                this.A00 = read2;
                while (true) {
                    i7 = this.A00;
                    if (i7 < 4) {
                    }
                    this.A00 += read;
                }
                throw new IOException("Strange I/O stream, returned 0 bytes on read");
                if (!z) {
                    return -1;
                }
            }
            i4 = i;
        }
        while (true) {
            if (i4 >= i3) {
                i5 = i4;
                break;
            }
            int i13 = this.A01;
            if (this.A04) {
                byte[] bArr5 = this.A03;
                b = (bArr5[i13] << 24) | ((bArr5[i13 + 1] & 255) << 16) | ((bArr5[i13 + 2] & 255) << 8);
                i6 = bArr5[i13 + 3] & 255;
            } else {
                byte[] bArr6 = this.A03;
                b = (bArr6[i13] & 255) | ((bArr6[i13 + 1] & 255) << 8) | ((bArr6[i13 + 2] & 255) << 16);
                i6 = bArr6[i13 + 3] << 24;
            }
            byte b2 = i6 | b;
            int i14 = i13 + 4;
            this.A01 = i14;
            if (b2 > 65535) {
                if (b2 > 1114111) {
                    String A0J = AnonymousClass000.A0J("(above ", Integer.toHexString(1114111), ") ");
                    int i15 = (this.A00 + i14) - 1;
                    int i16 = this.A01;
                    throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(b2) + A0J + " at char #" + (i16 + (i4 - i)) + ", byte #" + i15 + ")");
                }
                int i17 = b2 - DexStore.LOAD_RESULT_PGO_ATTEMPTED;
                i5 = i4 + 1;
                cArr[i4] = (char) ((i17 >> 10) + 55296);
                b2 = (i17 & 1023) | 56320;
                if (i5 >= i3) {
                    this.A02 = (char) b2;
                    break;
                }
                i4 = i5;
            }
            i5 = i4 + 1;
            cArr[i4] = (char) b2;
            if (i14 >= this.A00) {
                break;
            }
            i4 = i5;
        }
        int i18 = i5 - i;
        this.A01 += i18;
        return i18;
    }

    public BZU(C13030hm r2, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(r2, inputStream, bArr, i, i2);
        boolean z2 = false;
        this.A04 = z;
        this.A03 = inputStream != null ? true : z2;
    }
}
