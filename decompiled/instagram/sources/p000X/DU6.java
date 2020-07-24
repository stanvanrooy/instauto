package p000X;

/* renamed from: X.DU6 */
public enum DU6 {
    ;
    
    public static final DU6[] A00 = null;

    public DU5 A03(C30161DTi dTi, Object obj, int i, DU5 du5) {
        return !(this instanceof DU8) ? !(this instanceof DU9) ? !(this instanceof DUA) ? !(this instanceof DUB) ? !(this instanceof DUC) ? !(this instanceof DUG) ? !(this instanceof DUH) ? new DU1(obj, i, du5) : new DUL(obj, i, du5) : new DUJ(obj, i, du5) : new DUK(obj, i, du5) : new C30168DTp(dTi.A06, obj, i, du5) : new DUF(dTi.A06, obj, i, du5) : new DUD(dTi.A06, obj, i, du5) : new DUE(dTi.A06, obj, i, du5);
    }

    /* access modifiers changed from: public */
    static {
        DUI dui;
        DUH duh;
        DUG dug;
        DUC duc;
        DUB dub;
        DUA dua;
        DU9 du9;
        DU8 du8;
        A00 = new DU6[]{dui, duh, dug, duc, dub, dua, du9, du8};
    }

    public static final void A00(DU5 du5, DU5 du52) {
        du52.Bfa(du5.AFI());
        DU5 ASh = du5.ASh();
        ASh.BjC(du52);
        du52.Bji(ASh);
        DU5 AQp = du5.AQp();
        du52.BjC(AQp);
        AQp.Bji(du52);
        DU7 du7 = DU7.A01;
        du5.BjC(du7);
        du5.Bji(du7);
    }

    public static final void A01(DU5 du5, DU5 du52) {
        du52.Bly(du5.Aaq());
        DU5 ASi = du5.ASi();
        ASi.BjD(du52);
        du52.Bjj(ASi);
        DU5 AQq = du5.AQq();
        du52.BjD(AQq);
        AQq.Bjj(du52);
        DU7 du7 = DU7.A01;
        du5.BjD(du7);
        du5.Bjj(du7);
    }

    public DU5 A02(C30161DTi dTi, DU5 du5, DU5 du52) {
        return A03(dTi, du5.getKey(), du5.AMk(), du52);
    }
}
