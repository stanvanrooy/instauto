package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0nj  reason: invalid class name and case insensitive filesystem */
public final class C15910nj {
    public static final Pattern A01 = Pattern.compile("\\{([\\w_\\d]+)\\}");
    public final Map A00 = new C04450Ea();

    public final void A06(String str, String str2) {
        boolean z = false;
        if (str != null) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        if (str2 != null) {
            this.A00.put(str, new C15990nr(str2));
        }
    }

    public final C26141Bv A00() {
        boolean z;
        Iterator it = this.A00.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C16010nt) ((Map.Entry) it.next()).getValue()).isStreaming()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            AnonymousClass29J r3 = new AnonymousClass29J();
            for (Map.Entry entry : this.A00.entrySet()) {
                ((C16010nt) entry.getValue()).A4n((String) entry.getKey(), r3);
            }
            return r3;
        }
        try {
            return new C26131Bu(A04());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String A02(String str) {
        if (this.A00.size() != 0) {
            return AnonymousClass000.A0J(str, "?", A01());
        }
        return str;
    }

    public final String A03(String str, boolean z) {
        Matcher matcher = A01.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            C16010nt r1 = (C16010nt) this.A00.get(group);
            if (r1 == null || !(r1 instanceof C15990nr)) {
                throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("can't find string param %s to format the string", (Object) group));
            }
            matcher.appendReplacement(stringBuffer, ((C15990nr) r1).A00);
            if (z) {
                this.A00.remove(group);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final List A04() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (entry.getValue() instanceof C15990nr) {
                linkedList.add(new C26151Bw((String) entry.getKey(), ((C15990nr) entry.getValue()).A00));
            }
        }
        return linkedList;
    }

    public final void A05(C15910nj r6, Set set) {
        for (Map.Entry entry : r6.A00.entrySet()) {
            if (set == null || set.contains(entry.getKey())) {
                this.A00.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void A07(String str, byte[] bArr) {
        boolean z = false;
        if (str != null) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        this.A00.put(str, new AnonymousClass2ZW(bArr, "application/json"));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(A01());
        for (Map.Entry entry : this.A00.entrySet()) {
            if (((C16010nt) entry.getValue()).isStreaming()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append("FILE");
            }
        }
        return sb.toString();
    }

    public final String A01() {
        return C26161Bx.A00(A04());
    }
}
