package p000X;

import android.content.pm.ServiceInfo;

/* renamed from: X.BNP */
public final class BNP implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNP(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        ServiceInfo[] serviceInfoArr = bng.A05;
        if (serviceInfoArr == null) {
            return bng.A05(Constants.A0C);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = serviceInfoArr.length;
            if (i >= length) {
                return bng.A06(BQC.A03(sb.toString().getBytes("UTF-8"), Constants.ZERO));
            }
            sb.append(serviceInfoArr[i].name);
            if (i != length - 1) {
                sb.append("\n");
            }
            i++;
        }
    }
}
