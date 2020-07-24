package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;

/* renamed from: X.0qC  reason: invalid class name and case insensitive filesystem */
public final class C17410qC {
    public final HashMap A00 = new HashMap();

    public static synchronized C17120pi A00(C17410qC r2, String str) {
        C17120pi r0;
        synchronized (r2) {
            r0 = (C17120pi) r2.A00.get(str);
            if (r0 == null) {
                throw new C45391xn(StringFormatUtil.formatStrLocaleSafe("No TypeAdapter registered for type name: %s", (Object) str));
            }
        }
        return r0;
    }

    public final synchronized void A03(String str, C17120pi r4) {
        if (!this.A00.containsKey(str)) {
            this.A00.put(str, r4);
        } else {
            throw new C45391xn(StringFormatUtil.formatStrLocaleSafe("Duplicate type name. %s is already mapped to %s", str, ((C17120pi) this.A00.get(str)).getClass().getName()));
        }
    }

    public synchronized void clearRegistry() {
        this.A00.clear();
    }

    public final C17100pg A01(C13080hr r4) {
        if (r4.A0g() == C13120hv.START_OBJECT) {
            r4.A0p();
            if (r4.A0g() == C13120hv.FIELD_NAME) {
                String A0t = r4.A0t();
                r4.A0p();
                C17100pg r0 = (C17100pg) A00(this, A0t).BWo(r4);
                r4.A0p();
                return r0;
            }
        }
        r4.A0f();
        return null;
    }

    public final void A02(C13460iZ r2, C17100pg r3) {
        r2.A0T();
        String typeName = r3.getTypeName();
        r2.A0d(typeName);
        A00(this, typeName).BfU(r2, r3);
        r2.A0Q();
    }
}
