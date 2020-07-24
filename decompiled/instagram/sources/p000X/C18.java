package p000X;

/* renamed from: X.C18 */
public final class C18 {
    public static String A00(C0F c0f, String str) {
        Class<Boolean> A0A;
        if (!str.startsWith("is") || ((A0A = c0f.A0A()) != Boolean.class && A0A != Boolean.TYPE)) {
            return null;
        }
        return A02(str.substring(2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r1.startsWith(r0) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 != false) goto L_0x003e;
     */
    public static String A01(C0F c0f, String str) {
        boolean z;
        Package packageR;
        String name;
        String str2;
        Package packageR2;
        if (str.startsWith("get")) {
            if ("getCallbacks".equals(str)) {
                Class A0A = c0f.A0A();
                if (!(A0A == null || !A0A.isArray() || (packageR2 = A0A.getComponentType().getPackage()) == null)) {
                    name = packageR2.getName();
                    if (!name.startsWith("net.sf.cglib")) {
                        str2 = "org.hibernate.repackage.cglib";
                    }
                    z = true;
                }
                z = false;
            } else {
                if ("getMetaClass".equals(str)) {
                    Class A0A2 = c0f.A0A();
                    if (!(A0A2 == null || A0A2.isArray() || (packageR = A0A2.getPackage()) == null)) {
                        name = packageR.getName();
                        str2 = "groovy.lang";
                    }
                    z = false;
                }
                return A02(str.substring(3));
            }
        }
        return null;
    }

    public static String A02(String str) {
        int length = str.length();
        StringBuilder sb = null;
        if (length == 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(charAt);
            if (charAt == lowerCase) {
                break;
            }
            if (sb == null) {
                sb = new StringBuilder(str);
            }
            sb.setCharAt(i, lowerCase);
        }
        if (sb != null) {
            return sb.toString();
        }
        return str;
    }
}
