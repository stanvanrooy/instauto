package p000X;

/* renamed from: X.BDl */
public final class BDl implements AnonymousClass2HP {
    public final /* synthetic */ C25315BDn A00;
    public final /* synthetic */ AnonymousClass2HP A01;

    public BDl(AnonymousClass2HP r1, C25315BDn bDn) {
        this.A01 = r1;
        this.A00 = bDn;
    }

    public final Object ACq(Object obj, C233910f r8) {
        AnonymousClass2HP r5 = this.A01;
        C25313BDk bDk = this.A00.A00;
        int A002 = ((AnonymousClass10J) obj).A00();
        String valueOf = String.valueOf(A002);
        StringBuilder sb = new StringBuilder();
        int i = bDk.A03;
        sb.append(i);
        sb.append('+');
        String sb2 = sb.toString();
        if (i > 0 && A002 > i) {
            valueOf = sb2;
        }
        Object ACq = r5.ACq(valueOf, r8);
        if (ACq == AnonymousClass2I1.COROUTINE_SUSPENDED) {
            return ACq;
        }
        return C50622Ha.A00;
    }
}
