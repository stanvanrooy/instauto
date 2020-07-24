package p000X;

/* renamed from: X.C2Y */
public abstract class C2Y extends C2D {
    public String A04(String str) {
        if (!(this instanceof C2E)) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length << 1);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i++;
                }
            }
            return i > 0 ? sb.toString() : str;
        } else if (str == null || str.length() == 0) {
            return str;
        } else {
            char charAt2 = str.charAt(0);
            if (Character.isUpperCase(charAt2)) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.setCharAt(0, Character.toUpperCase(charAt2));
            return sb2.toString();
        }
    }
}
