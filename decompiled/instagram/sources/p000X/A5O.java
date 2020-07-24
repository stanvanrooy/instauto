package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.A5O */
public final class A5O {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        Class cls = Boolean.TYPE;
        Class<Boolean> cls2 = Boolean.class;
        hashMap.put(cls, cls2);
        hashMap2.put(cls2, cls);
        Class cls3 = Byte.TYPE;
        Class<Byte> cls4 = Byte.class;
        hashMap.put(cls3, cls4);
        hashMap2.put(cls4, cls3);
        Class cls5 = Character.TYPE;
        Class<Character> cls6 = Character.class;
        hashMap.put(cls5, cls6);
        hashMap2.put(cls6, cls5);
        Class cls7 = Double.TYPE;
        Class<Double> cls8 = Double.class;
        hashMap.put(cls7, cls8);
        hashMap2.put(cls8, cls7);
        Class cls9 = Float.TYPE;
        Class<Float> cls10 = Float.class;
        hashMap.put(cls9, cls10);
        hashMap2.put(cls10, cls9);
        Class cls11 = Integer.TYPE;
        Class<Integer> cls12 = Integer.class;
        hashMap.put(cls11, cls12);
        hashMap2.put(cls12, cls11);
        Class cls13 = Long.TYPE;
        Class<Long> cls14 = Long.class;
        hashMap.put(cls13, cls14);
        hashMap2.put(cls14, cls13);
        Class cls15 = Short.TYPE;
        Class<Short> cls16 = Short.class;
        hashMap.put(cls15, cls16);
        hashMap2.put(cls16, cls15);
        Class cls17 = Void.TYPE;
        Class<Void> cls18 = Void.class;
        hashMap.put(cls17, cls18);
        hashMap2.put(cls18, cls17);
        A00 = Collections.unmodifiableMap(hashMap);
        A01 = Collections.unmodifiableMap(hashMap2);
    }
}
