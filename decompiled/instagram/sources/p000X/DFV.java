package p000X;

import java.util.List;

/* renamed from: X.DFV */
public final class DFV implements C29907DFr {
    public final String A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r0 == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 == false) goto L_0x0021;
     */
    public final boolean Aok(DFR dfr) {
        char c;
        String str = this.A01;
        int hashCode = str.hashCode();
        if (hashCode == 3392903) {
            boolean equals = str.equals("null");
            c = 1;
        } else if (hashCode == 104980213) {
            boolean equals2 = str.equals("nnull");
            c = 2;
        } else if (hashCode == 1509016093) {
            boolean equals3 = str.equals("catch_all");
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return "NULL".equals(dfr.A00);
        }
        if (c != 2) {
            return false;
        }
        return !"NULL".equals(dfr.A00);
    }

    public DFV(String str, String str2, List list) {
        if (list == null || list.isEmpty()) {
            this.A00 = str;
            this.A01 = str2;
            return;
        }
        throw new DFW("Mismatching number of values", str);
    }

    public final String getName() {
        return this.A00;
    }
}
