package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AVF */
public final class AVF {
    public String A00;
    public final Map A01;

    public AVF(String str, Map map) {
        boolean z;
        this.A00 = str;
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    z = false;
                    if (str2.equalsIgnoreCase("false")) {
                        hashMap.put(entry.getKey(), Boolean.valueOf(z));
                    }
                }
                z = true;
                hashMap.put(entry.getKey(), Boolean.valueOf(z));
            }
        }
        this.A01 = new B34(hashMap);
    }
}
