package p000X;

/* renamed from: X.20h  reason: invalid class name and case insensitive filesystem */
public final class C466420h extends C27291Hg {
    public final /* synthetic */ Object A00;

    public C466420h(Object obj) {
        this.A00 = obj;
    }

    public final void Azh() {
        C23300zv r2;
        Class<C467420r> cls;
        C11200ea r0;
        Object obj = this.A00;
        if (obj instanceof C465920c) {
            C465920c r3 = (C465920c) obj;
            r2 = r3.A03;
            cls = C467420r.class;
            r0 = r3.A04;
        } else if (obj instanceof C28465ChM) {
            C28465ChM chM = (C28465ChM) obj;
            r2 = chM.A01;
            cls = C467420r.class;
            r0 = chM.A02;
        } else {
            return;
        }
        r2.A03(cls, r0);
    }
}
