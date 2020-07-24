package p000X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.C8Q */
public final class C8Q {
    public static final ConcurrentMap A00;

    static {
        C13530ig r1 = new C13530ig();
        r1.A01(8);
        A00 = r1.A00();
    }

    public static C17850qu A00(C8J c8j, String str, AnonymousClass25T r5, C17920r1 r6) {
        AnonymousClass25V A002 = AnonymousClass25V.A00(c8j.A00);
        A002.A03(r5);
        A002.A04(Constants.A0N);
        A002.A05 = str;
        AnonymousClass25W r1 = A002.A00;
        if (r1 != null) {
            r1.A00 = true;
        }
        C17850qu A02 = A002.A02(Constants.ZERO);
        A02.A00 = new C7D(c8j, r6);
        return A02;
    }

    public static boolean A04(C8J c8j) {
        String str = c8j.A04;
        if (!A00.containsKey(str)) {
            return false;
        }
        C8J c8j2 = (C8J) A00.get(str);
        if (c8j2 == null) {
            return true;
        }
        c8j2.A05.addAll(c8j.A05);
        return true;
    }

    public static void A01(C8J c8j) {
        if (!A04(c8j)) {
            C12810hQ.A02(A00(c8j, AGL.A00(c8j.A01).toLowerCase(), new C27317C8m(c8j.A03), new C30194DVg(c8j)));
        }
    }

    public static void A02(C8J c8j) {
        C17850qu A002;
        if (!A04(c8j)) {
            Integer num = c8j.A01;
            if (num == Constants.A0u) {
                A002 = A00(c8j, AGL.A00(num).toLowerCase(), new C27313C8i(c8j.A03), new C30414Dby(c8j));
            } else {
                A002 = A00(c8j, AGL.A00(num).toLowerCase(), new C27315C8k(c8j.A03), new DZ7(c8j));
            }
            C12810hQ.A02(A002);
        }
    }

    public static void A03(C8J c8j) {
        C17850qu A002;
        if (!A04(c8j)) {
            Integer num = Constants.A12;
            Integer num2 = c8j.A01;
            if (num.equals(num2)) {
                A002 = A00(c8j, AGL.A00(num2).toLowerCase(), new C8h(c8j.A03), new C30432DcG(c8j));
            } else {
                A002 = A00(c8j, AGL.A00(num2).toLowerCase(), new C8g(c8j.A03), new C30370Daq(c8j));
            }
            C12810hQ.A02(A002);
        }
    }
}
