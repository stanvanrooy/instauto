package p000X;

/* renamed from: X.AK1 */
public final class AK1 extends C17920r1 {
    public final /* synthetic */ AKS A00;
    public final /* synthetic */ AKS A01;
    public final /* synthetic */ AK9 A02;

    public AK1(AK9 ak9, AKS aks, AKS aks2) {
        this.A02 = ak9;
        this.A00 = aks;
        this.A01 = aks2;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(1753533912);
        this.A02.A0D(this.A00);
        AnonymousClass0Z0.A0A(1772756512, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1626258607);
        int A032 = AnonymousClass0Z0.A03(39913835);
        AnonymousClass79M r4 = this.A02.A01;
        if (r4 != null) {
            AKS aks = this.A01;
            String AS8 = aks.AS8();
            String id = aks.AZf().getId();
            AnonymousClass0P4 A002 = AnonymousClass79M.A00(r4, Constants.A03);
            A002.A0G("c_pk", AS8);
            A002.A0G("ca_pk", id);
            AnonymousClass0WN.A01(r4.A0N).BcG(A002);
        }
        AnonymousClass0Z0.A0A(940864206, A032);
        AnonymousClass0Z0.A0A(-197367389, A03);
    }
}
