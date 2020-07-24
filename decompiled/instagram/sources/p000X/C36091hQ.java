package p000X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1hQ  reason: invalid class name and case insensitive filesystem */
public final class C36091hQ {
    public HashSet A00 = new HashSet();
    public HashSet A01 = new HashSet();
    public List A02;
    public List A03 = new ArrayList();
    public List A04 = new ArrayList();
    public List A05 = new ArrayList();
    public List A06 = new ArrayList();
    public boolean A07 = false;
    public final int[] A08 = {-1, -1};

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    public static void A00(C36091hQ r7, AnonymousClass1ZU r8) {
        int i;
        int A002;
        int i2;
        int i3;
        AnonymousClass1ZV r0;
        int A003;
        if (r8.A0p && !r8.A0Q()) {
            AnonymousClass1ZV r5 = r8.A0f;
            AnonymousClass1ZV r1 = r5.A04;
            boolean z = false;
            boolean z2 = false;
            if (r1 != null) {
                z2 = true;
            }
            if (!z2) {
                r1 = r8.A0e.A04;
            }
            if (r1 != null) {
                AnonymousClass1ZU r2 = r1.A07;
                if (!r2.A0q) {
                    A00(r7, r2);
                }
                Integer num = r1.A08;
                if (num == Constants.A0N) {
                    i = r2.A02() + r2.A0X;
                } else if (num == Constants.ONE) {
                    i = r2.A0X;
                }
                if (!z2) {
                    A002 = i - r5.A00();
                } else {
                    A002 = i + r8.A0e.A00() + r8.A02();
                }
                int A022 = A002 - r8.A02();
                r8.A0X = A022;
                i2 = A002 - A022;
                r8.A0U = i2;
                i3 = r8.A0L;
                if (i2 < i3) {
                    r8.A0U = i3;
                }
                r0 = r8.A0Z.A04;
                if (r0 == null) {
                    AnonymousClass1ZU r22 = r0.A07;
                    if (!r22.A0q) {
                        A00(r7, r22);
                    }
                    int i4 = (r22.A0Y + r22.A07) - r8.A07;
                    r8.A0G(i4, r8.A0B + i4);
                    r8.A0q = true;
                    return;
                }
                AnonymousClass1ZV r52 = r8.A0a;
                AnonymousClass1ZV r12 = r52.A04;
                if (r12 != null) {
                    z = true;
                }
                if (!z) {
                    r12 = r8.A0g.A04;
                }
                if (r12 != null) {
                    AnonymousClass1ZU r4 = r12.A07;
                    if (!r4.A0q) {
                        A00(r7, r4);
                    }
                    Integer num2 = r12.A08;
                    if (num2 == Constants.A0Y) {
                        A002 = r4.A0Y + r4.A01();
                    } else if (num2 == Constants.A0C) {
                        A002 = r4.A0Y;
                    }
                }
                if (z) {
                    A003 = A002 - r52.A00();
                } else {
                    A003 = A002 + r8.A0g.A00() + r8.A01();
                }
                r8.A0G(A003 - r8.A01(), A003);
                r8.A0q = true;
                return;
            }
            i = 0;
            if (!z2) {
            }
            int A0222 = A002 - r8.A02();
            r8.A0X = A0222;
            i2 = A002 - A0222;
            r8.A0U = i2;
            i3 = r8.A0L;
            if (i2 < i3) {
            }
            r0 = r8.A0Z.A04;
            if (r0 == null) {
            }
        }
    }

    public static void A01(C36091hQ r5, ArrayList arrayList, AnonymousClass1ZU r7) {
        AnonymousClass1ZU r1;
        if (!r7.A0o) {
            arrayList.add(r7);
            r7.A0o = true;
            if (!r7.A0Q()) {
                if (r7 instanceof C36121hT) {
                    C36121hT r3 = (C36121hT) r7;
                    int i = r3.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        A01(r5, arrayList, r3.A01[i2]);
                    }
                }
                for (AnonymousClass1ZV r0 : r7.A0u) {
                    AnonymousClass1ZV r02 = r0.A04;
                    if (!(r02 == null || (r1 = r02.A07) == r7.A0h)) {
                        A01(r5, arrayList, r1);
                    }
                }
            }
        }
    }

    public C36091hQ(List list) {
        this.A02 = list;
    }

    public C36091hQ(List list, boolean z) {
        this.A02 = list;
        this.A07 = true;
    }
}
