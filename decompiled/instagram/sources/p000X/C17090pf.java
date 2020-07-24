package p000X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0pf  reason: invalid class name and case insensitive filesystem */
public abstract class C17090pf implements C17100pg {
    public int A00;
    public long A01;
    public AnonymousClass3LQ A02;
    public String A03;
    public String A04;
    public Set A05;

    public abstract String A01();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r4 != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r4 != 3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        if (r4 != 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r4 != 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bd, code lost:
        if (r8.equals("upload_failed_transient") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c6, code lost:
        if (r8.equals("upload_failed_permanent") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cf, code lost:
        if (r8.equals("queued") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d8, code lost:
        if (r8.equals("executing") == false) goto L_0x0020;
     */
    public static void A00(C17090pf r14, String str) {
        char c;
        String str2 = r14.A04;
        if (!str2.equals(str)) {
            char c2 = 65535;
            boolean z = false;
            switch (str2.hashCode()) {
                case -1090974990:
                    c = 1;
                    break;
                case -948696717:
                    c = 0;
                    break;
                case 1501196714:
                    c = 3;
                    break;
                case 1885454214:
                    c = 2;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                int hashCode = str.hashCode();
                if (hashCode != -1090974990) {
                    if (hashCode == 1563991648 && str.equals("uploaded")) {
                        c2 = 1;
                    }
                } else if (str.equals("executing")) {
                    c2 = 0;
                }
            } else if (c != 1) {
                if (c == 2) {
                    int hashCode2 = str.hashCode();
                    if (hashCode2 != -948696717) {
                        if (hashCode2 == 1563991648 && str.equals("uploaded")) {
                            c2 = 1;
                        }
                    } else if (str.equals("queued")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        r14.A00 = 0;
                    }
                } else if (c == 3) {
                    if (str.hashCode() == 1563991648 && str.equals("uploaded")) {
                        c2 = 0;
                    }
                }
                z = true;
            } else {
                switch (str.hashCode()) {
                    case -948696717:
                        if (str.equals("queued")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1501196714:
                        if (str.equals("upload_failed_permanent")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1563991648:
                        if (str.equals("uploaded")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1885454214:
                        if (str.equals("upload_failed_transient")) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    r14.A00++;
                } else if (c2 != 1) {
                    if (c2 != 2) {
                    }
                }
                z = true;
            }
            if (z) {
                r14.A04 = str;
                return;
            }
            throw new IllegalStateException(AnonymousClass000.A0N("Invalid transition from ", str2, " to ", str));
        }
    }

    public final String getTypeName() {
        return A01();
    }

    public C17090pf() {
        this(new AnonymousClass3LQ(false, false, (String) null));
    }

    public C17090pf(AnonymousClass3LQ r3) {
        this.A01 = System.currentTimeMillis();
        this.A05 = new HashSet();
        this.A04 = "queued";
        this.A03 = r3.A00;
        this.A02 = r3;
    }
}
