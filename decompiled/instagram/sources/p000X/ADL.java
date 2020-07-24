package p000X;

import java.util.ArrayList;

/* renamed from: X.ADL */
public final class ADL implements C32891c1 {
    public final /* synthetic */ AnonymousClass2EQ A00;
    public final /* synthetic */ ADM A01;
    public final /* synthetic */ C51382Kl A02;

    public ADL(ADM adm, AnonymousClass2EQ r2, C51382Kl r3) {
        this.A01 = adm;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final void BHw() {
        AnonymousClass2EQ r5 = this.A00;
        r5.A00.A00 = true;
        C51432Kq r4 = this.A02.A01;
        C49672Dd r3 = r5.A02;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() == 0) {
            arrayList.add(C51412Ko.A00(r5));
            r4.A00(r3, new C51422Kp(arrayList));
            return;
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}
