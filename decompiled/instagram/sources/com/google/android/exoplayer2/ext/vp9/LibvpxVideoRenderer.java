package com.google.android.exoplayer2.ext.vp9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass8OZ;
import p000X.AnonymousClass8Oc;
import p000X.C193148Of;
import p000X.C200008hB;
import p000X.C25913Bc3;
import p000X.C25948Bd0;
import p000X.C29717D6d;
import p000X.C29727D6r;
import p000X.C29730D6u;
import p000X.C29748D7u;
import p000X.C29750D7x;
import p000X.C29751D7y;
import p000X.C29752D7z;
import p000X.C29768D8v;
import p000X.D3Z;
import p000X.D6U;
import p000X.D7B;
import p000X.D82;
import p000X.D89;
import p000X.D8A;
import p000X.D8I;
import p000X.D8W;
import p000X.D8z;

public class LibvpxVideoRenderer extends C29727D6r {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public Bitmap A08;
    public C29730D6u A09;
    public D89 A0A;
    public VpxDecoder A0B;
    public D8I A0C;
    public VpxOutputBuffer A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public int A0K;
    public long A0L;
    public Format A0M;
    public D89 A0N;
    public C193148Of A0O;
    public AnonymousClass8Oc A0P;
    public boolean A0Q;
    public final long A0R;
    public final D8z A0S;
    public final D7B A0T;
    public final boolean A0U;
    public final int A0V;
    public final C29717D6d A0W;
    public final D8A A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public volatile Surface A0c;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r5.A0b != false) goto L_0x000a;
     */
    private void A02(Surface surface, C193148Of r7) {
        boolean z;
        long j;
        int i = 0;
        if (!(surface == null || r7 == null)) {
            z = false;
        }
        z = true;
        D6U.A03(z);
        if (this.A0c != surface || this.A0O != r7) {
            this.A0c = surface;
            this.A0O = r7;
            if (r7 == null) {
                i = -1;
                if (surface != null) {
                    i = 1;
                }
            }
            this.A02 = i;
            if (i != -1) {
                VpxDecoder vpxDecoder = this.A0B;
                if (vpxDecoder != null) {
                    vpxDecoder.A02 = i;
                }
                int i2 = this.A04;
                if (!(i2 == -1 && this.A03 == -1)) {
                    this.A0T.A00(i2, this.A03, 0, 1.0f);
                }
                this.A0H = false;
                if (AWh() == 2) {
                    long j2 = this.A0R;
                    if (j2 > 0) {
                        j = SystemClock.elapsedRealtime() + j2;
                    } else {
                        j = -9223372036854775807L;
                    }
                    this.A06 = j;
                    return;
                }
                return;
            }
            this.A04 = -1;
            this.A03 = -1;
            this.A0H = false;
        } else if (this.A02 != -1) {
            int i3 = this.A04;
            if (!(i3 == -1 && this.A03 == -1)) {
                this.A0T.A00(i3, this.A03, 0, 1.0f);
            }
            if (this.A0H && this.A0c != null) {
                this.A0T.A01(this.A0c);
            }
        }
    }

    public final void A0D() {
        this.A0M = null;
        this.A0I = false;
        this.A04 = -1;
        this.A03 = -1;
        this.A0H = false;
        try {
            A0K();
            this.A0A = null;
            this.A0N = null;
            synchronized (this.A09) {
            }
            this.A0T.A02(this.A09);
        } catch (Throwable th) {
            this.A0A = null;
            this.A0N = null;
            synchronized (this.A09) {
                this.A0T.A02(this.A09);
                throw th;
            }
        }
    }

    public final void A0E() {
        this.A0K = 0;
        this.A0L = SystemClock.elapsedRealtime();
        this.A07 = SystemClock.elapsedRealtime() * 1000;
    }

    public final void A0G(long j, boolean z) {
        long j2;
        this.A0F = false;
        this.A0G = false;
        this.A0H = false;
        this.A05 = -9223372036854775807L;
        this.A0J = 0;
        if (this.A0B != null) {
            A0J();
        }
        if (z) {
            long j3 = this.A0R;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A06 = j2;
            return;
        }
        this.A06 = -9223372036854775807L;
    }

    public final void A0J() {
        this.A0I = false;
        this.A00 = 0;
        if (this.A01 != 0) {
            A0K();
            A00();
            return;
        }
        this.A0C = null;
        VpxOutputBuffer vpxOutputBuffer = this.A0D;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
            this.A0D = null;
        }
        this.A0B.flush();
        this.A0E = false;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    public final void AbQ(int i, Object obj) {
        if (i == 1) {
            AnonymousClass8Oc r4 = this.A0P;
            if (r4 != null) {
                Surface surface = (Surface) obj;
                AnonymousClass8OZ r1 = r4.A04;
                if (AnonymousClass0ZA.A0D(r1, r1.obtainMessage(1, surface)) && r4.A06 && surface == null) {
                    synchronized (r4.A05) {
                        r4.A05.wait(200);
                        Thread.currentThread().interrupt();
                    }
                }
            }
            A02((Surface) obj, this.A0P);
        } else if (i == 10000) {
            A02((Surface) null, (C193148Of) obj);
        } else {
            super.AbQ(i, obj);
        }
    }

    private void A00() {
        String str;
        if (this.A0B == null) {
            D89 d89 = this.A0N;
            this.A0A = d89;
            ExoMediaCrypto exoMediaCrypto = null;
            if (d89 == null || (exoMediaCrypto = d89.getMediaCrypto()) != null || d89.getError() != null) {
                try {
                    if (this.A0b && this.A0P == null) {
                        this.A0P = new AnonymousClass8Oc(this.A0Y);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C200008hB.A01("createVpxDecoder");
                    VpxDecoder vpxDecoder = new VpxDecoder(exoMediaCrypto, this.A0Z);
                    this.A0B = vpxDecoder;
                    vpxDecoder.A02 = this.A02;
                    C200008hB.A00();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (VpxLibrary.A00()) {
                        str = VpxLibrary.vpxGetVersion();
                    } else {
                        str = null;
                    }
                    String A0E2 = AnonymousClass000.A0E("libvpx", str);
                    long j = elapsedRealtime2 - elapsedRealtime;
                    D7B d7b = this.A0T;
                    Handler handler = d7b.A00;
                    if (handler != null) {
                        AnonymousClass0ZA.A0E(handler, new C29750D7x(d7b, A0E2, elapsedRealtime2, j), 1469652279);
                    }
                    this.A09.A00++;
                } catch (C29748D7u e) {
                    throw new D3Z(1, e);
                }
            }
        }
    }

    private void A01() {
        if (this.A0K > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            D7B d7b = this.A0T;
            Handler handler = d7b.A00;
            if (handler != null) {
                AnonymousClass0ZA.A0E(handler, new C29768D8v(d7b), -561217320);
            }
            this.A0K = 0;
            this.A0L = elapsedRealtime;
        }
    }

    public final void A0H(boolean z) {
        C29730D6u d6u = new C29730D6u();
        this.A09 = d6u;
        D7B d7b = this.A0T;
        Handler handler = d7b.A00;
        if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new C29751D7y(d7b, d6u), -1288316185);
        }
    }

    public final void A0K() {
        VpxDecoder vpxDecoder = this.A0B;
        if (vpxDecoder != null) {
            this.A0C = null;
            this.A0D = null;
            vpxDecoder.release();
            this.A0B = null;
            this.A09.A01++;
            this.A01 = 0;
            this.A0E = false;
            this.A00 = 0;
            AnonymousClass8Oc r0 = this.A0P;
            if (r0 != null) {
                AnonymousClass8OZ r1 = r0.A04;
                AnonymousClass0ZA.A0D(r1, r1.obtainMessage(3));
                this.A0P = null;
            }
        }
    }

    public final void A0L(int i) {
        C29730D6u d6u = this.A09;
        d6u.A02 += i;
        int i2 = this.A0K + i;
        this.A0K = i2;
        int i3 = this.A0J + i;
        this.A0J = i3;
        d6u.A05 = Math.max(i3, d6u.A05);
        if (i2 >= this.A0V) {
            A01();
        }
    }

    public final void A0M(Format format) {
        DrmInitData drmInitData;
        Format format2 = this.A0M;
        this.A0M = format;
        DrmInitData drmInitData2 = format.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!C25948Bd0.A0D(drmInitData2, drmInitData)) {
            if (this.A0M.A0H != null) {
                D8A d8a = this.A0X;
                if (d8a != null) {
                    this.A0N = d8a.acquireSession(Looper.myLooper(), this.A0M.A0H);
                } else {
                    throw new D3Z(1, new IllegalStateException("Media requires a DrmSessionManager"));
                }
            } else {
                this.A0N = null;
            }
        }
        if (this.A0N != this.A0A) {
            if (this.A0E) {
                this.A01 = 1;
            } else {
                A0K();
                A00();
            }
        }
        D7B d7b = this.A0T;
        Format format3 = this.A0M;
        Handler handler = d7b.A00;
        if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new D8W(d7b, format3), -1783506995);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r8.A0c == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r8.A0O == null) goto L_0x0013;
     */
    public final void A0N(VpxOutputBuffer vpxOutputBuffer) {
        boolean z;
        boolean z2;
        int i = vpxOutputBuffer.mode;
        if (i == 1) {
            z = true;
        }
        z = false;
        if (i == 0) {
            z2 = true;
        }
        z2 = false;
        this.A07 = SystemClock.elapsedRealtime() * 1000;
        if (z || z2) {
            int i2 = vpxOutputBuffer.width;
            int i3 = vpxOutputBuffer.height;
            if (!(this.A04 == i2 && this.A03 == i3)) {
                this.A04 = i2;
                this.A03 = i3;
                this.A0T.A00(i2, i3, 0, 1.0f);
            }
            if (z) {
                boolean z3 = this.A0a;
                Bitmap bitmap = this.A08;
                if (!(bitmap != null && bitmap.getWidth() == vpxOutputBuffer.width && this.A08.getHeight() == vpxOutputBuffer.height)) {
                    this.A08 = Bitmap.createBitmap(vpxOutputBuffer.width, vpxOutputBuffer.height, Bitmap.Config.RGB_565);
                }
                this.A08.copyPixelsFromBuffer(vpxOutputBuffer.data);
                Canvas lockCanvas = this.A0c.lockCanvas((Rect) null);
                if (z3) {
                    lockCanvas.scale(((float) lockCanvas.getWidth()) / ((float) vpxOutputBuffer.width), ((float) lockCanvas.getHeight()) / ((float) vpxOutputBuffer.height));
                }
                lockCanvas.drawBitmap(this.A08, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (Paint) null);
                this.A0c.unlockCanvasAndPost(lockCanvas);
                vpxOutputBuffer.release();
            } else {
                this.A0O.BjL(vpxOutputBuffer);
            }
            this.A0J = 0;
            this.A09.A06++;
            if (!this.A0H && this.A0c != null) {
                this.A0H = true;
                this.A0T.A01(this.A0c);
                return;
            }
            return;
        }
        A0L(1);
        vpxOutputBuffer.release();
    }

    public final boolean AhB() {
        boolean AhB;
        if (!this.A0I) {
            if (this.A0M != null) {
                if (Ac9()) {
                    AhB = this.A04;
                } else {
                    AhB = this.A03.AhB();
                }
                if ((AhB || this.A0D != null) && (this.A0H || this.A02 == -1)) {
                    this.A06 = -9223372036854775807L;
                    return true;
                }
            }
            long j = this.A06;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() < j) {
                    return true;
                }
                this.A06 = -9223372036854775807L;
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r11 <= 100000) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f1, code lost:
        if (r0 != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0149, code lost:
        if (r0 == null) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01b7 A[Catch:{ D7u -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x012f A[EDGE_INSN: B:166:0x012f->B:82:0x012f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f6 A[Catch:{ D7u -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012d A[Catch:{ D7u -> 0x01ec }, LOOP:0: B:12:0x002c->B:81:0x012d, LOOP_END] */
    public final void Bbe(long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.A0G) {
            if (this.A0M == null) {
                this.A0W.A03();
                int A0B2 = A0B(this.A0S, this.A0W, true);
                if (A0B2 == -5) {
                    A0M(this.A0S.A00);
                } else if (A0B2 == -4) {
                    D6U.A03(this.A0W.A02());
                    this.A0F = true;
                    this.A0G = true;
                    return;
                } else {
                    return;
                }
            }
            A00();
            if (this.A0B != null) {
                try {
                    C200008hB.A01("drainAndFeed");
                    while (true) {
                        if (this.A0D == null) {
                            VpxOutputBuffer vpxOutputBuffer = (VpxOutputBuffer) this.A0B.ABj();
                            this.A0D = vpxOutputBuffer;
                            if (vpxOutputBuffer != null) {
                                C29730D6u d6u = this.A09;
                                int i3 = d6u.A08;
                                int i4 = vpxOutputBuffer.A00;
                                d6u.A08 = i3 + i4;
                                this.A00 -= i4;
                            }
                            z = false;
                            if (!z) {
                                break;
                            }
                        }
                        VpxOutputBuffer vpxOutputBuffer2 = this.A0D;
                        if (vpxOutputBuffer2.A02()) {
                            if (this.A01 == 2) {
                                A0K();
                                A00();
                            } else {
                                vpxOutputBuffer2.release();
                                this.A0D = null;
                                this.A0G = true;
                            }
                            z = false;
                            if (!z) {
                            }
                        } else {
                            if (this.A05 == -9223372036854775807L) {
                                this.A05 = j;
                            }
                            long j3 = vpxOutputBuffer2.A01 - j;
                            if (this.A02 == -1) {
                                boolean z6 = false;
                                if (j3 < -30000) {
                                    z6 = true;
                                }
                                if (z6) {
                                    this.A09.A08++;
                                    vpxOutputBuffer2.release();
                                }
                                z = false;
                                if (z) {
                                    this.A00--;
                                    this.A0D = null;
                                }
                                if (!z) {
                                }
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                                boolean z7 = false;
                                if (AWh() == 2) {
                                    z7 = true;
                                }
                                if (this.A0H) {
                                    if (z7) {
                                        long j4 = elapsedRealtime - this.A07;
                                        boolean z8 = false;
                                        if (j3 < -30000) {
                                            z8 = true;
                                        }
                                        if (z8) {
                                            z5 = true;
                                        }
                                        z5 = false;
                                        if (z5) {
                                        }
                                    }
                                    if (z7 && j != this.A05) {
                                        boolean z9 = false;
                                        if (j3 < -500000) {
                                            z9 = true;
                                        }
                                        if (z9) {
                                            int Bor = this.A03.Bor(j - this.A01);
                                            if (Bor == 0) {
                                                z4 = false;
                                            } else {
                                                this.A09.A03++;
                                                A0L(this.A00 + Bor);
                                                A0J();
                                                z4 = true;
                                            }
                                        }
                                        boolean z10 = false;
                                        if (j3 < -30000) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            vpxOutputBuffer2 = this.A0D;
                                            A0L(1);
                                            vpxOutputBuffer2.release();
                                        } else if (j3 < 30000) {
                                            A0N(this.A0D);
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                    }
                                    if (!z) {
                                    }
                                }
                                A0N(vpxOutputBuffer2);
                            }
                            z = true;
                            if (z) {
                            }
                            if (!z) {
                            }
                        }
                    }
                    do {
                        VpxDecoder vpxDecoder = this.A0B;
                        if (!(vpxDecoder == null || this.A01 == 2 || this.A0F)) {
                            if (this.A0C == null) {
                                D8I d8i = (D8I) vpxDecoder.ABg();
                                this.A0C = d8i;
                            }
                            if (this.A01 == 1) {
                                D8I d8i2 = this.A0C;
                                d8i2.A00 = 4;
                                this.A0B.BYr(d8i2);
                                this.A0C = null;
                                this.A01 = 2;
                            } else {
                                if (this.A0I) {
                                    i2 = -4;
                                } else {
                                    i2 = A0B(this.A0S, this.A0C, false);
                                }
                                if (i2 != -3) {
                                    if (i2 == -5) {
                                        A0M(this.A0S.A00);
                                    } else {
                                        D8I d8i3 = this.A0C;
                                        if (d8i3.A02()) {
                                            this.A0F = true;
                                            this.A0B.BYr(d8i3);
                                            this.A0C = null;
                                        } else {
                                            boolean z11 = false;
                                            if ((d8i3.A00 & C25913Bc3.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
                                                z11 = true;
                                            }
                                            D89 d89 = this.A0A;
                                            if (d89 != null) {
                                                if (z11 || !this.A0U) {
                                                    int state = d89.getState();
                                                    z3 = true;
                                                    if (state == 1) {
                                                        throw new D3Z(1, d89.getError());
                                                    } else if (state != 4) {
                                                        this.A0I = z3;
                                                        if (!z3) {
                                                            d8i3.A01.flip();
                                                            D8I d8i4 = this.A0C;
                                                            d8i4.A00 = this.A0S.A00.A0J;
                                                            this.A0B.BYr(d8i4);
                                                            this.A00++;
                                                            this.A0E = true;
                                                            this.A09.A04++;
                                                            this.A0C = null;
                                                        }
                                                    }
                                                }
                                            }
                                            z3 = false;
                                            this.A0I = z3;
                                            if (!z3) {
                                            }
                                        }
                                    }
                                    z2 = true;
                                    continue;
                                }
                            }
                        }
                        z2 = false;
                        continue;
                    } while (z2);
                    C200008hB.A00();
                    synchronized (this.A09) {
                    }
                } catch (C29748D7u e) {
                    throw new D3Z(1, e);
                }
            }
            if (!this.A0Q && this.A0B.A03 > 100) {
                Format format = this.A0M;
                if (format != null) {
                    VpxDecoder vpxDecoder2 = this.A0B;
                    synchronized (vpxDecoder2) {
                        if (vpxDecoder2.A03 > 0) {
                            i = (int) (vpxDecoder2.A04 / ((long) vpxDecoder2.A03));
                        } else {
                            i = -1;
                        }
                        vpxDecoder2.A04 = 0;
                        vpxDecoder2.A03 = 0;
                    }
                    if (i > 0) {
                        D7B d7b = this.A0T;
                        if (d7b.A01 != null) {
                            AnonymousClass0ZA.A0E(d7b.A00, new D82(d7b, i, format), -905680279);
                        }
                    }
                }
                this.A0Q = true;
            }
        }
    }

    public final boolean AfJ() {
        return this.A0G;
    }

    public final int Bqt(Format format) {
        boolean canAcquireSession;
        if (!VpxLibrary.A00() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(format.A0S)) {
            return 0;
        }
        D8A d8a = this.A0X;
        DrmInitData drmInitData = format.A0H;
        if (drmInitData == null) {
            canAcquireSession = true;
        } else if (d8a == null) {
            canAcquireSession = false;
        } else {
            canAcquireSession = d8a.canAcquireSession(drmInitData);
        }
        if (!canAcquireSession) {
            return 2;
        }
        return 20;
    }

    public final void A0F() {
        this.A06 = -9223372036854775807L;
        A01();
    }

    public LibvpxVideoRenderer(boolean z, long j) {
        this(z, j, (Handler) null, (C29752D7z) null, 0, false, false);
    }

    public LibvpxVideoRenderer(boolean z, long j, Handler handler, C29752D7z d7z, int i, D8A d8a, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A0a = z;
        this.A0Z = z3;
        this.A0R = j;
        this.A0V = i;
        this.A0X = d8a;
        this.A0U = z2;
        this.A0b = z4;
        if (z4) {
            this.A0P = new AnonymousClass8Oc(z5);
        }
        this.A0Y = z5;
        this.A06 = -9223372036854775807L;
        this.A04 = -1;
        this.A03 = -1;
        this.A0S = new D8z();
        this.A0W = new C29717D6d(0);
        this.A0T = new D7B(handler, d7z);
        this.A02 = -1;
        this.A01 = 0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public LibvpxVideoRenderer(boolean z, long j, Handler handler, C29752D7z d7z, int i, boolean z2, boolean z3) {
        this(r1, j, handler, d7z, i, (D8A) null, false, false, z2, z3);
        boolean z4 = z;
    }
}
