package p000X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.DAO */
public final class DAO implements D3B {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public D3Z A06;
    public DAS A07;
    public DAX A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public D6R A0D;
    public final CopyOnWriteArraySet A0E;
    public final boolean A0F;
    public final Handler A0G;
    public final Handler A0H;
    public final DAN A0I;
    public final DAU A0J;
    public final D7h A0K;
    public final DAf A0L;
    public final DAL A0M;
    public final DAR[] A0N;

    public final void BXs(D6R d6r) {
        BXt(d6r, true, true);
    }

    public final void BXt(D6R d6r, boolean z, boolean z2) {
        this.A06 = null;
        this.A0D = d6r;
        DAS A012 = A01(z, z2, 2);
        this.A09 = true;
        this.A02++;
        this.A0I.A0V.AqL(0, z ? 1 : 0, z2 ? 1 : 0, d6r).sendToTarget();
        A02(this, A012, false, 1, false);
    }

    public final void Bex(long j) {
        this.A0A = true;
        this.A02++;
        this.A04 = j;
        this.A0I.A0V.AqM(17, new C29802DAm(this.A07.A04, C29686D4x.A00(j))).sendToTarget();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public DAO(DAR[] darArr, DAf dAf, DAW daw, BME bme, boolean z, boolean z2, long j) {
        Looper mainLooper;
        DAR[] darArr2 = darArr;
        int length = darArr2.length;
        D6U.A03(length > 0);
        D6U.A01(darArr2);
        this.A0N = darArr2;
        DAf dAf2 = dAf;
        D6U.A01(dAf2);
        this.A0L = dAf2;
        this.A0B = false;
        this.A0E = new CopyOnWriteArraySet();
        this.A0F = z;
        this.A0M = new DAL(new C29798DAi[length], new D4t[length], (Object) null);
        this.A0K = new D7h();
        this.A0J = new DAU();
        this.A08 = DAX.A04;
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A0G = new DAQ(this, mainLooper);
        this.A07 = new DAS(C29742D7o.A00, 0, TrackGroupArray.A03, this.A0M);
        DAN dan = new DAN(darArr2, dAf2, this.A0M, daw, this.A0B, this.A0G, this, bme, z2, j);
        this.A0I = dan;
        this.A0H = new Handler(dan.A0L.getLooper());
    }

    private DAS A01(boolean z, boolean z2, int i) {
        int i2;
        C29742D7o d7o;
        Object obj;
        TrackGroupArray trackGroupArray;
        DAL dal;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A05 = 0;
            this.A04 = 0;
        } else {
            this.A01 = A04();
            if (A03()) {
                i2 = this.A00;
            } else {
                i2 = this.A07.A04.A02;
            }
            this.A00 = i2;
            this.A05 = AJS();
            this.A04 = AJF();
        }
        if (z2) {
            d7o = C29742D7o.A00;
        } else {
            d7o = this.A07.A03;
        }
        if (z2) {
            obj = null;
        } else {
            obj = this.A07.A08;
        }
        DAS das = this.A07;
        C29791DAa dAa = das.A04;
        long j = das.A02;
        long j2 = das.A01;
        if (z2) {
            trackGroupArray = TrackGroupArray.A03;
        } else {
            trackGroupArray = das.A05;
        }
        if (z2) {
            dal = this.A0M;
        } else {
            dal = das.A06;
        }
        return new DAS(d7o, obj, dAa, j, j2, i, false, trackGroupArray, dal, Constants.ZERO);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A08 != r8.A08) goto L_0x0010;
     */
    public static void A02(DAO dao, DAS das, boolean z, int i, boolean z2) {
        boolean z3;
        DAS das2 = dao.A07;
        boolean z4 = false;
        if (das2.A03 == das.A03) {
            z3 = false;
        }
        z3 = true;
        boolean z5 = false;
        if (das2.A00 != das.A00) {
            z5 = true;
        }
        boolean z6 = false;
        if (das2.A09 != das.A09) {
            z6 = true;
        }
        if (das2.A06 != das.A06) {
            z4 = true;
        }
        dao.A07 = das;
        if (z3 || i == 0) {
            Iterator it = dao.A0E.iterator();
            while (it.hasNext()) {
                DAS das3 = dao.A07;
                ((C29797DAh) it.next()).BRb(das3.A03, das3.A08, i);
            }
        }
        if (z) {
            Iterator it2 = dao.A0E.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (z4) {
            dao.A0L.A06(dao.A07.A06.A02);
            Iterator it3 = dao.A0E.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        if (z6) {
            Iterator it4 = dao.A0E.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        if (z5) {
            Iterator it5 = dao.A0E.iterator();
            while (it5.hasNext()) {
                ((C29797DAh) it5.next()).BEY(dao.A0C, dao.A07.A00);
            }
        }
        if (z2) {
            Iterator it6 = dao.A0E.iterator();
            while (it6.hasNext()) {
                it6.next();
            }
        }
    }

    private boolean A03() {
        if (this.A07.A03.A07() || this.A02 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r2.A04.A01() == false) goto L_0x002b;
     */
    public final void A05(int i, long j) {
        boolean A072;
        boolean z;
        long A002;
        long j2;
        DAS das = this.A07;
        C29742D7o d7o = das.A03;
        int i2 = i;
        if (i < 0 || (!(A072 = d7o.A07()) && i2 >= d7o.A01())) {
            throw new C29803DAn(d7o);
        }
        this.A0A = true;
        this.A02++;
        if (!A03()) {
            z = true;
        }
        z = false;
        if (z) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.A0G.obtainMessage(0, 1, -1, this.A07).sendToTarget();
            return;
        }
        this.A01 = i2;
        if (A072) {
            if (j == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j;
            }
            this.A05 = j2;
            this.A00 = 0;
        } else {
            if (j == -9223372036854775807L) {
                A002 = d7o.A06(i2, this.A0K, false, 0).A01;
            } else {
                A002 = C29686D4x.A00(j);
            }
            Pair A042 = d7o.A04(this.A0K, this.A0J, i2, A002, 0);
            this.A05 = C29686D4x.A01(A002);
            this.A00 = ((Integer) A042.first).intValue();
        }
        this.A0I.A0V.AqM(3, new C29800DAk(d7o, i2, C29686D4x.A00(j))).sendToTarget();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A3Q(C29797DAh dAh) {
        this.A0E.add(dAh);
    }

    public final D39 AAg(C29807DAr dAr) {
        DAN dan = this.A0I;
        C29742D7o d7o = this.A07.A03;
        A04();
        return new D39(dan, dAr, d7o, this.A0H);
    }

    public final SparseArray AFh() {
        int AYr;
        long AOT;
        DAM dam = this.A0I.A0Q.A05;
        SparseArray sparseArray = new SparseArray();
        if (dam != null) {
            D7Y[] d7yArr = dam.A0B;
            for (D7Y d7y : d7yArr) {
                if (d7y instanceof C29708D5u) {
                    C29708D5u d5u = (C29708D5u) d7y;
                    AYr = d5u.A0F;
                    AOT = d5u.A0I.A07();
                } else if (d7y instanceof C29805DAp) {
                    C29805DAp dAp = (C29805DAp) d7y;
                    AYr = dAp.AYr();
                    AOT = dAp.AOT();
                }
                sparseArray.put(AYr, Long.valueOf(AOT));
            }
        }
        return sparseArray;
    }

    public final long AHG() {
        return C29686D4x.A01(this.A07.A0A);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r2.A04.A01() == false) goto L_0x001f;
     */
    public final long AKc() {
        boolean z;
        long j;
        DAS das = this.A07;
        C29742D7o d7o = das.A03;
        if (d7o.A07()) {
            return -9223372036854775807L;
        }
        if (!A03()) {
            z = true;
        }
        z = false;
        if (z) {
            C29791DAa dAa = das.A04;
            d7o.A05(dAa.A02, this.A0J, false);
            j = this.A0J.A03(dAa.A00, dAa.A01);
        } else {
            j = d7o.A06(A04(), this.A0K, false, 0).A02;
        }
        return C29686D4x.A01(j);
    }

    public final HandlerThread ANv() {
        return this.A0I.A0L;
    }

    public final int ASH() {
        return this.A07.A00;
    }

    public final long AU1() {
        return this.A0I.A0W.ASP() / 1000;
    }

    public final Integer AWb() {
        return this.A07.A07;
    }

    public final void BXa(long j) {
        C29792DAb dAb;
        long valueOf;
        if (j == -1) {
            dAb = this.A0I.A0V;
            valueOf = -1L;
        } else {
            DAN dan = this.A0I;
            long A002 = C29686D4x.A00(j);
            dAb = dan.A0V;
            valueOf = Long.valueOf(A002);
        }
        dAb.AqM(16, valueOf).sendToTarget();
    }

    public final void Bai() {
        this.A0E.clear();
    }

    public final void Be4() {
        D6R d6r = this.A0D;
        if (d6r != null && this.A07.A00 == 1) {
            BXt(d6r, false, false);
        }
    }

    public final void BjU(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            this.A03++;
            this.A0I.A0V.AqK(1, z ? 1 : 0, 0).sendToTarget();
            DAS das = this.A07;
            if (!this.A0F || !z) {
                this.A0C = z;
                Iterator it = this.A0E.iterator();
                while (it.hasNext()) {
                    ((C29797DAh) it.next()).BEY(z, das.A00);
                }
            }
        }
    }

    public final void BjW(DAX dax) {
        if (dax == null) {
            dax = DAX.A04;
        }
        this.A0I.A0V.AqM(4, dax).sendToTarget();
    }

    public final void Bk6(long j) {
        this.A0I.A0W.A01(j * 1000);
    }

    public final void BkO(C25949Bd1 bd1) {
        if (bd1 == null) {
            bd1 = C25949Bd1.A03;
        }
        this.A0I.A0V.AqM(5, bd1).sendToTarget();
    }

    public final void release() {
        synchronized (D7c.class) {
        }
        this.A0D = null;
        DAN dan = this.A0I;
        synchronized (dan) {
            if (!dan.A0F) {
                dan.A0V.BfD(7);
                boolean z = false;
                while (!dan.A0F) {
                    try {
                        dan.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        AnonymousClass0ZA.A07(this.A0G, (Object) null);
        this.A07 = A01(false, false, 1);
    }

    public final void stop(boolean z) {
        if (z) {
            this.A06 = null;
            this.A0D = null;
        }
        DAS A012 = A01(z, z, 1);
        this.A02++;
        this.A0I.A0V.AqK(6, z ? 1 : 0, 0).sendToTarget();
        A02(this, A012, false, 1, false);
    }

    private long A00(long j) {
        long A012 = C29686D4x.A01(j);
        DAS das = this.A07;
        C29791DAa dAa = das.A04;
        if (dAa.A01()) {
            return A012;
        }
        das.A03.A05(dAa.A02, this.A0J, false);
        return A012 + C29686D4x.A01(this.A0J.A01);
    }

    public final int A04() {
        if (A03()) {
            return this.A01;
        }
        DAS das = this.A07;
        das.A03.A05(das.A04.A02, this.A0J, false);
        return 0;
    }

    public final void A6q(long j) {
        A05(A04(), j);
    }

    public final long AHI() {
        if (A03()) {
            return this.A05;
        }
        return A00(this.A07.A0A);
    }

    public final long AJF() {
        if (A03()) {
            return this.A04;
        }
        return C29686D4x.A01(this.A07.A0B);
    }

    public final long AJS() {
        if (A03()) {
            return this.A05;
        }
        return A00(this.A07.A0B);
    }

    public final boolean ASE() {
        return this.A0B;
    }

    public final void Beu(long j) {
        A05(A04(), j);
    }
}
