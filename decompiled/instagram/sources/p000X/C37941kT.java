package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1kT  reason: invalid class name and case insensitive filesystem */
public final class C37941kT {
    public int A00 = 0;
    public final Map A01 = new EnumMap(QuickPromotionSurface.class);

    public final void A00(AnonymousClass2O9 r4) {
        QuickPromotionSurface AXN = r4.AXN();
        List list = (List) this.A01.get(AXN);
        if (list == null) {
            list = new ArrayList();
            this.A01.put(AXN, list);
        }
        list.add(r4);
        this.A00++;
    }
}
