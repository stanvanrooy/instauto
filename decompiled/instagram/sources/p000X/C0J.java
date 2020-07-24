package p000X;

import java.lang.reflect.Member;
import java.util.HashMap;

/* renamed from: X.C0J */
public final class C0J {
    public C27182C0c A00;
    public C0M A01;
    public C0M A02;
    public C0M A03;
    public C0M A04;
    public C0M A05;
    public C0M A06;
    public C0M A07;
    public C0M A08;
    public C27189C0n[] A09;
    public C27189C0n[] A0A = null;
    public final C0K A0B;
    public final boolean A0C;

    public final void A00(C0M c0m) {
        if (!(c0m instanceof C0Y) ? c0m != null : (c0m = (C0Y) c0m) != null) {
            if (this.A0C) {
                C26691Bpp.A07((Member) c0m.A0D());
            }
        }
        this.A02 = c0m;
    }

    public final void A01(C0M c0m, C0M c0m2, String str) {
        if (c0m2 != null && c0m2.getClass() == c0m.getClass()) {
            throw new IllegalArgumentException("Conflicting " + str + " creators: already had " + c0m2 + ", encountered " + c0m);
        } else if (c0m != null && this.A0C) {
            C26691Bpp.A07((Member) c0m.A0D());
        }
    }

    public final void A02(C0M c0m, C27189C0n[] c0nArr) {
        A01(c0m, this.A03, "delegate");
        this.A03 = c0m;
        this.A09 = c0nArr;
    }

    public final void A03(C0M c0m, C27189C0n[] c0nArr) {
        Integer num;
        A01(c0m, this.A07, "property-based");
        this.A07 = c0m;
        int length = c0nArr.length;
        if (length > 1) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                C27189C0n c0n = c0nArr[i];
                String str = c0n.A07;
                if ((str.length() != 0 || c0n.A04() == null) && (num = (Integer) hashMap.put(str, Integer.valueOf(i))) != null) {
                    throw new IllegalArgumentException("Duplicate creator property \"" + str + "\" (index " + num + " vs " + i + ")");
                }
            }
        }
        this.A0A = c0nArr;
    }

    public C0J(C0K c0k, boolean z) {
        this.A0B = c0k;
        this.A0C = z;
    }
}
