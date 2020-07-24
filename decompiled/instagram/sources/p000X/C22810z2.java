package p000X;

import java.util.Map;

/* renamed from: X.0z2  reason: invalid class name and case insensitive filesystem */
public final class C22810z2 {
    public final C06590Pq A00;

    public C22810z2(C06590Pq r1) {
        this.A00 = r1;
    }

    public static C06270Ok A00(C131265jN r5) {
        Map map;
        C06270Ok A002 = C06270Ok.A00();
        synchronized (r5) {
            map = r5.A00;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                A002.A09(str, (String) null);
            } else if (value instanceof String) {
                A002.A09(str, (String) value);
            } else if (value instanceof Long) {
                A002.A08(str, (Long) value);
            } else if (value instanceof Integer) {
                A002.A07(str, (Integer) value);
            } else if (value instanceof Double) {
                A002.A00.A03(str, (Double) value);
            } else if (value instanceof Boolean) {
                A002.A05(str, (Boolean) value);
            } else {
                throw new IllegalArgumentException("Unknown value type: " + value.getClass());
            }
        }
        return A002;
    }
}
