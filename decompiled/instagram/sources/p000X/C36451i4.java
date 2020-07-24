package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1i4  reason: invalid class name and case insensitive filesystem */
public final class C36451i4 {
    public static String A00(String str) {
        int indexOf = str.indexOf(95);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static List A01(AnonymousClass1NJ r4) {
        ArrayList arrayList = new ArrayList();
        if (r4.A1I()) {
            C13300iJ AZf = r4.A0K.AZf();
            if (!AZf.A0r()) {
                arrayList.add(AZf);
            }
        }
        for (instagramComment AZf2 : r4.A3k.A01.A00) {
            C13300iJ AZf3 = AZf2.AZf();
            if (!AZf3.A0r()) {
                arrayList.add(AZf3);
            }
        }
        return arrayList;
    }

    public static List A02(List list, Context context) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass1NJ r0 = (AnonymousClass1NJ) it.next();
                if (r0 != null) {
                    arrayList.add(r0.A0S(context));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0.isEmpty() != false) goto L_0x0018;
     */
    public static boolean A07(AnonymousClass1NJ r4, AnonymousClass0C1 r5, C17070pd r6) {
        boolean z;
        if (r6.equals(C17070pd.PROMOTION_PREVIEW)) {
            return false;
        }
        AnonymousClass1OU A0N = r4.A0N();
        List list = r4.A2Y;
        if (list != null) {
            z = true;
        }
        z = false;
        if (C36461i5.A00(r5).A02(A0N)) {
            if (!z) {
                if (!C26611Ee.A00(r5).A0K(r4)) {
                    return false;
                }
                boolean z2 = false;
                if (C468221a.A00() != Constants.ZERO) {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
                return false;
            }
        } else if (!z || A06(r4, r5)) {
            return false;
        }
        return true;
    }

    public static boolean A03(AnonymousClass1NJ r1, AnonymousClass0C1 r2) {
        Integer num;
        Integer num2;
        if (r1.Aho() && (num = r1.A1J) != null && num.intValue() > 0) {
            C36461i5 A00 = C36461i5.A00(r2);
            AnonymousClass1OU A0N = r1.A0N();
            if (A0N.A02 || !A00.A00) {
                num2 = A0N.A00;
            } else {
                num2 = Constants.A0N;
            }
            if (num2 == Constants.ZERO) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A04(AnonymousClass1NJ r2, AnonymousClass0C1 r3) {
        if (C36461i5.A00(r3).A02(r2.A0N()) && C26611Ee.A00(r3).A0K(r2)) {
            boolean z = false;
            if (C468221a.A00() != Constants.ZERO) {
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r6.A17().isEmpty() != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public static boolean A05(AnonymousClass1NJ r6, AnonymousClass0C1 r7) {
        boolean z;
        if (r6.A09() == 0) {
            return false;
        }
        if (!C36461i5.A00(r7).A02(r6.A0N())) {
            return true;
        }
        boolean A0K = C26611Ee.A00(r7).A0K(r6);
        if (r6.A17() != null) {
            z = true;
        }
        z = false;
        if (r6.Aho()) {
            if (A03(r6, r7) || A08(r6, z, r7)) {
                return true;
            }
            return false;
        } else if ((r6.A17() == null || r6.A17().isEmpty()) && !((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.DAISY_ORGANIC_VIEW_LIKES_KILL_SWITCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            if (!A0K) {
                return false;
            }
            boolean z2 = false;
            if (C468221a.A00() != Constants.ZERO) {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public static boolean A06(AnonymousClass1NJ r2, AnonymousClass0C1 r3) {
        Integer num;
        if (r2.A1W() || AnonymousClass1YR.Clips.equals(r2.A0t) || (num = r2.A1W) == null) {
            return false;
        }
        if (num.intValue() > 0 || r2.A09() > 0) {
            return !C36461i5.A00(r3).A02(r2.A0N());
        }
        return false;
    }

    public static boolean A08(AnonymousClass1NJ r3, boolean z, AnonymousClass0C1 r5) {
        if (C36461i5.A00(r5).A02(r3.A0N()) && C26611Ee.A00(r5).A0K(r3)) {
            switch (C468221a.A00().intValue()) {
                case 1:
                    if (!r3.Aho()) {
                        return !z;
                    }
                    Integer num = r3.A1J;
                    if (num == null || num.intValue() == 0) {
                        return true;
                    }
                    return false;
                case 2:
                case 3:
                    return true;
            }
        }
        return false;
    }

    public static boolean A09(AnonymousClass1NJ r1, boolean z, boolean z2) {
        if (!r1.AiO()) {
            return false;
        }
        if (r1.Aho()) {
            return z2;
        }
        return z;
    }
}
