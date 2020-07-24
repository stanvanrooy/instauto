package p000X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.DAN */
public final class DAN implements C29770D8x, C29806DAq, C29764D8r, D4C, C29808DAs, Handler.Callback {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public long A03;
    public C29802DAm A04;
    public C29800DAk A05;
    public DAS A06;
    public DAR A07;
    public C25949Bd1 A08;
    public D6R A09;
    public Integer A0A = Constants.ZERO;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public DAR[] A0H;
    public final long A0I;
    public final long A0J;
    public final Handler A0K;
    public final HandlerThread A0L;
    public final DAT A0M;
    public final D3B A0N;
    public final C29795DAe A0O;
    public final DAW A0P;
    public final DAP A0Q;
    public final DAU A0R;
    public final D7h A0S;
    public final DAf A0T;
    public final BME A0U;
    public final C29792DAb A0V;
    public final DAV A0W;
    public final ArrayList A0X;
    public final boolean A0Y;
    public final DAR[] A0Z;
    public final C29804DAo[] A0a;
    public final DAL A0b;

    private void A07() {
        this.A0E = false;
        DAV dav = this.A0M.A02;
        if (!dav.A01) {
            dav.A00 = dav.A04.ACp();
            dav.A01 = true;
        }
        DAV dav2 = this.A0W;
        if (!dav2.A01) {
            dav2.A00 = dav2.A04.ACp();
            dav2.A01 = true;
        }
        for (DAR start : this.A0H) {
            start.start();
        }
    }

    public static void A0D(D39 d39) {
        synchronized (d39) {
        }
        try {
            d39.A06.AbQ(d39.A00, d39.A02);
        } finally {
            d39.A03(true);
        }
    }

    private void A0H(boolean z, boolean z2) {
        A0I(true, z, z);
        this.A0O.A01 += this.A00 + (z2 ? 1 : 0);
        this.A00 = 0;
        this.A0P.onStopped();
        A0A(1);
    }

