package p000X;

/* renamed from: X.CWU */
public final class CWU implements C476824z {
    public final /* synthetic */ CWQ A00;

    public CWU(CWQ cwq) {
        this.A00 = cwq;
    }

    public final void onFinish() {
        CWQ cwq = this.A00;
        switch (cwq.A0C.intValue()) {
            case 1:
                cwq.A0C = Constants.ZERO;
                CWQ.A00(cwq);
                return;
            case 2:
                cwq.A0C = Constants.ZERO;
                CAL cal = cwq.A0O;
                if (cal != null) {
                    cal.A01();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
