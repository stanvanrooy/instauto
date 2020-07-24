package p000X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.1iR  reason: invalid class name and case insensitive filesystem */
public class C36681iR {
    public final String A00;

    public static C36681iR A00(char c) {
        return new C36681iR(String.valueOf(c));
    }

    public static C36681iR A01(String str) {
        return new C36681iR(str);
    }

    public C36681iR(String str) {
        AnonymousClass0a4.A06(str);
        this.A00 = str;
    }

    public CharSequence A02(Object obj) {
        AnonymousClass0a4.A06(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final String A03(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            AnonymousClass0a4.A06(sb);
            if (it.hasNext()) {
                sb.append(A02(it.next()));
                while (it.hasNext()) {
                    sb.append(this.A00);
                    sb.append(A02(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
