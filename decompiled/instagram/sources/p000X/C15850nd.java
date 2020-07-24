package p000X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0nd  reason: invalid class name and case insensitive filesystem */
public final class C15850nd extends C15870nf {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final Object A05(String str) {
        C136895sj r1 = (C136895sj) this.A01.get(str);
        AnonymousClass0a4.A07(r1, "Could not find flow for the given id.");
        return r1.A02;
    }

    public final String A06(String str) {
        C136895sj r1 = (C136895sj) this.A01.get(str);
        AnonymousClass0a4.A07(r1, "Could not find flow for the given id.");
        C136885si r0 = r1.A01;
        if (r0 != null) {
            return r0.A08;
        }
        throw new IllegalStateException("Step has not been launched.");
    }

    public final Set A07() {
        return this.A01.keySet();
    }

    public final void A08(String str) {
        this.A01.get(str);
        C135335q3 r0 = (C135335q3) this.A00.get(str);
        if (r0 != null) {
            r0.B50();
        }
        this.A01.remove(str);
        this.A00.remove(str);
    }

    public final void A09(String str, C136895sj r6, Object obj, C135335q3 r8) {
        C137015sv r3;
        this.A01.put(str, r6);
        if (r8 != null) {
            this.A00.put(str, r8);
        }
        if (r6.A01 == null) {
            r3 = r6.A00(obj);
        } else {
            r3 = new C137005su(r6);
        }
        if (r3.A02()) {
            Object obj2 = r6.A02;
            C135335q3 r1 = (C135335q3) this.A00.get(str);
            if (r1 != null) {
                r1.B4t(r3.A00(), obj2);
            }
            this.A01.remove(str);
            this.A00.remove(str);
        }
    }

    public final void A0A(String str, Object obj) {
        C136895sj r1 = (C136895sj) this.A01.get(str);
        AnonymousClass0a4.A07(r1, "Could not find flow for the given id.");
        C137015sv A002 = r1.A00(obj);
        if (A002.A02()) {
            C135335q3 r12 = (C135335q3) this.A00.get(str);
            if (r12 != null) {
                r12.B4t(A002.A00(), obj);
            }
            this.A01.remove(str);
            this.A00.remove(str);
        }
    }

    public final boolean A0B(String str) {
        if (this.A01.get(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean A0C(String str, Object obj) {
        C137015sv r0;
        C136885si r3;
        C136895sj r5 = (C136895sj) this.A01.get(str);
        AnonymousClass0a4.A07(r5, "Could not find flow for the given id.");
        C136885si r4 = r5.A01;
        if (r4 == null) {
            r0 = new C136995st(r5);
        } else {
            Object Brg = r4.A05.Brg(r4, obj);
            if (r4.A00.A7g(r4, Brg)) {
                if (r5.A04.isEmpty()) {
                    r3 = null;
                } else {
                    int intValue = ((Integer) r5.A04.pop()).intValue();
                    r5.A00 = intValue;
                    r3 = (C136885si) r5.A03.get(intValue);
                }
                if (r4 != null) {
                    Brg = r4.A03.BCY(r4, Brg, -1);
                    r4.A04 = null;
                }
                r5.A01 = r3;
                if (r3 != null) {
                    r5.A02 = r3.A02.BCY(r3, Brg, -1);
                }
                r0 = new C136915sl(r5, r4, r3);
            } else {
                r0 = new C136985ss(r5);
            }
        }
        if (r0.A01()) {
            C135335q3 r1 = (C135335q3) this.A00.get(str);
            if (r1 != null) {
                r1.B50();
            }
            this.A01.remove(str);
            this.A00.remove(str);
        }
        return r0.A03();
    }

    public final String[] A0D(String str) {
        C136895sj r4 = (C136895sj) this.A01.get(str);
        AnonymousClass0a4.A07(r4, "Could not find flow for the given id.");
        String[] strArr = new String[r4.A04.size()];
        for (int i = 0; i < r4.A04.size(); i++) {
            strArr[i] = ((C136885si) r4.A03.get(((Integer) r4.A04.get(i)).intValue())).A08;
        }
        return strArr;
    }
}
