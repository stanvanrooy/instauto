package p000X;

import com.facebook.forker.Process;

/* renamed from: X.BDi */
public final class BDi implements AnonymousClass2HP {
    public final /* synthetic */ AnonymousClass2HP A00;
    public final /* synthetic */ BDj A01;

    public BDi(AnonymousClass2HP r1, BDj bDj) {
        this.A00 = r1;
        this.A01 = bDj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r1.ACq(r5, r8) != r7) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    public final Object ACq(Object obj, C233910f r12) {
        C50762Ht r8;
        int i;
        Object obj2;
        C233910f r4;
        C50762Ht r3;
        Object obj3;
        AnonymousClass2HP r1;
        BDi bDi;
        if (r12 instanceof C50762Ht) {
            r8 = (C50762Ht) r12;
            int i2 = r8.A00;
            if ((i2 & Process.WAIT_RESULT_TIMEOUT) != 0) {
                r8.A00 = i2 - Process.WAIT_RESULT_TIMEOUT;
                Object obj4 = r8.A08;
                AnonymousClass2I1 r7 = AnonymousClass2I1.COROUTINE_SUSPENDED;
                i = r8.A00;
                if (i != 0) {
                    AnonymousClass2I2.A01(obj4);
                    r1 = this.A00;
                    C46381ze r0 = this.A01.A00;
                    r8.A01 = this;
                    r8.A02 = obj;
                    r8.A03 = r8;
                    r8.A04 = obj;
                    r8.A05 = r8;
                    r8.A06 = obj;
                    r8.A07 = r1;
                    r8.A00 = 1;
                    if (r0.Adt(obj, r8) != r7) {
                        bDi = this;
                        obj3 = obj;
                        r3 = r8;
                        r4 = r8;
                        obj2 = obj;
                        r8.A01 = bDi;
                        r8.A02 = obj3;
                        r8.A03 = r3;
                        r8.A04 = obj;
                        r8.A05 = r4;
                        r8.A06 = obj2;
                        r8.A07 = r1;
                        r8.A00 = 2;
                    }
                    return r7;
                } else if (i == 1) {
                    r1 = (AnonymousClass2HP) r8.A07;
                    obj2 = r8.A06;
                    r4 = (C233910f) r8.A05;
                    obj = r8.A04;
                    r3 = (C50762Ht) r8.A03;
                    obj3 = r8.A02;
                    bDi = (BDi) r8.A01;
                    AnonymousClass2I2.A01(obj4);
                    r8.A01 = bDi;
                    r8.A02 = obj3;
                    r8.A03 = r3;
                    r8.A04 = obj;
                    r8.A05 = r4;
                    r8.A06 = obj2;
                    r8.A07 = r1;
                    r8.A00 = 2;
                } else if (i == 2) {
                    AnonymousClass2I2.A01(obj4);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C50622Ha.A00;
            }
        }
        r8 = new C50762Ht(this, r12);
        Object obj42 = r8.A08;
        AnonymousClass2I1 r72 = AnonymousClass2I1.COROUTINE_SUSPENDED;
        i = r8.A00;
        if (i != 0) {
        }
        return C50622Ha.A00;
    }
}
