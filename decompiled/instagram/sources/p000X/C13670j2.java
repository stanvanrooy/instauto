package p000X;

import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: X.0j2  reason: invalid class name and case insensitive filesystem */
public final class C13670j2 {
    public int A00 = 0;
    public int A01;
    public int A02;
    public boolean A03 = true;
    public final C13030hm A04;
    public final InputStream A05;
    public final byte[] A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r1 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018f, code lost:
        return new p000X.C13050ho(r11, r7, r10, r9, r27.A00(r2, r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016c  */
    public final C13080hr A00(int i, C3U c3u, C13000hj r26, C12980hh r27, boolean z, boolean z2) {
        boolean z3;
        Integer num;
        int intValue;
        Reader reader;
        boolean z4;
        int i2;
        String str;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (!A01(4)) {
            if (A01(2)) {
                byte[] bArr = this.A06;
                int i4 = this.A02;
                byte b = (bArr[i4 + 1] & 255) | ((bArr[i4] & 255) << 8);
                if ((65280 & b) != 0) {
                    if ((b & 255) == 0) {
                        this.A03 = false;
                    }
                    z3 = false;
                }
                this.A03 = true;
            }
            if (!z7 || (i2 = this.A00) == 1) {
            }
            C13030hm r11 = this.A04;
            Integer num2 = num;
            C3U c3u2 = c3u;
            int i5 = i;
            boolean z8 = z2;
            boolean z9 = z;
            if (num == Constants.ZERO) {
            }
            intValue = num.intValue();
            switch (intValue) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    break;
            }
        } else {
            byte[] bArr2 = this.A06;
            int i6 = this.A02;
            int i7 = i6 + 3;
            byte b2 = (bArr2[i7] & 255) | (bArr2[i6] << 24) | ((bArr2[i6 + 1] & 255) << 16) | ((bArr2[i6 + 2] & 255) << 8);
            if (b2 != -16842752) {
                int i8 = 4;
                if (b2 == -131072) {
                    i3 = i6 + 4;
                    this.A02 = i3;
                    this.A00 = i8;
                    this.A03 = false;
                    z5 = true;
                } else if (b2 != 65279) {
                    if (b2 != 65534) {
                        int i9 = b2 >>> 16;
                        i8 = 2;
                        if (i9 == 65279) {
                            this.A02 = i6 + 2;
                            this.A00 = 2;
                        } else {
                            i3 = i6 + 2;
                            if (i9 != 65534) {
                                if ((b2 >>> 8) == 15711167) {
                                    this.A02 = i7;
                                    this.A00 = 1;
                                } else {
                                    z5 = false;
                                }
                            }
                            this.A02 = i3;
                            this.A00 = i8;
                            this.A03 = false;
                            z5 = true;
                        }
                        this.A03 = true;
                        z5 = true;
                    }
                    str = "2143";
                    throw new CharConversionException(AnonymousClass000.A0J("Unsupported UCS-4 endianness (", str, ") detected"));
                } else {
                    this.A03 = true;
                    this.A02 = i6 + 4;
                    this.A00 = 4;
                    z5 = true;
                }
                if (!z5) {
                    if ((b2 >> 8) == 0) {
                        this.A03 = true;
                    } else if ((16777215 & b2) == 0) {
                        this.A03 = false;
                    } else if ((-16711681 & b2) != 0) {
                        if ((-65281 & b2) != 0) {
                            z6 = false;
                            if (!z6) {
                                int i10 = b2 >>> 16;
                                if ((65280 & i10) != 0) {
                                    if ((i10 & 255) == 0) {
                                        this.A03 = false;
                                    }
                                    z3 = false;
                                }
                                this.A03 = true;
                            }
                        }
                        str = "2143";
                        throw new CharConversionException(AnonymousClass000.A0J("Unsupported UCS-4 endianness (", str, ") detected"));
                    }
                    this.A00 = 4;
                    z6 = true;
                    if (!z6) {
                    }
                }
                z7 = true;
                if (!z7 || (i2 = this.A00) == 1) {
                    num = Constants.ZERO;
                } else if (i2 != 2) {
                    if (i2 == 4) {
                        if (this.A03) {
                            num = Constants.A0N;
                        } else {
                            num = Constants.A0Y;
                        }
                    }
                    throw new RuntimeException("Internal error");
                } else if (this.A03) {
                    num = Constants.ONE;
                } else {
                    num = Constants.A0C;
                }
                C13030hm r112 = this.A04;
                Integer num22 = num;
                C3U c3u22 = c3u;
                int i52 = i;
                boolean z82 = z2;
                boolean z92 = z;
                if (num == Constants.ZERO || !z) {
                    intValue = num.intValue();
                    switch (intValue) {
                        case 0:
                        case 1:
                        case 2:
                            InputStream inputStream = this.A05;
                            if (inputStream == null) {
                                inputStream = new ByteArrayInputStream(this.A06, this.A02, this.A01);
                            } else {
                                int i11 = this.A02;
                                int i12 = this.A01;
                                if (i11 < i12) {
                                    inputStream = new C29361CwU(r112, inputStream, this.A06, i11, i12);
                                }
                            }
                            reader = new InputStreamReader(inputStream, C206058rv.A00(num22));
                            break;
                        case 3:
                        case 4:
                            InputStream inputStream2 = this.A05;
                            byte[] bArr3 = this.A06;
                            int i13 = this.A02;
                            int i14 = this.A01;
                            switch (intValue) {
                                case 1:
                                case 3:
                                    z4 = true;
                                    break;
                                default:
                                    z4 = false;
                                    break;
                            }
                            reader = new BZU(r112, inputStream2, bArr3, i13, i14, z4);
                            break;
                    }
                } else {
                    C13000hj r5 = r26;
                    C13000hj r4 = new C13000hj(r5, z82, r5.A0B, (C13010hk) r5.A0D.get());
                    return new C13130hw(this.A04, i52, this.A05, c3u22, r4, this.A06, this.A02, this.A01, this.A07);
                }
            }
            str = "3412";
            throw new CharConversionException(AnonymousClass000.A0J("Unsupported UCS-4 endianness (", str, ") detected"));
        }
        this.A00 = 2;
        z3 = true;
    }

    public final boolean A01(int i) {
        int read;
        int i2 = this.A01 - this.A02;
        while (i2 < i) {
            InputStream inputStream = this.A05;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this.A06;
                int i3 = this.A01;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read < 1) {
                return false;
            }
            this.A01 += read;
            i2 += read;
        }
        return true;
    }

    public C13670j2(C13030hm r5, InputStream inputStream) {
        this.A04 = r5;
        this.A05 = inputStream;
        C13030hm.A00(r5.A00);
        byte[] A002 = r5.A05.A00(Constants.ZERO);
        r5.A00 = A002;
        this.A06 = A002;
        this.A02 = 0;
        this.A01 = 0;
        this.A07 = true;
    }

    public C13670j2(C13030hm r3, byte[] bArr, int i) {
        this.A04 = r3;
        this.A05 = null;
        this.A06 = bArr;
        this.A02 = 0;
        this.A01 = i + 0;
        this.A07 = false;
    }
}
