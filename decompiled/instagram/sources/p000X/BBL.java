package p000X;

import java.util.Iterator;

/* renamed from: X.BBL */
public final class BBL extends C17920r1 {
    public final /* synthetic */ BBJ A00;

    public BBL(BBJ bbj) {
        this.A00 = bbj;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(705585527);
        this.A00.A00.BJ4();
        AnonymousClass0Z0.A0A(276158364, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        int A03 = AnonymousClass0Z0.A03(-1625587701);
        int A032 = AnonymousClass0Z0.A03(1698884351);
        Iterator it = ((BBP) obj).A00.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((BBQ) it.next()).A00) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            this.A00.A00.B29();
        } else {
            this.A00.A00.B7F();
        }
        AnonymousClass0Z0.A0A(-1200037381, A032);
        AnonymousClass0Z0.A0A(-1884791127, A03);
    }
}
