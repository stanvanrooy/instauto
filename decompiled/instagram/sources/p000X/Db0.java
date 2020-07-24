package p000X;

/* renamed from: X.Db0 */
public final class Db0 {
    public static DbG parseFromJson(C13080hr r3) {
        DbG dbG = new DbG();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("organic".equals(A0i)) {
                dbG.A00 = C30380Db1.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dbG;
    }
}
