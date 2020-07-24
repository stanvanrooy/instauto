package p000X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Map;

/* renamed from: X.C1S */
public final class C1S {
    public final C2k[] A00;

    public C1S(Map map) {
        int size = map.size();
        int i = 8;
        while (i < (size > 64 ? size + (size >> 2) : size + size)) {
            i += i;
        }
        int i2 = i - 1;
        C2k[] c2kArr = new C2k[i];
        for (Map.Entry entry : map.entrySet()) {
            C1J c1j = (C1J) entry.getKey();
            int hashCode = c1j.hashCode() & i2;
            c2kArr[hashCode] = new C2k(c2kArr[hashCode], c1j, (JsonSerializer) entry.getValue());
        }
        this.A00 = c2kArr;
    }

    public final JsonSerializer A00(C1J c1j) {
        int hashCode = c1j.hashCode();
        C2k[] c2kArr = this.A00;
        C2k c2k = c2kArr[hashCode & (c2kArr.length - 1)];
        if (c2k == null) {
            return null;
        }
        while (!c1j.equals(c2k.A01)) {
            c2k = c2k.A02;
            if (c2k == null) {
            }
        }
        return c2k.A00;
        return null;
    }
}
