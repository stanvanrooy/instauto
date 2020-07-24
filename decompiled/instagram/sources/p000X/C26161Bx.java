package p000X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Bx  reason: invalid class name and case insensitive filesystem */
public final class C26161Bx {
    public static String A00(List list) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26151Bw r1 = (C26151Bw) it.next();
            try {
                String encode = URLEncoder.encode(r1.A00, "UTF-8");
                String str2 = r1.A01;
                if (str2 != null) {
                    str = URLEncoder.encode(str2, "UTF-8");
                } else {
                    str = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(encode);
                sb.append("=");
                sb.append(str);
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return sb.toString();
    }
}
