package p000X;

/* renamed from: X.AMP */
public final class AMP implements ANO {
    public final /* synthetic */ AMO A00;

    public AMP(AMO amo) {
        this.A00 = amo;
    }

    public final /* bridge */ /* synthetic */ void B2t(ANG ang, long j) {
        C72073Dn r0;
        C23441AMo aMo = (C23441AMo) ang;
        C13150hy.A02(aMo, "event");
        C226709pI r1 = aMo.A01.A00.A00;
        if (r1 == null) {
            C13150hy.A03("content");
        }
        Integer num = r1.A02;
        if (num == null) {
            C13150hy.A03("action");
        }
        int i = AnonymousClass486.A00[num.intValue()];
        if (i == 1) {
            C72073Dn r2 = this.A00.A00;
            if (r2 != null) {
                C226709pI r12 = aMo.A01.A00.A00;
                if (r12 == null) {
                    C13150hy.A03("content");
                }
                C219239ci r13 = r12.A01;
                if (r13 == null) {
                    C13150hy.A03("pinnedProduct");
                }
                r2.BG1(r13);
            }
        } else if (i == 2 && (r0 = this.A00.A00) != null) {
            r0.BG5();
        }
    }
}
