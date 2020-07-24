package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1pO  reason: invalid class name and case insensitive filesystem */
public final class C40871pO extends C37931kS {
    public final /* synthetic */ C28941Ny A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public C40871pO(C28941Ny r8, AnonymousClass0C1 r9, QuickPromotionSlot quickPromotionSlot, Map map, Set set, C37941kT r13, C28951Nz r14) {
        super(quickPromotionSlot, map, r3, r14, r9, set);
        this.A00 = r8;
        C37941kT r3 = r13;
    }

    public final AnonymousClass1OF A00() {
        return (AnonymousClass1OF) this.A00.A00.get(this.A01);
    }

    public final void A01(C37941kT r5) {
        AnonymousClass1OF A002 = A00();
        if (A002 != null) {
            if (r5 == null || r5.A01.isEmpty()) {
                A002.BD5();
            } else {
                A002.BGY(this.A04, r5);
            }
            AnonymousClass00B.A01.markerEnd(35061762, this.A01.hashCode(), 2);
            return;
        }
        AnonymousClass00B.A01.markerEnd(35061762, this.A01.hashCode(), 4);
    }
}
