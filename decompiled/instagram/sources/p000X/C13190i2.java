package p000X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0i2  reason: invalid class name and case insensitive filesystem */
public final class C13190i2 extends LinkedHashMap<String, String> {
    public static final C13190i2 A00 = new C13190i2();

    public final synchronized String A00(String str) {
        String str2;
        str2 = (String) get(str);
        if (str2 == null) {
            str2 = str.intern();
            put(str2, str2);
        }
        return str2;
    }

    public C13190i2() {
        super(100, 0.8f, true);
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }
}
