package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;

/* renamed from: X.1l9  reason: invalid class name and case insensitive filesystem */
public final class C38361l9 extends C38371lA {
    public List A00;
    public List A01;

    public final List A00(QuickPromotionSurface quickPromotionSurface) {
        C38431lG r0;
        C38451lI r02;
        List<C38391lC> list = this.A01;
        List list2 = null;
        if (list != null) {
            for (C38391lC r3 : list) {
                if (quickPromotionSurface.A00 == r3.A01.intValue()) {
                    C38411lE r03 = r3.A00;
                    if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A00) == null || (list2 = r02.A00) == null) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        break;
                    }
                }
            }
        }
        return list2;
    }
}
