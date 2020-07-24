package p000X;

import java.util.HashMap;

/* renamed from: X.1uI  reason: invalid class name and case insensitive filesystem */
public final class C43371uI {
    public HashMap A00 = new HashMap();

    public final synchronized int A00(Integer num) {
        int i;
        Integer num2 = (Integer) this.A00.get(C107414k6.A00(num));
        if (num2 == null) {
            i = 0;
        } else {
            i = num2.intValue();
        }
        return i;
    }

    public final synchronized void A01(Integer num) {
        String A002 = C107414k6.A00(num);
        Integer num2 = (Integer) this.A00.get(A002);
        int i = 1;
        if (num2 != null) {
            i = 1 + num2.intValue();
        }
        this.A00.put(A002, Integer.valueOf(i));
    }
}
