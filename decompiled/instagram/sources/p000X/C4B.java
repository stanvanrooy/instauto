package p000X;

import java.util.List;

/* renamed from: X.C4B */
public final class C4B implements C24967AxA {
    public final /* synthetic */ C24967AxA A00;
    public final /* synthetic */ C48 A01;

    public C4B(C48 c48, C24967AxA axA) {
        this.A01 = c48;
        this.A00 = axA;
    }

    public final void B2m(Throwable th) {
        C24984AxR.A02(th, this.A00);
    }

    public final /* bridge */ /* synthetic */ void BD2(Object obj) {
        this.A01.A00.A02((List) obj);
        C24984AxR.A01(this.A01.A00.A01(C26813Bsy.STORY), this.A00);
    }

    public final void onComplete() {
        C24984AxR.A00(this.A00);
    }
}
