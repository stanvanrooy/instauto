package p000X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0jC  reason: invalid class name and case insensitive filesystem */
public final class C13770jC {
    public static final Class A02 = C13770jC.class;
    public C13780jD A00 = new C13780jD();
    public C13790jE A01;

    public final C13870jM A00(String str, String str2) {
        C13860jL r3;
        Map map;
        C13830jI r0;
        C13860jL r02 = (C13860jL) this.A00.A00.get(str);
        if (r02 != null) {
            map = r02.A01;
        } else {
            synchronized (this) {
                r3 = (C13860jL) this.A00.A00.get(str);
                if (r3 == null) {
                    C13790jE r1 = this.A01;
                    synchronized (r1) {
                        r0 = (C13830jI) r1.A00.A00.get(str);
                    }
                    if (r0 == null) {
                        r3 = new C13860jL(str, Collections.EMPTY_MAP);
                    } else {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : r0.A00.entrySet()) {
                            C13850jK r6 = (C13850jK) entry.getValue();
                            if (r6.A00 != null) {
                                Object key = entry.getKey();
                                String str3 = (String) entry.getKey();
                                List list = r6.A01;
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                hashMap.put(key, new C13870jM(str, str3, r6.A00, list));
                            }
                        }
                        r3 = new C13860jL(str, hashMap);
                    }
                    C13780jD r2 = this.A00;
                    if (!r2.A00.containsKey(r3.A00)) {
                        r2.A00.put(r3.A00, r3);
                    }
                }
            }
            map = r3.A01;
        }
        return (C13870jM) map.get(str2);
    }

    public C13770jC(File file, String str) {
        this.A01 = new C13790jE(new File(file, AnonymousClass000.A0E("configuration_", str)));
    }
}
