package p000X;

import com.instagram.monetization.repository.MonetizationRepository;
import java.util.ArrayList;

/* renamed from: X.1q6  reason: invalid class name and case insensitive filesystem */
public final class C41311q6 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41311q6(C37531jo r3) {
        super("maybeFetchBrandedContentEligibilityInfo", 388);
        this.A00 = r3;
    }

    public final void A00() {
        AnonymousClass0C1 r3 = this.A00.A07;
        ArrayList arrayList = new ArrayList();
        MonetizationRepository monetizationRepository = new MonetizationRepository(r3);
        arrayList.add("branded_content");
        if (AnonymousClass2EB.A00(r3)) {
            arrayList.add("igtv_revshare");
        }
        C17850qu A02 = AnonymousClass2EC.A02(r3, arrayList);
        A02.A00 = new AnonymousClass2EE(monetizationRepository);
        C12810hQ.A02(A02);
    }
}
