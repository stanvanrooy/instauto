package p000X;

/* renamed from: X.AK2 */
public final class AK2 extends C17920r1 {
    public final /* synthetic */ AKS A00;
    public final /* synthetic */ AK9 A01;

    public AK2(AK9 ak9, AKS aks) {
        this.A01 = ak9;
        this.A00 = aks;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(2072975677);
        AK9 ak9 = this.A01;
        ak9.A0D(ak9.A08);
        AnonymousClass0Z0.A0A(-843543670, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(295785547);
        int A032 = AnonymousClass0Z0.A03(1729834103);
        AnonymousClass79M r4 = this.A01.A01;
        if (r4 != null) {
            AKS aks = this.A00;
            String AS8 = aks.AS8();
            String id = aks.AZf().getId();
            AnonymousClass0P4 A002 = AnonymousClass79M.A00(r4, Constants.A04);
            A002.A0G("c_pk", AS8);
            A002.A0G("ca_pk", id);
            AnonymousClass0WN.A01(r4.A0N).BcG(A002);
        }
        AnonymousClass0Z0.A0A(-1461546188, A032);
        AnonymousClass0Z0.A0A(-2003609772, A03);
    }
}
