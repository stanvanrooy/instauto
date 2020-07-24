package p000X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.CVY */
public final class CVY implements C24967AxA {
    public final /* synthetic */ C24967AxA A00;
    public final /* synthetic */ CVX A01;

    public CVY(CVX cvx, C24967AxA axA) {
        this.A01 = cvx;
        this.A00 = axA;
    }

    public final void B2m(Throwable th) {
        C24984AxR.A02(th, this.A00);
    }

    public final /* bridge */ /* synthetic */ void BD2(Object obj) {
        List list = (List) obj;
        this.A01.A00.A00 = Collections.unmodifiableList(list);
        C24984AxR.A01(list, this.A00);
    }

    public final void onComplete() {
        C24984AxR.A00(this.A00);
    }
}
