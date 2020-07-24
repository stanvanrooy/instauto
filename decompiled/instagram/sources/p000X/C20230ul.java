package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.shopping.Product;
import java.util.List;

/* renamed from: X.0ul  reason: invalid class name and case insensitive filesystem */
public final class C20230ul implements C19490tZ {
    public static final C05110Id A02 = new C20240um();
    public final C65882uZ A00;
    public final AnonymousClass0C1 A01;

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A00, (C20210uj) r2);
    }

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r12, C06270Ok r13, C73233Ja r14) {
        C17850qu A03;
        C20210uj r122 = (C20210uj) r12;
        List A06 = r122.A06();
        boolean z = true;
        if (A06.size() != 1) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) A06.get(0);
        if (r122.AM6() != null) {
            String A05 = r122.A05();
            String str = r122.A03;
            AnonymousClass3LQ r0 = r122.A02;
            A03 = C99664Sn.A00(this.A01, (DirectThreadKey) r122.A06().get(0), A05, str, r0.A03, (String) null, r122.AM6(), r0.A02);
        } else {
            AnonymousClass0C1 r1 = this.A01;
            Product product = r122.A01.A00;
            String A052 = r122.A05();
            String str2 = r122.A03;
            AnonymousClass3LQ r02 = r122.A02;
            boolean z2 = r02.A03;
            boolean z3 = r02.A02;
            C15890nh r4 = new C15890nh(r1);
            r4.A09 = Constants.ONE;
            r4.A0C = C99664Sn.A01(C58022fB.SHOPPING_PRODUCT, (MediaType) null, false);
            r4.A06(AnonymousClass3K3.class, false);
            C99664Sn.A02(r4, directThreadKey, A052, str2, z2, (String) null, z3);
            r4.A09("product_id", product.getId());
            r4.A09("merchant_id", product.A02.A02);
            A03 = r4.A03();
        }
        A03.A00 = AnonymousClass4T7.A00(this.A01, r14);
        C12810hQ.A02(A03);
    }

    public C20230ul(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C19290tE.A00(r2);
    }
}
