package p000X;

import java.util.List;
import java.util.Set;

/* renamed from: X.CSZ */
public final class CSZ extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ CSL A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CSZ(CSL csl, boolean z, List list, boolean z2) {
        super(1);
        this.A00 = csl;
        this.A03 = z;
        this.A01 = list;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0D;
        CSY csy = (CSY) obj;
        C13150hy.A02(csy, "$receiver");
        if (this.A03) {
            A0D = AnonymousClass10N.A0A(this.A01);
        } else {
            A0D = AnonymousClass10N.A0D(this.A00.A00.A00.A01, AnonymousClass10N.A0A(this.A01));
        }
        return CSY.A00(csy, (String) null, A0D, (Set) null, false, false, this.A02, 5);
    }
}
