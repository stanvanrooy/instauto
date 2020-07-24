package p000X;

/* renamed from: X.Db8 */
public final class Db8 {
    public static DbF parseFromJson(C13080hr r3) {
        DbF dbF = new DbF();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("node".equals(A0i)) {
                dbF.A00 = Db7.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dbF;
    }
}
