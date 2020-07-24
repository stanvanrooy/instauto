package p000X;

/* renamed from: X.0Pt  reason: invalid class name and case insensitive filesystem */
public enum C06620Pt {
    RELEASE;
    
    public static C06620Pt A00;

    public static C06620Pt A00() {
        if (A00 == null) {
            synchronized (C06620Pt.class) {
                if (A00 == null) {
                    A00 = RELEASE;
                }
            }
        }
        return A00;
    }
}
