package p000X;

/* renamed from: X.0xq  reason: invalid class name and case insensitive filesystem */
public abstract class C22100xq {
    public static C22100xq A00;

    public abstract AnonymousClass5W6 A02();

    public static C22100xq A00() {
        C22100xq r0 = A00;
        if (r0 != null) {
            return r0;
        }
        throw new RuntimeException("Error! Trying to access DiscoverPeoplePlugin without an instance!");
    }

    public static boolean A01() {
        if (A00 != null) {
            return true;
        }
        return false;
    }
}
