package p000X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.BES */
public final class BES implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ BEV A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public BES(BEV bev, long j, List list, List list2, List list3) {
        this.A01 = bev;
        this.A00 = j;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
    }

    public final void run() {
        long j = this.A00 / 3;
        long j2 = 0;
        int i = 0;
        while (((long) i) < 3) {
            j2 = Math.min(this.A00, j2 + j);
            BEV.A01(this.A01, 2, 0, Long.valueOf(j2), (Long) null, (List) null, (Integer) null, (List) null);
            i++;
            SystemClock.sleep(BEV.A0D);
        }
        if (this.A01.A06.get()) {
            BEV.A01(this.A01, 6, -6, (Long) null, (Long) null, (List) null, (Integer) null, (List) null);
        } else {
            this.A01.A04.A25();
        }
    }
}
