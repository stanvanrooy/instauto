package p000X;

import java.util.Map;

/* renamed from: X.1tS  reason: invalid class name and case insensitive filesystem */
public final class C42911tS {
    public final Map A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Map map = this.A00;
            Map map2 = ((C42911tS) obj).A00;
            return map == map2 || (map != null && map.equals(map2));
        }
    }

    public final int hashCode() {
        Map map = this.A00;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public C42911tS(Map map) {
        this.A00 = map;
    }
}
