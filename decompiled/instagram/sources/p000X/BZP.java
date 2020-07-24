package p000X;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* renamed from: X.BZP */
public final class BZP extends Writer {
    public int A00;
    public int A01 = 0;
    public OutputStream A02;
    public byte[] A03;
    public final int A04;
    public final C13030hm A05;

    public static String A00(int i) {
        String hexString;
        String str;
        String str2;
        if (i > 1114111) {
            hexString = Integer.toHexString(i);
            str = ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i >= 55296) {
            if (i <= 56319) {
                str2 = "Unmatched first part of surrogate pair (0x";
            } else {
                str2 = "Unmatched second part of surrogate pair (0x";
            }
            return AnonymousClass000.A0J(str2, Integer.toHexString(i), ")");
        } else {
            hexString = Integer.toHexString(i);
            str = ") to output";
        }
        return AnonymousClass000.A0J("Illegal character point (0x", hexString, str);
    }

    public static void A01(int i) {
        throw new IOException(A00(i));
    }

    public final int A02(int i) {
        int i2 = this.A01;
        this.A01 = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + DexStore.LOAD_RESULT_PGO_ATTEMPTED + (i - 56320);
        }
        throw new IOException(AnonymousClass000.A0O("Broken surrogate pair: first char 0x", Integer.toHexString(i2), ", second 0x", Integer.toHexString(i), "; illegal combination"));
    }

    public final void close() {
        OutputStream outputStream = this.A02;
        if (outputStream != null) {
            int i = this.A00;
            if (i > 0) {
                outputStream.write(this.A03, 0, i);
                this.A00 = 0;
            }
            OutputStream outputStream2 = this.A02;
            this.A02 = null;
            byte[] bArr = this.A03;
            if (bArr != null) {
                this.A03 = null;
                this.A05.A03(bArr);
            }
            outputStream2.close();
            int i2 = this.A01;
            this.A01 = 0;
            if (i2 > 0) {
                A01(i2);
            }
        }
    }

    public final void flush() {
        OutputStream outputStream = this.A02;
        if (outputStream != null) {
            int i = this.A00;
            if (i > 0) {
                outputStream.write(this.A03, 0, i);
                this.A00 = 0;
            }
            this.A02.flush();
        }
    }

    public BZP(C13030hm r4, OutputStream outputStream) {
        this.A05 = r4;
        this.A02 = outputStream;
        C13030hm.A00(r4.A01);
        byte[] A002 = r4.A05.A00(Constants.ONE);
        r4.A01 = A002;
        this.A03 = A002;
        this.A04 = A002.length - 4;
        this.A00 = 0;
    }

    public final Writer append(char c) {
        write((int) c);
        return this;
    }

    public final void write(int i) {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        if (this.A01 > 0) {
            i = A02(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                A01(i);
            }
            this.A01 = i;
            return;
        }
        int i5 = this.A00;
        if (i5 >= this.A04) {
            this.A02.write(this.A03, 0, i5);
            this.A00 = 0;
        }
        if (i < 128) {
            byte[] bArr2 = this.A03;
            int i6 = this.A00;
            this.A00 = i6 + 1;
            bArr2[i6] = (byte) i;
            return;
        }
        int i7 = this.A00;
        if (i < 2048) {
            bArr = this.A03;
            i2 = i7 + 1;
            i3 = (i >> 6) | 192;
        } else if (i <= 65535) {
            byte[] bArr3 = this.A03;
            int i8 = i7 + 1;
            bArr3[i7] = (byte) ((i >> 12) | 224);
            int i9 = i8 + 1;
            bArr3[i8] = (byte) (((i >> 6) & 63) | 128);
            i4 = i9 + 1;
            bArr3[i9] = (byte) ((i & 63) | 128);
            this.A00 = i4;
        } else {
            if (i > 1114111) {
                A01(i);
            }
            bArr = this.A03;
            int i10 = i7 + 1;
            bArr[i7] = (byte) ((i >> 18) | 240);
            i7 = i10 + 1;
            bArr[i10] = (byte) (((i >> 12) & 63) | 128);
            i2 = i7 + 1;
            i3 = ((i >> 6) & 63) | 128;
        }
        bArr[i7] = (byte) i3;
        i4 = i2 + 1;
        bArr[i2] = (byte) ((i & 63) | 128);
        this.A00 = i4;
    }

    public final void write(String str) {
        write(str, 0, str.length());
    }

    public final void write(String str, int i, int i2) {
        int i3;
        if (i2 >= 2) {
            if (this.A01 > 0) {
                i2--;
                write(A02(str.charAt(i)));
                i++;
            }
            int i4 = this.A00;
            byte[] bArr = this.A03;
            int i5 = this.A04;
            int i6 = i2 + r11;
            while (r11 < i6) {
                if (i4 >= i5) {
                    this.A02.write(bArr, 0, i4);
                    i4 = 0;
                }
                int i7 = r11 + 1;
                char charAt = str.charAt(r11);
                if (charAt < 128) {
                    int i8 = i4 + 1;
                    bArr[i4] = (byte) charAt;
                    int i9 = i6 - i7;
                    int i10 = i5 - i8;
                    if (i9 > i10) {
                        i9 = i10;
                    }
                    int i11 = i9 + i7;
                    while (true) {
                        r11 = i7;
                        i4 = i8;
                        if (i7 >= i11) {
                            continue;
                            break;
                        }
                        i7++;
                        charAt = str.charAt(r11);
                        if (charAt >= 128) {
                            break;
                        }
                        i8++;
                        bArr[i4] = (byte) charAt;
                    }
                }
                if (charAt >= 2048) {
                    if (charAt >= 55296 && charAt <= 57343) {
                        if (charAt > 56319) {
                            this.A00 = i4;
                            A01(charAt);
                        }
                        this.A01 = charAt;
                        if (i7 >= i6) {
                            break;
                        }
                        r11 = i7 + 1;
                        int A022 = A02(str.charAt(i7));
                        if (A022 > 1114111) {
                            this.A00 = i4;
                            A01(A022);
                        }
                        int i12 = i4 + 1;
                        bArr[i4] = (byte) ((A022 >> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((A022 >> 12) & 63) | 128);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((A022 >> 6) & 63) | 128);
                        i4 = i14 + 1;
                        bArr[i14] = (byte) ((A022 & 63) | 128);
                    } else {
                        int i15 = i4 + 1;
                        bArr[i4] = (byte) ((charAt >> 12) | 224);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) (((charAt >> 6) & 63) | 128);
                    }
                } else {
                    i3 = i4 + 1;
                    bArr[i4] = (byte) ((charAt >> 6) | 192);
                }
                i4 = i3 + 1;
                bArr[i3] = (byte) ((charAt & '?') | 128);
                r11 = i7;
            }
            this.A00 = i4;
        } else if (i2 == 1) {
            write((int) str.charAt(i));
        }
    }

    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public final void write(char[] cArr, int i, int i2) {
        int i3;
        if (i2 >= 2) {
            if (this.A01 > 0) {
                i2--;
                write(A02(cArr[i]));
                i++;
            }
            int i4 = this.A00;
            byte[] bArr = this.A03;
            int i5 = this.A04;
            int i6 = i2 + r11;
            while (r11 < i6) {
                if (i4 >= i5) {
                    this.A02.write(bArr, 0, i4);
                    i4 = 0;
                }
                int i7 = r11 + 1;
                char c = cArr[r11];
                if (c < 128) {
                    int i8 = i4 + 1;
                    bArr[i4] = (byte) c;
                    int i9 = i6 - i7;
                    int i10 = i5 - i8;
                    if (i9 > i10) {
                        i9 = i10;
                    }
                    int i11 = i9 + i7;
                    while (true) {
                        r11 = i7;
                        i4 = i8;
                        if (i7 >= i11) {
                            continue;
                            break;
                        }
                        i7++;
                        c = cArr[r11];
                        if (c >= 128) {
                            break;
                        }
                        i8++;
                        bArr[i4] = (byte) c;
                    }
                }
                if (c >= 2048) {
                    if (c >= 55296 && c <= 57343) {
                        if (c > 56319) {
                            this.A00 = i4;
                            A01(c);
                        }
                        this.A01 = c;
                        if (i7 >= i6) {
                            break;
                        }
                        r11 = i7 + 1;
                        int A022 = A02(cArr[i7]);
                        if (A022 > 1114111) {
                            this.A00 = i4;
                            A01(A022);
                        }
                        int i12 = i4 + 1;
                        bArr[i4] = (byte) ((A022 >> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((A022 >> 12) & 63) | 128);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((A022 >> 6) & 63) | 128);
                        i4 = i14 + 1;
                        bArr[i14] = (byte) ((A022 & 63) | 128);
                    } else {
                        int i15 = i4 + 1;
                        bArr[i4] = (byte) ((c >> 12) | 224);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) (((c >> 6) & 63) | 128);
                    }
                } else {
                    i3 = i4 + 1;
                    bArr[i4] = (byte) ((c >> 6) | 192);
                }
                i4 = i3 + 1;
                bArr[i3] = (byte) ((c & '?') | 128);
                r11 = i7;
            }
            this.A00 = i4;
        } else if (i2 == 1) {
            write((int) cArr[i]);
        }
    }
}
