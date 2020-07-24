package p000X;

/* renamed from: X.C1F */
public final class C1F extends C0D {
    public final String A00;
    public final String A01;

    public final C0L Brw(String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.A01;
            int length2 = str2.length();
            StringBuilder sb = new StringBuilder(length + length2);
            if (length2 == 0) {
                sb.append(str.substring(1));
            } else {
                sb.append(str2);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.Brw(str);
    }

    public C1F(C0L c0l, C27173Bzl bzl) {
        super(c0l, bzl);
        String name = c0l.A00.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.A01 = "";
            this.A00 = ".";
            return;
        }
        this.A00 = name.substring(0, lastIndexOf + 1);
        this.A01 = name.substring(0, lastIndexOf);
    }
}
