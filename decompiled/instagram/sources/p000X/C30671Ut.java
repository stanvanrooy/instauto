package p000X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.1Ut  reason: invalid class name and case insensitive filesystem */
public final class C30671Ut {
    public static AnonymousClass1NJ A00(Object obj) {
        if (obj instanceof AnonymousClass1NJ) {
            return (AnonymousClass1NJ) obj;
        }
        if (obj instanceof C36331hs) {
            return ((C36331hs) obj).APe();
        }
        return null;
    }

    public static String A01(AnonymousClass0C1 r1, C249616t r2) {
        if (r2 instanceof AnonymousClass1NJ) {
            return A0A(r1, (AnonymousClass1NJ) r2);
        }
        if (r2 != null) {
            return r2.AWS(r1);
        }
        return null;
    }

    public static String A02(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A02;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null) {
            return null;
        }
        return r02.A04;
    }

    public static String A03(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A03;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 != null) {
            return r02.A05;
        }
        return null;
    }

    public static String A04(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A04;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 != null) {
            return r02.A06;
        }
        return null;
    }

    public static String A05(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A05;
        }
        DjS A012 = AnonymousClass1NJ.A01(r1);
        if (A012 != null) {
            return A012.A00;
        }
        return null;
    }

    public static String A06(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A06;
        }
        DjS A012 = AnonymousClass1NJ.A01(r1);
        if (A012 != null) {
            return A012.A01;
        }
        return null;
    }

    public static String A07(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A07;
        }
        DjS A012 = AnonymousClass1NJ.A01(r1);
        if (A012 != null) {
            return A012.A02;
        }
        return null;
    }

    public static String A08(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C57262dr r02;
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0B;
        }
        C30141Sr r03 = r1.A0d;
        if (r03 == null || (r02 = r03.A01) == null) {
            return null;
        }
        return r02.A00;
    }

    public static String A09(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A09;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 != null) {
            return r02.A07;
        }
        return null;
    }

    public static String A0A(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0C;
        }
        return r1.A0t();
    }

    public static String A0B(AnonymousClass0C1 r2, AnonymousClass1NJ r3) {
        String str;
        C36331hs A01 = AnonymousClass11C.A00(r2).A01(r3);
        if (A01 != null && !TextUtils.isEmpty(A01.A03)) {
            return A01.A03;
        }
        if (r3.Aho()) {
            C30141Sr r0 = r3.A0d;
            if (r0 != null) {
                str = r0.A05;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C30141Sr r02 = r3.A0d;
                if (r02 != null) {
                    return r02.A05;
                }
                return null;
            }
        }
        return r3.A0c(r2).AMN();
    }

    public static String A0C(AnonymousClass0C1 r1, String str) {
        AnonymousClass1NJ A02 = AnonymousClass1PZ.A00(r1).A02(str);
        if (A02 == null) {
            return null;
        }
        return A0A(r1, A02);
    }

    public static List A0D(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A01;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null) {
            return null;
        }
        return r02.A09;
    }

    public static List A0E(AnonymousClass0C1 r1, AnonymousClass1NJ r2) {
        C36331hs A01 = AnonymousClass11C.A00(r1).A01(r2);
        if (A01 == null) {
            C30141Sr r0 = r2.A0d;
            if (r0 != null) {
                return r0.A0A;
            }
            return null;
        } else if (AnonymousClass0OX.A00(A01.A0E)) {
            return ImmutableList.A01();
        } else {
            return ImmutableList.A09(A01.A0E);
        }
    }

    public static boolean A0F(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0H;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null || !r02.A0D) {
            return false;
        }
        return true;
    }

    public static boolean A0G(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0M;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null || !r02.A0G) {
            return false;
        }
        return true;
    }

    public static boolean A0H(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0J;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null || !r02.A0J) {
            return false;
        }
        return true;
    }

    public static boolean A0I(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0K;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null || !r02.A0E) {
            return false;
        }
        return true;
    }

    public static boolean A0J(AnonymousClass0C1 r0, AnonymousClass1NJ r1) {
        C36331hs A01 = AnonymousClass11C.A00(r0).A01(r1);
        if (A01 != null) {
            return A01.A0L;
        }
        C30141Sr r02 = r1.A0d;
        if (r02 == null || !r02.A0F) {
            return false;
        }
        return true;
    }
}
