package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.Comparator;
import java.util.PriorityQueue;

/* renamed from: X.ANJ */
public final class ANJ {
    public ANO A00;
    public ANK A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C72043Dk A03;
    public final Comparator A04;
    public final PriorityQueue A05;

    public final void A00() {
        if (this.A01 != null) {
            this.A03.Blm((ANK) null);
            this.A01 = null;
        }
        this.A05.clear();
        AnonymousClass0ZA.A07(this.A02, (Object) null);
    }

    public final void A01(ANG ang) {
        this.A05.add(ang);
        AnonymousClass0ZA.A09(this.A02, new ANN(this), Math.max(0, ang.ASG() - this.A03.AJe()), -2021141780);
        if (this.A01 == null) {
            ANK ank = new ANK(this);
            this.A01 = ank;
            this.A03.Blm(ank);
        }
    }

    public void notifyEvent() {
        long AJe = this.A03.AJe();
        while (!this.A05.isEmpty()) {
            ANG ang = (ANG) this.A05.poll();
            if (ang.ASG() <= AJe) {
                ANO ano = this.A00;
                if (ano != null) {
                    ano.B2t(ang, AJe);
                }
            } else {
                A01(ang);
                return;
            }
        }
    }

    public ANJ(C72043Dk r4) {
        ANL anl = new ANL(this);
        this.A04 = anl;
        this.A05 = new PriorityQueue(1, anl);
        this.A03 = r4;
    }
}
