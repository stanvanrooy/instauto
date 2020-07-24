package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1kN  reason: invalid class name and case insensitive filesystem */
public final class C37881kN {
    public static final long FALLBACK_COOLDOWN = TimeUnit.MINUTES.toMillis(15);
    public final long A00;
    public final Map A01;
    public final Map A02;

    public static C37881kN A00(C37831kI r11) {
        Map hashMap;
        Long l;
        Map hashMap2;
        Long l2;
        if (r11 == null || (r11.A03 == null && r11.A04 == null)) {
            return new C37881kN();
        }
        try {
            Long valueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(r11.A01.longValue()));
            long j = FALLBACK_COOLDOWN;
            if (valueOf != null) {
                j = valueOf.longValue();
            }
            List<C37851kK> list = r11.A04;
            if (list == null) {
                hashMap = Collections.emptyMap();
            } else {
                hashMap = new HashMap();
                for (C37851kK r4 : list) {
                    QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) QuickPromotionSurface.A02.get(Integer.valueOf(r4.A00.intValue()));
                    if (!(quickPromotionSurface == null || (l = r4.A01) == null)) {
                        hashMap.put(quickPromotionSurface, Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue())));
                    }
                }
            }
            List<C37871kM> list2 = r11.A03;
            if (list2 == null) {
                hashMap2 = Collections.emptyMap();
            } else {
                hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                    hashMap3.put(quickPromotionSlot.name().toLowerCase(Locale.US), quickPromotionSlot);
                }
                for (C37871kM r1 : list2) {
                    QuickPromotionSlot quickPromotionSlot2 = (QuickPromotionSlot) hashMap3.get(r1.A01);
                    if (!(quickPromotionSlot2 == null || (l2 = r1.A00) == null)) {
                        hashMap2.put(quickPromotionSlot2, Long.valueOf(TimeUnit.SECONDS.toMillis(l2.longValue())));
                    }
                }
            }
            return new C37881kN(j, hashMap2, hashMap);
        } catch (Exception e) {
            AnonymousClass0QD.A05("IG-QP", "Failed parsing cooldown rules", e);
            return new C37881kN();
        }
    }

    public C37881kN() {
        this.A00 = FALLBACK_COOLDOWN;
        this.A01 = null;
        this.A02 = null;
    }

    public C37881kN(long j, Map map, Map map2) {
        this.A00 = j;
        this.A01 = map;
        this.A02 = map2;
    }
}
