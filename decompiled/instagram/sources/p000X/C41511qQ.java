package p000X;

import com.instagram.model.shopping.Product;
import java.util.List;

/* renamed from: X.1qQ  reason: invalid class name and case insensitive filesystem */
public final class C41511qQ extends AnonymousClass1SZ {
    public Product A00;
    public final C213979Kn A01;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        C213429If r6 = (C213429If) obj;
        List list = null;
        Product product = this.A00;
        if (product != null) {
            C213979Kn r3 = this.A01;
            String str = r6.A02;
            if (r6 instanceof AnonymousClass9KO) {
                list = ((AnonymousClass9KO) r6).A00.ASr().A01();
            } else if (r6 instanceof C214429Mg) {
                list = ((C214429Mg) r6).A02;
            }
            r3.A0D(str, product, list, false);
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        C213429If r6 = (C213429If) obj;
        List list = null;
        Product product = this.A00;
        if (product != null) {
            C213979Kn r3 = this.A01;
            String str = r6.A02;
            if (r6 instanceof AnonymousClass9KO) {
                list = ((AnonymousClass9KO) r6).A00.ASr().A01();
            } else if (r6 instanceof C214429Mg) {
                list = ((C214429Mg) r6).A02;
            }
            r3.A0D(str, product, list, true);
        }
    }

    public C41511qQ(AnonymousClass0C1 r2, C213979Kn r3) {
        super(C28191Kt.A00(r2).A01());
        this.A01 = r3;
    }
}
