package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;

/* renamed from: X.1pP  reason: invalid class name and case insensitive filesystem */
public final class C40881pP extends C37911kQ {
    public final /* synthetic */ QuickPromotionSlot A00;
    public final /* synthetic */ C28911Nv A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public C40881pP(C28911Nv r1, QuickPromotionSlot quickPromotionSlot, boolean z, Map map, Map map2) {
        this.A01 = r1;
        this.A00 = quickPromotionSlot;
        this.A04 = z;
        this.A03 = map;
        this.A02 = map2;
    }

    public final void A00(C37941kT r5) {
        this.A01.A03.remove(this.A00);
        this.A01.A00.BsF(this.A00);
        if (!this.A04) {
            this.A01.A01.A01(this.A03, r5, System.currentTimeMillis());
        }
        C28911Nv r3 = this.A01;
        QuickPromotionSlot quickPromotionSlot = this.A00;
        Map map = this.A02;
        if (!this.A04) {
            r5 = r3.A01.A00(map);
        }
        AnonymousClass1OF r1 = (AnonymousClass1OF) r3.A02.get(quickPromotionSlot);
        if (r1 == null) {
            return;
        }
        if (r5 == null || r5.A01.isEmpty()) {
            r1.BD5();
        } else {
            r1.BGY(map, r5);
        }
    }

    public final void B2a() {
        this.A01.A03.remove(this.A00);
        this.A01.A00.BsF(this.A00);
        C28911Nv r0 = this.A01;
        AnonymousClass1OF r02 = (AnonymousClass1OF) r0.A02.get(this.A00);
        if (r02 != null) {
            r02.B2a();
        }
    }
}
