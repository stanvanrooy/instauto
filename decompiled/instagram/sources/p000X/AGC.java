package p000X;

import android.util.SparseArray;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AGC */
public final class AGC {
    public AGF A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;
    public final SparseArray A04;
    public final A44 A05;
    public final C228089rf A06;
    public final AGE A07 = new AGE(this);
    public final AGD A08 = new AGD(this);
    public final ACK A09;
    public final AGK A0A;
    public final Object A0B = new Object();
    public final Object A0C = new Object();
    public final PriorityQueue A0D;
    public final AtomicBoolean A0E = new AtomicBoolean(true);
    public final AtomicBoolean A0F = new AtomicBoolean(false);

    public static void A00(AGC agc) {
        AG6 A002 = AG6.A00(agc.A05);
        if (agc.A01 && agc.A0E.get()) {
            boolean z = false;
            if (A002.A04.size() > 0) {
                z = true;
            }
            if (!z) {
                agc.A09.A02(Constants.A0N, agc.A08);
                agc.A01 = false;
            }
        }
    }

    public static void A01(AGC agc) {
        if (agc.A0E.get() && !agc.A0F.get()) {
            A00(agc);
        }
    }

    public static void A02(AGC agc) {
        synchronized (agc.A0B) {
            if (agc.A03 && !agc.A02) {
                agc.A09.A01(Constants.A0Y, agc.A07);
                agc.A02 = true;
            }
        }
    }

    public void deleteTimer(int i) {
        synchronized (this.A0C) {
            AGJ agj = (AGJ) this.A04.get(i);
            if (agj != null) {
                this.A04.remove(i);
                this.A0D.remove(agj);
            }
        }
    }

    public void setSendIdleEvents(boolean z) {
        synchronized (this.A0B) {
            this.A03 = z;
        }
        C228039ra.A01(new AGG(this, z));
    }

    public AGC(A44 a44, AGK agk, ACK ack, C228089rf r7) {
        this.A05 = a44;
        this.A0A = agk;
        this.A09 = ack;
        this.A06 = r7;
        this.A0D = new PriorityQueue(11, new AGI(this));
        this.A04 = new SparseArray();
    }

    public void createTimer(int i, long j, boolean z) {
        AGJ agj = new AGJ(i, (System.nanoTime() / 1000000) + j, (int) j, z);
        synchronized (this.A0C) {
            this.A0D.add(agj);
            this.A04.put(i, agj);
        }
    }
}
