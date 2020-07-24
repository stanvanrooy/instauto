package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.B34 */
public final class B34<K, V> extends HashMap<K, V> {
    public static Map A00(Object obj, Object obj2) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(obj, obj2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map A01(Object obj, Object obj2, Object obj3, Object obj4) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(obj, obj2);
        hashMap.put(obj3, obj4);
        return Collections.unmodifiableMap(hashMap);
    }

    public B34(Map map) {
        super(map);
    }
}
