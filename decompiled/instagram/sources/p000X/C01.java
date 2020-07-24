package p000X;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* renamed from: X.C01 */
public final class C01 extends C27194C0y implements Comparable {
    public C16 A00;
    public C16 A01;
    public C16 A02;
    public C16 A03;
    public final C27179Bzx A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public static C1l A00(C01 c01, int i, C16... c16Arr) {
        HashMap hashMap;
        HashMap hashMap2;
        C1l c1l = ((C27200C1k) c16Arr[i].A01).A00;
        do {
            i++;
            if (i >= c16Arr.length) {
                return c1l;
            }
        } while (c16Arr[i] == null);
        C1l A002 = A00(c01, i, c16Arr);
        if (c1l == null || (hashMap = c1l.A00) == null || hashMap.isEmpty()) {
            return A002;
        }
        if (A002 == null || (hashMap2 = A002.A00) == null || hashMap2.isEmpty()) {
            return c1l;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation annotation : A002.A00.values()) {
            hashMap3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : c1l.A00.values()) {
            hashMap3.put(annotation2.annotationType(), annotation2);
        }
        return new C1l(hashMap3);
    }

    public static C16 A01(C16 c16) {
        C16 A032;
        if (c16 == null) {
            return c16;
        }
        C16 c162 = c16.A00;
        if (c162 == null) {
            A032 = null;
        } else {
            C16 c163 = c162.A00;
            if (c163 == null) {
                A032 = null;
            } else {
                A032 = c163.A03();
            }
            if (c162.A04) {
                A032 = c162.A04(A032);
            }
        }
        if (c16.A04) {
            return c16.A04(A032);
        }
        return A032;
    }

    public static C16 A02(C16 c16, C16 c162) {
        if (c16 == null) {
            return c162;
        }
        if (c162 == null) {
            return c16;
        }
        C16 c163 = c16.A00;
        if (c163 != null) {
            C16 c164 = c163.A00;
            if (c164 != null) {
                c162 = C16.A00(c164, c162);
            }
            c162 = c163.A04(c162);
        }
        return c16.A04(c162);
    }

    public static C16 A03(C01 c01, C16 c16, C16 c162) {
        while (c16 != null) {
            String str = c16.A02;
            if (str != null && !str.equals(c01.A06)) {
                if (c162 == null) {
                    c162 = c16;
                } else {
                    String str2 = c162.A02;
                    if (!str.equals(str2)) {
                        throw new IllegalStateException("Conflicting property name definitions: '" + str2 + "' (for " + c162.A01 + ") vs '" + c16.A02 + "' (for " + c16.A01 + ")");
                    }
                }
            }
            c16 = c16.A00;
        }
        return c162;
    }

    public static boolean A04(C16 c16) {
        while (c16 != null) {
            String str = c16.A02;
            if (str != null && str.length() > 0) {
                return true;
            }
            c16 = c16.A00;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    public final Object A0M(C3a c3a) {
        C16 c16;
        C16 c162;
        Object obj = null;
        if (this.A04 == null) {
            return null;
        }
        if (this.A07) {
            c16 = this.A02;
        } else {
            C16 c163 = this.A00;
            if (c163 != null) {
                obj = c3a.BuJ((C27200C1k) c163.A01);
            }
            if (obj == null) {
                c16 = this.A03;
            }
            if (obj != null || (c162 = this.A01) == null) {
                return obj;
            }
            return c3a.BuJ((C27200C1k) c162.A01);
        }
        if (c16 != null) {
            obj = c3a.BuJ((C27200C1k) c16.A01);
        }
        if (obj != null || (c162 = this.A01) == null) {
        }
    }

    public final void A0N(C01 c01) {
        this.A01 = A02(this.A01, c01.A01);
        this.A00 = A02(this.A00, c01.A00);
        this.A02 = A02(this.A02, c01.A02);
        this.A03 = A02(this.A03, c01.A03);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C01 c01 = (C01) obj;
        if (this.A00 != null) {
            if (c01.A00 == null) {
                return -1;
            }
        } else if (c01.A00 != null) {
            return 1;
        }
        return A0D().compareTo(c01.A0D());
    }

    public final String toString() {
        return "[Property '" + this.A06 + "'; ctors: " + this.A00 + ", field(s): " + this.A01 + ", getter(s): " + this.A02 + ", setter(s): " + this.A03 + "]";
    }

    public C01(C01 c01, String str) {
        this.A05 = c01.A05;
        this.A06 = str;
        this.A04 = c01.A04;
        this.A01 = c01.A01;
        this.A00 = c01.A00;
        this.A02 = c01.A02;
        this.A03 = c01.A03;
        this.A07 = c01.A07;
    }

    public C01(String str, C27179Bzx bzx, boolean z) {
        this.A05 = str;
        this.A06 = str;
        this.A04 = bzx;
        this.A07 = z;
    }
}
