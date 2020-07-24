package p000X;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.DFQ */
public final class DFQ implements C29907DFr {
    public final String A00;
    public final List A01;
    public final Pattern A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r9.equals("nin") == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r9.equals("in") == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r9.equals("contains") == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r9.equals("regex") == false) goto L_0x002d;
     */
    public DFQ(String str, String str2, List list) {
        char c;
        this.A03 = str;
        this.A00 = str2;
        this.A01 = list;
        int hashCode = str2.hashCode();
        if (hashCode == -567445985) {
            c = 2;
        } else if (hashCode == 3365) {
            c = 0;
        } else if (hashCode == 109075) {
            c = 1;
        } else if (hashCode == 108392519) {
            c = 3;
        }
        c = 65535;
        if (c == 0 || c == 1) {
            if (list != null && !list.isEmpty()) {
                return;
            }
        } else if (c != 2) {
            if (c != 3) {
                throw new DFW("Illegal string strategy", str);
            } else if (list != null && list.size() == 1) {
                try {
                    this.A02 = Pattern.compile((String) list.get(0));
                    return;
                } catch (PatternSyntaxException unused) {
                    throw new DFW("Regex syntax error", str);
                }
            }
        } else if (list != null && list.size() == 1) {
            return;
        }
        throw new DFW("Mismatching number of values", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r7.equals("nin") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r7.equals("in") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r7.equals("contains") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r7.equals("regex") == false) goto L_0x002a;
     */
    public final boolean Aok(DFR dfr) {
        char c;
        String dfr2 = dfr.toString();
        String str = this.A00;
        int hashCode = str.hashCode();
        if (hashCode == -567445985) {
            c = 2;
        } else if (hashCode == 3365) {
            c = 0;
        } else if (hashCode == 109075) {
            c = 1;
        } else if (hashCode == 108392519) {
            c = 3;
        }
        c = 65535;
        if (c == 0) {
            return this.A01.contains(dfr2);
        }
        if (c == 1) {
            return !this.A01.contains(dfr2);
        }
        if (c == 2) {
            return dfr2.contains((CharSequence) this.A01.get(0));
        }
        if (c != 3) {
            return false;
        }
        return this.A02.matcher(dfr2).matches();
    }

    public final String getName() {
        return this.A03;
    }
}
