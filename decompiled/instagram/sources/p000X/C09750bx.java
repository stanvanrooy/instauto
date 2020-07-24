package p000X;

/* renamed from: X.0bx  reason: invalid class name and case insensitive filesystem */
public final class C09750bx extends C12690hE {
    public final /* synthetic */ AnonymousClass05O A00;
    public final /* synthetic */ C06590Pq A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09750bx(AnonymousClass05O r2, C06590Pq r3) {
        super("initPushRegistrar");
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    public final boolean onQueueIdle() {
        boolean z;
        C06590Pq r1 = this.A01;
        String A05 = C05210Iq.A05(r1);
        if (r1.AgN()) {
            boolean A02 = C14100jl.A02(C05210Iq.A02(r1));
            z = true;
        }
        z = false;
        C41951rF.A00().AdL(A05, z);
        return false;
    }
}
