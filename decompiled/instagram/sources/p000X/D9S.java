package p000X;

import android.util.Log;
import android.util.Pair;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.forker.Process;
import com.facebook.react.modules.camera.CameraRollManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.D9S */
public final class D9S implements C29780D9o {
    public final /* synthetic */ MatroskaExtractor A00;

    public D9S(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    public final void A6Q(int i, int i2, C29778D9m d9m) {
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        int i7 = i2;
        MatroskaExtractor matroskaExtractor = this.A00;
        int i8 = 4;
        int i9 = 0;
        int i10 = 1;
        int i11 = i;
        C29778D9m d9m2 = d9m;
        if (i11 == 161 || i11 == 163) {
            byte b2 = 8;
            if (matroskaExtractor.A04 == 0) {
                matroskaExtractor.A05 = (int) matroskaExtractor.A0e.A01(d9m2, false, true, 8);
                matroskaExtractor.A06 = matroskaExtractor.A0e.A00;
                matroskaExtractor.A04 = 1;
                D9O d9o = matroskaExtractor.A0l;
                d9o.A01 = 0;
                d9o.A00 = 0;
            }
            D9U d9u = (D9U) matroskaExtractor.A0c.get(matroskaExtractor.A05);
            if (d9u == null) {
                d9m2.Bos(i2 - matroskaExtractor.A06);
                matroskaExtractor.A04 = 0;
                return;
            }
            if (matroskaExtractor.A04 == 1) {
                MatroskaExtractor.A04(matroskaExtractor, d9m2, 3);
                int i12 = (matroskaExtractor.A0l.A02[2] & 6) >> 1;
                if (i12 == 0) {
                    matroskaExtractor.A02 = 1;
                    int[] iArr = matroskaExtractor.A0R;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else {
                        int length = iArr.length;
                        if (length < 1) {
                            iArr = new int[Math.max(length << 1, 1)];
                        }
                    }
                    matroskaExtractor.A0R = iArr;
                    iArr[0] = (i2 - matroskaExtractor.A06) - 3;
                } else {
                    MatroskaExtractor.A04(matroskaExtractor, d9m2, 4);
                    int i13 = (matroskaExtractor.A0l.A02[3] & 255) + 1;
                    matroskaExtractor.A02 = i13;
                    int[] iArr2 = matroskaExtractor.A0R;
                    if (iArr2 == null) {
                        iArr2 = new int[i13];
                    } else {
                        int length2 = iArr2.length;
                        if (length2 < i13) {
                            iArr2 = new int[Math.max(length2 << 1, i13)];
                        }
                    }
                    matroskaExtractor.A0R = iArr2;
                    if (i12 == 2) {
                        Arrays.fill(iArr2, 0, i13, ((i2 - matroskaExtractor.A06) - 4) / i13);
                    } else {
                        if (i12 == 1) {
                            int i14 = 0;
                            i3 = 0;
                            while (true) {
                                i4 = matroskaExtractor.A02;
                                if (i14 >= i4 - 1) {
                                    break;
                                }
                                matroskaExtractor.A0R[i14] = 0;
                                do {
                                    i8++;
                                    MatroskaExtractor.A04(matroskaExtractor, d9m2, i8);
                                    b = matroskaExtractor.A0l.A02[i8 - 1] & 255;
                                    int[] iArr3 = matroskaExtractor.A0R;
                                    i5 = iArr3[i14] + b;
                                    iArr3[i14] = i5;
                                } while (b == 255);
                                i3 += i5;
                                i14++;
                            }
                        } else if (i12 == 3) {
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i4 = matroskaExtractor.A02;
                                if (i15 >= i4 - 1) {
                                    break;
                                }
                                matroskaExtractor.A0R[i15] = i9;
                                i8++;
                                MatroskaExtractor.A04(matroskaExtractor, d9m2, i8);
                                byte[] bArr = matroskaExtractor.A0l.A02;
                                int i17 = i8 - 1;
                                if (bArr[i17] != 0) {
                                    long j = 0;
                                    while (true) {
                                        if (i9 >= b2) {
                                            break;
                                        }
                                        int i18 = i10 << (7 - i9);
                                        if ((bArr[i17] & i18) != 0) {
                                            i8 += i9;
                                            MatroskaExtractor.A04(matroskaExtractor, d9m2, i8);
                                            byte[] bArr2 = matroskaExtractor.A0l.A02;
                                            int i19 = i17 + 1;
                                            j = (long) (bArr2[i17] & 255 & (i18 ^ -1));
                                            while (i19 < i8) {
                                                i19++;
                                                j = ((long) (bArr2[i19] & 255)) | (j << b2);
                                                b2 = 8;
                                            }
                                            if (i15 > 0) {
                                                j -= (1 << ((i9 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i9++;
                                        }
                                    }
                                    if (j >= -2147483648L && j <= 2147483647L) {
                                        int i20 = (int) j;
                                        int[] iArr4 = matroskaExtractor.A0R;
                                        if (i15 != 0) {
                                            i20 += iArr4[i15 - 1];
                                        }
                                        iArr4[i15] = i20;
                                        i16 = i3 + i20;
                                        i15++;
                                        i9 = 0;
                                        i10 = 1;
                                    }
                                } else {
                                    throw new C2101594l("No valid varint length mask found");
                                }
                            }
                            throw new C2101594l("EBML lacing sample size out of range.");
                        } else {
                            throw new C2101594l(AnonymousClass000.A05("Unexpected lacing value: ", i12));
                        }
                        matroskaExtractor.A0R[i4 - i10] = ((i2 - matroskaExtractor.A06) - i8) - i3;
                    }
                }
                byte[] bArr3 = matroskaExtractor.A0l.A02;
                matroskaExtractor.A09 = matroskaExtractor.A0A + MatroskaExtractor.A01(matroskaExtractor, (long) ((bArr3[i9] << b2) | (bArr3[i10] & 255)));
                byte b3 = bArr3[2];
                boolean z = false;
                if ((b3 & b2) == b2) {
                    z = true;
                }
                if (d9u.A0V == 2 || (i11 == 163 && (b3 & 128) == 128)) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                if (z) {
                    i9 = Process.WAIT_RESULT_TIMEOUT;
                }
                matroskaExtractor.A01 = i6 | i9;
                matroskaExtractor.A04 = 2;
                matroskaExtractor.A03 = 0;
            }
            if (i11 == 163) {
                while (true) {
                    int i21 = matroskaExtractor.A03;
                    if (i21 < matroskaExtractor.A02) {
                        D9U d9u2 = d9u;
                        MatroskaExtractor.A05(matroskaExtractor, d9u2, ((long) ((matroskaExtractor.A03 * d9u.A0I) / 1000)) + matroskaExtractor.A09, matroskaExtractor.A01, MatroskaExtractor.A00(matroskaExtractor, d9m2, d9u, matroskaExtractor.A0R[i21]), 0);
                        matroskaExtractor.A03 += i10;
                    } else {
                        matroskaExtractor.A04 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i22 = matroskaExtractor.A03;
                    if (i22 < matroskaExtractor.A02) {
                        int[] iArr5 = matroskaExtractor.A0R;
                        iArr5[i22] = MatroskaExtractor.A00(matroskaExtractor, d9m2, d9u, iArr5[i22]);
                        matroskaExtractor.A03 += i10;
                    } else {
                        return;
                    }
                }
            }
        } else if (i11 != 165) {
            if (i11 == 16981) {
                byte[] bArr4 = new byte[i7];
                matroskaExtractor.A0K.A0m = bArr4;
                d9m2.readFully(bArr4, 0, i7);
            } else if (i11 == 18402) {
                byte[] bArr5 = new byte[i7];
                d9m2.readFully(bArr5, 0, i7);
                matroskaExtractor.A0K.A0a = new C29719D6g(1, bArr5, 0, 0);
            } else if (i11 == 21419) {
                Arrays.fill(matroskaExtractor.A0m.A02, (byte) 0);
                d9m2.readFully(matroskaExtractor.A0m.A02, 4 - i2, i7);
                matroskaExtractor.A0m.A0C(0);
                matroskaExtractor.A08 = (int) matroskaExtractor.A0m.A05();
            } else if (i11 == 25506) {
                byte[] bArr6 = new byte[i7];
                matroskaExtractor.A0K.A0k = bArr6;
                d9m2.readFully(bArr6, 0, i7);
            } else if (i11 == 30322) {
                byte[] bArr7 = new byte[i7];
                matroskaExtractor.A0K.A0l = bArr7;
                d9m2.readFully(bArr7, 0, i7);
            } else {
                throw new C2101594l(AnonymousClass000.A05("Unexpected id: ", i11));
            }
        } else if (matroskaExtractor.A04 == 2) {
            D9U d9u3 = (D9U) matroskaExtractor.A0c.get(matroskaExtractor.A05);
            if (matroskaExtractor.A00 != 4 || !"V_VP9".equals(d9u3.A0d)) {
                d9m2.Bos(i7);
                return;
            }
            D9O d9o2 = matroskaExtractor.A0f;
            d9o2.A0A(i7);
            d9m2.readFully(d9o2.A02, 0, i7);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0268, code lost:
        if ("S_DVBSUB".equals(r3) != false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a4, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ae, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b9, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02c4, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02cf, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02da, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02e5, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02f0, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02fb, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0305, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0310, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x031c, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0328, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0334, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0340, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x034c, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0357, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0360, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x036b, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0377, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0383, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x038f, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x039b, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03a7, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03b3, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03bf, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ca, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03d6, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03e2, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03ee, code lost:
        if (r2 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05b1, code lost:
        r3 = null;
        r21 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x062d, code lost:
        r4.append(r2);
        android.util.Log.w("MatroskaExtractor", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x066e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x066f, code lost:
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0671, code lost:
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x068e, code lost:
        r21 = -1;
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0691, code lost:
        r4 = r0.A0g | false;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0698, code lost:
        if (r0.A0h == false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x069a, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x069b, code lost:
        r4 = r4 | r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06a6, code lost:
        if (org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND.equals(p000X.C29735D6z.A04(r2)) == false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06a8, code lost:
        r5 = com.google.android.exoplayer2.Format.A03(java.lang.Integer.toString(r22), r2, r21, r0.A0E, r0.A0T, r14, r3, r0.A0Z, r4 ? 1 : 0, r0.A0e);
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06c5, code lost:
        r2 = r39.Brb(r0.A0R, r8);
        r0.A0b = r2;
        r2.AEh(r5);
        r3 = r1.A0c;
        r2 = r1.A0K;
        r3.put(r2.A0R, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06e3, code lost:
        if (p000X.C29735D6z.A05(r2) == false) goto L_0x088d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06e7, code lost:
        if (r0.A0K != 0) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06e9, code lost:
        r4 = r0.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06eb, code lost:
        if (r4 != -1) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06ed, code lost:
        r4 = r0.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06ef, code lost:
        r0.A0L = r4;
        r4 = r0.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06f3, code lost:
        if (r4 != -1) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06f5, code lost:
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06f7, code lost:
        r0.A0J = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06f9, code lost:
        r5 = r0.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06fb, code lost:
        if (r5 == -1) goto L_0x0889;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06fd, code lost:
        r7 = r0.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06ff, code lost:
        if (r7 == -1) goto L_0x0889;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0701, code lost:
        r4 = ((float) (r0.A0M * r5)) / ((float) (r0.A0W * r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x070c, code lost:
        if (r0.A0i == false) goto L_0x07d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0714, code lost:
        if (r0.A06 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x071a, code lost:
        if (r0.A07 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0720, code lost:
        if (r0.A04 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0726, code lost:
        if (r0.A05 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x072c, code lost:
        if (r0.A02 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0732, code lost:
        if (r0.A03 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0738, code lost:
        if (r0.A0B == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x073e, code lost:
        if (r0.A0C == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0744, code lost:
        if (r0.A00 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x074a, code lost:
        if (r0.A01 == -1.0f) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x074c, code lost:
        r6 = new byte[25];
        r7 = java.nio.ByteBuffer.wrap(r6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r7.put((byte) 0);
        r7.putShort((short) ((int) ((r0.A06 * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A07 * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A04 * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A05 * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A02 * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A03 * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A0B * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.A0C * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) (r0.A00 + 0.5f)));
        r7.putShort((short) ((int) (r0.A01 + 0.5f)));
        r7.putShort((short) r0.A0O);
        r7.putShort((short) r0.A0P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x07c7, code lost:
        r12 = new com.google.android.exoplayer2.video.ColorInfo(r0.A0G, r0.A0F, r0.A0H, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07d2, code lost:
        r6 = r0.A0f;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07db, code lost:
        if ("htc_video_rotA-000".equals(r6) != false) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07dd, code lost:
        r8 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07e5, code lost:
        if ("htc_video_rotA-090".equals(r6) != false) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07e7, code lost:
        r8 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07ef, code lost:
        if ("htc_video_rotA-180".equals(r6) != false) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07f1, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07f8, code lost:
        if ("htc_video_rotA-270".equals(r6) == false) goto L_0x07fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07fa, code lost:
        r8 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07fe, code lost:
        if (r0.A0S != 0) goto L_0x0880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0807, code lost:
        if (java.lang.Float.compare(r0.A0A, com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) != 0) goto L_0x0880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0809, code lost:
        r6 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x080f, code lost:
        if (java.lang.Float.compare(r6, com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) != 0) goto L_0x0880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0817, code lost:
        if (java.lang.Float.compare(r0.A09, com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) != 0) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0819, code lost:
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x081b, code lost:
        r15 = new com.google.android.exoplayer2.Format(java.lang.Integer.toString(r22), (java.lang.String) null, r2, (java.lang.String) null, -1, r21, r0.A0W, r0.A0M, r24, r4, r0.A0l, r0.A0U, r12, -1, -1, -1, 0, (java.lang.String) null, -1, Long.MAX_VALUE, r3, r0.A0Z);
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0861, code lost:
        if (java.lang.Float.compare(r6, 90.0f) != 0) goto L_0x0866;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0863, code lost:
        r24 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x086c, code lost:
        if (java.lang.Float.compare(r6, -180.0f) == 0) goto L_0x0883;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0874, code lost:
        if (java.lang.Float.compare(r6, 180.0f) == 0) goto L_0x0883;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0876, code lost:
        r24 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x087e, code lost:
        if (java.lang.Float.compare(r6, -90.0f) == 0) goto L_0x081b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0880, code lost:
        r24 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0883, code lost:
        r24 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0886, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0889, code lost:
        r4 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0891, code lost:
        if ("application/x-subrip".equals(r2) == false) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0893, code lost:
        r5 = com.google.android.exoplayer2.Format.A04(java.lang.Integer.toString(r22), r2, r4 ? 1 : 0, r0.A0e, r0.A0Z, Long.MAX_VALUE, java.util.Collections.emptyList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x08b4, code lost:
        if ("text/x-ssa".equals(r2) == false) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x08b6, code lost:
        r6 = new java.util.ArrayList(2);
        r6.add(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0s);
        r6.add(r0.A0k);
        r5 = com.google.android.exoplayer2.Format.A04(java.lang.Integer.toString(r22), r2, r4 ? 1 : 0, r0.A0e, r0.A0Z, Long.MAX_VALUE, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08e4, code lost:
        if ("application/vobsub".equals(r2) != false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x08ec, code lost:
        if ("application/pgs".equals(r2) != false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08f4, code lost:
        if ("application/dvbsubs".equals(r2) != false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08fd, code lost:
        throw new p000X.C2101594l("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08fe, code lost:
        r9 = new com.google.android.exoplayer2.Format(java.lang.Integer.toString(r22), (java.lang.String) null, r2, (java.lang.String) null, -1, -1, -1, -1, -1, -1.0f, (byte[]) null, -1, (com.google.android.exoplayer2.video.ColorInfo) null, -1, -1, -1, r4 ? 1 : 0, r0.A0e, -1, Long.MAX_VALUE, r3, r0.A0Z);
     */
    public final void ADD(int i) {
        boolean z;
        char c;
        int i2;
        List list;
        String str;
        String str2;
        List list2;
        StringBuilder sb;
        C2101594l r0;
        Pair pair;
        D8B d8b;
        int i3;
        C25992Bdm bdm;
        int i4;
        MatroskaExtractor matroskaExtractor = this.A00;
        int i5 = i;
        if (i5 != 160) {
            if (i5 == 174) {
                D9U d9u = matroskaExtractor.A0K;
                String str3 = d9u.A0d;
                if (!"V_VP8".equals(str3) && !"V_VP9".equals(str3) && !"V_AV1".equals(str3) && !"V_MPEG2".equals(str3) && !"V_MPEG4/ISO/SP".equals(str3) && !"V_MPEG4/ISO/ASP".equals(str3) && !"V_MPEG4/ISO/AP".equals(str3) && !"V_MPEG4/ISO/AVC".equals(str3) && !"V_MPEGH/ISO/HEVC".equals(str3) && !"V_MS/VFW/FOURCC".equals(str3) && !"V_THEORA".equals(str3) && !"A_OPUS".equals(str3) && !"A_VORBIS".equals(str3) && !"A_AAC".equals(str3) && !"A_MPEG/L2".equals(str3) && !"A_MPEG/L3".equals(str3) && !"A_AC3".equals(str3) && !"A_EAC3".equals(str3) && !"A_TRUEHD".equals(str3) && !"A_DTS".equals(str3) && !"A_DTS/EXPRESS".equals(str3) && !"A_DTS/LOSSLESS".equals(str3) && !"A_FLAC".equals(str3) && !"A_MS/ACM".equals(str3) && !"A_PCM/INT/LIT".equals(str3) && !"S_TEXT/UTF8".equals(str3) && !"S_TEXT/ASS".equals(str3) && !"S_VOBSUB".equals(str3) && !"S_HDMV/PGS".equals(str3)) {
                    z = false;
                }
                z = true;
                if (z) {
                    C29790D9z d9z = matroskaExtractor.A0J;
                    int i6 = d9u.A0R;
                    int i7 = 3;
                    switch (str3.hashCode()) {
                        case -2095576542:
                            boolean equals = str3.equals("V_MPEG4/ISO/AP");
                            c = 6;
                            break;
                        case -2095575984:
                            boolean equals2 = str3.equals("V_MPEG4/ISO/SP");
                            c = 4;
                            break;
                        case -1985379776:
                            boolean equals3 = str3.equals("A_MS/ACM");
                            c = 23;
                            break;
                        case -1784763192:
                            boolean equals4 = str3.equals("A_TRUEHD");
                            c = 18;
                            break;
                        case -1730367663:
                            boolean equals5 = str3.equals("A_VORBIS");
                            c = 11;
                            break;
                        case -1482641358:
                            boolean equals6 = str3.equals("A_MPEG/L2");
                            c = 14;
                            break;
                        case -1482641357:
                            boolean equals7 = str3.equals("A_MPEG/L3");
                            c = 15;
                            break;
                        case -1373388978:
                            boolean equals8 = str3.equals("V_MS/VFW/FOURCC");
                            c = 9;
                            break;
                        case -933872740:
                            boolean equals9 = str3.equals("S_DVBSUB");
                            c = 29;
                            break;
                        case -538363189:
                            boolean equals10 = str3.equals("V_MPEG4/ISO/ASP");
                            c = 5;
                            break;
                        case -538363109:
                            boolean equals11 = str3.equals("V_MPEG4/ISO/AVC");
                            c = 7;
                            break;
                        case -425012669:
                            boolean equals12 = str3.equals("S_VOBSUB");
                            c = 27;
                            break;
                        case -356037306:
                            boolean equals13 = str3.equals("A_DTS/LOSSLESS");
                            c = 21;
                            break;
                        case 62923557:
                            boolean equals14 = str3.equals("A_AAC");
                            c = 13;
                            break;
                        case 62923603:
                            boolean equals15 = str3.equals("A_AC3");
                            c = 16;
                            break;
                        case 62927045:
                            boolean equals16 = str3.equals("A_DTS");
                            c = 19;
                            break;
                        case 82318131:
                            boolean equals17 = str3.equals("V_AV1");
                            c = 2;
                            break;
                        case 82338133:
                            boolean equals18 = str3.equals("V_VP8");
                            c = 0;
                            break;
                        case 82338134:
                            boolean equals19 = str3.equals("V_VP9");
                            c = 1;
                            break;
                        case 99146302:
                            boolean equals20 = str3.equals("S_HDMV/PGS");
                            c = 28;
                            break;
                        case 444813526:
                            boolean equals21 = str3.equals("V_THEORA");
                            c = 10;
                            break;
                        case 542569478:
                            boolean equals22 = str3.equals("A_DTS/EXPRESS");
                            c = 20;
                            break;
                        case 725957860:
                            boolean equals23 = str3.equals("A_PCM/INT/LIT");
                            c = 24;
                            break;
                        case 738597099:
                            boolean equals24 = str3.equals("S_TEXT/ASS");
                            c = 26;
                            break;
                        case 855502857:
                            boolean equals25 = str3.equals("V_MPEGH/ISO/HEVC");
                            c = 8;
                            break;
                        case 1422270023:
                            boolean equals26 = str3.equals("S_TEXT/UTF8");
                            c = 25;
                            break;
                        case 1809237540:
                            boolean equals27 = str3.equals("V_MPEG2");
                            c = 3;
                            break;
                        case 1950749482:
                            boolean equals28 = str3.equals("A_EAC3");
                            c = 17;
                            break;
                        case 1950789798:
                            boolean equals29 = str3.equals("A_FLAC");
                            c = 22;
                            break;
                        case 1951062397:
                            boolean equals30 = str3.equals("A_OPUS");
                            c = 12;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    String str4 = "audio/x-unknown";
                    ColorInfo colorInfo = null;
                    switch (c) {
                        case 0:
                            str4 = "video/x-vnd.on2.vp8";
                            break;
                        case 1:
                            str4 = "video/x-vnd.on2.vp9";
                            break;
                        case 2:
                            str4 = "video/av01";
                            break;
                        case 3:
                            str4 = "video/mpeg2";
                            break;
                        case 4:
                        case 5:
                        case 6:
                            byte[] bArr = d9u.A0k;
                            if (bArr == null) {
                                list = null;
                            } else {
                                list = Collections.singletonList(bArr);
                            }
                            str2 = "video/mp4v-es";
                            break;
                        case 7:
                            C29775D9f A002 = C29775D9f.A00(new D9O(d9u.A0k));
                            list2 = A002.A02;
                            d9u.A0Q = A002.A01;
                            str4 = "video/avc";
                            break;
                        case 8:
                            C29774D9e A003 = C29774D9e.A00(new D9O(d9u.A0k));
                            list2 = A003.A01;
                            d9u.A0Q = A003.A00;
                            str4 = "video/hevc";
                            break;
                        case 9:
                            D9O d9o = new D9O(d9u.A0k);
                            try {
                                d9o.A0D(16);
                                byte[] bArr2 = d9o.A02;
                                int i8 = d9o.A01;
                                int i9 = i8 + 1;
                                int i10 = i9 + 1;
                                int i11 = i10 + 1;
                                int i12 = i11 + 1;
                                long j = (((long) bArr2[i8]) & 255) | ((((long) bArr2[i9]) & 255) << 8) | ((((long) bArr2[i10]) & 255) << 16) | ((255 & ((long) bArr2[i11])) << 24);
                                if (j == 1482049860) {
                                    pair = new Pair("video/divx", (Object) null);
                                } else if (j == 859189832) {
                                    pair = new Pair("video/3gpp", (Object) null);
                                } else if (j == 826496599) {
                                    int i13 = i12 + 20;
                                    while (true) {
                                        int length = bArr2.length;
                                        if (i13 >= length - 4) {
                                            throw new C2101594l("Failed to find FourCC VC1 initialization data");
                                        } else if (bArr2[i13] == 0 && bArr2[i13 + 1] == 0 && bArr2[i13 + 2] == 1 && bArr2[i13 + 3] == 15) {
                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr2, i13, length)));
                                        } else {
                                            i13++;
                                        }
                                    }
                                } else {
                                    Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                    pair = new Pair("video/x-unknown", (Object) null);
                                }
                                str2 = (String) pair.first;
                                list = (List) pair.second;
                                break;
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                throw new C2101594l("Error parsing FourCC private data");
                            }
                        case 10:
                            str4 = "video/x-unknown";
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER:
                            byte[] bArr3 = d9u.A0k;
                            try {
                                if (bArr3[0] == 2) {
                                    int i14 = 1;
                                    int i15 = 0;
                                    while (true) {
                                        byte b = bArr3[i14];
                                        if (b == -1) {
                                            i15 += 255;
                                            i14++;
                                        } else {
                                            int i16 = i14 + 1;
                                            int i17 = i15 + b;
                                            int i18 = 0;
                                            while (true) {
                                                byte b2 = bArr3[i16];
                                                if (b2 == -1) {
                                                    i18 += 255;
                                                    i16++;
                                                } else {
                                                    int i19 = i16 + 1;
                                                    int i20 = i18 + b2;
                                                    if (bArr3[i19] == 1) {
                                                        byte[] bArr4 = new byte[i17];
                                                        System.arraycopy(bArr3, i19, bArr4, 0, i17);
                                                        int i21 = i19 + i17;
                                                        if (bArr3[i21] == 3) {
                                                            int i22 = i21 + i20;
                                                            if (bArr3[i22] == 5) {
                                                                int length2 = bArr3.length - i22;
                                                                byte[] bArr5 = new byte[length2];
                                                                System.arraycopy(bArr3, i22, bArr5, 0, length2);
                                                                list2 = new ArrayList(2);
                                                                list2.add(bArr4);
                                                                list2.add(bArr5);
                                                                str = "audio/vorbis";
                                                                i2 = 8192;
                                                                break;
                                                            } else {
                                                                r0 = new C2101594l("Error parsing vorbis codec private");
                                                            }
                                                        } else {
                                                            r0 = new C2101594l("Error parsing vorbis codec private");
                                                        }
                                                    } else {
                                                        r0 = new C2101594l("Error parsing vorbis codec private");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    r0 = new C2101594l("Error parsing vorbis codec private");
                                }
                                throw r0;
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                throw new C2101594l("Error parsing vorbis codec private");
                            }
                        case C120125Dh.VIEW_TYPE_SPINNER:
                            list2 = new ArrayList(3);
                            list2.add(d9u.A0k);
                            ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                            order.putLong(d9u.A0X);
                            list2.add(order.array());
                            ByteBuffer order2 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                            order2.putLong(d9u.A0Y);
                            list2.add(order2.array());
                            str = "audio/opus";
                            i2 = 5760;
                            break;
                        case C120125Dh.VIEW_TYPE_BADGE:
                            list = Collections.singletonList(d9u.A0k);
                            str2 = "audio/mp4a-latm";
                            break;
                        case C120125Dh.VIEW_TYPE_LINK:
                            str = "audio/mpeg-L2";
                            break;
                        case 15:
                            str = "audio/mpeg";
                            break;
                        case 16:
                            str4 = "audio/ac3";
                            break;
                        case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                            str4 = "audio/eac3";
                            break;
                        case 18:
                            d9u.A0c = new D9j();
                            str4 = "audio/true-hd";
                            break;
                        case 19:
                        case 20:
                            str4 = "audio/vnd.dts";
                            break;
                        case C120125Dh.VIEW_TYPE_BRANDING:
                            str4 = "audio/vnd.dts.hd";
                            break;
                        case C120125Dh.NUM_VIEW_TYPES:
                            list = Collections.singletonList(d9u.A0k);
                            str2 = "audio/flac";
                            break;
                        case 23:
                            D9O d9o2 = new D9O(d9u.A0k);
                            try {
                                byte[] bArr6 = d9o2.A02;
                                int i23 = d9o2.A01;
                                int i24 = i23 + 1;
                                d9o2.A01 = i24;
                                byte b3 = bArr6[i23] & 255;
                                d9o2.A01 = i24 + 1;
                                byte b4 = ((bArr6[i24] & 255) << 8) | b3;
                                boolean z2 = true;
                                if (b4 != 1) {
                                    if (b4 == 65534) {
                                        d9o2.A0C(24);
                                        if (d9o2.A04() == MatroskaExtractor.A0r.getMostSignificantBits() && d9o2.A04() == MatroskaExtractor.A0r.getLeastSignificantBits()) {
                                        }
                                    }
                                    z2 = false;
                                }
                                if (!z2) {
                                    sb = new StringBuilder("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
                                    break;
                                }
                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                throw new C2101594l("Error parsing MS/ACM codec private");
                            }
                        case 24:
                            int i25 = d9u.A0D;
                            int i26 = C25948Bd0.A00(i25);
                            if (i26 != 0) {
                                str = "audio/raw";
                                list = null;
                                i2 = -1;
                                break;
                            } else {
                                sb = new StringBuilder("Unsupported PCM bit depth: ");
                                sb.append(i25);
                                sb.append(". Setting mimeType to ");
                                break;
                            }
                        case 25:
                            str4 = "application/x-subrip";
                            break;
                        case OdexSchemeArtXdex.OREO_SDK_INT:
                            str4 = "text/x-ssa";
                            break;
                        case 27:
                            list2 = Collections.singletonList(d9u.A0k);
                            str4 = "application/vobsub";
                            break;
                        case 28:
                            str4 = "application/pgs";
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                            byte[] bArr7 = d9u.A0k;
                            list = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                            str2 = "application/dvbsubs";
                            break;
                        default:
                            throw new C2101594l("Unrecognized codec identifier.");
                    }
                }
                matroskaExtractor.A0K = null;
            } else if (i5 == 19899) {
                int i27 = matroskaExtractor.A08;
                if (i27 != -1) {
                    long j2 = matroskaExtractor.A0E;
                    if (j2 != -1) {
                        if (i27 == 475249515) {
                            matroskaExtractor.A0B = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new C2101594l("Mandatory element SeekID or SeekPosition not found");
            } else if (i5 == 25152) {
                D9U d9u2 = matroskaExtractor.A0K;
                if (d9u2.A0j) {
                    C29719D6g d6g = d9u2.A0a;
                    if (d6g != null) {
                        d9u2.A0Z = new DrmInitData((String) null, true, new DrmInitData.SchemeData(C29686D4x.A03, "video/webm", d6g.A03, false));
                        return;
                    }
                    throw new C2101594l("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (i5 == 28032) {
                D9U d9u3 = matroskaExtractor.A0K;
                if (d9u3.A0j && d9u3.A0m != null) {
                    throw new C2101594l("Combining encryption and compression is not supported");
                }
            } else if (i5 == 357149030) {
                if (matroskaExtractor.A0I == -9223372036854775807L) {
                    matroskaExtractor.A0I = 1000000;
                }
                long j3 = matroskaExtractor.A0C;
                if (j3 != -9223372036854775807L) {
                    matroskaExtractor.A0D = MatroskaExtractor.A01(matroskaExtractor, j3);
                }
            } else if (i5 != 374648427) {
                if (i5 == 475249515 && !matroskaExtractor.A0Q) {
                    C29790D9z d9z2 = matroskaExtractor.A0J;
                    long j4 = matroskaExtractor.A0G;
                    if (j4 != -1) {
                        long j5 = matroskaExtractor.A0D;
                        if (j5 != -9223372036854775807L) {
                            C25992Bdm bdm2 = matroskaExtractor.A0M;
                            C25992Bdm bdm3 = bdm2;
                            if (!(bdm2 == null || (i3 = bdm2.A00) == 0 || (bdm = matroskaExtractor.A0L) == null)) {
                                int i28 = bdm.A00;
                                int i29 = i28;
                                if (i28 == i3) {
                                    int[] iArr = new int[i3];
                                    long[] jArr = new long[i3];
                                    long[] jArr2 = new long[i3];
                                    long[] jArr3 = new long[i3];
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < i3; i31++) {
                                        C25992Bdm bdm4 = bdm3;
                                        if (i31 < 0 || i31 >= i3) {
                                            throw new IndexOutOfBoundsException(AnonymousClass000.A07("Invalid index ", i31, ", size is ", i3));
                                        }
                                        jArr3[i31] = bdm4.A01[i31];
                                        if (i31 < 0 || i31 >= i29) {
                                            throw new IndexOutOfBoundsException(AnonymousClass000.A07("Invalid index ", i31, ", size is ", i29));
                                        }
                                        jArr[i31] = j4 + bdm.A01[i31];
                                    }
                                    while (true) {
                                        i4 = i3 - 1;
                                        if (i30 >= i4) {
                                            break;
                                        }
                                        int i32 = i30 + 1;
                                        iArr[i30] = (int) (jArr[i32] - jArr[i30]);
                                        jArr2[i30] = jArr3[i32] - jArr3[i30];
                                        i30 = i32;
                                    }
                                    iArr[i4] = (int) ((j4 + matroskaExtractor.A0H) - jArr[i4]);
                                    jArr2[i4] = j5 - jArr3[i4];
                                    matroskaExtractor.A0M = null;
                                    matroskaExtractor.A0L = null;
                                    d8b = new D50(iArr, jArr, jArr2, jArr3);
                                    d9z2.Bet(d8b);
                                    matroskaExtractor.A0Q = true;
                                }
                            }
                        }
                    }
                    matroskaExtractor.A0M = null;
                    matroskaExtractor.A0L = null;
                    d8b = new C29688D5a(matroskaExtractor.A0D, 0);
                    d9z2.Bet(d8b);
                    matroskaExtractor.A0Q = true;
                }
            } else if (matroskaExtractor.A0c.size() != 0) {
                matroskaExtractor.A0J.ADE();
            } else {
                throw new C2101594l("No valid tracks were found");
            }
        } else if (matroskaExtractor.A04 == 2) {
            int i33 = 0;
            for (int i34 = 0; i34 < matroskaExtractor.A02; i34++) {
                i33 += matroskaExtractor.A0R[i34];
            }
            D9U d9u4 = (D9U) matroskaExtractor.A0c.get(matroskaExtractor.A05);
            for (int i35 = 0; i35 < matroskaExtractor.A02; i35++) {
                long j6 = ((long) ((d9u4.A0I * i35) / 1000)) + matroskaExtractor.A09;
                int i36 = matroskaExtractor.A01;
                if (i35 == 0 && !matroskaExtractor.A0N) {
                    i36 |= 1;
                }
                int i37 = matroskaExtractor.A0R[i35];
                i33 -= i37;
                MatroskaExtractor.A05(matroskaExtractor, d9u4, j6, i36, i37, i33);
            }
            matroskaExtractor.A04 = 0;
        }
    }

    public final void AEa(int i, double d) {
        MatroskaExtractor matroskaExtractor = this.A00;
        if (i == 181) {
            matroskaExtractor.A0K.A0T = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    matroskaExtractor.A0K.A06 = (float) d;
                    return;
                case 21970:
                    matroskaExtractor.A0K.A07 = (float) d;
                    return;
                case 21971:
                    matroskaExtractor.A0K.A04 = (float) d;
                    return;
                case 21972:
                    matroskaExtractor.A0K.A05 = (float) d;
                    return;
                case 21973:
                    matroskaExtractor.A0K.A02 = (float) d;
                    return;
                case 21974:
                    matroskaExtractor.A0K.A03 = (float) d;
                    return;
                case 21975:
                    matroskaExtractor.A0K.A0B = (float) d;
                    return;
                case 21976:
                    matroskaExtractor.A0K.A0C = (float) d;
                    return;
                case 21977:
                    matroskaExtractor.A0K.A00 = (float) d;
                    return;
                case 21978:
                    matroskaExtractor.A0K.A01 = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            matroskaExtractor.A0K.A0A = (float) d;
                            return;
                        case 30324:
                            matroskaExtractor.A0K.A08 = (float) d;
                            return;
                        case 30325:
                            matroskaExtractor.A0K.A09 = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            matroskaExtractor.A0C = (long) d;
        }
    }

    public final void Adl(int i, long j) {
        MatroskaExtractor matroskaExtractor = this.A00;
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        matroskaExtractor.A0K.A0V = (int) j;
                        return;
                    case 136:
                        D9U d9u = matroskaExtractor.A0K;
                        if (j == 1) {
                            z = true;
                        }
                        d9u.A0g = z;
                        return;
                    case 155:
                        MatroskaExtractor.A01(matroskaExtractor, j);
                        return;
                    case 159:
                        matroskaExtractor.A0K.A0E = (int) j;
                        return;
                    case 176:
                        matroskaExtractor.A0K.A0W = (int) j;
                        return;
                    case 179:
                        matroskaExtractor.A0M.A00(MatroskaExtractor.A01(matroskaExtractor, j));
                        return;
                    case 186:
                        matroskaExtractor.A0K.A0M = (int) j;
                        return;
                    case 215:
                        matroskaExtractor.A0K.A0R = (int) j;
                        return;
                    case 231:
                        matroskaExtractor.A0A = MatroskaExtractor.A01(matroskaExtractor, j);
                        return;
                    case 238:
                        matroskaExtractor.A00 = (int) j;
                        return;
                    case 241:
                        if (!matroskaExtractor.A0P) {
                            matroskaExtractor.A0L.A00(j);
                            matroskaExtractor.A0P = true;
                            return;
                        }
                        return;
                    case 251:
                        matroskaExtractor.A0N = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new C2101594l(AnonymousClass000.A0C("ContentCompAlgo ", j, " not supported"));
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new C2101594l(AnonymousClass000.A0C("DocTypeReadVersion ", j, " not supported"));
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new C2101594l(AnonymousClass000.A0C("EBMLReadVersion ", j, " not supported"));
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new C2101594l(AnonymousClass000.A0C("ContentEncAlgo ", j, " not supported"));
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new C2101594l(AnonymousClass000.A0C("AESSettingsCipherMode ", j, " not supported"));
                        }
                        return;
                    case 21420:
                        matroskaExtractor.A0E = j + matroskaExtractor.A0G;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            matroskaExtractor.A0K.A0U = 0;
                            return;
                        } else if (i2 == 1) {
                            matroskaExtractor.A0K.A0U = 2;
                            return;
                        } else if (i2 == 3) {
                            matroskaExtractor.A0K.A0U = 1;
                            return;
                        } else if (i2 == 15) {
                            matroskaExtractor.A0K.A0U = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        matroskaExtractor.A0K.A0L = (int) j;
                        return;
                    case 21682:
                        matroskaExtractor.A0K.A0K = (int) j;
                        return;
                    case 21690:
                        matroskaExtractor.A0K.A0J = (int) j;
                        return;
                    case 21930:
                        D9U d9u2 = matroskaExtractor.A0K;
                        if (j == 1) {
                            z = true;
                        }
                        d9u2.A0h = z;
                        return;
                    case 21998:
                        matroskaExtractor.A0K.A0N = (int) j;
                        return;
                    case 22186:
                        matroskaExtractor.A0K.A0X = j;
                        return;
                    case 22203:
                        matroskaExtractor.A0K.A0Y = j;
                        return;
                    case 25188:
                        matroskaExtractor.A0K.A0D = (int) j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        if (i3 == 0) {
                            matroskaExtractor.A0K.A0S = 0;
                            return;
                        } else if (i3 == 1) {
                            matroskaExtractor.A0K.A0S = 1;
                            return;
                        } else if (i3 == 2) {
                            matroskaExtractor.A0K.A0S = 2;
                            return;
                        } else if (i3 == 3) {
                            matroskaExtractor.A0K.A0S = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        matroskaExtractor.A0K.A0I = (int) j;
                        return;
                    case 2807729:
                        matroskaExtractor.A0I = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    matroskaExtractor.A0K.A0F = 2;
                                    return;
                                } else if (i4 == 2) {
                                    matroskaExtractor.A0K.A0F = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        matroskaExtractor.A0K.A0H = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        matroskaExtractor.A0K.A0H = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                matroskaExtractor.A0K.A0H = 3;
                                return;
                            case 21947:
                                D9U d9u3 = matroskaExtractor.A0K;
                                d9u3.A0i = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    d9u3.A0G = 1;
                                    return;
                                } else if (i6 == 9) {
                                    d9u3.A0G = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    d9u3.A0G = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                matroskaExtractor.A0K.A0O = (int) j;
                                return;
                            case 21949:
                                matroskaExtractor.A0K.A0P = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new C2101594l(AnonymousClass000.A0C("ContentEncodingScope ", j, " not supported"));
            }
        } else if (j != 0) {
            throw new C2101594l(AnonymousClass000.A0C("ContentEncodingOrder ", j, " not supported"));
        }
    }

    public final void Bpr(int i, long j, long j2) {
        MatroskaExtractor matroskaExtractor = this.A00;
        if (i == 160) {
            matroskaExtractor.A0N = false;
        } else if (i == 174) {
            matroskaExtractor.A0K = new D9U();
        } else if (i == 187) {
            matroskaExtractor.A0P = false;
        } else if (i == 19899) {
            matroskaExtractor.A08 = -1;
            matroskaExtractor.A0E = -1;
        } else if (i == 20533) {
            matroskaExtractor.A0K.A0j = true;
        } else if (i == 21968) {
            matroskaExtractor.A0K.A0i = true;
        } else if (i == 25152) {
        } else {
            if (i == 408125543) {
                long j3 = matroskaExtractor.A0G;
                if (j3 == -1 || j3 == j) {
                    matroskaExtractor.A0G = j;
                    matroskaExtractor.A0H = j2;
                    return;
                }
                throw new C2101594l("Multiple Segment elements not supported");
            } else if (i == 475249515) {
                matroskaExtractor.A0M = new C25992Bdm();
                matroskaExtractor.A0L = new C25992Bdm();
            } else if (i == 524531317 && !matroskaExtractor.A0Q) {
                if (!matroskaExtractor.A0p || matroskaExtractor.A0B == -1) {
                    matroskaExtractor.A0J.Bet(new C29688D5a(matroskaExtractor.A0D, 0));
                    matroskaExtractor.A0Q = true;
                    return;
                }
                matroskaExtractor.A0O = true;
            }
        }
    }

    public final void Bqe(int i, String str) {
        MatroskaExtractor matroskaExtractor = this.A00;
        if (i == 134) {
            matroskaExtractor.A0K.A0d = str;
        } else if (i != 17026) {
            if (i == 21358) {
                matroskaExtractor.A0K.A0f = str;
            } else if (i == 2274716) {
                matroskaExtractor.A0K.A0e = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new C2101594l(AnonymousClass000.A0J("DocType ", str, " not supported"));
        }
    }

    public final int AKx(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final boolean AgA(int i) {
        if (i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427) {
            return true;
        }
        return false;
    }
}
