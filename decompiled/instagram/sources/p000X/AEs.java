package p000X;

import java.util.ArrayList;

/* renamed from: X.AEs */
public final class AEs implements AnonymousClass662 {
    public final /* synthetic */ C23257AEw A00;
    public final /* synthetic */ C23259AEy A01;
    public final /* synthetic */ C51382Kl A02;

    public final void onSearchCleared(String str) {
    }

    public AEs(C23257AEw aEw, C51382Kl r2, C23259AEy aEy) {
        this.A00 = aEw;
        this.A02 = r2;
        this.A01 = aEy;
    }

    public final void onSearchTextChanged(String str) {
        C51432Kq r6 = this.A02.A01;
        C23259AEy aEy = this.A01;
        C49672Dd r4 = aEy.A01;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() == 0) {
            arrayList.add(C51412Ko.A00(aEy));
            if (str == null) {
                str = "";
            }
            if (arrayList.size() == 1) {
                arrayList.add(C51412Ko.A00(str));
                r6.A00(r4, new C51422Kp(arrayList));
                return;
            }
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}
