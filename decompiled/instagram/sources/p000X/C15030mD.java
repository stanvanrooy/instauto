package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0mD  reason: invalid class name and case insensitive filesystem */
public final class C15030mD extends C15040mE {
    public int A00 = 0;
    public final C15060mG A01;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final boolean A05;

    public C15030mD(C15060mG r3) {
        this.A01 = r3;
        this.A05 = true;
    }

    private void A00(int i) {
        if (this.A00 != i) {
            this.A04.clear();
            this.A03.clear();
            this.A02.clear();
            this.A00 = i;
        }
    }

    public final String A01(int i, int i2) {
        if (!this.A05) {
            return this.A01.A02(i, i2);
        }
        A00(i2);
        Map map = this.A04;
        Integer valueOf = Integer.valueOf(i);
        String str = (String) map.get(valueOf);
        if (str == null && (str = this.A01.A02(i, i2)) != null) {
            this.A04.put(valueOf, str);
        }
        return str;
    }

    public final String A02(int i, int i2, Integer num) {
        C42911tS A012;
        if (this.A05) {
            A00(i2);
            Map map = this.A03;
            Integer valueOf = Integer.valueOf(i);
            A012 = (C42911tS) map.get(valueOf);
            if (A012 == null && (A012 = this.A01.A01(i, i2)) != null) {
                this.A03.put(valueOf, A012);
            }
        } else {
            A012 = this.A01.A01(i, i2);
        }
        if (A012 == null) {
            return null;
        }
        String str = (String) A012.A00.get(Integer.valueOf(num.intValue()));
        if (str != null) {
            return str;
        }
        return (String) A012.A00.get(Integer.valueOf(Constants.A0j.intValue()));
    }

    public final String[] A03(int i, int i2) {
        if (!this.A05) {
            return this.A01.A03(i, i2);
        }
        A00(i2);
        Map map = this.A02;
        Integer valueOf = Integer.valueOf(i);
        String[] strArr = (String[]) map.get(valueOf);
        if (strArr == null && (strArr = this.A01.A03(i, i2)) != null) {
            this.A02.put(valueOf, strArr);
        }
        return strArr;
    }
}
