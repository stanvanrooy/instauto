package p000X;

import java.util.List;

/* renamed from: X.DFU */
public final class DFU implements C29907DFr {
    public final double A00;
    public final double A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r10.equals("ccr") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r10.equals("cor") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r10.equals("ocr") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r10.equals("oor") == false) goto L_0x0012;
     */
    public DFU(String str, String str2, List list) {
        char c;
        this.A03 = str;
        this.A02 = str2;
        switch (str2.hashCode()) {
            case 98322:
                c = 1;
                break;
            case 98694:
                c = 3;
                break;
            case 109854:
                c = 2;
                break;
            case 110226:
                c = 0;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            if (list.size() == 2) {
                this.A00 = Double.parseDouble((String) list.get(0));
                double parseDouble = Double.parseDouble((String) list.get(1));
                this.A01 = parseDouble;
                if (this.A00 >= parseDouble) {
                    throw new DFW("Bad values order", str);
                }
                return;
            }
        } else if (list.size() == 1) {
            try {
                this.A00 = Double.parseDouble((String) list.get(0));
                return;
            } catch (NumberFormatException unused) {
                throw new DFW("Bad number format", str);
            }
        }
        throw new DFW("Mismatching number of values", str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r4 > r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        if (r4 >= r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00af, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        if (r0 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    public final boolean Aok(DFR dfr) {
        char c;
        double A012 = dfr.A01();
        String str = this.A02;
        switch (str.hashCode()) {
            case 3244:
                boolean equals = str.equals("eq");
                c = 6;
                break;
            case 3309:
                boolean equals2 = str.equals("gt");
                c = 8;
                break;
            case 3464:
                boolean equals3 = str.equals("lt");
                c = 4;
                break;
            case 98322:
                boolean equals4 = str.equals("ccr");
                c = 1;
                break;
            case 98694:
                boolean equals5 = str.equals("cor");
                c = 3;
                break;
            case 102680:
                boolean equals6 = str.equals("gte");
                c = 9;
                break;
            case 107485:
                boolean equals7 = str.equals("lte");
                c = 5;
                break;
            case 108954:
                boolean equals8 = str.equals("neq");
                c = 7;
                break;
            case 109854:
                boolean equals9 = str.equals("ocr");
                c = 2;
                break;
            case 110226:
                boolean equals10 = str.equals("oor");
                c = 0;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (A012 <= this.A00) {
                    return false;
                }
                break;
            case 1:
                if (A012 < this.A00) {
                    return false;
                }
                break;
            case 2:
                if (A012 <= this.A00) {
                    return false;
                }
                break;
            case 3:
                if (A012 < this.A00) {
                    return false;
                }
                break;
            case 4:
                double d = this.A00;
                break;
            case 5:
                double d2 = this.A00;
                break;
            case 6:
                if (A012 == this.A00) {
                    return true;
                }
                return false;
            case 7:
                if (A012 != this.A00) {
                    return true;
                }
                return false;
            case 8:
                if (A012 > this.A00) {
                    return true;
                }
                return false;
            case 9:
                if (A012 >= this.A00) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public final String getName() {
        return this.A03;
    }
}
