package p000X;

/* renamed from: X.CVJ */
public final class CVJ {
    public final /* synthetic */ CVK A00;

    public CVJ(CVK cvk) {
        this.A00 = cvk;
    }

    public final void A00(CVH cvh) {
        CVK cvk = this.A00;
        if (cvh instanceof CVB) {
            CVB cvb = (CVB) cvh;
            long j = cvb.A00;
            String str = cvb.A01;
            cvk.A06.BoN(j, str);
            cvk.A05.Bgt(cvk.A04, j, str);
        } else if (cvh instanceof CVI) {
            CVI cvi = (CVI) cvh;
            long j2 = cvi.A00;
            String str2 = cvi.A02;
            cvk.A06.BoM(j2, str2, cvi.A03, cvi.A01);
            cvk.A05.Bgt(cvk.A04, j2, str2);
        } else if (cvh instanceof CVG) {
            cvk.A05.A8y();
        } else if (cvh instanceof CWJ) {
            cvk.A05.ADm();
        } else if (cvh instanceof CWI) {
            cvk.A06.remove();
            cvk.A05.BbR(cvk.A04);
        }
    }
}
