package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1kP  reason: invalid class name and case insensitive filesystem */
public final class C37901kP extends C37911kQ {
    public final /* synthetic */ QuickPromotionSlot A00;
    public final /* synthetic */ C61482ls A01;
    public final /* synthetic */ C28911Nv A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Set A05;

    public C37901kP(C28911Nv r1, QuickPromotionSlot quickPromotionSlot, Set set, Map map, Map map2, C61482ls r6) {
        this.A02 = r1;
        this.A00 = quickPromotionSlot;
        this.A05 = set;
        this.A03 = map;
        this.A04 = map2;
        this.A01 = r6;
    }

    public final void A00(C37941kT r4) {
        this.A02.A01.BsF(this.A00);
        C28911Nv r0 = this.A02;
        QuickPromotionSlot quickPromotionSlot = this.A00;
        Map map = this.A03;
        AnonymousClass1OF r1 = (AnonymousClass1OF) r0.A02.get(quickPromotionSlot);
        if (r1 == null) {
            return;
        }
        if (r4 == null || r4.A01.isEmpty()) {
            r1.BD5();
        } else {
            r1.BGY(map, r4);
        }
    }

    public final void B2a() {
        this.A02.A01.BsF(this.A00);
        C28911Nv.A00(this.A02, this.A00, this.A05, this.A03, this.A04, this.A01);
    }
}
