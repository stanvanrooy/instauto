package p000X;

import java.util.List;

/* renamed from: X.BDq */
public final class BDq implements AnonymousClass2HP {
    public final /* synthetic */ C25317BDr A00;
    public final /* synthetic */ AnonymousClass2HP A01;

    public BDq(AnonymousClass2HP r1, C25317BDr bDr) {
        this.A01 = r1;
        this.A00 = bDr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r1.isEmpty() != false) goto L_0x0021;
     */
    public final Object ACq(Object obj, C233910f r8) {
        boolean z;
        AnonymousClass2HP r5 = this.A01;
        AnonymousClass10J r7 = (AnonymousClass10J) obj;
        C25313BDk bDk = this.A00.A00;
        List A002 = C25313BDk.A00(bDk, r7);
        int i = bDk.A04;
        List A003 = C25313BDk.A00(bDk, r7);
        if (r7.A00() != 0) {
            z = false;
        }
        z = true;
        Object ACq = r5.ACq(new AnonymousClass79W(i, A003, z), r8);
        if (ACq == AnonymousClass2I1.COROUTINE_SUSPENDED) {
            return ACq;
        }
        return C50622Ha.A00;
    }
}
