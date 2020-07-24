package p000X;

import java.util.Map;

/* renamed from: X.AZM */
public final class AZM {
    public final String A00;
    public final Map A01;
    public final Map A02;

    public final String toString() {
        return C06360Ot.formatString("RtcMediaStream{id=%s,audio=%b,video=%b}", this.A00, Boolean.valueOf(this.A01.containsValue(true)), Boolean.valueOf(this.A02.containsValue(true)));
    }

    public static Map A00(Map map, Map map2) {
        C04450Ea r4 = new C04450Ea();
        for (Map.Entry entry : map.entrySet()) {
            Boolean bool = (Boolean) map2.get(entry.getKey());
            Object key = entry.getKey();
            if (bool == null) {
                bool = (Boolean) entry.getValue();
            }
            r4.put(key, bool);
        }
        return r4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AZM) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AZM(String str, Map map, Map map2) {
        this.A00 = str;
        C04450Ea r0 = new C04450Ea();
        this.A01 = r0;
        r0.putAll(map);
        C04450Ea r02 = new C04450Ea();
        this.A02 = r02;
        r02.putAll(map2);
    }
}
