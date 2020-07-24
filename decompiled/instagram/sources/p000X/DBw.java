package p000X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.nio.ByteBuffer;

/* renamed from: X.DBw */
public final class DBw implements D8F {
    public static final Class A01 = DBw.class;
    public volatile Rect A00;

    public final int AUM() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023a, code lost:
        if (r6 == 2) goto L_0x023c;
     */
    public final ByteBuffer AbH(ByteBuffer byteBuffer) {
        Pair create;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.A00 == null || (this.A00.left == 0 && this.A00.right == 0 && this.A00.top == 0 && this.A00.bottom == 0)) {
            return byteBuffer;
        }
        SystemClock.elapsedRealtime();
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.getShort();
            if (duplicate.get() == 0) {
                duplicate.getShort();
            } else {
                duplicate.get();
            }
            ByteBuffer duplicate2 = duplicate.duplicate();
            duplicate2.flip();
            ByteBuffer slice = duplicate.slice();
            int i9 = 0;
            while (true) {
                if (i9 >= slice.limit() - 4) {
                    AnonymousClass0a4.A07(duplicate2, "Couldn't find SPS Nalu header!");
                    create = Pair.create(DBz.A00(duplicate2, slice), ByteBuffer.allocateDirect(0));
                    break;
                }
                if (slice.get(i9) == 0 && slice.get(i9 + 1) == 0) {
                    int i10 = i9 + 2;
                    if (slice.get(i10) == 0 || slice.get(i10) == 1) {
                        slice.position(i9);
                        ByteBuffer slice2 = slice.slice();
                        slice.flip();
                        create = Pair.create(DBz.A00(duplicate2, slice), slice2);
                    }
                }
                i9++;
            }
            slice.position(i9);
            ByteBuffer slice22 = slice.slice();
            slice.flip();
            create = Pair.create(DBz.A00(duplicate2, slice), slice22);
            DBz dBz = (DBz) create.first;
            DBz dBz2 = dBz;
            ByteBuffer byteBuffer2 = (ByteBuffer) create.second;
            ByteBuffer byteBuffer3 = dBz.A00;
            if ((byteBuffer3.get(byteBuffer3.limit() - 1) & 31) == 7) {
                DBy dBy = new DBy(((DBz) create.first).A01.duplicate());
                if (dBy.A00 > 0) {
                    DBy.A00(dBy);
                }
                int A002 = DBy.A00(dBy);
                DC1.A00(A002);
                if (dBy.A00 > 0) {
                    DBy.A00(dBy);
                }
                DC1.A00(DBy.A00(dBy));
                if (dBy.A00 > 0) {
                    DBy.A00(dBy);
                }
                DC1.A00(DBy.A00(dBy));
                DC1.A00(dBy.A02());
                if (A002 == 100 || A002 == 110 || A002 == 122 || A002 == 244 || A002 == 44 || A002 == 83 || A002 == 86 || A002 == 118 || A002 == 128 || A002 == 138 || A002 == 139 || A002 == 134) {
                    i2 = dBy.A02();
                    DC1.A00(i2);
                    if (i2 == 3) {
                        i = dBy.A01();
                        DC1.A00(i);
                    } else {
                        i = 0;
                    }
                    DC1.A00(dBy.A02());
                    DC1.A00(dBy.A02());
                    DC1.A00(dBy.A01());
                    int A012 = dBy.A01();
                    DC1.A00(A012);
                    if (A012 == 1) {
                        if (i2 != 3) {
                            i8 = dBy.A03(8);
                            DC1.A00(i8);
                        } else {
                            i8 = dBy.A03(12);
                            DC1.A00(i8);
                        }
                        if (((long) i8) > 0) {
                            th = new UnsupportedOperationException("SPS contains scaling lists, which are unsupported.");
                            throw th;
                        }
                    }
                } else {
                    i2 = 1;
                    i = 0;
                }
                DC1.A00(dBy.A02());
                int A02 = dBy.A02();
                DC1.A00(A02);
                if (A02 == 0) {
                    DC1.A00(dBy.A02());
                } else if (A02 == 1) {
                    DC1.A00(dBy.A01());
                    DC1.A00(dBy.A02());
                    DC1.A00(dBy.A02());
                    int A022 = dBy.A02();
                    DC1.A00(A022);
                    for (int i11 = 0; i11 < A022; i11++) {
                        DC1.A00(dBy.A02());
                    }
                }
                DC1.A00(dBy.A02());
                DC1.A00(dBy.A01());
                DC1.A00(dBy.A02());
                DC1.A00(dBy.A02());
                int A013 = dBy.A01();
                DC1.A00(A013);
                if (A013 == 0) {
                    DC1.A00(dBy.A01());
                }
                DC1.A00(dBy.A01());
                DC2 dc2 = new DC2(dBy.A02.position(), dBy.A00);
                int A014 = dBy.A01();
                DC1.A00(A014);
                if (A014 == 1) {
                    i3 = dBy.A02();
                    DC1.A00(i3);
                    i4 = dBy.A02();
                    DC1.A00(i4);
                    i5 = dBy.A02();
                    DC1.A00(i5);
                    i6 = dBy.A02();
                    DC1.A00(i6);
                } else {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                }
                DC2 dc22 = new DC2(dBy.A02.position(), dBy.A00);
                int i12 = 2 - A013;
                if (i == 1 || i2 == 0) {
                    i6 *= i12;
                    i5 *= i12;
                    i7 = 1;
                } else {
                    if (i != 0 || i2 <= 0) {
                        i7 = 1;
                    } else {
                        if (i2 != 1) {
                            i7 = 1;
                        }
                        i3 <<= 1;
                        i4 <<= 1;
                        i7 = 2;
                        if (i2 == 1) {
                            i5 <<= 1;
                            i6 <<= 1;
                            i12 = 2;
                        }
                    }
                    i12 = 1;
                }
                DC0 dc0 = new DC0(dBz2, byteBuffer2, dc2, dc22, new Rect(i3, i5, i4, i6), i7, i12);
                Rect rect = this.A00;
                boolean z = false;
                if (rect.left % dc0.A00 == 0) {
                    z = true;
                }
                AnonymousClass0a4.A09(z);
                boolean z2 = false;
                if (rect.right % dc0.A00 == 0) {
                    z2 = true;
                }
                AnonymousClass0a4.A09(z2);
                boolean z3 = false;
                if (rect.top % dc0.A01 == 0) {
                    z3 = true;
                }
                AnonymousClass0a4.A09(z3);
                boolean z4 = false;
                if (rect.bottom % dc0.A01 == 0) {
                    z4 = true;
                }
                AnonymousClass0a4.A09(z4);
                Rect rect2 = dc0.A02;
                int i13 = rect2.left + rect.left;
                int i14 = rect2.right + rect.right;
                int i15 = rect2.top + rect.top;
                int i16 = rect2.bottom + rect.bottom;
                DBx dBx = new DBx(dc0.A05.A01.limit() + 5);
                ByteBuffer byteBuffer4 = dc0.A05.A01;
                DC2 dc23 = dc0.A04;
                DBy dBy2 = new DBy(byteBuffer4);
                int i17 = 0;
                while (i17 < dc23.A01 - 1) {
                    try {
                        if (dBy2.A00 > 0) {
                            DBy.A00(dBy2);
                        }
                        dBx.A02(DBy.A00(dBy2));
                        i17++;
                    } catch (Throwable th) {
                        th = th;
                        dBy2.A01 = 0;
                        dBy2.A00 = 0;
                        dBy2.A02.reset();
                    }
                }
                int i18 = dc23.A00;
                if (i18 > 0) {
                    dBx.A00 = C2100493y.A00((long) (dBy2.A03(i18) << (8 - dc23.A00)));
                    dBx.A01 = dc23.A00;
                }
                dBy2.A01 = 0;
                dBy2.A00 = 0;
                dBy2.A02.reset();
                if (i13 > 0 || i14 > 0 || i15 > 0 || i16 > 0) {
                    dBx.A01(1);
                    dBx.A03(i13 / dc0.A00);
                    dBx.A03(i14 / dc0.A00);
                    dBx.A03(i15 / dc0.A01);
                    dBx.A03(i16 / dc0.A01);
                } else {
                    dBx.A01(0);
                }
                ByteBuffer byteBuffer5 = dc0.A05.A01;
                DC2 dc24 = dc0.A03;
                DBy dBy3 = new DBy(byteBuffer5);
                try {
                    dBy3.A02.position(dc24.A01);
                    dBy3.A01 = dBy3.A02.get(dc24.A01 - 1) & 255;
                    int i19 = dc24.A00;
                    dBy3.A00 = i19;
                    if (i19 > 0) {
                        int i20 = 8 - i19;
                        dBx.A04(i20, (long) dBy3.A03(i20));
                    }
                    while (true) {
                        if (dBy3.A00 > 0) {
                            DBy.A00(dBy3);
                        }
                        int A003 = DBy.A00(dBy3);
                        if (A003 == -1) {
                            break;
                        }
                        dBx.A04(8, (long) A003);
                    }
                    dBy3.A01 = 0;
                    dBy3.A00 = 0;
                    dBy3.A02.reset();
                    ByteBuffer byteBuffer6 = dc0.A05.A00;
                    dBx.A00();
                    dBx.A02.flip();
                    DBz dBz3 = new DBz(byteBuffer6, dBx.A02);
                    DBx dBx2 = new DBx(dBz3.A00.limit() + (dBz3.A01.limit() << 1));
                    dBx2.A05(dBz3.A00);
                    dBz3.A01.mark();
                    while (true) {
                        int i21 = 0;
                        while (dBz3.A01.position() < dBz3.A01.limit()) {
                            byte b = dBz3.A01.get() & 255;
                            if (b <= 3 && i21 >= 2) {
                                dBx2.A02(3);
                                i21 = 0;
                            }
                            dBx2.A02(b);
                            i21++;
                            if (b != 0) {
                            }
                        }
                        dBz3.A01.reset();
                        dBx2.A00();
                        dBx2.A02.flip();
                        ByteBuffer byteBuffer7 = dBx2.A02;
                        DBx dBx3 = new DBx(byteBuffer7.limit() + dc0.A06.limit());
                        dBx3.A05(byteBuffer7);
                        dBx3.A05(dc0.A06);
                        dBx3.A00();
                        dBx3.A02.flip();
                        return dBx3.A02;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dBy3.A01 = 0;
                    dBy3.A00 = 0;
                    dBy3.A02.reset();
                }
            } else {
                ByteBuffer byteBuffer8 = ((DBz) create.first).A00;
                throw new IllegalArgumentException(AnonymousClass000.A05("Not SPS, NALU type = ", byteBuffer8.get(byteBuffer8.limit() - 1) & 31));
            }
        } catch (Exception e) {
            AnonymousClass0DB.A0B(A01, e, "Failed to rewrite SPS", new Object[0]);
            return byteBuffer;
        } finally {
            SystemClock.elapsedRealtime();
        }
    }

    public final VideoEncoderConfig Aba(VideoEncoderConfig videoEncoderConfig) {
        int i = videoEncoderConfig.width;
        int i2 = i;
        int i3 = videoEncoderConfig.height;
        int i4 = i3;
        if (i % 16 != 0) {
            i = ((i >> 4) + 1) << 4;
        }
        if (i3 % 16 != 0) {
            i3 = ((i3 >> 4) + 1) << 4;
        }
        this.A00 = new Rect(0, i3 - i4, i - i2, 0);
        return new VideoEncoderConfig(i, i3, videoEncoderConfig.bitRate, videoEncoderConfig.frameRate, videoEncoderConfig.videoProfile, videoEncoderConfig.videoBitrateMode, videoEncoderConfig.iFrameInterval);
    }
}
