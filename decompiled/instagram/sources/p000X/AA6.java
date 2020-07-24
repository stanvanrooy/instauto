package p000X;

/* renamed from: X.AA6 */
public final class AA6 {
    public static void A01(AAL aal, Object obj, A1e a1e) {
        aal.scrollTo(obj, new AAP(Math.round(C230109zF.A00((float) a1e.getDouble(0))), Math.round(C230109zF.A00((float) a1e.getDouble(1))), a1e.getBoolean(2)));
    }

    public static void A00(AAL aal, Object obj, int i, A1e a1e) {
        AnonymousClass0FY.A00(aal);
        AnonymousClass0FY.A00(obj);
        AnonymousClass0FY.A00(a1e);
        if (i == 1) {
            A01(aal, obj, a1e);
        } else if (i == 2) {
            aal.scrollToEnd(obj, new AAW(a1e.getBoolean(0)));
        } else if (i == 3) {
            aal.flashScrollIndicators(obj);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), aal.getClass().getSimpleName()}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r8.equals("flashScrollIndicators") == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r8.equals("scrollTo") == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r8.equals("scrollToEnd") == false) goto L_0x0028;
     */
    public static void A02(AAL aal, Object obj, String str, A1e a1e) {
        char c;
        AnonymousClass0FY.A00(aal);
        AnonymousClass0FY.A00(obj);
        AnonymousClass0FY.A00(a1e);
        int hashCode = str.hashCode();
        if (hashCode == -402165208) {
            c = 0;
        } else if (hashCode == 28425985) {
            c = 2;
        } else if (hashCode == 2055114131) {
            c = 1;
        }
        c = 65535;
        if (c == 0) {
            A01(aal, obj, a1e);
        } else if (c == 1) {
            aal.scrollToEnd(obj, new AAW(a1e.getBoolean(0)));
        } else if (c == 2) {
            aal.flashScrollIndicators(obj);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", new Object[]{str, aal.getClass().getSimpleName()}));
        }
    }
}
