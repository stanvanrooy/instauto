package p000X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DOo */
public final class DOo implements C88443sQ {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKT A01;
    public final /* synthetic */ C30053DOi A02;
    public final /* synthetic */ DQ6 A03;

    public DOo(C30053DOi dOi, DQ6 dq6, DKT dkt, Handler handler) {
        this.A02 = dOi;
        this.A03 = dq6;
        this.A01 = dkt;
        this.A00 = handler;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd = new C30073DPd((Throwable) exc);
        dPd.A01(map);
        DKO.A03(this.A01, this.A00, dPd);
    }

    public final void onSuccess() {
        DLI r3;
        ArrayList arrayList = new ArrayList();
        C30053DOi dOi = this.A02;
        if (dOi.A0G) {
            arrayList.add(new DLH(dOi.A08.getAbsolutePath(), new AnonymousClass8MH(), (C29998DKz) null, this.A02.A06, (Boolean) null, (DPA) null));
        } else {
            String absolutePath = dOi.A08.getAbsolutePath();
            C30053DOi dOi2 = this.A02;
            DKK dkk = dOi2.A03;
            C30081DPl dPl = dOi2.A06;
            if (dkk != null) {
                r3 = new AnonymousClass8MI();
            } else {
                r3 = new AnonymousClass8MH();
            }
            arrayList.add(new DLH(absolutePath, r3, dkk, dPl, (Boolean) null, (DPA) null));
        }
        this.A02.A05 = new DLG(arrayList);
        C30053DOi dOi3 = this.A02;
        DLG dlg = dOi3.A05;
        dlg.A00 = dOi3.A00;
        Iterator it = dlg.A06.iterator();
        while (it.hasNext()) {
            it.next();
        }
        DQ6 dq6 = this.A03;
        int i = dq6.A00 - 1;
        dq6.A00 = i;
        if (i == 0) {
            this.A02.A0H = true;
            DKO.A02(this.A01, this.A00);
        }
    }
}
