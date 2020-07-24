package p000X;

import java.util.Map;

/* renamed from: X.0iQ  reason: invalid class name and case insensitive filesystem */
public class C13370iQ {
    public static final Map A02(Map map, AnonymousClass2GT r2) {
        C13150hy.A02(map, "$this$withDefault");
        C13150hy.A02(r2, "defaultValue");
        if (map instanceof AnonymousClass5MP) {
            return A02(((AnonymousClass5MP) map).A00, r2);
        }
        return new AnonymousClass5MP(map, r2);
    }
}
