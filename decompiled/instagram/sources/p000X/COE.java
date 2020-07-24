package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.COE */
public final class COE implements AnonymousClass9T1 {
    public AnonymousClass2Oq A00 = AnonymousClass2Oq.EMPTY;
    public final C29081On A01;
    public final Context A02;
    public final COG A03;
    public final Map A04 = new HashMap();

    public final AnonymousClass2PB AGk() {
        AnonymousClass2PB r0 = (AnonymousClass2PB) this.A04.get(this.A00);
        if (r0 == null) {
            return new AnonymousClass2PB();
        }
        return r0;
    }

    public final void BlW() {
        AnonymousClass2PB r2 = new AnonymousClass2PB();
        r2.A00 = C019000b.A00(this.A02, C0003R.color.white);
        this.A04.put(AnonymousClass2Oq.LOADING, r2);
        AnonymousClass2PB r22 = new AnonymousClass2PB();
        r22.A02 = C0003R.C0004drawable.loadmore_icon_refresh_compound;
        r22.A00 = C019000b.A00(this.A02, C0003R.color.white);
        r22.A05 = new COF(this);
        this.A04.put(AnonymousClass2Oq.ERROR, r22);
    }

    public final void Bse() {
        AnonymousClass2Oq r0;
        AnonymousClass2Oq r1 = this.A00;
        if (this.A01.AgL()) {
            r0 = AnonymousClass2Oq.LOADING;
        } else if (this.A01.AfR()) {
            r0 = AnonymousClass2Oq.ERROR;
        } else {
            r0 = AnonymousClass2Oq.EMPTY;
        }
        this.A00 = r0;
        if (r0 != r1) {
            this.A03.A00.A0J();
        }
    }

    public COE(C29081On r2, COG cog, Context context) {
        this.A01 = r2;
        this.A03 = cog;
        this.A02 = context;
    }

    public final AnonymousClass2Oq AL5() {
        return this.A00;
    }
}
