package p000X;

/* renamed from: X.BD9 */
public final class BD9 {
    public static final Object A00(long j, C233910f r5) {
        if (j <= 0) {
            return C50622Ha.A00;
        }
        C50722Hp r2 = new C50722Hp(AnonymousClass2H2.A00(r5), 1);
        C50722Hp.A03(r2);
        AnonymousClass2GH r1 = r2.AIs().get(AnonymousClass2GN.A00);
        if (!(r1 instanceof BDB)) {
            r1 = null;
        }
        BDB bdb = (BDB) r1;
        if (bdb == null) {
            bdb = BDC.A00;
        }
        bdb.scheduleResumeAfterDelay(j, r2);
        Object A09 = r2.A09();
        if (A09 == AnonymousClass2I1.COROUTINE_SUSPENDED) {
            C25301BCs.A00(r5);
        }
        return A09;
    }
}
