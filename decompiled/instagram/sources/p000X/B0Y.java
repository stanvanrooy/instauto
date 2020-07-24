package p000X;

import java.util.Collection;

/* renamed from: X.B0Y */
public final class B0Y {
    public static void A00(StringBuilder sb, C25090B0a b0a, Object... objArr) {
        boolean z = true;
        for (Collection collection : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            if (collection instanceof Collection) {
                A00(sb, b0a, collection.toArray());
            } else if (collection instanceof Object[]) {
                A00(sb, b0a, (Object[]) collection);
            } else {
                sb.append(b0a.BYD(collection));
            }
        }
    }

    public static boolean A01(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }
}
