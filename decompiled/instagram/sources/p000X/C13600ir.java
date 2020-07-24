package p000X;

/* renamed from: X.0ir  reason: invalid class name and case insensitive filesystem */
public abstract class C13600ir {
    public abstract int A00(Object obj);

    public abstract boolean A02(Object obj, Object obj2);

    public final boolean A01(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return A02(obj, obj2);
    }
}
