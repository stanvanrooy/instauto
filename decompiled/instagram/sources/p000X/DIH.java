package p000X;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.DIH */
public final class DIH implements D71 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public AudioTrack A0A;
    public DAX A0B;
    public DIX A0C;
    public DIG A0D;
    public C29744D7q A0E;
    public DIJ A0F;
    public boolean A0G;
    public DIV[] A0H;
    public ByteBuffer[] A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public long A0M;
    public long A0N;
    public DAX A0O;
    public DIJ A0P;
    public ByteBuffer A0Q;
    public ByteBuffer A0R;
    public ByteBuffer A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public byte[] A0W;
    public final ConditionVariable A0X = new ConditionVariable(true);
    public final C2112099b A0Y;
    public final DII A0Z = new DII(new DIF(this));
    public final DIN A0a;
    public final C29951DIb A0b;
    public final DIM A0c;
    public final ArrayDeque A0d;
    public final DIV[] A0e;
    public final DIV[] A0f;

    public static int A00(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private void A08(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.A0S;
            boolean z = true;
            int i = 0;
            if (byteBuffer3 != null) {
                boolean z2 = false;
                if (byteBuffer3 == byteBuffer) {
                    z2 = true;
                }
                D6U.A02(z2);
            } else {
                this.A0S = byteBuffer;
                if (C25948Bd0.A00 < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.A0W;
                    if (bArr == null || bArr.length < remaining) {
                        this.A0W = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.A0W, 0, remaining);
                    byteBuffer.position(position);
                    this.A0L = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C25948Bd0.A00 < 21) {
                DII dii = this.A0Z;
                int A002 = dii.A00 - ((int) (this.A0N - (DII.A00(dii) * ((long) dii.A02))));
                if (A002 > 0 && (i = this.A0A.write(this.A0W, this.A0L, Math.min(remaining2, A002))) > 0) {
                    this.A0L += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else if (this.A0G) {
                long j2 = j;
                if (j == -9223372036854775807L) {
                    z = false;
                }
                D6U.A03(z);
                i = A01(this.A0A, byteBuffer2, remaining2, j2);
            } else {
                i = A00(this.A0A, byteBuffer, remaining2);
            }
            this.A04 = SystemClock.elapsedRealtime();
            if (i >= 0) {
                boolean z3 = this.A0F.A08;
                if (z3) {
                    this.A0N += (long) i;
                }
                if (i == remaining2) {
                    if (!z3) {
                        this.A0M += (long) this.A0K;
                    }
                    this.A0S = null;
                    return;
                }
                return;
            }
            throw new D8S(i);
        }
    }

    public final void BXF() {
        this.A0U = true;
        AudioTrack audioTrack = this.A0A;
        boolean z = false;
        if (audioTrack != null) {
            z = true;
        }
        if (z) {
            DIT dit = this.A0Z.A0I;
            D6U.A01(dit);
            if (dit.A05 != null) {
                DIT.A00(dit, 0);
            }
            audioTrack.play();
        }
    }

    public final void pause() {
        boolean z;
        this.A0U = false;
        AudioTrack audioTrack = this.A0A;
        boolean z2 = false;
        if (audioTrack != null) {
            z2 = true;
        }
        if (z2) {
            DII dii = this.A0Z;
            dii.A0E = 0;
            dii.A04 = 0;
            dii.A01 = 0;
            dii.A09 = 0;
            if (dii.A0G == -9223372036854775807L) {
                DIT dit = dii.A0I;
                D6U.A01(dit);
                if (dit.A05 != null) {
                    DIT.A00(dit, 0);
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                audioTrack.pause();
            }
        }
    }

    public DIH(C2112099b r9, DIV[] divArr) {
        DIP dip = new DIP(divArr);
        this.A0Y = r9;
        D6U.A01(dip);
        this.A0b = dip;
        DIN din = new DIN();
        this.A0a = din;
        DIM dim = new DIM();
        this.A0c = dim;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new DIS[]{new DIO(), din, dim});
        Collections.addAll(arrayList, dip.AGM());
        this.A0f = (DIV[]) arrayList.toArray(new DIV[0]);
        this.A0e = new DIV[]{new DIK()};
        this.A00 = 1.0f;
        this.A03 = 0;
        this.A0C = DIX.A03;
        this.A01 = 0;
        this.A0E = new C29744D7q();
        this.A0B = DAX.A04;
        this.A02 = -1;
        this.A0H = new DIV[0];
        this.A0I = new ByteBuffer[0];
        this.A0d = new ArrayDeque();
    }

    private int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        ByteBuffer byteBuffer2 = byteBuffer;
        AudioTrack audioTrack2 = audioTrack;
        int i2 = i;
        if (C25948Bd0.A00 >= 26) {
            return audioTrack2.write(byteBuffer2, i2, 1, j * 1000);
        }
        if (this.A0Q == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A0Q = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A0Q.putInt(1431633921);
        }
        if (this.A0J == 0) {
            this.A0Q.putInt(4, i);
            this.A0Q.putLong(8, j * 1000);
            this.A0Q.position(0);
            this.A0J = i;
        }
        int remaining = this.A0Q.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A0Q, remaining, 1);
            if (write < 0) {
                this.A0J = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i, 1);
        if (write2 < 0) {
            this.A0J = 0;
            return write2;
        }
        this.A0J -= write2;
        return write2;
    }

    public static long A02(DIH dih) {
        DIJ dij = dih.A0F;
        if (dij.A08) {
            return dih.A0N / ((long) dij.A05);
        }
        return dih.A0M;
    }

    private void A03() {
        if (!this.A0V) {
            this.A0V = true;
            DII dii = this.A0Z;
            long A022 = A02(this);
            dii.A0F = DII.A00(dii);
            dii.A0G = SystemClock.elapsedRealtime() * 1000;
            dii.A06 = A022;
            this.A0A.stop();
            this.A0J = 0;
        }
    }

    private void A04() {
        AudioTrack audioTrack = this.A0A;
        boolean z = false;
        if (audioTrack != null) {
            z = true;
        }
        if (!z) {
            return;
        }
        if (C25948Bd0.A00 >= 21) {
            A06(audioTrack, this.A00);
            return;
        }
        float f = this.A00;
        audioTrack.setStereoVolume(f, f);
    }

    private void A05(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0H.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.A0I[i - 1];
            } else {
                byteBuffer = this.A0R;
                if (byteBuffer == null) {
                    byteBuffer = DIV.A00;
                }
            }
            if (i == length) {
                A08(byteBuffer, j);
            } else {
                DIV div = this.A0H[i];
                div.BYp(byteBuffer);
                ByteBuffer ARL = div.ARL();
                this.A0I[i] = ARL;
                if (ARL.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private void A07(DAX dax, long j) {
        DAX dax2;
        if (this.A0F.A07) {
            dax2 = this.A0b.A5g(dax);
        } else {
            dax2 = DAX.A04;
        }
        this.A0d.add(new C29952DIc(dax2, Math.max(0, j), (A02(this) * 1000000) / ((long) this.A0F.A06)));
        DIV[] divArr = this.A0F.A0A;
        ArrayList arrayList = new ArrayList();
        for (DIV div : divArr) {
            if (div.Ae3()) {
                arrayList.add(div);
            } else {
                div.flush();
            }
        }
        int size = arrayList.size();
        this.A0H = (DIV[]) arrayList.toArray(new DIV[size]);
        this.A0I = new ByteBuffer[size];
        int i = 0;
        while (true) {
            DIV[] divArr2 = this.A0H;
            if (i < divArr2.length) {
                DIV div2 = divArr2[i];
                div2.flush();
                this.A0I[i] = div2.ARL();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r9.A0S != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    private boolean A09() {
        boolean z;
        int i;
        DIV[] divArr;
        int length;
        if (this.A02 == -1) {
            if (this.A0F.A09) {
                length = 0;
            } else {
                length = this.A0H.length;
            }
            this.A02 = length;
        } else {
            z = false;
            i = this.A02;
            divArr = this.A0H;
            if (i >= divArr.length) {
                DIV div = divArr[i];
                if (z) {
                    div.BYo();
                }
                A05(-9223372036854775807L);
                if (div.AfJ()) {
                    this.A02++;
                }
            } else {
                ByteBuffer byteBuffer = this.A0S;
                if (byteBuffer != null) {
                    A08(byteBuffer, -9223372036854775807L);
                }
                this.A02 = -1;
                return true;
            }
            return false;
        }
        z = true;
        i = this.A02;
        divArr = this.A0H;
        if (i >= divArr.length) {
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r6 == 4) goto L_0x002c;
     */
    public final void A9I(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) {
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr2 = iArr;
        boolean z2 = false;
        int i13 = i2;
        if (C25948Bd0.A00 < 21 && i13 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i14 = 0; i14 < 6; i14++) {
                iArr2[i14] = i14;
            }
        }
        int i15 = i;
        boolean A0B2 = C25948Bd0.A0B(i15);
        if (A0B2) {
            z = true;
        }
        z = false;
        DIV[] divArr = this.A0f;
        int i16 = i3;
        if (z) {
            DIM dim = this.A0c;
            dim.A03 = i5;
            dim.A02 = i6;
            this.A0a.A01 = iArr2;
            DIU diu = new DIU(i16, i13, i15);
            int length = divArr.length;
            DIU diu2 = diu;
            int i17 = 0;
            while (i17 < length) {
                DIV div = divArr[i17];
                try {
                    diu = div.A9H(diu2);
                    if (div.Ae3()) {
                        diu2 = diu;
                    }
                    i17++;
                } catch (DIZ e) {
                    throw new DC3((Throwable) e);
                }
            }
            i7 = diu.A03;
            i8 = diu.A01;
            i9 = diu.A02;
        } else {
            i9 = i15;
            i8 = i13;
            i7 = i16;
        }
        int i18 = i8;
        int i19 = C25948Bd0.A00;
        if (i19 <= 28 && !A0B2) {
            if (i8 == 7) {
                i18 = 8;
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                i18 = 6;
            }
        }
        if (i19 <= 26 && "fugu".equals(C25948Bd0.A01) && !A0B2 && i18 == 1) {
            i18 = 2;
        }
        switch (i18) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 12;
                break;
            case 3:
                i10 = 28;
                break;
            case 4:
                i10 = 204;
                break;
            case 5:
                i10 = 220;
                break;
            case 6:
                i10 = 252;
                break;
            case 7:
                i10 = 1276;
                break;
            case 8:
                if (i19 >= 23 || i19 >= 21) {
                    i10 = 6396;
                    break;
                }
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            if (A0B2) {
                i11 = C25948Bd0.A01(i15, i13);
            } else {
                i11 = -1;
            }
            if (A0B2) {
                i12 = C25948Bd0.A01(i9, i8);
            } else {
                i12 = -1;
            }
            if (z) {
                z2 = true;
            }
            DIJ dij = new DIJ(A0B2, i11, i16, i12, i7, i10, i9, i4, z, z2, divArr);
            boolean z3 = false;
            if (this.A0A != null) {
                z3 = true;
            }
            if (z3) {
                this.A0P = dij;
            } else {
                this.A0F = dij;
            }
        } else {
            throw new DC3(AnonymousClass000.A05("Unsupported channel count: ", i8));
        }
    }

    public final void AC5() {
        if (this.A0G) {
            this.A0G = false;
            this.A01 = 0;
            flush();
        }
    }

    public final void AD7(int i) {
        boolean z = false;
        if (C25948Bd0.A00 >= 21) {
            z = true;
        }
        D6U.A03(z);
        if (!this.A0G || this.A01 != i) {
            this.A0G = true;
            this.A01 = i;
            flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (r12 == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0100, code lost:
        if (r12 != false) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a5 A[Catch:{ Exception -> 0x01ad }] */
    public final long AJV(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z2;
        Method method;
        long max;
        long j7;
        long j8;
        boolean z3 = false;
        if (this.A0A != null) {
            z3 = true;
        }
        if (!z3 || this.A03 == 0) {
            return Long.MIN_VALUE;
        }
        DII dii = this.A0Z;
        AudioTrack audioTrack = dii.A0H;
        D6U.A01(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long A002 = (DII.A00(dii) * 1000000) / ((long) dii.A03);
            if (A002 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - dii.A09 >= 30000) {
                    long[] jArr = dii.A0O;
                    int i = dii.A01;
                    jArr[i] = A002 - nanoTime;
                    dii.A01 = (i + 1) % 10;
                    int i2 = dii.A04;
                    if (i2 < 10) {
                        dii.A04 = i2 + 1;
                    }
                    dii.A09 = nanoTime;
                    dii.A0E = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = dii.A04;
                        if (i3 >= i4) {
                            break;
                        }
                        dii.A0E += jArr[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!dii.A0M) {
                    long j9 = A002;
                    DIT dit = dii.A0I;
                    D6U.A01(dit);
                    DIY diy = dit.A05;
                    if (diy != null && nanoTime - dit.A03 >= dit.A04) {
                        dit.A03 = nanoTime;
                        z2 = diy.A04.getTimestamp(diy.A03);
                        if (z2) {
                            long j10 = diy.A03.framePosition;
                            if (diy.A01 > j10) {
                                diy.A02++;
                            }
                            diy.A01 = j10;
                            diy.A00 = j10 + (diy.A02 << 32);
                        }
                        int i5 = dit.A00;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            } else if (z2) {
                                if (dit.A05.A00 > dit.A01) {
                                    DIT.A00(dit, 2);
                                }
                            }
                            if (dit.A05 != null) {
                                DIT.A00(dit, 0);
                            }
                        } else if (z2) {
                            DIY diy2 = dit.A05;
                            if (diy2.A03.nanoTime / 1000 >= dit.A02) {
                                dit.A01 = diy2.A00;
                                DIT.A00(dit, 1);
                            }
                        } else if (nanoTime - dit.A02 > 500000) {
                            DIT.A00(dit, 3);
                        }
                        if (z2) {
                            DIY diy3 = dit.A05;
                            if (diy3 != null) {
                                j7 = diy3.A03.nanoTime / 1000;
                            } else {
                                j7 = -9223372036854775807L;
                            }
                            if (diy3 != null) {
                                j8 = diy3.A00;
                            } else {
                                j8 = -1;
                            }
                            if (Math.abs(j7 - nanoTime) > 5000000) {
                                dii.A0N.BQb(j8, j7, nanoTime, j9);
                            } else if (Math.abs(((j8 * 1000000) / ((long) dii.A03)) - A002) > 5000000) {
                                dii.A0N.BEl(j8, j7, nanoTime, j9);
                            } else if (dit.A00 == 4 && diy3 != null) {
                                DIT.A00(dit, 0);
                            }
                            DIT.A00(dit, 4);
                        }
                        if (dii.A0L && (method = dii.A0J) != null && nanoTime - dii.A08 >= 500000) {
                            AudioTrack audioTrack2 = dii.A0H;
                            D6U.A01(audioTrack2);
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - dii.A05;
                            dii.A0B = intValue;
                            max = Math.max(intValue, 0);
                            dii.A0B = max;
                            if (max > 5000000) {
                                dii.A0N.B7r(max);
                                dii.A0B = 0;
                            }
                            dii.A08 = nanoTime;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                    try {
                        AudioTrack audioTrack22 = dii.A0H;
                        D6U.A01(audioTrack22);
                        long intValue2 = (((long) ((Integer) method.invoke(audioTrack22, new Object[0])).intValue()) * 1000) - dii.A05;
                        dii.A0B = intValue2;
                        max = Math.max(intValue2, 0);
                        dii.A0B = max;
                        if (max > 5000000) {
                        }
                    } catch (Exception unused) {
                        dii.A0J = null;
                    }
                    dii.A08 = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        DIT dit2 = dii.A0I;
        D6U.A01(dit2);
        int i6 = dit2.A00;
        boolean z4 = true;
        if (!(i6 == 1 || i6 == 2)) {
            z4 = false;
        }
        if (z4) {
            DIY diy4 = dit2.A05;
            if (diy4 != null) {
                j5 = diy4.A00;
            } else {
                j5 = -1;
            }
            j = (j5 * 1000000) / ((long) dii.A03);
            boolean z5 = false;
            if (i6 == 2) {
                z5 = true;
            }
            if (z5) {
                if (diy4 != null) {
                    j6 = diy4.A03.nanoTime / 1000;
                } else {
                    j6 = -9223372036854775807L;
                }
                j += nanoTime2 - j6;
            }
        } else {
            if (dii.A04 == 0) {
                j = (DII.A00(dii) * 1000000) / ((long) dii.A03);
            } else {
                j = nanoTime2 + dii.A0E;
            }
            if (!z) {
                j -= dii.A0B;
            }
        }
        long min = Math.min(j, (A02(this) * 1000000) / ((long) this.A0F.A06));
        long j11 = this.A07;
        C29952DIc dIc = null;
        while (!this.A0d.isEmpty() && min >= ((C29952DIc) this.A0d.getFirst()).A01) {
            dIc = (C29952DIc) this.A0d.remove();
        }
        if (dIc != null) {
            this.A0B = dIc.A02;
            this.A06 = dIc.A01;
            this.A05 = dIc.A00 - this.A07;
        }
        if (this.A0B.A01 == 1.0f) {
            j4 = (min + this.A05) - this.A06;
        } else {
            if (this.A0d.isEmpty()) {
                j2 = this.A05;
                j3 = this.A0b.APk(min - this.A06);
            } else {
                j2 = this.A05;
                j3 = min - this.A06;
                float f = this.A0B.A01;
                if (f != 1.0f) {
                    j3 = Math.round(((double) j3) * ((double) f));
                }
            }
            j4 = j2 + j3;
        }
        return j11 + j4 + ((this.A0b.AWA() * 1000000) / ((long) this.A0F.A06));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e4, code lost:
        if (r5 != 3) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e8, code lost:
        if (r5 != 11) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ef, code lost:
        if (r5 != 8) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.A03 != r5.A03) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x045b, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r1) < 200) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r25 == r2) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        if (r0 == 0) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    public final boolean AbF(ByteBuffer byteBuffer, long j) {
        boolean z;
        boolean z2;
        C29953DId dId;
        boolean z3;
        long j2;
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        AudioTrack audioTrack;
        boolean z4;
        long j3;
        boolean z5;
        ByteBuffer byteBuffer2 = this.A0R;
        ByteBuffer byteBuffer3 = byteBuffer;
        if (byteBuffer2 != null) {
            z = false;
        }
        z = true;
        D6U.A02(z);
        long j4 = j;
        if (this.A0P != null) {
            if (A09()) {
                DIJ dij = this.A0P;
                DIJ dij2 = this.A0F;
                if (dij2.A04 == dij.A04 && dij2.A06 == dij.A06) {
                    z5 = true;
                }
                z5 = false;
                if (!z5) {
                    A03();
                    if (!Ac2()) {
                        flush();
                    }
                } else {
                    this.A0F = dij;
                    this.A0P = null;
                }
                A07(this.A0B, j4);
            }
            return false;
        }
        boolean z6 = false;
        if (this.A0A != null) {
            z6 = true;
        }
        if (!z6) {
            long j5 = j4;
            this.A0X.block();
            DIJ dij3 = this.A0F;
            D6U.A01(dij3);
            boolean z7 = this.A0G;
            DIX dix = this.A0C;
            int i9 = this.A01;
            if (C25948Bd0.A00 >= 21) {
                audioTrack = DIJ.A00(dij3, z7, dix, i9);
            } else {
                switch (dix.A02) {
                    case 2:
                        i8 = 0;
                        break;
                    case 3:
                        i8 = 8;
                        break;
                    case 4:
                        i8 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i8 = 5;
                        break;
                    case 6:
                        i8 = 2;
                        break;
                    case C120125Dh.VIEW_TYPE_BADGE:
                        i8 = 1;
                        break;
                    default:
                        i8 = 3;
                        break;
                }
                if (i9 == 0) {
                    audioTrack = new AudioTrack(i8, dij3.A06, dij3.A03, dij3.A04, dij3.A00, 1);
                } else {
                    audioTrack = new AudioTrack(i8, dij3.A06, dij3.A03, dij3.A04, dij3.A00, 1, i9);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                this.A0A = audioTrack;
                int audioSessionId = audioTrack.getAudioSessionId();
                if (this.A01 != audioSessionId) {
                    this.A01 = audioSessionId;
                    DIG dig = this.A0D;
                    if (dig != null) {
                        dig.Asd(audioSessionId);
                    }
                }
                A07(this.A0B, j5);
                DII dii = this.A0Z;
                AudioTrack audioTrack2 = this.A0A;
                DIJ dij4 = this.A0F;
                int i10 = dij4.A04;
                int i11 = dij4.A05;
                int i12 = dij4.A00;
                dii.A0H = audioTrack2;
                dii.A02 = i11;
                dii.A00 = i12;
                dii.A0I = new DIT(audioTrack2);
                int sampleRate = audioTrack2.getSampleRate();
                dii.A03 = sampleRate;
                if (C25948Bd0.A00 >= 23 || !(i10 == 5 || i10 == 6)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                dii.A0M = z4;
                boolean A0B2 = C25948Bd0.A0B(i10);
                dii.A0L = A0B2;
                if (A0B2) {
                    j3 = (((long) (i12 / i11)) * 1000000) / ((long) sampleRate);
                } else {
                    j3 = -9223372036854775807L;
                }
                dii.A05 = j3;
                dii.A0A = 0;
                dii.A0D = 0;
                dii.A0C = 0;
                dii.A0K = false;
                dii.A0G = -9223372036854775807L;
                dii.A07 = -9223372036854775807L;
                dii.A0B = 0;
                A04();
                if (this.A0U) {
                    BXF();
                }
            } else {
                try {
                    audioTrack.release();
                } catch (Exception unused) {
                }
                throw new C176557gO(state, dij3.A06, dij3.A03, dij3.A00);
            }
        }
        DII dii2 = this.A0Z;
        long A022 = A02(this);
        AudioTrack audioTrack3 = dii2.A0H;
        D6U.A01(audioTrack3);
        int playState = audioTrack3.getPlayState();
        if (dii2.A0M) {
            if (playState == 2) {
                dii2.A0K = false;
                z2 = false;
            } else if (playState == 1 && DII.A00(dii2) == 0) {
                z2 = false;
            }
            if (z2) {
                if (this.A0R == null) {
                    if (byteBuffer3.hasRemaining()) {
                        DIJ dij5 = this.A0F;
                        if (!dij5.A08 && this.A0K == 0) {
                            int i13 = dij5.A04;
                            if (i13 == 7 || i13 == 8) {
                                ByteBuffer byteBuffer4 = byteBuffer3;
                                int position = byteBuffer4.position();
                                byte b2 = byteBuffer4.get(position);
                                if (b2 != -2) {
                                    if (b2 == -1) {
                                        i3 = (byteBuffer4.get(position + 4) & 7) << 4;
                                        i5 = position + 7;
                                    } else if (b2 != 31) {
                                        i = (byteBuffer4.get(position + 4) & 1) << 6;
                                        i2 = position + 5;
                                    } else {
                                        i3 = (byteBuffer4.get(position + 5) & 7) << 4;
                                        i5 = position + 6;
                                    }
                                    b = byteBuffer4.get(i5) & 60;
                                    i4 = (((b >> 2) | i3) + 1) << 5;
                                } else {
                                    i = (byteBuffer4.get(position + 5) & 1) << 6;
                                    i2 = position + 4;
                                }
                                b = byteBuffer4.get(i2) & 252;
                                i4 = (((b >> 2) | i3) + 1) << 5;
                            } else if (i13 == 5) {
                                i4 = 1536;
                            } else if (i13 == 6 || i13 == 18) {
                                ByteBuffer byteBuffer5 = byteBuffer3;
                                int i14 = 6;
                                if (((byteBuffer5.get(byteBuffer5.position() + 4) & 192) >> 6) != 3) {
                                    i14 = DAC.A00[(byteBuffer5.get(byteBuffer5.position() + 4) & 48) >> 4];
                                }
                                i4 = i14 << 8;
                            } else if (i13 == 17) {
                                ByteBuffer byteBuffer6 = byteBuffer3;
                                byte[] bArr = new byte[16];
                                int position2 = byteBuffer6.position();
                                byteBuffer6.get(bArr);
                                byteBuffer6.position(position2);
                                DA0 da0 = new DA0(bArr);
                                da0.A01(16);
                                if (da0.A01(16) == 65535) {
                                    da0.A01(24);
                                }
                                if (da0.A01(2) == 3) {
                                    do {
                                        da0.A01(2);
                                    } while (da0.A02());
                                }
                                int A012 = da0.A01(10);
                                if (da0.A02() && da0.A01(3) > 0) {
                                    int i15 = da0.A02 + 0;
                                    da0.A02 = i15;
                                    int i16 = da0.A00 + 2;
                                    da0.A00 = i16;
                                    if (i16 > 7) {
                                        da0.A02 = i15 + 1;
                                        da0.A00 = i16 - 8;
                                    }
                                    DA0.A00(da0);
                                }
                                char c = 44100;
                                if (da0.A02()) {
                                    c = 48000;
                                }
                                int A013 = da0.A01(4);
                                if (c == 44100 && A013 == 13) {
                                    i7 = C29789D9y.A00[A013];
                                } else {
                                    if (c == 48000) {
                                        int[] iArr = C29789D9y.A00;
                                        if (A013 < iArr.length) {
                                            i7 = iArr[A013];
                                            int i17 = A012 % 5;
                                            if (i17 != 1) {
                                                if (i17 != 2) {
                                                    if (i17 != 3) {
                                                        if (i17 == 4) {
                                                        }
                                                    }
                                                }
                                                if (A013 != 8) {
                                                }
                                                i7++;
                                            }
                                            if (A013 != 3) {
                                            }
                                            i7++;
                                        }
                                    }
                                    i7 = 0;
                                }
                                i4 = new C29954DIe(i7).A00;
                            } else if (i13 == 14) {
                                ByteBuffer byteBuffer7 = byteBuffer3;
                                int position3 = byteBuffer7.position();
                                int limit = byteBuffer7.limit() - 10;
                                int i18 = position3;
                                while (true) {
                                    if (i18 > limit) {
                                        i6 = -1;
                                    } else if ((byteBuffer7.getInt(i18 + 4) & -16777217) == -1167101192) {
                                        i6 = i18 - position3;
                                    } else {
                                        i18++;
                                    }
                                }
                                if (i6 == -1) {
                                    i4 = 0;
                                } else {
                                    boolean z8 = false;
                                    if ((byteBuffer7.get(byteBuffer7.position() + i6 + 7) & 255) == 187) {
                                        z8 = true;
                                    }
                                    int position4 = byteBuffer7.position() + i6;
                                    int i19 = 8;
                                    if (z8) {
                                        i19 = 9;
                                    }
                                    i4 = (40 << ((byteBuffer7.get(position4 + i19) >> 4) & 7)) << 4;
                                }
                            } else {
                                throw new IllegalStateException(AnonymousClass000.A05("Unexpected audio encoding: ", i13));
                            }
                            this.A0K = i4;
                        }
                        if (this.A0O != null) {
                            if (A09()) {
                                DAX dax = this.A0O;
                                this.A0O = null;
                                A07(dax, j4);
                            }
                        }
                        int i20 = this.A03;
                        if (i20 == 0) {
                            this.A07 = Math.max(0, j4);
                            this.A03 = 1;
                        } else {
                            long j6 = this.A07;
                            DIJ dij6 = this.A0F;
                            if (dij6.A08) {
                                j2 = this.A09 / ((long) dij6.A01);
                            } else {
                                j2 = this.A08;
                            }
                            long j7 = j6 + (((j2 - this.A0c.A04) * 1000000) / ((long) dij6.A02));
                            if (i20 == 1 && Math.abs(j7 - j) > 200000) {
                                Log.e("AudioTrack", "Discontinuity detected [expected " + j7 + ", got " + j4 + "]");
                                this.A03 = 2;
                            }
                            if (this.A03 == 2) {
                                long j8 = j - j7;
                                this.A07 += j8;
                                this.A03 = 1;
                                DIG dig2 = this.A0D;
                                if (!(dig2 == null || j8 == 0)) {
                                    dig2.BEk();
                                }
                            }
                        }
                        if (this.A0F.A08) {
                            this.A09 += (long) byteBuffer3.remaining();
                        } else {
                            this.A08 += (long) this.A0K;
                        }
                        this.A0R = byteBuffer3;
                    }
                    return true;
                }
                if (this.A0F.A09) {
                    A05(j4);
                } else {
                    A08(this.A0R, j4);
                }
                if (!this.A0R.hasRemaining()) {
                    this.A0R = null;
                    return true;
                }
                DII dii3 = this.A0Z;
                long A023 = A02(this);
                long j9 = dii3.A07;
                if (j9 != -9223372036854775807L && A023 > 0) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    Log.w("AudioTrack", "Resetting stalled audio track");
                    flush();
                    return true;
                }
            }
            return false;
        }
        boolean z9 = dii2.A0K;
        boolean A014 = dii2.A01(A022);
        dii2.A0K = A014;
        if (z9 && !A014 && playState != 1 && (dId = dii2.A0N) != null) {
            dId.BT4(dii2.A00, C29686D4x.A01(dii2.A05));
        }
        z2 = true;
        if (z2) {
        }
        return false;
    }

    public final void AbG() {
        if (this.A03 == 1) {
            this.A03 = 2;
        }
    }

    public final boolean Ac2() {
        boolean z = false;
        if (this.A0A != null) {
            z = true;
        }
        if (!z || !this.A0Z.A01(A02(this))) {
            return false;
        }
        return true;
    }

    public final boolean AfJ() {
        boolean z = false;
        if (this.A0A != null) {
            z = true;
        }
        if (!z) {
            return true;
        }
        if (!this.A0T || Ac2()) {
            return false;
        }
        return true;
    }

    public final void BXI() {
        if (!this.A0T) {
            boolean z = false;
            if (this.A0A != null) {
                z = true;
            }
            if (z && A09()) {
                A03();
                this.A0T = true;
            }
        }
    }

    public final void Bfy(DIX dix) {
        if (!this.A0C.equals(dix)) {
            this.A0C = dix;
            if (!this.A0G) {
                flush();
                this.A01 = 0;
            }
        }
    }

    public final void Bg8(C29744D7q d7q) {
        if (!this.A0E.equals(d7q)) {
            this.A0E = d7q;
        }
    }

    public final DAX BjV(DAX dax) {
        DIJ dij = this.A0F;
        if (dij == null || dij.A07) {
            DAX dax2 = this.A0O;
            if (dax2 == null) {
                if (!this.A0d.isEmpty()) {
                    dax2 = ((C29952DIc) this.A0d.getLast()).A02;
                } else {
                    dax2 = this.A0B;
                }
            }
            if (!dax.equals(dax2)) {
                boolean z = false;
                if (this.A0A != null) {
                    z = true;
                }
                if (z) {
                    this.A0O = dax;
                } else {
                    this.A0B = dax;
                }
            }
            return this.A0B;
        }
        DAX dax3 = DAX.A04;
        this.A0B = dax3;
        return dax3;
    }

    public final void Blt(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A04();
        }
    }

    public final void flush() {
        boolean z = false;
        if (this.A0A != null) {
            z = true;
        }
        if (z) {
            this.A09 = 0;
            this.A08 = 0;
            this.A0N = 0;
            this.A0M = 0;
            this.A0K = 0;
            DAX dax = this.A0O;
            if (dax != null) {
                this.A0B = dax;
                this.A0O = null;
            } else if (!this.A0d.isEmpty()) {
                this.A0B = ((C29952DIc) this.A0d.getLast()).A02;
            }
            this.A0d.clear();
            this.A05 = 0;
            this.A06 = 0;
            this.A0c.A04 = 0;
            int i = 0;
            while (true) {
                DIV[] divArr = this.A0H;
                if (i >= divArr.length) {
                    break;
                }
                DIV div = divArr[i];
                div.flush();
                this.A0I[i] = div.ARL();
                i++;
            }
            this.A0R = null;
            this.A0S = null;
            this.A0V = false;
            this.A0T = false;
            this.A02 = -1;
            this.A0Q = null;
            this.A0J = 0;
            this.A03 = 0;
            AudioTrack audioTrack = this.A0Z.A0H;
            D6U.A01(audioTrack);
            int playState = audioTrack.getPlayState();
            boolean z2 = false;
            if (playState == 3) {
                z2 = true;
            }
            if (z2) {
                this.A0A.pause();
            }
            AudioTrack audioTrack2 = this.A0A;
            this.A0A = null;
            DIJ dij = this.A0P;
            if (dij != null) {
                this.A0F = dij;
                this.A0P = null;
            }
            DII dii = this.A0Z;
            dii.A0E = 0;
            dii.A04 = 0;
            dii.A01 = 0;
            dii.A09 = 0;
            dii.A0H = null;
            dii.A0I = null;
            this.A0X.close();
            new C29950DIa(this, audioTrack2).start();
        }
    }

    public static void A06(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public final DAX ASF() {
        return this.A0B;
    }

    public final void BiX(DIG dig) {
        this.A0D = dig;
    }

    public final boolean Bqy(int i, int i2) {
        if (!C25948Bd0.A0B(i2)) {
            C2112099b r0 = this.A0Y;
            if (r0 == null || !r0.A01(i2)) {
                return false;
            }
            if (i == -1 || i <= this.A0Y.A00()) {
                return true;
            }
            return false;
        } else if (i2 != 4 || C25948Bd0.A00 >= 21) {
            return true;
        } else {
            return false;
        }
        return true;
    }
}
