package p000X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Ny  reason: invalid class name and case insensitive filesystem */
public final class C28941Ny implements C28921Nw {
    public final Map A00 = new HashMap();
    public final int A01;
    public final C28951Nz A02 = new C28951Nz();
    public final AnonymousClass0C1 A03;

    public final void Ads(QuickPromotionSlot quickPromotionSlot, AnonymousClass2O9 r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        if (r1 != false) goto L_0x006a;
     */
    public final void AT9(QuickPromotionSlot quickPromotionSlot, Set set, Map map, C61482ls r19) {
        boolean z;
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        Map map2 = map;
        C40871pO r7 = new C40871pO(this, this.A03, quickPromotionSlot2, map2, set, new C37941kT(), this.A02);
        if (!((Boolean) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.QP_KILL_SWITCH, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r7.BD5();
        }
        C17850qu A002 = C37951kU.A00(this.A01, this.A03, map2, r19, Constants.ONE);
        AnonymousClass0C1 r2 = this.A03;
        C37771kC r1 = (C37771kC) r2.AVA(C37771kC.class, new C37781kD(r2));
        if (r1.A00 != null) {
            int i = (C37791kE.A00(r1.A01).getLong("qp_cooldown_response_expiration_time", 0) > System.currentTimeMillis() ? 1 : (C37791kE.A00(r1.A01).getLong("qp_cooldown_response_expiration_time", 0) == System.currentTimeMillis() ? 0 : -1));
            boolean z2 = false;
            if (i <= 0) {
                z2 = true;
            }
            z = true;
        }
        z = false;
        if (z) {
            A002.A00 = r7;
            C12810hQ.A02(A002);
            return;
        }
        C15890nh r5 = new C15890nh(this.A03);
        Integer num = Constants.A0N;
        r5.A09 = num;
        r5.A0C = "qp/get_cooldowns/";
        r5.A06 = new C22930zG(C37821kH.class, C12890hY.A00);
        r5.A00 = C37951kU.A01;
        r5.A08 = num;
        r5.A0B = "qp_slot_cooldown_v1";
        r5.A0G = true;
        C17850qu A032 = r5.A03();
        A032.A00 = new C472622w(this.A03, A002, r7);
        C12810hQ.A02(A032);
    }

    public final void BgM(QuickPromotionSlot quickPromotionSlot, AnonymousClass1OF r3) {
        this.A00.put(quickPromotionSlot, r3);
    }

    public final void BsF(QuickPromotionSlot quickPromotionSlot) {
        this.A00.remove(quickPromotionSlot);
    }

    public C28941Ny(Context context, AnonymousClass0C1 r5) {
        this.A01 = (int) Math.ceil((double) context.getResources().getDisplayMetrics().density);
        this.A03 = r5;
    }
}
