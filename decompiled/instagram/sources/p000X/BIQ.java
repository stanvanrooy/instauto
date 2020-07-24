package p000X;

import android.content.Context;
import com.google.android.gms.internal.p026authapi.zzk;
import com.google.android.gms.internal.p026authapi.zzo;
import com.google.android.gms.internal.p026authapi.zzw;
import com.google.android.gms.internal.p026authapi.zzy;

/* renamed from: X.BIQ */
public abstract class BIQ extends C25390BHi {
    public void A0G(Context context, zzw zzw) {
        if (this instanceof BIR) {
            zzw.Bve(new zzo((BIR) this));
        } else if (!(this instanceof BIE)) {
            BID bid = (BID) this;
            zzw.Bvf(new zzk(bid), bid.A00);
        } else {
            BIE bie = (BIE) this;
            zzw.Bvg(new zzo(bie), new zzy(bie.A00));
        }
    }

    public BIQ(BIG big) {
        super(BIL.A05, big);
    }
}
