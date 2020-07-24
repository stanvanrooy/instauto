package p000X;

import android.view.View;
import java.util.UUID;

/* renamed from: X.CK7 */
public final class CK7 implements View.OnClickListener {
    public final /* synthetic */ CK4 A00;

    public CK7(CK4 ck4) {
        this.A00 = ck4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-888899871);
        CKS cks = this.A00.A09;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        String A04 = ((AnonymousClass0C1) this.A00.A0D.getValue()).A04();
        C13150hy.A01(A04, "userSession.userId");
        C13150hy.A02(A04, "userId");
        C27691Iv r2 = cks.A03;
        C27613CKg cKg = cks.A04;
        C13150hy.A02(A04, "userId");
        C27611CKe cKe = cKg.A00;
        C13150hy.A02(A04, "userId");
        String uuid = UUID.randomUUID().toString();
        C13150hy.A01(uuid, C193418Ps.$const$string(5));
        String A0O = AnonymousClass000.A0O("{\"params\": {\"client_mutation_id\": \"", uuid, "\", \"actor_id\": \"", A04, "\"}}");
        AnonymousClass25V A002 = AnonymousClass25V.A00(cKe.A00);
        A002.A03(new C25088Azm(A0O));
        A002.A04(Constants.ZERO);
        C17850qu A02 = A002.A02(Constants.ONE);
        C13150hy.A01(A02, "GraphQLApi.Builder\n     …pi.IGGraphQLProxy.IG_WWW)");
        C27791Jf A003 = C64482rY.A00(A02);
        C13150hy.A01(A003, "RxRequest.observeRequest…atePaypalURLTask(userId))");
        r2.A02(A003.A0G(C27731Iz.A01), new CKJ(cks));
        AnonymousClass0Z0.A0C(-941906741, A05);
    }
}
