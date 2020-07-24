package p000X;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0nL  reason: invalid class name and case insensitive filesystem */
public final class C15670nL extends C15190mU {
    public long A00;
    public long A01;
    public long A02;
    public C15620nG A03;
    public final Set A04 = new HashSet();
    public final boolean A05 = true;

    public C15670nL(C15620nG r3) {
        this.A03 = r3;
    }

    public final void onNewData(AnonymousClass1C4 r5, C256019m r6, ByteBuffer byteBuffer) {
        this.A00 += (long) byteBuffer.limit();
        if (r6.A00() == Constants.A0C) {
            this.A01 += (long) byteBuffer.limit();
        }
    }

    public final void onRequestCallbackDone(AnonymousClass1C4 r26, C256019m r27) {
        double d;
        double d2;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A02;
        long j = this.A00;
        if (j < 50000 || elapsedRealtime <= 50) {
            d = -1.0d;
        } else {
            d = (((double) j) * 1.0d) / ((double) elapsedRealtime);
        }
        this.A04.remove(r26);
        if (d != -1.0d) {
            C15620nG r9 = this.A03;
            C41881r5 r10 = C41881r5.EXPERIMENTAL;
            long j2 = this.A00;
            this.A04.size();
            r9.A01(r10, d, j2, elapsedRealtime);
        }
        if (this.A04.isEmpty()) {
            if (d != -1.0d && this.A05) {
                C15620nG r6 = this.A03;
                C41881r5 r18 = C41881r5.STANDARD;
                long j3 = this.A00;
                this.A04.size();
                r6.A01(r18, d, j3, elapsedRealtime);
            }
            long j4 = this.A01;
            if (j4 < 50000 || elapsedRealtime <= 50) {
                d2 = -1.0d;
            } else {
                d2 = (((double) j4) * 1.0d) / ((double) elapsedRealtime);
            }
            if (d2 != -1.0d) {
                C15620nG r92 = this.A03;
                C41881r5 r102 = C41881r5.ONSCREEN;
                long j5 = this.A00;
                this.A04.size();
                r92.A01(r102, d2, j5, elapsedRealtime);
            }
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    public final void onResponseStarted(AnonymousClass1C4 r3, C256019m r4, C33851db r5) {
        this.A04.add(r3);
        if (this.A04.size() == 1) {
            this.A02 = SystemClock.elapsedRealtime();
        }
    }
}
