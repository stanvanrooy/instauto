package p000X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.DFS */
public final class DFS implements C29907DFr {
    public final String A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r5.equals("BOOL") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r5.equals("INT") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r5.equals("STRING") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r5.equals("FLOAT") == false) goto L_0x000d;
     */
    public final boolean Aok(DFR dfr) {
        char c;
        boolean z;
        String str = dfr.A00;
        switch (str.hashCode()) {
            case -1838656495:
                c = 3;
                break;
            case 72655:
                c = 0;
                break;
            case 2044650:
                c = 2;
                break;
            case 66988604:
                c = 1;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            z = false;
            if (Double.parseDouble(this.A00) == ((double) dfr.A02())) {
                return true;
            }
            return false;
        } else if (c == 1) {
            z = false;
            try {
                if (Double.parseDouble(this.A00) != dfr.A01()) {
                    return false;
                }
            } catch (NumberFormatException unused) {
                return z;
            }
        } else if (c != 2) {
            if (c != 3) {
                return false;
            }
            return this.A00.equals(dfr.toString().toLowerCase(Locale.US));
        } else if (str.equals("BOOL")) {
            if (Boolean.parseBoolean(this.A00) == dfr.A01) {
                return true;
            }
            return false;
        } else {
            throw new DFW("Invalid value type");
        }
        return true;
    }

    public DFS(String str, List list) {
        if (list == null || list.isEmpty()) {
            this.A00 = str;
            return;
        }
        throw new DFW("Mismatching number of values", str);
    }

    public final String getName() {
        return this.A00;
    }
}
