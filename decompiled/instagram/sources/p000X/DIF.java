package p000X;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: X.DIF */
public final class DIF implements C29953DId {
    public final /* synthetic */ DIH A00;

    public DIF(DIH dih) {
        this.A00 = dih;
    }

    public final void B7r(long j) {
        Log.w("AudioTrack", AnonymousClass000.A0B("Ignoring impossibly large audio latency: ", j));
    }

    public final void BEl(long j, long j2, long j3, long j4) {
        long j5;
        StringBuilder sb = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        DIH dih = this.A00;
        DIJ dij = dih.A0F;
        if (dij.A08) {
            j5 = dih.A09 / ((long) dij.A01);
        } else {
            j5 = dih.A08;
        }
        sb.append(j5);
        sb.append(", ");
        sb.append(DIH.A02(dih));
        Log.w("AudioTrack", sb.toString());
    }

    public final void BQb(long j, long j2, long j3, long j4) {
        long j5;
        StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        DIH dih = this.A00;
        DIJ dij = dih.A0F;
        if (dij.A08) {
            j5 = dih.A09 / ((long) dij.A01);
        } else {
            j5 = dih.A08;
        }
        sb.append(j5);
        sb.append(", ");
        sb.append(DIH.A02(dih));
        Log.w("AudioTrack", sb.toString());
    }

    public final void BT4(int i, long j) {
        DIH dih = this.A00;
        DIG dig = dih.A0D;
        if (dig != null) {
            dig.BT5(i, j, SystemClock.elapsedRealtime() - dih.A04);
        }
    }
}
