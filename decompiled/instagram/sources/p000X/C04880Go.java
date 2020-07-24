package p000X;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Go  reason: invalid class name and case insensitive filesystem */
public final class C04880Go extends InputStream {
    public int A00 = 0;
    public DataInputStream A01;
    public IOException A02 = null;
    public AnonymousClass08e A03;
    public boolean A04 = false;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public final AnonymousClass0F2 A08;
    public final C037208d A09 = new C037208d();

    public C04880Go(InputStream inputStream, int i) {
        if (inputStream != null) {
            this.A01 = new DataInputStream(inputStream);
            this.A08 = new AnonymousClass0F2(A00(i));
            return;
        }
        throw null;
    }

    public static int A00(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & -16;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported dictionary size ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final int available() {
        if (this.A01 != null) {
            IOException iOException = this.A02;
            if (iOException == null) {
                return this.A00;
            }
            throw iOException;
        }
        throw new AnonymousClass0G3("Stream closed");
    }

    public final void close() {
        DataInputStream dataInputStream = this.A01;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
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

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0351, code lost:
        if (r6.A00 != 0) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0391, code lost:
        r0 = new p000X.AnonymousClass09D();
     */
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        AnonymousClass09D r0;
        int i4;
        int i5;
        int length;
        boolean z;
        int i6 = i;
        int i7 = i2;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0) {
            byte[] bArr2 = bArr;
            if (i3 <= bArr2.length) {
                int i8 = 0;
                if (i2 != 0) {
                    if (this.A01 != null) {
                        IOException iOException = this.A02;
                        if (iOException != null) {
                            throw iOException;
                        } else if (this.A04) {
                            return -1;
                        } else {
                            while (true) {
                                if (i7 <= 0) {
                                    break;
                                }
                                try {
                                    if (this.A00 == 0) {
                                        int readUnsignedByte = this.A01.readUnsignedByte();
                                        if (readUnsignedByte != 0) {
                                            if (readUnsignedByte < 224 && readUnsignedByte != 1) {
                                                if (this.A06) {
                                                    r0 = new AnonymousClass09D();
                                                    break;
                                                }
                                            } else {
                                                this.A07 = true;
                                                this.A06 = false;
                                                AnonymousClass0F2 r1 = this.A08;
                                                r1.A05 = 0;
                                                r1.A04 = 0;
                                                r1.A00 = 0;
                                                r1.A01 = 0;
                                                byte[] bArr3 = r1.A06;
                                                bArr3[bArr3.length - 1] = 0;
                                            }
                                            if (readUnsignedByte < 128) {
                                                if (readUnsignedByte > 2) {
                                                    r0 = new AnonymousClass09D();
                                                    break;
                                                }
                                                this.A05 = false;
                                                this.A00 = this.A01.readUnsignedShort() + 1;
                                            } else {
                                                this.A05 = true;
                                                int i9 = (readUnsignedByte & 31) << 16;
                                                this.A00 = i9;
                                                this.A00 = i9 + this.A01.readUnsignedShort() + 1;
                                                int readUnsignedShort = this.A01.readUnsignedShort() + 1;
                                                if (readUnsignedByte < 192) {
                                                    if (this.A07) {
                                                        r0 = new AnonymousClass09D();
                                                        break;
                                                    } else if (readUnsignedByte >= 160) {
                                                        this.A03.A00();
                                                    }
                                                } else {
                                                    this.A07 = false;
                                                    int readUnsignedByte2 = this.A01.readUnsignedByte();
                                                    if (readUnsignedByte2 > 224) {
                                                        r0 = new AnonymousClass09D();
                                                        break;
                                                    }
                                                    int i10 = readUnsignedByte2 / 45;
                                                    int i11 = readUnsignedByte2 - ((i10 * 9) * 5);
                                                    int i12 = i11 / 9;
                                                    int i13 = i11 - (i12 * 9);
                                                    if (i13 + i12 > 4) {
                                                        r0 = new AnonymousClass09D();
                                                        break;
                                                    }
                                                    this.A03 = new AnonymousClass08e(this.A08, this.A09, i13, i12, i10);
                                                }
                                                C037208d r9 = this.A09;
                                                DataInputStream dataInputStream = this.A01;
                                                if (readUnsignedShort >= 5) {
                                                    if (dataInputStream.readUnsignedByte() != 0) {
                                                        r0 = new AnonymousClass09D();
                                                        break;
                                                    }
                                                    r9.A00 = dataInputStream.readInt();
                                                    r9.A03 = -1;
                                                    r9.A02 = 0;
                                                    int i14 = readUnsignedShort - 5;
                                                    r9.A01 = i14;
                                                    dataInputStream.readFully(r9.A04, 0, i14);
                                                } else {
                                                    r0 = new AnonymousClass09D();
                                                    break;
                                                }
                                            }
                                        } else {
                                            this.A04 = true;
                                        }
                                        if (this.A04) {
                                            if (i8 == 0) {
                                                return -1;
                                            }
                                        }
                                    }
                                    int min = Math.min(this.A00, i7);
                                    if (this.A05) {
                                        AnonymousClass0F2 r7 = this.A08;
                                        int length2 = r7.A06.length;
                                        int i15 = r7.A04;
                                        if (length2 - i15 <= min) {
                                            r7.A01 = length2;
                                        } else {
                                            r7.A01 = i15 + min;
                                        }
                                        AnonymousClass08e r8 = this.A03;
                                        AnonymousClass0F2 r72 = r8.A00;
                                        int i16 = r72.A03;
                                        if (i16 > 0) {
                                            r72.A00(r72.A02, i16);
                                        }
                                        while (true) {
                                            int i17 = r72.A04;
                                            boolean z2 = false;
                                            if (i17 < r72.A01) {
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                break;
                                            }
                                            int i18 = i17 & r8.A00;
                                            C037208d r12 = r8.A04;
                                            short[][] sArr = r8.A0A;
                                            C04490Ee r11 = r8.A01;
                                            int i19 = r11.A00;
                                            if (r12.A00(sArr[i19], i18) == 0) {
                                                AnonymousClass08f r10 = r8.A03;
                                                AnonymousClass0F2 r112 = r10.A01.A00;
                                                int i20 = r112.A04;
                                                int i21 = (i20 - 0) - 1;
                                                if (0 >= i20) {
                                                    i21 += r112.A06.length;
                                                }
                                                int i22 = r10.A00;
                                                C037508i r13 = r10.A00[((r112.A06[i21] & 255) >> (8 - i22)) + ((i20 & r10.A01) << i22)];
                                                AnonymousClass08e r122 = r13.A00.A01;
                                                C04490Ee r113 = r122.A01;
                                                boolean z3 = false;
                                                if (r113.A00 < 7) {
                                                    z3 = true;
                                                }
                                                int i23 = 1;
                                                if (!z3) {
                                                    AnonymousClass0F2 r92 = r122.A00;
                                                    int i24 = r122.A02[0];
                                                    int i25 = r92.A04;
                                                    int i26 = (i25 - i24) - 1;
                                                    if (i24 >= i25) {
                                                        i26 += r92.A06.length;
                                                    }
                                                    int i27 = r92.A06[i26] & 255;
                                                    int i28 = 256;
                                                    int i29 = 1;
                                                    do {
                                                        i27 <<= 1;
                                                        int i30 = i27 & i28;
                                                        int A002 = r122.A04.A00(r13.A00, i28 + i30 + i29);
                                                        i29 = (i29 << 1) | A002;
                                                        i28 &= (i30 ^ -1) ^ (0 - A002);
                                                    } while (i29 < 256);
                                                    i23 = i29;
                                                } else {
                                                    do {
                                                        i23 = r122.A04.A00(r13.A00, i23) | (i23 << 1);
                                                    } while (i23 < 256);
                                                }
                                                AnonymousClass0F2 r102 = r122.A00;
                                                byte b = (byte) i23;
                                                byte[] bArr4 = r102.A06;
                                                int i31 = r102.A04;
                                                int i32 = i31 + 1;
                                                r102.A04 = i32;
                                                bArr4[i31] = b;
                                                if (r102.A00 < i32) {
                                                    r102.A00 = i32;
                                                }
                                                int i33 = r113.A00;
                                                r113.A00 = i33 <= 3 ? 0 : i33 <= 9 ? i33 - 3 : i33 - 6;
                                            } else {
                                                if (r12.A00(r8.A04, i19) == 0) {
                                                    int i34 = 7;
                                                    if (i19 >= 7) {
                                                        i34 = 10;
                                                    }
                                                    r11.A00 = i34;
                                                    int[] iArr = r8.A02;
                                                    iArr[3] = iArr[2];
                                                    iArr[2] = iArr[1];
                                                    iArr[1] = iArr[0];
                                                    i4 = r8.A01.A01(i18);
                                                    short[][] sArr2 = r8.A08;
                                                    int i35 = 3;
                                                    if (i4 < 6) {
                                                        i35 = i4 - 2;
                                                    }
                                                    short[] sArr3 = sArr2[i35];
                                                    int i36 = 1;
                                                    do {
                                                        i36 = r12.A00(sArr3, i36) | (i36 << 1);
                                                        length = sArr3.length;
                                                    } while (i36 < length);
                                                    int i37 = i36 - length;
                                                    if (i37 < 4) {
                                                        iArr[0] = i37;
                                                    } else {
                                                        int i38 = (i37 >> 1) - 1;
                                                        int i39 = (2 | (i37 & 1)) << i38;
                                                        iArr[0] = i39;
                                                        if (i37 < 14) {
                                                            short[] sArr4 = r8.A09[i37 - 4];
                                                            int i40 = 1;
                                                            int i41 = 0;
                                                            int i42 = 0;
                                                            while (true) {
                                                                int A003 = r12.A00(sArr4, i40);
                                                                i40 = (i40 << 1) | A003;
                                                                int i43 = i42 + 1;
                                                                i41 |= A003 << i42;
                                                                if (i40 >= sArr4.length) {
                                                                    break;
                                                                }
                                                                i42 = i43;
                                                            }
                                                            iArr[0] = i41 | i39;
                                                        } else {
                                                            int i44 = i38 - 4;
                                                            int i45 = 0;
                                                            do {
                                                                r12.A01();
                                                                int i46 = r12.A03 >>> 1;
                                                                r12.A03 = i46;
                                                                int i47 = r12.A00;
                                                                int i48 = (i47 - i46) >>> 31;
                                                                r12.A00 = i47 - (i46 & (i48 - 1));
                                                                i45 = (i45 << 1) | (1 - i48);
                                                                i44--;
                                                            } while (i44 != 0);
                                                            int i49 = (i45 << 4) | i39;
                                                            iArr[0] = i49;
                                                            short[] sArr5 = r8.A03;
                                                            int i50 = 1;
                                                            int i51 = 0;
                                                            int i52 = 0;
                                                            while (true) {
                                                                int A004 = r12.A00(sArr5, i50);
                                                                i50 = (i50 << 1) | A004;
                                                                int i53 = i52 + 1;
                                                                i51 |= A004 << i52;
                                                                if (i50 >= sArr5.length) {
                                                                    break;
                                                                }
                                                                i52 = i53;
                                                            }
                                                            iArr[0] = i49 | i51;
                                                        }
                                                    }
                                                } else {
                                                    if (r12.A00(r8.A05, i19) != 0) {
                                                        if (r12.A00(r8.A06, i19) == 0) {
                                                            i5 = r8.A02[1];
                                                        } else {
                                                            if (r12.A00(r8.A07, i19) == 0) {
                                                                i5 = r8.A02[2];
                                                            } else {
                                                                int[] iArr2 = r8.A02;
                                                                i5 = iArr2[3];
                                                                iArr2[3] = iArr2[2];
                                                            }
                                                            int[] iArr3 = r8.A02;
                                                            iArr3[2] = iArr3[1];
                                                        }
                                                        int[] iArr4 = r8.A02;
                                                        iArr4[1] = iArr4[0];
                                                        iArr4[0] = i5;
                                                    } else if (r12.A00(r8.A0B[i19], i18) == 0) {
                                                        int i54 = 11;
                                                        if (i19 < 7) {
                                                            i54 = 9;
                                                        }
                                                        r11.A00 = i54;
                                                        i4 = 1;
                                                    }
                                                    int i55 = 11;
                                                    if (i19 < 7) {
                                                        i55 = 8;
                                                    }
                                                    r11.A00 = i55;
                                                    i4 = r8.A02.A01(i18);
                                                }
                                                r72.A00(r8.A02[0], i4);
                                            }
                                        }
                                        C037208d r02 = r8.A04;
                                        r02.A01();
                                        int i56 = r02.A02;
                                        int i57 = r02.A01;
                                        boolean z4 = false;
                                        if (i56 <= i57) {
                                            z4 = true;
                                        }
                                        if (!z4) {
                                            r0 = new AnonymousClass09D();
                                            break;
                                        }
                                    } else {
                                        AnonymousClass0F2 r82 = this.A08;
                                        DataInputStream dataInputStream2 = this.A01;
                                        byte[] bArr5 = r82.A06;
                                        int length3 = bArr5.length;
                                        int i58 = r82.A04;
                                        int min2 = Math.min(length3 - i58, min);
                                        dataInputStream2.readFully(bArr5, i58, min2);
                                        int i59 = r82.A04 + min2;
                                        r82.A04 = i59;
                                        if (r82.A00 < i59) {
                                            r82.A00 = i59;
                                        }
                                    }
                                    AnonymousClass0F2 r93 = this.A08;
                                    int i60 = r93.A04;
                                    int i61 = r93.A05;
                                    int i62 = i60 - i61;
                                    byte[] bArr6 = r93.A06;
                                    if (i60 == bArr6.length) {
                                        r93.A04 = 0;
                                    }
                                    System.arraycopy(bArr6, i61, bArr2, i6, i62);
                                    r93.A05 = r93.A04;
                                    i6 += i62;
                                    i7 -= i62;
                                    i8 += i62;
                                    int i63 = this.A00 - i62;
                                    this.A00 = i63;
                                    if (i63 == 0) {
                                        C037208d r6 = this.A09;
                                        if (r6.A02 == r6.A01) {
                                            z = true;
                                        }
                                        z = false;
                                        if (!z) {
                                            break;
                                        }
                                        boolean z5 = false;
                                        if (this.A08.A03 > 0) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            break;
                                        }
                                    }
                                } catch (IOException e) {
                                    this.A02 = e;
                                    throw e;
                                }
                            }
                            throw r0;
                        }
                    } else {
                        throw new AnonymousClass0G3("Stream closed");
                    }
                }
                return i8;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
