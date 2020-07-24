package p000X;

/* renamed from: X.0h5  reason: invalid class name and case insensitive filesystem */
public final class C12610h5 {
    public static final C12610h5 A02 = new C12610h5("succeeded", false);
    public final boolean A00;
    public final String A01;

    public static C12610h5 A00(String str) {
        return new C12610h5(str, true);
    }

    public final String toString() {
        return this.A01;
    }

    public C12610h5(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }
}
