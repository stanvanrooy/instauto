package p000X;

import com.instagram.model.shopping.ProductSource;
import java.util.List;
import java.util.Set;

/* renamed from: X.CQP */
public final class CQP extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ CQJ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CQP(CQJ cqj, boolean z, List list, boolean z2) {
        super(1);
        this.A00 = cqj;
        this.A03 = z;
        this.A01 = list;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0D;
        CQN cqn = (CQN) obj;
        C13150hy.A02(cqn, "$receiver");
        if (this.A03) {
            A0D = AnonymousClass10N.A0A(this.A01);
        } else {
            A0D = AnonymousClass10N.A0D(this.A00.A00.A00.A02, AnonymousClass10N.A0A(this.A01));
        }
        return CQN.A00(cqn, (String) null, A0D, (ProductSource) null, (Set) null, (Set) null, false, false, this.A02, 29);
    }
}
