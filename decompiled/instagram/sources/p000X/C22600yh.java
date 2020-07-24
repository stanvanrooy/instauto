package p000X;

import android.content.Context;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0yh  reason: invalid class name and case insensitive filesystem */
public final class C22600yh implements C22610yi {
    public C22590yg A00;

    public final Map BZ1(Context context) {
        HashMap hashMap = new HashMap();
        InputStream Bqd = this.A00.Bqd(context);
        if (Bqd != null) {
            C13080hr A08 = C12890hY.A00.A08(Bqd);
            A08.A0p();
            while (true) {
                C13120hv A0p = A08.A0p();
                if (A0p == null || A0p == C13120hv.END_ARRAY) {
                    break;
                } else if (A08.A0g() == C13120hv.START_OBJECT) {
                    C22670yo parseFromJson = C22660yn.parseFromJson(A08);
                    AnonymousClass0a4.A06(parseFromJson);
                    C22680yp r2 = parseFromJson.A00;
                    if (r2 != null) {
                        hashMap.put(parseFromJson.A01, r2.A00(parseFromJson.A02));
                    }
                }
            }
        }
        return hashMap;
    }

    public final boolean Buf(Context context, Map map) {
        C22680yp r7;
        C22590yg r0 = this.A00;
        AnonymousClass0a4.A06(r0);
        OutputStream AX2 = r0.AX2(context);
        if (AX2 == null) {
            return false;
        }
        C13460iZ A04 = C12890hY.A00.A04(AX2, Constants.ZERO);
        A04.A0S();
        C22670yo r3 = new C22670yo();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                r7 = (C22680yp) C22680yp.A02.get(value.getClass());
                if (r7 == null) {
                    for (C22680yp r1 : C22680yp.values()) {
                        if (r1.A00.isInstance(value)) {
                            r7 = r1;
                        }
                    }
                }
            } else {
                r7 = null;
            }
            if (r7 != null) {
                AnonymousClass0a4.A06(value);
                r3.A01 = (String) entry.getKey();
                r3.A02 = value.toString();
                r3.A00 = r7;
                A04.A0T();
                String str = r3.A01;
                if (str != null) {
                    A04.A0H("n", str);
                }
                String str2 = r3.A02;
                if (str2 != null) {
                    A04.A0H("v", str2);
                }
                C22680yp r02 = r3.A00;
                if (r02 != null) {
                    A04.A0H("t", r02.A01);
                }
                A04.A0Q();
            }
        }
        A04.A0P();
        A04.flush();
        A04.close();
        return true;
    }

    public C22600yh(C22590yg r1) {
        this.A00 = r1;
    }
}
