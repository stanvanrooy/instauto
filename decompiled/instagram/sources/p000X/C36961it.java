package p000X;

import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1it  reason: invalid class name and case insensitive filesystem */
public final class C36961it {
    public static List A00(AnonymousClass1NJ r5) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ProductTag> A11 = r5.A11();
        if (!AnonymousClass0OX.A00(A11)) {
            for (ProductTag productTag : A11) {
                boolean z = true;
                if (productTag.A00 != 1) {
                    z = false;
                }
                if (!z) {
                    arrayList.add(productTag);
                }
            }
        }
        return arrayList;
    }

    public static boolean A01(AnonymousClass1NJ r4) {
        if (r4.A3U) {
            List A18 = r4.A18(C34181eD.PRODUCT);
            if (A18 == null || A18.isEmpty()) {
                return false;
            }
            return true;
        } else if (!r4.A1W()) {
            return !AnonymousClass0OX.A00(A00(r4));
        } else {
            for (int i = 0; i < r4.A07(); i++) {
                AnonymousClass1NJ A0P = r4.A0P(i);
                AnonymousClass0a4.A06(A0P);
                if (A01(A0P)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean A02(AnonymousClass0C1 r1, AnonymousClass1NJ r2) {
        C30161St r22;
        C36331hs A01 = AnonymousClass11C.A00(r1).A01(r2);
        if (A01 != null) {
            r22 = A01.A00;
        } else {
            C30141Sr r0 = r2.A0d;
            if (r0 != null) {
                r22 = r0.A02;
            } else {
                r22 = C30161St.DEFAULT;
            }
        }
        if (C30161St.DEFAULT == r22 || C30161St.PILL == r22) {
            return true;
        }
        return false;
    }

    public static boolean A03(AnonymousClass0C1 r1, AnonymousClass1NJ r2) {
        if (!r2.A0Q(r1).A1f() || !A02(r1, r2)) {
            return false;
        }
        return true;
    }
}
