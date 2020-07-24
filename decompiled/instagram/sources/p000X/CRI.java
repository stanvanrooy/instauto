package p000X;

/* renamed from: X.CRI */
public final class CRI {
    public static final boolean A00(C27702CNw cNw) {
        String str;
        CS2 cs2;
        CS2 cs22;
        C13150hy.A02(cNw, "$this$isSkuMatch");
        C27781CQz cQz = cNw.A00;
        C13150hy.A01(cQz, "layoutContent");
        C27789CRh cRh = cQz.A02;
        String str2 = null;
        if (cRh == null || (cs22 = cRh.A01) == null) {
            str = null;
        } else {
            str = cs22.A01;
        }
        if (str == null) {
            C27781CQz cQz2 = cNw.A00;
            C13150hy.A01(cQz2, "layoutContent");
            C27788CRg cRg = cQz2.A01;
            if (!(cRg == null || (cs2 = cRg.A01) == null)) {
                str2 = cs2.A01;
            }
            if (str2 != null) {
                return true;
            }
            return false;
        }
        return true;
    }
}
