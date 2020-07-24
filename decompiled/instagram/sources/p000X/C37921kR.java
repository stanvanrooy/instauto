package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1kR  reason: invalid class name and case insensitive filesystem */
public final class C37921kR extends C37931kS {
    public final /* synthetic */ AnonymousClass1O8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37921kR(AnonymousClass1O8 r8, QuickPromotionSlot quickPromotionSlot, Map map, C37941kT r11, C28951Nz r12, AnonymousClass0C1 r13, Set set) {
        super(quickPromotionSlot, map, r11, r12, r13, set);
        this.A00 = r8;
    }

    public final AnonymousClass1OF A00() {
        return (AnonymousClass1OF) this.A00.A00.get(this.A01);
    }

    public final void A01(C37941kT r5) {
        if (r5 != null) {
            this.A00.A01(this.A04, r5, System.currentTimeMillis());
        }
        AnonymousClass1OF A002 = A00();
        if (A002 == null) {
            return;
        }
        if (r5 == null || r5.A01.isEmpty()) {
            A002.BD5();
        } else {
            A002.BGY(this.A04, r5);
        }
    }
}
