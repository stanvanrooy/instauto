package p000X;

import com.google.common.collect.RegularImmutableMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: X.0mF  reason: invalid class name and case insensitive filesystem */
public final class C15050mF extends C15060mG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C15070mH A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    public final C42911tS A01(int i, int i2) {
        int i3 = i - this.A00;
        if (i3 >= 0 && i3 < this.A01) {
            C15070mH r3 = this.A06;
            C42921tT r2 = new C42921tT();
            int A002 = r3.A00(16);
            if (A002 != 0) {
                int i4 = A002 + r3.A00;
                int i5 = i4 + r3.A01.getInt(i4) + 4 + (i3 << 2);
                int i6 = i5 + r3.A01.getInt(i5);
                if (i6 != r3.A00) {
                    ByteBuffer byteBuffer = r3.A01;
                    r2.A00 = i6;
                    r2.A01 = byteBuffer;
                    C42921tT r32 = r2;
                    if (r2 != null) {
                        Object[] objArr = new Object[8];
                        int i7 = 0;
                        AnonymousClass190 r22 = new AnonymousClass190();
                        int A003 = r32.A00(4);
                        if (A003 != 0) {
                            int i8 = A003 + r32.A00;
                            int i9 = i8 + r32.A01.getInt(i8);
                            ByteBuffer byteBuffer2 = r32.A01;
                            r22.A00 = i9;
                            r22.A01 = byteBuffer2;
                        } else {
                            r22 = null;
                        }
                        if (r22 != null) {
                            Integer valueOf = Integer.valueOf(Constants.ZERO.intValue());
                            String A004 = A00(r22, i2);
                            C14370kL.A01(valueOf, A004);
                            objArr[0] = valueOf;
                            objArr[1] = A004;
                            i7 = 1;
                        }
                        AnonymousClass190 r23 = new AnonymousClass190();
                        int A005 = r32.A00(6);
                        if (A005 != 0) {
                            int i10 = A005 + r32.A00;
                            int i11 = i10 + r32.A01.getInt(i10);
                            ByteBuffer byteBuffer3 = r32.A01;
                            r23.A00 = i11;
                            r23.A01 = byteBuffer3;
                        } else {
                            r23 = null;
                        }
                        if (r23 != null) {
                            Integer valueOf2 = Integer.valueOf(Constants.ONE.intValue());
                            String A006 = A00(r23, i2);
                            int i12 = i7 + 1;
                            int i13 = i12 << 1;
                            if (i13 > 8) {
                                objArr = Arrays.copyOf(objArr, C14360kK.A01(8, i13));
                            }
                            C14370kL.A01(valueOf2, A006);
                            int i14 = i7 << 1;
                            objArr[i14] = valueOf2;
                            objArr[i14 + 1] = A006;
                            i7 = i12;
                        }
                        AnonymousClass190 r24 = new AnonymousClass190();
                        int A007 = r32.A00(8);
                        if (A007 != 0) {
                            int i15 = A007 + r32.A00;
                            int i16 = i15 + r32.A01.getInt(i15);
                            ByteBuffer byteBuffer4 = r32.A01;
                            r24.A00 = i16;
                            r24.A01 = byteBuffer4;
                        } else {
                            r24 = null;
                        }
                        if (r24 != null) {
                            Integer valueOf3 = Integer.valueOf(Constants.A0C.intValue());
                            String A008 = A00(r24, i2);
                            int i17 = i7 + 1;
                            int i18 = i17 << 1;
                            int length = objArr.length;
                            if (i18 > length) {
                                objArr = Arrays.copyOf(objArr, C14360kK.A01(length, i18));
                            }
                            C14370kL.A01(valueOf3, A008);
                            int i19 = i7 << 1;
                            objArr[i19] = valueOf3;
                            objArr[i19 + 1] = A008;
                            i7 = i17;
                        }
                        AnonymousClass190 r25 = new AnonymousClass190();
                        int A009 = r32.A00(10);
                        if (A009 != 0) {
                            int i20 = A009 + r32.A00;
                            int i21 = i20 + r32.A01.getInt(i20);
                            ByteBuffer byteBuffer5 = r32.A01;
                            r25.A00 = i21;
                            r25.A01 = byteBuffer5;
                        } else {
                            r25 = null;
                        }
                        if (r25 != null) {
                            Integer valueOf4 = Integer.valueOf(Constants.A0N.intValue());
                            String A0010 = A00(r25, i2);
                            int i22 = i7 + 1;
                            int i23 = i22 << 1;
                            int length2 = objArr.length;
                            if (i23 > length2) {
                                objArr = Arrays.copyOf(objArr, C14360kK.A01(length2, i23));
                            }
                            C14370kL.A01(valueOf4, A0010);
                            int i24 = i7 << 1;
                            objArr[i24] = valueOf4;
                            objArr[i24 + 1] = A0010;
                            i7 = i22;
                        }
                        AnonymousClass190 r26 = new AnonymousClass190();
                        int A0011 = r32.A00(12);
                        if (A0011 != 0) {
                            int i25 = A0011 + r32.A00;
                            int i26 = i25 + r32.A01.getInt(i25);
                            ByteBuffer byteBuffer6 = r32.A01;
                            r26.A00 = i26;
                            r26.A01 = byteBuffer6;
                        } else {
                            r26 = null;
                        }
                        if (r26 != null) {
                            Integer valueOf5 = Integer.valueOf(Constants.A0Y.intValue());
                            String A0012 = A00(r26, i2);
                            int i27 = i7 + 1;
                            int i28 = i27 << 1;
                            int length3 = objArr.length;
                            if (i28 > length3) {
                                objArr = Arrays.copyOf(objArr, C14360kK.A01(length3, i28));
                            }
                            C14370kL.A01(valueOf5, A0012);
                            int i29 = i7 << 1;
                            objArr[i29] = valueOf5;
                            objArr[i29 + 1] = A0012;
                            i7 = i27;
                        }
                        AnonymousClass190 r27 = new AnonymousClass190();
                        int A0013 = r32.A00(14);
                        if (A0013 != 0) {
                            int i30 = A0013 + r32.A00;
                            int i31 = i30 + r32.A01.getInt(i30);
                            ByteBuffer byteBuffer7 = r32.A01;
                            r27.A00 = i31;
                            r27.A01 = byteBuffer7;
                        } else {
                            r27 = null;
                        }
                        if (r27 != null) {
                            Integer valueOf6 = Integer.valueOf(Constants.A0j.intValue());
                            String A0014 = A00(r27, i2);
                            int i32 = i7 + 1;
                            int i33 = i32 << 1;
                            int length4 = objArr.length;
                            if (i33 > length4) {
                                objArr = Arrays.copyOf(objArr, C14360kK.A01(length4, i33));
                            }
                            C14370kL.A01(valueOf6, A0014);
                            int i34 = i7 << 1;
                            objArr[i34] = valueOf6;
                            objArr[i34 + 1] = A0014;
                            i7 = i32;
                        }
                        return new C42911tS(RegularImmutableMap.A00(i7, objArr));
                    }
                }
            }
            r2 = null;
            C42921tT r322 = r2;
            if (r2 != null) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    public static String A00(AnonymousClass190 r2, int i) {
        int i2;
        String str;
        if (i == 0) {
            i2 = 4;
        } else if (i != 1) {
            if (i == 2) {
                i2 = 6;
            }
            str = null;
            if (str != null) {
                return str;
            }
            int A002 = r2.A00(4);
            if (A002 != 0) {
                return r2.A02(A002 + r2.A00);
            }
            return null;
        } else {
            i2 = 8;
        }
        int A003 = r2.A00(i2);
        if (A003 != 0) {
            str = r2.A02(A003 + r2.A00);
            if (str != null) {
            }
        }
        str = null;
        if (str != null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    public final String A02(int i, int i2) {
        int i3 = i - this.A04;
        if (i3 >= 0 && i3 < this.A05) {
            C15070mH r3 = this.A06;
            AnonymousClass190 r2 = new AnonymousClass190();
            int A002 = r3.A00(10);
            if (A002 != 0) {
                int i4 = A002 + r3.A00;
                int i5 = i4 + r3.A01.getInt(i4) + 4 + (i3 << 2);
                int i6 = i5 + r3.A01.getInt(i5);
                if (i6 != r3.A02) {
                    ByteBuffer byteBuffer = r3.A01;
                    r2.A00 = i6;
                    r2.A01 = byteBuffer;
                    if (r2 != null) {
                        return A00(r2, i2);
                    }
                }
            }
            r2 = null;
            if (r2 != null) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    public final String[] A03(int i, int i2) {
        C26806Bsr bsr;
        int i3;
        int i4;
        int i5 = i - this.A02;
        String[] strArr = null;
        if (i5 >= 0 && i5 < this.A03) {
            C15070mH r3 = this.A06;
            C26806Bsr bsr2 = new C26806Bsr();
            int A002 = r3.A00(22);
            if (A002 != 0) {
                int i6 = A002 + r3.A00;
                int i7 = i6 + r3.A01.getInt(i6) + 4 + (i5 << 2);
                int i8 = i7 + r3.A01.getInt(i7);
                if (i8 != r3.A01) {
                    ByteBuffer byteBuffer = r3.A01;
                    bsr2.A00 = i8;
                    bsr2.A01 = byteBuffer;
                    bsr = bsr2;
                    if (bsr2 != null) {
                        int A003 = bsr.A00(4);
                        if (A003 != 0) {
                            i3 = bsr.A01(A003);
                        } else {
                            i3 = 0;
                        }
                        strArr = new String[i3];
                        int i9 = 0;
                        while (true) {
                            int A004 = bsr.A00(4);
                            if (A004 != 0) {
                                i4 = bsr.A01(A004);
                            } else {
                                i4 = 0;
                            }
                            if (i9 >= i4) {
                                break;
                            }
                            AnonymousClass190 r32 = new AnonymousClass190();
                            int A005 = bsr.A00(4);
                            if (A005 != 0) {
                                int i10 = A005 + bsr.A00;
                                int i11 = i10 + bsr.A01.getInt(i10) + 4 + (i9 << 2);
                                int i12 = i11 + bsr.A01.getInt(i11);
                                ByteBuffer byteBuffer2 = bsr.A01;
                                r32.A00 = i12;
                                r32.A01 = byteBuffer2;
                            } else {
                                r32 = null;
                            }
                            strArr[i9] = A00(r32, i2);
                            i9++;
                        }
                    }
                }
            }
            bsr2 = null;
            bsr = null;
            if (bsr2 != null) {
            }
        }
        return strArr;
    }

    public C15050mF(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C15070mH r3 = new C15070mH();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        r3.A00 = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        r3.A01 = byteBuffer;
        int A002 = r3.A00(8) + r3.A00;
        r3.A02 = A002 + r3.A01.getInt(A002);
        int A003 = r3.A00(14) + r3.A00;
        r3.A00 = A003 + r3.A01.getInt(A003);
        int A004 = r3.A00(20) + r3.A00;
        r3.A01 = A004 + r3.A01.getInt(A004);
        this.A06 = r3;
        int A005 = r3.A00(6);
        if (A005 != 0) {
            i = r3.A01.getInt(A005 + r3.A00);
        } else {
            i = 0;
        }
        this.A04 = i;
        C15070mH r32 = this.A06;
        int A006 = r32.A00(12);
        if (A006 != 0) {
            i2 = r32.A01.getInt(A006 + r32.A00);
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        C15070mH r33 = this.A06;
        int A007 = r33.A00(18);
        if (A007 != 0) {
            i3 = r33.A01.getInt(A007 + r33.A00);
        } else {
            i3 = 0;
        }
        this.A02 = i3;
        C15070mH r1 = this.A06;
        int A008 = r1.A00(10);
        if (A008 != 0) {
            i4 = r1.A01(A008);
        } else {
            i4 = 0;
        }
        this.A05 = i4;
        C15070mH r12 = this.A06;
        int A009 = r12.A00(16);
        if (A009 != 0) {
            i5 = r12.A01(A009);
        } else {
            i5 = 0;
        }
        this.A01 = i5;
        C15070mH r13 = this.A06;
        int A0010 = r13.A00(22);
        if (A0010 != 0) {
            i6 = r13.A01(A0010);
        } else {
            i6 = 0;
        }
        this.A03 = i6;
    }
}
