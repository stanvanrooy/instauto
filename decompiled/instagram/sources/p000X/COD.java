package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.COD */
public final class COD extends AnonymousClass1PF {
    public final List A00 = new ArrayList();
    public final COG A01;
    public final COJ A02;
    public final AnonymousClass9T1 A03;
    public final C46141zC A04;

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public COD(Context context, C27707COb cOb, COL col) {
        COG cog = new COG(this);
        this.A01 = cog;
        this.A02 = new COJ(context, cOb);
        this.A04 = new C46141zC(context);
        COE coe = new COE(col, cog, context);
        this.A03 = coe;
        coe.BlW();
        A0I(this.A02, this.A04);
    }

    public final void A0J() {
        if (isEmpty()) {
            this.A03.Bse();
            A0E();
            A0C(this.A03.AGk(), this.A03.AL5(), this.A04);
        } else {
            A0E();
            for (C27706COa A0G : this.A00) {
                A0G(A0G, this.A02);
            }
        }
        notifyDataSetChanged();
    }
}
