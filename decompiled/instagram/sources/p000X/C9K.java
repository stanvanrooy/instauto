package p000X;

/* renamed from: X.C9K */
public final class C9K {
    public static final boolean A00(Integer num, long j) {
        long j2;
        switch (num.intValue()) {
            case 1:
                j2 = 1538722800;
                break;
            case 2:
                j2 = 1533967200;
                break;
            default:
                j2 = 1509058800;
                break;
        }
        if (j >= j2) {
            return true;
        }
        return false;
    }
}
