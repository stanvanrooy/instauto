package p000X;

/* renamed from: X.DZZ */
public final class DZZ {
    public static int A00(DZD dzd, String str) {
        C30295DZd dZd;
        C30298DZg dZg;
        String str2;
        if (dzd == null || (dZd = dzd.A04) == null || (dZg = dZd.A00) == null) {
            return 0;
        }
        for (C30296DZe dZe : dZg.A00) {
            C30297DZf dZf = dZe.A00;
            if (dZf != null && (str2 = dZf.A01) != null && str2.equals(str)) {
                return dZf.A00;
            }
        }
        return 0;
    }
}
