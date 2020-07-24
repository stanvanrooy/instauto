package p000X;

/* renamed from: X.Db7 */
public final class Db7 {
    public static DbJ parseFromJson(C13080hr r4) {
        DbJ dbJ = new DbJ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("__typename".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("value".equals(A0i)) {
                dbJ.A00 = r4.A0I();
            } else if ("name".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dbJ.A01 = str;
            }
            r4.A0f();
        }
        return dbJ;
    }
}
