package p000X;

/* renamed from: X.AAB */
public final class AAB implements AAQ, AAR {
    public static final AAB A00 = new AAB();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r5.equals("rotation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r5.equals("scaleY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r5.equals("scaleX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r5.equals("translationZ") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r5.equals("translationY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r5.equals("translationX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r5.equals("alpha") == false) goto L_0x000d;
     */
    public final C53542Te ATC(Object obj, String str) {
        char c;
        float f;
        AnonymousClass2D8 r4 = (AnonymousClass2D8) obj;
        AAR A0B = r4.A0B();
        switch (str.hashCode()) {
            case -1225497657:
                c = 2;
                break;
            case -1225497656:
                c = 3;
                break;
            case -1225497655:
                c = 4;
                break;
            case -908189618:
                c = 5;
                break;
            case -908189617:
                c = 6;
                break;
            case -40300674:
                c = 1;
                break;
            case 92909918:
                c = 0;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                f = r4.A01.A00;
                break;
            case 1:
                f = r4.A01.A01;
                break;
            case 2:
                f = r4.A01.A04;
                break;
            case 3:
                f = r4.A01.A05;
                break;
            case 4:
                f = r4.A01.A06;
                break;
            case 5:
                f = r4.A01.A02;
                break;
            case 6:
                f = r4.A01.A03;
                break;
            default:
                if (A0B != null) {
                    return A0B.ATC(r4, str);
                }
                return C53602Tl.A00;
        }
        return new AnonymousClass2VI(f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r4.equals("translationY") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r4.equals("translationZ") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r4.equals("scaleX") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r4.equals("scaleY") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r4.equals("rotation") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r4.equals("alpha") == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r4.equals("translationX") == false) goto L_0x0009;
     */
    public final void Bjq(Object obj, String str, C53542Te r5) {
        char c;
        AnonymousClass2D8 r3 = (AnonymousClass2D8) obj;
        switch (str.hashCode()) {
            case -1225497657:
                c = 2;
                break;
            case -1225497656:
                c = 3;
                break;
            case -1225497655:
                c = 4;
                break;
            case -908189618:
                c = 5;
                break;
            case -908189617:
                c = 6;
                break;
            case -40300674:
                c = 1;
                break;
            case 92909918:
                c = 0;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                r3.A01.A00 = ((Number) r5).floatValue();
                return;
            case 1:
                r3.A01.A01 = ((Number) r5).floatValue();
                return;
            case 2:
                r3.A01.A04 = ((Number) r5).floatValue();
                return;
            case 3:
                r3.A01.A05 = ((Number) r5).floatValue();
                return;
            case 4:
                r3.A01.A06 = ((Number) r5).floatValue();
                return;
            case 5:
                r3.A01.A02 = ((Number) r5).floatValue();
                return;
            case 6:
                r3.A01.A03 = ((Number) r5).floatValue();
                return;
            default:
                AAQ A0A = r3.A0A();
                if (A0A != null) {
                    A0A.Bjq(r3, str, r5);
                    return;
                }
                return;
        }
    }

    public final boolean Bnh(Object obj, String str, C53542Te r4) {
        AnonymousClass2D8 r2 = (AnonymousClass2D8) obj;
        AAQ A0A = r2.A0A();
        if (A0A != null) {
            return A0A.Bnh(r2, str, r4);
        }
        return true;
    }
}
