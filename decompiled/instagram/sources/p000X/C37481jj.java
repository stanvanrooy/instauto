package p000X;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: X.1jj  reason: invalid class name and case insensitive filesystem */
public final class C37481jj {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;

    /* JADX WARNING: Can't wrap try/catch for region: R(8:18|19|20|(5:24|(5:26|(5:28|(2:30|(2:32|(1:(4:35|(4:38|(2:40|116)(2:41|(2:43|117)(1:115))|113|36)|114|73)(2:107|79)))(1:(1:(5:46|(3:50|(1:52)|53)|54|(1:60)(1:67)|(4:62|78|106|79)))))(1:(2:108|79))|69|109|79)(2:70|(1:72))|74|110|79)(1:(3:76|111|79))|77|112|79)|80|81|(1:86)(1:85)|(3:87|88|89)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x00d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x00e5 */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00da A[Catch:{ IOException -> 0x00e5, all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00db A[Catch:{ IOException -> 0x00e5, all -> 0x00e0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:94:0x00e5=Splitter:B:94:0x00e5, B:87:0x00dc=Splitter:B:87:0x00dc} */
    public final boolean A00(C35441gN r18) {
        int i;
        int read;
        if (this.A05 != 6) {
            C35441gN r2 = r18;
            if (r18 != null && (i = r2.A00) > this.A02) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(r2.A02, 0, i);
                try {
                    long j = (long) this.A02;
                    while (j > 0) {
                        long skip = byteArrayInputStream.skip(j);
                        if (skip <= 0) {
                            if (byteArrayInputStream.read() == -1) {
                                break;
                            }
                            j--;
                        } else {
                            j -= skip;
                        }
                    }
                    int i2 = this.A01;
                    while (true) {
                        boolean z = true;
                        if (!(this.A05 == 6 || (read = byteArrayInputStream.read()) == -1)) {
                            int i3 = this.A02 + 1;
                            this.A02 = i3;
                            int i4 = this.A05;
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    int i5 = 3;
                                    if (i4 != 2) {
                                        if (i4 != 3) {
                                            i5 = 5;
                                            if (i4 != 4) {
                                                if (i4 == 5) {
                                                    int i6 = ((this.A03 << 8) + read) - 2;
                                                    long j2 = (long) i6;
                                                    while (j2 > 0) {
                                                        long skip2 = byteArrayInputStream.skip(j2);
                                                        if (skip2 <= 0) {
                                                            if (byteArrayInputStream.read() == -1) {
                                                                break;
                                                            }
                                                            j2--;
                                                        } else {
                                                            j2 -= skip2;
                                                        }
                                                    }
                                                    this.A02 += i6;
                                                } else {
                                                    this.A03 = read;
                                                }
                                            }
                                        } else if (read != 255) {
                                            if (read != 0) {
                                                if (read == 218 || read == 217) {
                                                    int i7 = i3 - 2;
                                                    int i8 = this.A04;
                                                    if (i8 > 0) {
                                                        this.A00 = i7;
                                                    }
                                                    this.A04 = i8 + 1;
                                                    this.A01 = i8;
                                                }
                                                boolean z2 = true;
                                                if (read == 1 || ((read >= 208 && read <= 215) || read == 217 || read == 216)) {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    this.A05 = 4;
                                                    this.A03 = read;
                                                }
                                            }
                                        }
                                    } else if (read != 255) {
                                        this.A03 = read;
                                    }
                                    this.A05 = i5;
                                    this.A03 = read;
                                } else if (read == 216) {
                                }
                                this.A05 = 2;
                                this.A03 = read;
                            } else if (read == 255) {
                                this.A05 = 1;
                                this.A03 = read;
                            }
                            this.A05 = 6;
                            this.A03 = read;
                        }
                        if (this.A05 == 6 || this.A01 == i2) {
                            z = false;
                        }
                        try {
                            byteArrayInputStream.close();
                            return z;
                        } catch (IOException e) {
                            throw new AssertionError(e);
                        }
                    }
                } catch (IOException ) {
                    byteArrayInputStream.close();
                    return false;
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
                byteArrayInputStream.close();
                return false;
            }
        }
        return false;
    }
}
