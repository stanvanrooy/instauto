package p000X;

/* renamed from: X.DAL */
public final class DAL {
    public final int A00;
    public final DAK A01;
    public final Object A02;
    public final C29798DAi[] A03;

    public final boolean A00(DAL dal, int i) {
        return dal != null && C25948Bd0.A0D(this.A03[i], dal.A03[i]) && C25948Bd0.A0D(this.A01.A02[i], dal.A01.A02[i]);
    }

    public DAL(C29798DAi[] dAiArr, D4t[] d4tArr, Object obj) {
        this.A03 = dAiArr;
        this.A01 = new DAK(d4tArr);
        this.A02 = obj;
        this.A00 = dAiArr.length;
    }
}
