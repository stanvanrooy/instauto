package p000X;

import java.util.regex.Pattern;

/* renamed from: X.16e  reason: invalid class name and case insensitive filesystem */
public final class C248316e {
    public static final Pattern A05 = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    public String A00 = null;
    public String A01;
    public Object[] A02;
    public String[] A03 = null;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    public static void A00(StringBuilder sb, String str, String str2) {
        boolean z;
        if (str2 != null) {
            z = false;
        }
        z = true;
        if (!z) {
            sb.append(str);
            sb.append(str2);
        }
    }

    public final C248516g A01() {
        int length;
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        String[] strArr = this.A03;
        if (strArr == null || (length = strArr.length) == 0) {
            sb.append(" * ");
        } else {
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
            sb.append(' ');
        }
        sb.append(" FROM ");
        sb.append(this.A04);
        A00(sb, " WHERE ", this.A01);
        A00(sb, " GROUP BY ", (String) null);
        A00(sb, " HAVING ", (String) null);
        A00(sb, " ORDER BY ", this.A00);
        A00(sb, " LIMIT ", (String) null);
        return new C248416f(sb.toString(), this.A02);
    }

    public C248316e(String str) {
        this.A04 = str;
    }
}
