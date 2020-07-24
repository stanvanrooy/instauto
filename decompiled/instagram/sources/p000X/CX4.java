package p000X;

/* renamed from: X.CX4 */
public final class CX4 {
    public static C27937CWz A00(C27920CWi cWi, String str) {
        if (!(cWi instanceof CYW)) {
            return null;
        }
        CYW cyw = (CYW) cWi;
        if (AnonymousClass0OX.A00(cyw.AFS())) {
            return null;
        }
        CXJ cxj = new CXJ();
        cxj.A05 = cyw.AFS();
        cxj.A01 = ((CYR) cWi).APP();
        cxj.A03 = cWi.getId();
        cxj.A04 = str;
        if (cWi.AZB() == C93.BUTTON) {
            cxj.A02 = cWi.AX8();
        }
        return new C27937CWz(cxj);
    }
}
