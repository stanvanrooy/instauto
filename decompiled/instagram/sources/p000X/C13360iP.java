package p000X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.0iP  reason: invalid class name and case insensitive filesystem */
public class C13360iP extends C13370iQ {
    public static final int A00(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A01(C235010q r2) {
        C13150hy.A02(r2, "pair");
        Map singletonMap = Collections.singletonMap(r2.A00, r2.A01);
        C13150hy.A01(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }
}
