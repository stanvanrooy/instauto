package p000X;

import java.util.List;

/* renamed from: X.COM */
public final class COM extends C17920r1 {
    public final /* synthetic */ COL A00;

    public COM(COL col) {
        this.A00 = col;
    }

    public final void onFail(C43791v5 r7) {
        Throwable th;
        String str;
        int A03 = AnonymousClass0Z0.A03(-698627272);
        super.onFail(r7);
        COL col = this.A00;
        col.A00 = Constants.ONE;
        C27708COc cOc = col.A04;
        if (r7.A02()) {
            th = r7.A01;
        } else {
            th = null;
        }
        COP cop = cOc.A00.A03;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C37141jB A032 = C37591ju.A03(COZ.A01(Constants.A0C), cop.A00);
        if (str != null) {
            A032.A3R = str;
        }
        COP.A00(cop.A01, A032);
        cOc.A00.A02.A0J();
        cOc.A00.A06.setVisibility(8);
        AnonymousClass0Z0.A0A(609954644, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(1266007590);
        super.onStart();
        COL col = this.A00;
        col.A00 = Constants.ZERO;
        col.A04.A00.A06.setVisibility(0);
        AnonymousClass0Z0.A0A(1265028199, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(849943180);
        COV cov = (COV) obj;
        int A032 = AnonymousClass0Z0.A03(-1214414626);
        super.onSuccess(cov);
        COL col = this.A00;
        Integer num = Constants.A0C;
        col.A00 = num;
        col.A02 = cov.Abr();
        col.A01 = cov.AQs();
        C27708COc cOc = col.A04;
        COP cop = cOc.A00.A03;
        COP.A00(cop.A01, C37591ju.A03(COZ.A02(num), cop.A00));
        COD cod = cOc.A00.A02;
        List AOJ = cov.AOJ();
        cod.A00.clear();
        cod.A00.addAll(AOJ);
        cod.A0J();
        cOc.A00.A06.setVisibility(8);
        cOc.A00.A07 = true;
        AnonymousClass0Z0.A0A(-532011748, A032);
        AnonymousClass0Z0.A0A(1613020909, A03);
    }
}