    public final synchronized void BfI(D39 d39) {
        if (this.A0F) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            d39.A03(false);
        } else {
            this.A0V.AqM(14, d39).sendToTarget();
        }
    }

    private long A01(C29791DAa dAa, long j) {
        DAP dap = this.A0Q;
        DAM dam = dap.A05;
        DAM dam2 = dap.A06;
        boolean z = false;
        if (dam != dam2) {
            z = true;
        }
        return A02(dAa, j, z);
    }

    private Pair A03(C29800DAk dAk, boolean z) {
        int A002;
        C29742D7o d7o = this.A06.A03;
        C29800DAk dAk2 = dAk;
        C29742D7o d7o2 = dAk2.A02;
        if (!d7o.A07()) {
            if (d7o2.A07()) {
                d7o2 = d7o;
            }
            try {
                Pair A042 = d7o2.A04(this.A0S, this.A0R, dAk2.A00, dAk2.A01, 0);
                if (d7o == d7o2) {
                    return A042;
                }
                int A032 = d7o.A03(d7o2.A05(((Integer) A042.first).intValue(), this.A0R, true).A04);
                if (A032 != -1) {
                    return Pair.create(Integer.valueOf(A032), A042.second);
                }
                if (z && (A002 = A00(((Integer) A042.first).intValue(), d7o2, d7o)) != -1) {
                    d7o.A05(A002, this.A0R, false);
                    return d7o.A04(this.A0S, this.A0R, 0, -9223372036854775807L, 0);
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new C29803DAn(d7o);
            }
        }
        return null;
    }

    private void A04() {
        long AQr;
        DAM dam = this.A0Q.A04;
        if (!dam.A06) {
            AQr = 0;
        } else {
            AQr = dam.A08.AQr();
        }
        if (AQr == Long.MIN_VALUE) {
            A0G(false);
            return;
        }
        long j = this.A03 - dam.A00;
        long AHH = dam.A08.AHH(j);
        DAW daw = this.A0P;
        float f = this.A0M.ASF().A01;
        boolean z = true;
        if (!this.A0D) {
            z = false;
        }
        boolean Bmb = daw.Bmb(AHH, j, f, z);
        A0G(Bmb);
        if (Bmb) {
            dam.A08.A9i(this.A03 - dam.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r5.A03 != false) goto L_0x0011;
     */
    private void A05() {
        boolean z;
        int i;
        C29795DAe dAe = this.A0O;
        DAS das = this.A06;
        if (das == dAe.A02 && dAe.A01 <= 0) {
            z = false;
        }
        z = true;
        if (z) {
            Handler handler = this.A0K;
            int i2 = dAe.A01;
            if (dAe.A03) {
                i = dAe.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, das).sendToTarget();
            C29795DAe dAe2 = this.A0O;
            dAe2.A02 = this.A06;
            dAe2.A01 = 0;
            dAe2.A03 = false;
        }
    }

    private void A06() {
        DAP dap = this.A0Q;
        DAM dam = dap.A04;
        DAM dam2 = dap.A06;
        if (dam != null && !dam.A06) {
            if (dam2 == null || dam2.A01 == dam) {
                DAR[] darArr = this.A0H;
                int length = darArr.length;
                int i = 0;
                while (i < length) {
                    if (darArr[i].Ac9()) {
                        i++;
                    } else {
                        return;
                    }
                }
                dam.A08.Ap1();
            }
        }
    }

    private void A08() {
        this.A0M.A02.A00();
        this.A0W.A00();
        for (DAR dar : this.A0H) {
            if (dar.AWh() == 2) {
                dar.stop();
            }
        }
    }

    private void A09() {
        boolean z;
        long ASP;
        long A022;
        DAM dam = this.A0Q.A05;
        boolean z2 = false;
        if (dam != null) {
            z2 = true;
        }
        if (z2) {
            long BZ0 = dam.A08.BZ0();
            if (BZ0 != -9223372036854775807L) {
                A0B(BZ0);
                if (BZ0 != this.A06.A0B) {
                    DAS das = this.A06;
                    this.A06 = das.A01(das.A04, BZ0, das.A01);
                    this.A0O.A00(4);
                }
            } else {
                DAT dat = this.A0M;
                DAR dar = dat.A00;
                if (dar == null || dar.AfJ() || (!dat.A00.AhB() && dat.A00.Ac9())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    DAT.A00(dat);
                    ASP = dat.A01.ASP();
                } else {
                    ASP = dat.A02.ASP();
                }
                this.A03 = ASP;
                long j = ASP - dam.A00;
                if (!this.A0X.isEmpty() && !this.A06.A04.A01() && 0 < this.A0X.size()) {
                    this.A0X.get(0);
                }
                this.A06.A0B = j;
            }
            DAS das2 = this.A06;
            if (this.A0H.length == 0) {
                A022 = dam.A02.A01;
            } else {
                A022 = dam.A02(true);
            }
            das2.A0A = A022;
        }
    }

    private void A0A(int i) {
        DAS das = this.A06;
        int i2 = i;
        if (das.A00 != i2) {
            DAS das2 = new DAS(das.A03, das.A08, das.A04, das.A02, das.A01, i2, das.A09, das.A05, das.A06, das.A07);
            DAS.A00(das, das2);
            this.A06 = das2;
            if (i2 == 2) {
                System.currentTimeMillis();
            }
        }
    }

    private void A0B(long j) {
        DAM dam = this.A0Q.A05;
        boolean z = false;
        if (dam != null) {
            z = true;
        }
        if (z) {
            j += dam.A00;
        }
        this.A03 = j;
        this.A0M.A02.A01(j);
        for (DAR Bde : this.A0H) {
            Bde.Bde(this.A03);
        }
    }

    private void A0C(DAM dam) {
        DAM dam2 = this.A0Q.A05;
        if (dam2 != null && dam != dam2) {
            boolean[] zArr = new boolean[this.A0Z.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                DAR[] darArr = this.A0Z;
                if (i < darArr.length) {
                    DAR dar = darArr[i];
                    boolean z = false;
                    if (dar.AWh() != 0) {
                        z = true;
                    }
                    zArr[i] = z;
                    boolean z2 = false;
                    if (dam2.A04.A03[i] != null) {
                        z2 = true;
                    }
                    if (z2) {
                        i2++;
                    }
                    if (z && (!z2 || (dar.Aev() && dar.AX1() == dam.A0B[i]))) {
                        A0E(dar);
                    }
                    i++;
                } else {
                    this.A06 = this.A06.A02(dam2.A03, dam2.A04);
                    A0J(zArr, i2);
                    return;
                }
            }
        }
    }

    private void A0E(DAR dar) {
        DAT dat = this.A0M;
        if (dar == dat.A00) {
            dat.A01 = null;
            dat.A00 = null;
        }
        if (dar.AWh() == 2) {
            dar.stop();
        }
        dar.disable();
    }

    private void A0F(boolean z) {
        C29791DAa dAa = this.A0Q.A05.A02.A04;
        long A022 = A02(dAa, this.A06.A0B, true);
        if (A022 != this.A06.A0B) {
            DAS das = this.A06;
            this.A06 = das.A01(dAa, A022, das.A01);
            if (z) {
                this.A0O.A00(4);
            }
        }
    }

    private void A0G(boolean z) {
        DAS das = this.A06;
        boolean z2 = z;
        if (das.A09 != z2) {
            DAS das2 = new DAS(das.A03, das.A08, das.A04, das.A02, das.A01, das.A00, z2, das.A05, das.A06, das.A07);
            DAS.A00(das, das2);
            this.A06 = das2;
        }
    }

    private void A0I(boolean z, boolean z2, boolean z3) {
        C29742D7o d7o;
        Object obj;
        C29791DAa dAa;
        long j;
        TrackGroupArray trackGroupArray;
        DAL dal;
        D6R d6r;
        this.A0V.Bb9(2);
        this.A0E = false;
        this.A0M.A02.A00();
        this.A0W.A00();
        this.A03 = 0;
        for (DAR A0E2 : this.A0H) {
            try {
                A0E(A0E2);
            } catch (D3Z | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0H = new DAR[0];
        this.A0Q.A0C(!z2);
        A0G(false);
        if (z2) {
            this.A05 = null;
        }
        if (z3) {
            this.A0Q.A07 = C29742D7o.A00;
            Iterator it = this.A0X.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
            this.A0X.clear();
        }
        if (z3) {
            d7o = C29742D7o.A00;
        } else {
            d7o = this.A06.A03;
        }
        if (z3) {
            obj = null;
        } else {
            obj = this.A06.A08;
        }
        if (z2) {
            C29742D7o d7o2 = this.A06.A03;
            boolean A072 = d7o2.A07();
            if (!A072) {
                int i = 0;
                if (A072) {
                    i = -1;
                }
                d7o2.A06(i, this.A0S, false, 0);
            }
            dAa = new C29791DAa(0, -1, -1, -1);
        } else {
            dAa = this.A06.A04;
        }
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A06.A0B;
        }
        if (!z2) {
            j2 = this.A06.A01;
        }
        DAS das = this.A06;
        int i2 = das.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A03;
        } else {
            trackGroupArray = das.A05;
        }
        if (z3) {
            dal = this.A0b;
        } else {
            dal = das.A06;
        }
        this.A06 = new DAS(d7o, obj, dAa, j, j2, i2, false, trackGroupArray, dal, Constants.ZERO);
        if (z && (d6r = this.A09) != null) {
            d6r.BaV(this);
            this.A09 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r4.A06.A00 != 3) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r6 == false) goto L_0x0069;
     */
    private void A0J(boolean[] zArr, int i) {
        int i2;
        boolean z;
        boolean z2;
        C29801DAl dAl;
        this.A0H = new DAR[i];
        DAM dam = this.A0Q.A05;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            DAR[] darArr = this.A0Z;
            if (i3 < darArr.length) {
                boolean z3 = false;
                if (dam.A04.A03[i3] != null) {
                    z3 = true;
                }
                if (z3) {
                    boolean z4 = zArr[i3];
                    int i5 = i4 + 1;
                    DAM dam2 = this.A0Q.A05;
                    DAR dar = darArr[i3];
                    this.A0H[i4] = dar;
                    if (dar.AWh() == 0) {
                        DAL dal = dam2.A04;
                        C29798DAi dAi = dal.A03[i3];
                        D4t d4t = dal.A01.A02[i3];
                        D4t d4t2 = d4t;
                        if (d4t != null) {
                            i2 = d4t.length();
                        } else {
                            i2 = 0;
                        }
                        Format[] formatArr = new Format[i2];
                        for (int i6 = 0; i6 < i2; i6++) {
                            formatArr[i6] = d4t2.AM4(i6);
                        }
                        if (this.A0D) {
                            z = true;
                        }
                        z = false;
                        if (!z4) {
                            z2 = true;
                        }
                        z2 = false;
                        dar.ACt(dAi, formatArr, dam2.A0B[i3], this.A03, z2, dam2.A00);
                        DAT dat = this.A0M;
                        C29801DAl APh = dar.APh();
                        if (!(APh == null || APh == (dAl = dat.A01))) {
                            if (dAl == null) {
                                dat.A01 = APh;
                                dat.A00 = dar;
                                APh.BjV(dat.A02.ASF());
                                DAT.A00(dat);
                            } else {
                                throw new D3Z(2, new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z) {
                            dar.start();
                        }
                    }
                    i4 = i5;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    private boolean A0K() {
        DAM dam = this.A0Q.A05;
        long j = dam.A02.A01;
        if (j == -9223372036854775807L || this.A06.A0B < j) {
            return true;
        }
        DAM dam2 = dam.A01;
        if (dam2 == null) {
            return false;
        }
        if (dam2.A06 || dam2.A02.A04.A01()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void AyM(D7Z d7z) {
        this.A0V.AqM(10, (D6N) d7z).sendToTarget();
    }

    public final void BEV(DAX dax) {
        this.A0K.obtainMessage(1, dax).sendToTarget();
        for (DAM A0A2 = this.A0Q.A0A(); A0A2 != null; A0A2 = A0A2.A01) {
            DAL dal = A0A2.A04;
            if (dal != null) {
                int length = dal.A01.A00().length;
                for (int i = 0; i < length; i++) {
                }
            }
        }
    }

    public final void BFJ(D6N d6n) {
        this.A0V.AqM(9, d6n).sendToTarget();
    }

    public final void BO5(D6R d6r, C29742D7o d7o, Object obj) {
        this.A0V.AqM(8, new C29799DAj(d6r, d7o, obj)).sendToTarget();
    }

    public final void BSK() {
        this.A0V.BfD(11);
    }

    public final void BeN(long j) {
        this.A0V.AqM(18, Long.valueOf(j)).sendToTarget();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0254, code lost:
        if (r5.A01 == null) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x035a, code lost:
        if (r7.AfJ() == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x037b, code lost:
        if (r7.Ac9() == false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0380, code lost:
        if (r3 != false) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0448, code lost:
        if (r0.A0P.Bnc(r27, r0.A0M.ASF().A01, r0.A0E, false) != false) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04a7, code lost:
        if (r25 == false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0974, code lost:
        if (r5.A04.equals(r6.A04) == false) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x09c4, code lost:
        if (r8.A08 != r3) goto L_0x09c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0a53, code lost:
        if (r4.A08 != r3) goto L_0x0a55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0a68, code lost:
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0b79, code lost:
        if (p000X.DAP.A06(r1) == false) goto L_0x0b7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0b7b, code lost:
        A0F(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0ca0, code lost:
        A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0ca3, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01cd A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d0 A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04cc A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0529 A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0546 A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0556 A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05ef A[Catch:{ all -> 0x0673 }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0655 A[Catch:{ all -> 0x0673 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x066c A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010a A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019f A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b9 A[Catch:{ Cum -> 0x04d8, Cum -> 0x038a, all -> 0x008a, D3Z -> 0x0cba, IOException -> 0x0ca4, RuntimeException -> 0x0cca }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:366:0x065a=Splitter:B:366:0x065a, B:28:0x007b=Splitter:B:28:0x007b, B:612:0x0c4c=Splitter:B:612:0x0c4c} */
    public final boolean handleMessage(Message message) {
        D3Z e;
        Handler handler;
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        long j3;
        boolean z5;
        C29791DAa dAa;
        long j4;
        long j5;
        long j6;
        int i;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        DAM dam;
        DAM dam2;
        boolean z10;
        boolean z11;
        int i2;
        boolean z12;
        DAZ daz;
        long j7;
        boolean z13;
        boolean z14;
        Message message2 = message;
        try {
            switch (message2.what) {
                case 0:
                    D6R d6r = (D6R) message2.obj;
                    boolean z15 = false;
                    if (message2.arg1 != 0) {
                        z15 = true;
                    }
                    int i3 = message2.arg2;
                    boolean z16 = false;
                    if (i3 != 0) {
                        z16 = true;
                    }
                    this.A00++;
                    A0I(true, z15, z16);
                    this.A0P.BFG();
                    this.A09 = d6r;
                    A0A(2);
                    d6r.BY7(this.A0N, true, this);
                    this.A0V.BfD(2);
                    break;
                case 1:
                    z14 = false;
                    if (message2.arg1 != 0) {
                        z14 = true;
                    }
                    this.A0E = false;
                    this.A0D = z14;
                    DAM dam3 = this.A0Q.A04;
                    if (dam3 != null) {
                        dam3.A08.BjU(z14);
                    }
                    if (!z14) {
                        A08();
                        A09();
                    } else {
                        int i4 = this.A06.A00;
                        if (i4 == 3) {
                            A07();
                            this.A0V.BfD(2);
                        } else if (i4 == 2) {
                            this.A0V.BfD(2);
                        }
                    }
                    this.A0K.obtainMessage(3, Boolean.valueOf(z14)).sendToTarget();
                    break;
                case 2:
                    long Btc = this.A0U.Btc();
                    D6R d6r2 = this.A09;
                    if (d6r2 != null) {
                        if (this.A00 > 0) {
                            d6r2.Ap2();
                        } else {
                            DAP dap = this.A0Q;
                            long j8 = this.A03;
                            DAM dam4 = dap.A04;
                            if (dam4 != null && dam4.A06) {
                                dam4.A08.BZR(j8 - dam4.A00);
                            }
                            DAP dap2 = this.A0Q;
                            DAM dam5 = dap2.A04;
                            if (dam5 != null) {
                                if (!dam5.A02.A05) {
                                    if (dam5.A06) {
                                        if (dam5.A05) {
                                            if (dam5.A08.AHJ() == Long.MIN_VALUE) {
                                            }
                                        }
                                        z13 = true;
                                        if (z13 && dap2.A04.A02.A01 != -9223372036854775807L && dap2.A00 < 100) {
                                        }
                                    }
                                    z13 = false;
                                }
                                z9 = false;
                                if (z9) {
                                    DAP dap3 = this.A0Q;
                                    long j9 = this.A03;
                                    DAS das = this.A06;
                                    DAM dam6 = dap3.A04;
                                    if (dam6 == null) {
                                        daz = DAP.A04(dap3, das.A04, das.A01, das.A02);
                                    } else {
                                        daz = DAP.A02(dap3, dam6, j9);
                                    }
                                    if (daz == null) {
                                        this.A09.Ap2();
                                    } else {
                                        Object obj2 = this.A06.A03.A05(daz.A04.A02, this.A0R, true).A04;
                                        DAP dap4 = this.A0Q;
                                        C29804DAo[] dAoArr = this.A0a;
                                        DAf dAf = this.A0T;
                                        C29736D7a AFn = this.A0P.AFn();
                                        D6R d6r3 = this.A09;
                                        DAM dam7 = dap4.A04;
                                        if (dam7 == null) {
                                            j7 = daz.A03;
                                        } else {
                                            j7 = dam7.A00 + dam7.A02.A01;
                                        }
                                        DAM dam8 = new DAM(dAoArr, j7, dAf, AFn, d6r3, obj2, daz);
                                        DAM dam9 = dap4.A04;
                                        if (dam9 != null) {
                                            boolean z17 = false;
                                            if (dap4.A05 != null) {
                                                z17 = true;
                                            }
                                            D6U.A03(z17);
                                            dam9.A01 = dam8;
                                        }
                                        dap4.A08 = null;
                                        dap4.A04 = dam8;
                                        dap4.A00++;
                                        dam8.A08.BXr(this, daz.A03);
                                        A0G(true);
                                    }
                                }
                                dam = this.A0Q.A04;
                                int i5 = 0;
                                if (dam != null) {
                                    if (dam.A06) {
                                        if (dam.A05) {
                                            if (dam.A08.AHJ() == Long.MIN_VALUE) {
                                            }
                                        }
                                        z12 = true;
                                        if (!z12) {
                                            if (!this.A06.A09) {
                                                A04();
                                            }
                                            DAP dap5 = this.A0Q;
                                            dam2 = dap5.A05;
                                            z10 = false;
                                            if (dam2 != null) {
                                                z10 = true;
                                            }
                                            if (z10) {
                                                DAM dam10 = dap5.A06;
                                                boolean z18 = false;
                                                while (this.A0D && dam2 != dam10 && this.A03 >= dam2.A01.A00) {
                                                    if (z18) {
                                                        A05();
                                                    }
                                                    int i6 = 3;
                                                    if (dam2.A02.A06) {
                                                        i6 = 0;
                                                    }
                                                    DAM A092 = this.A0Q.A09();
                                                    A0C(dam2);
                                                    DAS das2 = this.A06;
                                                    DAZ daz2 = A092.A02;
                                                    this.A06 = das2.A01(daz2.A04, daz2.A03, daz2.A00);
                                                    this.A0O.A00(i6);
                                                    A09();
                                                    dam2 = A092;
                                                    z18 = true;
                                                }
                                                if (!dam10.A02.A05) {
                                                    DAM dam11 = dam10.A01;
                                                    if (dam11 != null && dam11.A06) {
                                                        int i7 = 0;
                                                        while (true) {
                                                            DAR[] darArr = this.A0Z;
                                                            if (i7 < darArr.length) {
                                                                DAR dar = darArr[i7];
                                                                D7Y d7y = dam10.A0B[i7];
                                                                if (dar.AX1() == d7y) {
                                                                    if (d7y == null || dar.Ac9()) {
                                                                        i7++;
                                                                    }
                                                                }
                                                            } else {
                                                                DAL dal = dam10.A04;
                                                                DAP dap6 = this.A0Q;
                                                                DAM dam12 = dap6.A06;
                                                                if (dam12 != null) {
                                                                    z11 = true;
                                                                    break;
                                                                }
                                                                z11 = false;
                                                                D6U.A03(z11);
                                                                DAM dam13 = dam12.A01;
                                                                dap6.A06 = dam13;
                                                                DAL dal2 = dam13.A04;
                                                                boolean z19 = false;
                                                                if (dam13.A08.BZ0() != -9223372036854775807L) {
                                                                    z19 = true;
                                                                }
                                                                int i8 = 0;
                                                                while (true) {
                                                                    DAR[] darArr2 = this.A0Z;
                                                                    if (i8 < darArr2.length) {
                                                                        DAR dar2 = darArr2[i8];
                                                                        C29798DAi dAi = dal.A03[i8];
                                                                        boolean z20 = false;
                                                                        if (dAi != null) {
                                                                            z20 = true;
                                                                        }
                                                                        if (z20) {
                                                                            if (!z19) {
                                                                                if (!dar2.Aev()) {
                                                                                    D4t d4t = dal2.A01.A02[i8];
                                                                                    C29798DAi dAi2 = dal2.A03[i8];
                                                                                    boolean z21 = false;
                                                                                    if (dAi2 != null) {
                                                                                        z21 = true;
                                                                                    }
                                                                                    boolean z22 = false;
                                                                                    if (this.A0a[i8].AYr() == 6) {
                                                                                        z22 = true;
                                                                                    }
                                                                                    if (z21 && dAi2.equals(dAi) && !z22) {
                                                                                        if (d4t != null) {
                                                                                            i2 = d4t.length();
                                                                                        } else {
                                                                                            i2 = 0;
                                                                                        }
                                                                                        Format[] formatArr = new Format[i2];
                                                                                        for (int i9 = 0; i9 < i2; i9++) {
                                                                                            formatArr[i9] = d4t.AM4(i9);
                                                                                        }
                                                                                        Log.e("ExoPlayerImplInternal", "replaceStream");
                                                                                        dar2.Bbs(formatArr, dam13.A0B[i8], dam13.A00);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dar2.Bgu();
                                                                        }
                                                                        i8++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    while (true) {
                                                        DAR[] darArr3 = this.A0Z;
                                                        if (i5 < darArr3.length) {
                                                            DAR dar3 = darArr3[i5];
                                                            D7Y d7y2 = dam10.A0B[i5];
                                                            if (d7y2 != null && dar3.AX1() == d7y2 && dar3.Ac9()) {
                                                                dar3.Bgu();
                                                            }
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z12 = false;
                                    if (!z12) {
                                    }
                                }
                                A0G(false);
                                DAP dap52 = this.A0Q;
                                dam2 = dap52.A05;
                                z10 = false;
                                if (dam2 != null) {
                                }
                                if (z10) {
                                }
                            }
                            z9 = true;
                            if (z9) {
                            }
                            dam = this.A0Q.A04;
                            int i52 = 0;
                            if (dam != null) {
                            }
                            A0G(false);
                            DAP dap522 = this.A0Q;
                            dam2 = dap522.A05;
                            z10 = false;
                            if (dam2 != null) {
                            }
                            if (z10) {
                            }
                        }
                    }
                    DAP dap7 = this.A0Q;
                    DAM dam14 = dap7.A05;
                    boolean z23 = false;
                    if (dam14 != null) {
                        z23 = true;
                    }
                    if (!z23) {
                        A06();
                        this.A0V.Bb9(2);
                        this.A0V.BfE(2, Btc + 10);
                        break;
                    } else {
                        DAM dam15 = dap7.A06;
                        C200008hB.A01("doSomeWork");
                        A09();
                        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                        dam14.A08.AC6(this.A06.A0B - this.A0I, this.A0Y);
                        DAR[] darArr4 = this.A0H;
                        int length = darArr4.length;
                        boolean z24 = true;
                        boolean z25 = true;
                        boolean z26 = false;
                        for (int i10 = 0; i10 < length; i10++) {
                            DAR dar4 = darArr4[i10];
                            dar4.Bbe(this.A03, elapsedRealtime);
                            if (dam15.A02.A05) {
                                dar4.Bgu();
                            }
                            if (z24) {
                                z24 = true;
                                break;
                            }
                            z24 = false;
                            if (!dar4.AhB() && !dar4.AfJ()) {
                                DAM dam16 = this.A0Q.A06.A01;
                                if (dam16 != null && dam16.A06) {
                                    z8 = true;
                                    break;
                                }
                                z8 = false;
                                z7 = false;
                                break;
                            }
                            z7 = true;
                            if (!z7) {
                                dar4.Ap3();
                                this.A07 = dar4;
                                z26 = true;
                            }
                            if (z25) {
                                z25 = true;
                                if (z7) {
                                }
                            }
                            z25 = false;
                        }
                        if (!z25) {
                            A06();
                        }
                        long j10 = dam14.A02.A01;
                        if (!z24 || ((j10 != -9223372036854775807L && j10 > this.A06.A0B) || !dam14.A02.A05)) {
                            DAS das3 = this.A06;
                            if (das3.A00 == 2) {
                                if (this.A0H.length == 0) {
                                    z6 = A0K();
                                } else {
                                    z6 = false;
                                    if (!z25) {
                                        this.A0A = this.A07.AWb();
                                    } else if (!das3.A09) {
                                        z6 = true;
                                    } else {
                                        DAM dam17 = this.A0Q.A04;
                                        long A022 = dam17.A02(!dam17.A02.A05);
                                        long AHH = dam17.A08.AHH(this.A03 - dam17.A00);
                                        if (A022 != Long.MIN_VALUE) {
                                            break;
                                        }
                                        z6 = true;
                                        if (!z6) {
                                            this.A0A = Constants.A0u;
                                        }
                                    }
                                }
                                if (z6) {
                                    Integer num = this.A0A;
                                    DAS das4 = this.A06;
                                    if (das4.A00 != 3) {
                                        DAS das5 = new DAS(das4.A03, das4.A08, das4.A04, das4.A02, das4.A01, 3, das4.A09, das4.A05, das4.A06, num);
                                        DAS.A00(das4, das5);
                                        this.A06 = das5;
                                    }
                                    if (this.A0D) {
                                        A07();
                                    }
                                    if (this.A06.A00 == 2) {
                                        DAR[] darArr5 = this.A0H;
                                        int length2 = darArr5.length;
                                        int i11 = 0;
                                        while (i11 < length2) {
                                            darArr5[i11].Ap3();
                                            i11++;
                                            z26 = true;
                                        }
                                    }
                                    if ((this.A0D && this.A06.A00 == 3) || (i = this.A06.A00) == 2) {
                                        this.A0V.Bb9(2);
                                        this.A0V.BfE(2, Btc + 10);
                                    } else if (this.A0H.length == 0 || i == 4) {
                                        this.A0V.Bb9(2);
                                    } else {
                                        this.A0V.Bb9(2);
                                        this.A0V.BfE(2, Btc + 1000);
                                    }
                                    if (!z26) {
                                        this.A02 = -9223372036854775807L;
                                    }
                                    C200008hB.A00();
                                    break;
                                }
                            }
                            if (this.A06.A00 == 3) {
                                if (this.A0H.length == 0) {
                                    if (A0K()) {
                                    }
                                }
                                this.A0E = this.A0D;
                                A0A(2);
                            }
                            if (this.A06.A00 == 2) {
                            }
                            if ((this.A0D || this.A06.A00 == 3) && (i = this.A06.A00) == 2) {
                            }
                            if (!z26) {
                            }
                            C200008hB.A00();
                        } else {
                            A0A(4);
                        }
                        A08();
                        if (this.A06.A00 == 2) {
                        }
                        if ((this.A0D || this.A06.A00 == 3) && (i = this.A06.A00) == 2) {
                        }
                        if (!z26) {
                        }
                        C200008hB.A00();
                    }
                    break;
                case 3:
                    C29800DAk dAk = (C29800DAk) message2.obj;
                    boolean z27 = true;
                    this.A0O.A01++;
                    Pair A032 = A03(dAk, true);
                    if (A032 != null) {
                        int intValue = ((Integer) A032.first).intValue();
                        j4 = ((Long) A032.second).longValue();
                        dAa = this.A0Q.A0B(intValue, j4);
                        if (!dAa.A01()) {
                            j5 = ((Long) A032.second).longValue();
                            z5 = false;
                            if (dAk.A01 == -9223372036854775807L) {
                            }
                            if (this.A09 == null || this.A00 > 0) {
                                this.A05 = dAk;
                                this.A04 = null;
                            } else if (j5 == -9223372036854775807L) {
                                A0A(4);
                                A0I(false, true, false);
                            } else {
                                if (dAa.equals(this.A06.A04)) {
                                    DAM dam18 = this.A0Q.A05;
                                    if (dam18 == null || j5 == 0) {
                                        j6 = j5;
                                    } else {
                                        j6 = dam18.A08.AFc(j5, this.A08);
                                    }
                                    if (C29686D4x.A01(j6) == C29686D4x.A01(this.A06.A0B)) {
                                        this.A06 = this.A06.A01(dAa, this.A06.A0B, j4);
                                        if (z5) {
                                            this.A0O.A00(2);
                                            break;
                                        }
                                    }
                                } else {
                                    j6 = j5;
                                }
                                long A012 = A01(dAa, j6);
                                if (j5 == A012) {
                                    z27 = false;
                                }
                                z5 |= z27;
                                j5 = A012;
                            }
                            this.A06 = this.A06.A01(dAa, j5, j4);
                            if (z5) {
                                this.A0O.A00(2);
                                break;
                            }
                        } else {
                            j5 = 0;
                        }
                    } else {
                        C29742D7o d7o = this.A06.A03;
                        boolean A072 = d7o.A07();
                        if (!A072) {
                            int i12 = 0;
                            if (A072) {
                                i12 = -1;
                            }
                            d7o.A06(i12, this.A0S, false, 0);
                        }
                        dAa = new C29791DAa(0, -1, -1, -1);
                        j5 = -9223372036854775807L;
                        j4 = -9223372036854775807L;
                    }
                    z5 = true;
                    try {
                        if (this.A09 == null || this.A00 > 0) {
                        }
                        this.A06 = this.A06.A01(dAa, j5, j4);
                        if (z5) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.A06 = this.A06.A01(dAa, j5, j4);
                        if (z5) {
                            this.A0O.A00(2);
                        }
                        throw th;
                    }
                    break;
                case 4:
                    this.A0M.BjV((DAX) message2.obj);
                    break;
                case 5:
                    this.A08 = (C25949Bd1) message2.obj;
                    break;
                case 6:
                    int i13 = message2.arg1;
                    boolean z28 = false;
                    if (i13 != 0) {
                        z28 = true;
                    }
                    A0H(z28, true);
                    break;
                case 7:
                    A0I(true, true, true);
                    this.A0P.onReleased();
                    A0A(1);
                    this.A0L.quit();
                    synchronized (this) {
                        this.A0F = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    C29799DAj dAj = (C29799DAj) message2.obj;
                    if (dAj.A01 == this.A09) {
                        DAS das6 = this.A06;
                        C29742D7o d7o2 = das6.A03;
                        C29742D7o d7o3 = dAj.A00;
                        Object obj3 = dAj.A02;
                        this.A0Q.A07 = d7o3;
                        DAS das7 = new DAS(d7o3, obj3, das6.A04, das6.A02, das6.A01, das6.A00, das6.A09, das6.A05, das6.A06, das6.A07);
                        DAS.A00(das6, das7);
                        this.A06 = das7;
                        int size = this.A0X.size() - 1;
                        if (size < 0) {
                            Collections.sort(this.A0X);
                            int i14 = this.A00;
                            long j11 = 0;
                            if (i14 <= 0) {
                                DAS das8 = this.A06;
                                int i15 = das8.A04.A02;
                                long j12 = das8.A01;
                                if (d7o2.A07()) {
                                    if (!d7o3.A07()) {
                                        C29791DAa A0B2 = this.A0Q.A0B(i15, j12);
                                        DAS das9 = this.A06;
                                        if (!A0B2.A01()) {
                                            j11 = j12;
                                        }
                                        this.A06 = das9.A01(A0B2, j11, j12);
                                        break;
                                    }
                                } else {
                                    DAM A0A2 = this.A0Q.A0A();
                                    if (A0A2 == null) {
                                        obj = d7o2.A05(i15, this.A0R, true).A04;
                                    } else {
                                        obj = A0A2.A09;
                                    }
                                    int A033 = d7o3.A03(obj);
                                    if (A033 != -1) {
                                        if (A033 != i15) {
                                            DAS das10 = this.A06;
                                            C29742D7o d7o4 = das10.A03;
                                            Object obj4 = das10.A08;
                                            C29791DAa A002 = das10.A04.A00(A033);
                                            long j13 = das10.A02;
                                            DAS das11 = new DAS(d7o4, obj4, A002, j13, das10.A01, das10.A00, das10.A09, das10.A05, das10.A06, das10.A07);
                                            DAS.A00(das10, das11);
                                            this.A06 = das11;
                                        }
                                        C29791DAa dAa2 = this.A06.A04;
                                        if (dAa2.A01()) {
                                            C29791DAa A0B3 = this.A0Q.A0B(A033, j12);
                                            if (!A0B3.equals(dAa2)) {
                                                if (!A0B3.A01()) {
                                                    j11 = j12;
                                                }
                                                this.A06 = this.A06.A01(A0B3, A01(A0B3, j11), j12);
                                                break;
                                            }
                                        }
                                        DAP dap8 = this.A0Q;
                                        long j14 = this.A03;
                                        int i16 = dAa2.A02;
                                        DAM A0A3 = dap8.A0A();
                                        DAM dam19 = null;
                                        while (true) {
                                            if (A0A3 != null) {
                                                if (dam19 == null) {
                                                    DAZ daz3 = A0A3.A02;
                                                    A0A3.A02 = DAP.A03(dap8, daz3, daz3.A04.A00(i16));
                                                } else if (i16 == -1 || !A0A3.A09.equals(dap8.A07.A05(i16, dap8.A0A, true).A04)) {
                                                    z3 = !dap8.A0D(dam19);
                                                } else {
                                                    DAZ A023 = DAP.A02(dap8, dam19, j14);
                                                    if (A023 == null) {
                                                        z3 = !dap8.A0D(dam19);
                                                    } else {
                                                        DAZ daz4 = A0A3.A02;
                                                        DAZ A034 = DAP.A03(dap8, daz4, daz4.A04.A00(i16));
                                                        A0A3.A02 = A034;
                                                        if (A034.A03 == A023.A03 && A034.A02 == A023.A02) {
                                                            z4 = true;
                                                            break;
                                                        }
                                                        z4 = false;
                                                        if (!z4) {
                                                            z3 = !dap8.A0D(dam19);
                                                        }
                                                    }
                                                }
                                                if (A0A3.A02.A06) {
                                                    i16 = dap8.A07.A02(i16, dap8.A0A, dap8.A0B, dap8.A01);
                                                }
                                                dam19 = A0A3;
                                                A0A3 = A0A3.A01;
                                            } else {
                                                z3 = true;
                                            }
                                        }
                                        z3 = !dap8.A0D(dam19);
                                        if (!z3) {
                                            A0F(false);
                                            break;
                                        }
                                    } else {
                                        int A003 = A00(i15, d7o2, d7o3);
                                        if (A003 != -1) {
                                            d7o3.A05(A003, this.A0R, false);
                                            Pair A042 = d7o3.A04(this.A0S, this.A0R, 0, -9223372036854775807L, 0);
                                            int intValue2 = ((Integer) A042.first).intValue();
                                            long longValue = ((Long) A042.second).longValue();
                                            C29791DAa A0B4 = this.A0Q.A0B(intValue2, longValue);
                                            d7o3.A05(intValue2, this.A0R, true);
                                            if (A0A2 != null) {
                                                Object obj5 = this.A0R.A04;
                                                A0A2.A02 = A0A2.A02.A00();
                                                while (true) {
                                                    A0A2 = A0A2.A01;
                                                    if (A0A2 != null) {
                                                        if (A0A2.A09.equals(obj5)) {
                                                            DAP dap9 = this.A0Q;
                                                            DAZ daz5 = A0A2.A02;
                                                            A0A2.A02 = DAP.A03(dap9, daz5, daz5.A04.A00(intValue2));
                                                        } else {
                                                            A0A2.A02 = A0A2.A02.A00();
                                                        }
                                                    }
                                                }
                                            }
                                            if (!A0B4.A01()) {
                                                j11 = longValue;
                                            }
                                            this.A06 = this.A06.A01(A0B4, A01(A0B4, j11), longValue);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                this.A0O.A01 += i14;
                                this.A00 = 0;
                                C29800DAk dAk2 = this.A05;
                                if (dAk2 == null) {
                                    C29802DAm dAm = this.A04;
                                    if (dAm == null) {
                                        if (this.A06.A02 == -9223372036854775807L) {
                                            boolean A073 = d7o3.A07();
                                            if (!A073) {
                                                int i17 = 0;
                                                if (A073) {
                                                    i17 = -1;
                                                }
                                                Pair A043 = d7o3.A04(this.A0S, this.A0R, i17, -9223372036854775807L, 0);
                                                int intValue3 = ((Integer) A043.first).intValue();
                                                long longValue2 = ((Long) A043.second).longValue();
                                                C29791DAa A0B5 = this.A0Q.A0B(intValue3, longValue2);
                                                DAS das12 = this.A06;
                                                if (A0B5.A01()) {
                                                    j = 0;
                                                } else {
                                                    j = longValue2;
                                                }
                                                this.A06 = das12.A01(A0B5, j, longValue2);
                                                break;
                                            }
                                        }
                                    } else {
                                        long j15 = dAm.A00;
                                        C29791DAa dAa3 = dAm.A01;
                                        this.A04 = null;
                                        DAS das13 = this.A06;
                                        if (dAa3.A01()) {
                                            j2 = 0;
                                        } else {
                                            j2 = j15;
                                        }
                                        this.A06 = das13.A01(dAa3, j2, j15);
                                        break;
                                    }
                                } else {
                                    Pair A035 = A03(dAk2, true);
                                    this.A05 = null;
                                    if (A035 != null) {
                                        int intValue4 = ((Integer) A035.first).intValue();
                                        long longValue3 = ((Long) A035.second).longValue();
                                        C29791DAa A0B6 = this.A0Q.A0B(intValue4, longValue3);
                                        DAS das14 = this.A06;
                                        if (A0B6.A01()) {
                                            j3 = 0;
                                        } else {
                                            j3 = longValue3;
                                        }
                                        this.A06 = das14.A01(A0B6, j3, longValue3);
                                        break;
                                    }
                                }
                            }
                            A0A(4);
                            A0I(false, true, false);
                            break;
                        } else {
                            this.A0X.get(size);
                            throw null;
                        }
                    }
                    break;
                case 9:
                    D6N d6n = (D6N) message2.obj;
                    DAM dam20 = this.A0Q.A04;
                    if (dam20 != null) {
                        z2 = true;
                        break;
                    }
                    z2 = false;
                    if (z2) {
                        dam20.A06 = true;
                        dam20.A03 = dam20.A08.AYp();
                        dam20.A04();
                        long A013 = dam20.A01(dam20.A02.A03, false, new boolean[dam20.A0A.length]);
                        long j16 = dam20.A00;
                        DAZ daz6 = dam20.A02;
                        dam20.A00 = j16 + (daz6.A03 - A013);
                        dam20.A02 = new DAZ(daz6.A04, A013, daz6.A02, daz6.A00, daz6.A01, daz6.A06, daz6.A05);
                        this.A0P.BSL(this.A0Z, dam20.A03, dam20.A04.A01);
                        DAP dap10 = this.A0Q;
                        boolean z29 = false;
                        if (dap10.A05 != null) {
                            z29 = true;
                        }
                        if (!z29) {
                            A0B(dap10.A09().A02.A03);
                            A0C((DAM) null);
                        }
                        boolean z30 = this.A0D;
                        DAM dam21 = this.A0Q.A04;
                        if (dam21 != null) {
                            dam21.A08.BjU(z30);
                        }
                    }
                    break;
                case 10:
                    D6N d6n2 = (D6N) message2.obj;
                    DAM dam22 = this.A0Q.A04;
                    if (dam22 != null) {
                        z = true;
                        break;
                    }
                    z = false;
                    if (z) {
                        long j17 = this.A03;
                        if (dam22 != null && dam22.A06) {
                            dam22.A08.BZR(j17 - dam22.A00);
                        }
                    }
                    break;
                case C120125Dh.VIEW_TYPE_BANNER:
                    DAP dap11 = this.A0Q;
                    DAM dam23 = dap11.A05;
                    boolean z31 = false;
                    if (dam23 != null) {
                        z31 = true;
                    }
                    if (z31) {
                        DAM dam24 = dap11.A06;
                        boolean z32 = true;
                        while (true) {
                            if (dam23 != null && dam23.A06) {
                                if (dam23.A04()) {
                                    if (z32) {
                                        DAP dap12 = this.A0Q;
                                        DAM dam25 = dap12.A05;
                                        boolean A0D2 = dap12.A0D(dam25);
                                        boolean[] zArr = new boolean[this.A0Z.length];
                                        long A014 = dam25.A01(this.A06.A0B, A0D2, zArr);
                                        this.A0P.BSL(this.A0Z, dam25.A03, dam25.A04.A01);
                                        DAS das15 = this.A06;
                                        if (!(das15.A00 == 4 || A014 == das15.A0B)) {
                                            DAS das16 = this.A06;
                                            this.A06 = das16.A01(das16.A04, A014, das16.A01);
                                            this.A0O.A00(4);
                                            A0B(A014);
                                        }
                                        boolean[] zArr2 = new boolean[this.A0Z.length];
                                        int i18 = 0;
                                        int i19 = 0;
                                        while (true) {
                                            DAR[] darArr6 = this.A0Z;
                                            if (i18 < darArr6.length) {
                                                DAR dar5 = darArr6[i18];
                                                boolean z33 = false;
                                                if (dar5.AWh() != 0) {
                                                    z33 = true;
                                                }
                                                zArr2[i18] = z33;
                                                D7Y d7y3 = dam25.A0B[i18];
                                                if (d7y3 != null) {
                                                    i19++;
                                                }
                                                if (z33) {
                                                    if (d7y3 != dar5.AX1()) {
                                                        A0E(dar5);
                                                    } else if (zArr[i18]) {
                                                        dar5.Bde(this.A03);
                                                    }
                                                }
                                                i18++;
                                            } else {
                                                this.A06 = this.A06.A02(dam25.A03, dam25.A04);
                                                A0J(zArr2, i19);
                                            }
                                        }
                                    } else {
                                        this.A0Q.A0D(dam23);
                                        if (dam23.A06) {
                                            dam23.A01(Math.max(dam23.A02.A03, this.A03 - dam23.A00), false, new boolean[dam23.A0A.length]);
                                            this.A0P.BSL(this.A0Z, dam23.A03, dam23.A04.A01);
                                        }
                                    }
                                    if (this.A06.A00 != 4) {
                                        A04();
                                        A09();
                                        this.A0V.BfD(2);
                                        break;
                                    }
                                } else {
                                    if (dam23 == dam24) {
                                        z32 = false;
                                    }
                                    dam23 = dam23.A01;
                                }
                            }
                        }
                    }
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER:
                    int i20 = message2.arg1;
                    this.A01 = i20;
                    DAP dap13 = this.A0Q;
                    dap13.A01 = i20;
                    if (!DAP.A06(dap13)) {
                    }
                    break;
                case C120125Dh.VIEW_TYPE_BADGE:
                    int i21 = message2.arg1;
                    boolean z34 = false;
                    if (i21 != 0) {
                        z34 = true;
                    }
                    this.A0G = z34;
                    DAP dap14 = this.A0Q;
                    dap14.A09 = z34;
                    break;
                case C120125Dh.VIEW_TYPE_LINK:
                    D39 d39 = (D39) message2.obj;
                    if (d39.A01.getLooper() != this.A0V.APT()) {
                        this.A0V.AqM(15, d39).sendToTarget();
                        break;
                    } else {
                        A0D(d39);
                        int i22 = this.A06.A00;
                        if (i22 == 3 || i22 == 2) {
                            this.A0V.BfD(2);
                            break;
                        }
                    }
                case 15:
                    D39 d392 = (D39) message2.obj;
                    AnonymousClass0ZA.A0E(d392.A01, new DAY(this, d392), 1923871654);
                    break;
                case 16:
                    this.A0Q.A05.A08.BXc(((Long) message2.obj).longValue());
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                    C29802DAm dAm2 = (C29802DAm) message2.obj;
                    this.A0O.A01++;
                    C29791DAa dAa4 = dAm2.A01;
                    long j18 = dAm2.A00;
                    long j19 = j18;
                    boolean z35 = false;
                    boolean z36 = false;
                    if (j18 == -9223372036854775807L) {
                        z36 = true;
                    }
                    try {
                        if (this.A09 == null || this.A00 > 0) {
                            this.A04 = dAm2;
                            this.A05 = null;
                        } else {
                            DAM dam26 = this.A0Q.A05;
                            if (!(dam26 == null || j18 == 0)) {
                                j19 = dam26.A08.AFc(j18, this.A08);
                            }
                            if (C29686D4x.A01(j19) == C29686D4x.A01(this.A06.A0B)) {
                                this.A06 = this.A06.A01(dAa4, j18, j18);
                                if (z36) {
                                    this.A0O.A00(2);
                                    break;
                                }
                            } else {
                                j19 = A01(dAa4, j19);
                                if (j19 != j19) {
                                    z35 = true;
                                }
                                z36 |= z35;
                            }
                        }
                        this.A06 = this.A06.A01(dAa4, j19, j19);
                        if (z36) {
                            this.A0O.A00(2);
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        this.A06 = this.A06.A01(dAa4, j18, j18);
                        if (z36) {
                            this.A0O.A00(2);
                        }
                        throw th;
                    }
                    break;
                case 18:
                    long longValue4 = ((Long) message2.obj).longValue();
                    C29791DAa dAa5 = this.A0Q.A05.A02.A04;
                    long A024 = A02(dAa5, longValue4, true);
                    if (A024 != longValue4) {
                        DAS das17 = this.A06;
                        this.A06 = das17.A01(dAa5, A024, das17.A01);
                        break;
                    }
                    break;
                default:
                    return false;
            }
        } catch (C29260Cum e2) {
            if (e2.getClass().equals(C29260Cum.class) && this.A0C) {
                long j20 = this.A02;
                if (j20 == -9223372036854775807L) {
                    Log.w("ExoPlayerImplInternal", AnonymousClass000.A0E("Temporarily ignoring stream error: ", e2.getMessage()));
                    this.A02 = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - j20 <= this.A0J) {
                }
            }
            throw e2;
        } catch (C29260Cum e3) {
            if (e3.getClass().equals(C29260Cum.class) && this.A0C) {
                long j21 = this.A02;
                if (j21 == -9223372036854775807L) {
                    Log.w("ExoPlayerImplInternal", AnonymousClass000.A0E("Temporarily ignoring stream error: ", e3.getMessage()));
                    this.A02 = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - j21 <= this.A0J) {
                }
            }
            throw e3;
        } catch (D3Z e4) {
            e = e4;
            Log.e("ExoPlayerImplInternal", "Playback error.", e);
            A0H(false, false);
            handler = this.A0K;
            handler.obtainMessage(2, e).sendToTarget();
            A05();
            return true;
        } catch (IOException e5) {
            Log.e("ExoPlayerImplInternal", "Source error.", e5);
            A0H(false, false);
            handler = this.A0K;
            e = new D3Z(0, e5);
            handler.obtainMessage(2, e).sendToTarget();
            A05();
            return true;
        } catch (RuntimeException e6) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e6);
            A0H(false, false);
            handler = this.A0K;
            e = new D3Z(2, e6);
            handler.obtainMessage(2, e).sendToTarget();
            A05();
            return true;
        } catch (Throwable th3) {
            this.A0K.obtainMessage(3, Boolean.valueOf(z14)).sendToTarget();
            throw th3;
        }
    }

    public DAN(DAR[] darArr, DAf dAf, DAL dal, DAW daw, boolean z, Handler handler, D3B d3b, BME bme, boolean z2, long j) {
        this.A0Z = darArr;
        this.A0T = dAf;
        DAL dal2 = dal;
        this.A0b = dal;
        this.A0P = daw;
        this.A0D = z;
        this.A01 = 0;
        this.A0G = false;
        this.A0K = handler;
        this.A0N = d3b;
        BME bme2 = bme;
        this.A0U = bme2;
        this.A0Q = new DAP();
        this.A0B = z2;
        this.A0J = j;
        this.A0C = j > 0;
        this.A0I = daw.AGW();
        this.A0Y = daw.Be1();
        this.A08 = C25949Bd1.A03;
        this.A06 = new DAS(C29742D7o.A00, -9223372036854775807L, TrackGroupArray.A03, dal2);
        this.A0O = new C29795DAe();
        int length = darArr.length;
        C29804DAo[] dAoArr = new C29804DAo[length];
        this.A0a = dAoArr;
        for (int i = 0; i < length; i++) {
            DAR dar = darArr[i];
            dar.Bi2(i);
            dAoArr[i] = dar.AHo();
        }
        this.A0M = new DAT(this, bme2);
        this.A0W = new DAV(bme2);
        this.A0X = new ArrayList();
        this.A0H = new DAR[0];
        this.A0S = new D7h();
        this.A0R = new DAU();
        dAf.A00 = this;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.A0L = handlerThread;
        handlerThread.start();
        this.A0V = bme2.AAZ(this.A0L.getLooper(), this);
    }

    private int A00(int i, C29742D7o d7o, C29742D7o d7o2) {
        int A002 = d7o.A00();
        int i2 = -1;
        for (int i3 = 0; i3 < A002 && i2 == -1; i3++) {
            i = d7o.A02(i, this.A0R, this.A0S, this.A01);
            if (i == -1) {
                break;
            }
            i2 = d7o2.A03(d7o.A05(i, this.A0R, true).A04);
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[LOOP:0: B:1:0x000f->B:18:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044 A[SYNTHETIC] */
    private long A02(C29791DAa dAa, long j, boolean z) {
        boolean z2;
        A08();
        this.A0E = false;
        A0A(2);
        DAM dam = this.A0Q.A05;
        DAM dam2 = dam;
        while (true) {
            if (dam2 == null) {
                break;
            }
            C29791DAa dAa2 = dam2.A02.A04;
            if (dAa.equals(dAa2) && dam2.A06) {
                this.A06.A03.A05(dAa2.A02, this.A0R, false);
                DAU dau = this.A0R;
                int A012 = dau.A01(j);
                if (A012 == -1 || dau.A02.A01[A012] == dam2.A02.A02) {
                    z2 = true;
                    if (!z2) {
                        this.A0Q.A0D(dam2);
                        break;
                    }
                    dam2 = this.A0Q.A09();
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        if (dam != dam2 || z) {
            for (DAR A0E2 : this.A0H) {
                A0E(A0E2);
            }
            this.A0H = new DAR[0];
            dam = null;
        }
        if (dam2 != null) {
            A0C(dam);
            if (dam2.A05) {
                j = dam2.A08.Bf0(j);
                dam2.A08.AC6(j - this.A0I, this.A0Y);
            }
            A0B(j);
            A04();
        } else {
            this.A0Q.A0C(true);
            A0B(j);
        }
        this.A0V.BfD(2);
        return j;
    }
}
