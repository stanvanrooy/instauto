package p000X;

/* renamed from: X.BNU */
public final class BNU implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNU(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        String[] strArr = bng.A06;
        if (strArr == null) {
            return bng.A05(Constants.A0C);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = strArr.length;
            if (i >= length) {
                return bng.A06(BQC.A03(sb.toString().getBytes("UTF-8"), Constants.ZERO));
            }
            sb.append(strArr[i]);
            if (i != length - 1) {
                sb.append("\n");
            }
            i++;
        }
    }
}
