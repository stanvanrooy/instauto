package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1kU  reason: invalid class name and case insensitive filesystem */
public final class C37951kU {
    public static C37961kV A00;
    public static final long A01 = TimeUnit.DAYS.toMillis(1);
    public static final long A02 = TimeUnit.SECONDS.toMillis(10);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r13.A00.isEmpty() != false) goto L_0x000d;
     */
    public static C17850qu A00(int i, AnonymousClass0C1 r11, Map map, C61482ls r13, Integer num) {
        boolean z;
        Map map2 = map;
        C61482ls r9 = r13;
        if (r13 != null) {
            z = true;
        }
        z = false;
        AnonymousClass0C1 r6 = r11;
        if (!z && ((Boolean) AnonymousClass0L6.A02(r11, AnonymousClass0L7.INSTAGRAM_NS_QP_PREFETCH, "prefetch_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            map2 = new EnumMap(QuickPromotionSurface.class);
            for (QuickPromotionSlot A002 : C37721k7.A00) {
                for (C37731k8 r1 : C37721k7.A00(A002)) {
                    Set set = (Set) map2.get(r1.A00);
                    if (set == null) {
                        set = new HashSet();
                        map2.put(r1.A00, set);
                    }
                    for (Trigger trigger : r1.A01) {
                        if (!trigger.A01) {
                            set.add(trigger);
                        }
                    }
                }
            }
        }
        if (A00 == null) {
            A00 = new C37961kV();
        }
        C15890nh A003 = A00.A00(r6, i, map2, r9, num);
        A003.A06 = new C22930zG(C37971kW.class, C12890hY.A00);
        A003.A0G = true;
        return A003.A03();
    }

    public static C17850qu A01(AnonymousClass0C1 r10, int i, QuickPromotionSlot quickPromotionSlot, Integer num) {
        C37731k8 r1;
        EnumSet<E> noneOf;
        EnumMap enumMap = new EnumMap(QuickPromotionSurface.class);
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            Iterator it = C37721k7.A00(quickPromotionSlot).iterator();
            while (true) {
                if (!it.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = (C37731k8) it.next();
                if (r1.A00 == quickPromotionSurface) {
                    break;
                }
            }
            if (r1 != null) {
                noneOf = r1.A01;
            } else {
                noneOf = EnumSet.noneOf(Trigger.class);
            }
            if (!noneOf.isEmpty()) {
                enumMap.put(quickPromotionSurface, noneOf);
            }
        }
        if (A00 == null) {
            A00 = new C37961kV();
        }
        C15890nh A002 = A00.A00(r10, i, enumMap, (C61482ls) null, num);
        A002.A06 = new C22930zG(C37971kW.class, C12890hY.A00);
        A002.A0G = true;
        return A002.A03();
    }
}
