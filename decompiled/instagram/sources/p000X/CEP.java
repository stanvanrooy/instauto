package p000X;

import android.view.View;
import java.util.Iterator;

/* renamed from: X.CEP */
public final class CEP implements View.OnClickListener {
    public final /* synthetic */ CG0 A00;
    public final /* synthetic */ CG9 A01;

    public CEP(CG0 cg0, CG9 cg9) {
        this.A00 = cg0;
        this.A01 = cg9;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1818868577);
        C27511CGb cGb = this.A00.A01;
        CG9 cg9 = this.A01;
        C27469CEl cEl = cGb.A00.A05;
        Iterator it = cEl.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((CG9) it.next()).A00.equals(cg9.A00)) {
                    it.remove();
                    C27469CEl.A00(cEl);
                    cEl.A00.A06(AnonymousClass17A.A01(cEl.A02, new C27490CFg(cEl)), cEl.A01);
                    break;
                }
            } else {
                break;
            }
        }
        CE6.A00(cGb.A00);
        AnonymousClass0Z0.A0C(-1939832659, A05);
    }
}
